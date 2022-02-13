package space.arkady.homework3lesson.fragmentFolder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_user.*
import space.arkady.homework3lesson.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment(R.layout.fragment_login) {
    companion object {
        const val TAG = "LoginFragment"

        fun newInit() = LoginFragment()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn.setOnClickListener {


            hideKeyboard()

            if (Name.text.toString().isEmpty() || Email.text.toString().isEmpty()
                || Password.text.toString().isEmpty())
                {
                    requireActivity().showToast("Error")
                    return@setOnClickListener
                } else {
                    requireActivity().openFragment(
                        UserFragment.newInstance(getUser()), UserFragment.TAG, R.id.container)
            }




        }


    }
    private fun getUser():User {
        return User(Name.text.toString()
            , Email.text.toString()
            , Password.text.toString())
    }
}






