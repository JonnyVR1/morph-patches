package p153l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public class c0z0 extends jyy0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public static final boolean m107474l(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: d */
    public final boolean mo107475d(Activity activity, Configuration configuration) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168028J4)).booleanValue()) {
            return false;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168052L4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        k6s0.m148569b();
        int iM167049z = obt0.m167049z(activity, configuration.screenHeightDp);
        int iM167049z2 = obt0.m167049z(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        bxy0.m106934r();
        DisplayMetrics displayMetricsM12354U = C2098b.m12354U(windowManager);
        int i = displayMetricsM12354U.heightPixels;
        int i2 = displayMetricsM12354U.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) jas0.m144075c().m176505a(sgs0.f168004H4)).intValue();
        return (m107474l(i, iM167049z + dimensionPixelSize, iRound) && m107474l(i2, iM167049z2, iRound)) ? false : true;
    }
}
