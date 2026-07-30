package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes6.dex */
public final class siv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f164745a;

    public siv0(Bundle bundle) {
        this.f164745a = bundle;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleM200674a = vyv0.m200674a(bundle, Device.TYPE);
        bundleM200674a.putBundle("android_mem_info", this.f164745a);
        bundle.putBundle(Device.TYPE, bundleM200674a);
    }
}
