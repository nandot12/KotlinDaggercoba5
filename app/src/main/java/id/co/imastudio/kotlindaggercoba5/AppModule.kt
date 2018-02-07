package id.co.imastudio.kotlindaggercoba5

import android.content.Context
import android.net.ConnectivityManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by nandoseptianhusni on 2/8/18.
 */
@Module
class AppModule(val app :App) {

    @Provides
    @Singleton
    fun app() : App{
        return app
    }

    @Provides
    @Singleton
    fun context() : Context{
        return app
    }

    @Provides
    @Singleton
    fun connectivity() : ConnectivityManager{
        val service = app.getSystemService(Context.CONNECTIVITY_SERVICE)
        as ConnectivityManager
        return service
    }


}