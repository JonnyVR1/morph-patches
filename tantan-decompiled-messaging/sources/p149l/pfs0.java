package p149l;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.C2075b;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class pfs0 implements vgs0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        WindowManager windowManager = (WindowManager) q9t0Var.getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        vny0.m199080r();
        DisplayMetrics displayMetricsM12300U = C2075b.m12300U(windowManager);
        int i = displayMetricsM12300U.widthPixels;
        int i2 = displayMetricsM12300U.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) q9t0Var).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i));
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        q9t0Var.mo13674Z("locationReady", map2);
        x2t0.m206869g("GET LOCATION COMPILED");
    }
}
