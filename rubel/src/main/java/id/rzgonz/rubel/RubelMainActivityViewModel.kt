package id.rzgonz.rubel

import id.rzgonz.ran.kotlin.IpAddress
import id.rzgonz.ran.kotlin.SchedulerProvider
import io.reactivex.Single

class RubelMainActivityViewModel
    (private val repository: RubelRepository, private val schedulerProvider: SchedulerProvider) {

    fun showDataFromApi(): Single<IpAddress> = repository.getDataFromApi()
        .compose(schedulerProvider.getSchedulersForSingle())
}