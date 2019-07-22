package id.rzgonz.ran.kotlin

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.lifecycle.ViewModel
import dagger.android.support.DaggerAppCompatActivity


abstract class BaseActivity <T :ViewModel>:DaggerAppCompatActivity(){
    private var viewModel: T? = null

    /**
     *
     * @return view model instance
     */
    abstract fun getViewModel(): T

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.viewModel = if (viewModel == null) getViewModel() else viewModel
    }

}