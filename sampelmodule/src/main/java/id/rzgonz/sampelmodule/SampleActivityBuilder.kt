package id.rzgonz.sampelmodule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SampleActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(SampleMainActivityModule::class))
    abstract fun bindMainActivity(): SampleMainActivity

    @ContributesAndroidInjector(modules = arrayOf(SampleMainActivityModule::class))
    abstract fun bindMainActivityFragment(): SampleMainActivityFragment
}