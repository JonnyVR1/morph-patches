package p153l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class uvv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f181172a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f181173b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f181174c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f181175d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f181176e;

    /* JADX INFO: renamed from: f */
    public final kqx0 f181177f;

    public uvv0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5, kqx0 kqx0Var6) {
        this.f181172a = kqx0Var;
        this.f181173b = kqx0Var2;
        this.f181174c = kqx0Var3;
        this.f181175d = kqx0Var4;
        this.f181176e = kqx0Var5;
        this.f181177f = kqx0Var6;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        grw0 grw0VarZzb = ((hlt0) this.f181172a).zzb();
        Context contextM146114a = ((jlt0) this.f181173b).m146114a();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new rvv0(grw0VarZzb, contextM146114a, xvw0Var, (ScheduledExecutorService) this.f181175d.zzb(), ((ocv0) this.f181176e).zzb(), ((z5u0) this.f181177f).m218742a());
    }
}
