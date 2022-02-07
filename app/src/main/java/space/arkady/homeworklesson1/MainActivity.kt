package space.arkady.homeworklesson1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val buttonSub by lazy { findViewById<Button>(R.id.btnShow) }
    private val firstName by lazy { findViewById<EditText>(R.id.inputFirstName) }
    private val secondName by lazy { findViewById<EditText>(R.id.inputSecondName) }
    private val setAge by lazy { findViewById<EditText>(R.id.inputAge) }
    private val setuserStat by lazy { findViewById<TextView>(R.id.UserView) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onStart() {
        super.onStart()
        initView()
    }

    private fun initView() {
        buttonSub.setOnClickListener {
            val name = firstName.text.toString()
            val secondName = secondName.text.toString()

            val age: Int = setAge.text.toString().toInt()
            if (name.isEmpty() || secondName.isEmpty()) showToast() else newUser(name, secondName, age)
        }
    }

    private fun showToast() {
        Toast.makeText(this, R.string.press_the_button, Toast.LENGTH_LONG).show()
    }

    private fun newUser(name: String, secondName: String, age: Int) {
        val user = User(name, secondName, age)
        val resultText = "${user.name}, ${user.secondName}, ${user.age}"
        setuserStat.text = resultText


    }
}




