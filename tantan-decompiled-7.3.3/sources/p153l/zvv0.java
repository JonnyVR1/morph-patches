package p153l;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class zvv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f206290a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f206291b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f206292c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f206293d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f206294e;

    /* JADX INFO: renamed from: f */
    public final kqx0 f206295f;

    /* JADX INFO: renamed from: g */
    public final kqx0 f206296g;

    public zvv0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5, kqx0 kqx0Var6, kqx0 kqx0Var7) {
        this.f206290a = kqx0Var;
        this.f206291b = kqx0Var2;
        this.f206292c = kqx0Var3;
        this.f206293d = kqx0Var4;
        this.f206294e = kqx0Var5;
        this.f206295f = kqx0Var6;
        this.f206296g = kqx0Var7;
    }

    /* JADX INFO: renamed from: a */
    public static xvv0 m221814a(vat0 vat0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new xvv0(vat0Var, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        vat0 vat0Var = new vat0();
        Context contextM146114a = ((jlt0) this.f206291b).m146114a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f206292c.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new xvv0(vat0Var, contextM146114a, scheduledExecutorService, xvw0Var, ((tzv0) this.f206294e).zzb().intValue(), ((uzv0) this.f206295f).zzb().booleanValue(), ((wzv0) this.f206296g).zzb().booleanValue());
    }
}
