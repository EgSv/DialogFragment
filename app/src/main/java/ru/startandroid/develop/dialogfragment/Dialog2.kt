package ru.startandroid.develop.dialogfragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.os.Bundle
import android.util.Log

class Dialog2: androidx.fragment.app.DialogFragment(), OnClickListener {
    private val LOG_TAG = "myLogs"

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val adb: AlertDialog.Builder = AlertDialog.Builder(activity)
            .setTitle("Title!").setPositiveButton(R.string.yes, this)
            .setNegativeButton(R.string.no, this)
            .setNeutralButton(R.string.maybe, this)
            .setMessage(R.string.message_text)
        return adb.create()
    }

    override fun onClick(dialog: DialogInterface?, which: Int) {
        var i = 0
        when(which) {
            Dialog.BUTTON_POSITIVE -> i = R.string.yes
            Dialog.BUTTON_NEGATIVE -> i = R.string.no
            Dialog.BUTTON_NEUTRAL -> i = R.string.maybe
        }
        if (i > 0) Log.d(LOG_TAG, "Dialog 2: ${resources.getString(i)}")
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        Log.d(LOG_TAG, "Dialog 2: onDismiss")
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        Log.d(LOG_TAG, "Dialog 2: onCancel")
    }
}