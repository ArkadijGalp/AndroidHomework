package space.arkady.homework3lesson.fragmentFolder

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import space.arkady.homework3lesson.R
import space.arkady.homework3lesson.User
import kotlinx.android.synthetic.main.fragment_userinfo.*
import android.view.View

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 */
class UserInformationFragment: Fragment(R.layout.fragment_userinfo) {
    companion object {
        const val TAG = "UserInformationFragment"

        private var counter = 0

        private const val USER_KEY = "user_key"
        fun newInstance(user: User) = UserInformationFragment()
            .apply {
                arguments = Bundle().apply { putParcelable(USER_KEY, user) }
            }
    }
    private val user: User? by lazy { arguments?.getParcelable(USER_KEY) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Name.text = user?.name
        Email.text = user?.email

        Password.text = Editable.Factory.getInstance().newEditable("Password")

        textPassword.setOnClickListener{
            if (counter % 2 == 0) {
                Password.text = Editable.Factory.getInstance().newEditable(user?.password)
            } else {
                Password.text = Editable.Factory.getInstance().newEditable("********")
            }
            counter++
        }

    }
}



