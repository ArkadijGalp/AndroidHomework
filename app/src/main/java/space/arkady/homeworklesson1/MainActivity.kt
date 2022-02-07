package space.arkady.homeworklesson1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onStart() {
        super.onStart()
        initView()
    }

    private fun initView() {
        btnShow.setOnClickListener {
            val name = inputFirstName.text.toString()
            val secondName = inputSecondName.text.toString()

            val age: Int = inputAge.text.toString().toInt()
            if (name.isEmpty() || secondName.isEmpty()) showToast() else newUser(name, secondName, age)
        }
    }

    private fun showToast() {
        Toast.makeText(this, R.string.press_the_button, Toast.LENGTH_LONG).show()
    }

    private fun newUser(name: String, secondName: String, age: Int) {
        val user = User(name, secondName, age)
        val resultText = "${user.name}, ${user.secondName}, ${user.age}"
        UserView.text = resultText


    }
}




