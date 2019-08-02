package id.rzgonz.ranvm
import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.rzgonz.sampelmodule.SampleMainActivityModule

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class,SampleMainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector()
    abstract fun bindMainActivityFragment(): MainActivityFragment
}