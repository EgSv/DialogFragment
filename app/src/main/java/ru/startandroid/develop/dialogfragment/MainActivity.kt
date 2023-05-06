package ru.startandroid.develop.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {

    private var dlg1: DialogFragment? = null
    private var dlg2: DialogFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dlg1 = Dialog1()
        dlg2 = Dialog2()
    }

    fun onClick(v: View) {
        when(v.id) {
            R.id.btnDlg1 -> dlg1!!.show(supportFragmentManager, "dlg1")
            R.id.btnDlg2 -> dlg2!!.show(supportFragmentManager, "dlg2")
            else -> {}
        }
    }
}