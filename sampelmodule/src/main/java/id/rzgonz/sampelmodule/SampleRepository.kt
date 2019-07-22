package id.rzgonz.sampelmodule

import id.rzgonz.ran.kotlin.IpAddress
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleRepository @Inject constructor(private val retrofit: Retrofit) {

    var apiService: ApiService

    init {
      apiService = retrofit.create(ApiService::class.java)

    }

    fun getDataFromApi(): Single<IpAddress> = apiService.getJsonResponse()

}