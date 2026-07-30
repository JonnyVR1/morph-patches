package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class yrv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f201357a;

    public yrv0(Bundle bundle) {
        this.f201357a = bundle;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleM103038a = b8w0.m103038a(bundle, Device.TYPE);
        bundleM103038a.putBundle("android_mem_info", this.f201357a);
        bundle.putBundle(Device.TYPE, bundleM103038a);
    }
}
