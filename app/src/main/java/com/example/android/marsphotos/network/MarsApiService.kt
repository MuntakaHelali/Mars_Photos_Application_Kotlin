package com.example.android.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()


interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): String
}

//object declaration of singleton, ensuring that one, and only one, instance of the object is created, has on global point of access
object MarsApi {
    // lazy instantiation is when object creation is purposely delayed until you actually need that object to avoid unnecessary computation or resources
    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
