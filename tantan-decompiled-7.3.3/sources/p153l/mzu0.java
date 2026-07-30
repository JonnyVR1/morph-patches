package p153l;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class mzu0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f139556a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f139557b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f139558c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f139559d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f139560e;

    /* JADX INFO: renamed from: f */
    public final kqx0 f139561f;

    /* JADX INFO: renamed from: g */
    public final kqx0 f139562g;

    /* JADX INFO: renamed from: h */
    public final kqx0 f139563h;

    /* JADX INFO: renamed from: i */
    public final kqx0 f139564i;

    /* JADX INFO: renamed from: j */
    public final kqx0 f139565j;

    public mzu0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5, kqx0 kqx0Var6, kqx0 kqx0Var7, kqx0 kqx0Var8, kqx0 kqx0Var9, kqx0 kqx0Var10) {
        this.f139556a = kqx0Var;
        this.f139557b = kqx0Var2;
        this.f139558c = kqx0Var3;
        this.f139559d = kqx0Var4;
        this.f139560e = kqx0Var5;
        this.f139561f = kqx0Var6;
        this.f139562g = kqx0Var7;
        this.f139563h = kqx0Var8;
        this.f139564i = kqx0Var9;
        this.f139565j = kqx0Var10;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.f139556a.zzb();
        Context contextM146114a = ((jlt0) this.f139557b).m146114a();
        WeakReference weakReferenceM150396a = ((klt0) this.f139558c).m150396a();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new lzu0(executor, contextM146114a, weakReferenceM150396a, xvw0Var, (huu0) this.f139560e.zzb(), (ScheduledExecutorService) this.f139561f.zzb(), (hxu0) this.f139562g.zzb(), ((vlt0) this.f139563h).m201659a(), ((zeu0) this.f139564i).zzb(), (hew0) this.f139565j.zzb());
    }
}
