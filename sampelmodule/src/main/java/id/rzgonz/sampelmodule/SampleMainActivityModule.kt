package id.rzgonz.sampelmodule
import dagger.Module
import dagger.Provides
import id.rzgonz.ran.kotlin.SchedulerProvider

@Module
class SampleMainActivityModule {

    @Provides
    fun provideViewModel(repository: SampleRepository, schedulerProvider: SchedulerProvider) =
        SampleMainActivityViewModel(repository, schedulerProvider)
}