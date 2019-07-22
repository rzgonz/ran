package id.rzgonz.ranvm

import android.util.Log
import id.rzgonz.ran.kotlin.IpAddress
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(retrofit: Retrofit) {

    var apiService: ApiService

    init {
        Log.d("Repository","Repository")
      apiService = retrofit.create(ApiService::class.java)
    }

    fun getDataFromApi(): Single<IpAddress> = apiService.getJsonResponse()

}