package id.co.imastudio.kotlindaggercoba5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : DaggerActivity() {
    override fun onInject() {
        component?.inject(this)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }



}
