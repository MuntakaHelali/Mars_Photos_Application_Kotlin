MarsPhotos - Solution Code
==================================

The MarsPhotos is a demo app that shows actual images of Mar's surface. These images are
real-life photos from Mars captured by NASA's Mars rovers. The data is stored on a Web server
as a REST web service.  The application demonstrate the use of [Retrofit](https://square.github.io/retrofit/) to make REST requests to the web service, [Moshi](https://github.com/square/moshi) to handle the deserialization of the returned JSON to Kotlin data objects, and [Coil](https://coil-kt.github.io/coil/) to load images by URL. The app also leverages [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata), and
[Data Binding](https://developer.android.com/topic/libraries/data-binding/) with binding 
adapters.
<br>
<br>
When the user starts the application for the first time, they will be displayed a bunch of photos of Mars. This is assuming the user has a stable internet connection so that the images can be retrieved from the web server. 
<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/57158277/169897727-f359fd94-bb60-41b2-a5b7-e8a9988ab8d2.png" width="250">
</p>
<br>
<br>
If the user does not have a stable connection when the application launches, they will be presented with a screen indicating that. 
<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/57158277/169898460-2fb003b8-57ac-47f4-b5c0-9c1a92a34445.png" width="250">
</p>
<br>
<br>
