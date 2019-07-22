package id.rzgonz.ranvm

import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import id.rzgonz.ran.kotlin.AppConfig
import id.rzgonz.ran.kotlin.BaseApplication
import javax.inject.Inject

class AndroidApp : BaseApplication() {
    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    init {
        AppConfig.BASE_URL = "http://ip.jsontest.com/"
    }

    override fun onCreate() {
        super.onCreate()
        DaggerFeature1Component.builder().application(this).build().inject(this)
    }

//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return null
//    }

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector
}