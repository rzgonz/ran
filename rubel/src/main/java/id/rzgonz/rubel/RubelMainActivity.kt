package id.rzgonz.rubel

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class RubelMainActivity : DaggerAppCompatActivity() {

    private val compositeDisposable by lazy { CompositeDisposable() }

    @Inject
    lateinit var rubelMainActivityViewModel: RubelMainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }

        compositeDisposable.add(rubelMainActivityViewModel.showDataFromApi()
            .subscribeBy(onSuccess = {
                Log.d("MainActivity", it.ip)
            }, onError = {
                Log.d("MainActivity", it.message)
            }))
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
        compositeDisposable.dispose()
    }

}
