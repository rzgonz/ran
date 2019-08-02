package id.rzgonz.ran.kotlin

import dagger.Component
import id.rzgonz.ran.ExpensiveObject
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface CoreComponent {

//        @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
////        fun coreComponent(coreComponent: CoreComponent): Builder
//        fun build(): CoreComponent
//    }

    //    fun getprovideSchedulerProvider():SchedulerProvider
//    fun getExpensiveObject(): ExpensiveObject

    fun inject(baseApplication: BaseApplication)
//    fun getprovideSchedulerProvider():SchedulerProvider
//    fun getGson():Gson
//    fun getRetrofit():Retrofit
//    fun getOkHttpClient(): OkHttpClient

}