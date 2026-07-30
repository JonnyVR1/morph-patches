package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class mkv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f134383a;

    /* JADX INFO: renamed from: b */
    public final Bundle f134384b;

    public mkv0(String str, Bundle bundle) {
        this.f134383a = str;
        this.f134384b = bundle;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f134383a);
        if (this.f134384b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.f134384b);
    }
}
