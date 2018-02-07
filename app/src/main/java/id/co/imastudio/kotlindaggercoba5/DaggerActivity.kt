package id.co.imastudio.kotlindaggercoba5

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by nandoseptianhusni on 2/8/18.
 */
abstract class DaggerActivity : AppCompatActivity(){
    var component : ActivityModule.ActivityComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val app = application as App
        component = DaggerActivityModule_ActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .appComponent(app.component)
                .build()

        onInject()


    }

    abstract fun onInject()

    override fun onDestroy() {
        super.onDestroy()
    }
}