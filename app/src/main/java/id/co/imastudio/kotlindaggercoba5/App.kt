package id.co.imastudio.kotlindaggercoba5

import android.app.Application
import android.net.ConnectivityManager
import javax.inject.Inject

/**
 * Created by nandoseptianhusni on 2/8/18.
 */
class App : Application() {

    lateinit @Inject var cm : ConnectivityManager
    lateinit var component : AppComponent

    override fun onCreate() {
        super.onCreate()


        component = DaggerAppComponent.builder().appModule(AppModule(this))
                .build()

        component.inject(this)





    }
}