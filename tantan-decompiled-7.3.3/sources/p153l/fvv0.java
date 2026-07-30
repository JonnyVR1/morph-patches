package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class fvv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f101097a;

    /* JADX INFO: renamed from: b */
    public final int f101098b;

    /* JADX INFO: renamed from: c */
    public final int f101099c;

    /* JADX INFO: renamed from: d */
    public final int f101100d;

    /* JADX INFO: renamed from: e */
    public final boolean f101101e;

    /* JADX INFO: renamed from: f */
    public final int f101102f;

    public fvv0(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f101097a = str;
        this.f101098b = i;
        this.f101099c = i2;
        this.f101100d = i3;
        this.f101101e = z;
        this.f101102f = i4;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        b8w0.m103043f(bundle, "carrier", this.f101097a, !TextUtils.isEmpty(this.f101097a));
        int i = this.f101098b;
        b8w0.m103042e(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f101099c);
        bundle.putInt("pt", this.f101100d);
        Bundle bundleM103038a = b8w0.m103038a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleM103038a);
        Bundle bundleM103038a2 = b8w0.m103038a(bundleM103038a, "network");
        bundleM103038a.putBundle("network", bundleM103038a2);
        bundleM103038a2.putInt("active_network_state", this.f101102f);
        bundleM103038a2.putBoolean("active_network_metered", this.f101101e);
    }
}
