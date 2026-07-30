package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class spv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final double f170112a;

    /* JADX INFO: renamed from: b */
    public final boolean f170113b;

    public spv0(double d, boolean z) {
        this.f170112a = d;
        this.f170113b = z;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleM103038a = b8w0.m103038a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleM103038a);
        Bundle bundleM103038a2 = b8w0.m103038a(bundleM103038a, "battery");
        bundleM103038a.putBundle("battery", bundleM103038a2);
        bundleM103038a2.putBoolean("is_charging", this.f170113b);
        bundleM103038a2.putDouble("battery_level", this.f170112a);
    }
}
