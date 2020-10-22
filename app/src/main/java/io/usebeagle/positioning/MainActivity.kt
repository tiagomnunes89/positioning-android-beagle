package io.usebeagle.positioning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.utils.newServerDrivenIntent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //To test using the ConstraintLayout, uncomment the setContentView
        //and comment the declarative() method

        //setContentView(R.layout.constraint)
        declarative()
    }

    private fun declarative() {
        startActivity(
            this.newServerDrivenIntent<AppBeagleActivity>(
                PositioningBeagleBuilder.build()
            )
        )
        finish()
    }
}