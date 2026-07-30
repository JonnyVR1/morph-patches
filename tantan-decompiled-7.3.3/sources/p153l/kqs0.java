package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class kqs0 implements v4z0 {

    /* JADX INFO: renamed from: a */
    public boolean f128288a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f128289b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ har0 f128290c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f128291d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map f128292e;

    public kqs0(mqs0 mqs0Var, boolean z, har0 har0Var, Map map, Map map2) {
        this.f128289b = z;
        this.f128290c = har0Var;
        this.f128291d = map;
        this.f128292e = map2;
    }

    @Override // p153l.v4z0
    /* JADX INFO: renamed from: a */
    public final void mo146633a(boolean z) {
        if (this.f128288a) {
            return;
        }
        if (z && this.f128289b) {
            ((ggu0) this.f128290c).zzs();
        }
        this.f128288a = true;
        this.f128291d.put((String) this.f128292e.get("event_id"), Boolean.valueOf(z));
        ((kts0) this.f128290c).mo13728Z("openIntentAsync", this.f128291d);
    }

    @Override // p153l.v4z0
    /* JADX INFO: renamed from: e */
    public final void mo146634e(int i) {
    }
}
