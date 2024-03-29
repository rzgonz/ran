package id.rzgonz.ranvm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import id.rzgonz.sampelmodule.SampleMainActivity
import id.rzgonz.sampelmodule.SampleMainActivityViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private val compositeDisposable by lazy { CompositeDisposable() }

//
    @Inject
    lateinit var mainActivityViewModel: MainActivityViewModel

    @Inject
    lateinit var sampleMainActivityViewModel: SampleMainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            startActivity(Intent(this.applicationContext, SampleMainActivity::class.java))
         //   SampleModule(AndroidApp()).startHome()
        }
       // DaggerAppComponent.builder().coreComponent(provideCoreComponent()).build().inject(this)


//        AndroidApp().activityDispatchingAndroidInjector.inject(this)

        compositeDisposable.add(mainActivityViewModel.showDataFromApi()
            .subscribeBy(onSuccess = {
                Log.d("MainActivity", it.ip)
            }, onError = {
                Log.d("MainActivity", it.message)
            }))

        sampleMainActivityViewModel.showDataFromApi()
            .subscribeBy(onSuccess = {
                Log.d("sub", it.ip)
            }, onError = {
                Log.d("sub", it.message)
            })
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
        compositeDisposable.dispose()
    }

}
