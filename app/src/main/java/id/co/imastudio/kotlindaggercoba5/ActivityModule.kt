package id.co.imastudio.kotlindaggercoba5

import android.app.ProgressDialog
import dagger.Component
import dagger.Module
import dagger.Provides

/**
 * Created by nandoseptianhusni on 2/8/18.
 */
@Module
class ActivityModule(val activity : DaggerActivity) {


    @Provides
    fun activity() : DaggerActivity{
        return activity
    }

    fun progressDialog() : ProgressDialog{
        val progress = ProgressDialog(activity)
        progress.setMessage("loading")
        return progress
    }

    @ForActivity

    @Component(
            modules = arrayOf(ActivityModule::class),
            dependencies = arrayOf(AppComponent::class))


interface ActivityComponent{

        fun inject(activity : MainActivity)
    }




}