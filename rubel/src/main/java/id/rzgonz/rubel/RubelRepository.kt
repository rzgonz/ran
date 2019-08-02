package id.rzgonz.rubel

import id.rzgonz.ran.kotlin.IpAddress
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RubelRepository @Inject constructor(private val retrofit: Retrofit) {

    var apiService: RubelService

    init {
      apiService = retrofit.create(RubelService::class.java)

    }

    fun getDataFromApi(): Single<IpAddress> = apiService.getJsonResponse()

}