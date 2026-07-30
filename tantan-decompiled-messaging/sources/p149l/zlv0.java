package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class zlv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f203665a;

    /* JADX INFO: renamed from: b */
    public final int f203666b;

    /* JADX INFO: renamed from: c */
    public final int f203667c;

    /* JADX INFO: renamed from: d */
    public final int f203668d;

    /* JADX INFO: renamed from: e */
    public final boolean f203669e;

    /* JADX INFO: renamed from: f */
    public final int f203670f;

    public zlv0(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f203665a = str;
        this.f203666b = i;
        this.f203667c = i2;
        this.f203668d = i3;
        this.f203669e = z;
        this.f203670f = i4;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        vyv0.m200679f(bundle, "carrier", this.f203665a, !TextUtils.isEmpty(this.f203665a));
        int i = this.f203666b;
        vyv0.m200678e(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f203667c);
        bundle.putInt("pt", this.f203668d);
        Bundle bundleM200674a = vyv0.m200674a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleM200674a);
        Bundle bundleM200674a2 = vyv0.m200674a(bundleM200674a, "network");
        bundleM200674a.putBundle("network", bundleM200674a2);
        bundleM200674a2.putInt("active_network_state", this.f203670f);
        bundleM200674a2.putBoolean("active_network_metered", this.f203669e);
    }
}
