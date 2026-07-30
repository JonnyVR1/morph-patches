package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ehs0 implements pvy0 {

    /* JADX INFO: renamed from: a */
    public boolean f91408a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f91409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b1r0 f91410c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f91411d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map f91412e;

    public ehs0(ghs0 ghs0Var, boolean z, b1r0 b1r0Var, Map map, Map map2) {
        this.f91409b = z;
        this.f91410c = b1r0Var;
        this.f91411d = map;
        this.f91412e = map2;
    }

    @Override // p149l.pvy0
    /* JADX INFO: renamed from: a */
    public final void mo111829a(boolean z) {
        if (this.f91408a) {
            return;
        }
        if (z && this.f91409b) {
            ((a7u0) this.f91410c).zzs();
        }
        this.f91408a = true;
        this.f91411d.put((String) this.f91412e.get("event_id"), Boolean.valueOf(z));
        ((eks0) this.f91410c).mo13674Z("openIntentAsync", this.f91411d);
    }

    @Override // p149l.pvy0
    /* JADX INFO: renamed from: e */
    public final void mo111830e(int i) {
    }
}
