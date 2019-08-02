package id.rzgonz.rubel
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RubelActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(RubelMainActivityViewModel::class))
    abstract fun bindMainActivity(): RubelMainActivityViewModel

    @ContributesAndroidInjector(modules = arrayOf(RubelMainActivityViewModel::class))
    abstract fun bindMainActivityFragment(): RubelMainActivityFragment
}