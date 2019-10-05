package evan.chen.tutorial.koinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    //這裡不需要再注入Repository了
    private val presenter: Presenter = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val string = presenter.getString()
        println("log:$string")
    }
}
