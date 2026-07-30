package p149l;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public final class tvt0 {
    /* JADX INFO: renamed from: a */
    public static void m190816a(Context context) {
        Object obj = w2t0.f184284b;
        if (((Boolean) o9s0.f142741a.m115379e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || w2t0.m201221l()) {
                    return;
                }
                gnr gnrVarMo124731b = new fxs0(context).mo124731b();
                x2t0.m206868f("Updating ad debug logging enablement.");
                l3t0.m148407a(gnrVarMo124731b, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                x2t0.m206870h("Fail to determine debug setting.", e);
            }
        }
    }
}
