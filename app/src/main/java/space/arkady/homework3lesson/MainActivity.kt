package space.arkady.homework3lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import space.arkady.homework3lesson.fragmentFolder.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    override fun onStart() {
        super.onStart()
        initViews()
    }

    private fun initViews() {
        openFragment(LoginFragment.newInit(), LoginFragment.TAG, R.id.container)
    }
    }
