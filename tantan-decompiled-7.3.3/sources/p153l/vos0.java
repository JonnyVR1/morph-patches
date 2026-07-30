package p153l;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.C2098b;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class vos0 implements bqs0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        WindowManager windowManager = (WindowManager) wit0Var.getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        bxy0.m106934r();
        DisplayMetrics displayMetricsM12354U = C2098b.m12354U(windowManager);
        int i = displayMetricsM12354U.widthPixels;
        int i2 = displayMetricsM12354U.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) wit0Var).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i));
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        wit0Var.mo13728Z("locationReady", map2);
        dct0.m115298g("GET LOCATION COMPILED");
    }
}
