package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class stv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f170615a;

    /* JADX INFO: renamed from: b */
    public final Bundle f170616b;

    public stv0(String str, Bundle bundle) {
        this.f170615a = str;
        this.f170616b = bundle;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f170615a);
        if (this.f170616b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.f170616b);
    }
}
