package space.arkady.homework3lesson.fragmentFolder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import space.arkady.homework3lesson.R
import space.arkady.homework3lesson.User
import kotlinx.android.synthetic.main.fragment_user.*
import space.arkady.homework3lesson.openFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [UserFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserFragment : Fragment(R.layout.fragment_user) {

companion object {
    const val TAG = "UserFragment"

    private const val USER_KEY = "user_key"
    fun newInstance(user: User) = UserFragment().apply {
        arguments = Bundle().apply { putParcelable(USER_KEY, user) }
    }
}

    private val user: User? by lazy { arguments?.getParcelable(USER_KEY) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        avatar.setImageResource(R.drawable.png_avatar)

        UserName.text = user?.name

        UserName.setOnClickListener {
            user?.let { it1 -> UserInformationFragment.newInstance(it1) }?.let { it2 ->
                requireActivity().openFragment(
                    it2,
                    UserInformationFragment.TAG,
                    R.id.container
                )
            }
        }

    }
}



