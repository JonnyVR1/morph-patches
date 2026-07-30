package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class mmt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f137635a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f137636b;

    public mmt0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f137635a = kqx0Var;
        this.f137636b = kqx0Var2;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a5t0 zzb() {
        Context contextM146114a = ((jlt0) this.f137635a).m146114a();
        hew0 hew0Var = (hew0) this.f137636b.zzb();
        ovs0 ovs0VarM127700b = bxy0.m106924h().m127700b(contextM146114a, zzcei.m13612F(), hew0Var);
        ivs0 ivs0Var = lvs0.f133729b;
        ovs0VarM127700b.m169486a("google.afma.request.getAdDictionary", ivs0Var, ivs0Var);
        return new z4t0(contextM146114a, bxy0.m106924h().m127700b(contextM146114a, zzcei.m13612F(), hew0Var).m169486a("google.afma.sdkConstants.getSdkConstants", ivs0Var, ivs0Var));
    }
}
