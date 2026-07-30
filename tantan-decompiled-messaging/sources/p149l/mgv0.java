package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class mgv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final double f133738a;

    /* JADX INFO: renamed from: b */
    public final boolean f133739b;

    public mgv0(double d, boolean z) {
        this.f133738a = d;
        this.f133739b = z;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleM200674a = vyv0.m200674a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleM200674a);
        Bundle bundleM200674a2 = vyv0.m200674a(bundleM200674a, "battery");
        bundleM200674a.putBundle("battery", bundleM200674a2);
        bundleM200674a2.putBoolean("is_charging", this.f133739b);
        bundleM200674a2.putDouble("battery_level", this.f133738a);
    }
}
