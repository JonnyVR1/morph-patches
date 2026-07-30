package p149l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public class wqy0 extends dpy0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public static final boolean m205073l(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: d */
    public final boolean mo201214d(Activity activity, Configuration configuration) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131957J4)).booleanValue()) {
            return false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131981L4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        exr0.m118703b();
        int iM134096z = i2t0.m134096z(activity, configuration.screenHeightDp);
        int iM134096z2 = i2t0.m134096z(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        vny0.m199080r();
        DisplayMetrics displayMetricsM12300U = C2075b.m12300U(windowManager);
        int i = displayMetricsM12300U.heightPixels;
        int i2 = displayMetricsM12300U.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) d1s0.m109677c().m144697a(m7s0.f131933H4)).intValue();
        return (m205073l(i, iM134096z + dimensionPixelSize, iRound) && m205073l(i2, iM134096z2, iRound)) ? false : true;
    }
}
