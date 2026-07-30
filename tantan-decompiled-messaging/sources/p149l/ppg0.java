package p149l;

import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: classes3.dex */
public final class ppg0 implements ISudFSMStateHandle {

    /* JADX INFO: renamed from: a */
    public final y6g0 f150646a;

    /* JADX INFO: renamed from: b */
    public final tjg0 f150647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oqg0 f150648c;

    public ppg0(oqg0 oqg0Var, y6g0 y6g0Var, tjg0 tjg0Var) {
        this.f150648c = oqg0Var;
        this.f150646a = y6g0Var;
        this.f150647b = tjg0Var;
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void failure(String str) {
        this.f150646a.failure(str);
        tjg0 tjg0Var = this.f150647b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        tjg0Var.f170722c = jCurrentTimeMillis;
        tjg0Var.f170723d = jCurrentTimeMillis - tjg0Var.f170721b;
        this.f150648c.m165428b(this.f150647b);
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void success(String str) {
        this.f150646a.success(str);
        tjg0 tjg0Var = this.f150647b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        tjg0Var.f170722c = jCurrentTimeMillis;
        tjg0Var.f170723d = jCurrentTimeMillis - tjg0Var.f170721b;
        this.f150648c.m165428b(this.f150647b);
    }
}
