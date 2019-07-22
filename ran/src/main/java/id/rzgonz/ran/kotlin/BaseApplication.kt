package id.rzgonz.ran.kotlin

import android.app.Application
import dagger.android.HasActivityInjector

//abstract class BaseApplication : DaggerApplication(),CoreComponentProvider
abstract class BaseApplication : Application(), HasActivityInjector


