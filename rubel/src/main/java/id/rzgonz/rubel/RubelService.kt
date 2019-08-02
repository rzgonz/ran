package id.rzgonz.rubel

import id.rzgonz.ran.kotlin.IpAddress
import io.reactivex.Single
import retrofit2.http.GET

interface RubelService {

    @GET(".")
    fun getJsonResponse(): Single<IpAddress>
}