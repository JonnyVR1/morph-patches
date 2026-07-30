package p153l;

import android.app.Activity;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes7.dex */
public class jkw {
    /* JADX INFO: renamed from: a */
    public static void m145928a(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            m145929b(activity, currentFocus.getWindowToken());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m145929b(Activity activity, IBinder iBinder) {
        m145930c(activity, iBinder, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m145930c(Activity activity, IBinder iBinder, ResultReceiver resultReceiver) {
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 0);
    }

    /* JADX INFO: renamed from: d */
    public static void m145931d(Activity activity, View view) {
        m145932e(activity, view, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m145932e(Activity activity, View view, ResultReceiver resultReceiver) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(view, 1, resultReceiver);
    }
}
