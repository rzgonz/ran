package id.rzgonz.sampelmodule

import android.app.Application
import android.content.Intent
import id.rzgonz.ran.kotlin.BaseApplication

class SampleModule constructor(private val application: BaseApplication):Application(){

    fun startHome(){
        application.baseContext.apply {
            startActivity(Intent(this@SampleModule,id.rzgonz.sampelmodule.SampleMainActivity::class.java))
        }
    }

}