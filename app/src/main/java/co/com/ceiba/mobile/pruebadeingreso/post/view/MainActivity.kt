package co.com.ceiba.mobile.pruebadeingreso.post.view

import android.app.Activity
import android.content.Context
import android.os.Bundle
import co.com.ceiba.mobile.pruebadeingreso.R
import co.com.ceiba.mobile.pruebadeingreso.post.model.User
import co.com.ceiba.mobile.pruebadeingreso.post.presenter.PresenterMainActivity

class MainActivity : Activity(), IMainActivity{

    var context:Context = applicationContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        getUser()
    }

    override fun showDialog(tittle: String, message: String) {
        TODO("Not yet implemented")
    }

    override fun cancelDialog() {
        TODO("Not yet implemented")
    }

    override fun getUser() {
        TODO("Not yet implemented")
    }

    override fun setUser(listUser: ArrayList<User>) {
        TODO("Not yet implemented")
    }
}