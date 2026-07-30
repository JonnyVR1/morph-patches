package p153l;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes7.dex */
public class lpj0 {

    /* JADX INFO: renamed from: a */
    public static Float f133067a;

    /* JADX INFO: renamed from: a */
    public static int m155245a(int i) {
        if (i >= 0) {
            return (int) (mpj0.m159370b(lv0.m155971a(), i) + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static DisplayMetrics m155246b() {
        return m155249e().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: c */
    public static int m155247c(float f) {
        return mpj0.m159369a(lv0.m155971a(), f);
    }

    /* JADX INFO: renamed from: d */
    public static int m155248d() {
        int i;
        Display defaultDisplay = ((WindowManager) lv0.m155971a().getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception e) {
            Log.e("UIUtils", "", e);
            i = 0;
        }
        return i <= 0 ? m155251g() : i;
    }

    /* JADX INFO: renamed from: e */
    public static Resources m155249e() {
        return lv0.m155971a().getResources();
    }

    /* JADX INFO: renamed from: f */
    public static float m155250f() {
        if (f133067a == null) {
            f133067a = Float.valueOf(m155246b().density);
        }
        return f133067a.floatValue();
    }

    /* JADX INFO: renamed from: g */
    public static int m155251g() {
        return m155246b().heightPixels;
    }

    /* JADX INFO: renamed from: h */
    public static int m155252h() {
        return m155246b().widthPixels;
    }

    /* JADX INFO: renamed from: i */
    public static int m155253i() {
        return m155248d() - m155251g();
    }

    /* JADX INFO: renamed from: j */
    public static void m155254j(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) lv0.m155971a().getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }
}
