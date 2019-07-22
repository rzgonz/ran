package id.rzgonz.ranvm

import id.rzgonz.ran.kotlin.IpAddress
import id.rzgonz.ran.kotlin.SchedulerProvider
import io.reactivex.Single

class MainActivityViewModel(private val repository: Repository, private val schedulerProvider: SchedulerProvider) {

    fun showDataFromApi(): Single<IpAddress> = repository.getDataFromApi()
        .compose(schedulerProvider.getSchedulersForSingle())
}