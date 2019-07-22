package id.rzgonz.ranvm

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import id.rzgonz.ran.kotlin.AppScope
import id.rzgonz.ran.kotlin.CoreComponent
import javax.inject.Singleton

//@Component(
//    modules = arrayOf(AndroidSupportInjectionModule::class, ActivityBuilder::class),
//    dependencies = arrayOf(CoreComponent::class)
//)
//@AppScope
//interface AppComponent{
//
//    fun inject(app: AndroidApp)
//    fun inject(app: MainActivity)
//
//}