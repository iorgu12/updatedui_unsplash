package com.example.composeapp.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.composeapp.model.UnSplashPhoto

//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun HorizontalCrousal() {
//    val page = 1
//    val perPage = 30
//    var images by remember {
//        mutableStateOf(emptyList<UnSplashPhoto>())
//    }
//    val coroutineScope = rememberCoroutineScope()
//    val pagerState = rememberPagerState(initialPage = images.size)
//
//    LaunchedEffect(Unit) {
//        val photos  = withContext(Dispatchers.IO) {
//            RetrofitService.unsplashApiService.getPhoto()
//        }
//        images = photos
//    }
//    if (images.isNotEmpty()) {
//        LaunchedEffect(pagerState.currentPage) {
//            while (true) {
//                delay(4000) // Change image every 4 second
//                coroutineScope.launch {
//                    pagerState.animateScrollToPage((pagerState.currentPage + 1) % images.size)
//                }
//            }
//        }
//    }
//    HorizontalPager(
//        count = images.size,
//        state = pagerState
//    ) { pages ->
//        val imageUrl = images.getOrNull(pages)?.urls?.regular
//        if(imageUrl!!.isNotEmpty()) {
//            Image(
//                painter = rememberAsyncImagePainter(model = imageUrl),
//                contentDescription = "header image",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp)
//                    .carouselTransition(pages, pagerState)
//            )
//        } else {
//
//        }
//    }
//}
//
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun Modifier.carouselTransition(page: Int, pagerState: PagerState) =
//    graphicsLayer {
//        val pageOffset =
//            ((pagerState.currentPage - page) + pagerState.currentPageOffset).absoluteValue
//
//        val transformation =
//            lerp(
//                start = 0.7.dp,
//                stop = 1.dp,
//                fraction = 1f - pageOffset.coerceIn(0f, 1f)
//            )
//        alpha = transformation.toPx()
//        scaleY = transformation.toPx()
//    }
//
