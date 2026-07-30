package p153l;

import android.app.UiModeManager;
import android.content.Context;
import com.google.android.gms.internal.ads.zzfoj;

/* JADX INFO: loaded from: classes6.dex */
public final class pgw0 {

    /* JADX INFO: renamed from: a */
    public static UiModeManager f152350a;

    /* JADX INFO: renamed from: a */
    public static zzfoj m172282a() {
        UiModeManager uiModeManager = f152350a;
        if (uiModeManager == null) {
            return zzfoj.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? zzfoj.OTHER : zzfoj.CTV;
        }
        return zzfoj.MOBILE;
    }

    /* JADX INFO: renamed from: b */
    public static void m172283b(Context context) {
        if (context != null) {
            f152350a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
