package p003l;

import l.tjg0;
import l.y6g0;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ppg0 implements ISudFSMStateHandle {

    /* JADX INFO: renamed from: a */
    public final y6g0 f6481a;

    /* JADX INFO: renamed from: b */
    public final tjg0 f6482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oqg0 f6483c;

    public ppg0(oqg0 oqg0Var, y6g0 y6g0Var, tjg0 tjg0Var) {
        this.f6483c = oqg0Var;
        this.f6481a = y6g0Var;
        this.f6482b = tjg0Var;
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void failure(String str) {
        this.f6481a.failure(str);
        tjg0 tjg0Var = this.f6482b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        tjg0Var.c = jCurrentTimeMillis;
        tjg0Var.d = jCurrentTimeMillis - tjg0Var.b;
        this.f6483c.m6727b(this.f6482b);
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void success(String str) {
        this.f6481a.success(str);
        tjg0 tjg0Var = this.f6482b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        tjg0Var.c = jCurrentTimeMillis;
        tjg0Var.d = jCurrentTimeMillis - tjg0Var.b;
        this.f6483c.m6727b(this.f6482b);
    }
}
