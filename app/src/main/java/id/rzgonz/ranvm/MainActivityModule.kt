package id.rzgonz.ranvm
import dagger.Module
import dagger.Provides
import id.rzgonz.ran.kotlin.SchedulerProvider

@Module
class MainActivityModule {

    @Provides
    fun provideViewModel(repository: Repository, schedulerProvider: SchedulerProvider) =
        MainActivityViewModel(repository, schedulerProvider)
}