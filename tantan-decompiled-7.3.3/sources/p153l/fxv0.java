package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class fxv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f101317a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f101318b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f101319c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f101320d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f101321e;

    public fxv0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5) {
        this.f101317a = kqx0Var;
        this.f101318b = kqx0Var2;
        this.f101319c = kqx0Var3;
        this.f101320d = kqx0Var4;
        this.f101321e = kqx0Var5;
    }

    /* JADX INFO: renamed from: a */
    public static dxv0 m128034a(String str, cbs0 cbs0Var, ebt0 ebt0Var, ScheduledExecutorService scheduledExecutorService, xvw0 xvw0Var) {
        return new dxv0(str, cbs0Var, ebt0Var, scheduledExecutorService, xvw0Var);
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strM188684a = ((szv0) this.f101317a).m188684a();
        cbs0 cbs0Var = new cbs0();
        ebt0 ebt0Var = (ebt0) this.f101319c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f101320d.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new dxv0(strM188684a, cbs0Var, ebt0Var, scheduledExecutorService, xvw0Var);
    }
}
