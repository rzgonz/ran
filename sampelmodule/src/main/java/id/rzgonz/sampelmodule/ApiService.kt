package id.rzgonz.sampelmodule

import id.rzgonz.ran.kotlin.IpAddress
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET(".")
    fun getJsonResponse(): Single<IpAddress>
}