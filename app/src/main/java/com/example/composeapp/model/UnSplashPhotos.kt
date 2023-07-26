package com.example.composeapp.model

data class UnSplashPhoto(
    val id: String,
    val urls: UnSplashUrl,
    val exif: ExifData,
)

data class UnSplashUrl(
    val regular: String
)

data class ExifData(
    val make: String,
    val model: String,
    val name: String,
    val exposure_time: String,
    val aperture: String,
    val focal_length: String,
    val iso: Int
)