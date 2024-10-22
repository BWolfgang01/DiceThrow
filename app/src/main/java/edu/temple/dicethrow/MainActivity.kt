package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), ButtonFragment.ButtonInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newDie100 = DieFragment.newInstance(100)

        if (supportFragmentManager.findFragmentById(R.id.dieContainer) !is DieFragment){
            supportFragmentManager.beginTransaction().add(R.id.dieContainer, newDie100).commit()
        }


    }

    override fun buttonClicked() {
        (supportFragmentManager
            .findFragmentById(R.id.dieContainer)
                as DieFragment).throwDie()
    }

}