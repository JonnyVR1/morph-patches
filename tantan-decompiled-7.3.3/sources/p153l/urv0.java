package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class urv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f180706a;

    /* JADX INFO: renamed from: b */
    public final boolean f180707b;

    /* JADX INFO: renamed from: c */
    public final boolean f180708c;

    /* JADX INFO: renamed from: d */
    public final boolean f180709d;

    /* JADX INFO: renamed from: e */
    public final boolean f180710e;

    public urv0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f180706a = str;
        this.f180707b = z;
        this.f180708c = z2;
        this.f180709d = z3;
        this.f180710e = z4;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f180706a.isEmpty()) {
            bundle.putString("inspector_extras", this.f180706a);
        }
        bundle.putInt("test_mode", this.f180707b ? 1 : 0);
        bundle.putInt("linked_device", this.f180708c ? 1 : 0);
        if (this.f180707b || this.f180708c) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168276d9)).booleanValue()) {
                bundle.putInt("risd", !this.f180709d ? 1 : 0);
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168328h9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f180710e);
            }
        }
    }
}
