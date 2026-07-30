package p153l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class lxv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f134007a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f134008b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f134009c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f134010d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f134011e;

    /* JADX INFO: renamed from: f */
    public final kqx0 f134012f;

    /* JADX INFO: renamed from: g */
    public final kqx0 f134013g;

    public lxv0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5, kqx0 kqx0Var6, kqx0 kqx0Var7) {
        this.f134007a = kqx0Var;
        this.f134008b = kqx0Var2;
        this.f134009c = kqx0Var3;
        this.f134010d = kqx0Var4;
        this.f134011e = kqx0Var5;
        this.f134012f = kqx0Var6;
        this.f134013g = kqx0Var7;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        vat0 vat0Var = new vat0();
        int iIntValue = ((tzv0) this.f134008b).zzb().intValue();
        Context contextM146114a = ((jlt0) this.f134009c).m146114a();
        ebt0 ebt0Var = (ebt0) this.f134010d.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f134011e.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new jxv0(vat0Var, iIntValue, contextM146114a, ebt0Var, scheduledExecutorService, xvw0Var, ((szv0) this.f134013g).m188684a());
    }
}
