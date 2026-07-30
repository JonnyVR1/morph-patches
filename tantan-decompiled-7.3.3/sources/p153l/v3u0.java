package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class v3u0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f182296a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f182297b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f182298c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f182299d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f182300e;

    public v3u0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5) {
        this.f182296a = kqx0Var;
        this.f182297b = kqx0Var2;
        this.f182298c = kqx0Var3;
        this.f182299d = kqx0Var4;
        this.f182300e = kqx0Var5;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        h7u0 h7u0Var = (h7u0) this.f182296a.zzb();
        q6w0 q6w0VarM101357a = ((b0u0) this.f182297b).m101357a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f182298c.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new u3u0(h7u0Var, q6w0VarM101357a, scheduledExecutorService, xvw0Var, ((c0u0) this.f182300e).m107472a());
    }
}
