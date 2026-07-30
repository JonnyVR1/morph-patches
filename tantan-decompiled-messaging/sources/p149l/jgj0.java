package p149l;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes7.dex */
public class jgj0 {
    /* JADX INFO: renamed from: a */
    private static DisplayMetrics m141297a() {
        return dv0.m113757a().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: b */
    public static int m141298b() {
        int i;
        Display defaultDisplay = ((WindowManager) dv0.m113757a().getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return i <= 0 ? m141299c() : i;
    }

    /* JADX INFO: renamed from: c */
    public static int m141299c() {
        return m141297a().heightPixels;
    }

    /* JADX INFO: renamed from: d */
    public static int m141300d() {
        return m141297a().widthPixels;
    }
}
