package id.rzgonz.ranvm

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import id.rzgonz.ran.kotlin.AppModule
import id.rzgonz.sampelmodule.SampleActivityBuilder
import javax.inject.Singleton

@Singleton
@Component(
    modules = arrayOf(AndroidSupportInjectionModule::class,AppModule::class,ActivityBuilder::class,SampleActivityBuilder::class))
interface Feature1Component{

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): Feature1Component
    }
    fun inject(app: AndroidApp)

}