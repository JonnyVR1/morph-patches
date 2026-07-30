package p149l;

import android.app.UiModeManager;
import android.content.Context;
import com.google.android.gms.internal.ads.zzfoj;

/* JADX INFO: loaded from: classes6.dex */
public final class j7w0 {

    /* JADX INFO: renamed from: a */
    public static UiModeManager f116659a;

    /* JADX INFO: renamed from: a */
    public static zzfoj m140120a() {
        UiModeManager uiModeManager = f116659a;
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
    public static void m140121b(Context context) {
        if (context != null) {
            f116659a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
