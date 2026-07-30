package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class flu0 implements y6s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f99693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ilu0 f99694b;

    public flu0(ilu0 ilu0Var, String str) {
        this.f99693a = str;
        this.f99694b = ilu0Var;
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168025J1)).booleanValue()) {
            if (x6s0Var.f192630j) {
                ilu0 ilu0Var = this.f99694b;
                ilu0Var.f115615E.put(this.f99693a, Boolean.TRUE);
                ilu0 ilu0Var2 = this.f99694b;
                ilu0Var2.m140704i(ilu0Var2.f115629u.zzf(), this.f99694b.f115629u.zzl(), this.f99694b.f115629u.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (x6s0Var.f192630j) {
                    ilu0 ilu0Var3 = this.f99694b;
                    if (ilu0Var3.f115629u == null) {
                        return;
                    }
                    ilu0Var3.f115615E.put(this.f99693a, Boolean.TRUE);
                    ilu0 ilu0Var4 = this.f99694b;
                    ilu0Var4.m140704i(ilu0Var4.f115629u.zzf(), this.f99694b.f115629u.zzl(), this.f99694b.f115629u.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
