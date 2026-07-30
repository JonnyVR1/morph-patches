package p153l;

import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: classes3.dex */
public final class xxg0 implements ISudFSMStateHandle {

    /* JADX INFO: renamed from: a */
    public final gfg0 f196634a;

    /* JADX INFO: renamed from: b */
    public final bsg0 f196635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wyg0 f196636c;

    public xxg0(wyg0 wyg0Var, gfg0 gfg0Var, bsg0 bsg0Var) {
        this.f196636c = wyg0Var;
        this.f196634a = gfg0Var;
        this.f196635b = bsg0Var;
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void failure(String str) {
        this.f196634a.failure(str);
        bsg0 bsg0Var = this.f196635b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bsg0Var.f78156c = jCurrentTimeMillis;
        bsg0Var.f78157d = jCurrentTimeMillis - bsg0Var.f78155b;
        this.f196636c.m208617b(this.f196635b);
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void success(String str) {
        this.f196634a.success(str);
        bsg0 bsg0Var = this.f196635b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bsg0Var.f78156c = jCurrentTimeMillis;
        bsg0Var.f78157d = jCurrentTimeMillis - bsg0Var.f78155b;
        this.f196636c.m208617b(this.f196635b);
    }
}
