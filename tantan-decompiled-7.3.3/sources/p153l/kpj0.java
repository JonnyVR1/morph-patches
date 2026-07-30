package p153l;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public class kpj0 {
    /* JADX INFO: renamed from: a */
    private static DisplayMetrics m150738a() {
        return kv0.m151647a().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: b */
    public static int m150739b() {
        int i;
        Display defaultDisplay = ((WindowManager) kv0.m151647a().getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return i <= 0 ? m150740c() : i;
    }

    /* JADX INFO: renamed from: c */
    public static int m150740c() {
        return m150738a().heightPixels;
    }

    /* JADX INFO: renamed from: d */
    public static int m150741d() {
        return m150738a().widthPixels;
    }
}
