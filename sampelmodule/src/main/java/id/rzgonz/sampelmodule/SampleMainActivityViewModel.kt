package id.rzgonz.sampelmodule

import id.rzgonz.ran.kotlin.IpAddress
import id.rzgonz.ran.kotlin.SchedulerProvider
import io.reactivex.Single

class SampleMainActivityViewModel
    (private val repository: SampleRepository, private val schedulerProvider: SchedulerProvider) {

    fun showDataFromApi(): Single<IpAddress> = repository.getDataFromApi()
        .compose(schedulerProvider.getSchedulersForSingle())
}