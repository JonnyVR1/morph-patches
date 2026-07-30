package p153l;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public final class z4u0 {
    /* JADX INFO: renamed from: a */
    public static void m218614a(Context context) {
        Object obj = cct0.f81030b;
        if (((Boolean) uis0.f179144a.m149974e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || cct0.m109068l()) {
                    return;
                }
                hpr hprVarMo96667b = new l6t0(context).mo96667b();
                dct0.m115297f("Updating ad debug logging enablement.");
                rct0.m180821a(hprVarMo96667b, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                dct0.m115299h("Fail to determine debug setting.", e);
            }
        }
    }
}
