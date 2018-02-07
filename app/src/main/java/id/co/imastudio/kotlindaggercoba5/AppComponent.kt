package id.co.imastudio.kotlindaggercoba5

import android.net.ConnectivityManager
import dagger.Component
import javax.inject.Singleton

/**
 * Created by nandoseptianhusni on 2/8/18.
 */



@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app : App)

    fun connectivity(): ConnectivityManager


}