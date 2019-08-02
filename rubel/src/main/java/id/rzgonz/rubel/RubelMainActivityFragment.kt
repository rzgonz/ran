package id.rzgonz.rubel

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.DaggerFragment
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject
import android.webkit.WebView
import android.webkit.WebViewClient


/**
 * A placeholder fragment containing a simple view.
 */
class RubelMainActivityFragment : DaggerFragment() {

    private val compositeDisposable by lazy { CompositeDisposable() }

    @Inject
    lateinit var rubelMainActivityViewModel: RubelMainActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        compositeDisposable.add(rubelMainActivityViewModel.showDataFromApi()
            .subscribeBy(onSuccess = {
                Log.d("SampleMainActivity", it.ip)
            }, onError = {
                Log.d("SampleMainActivity", it.message)
            }))

        web.loadUrl("https://www.detik.com/")
        web.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
        compositeDisposable.dispose()
    }
}
