package com.banrossyn.neumor.toast;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NeumorphToast {

    public static void showToast(Activity activity)
    {
        View view = activity.getLayoutInflater().inflate(R.layout.layout_toast, null);

        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

}
