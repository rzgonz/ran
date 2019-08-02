package id.rzgonz.rubel
import dagger.Module
import dagger.Provides
import id.rzgonz.ran.kotlin.SchedulerProvider

@Module
class RubelMainActivityModule {

    @Provides
    fun provideViewModel(repository: RubelRepository, schedulerProvider: SchedulerProvider) =
        RubelMainActivityViewModel(repository, schedulerProvider)
}