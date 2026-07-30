package p153l;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ypv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f201131a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final Clock f201132b;

    /* JADX INFO: renamed from: c */
    public final wuv0 f201133c;

    /* JADX INFO: renamed from: d */
    public final long f201134d;

    public ypv0(wuv0 wuv0Var, long j, Clock clock) {
        this.f201132b = clock;
        this.f201133c = wuv0Var;
        this.f201134d = j;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 16;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        xpv0 xpv0Var = (xpv0) this.f201131a.get();
        if (xpv0Var == null || xpv0Var.m212684a()) {
            wuv0 wuv0Var = this.f201133c;
            xpv0 xpv0Var2 = new xpv0(wuv0Var.zzb(), this.f201134d, this.f201132b);
            this.f201131a.set(xpv0Var2);
            xpv0Var = xpv0Var2;
        }
        return xpv0Var.f195746a;
    }
}
