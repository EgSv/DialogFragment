package ru.startandroid.develop.dialogfragment

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

class Dialog1 : androidx.fragment.app.DialogFragment(), OnClickListener {
    private val LOG_TAG = "myLogs"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog!!.setTitle("Title!")
        val v: View = inflater.inflate(R.layout.dialog1, null)
        v.findViewById<View>(R.id.btnYes).setOnClickListener(this)
        v.findViewById<View>(R.id.btnNo).setOnClickListener(this)
        v.findViewById<View>(R.id.btnMaybe).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View) {
        Log.d(LOG_TAG, "Dialog 1: ${(v as Button).text}")
        dismiss()
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        Log.d(LOG_TAG, "Dialog 1: onDismiss")
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        Log.d(LOG_TAG, "Dialog 1: onCancel")
    }
}