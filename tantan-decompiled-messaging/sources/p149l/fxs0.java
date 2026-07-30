package p149l;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class fxs0 extends u0s0 {

    /* JADX INFO: renamed from: c */
    public final Context f99807c;

    public fxs0(Context context) {
        this.f99807c = context;
    }

    @Override // p149l.u0s0
    /* JADX INFO: renamed from: a */
    public final void mo123689a() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f99807c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            x2t0.m206867e("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        w2t0.m201219j(isAdIdFakeForDebugLogging);
        x2t0.m206869g("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
