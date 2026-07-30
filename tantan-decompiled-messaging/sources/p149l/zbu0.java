package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class zbu0 implements sxr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f202490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ccu0 f202491b;

    public zbu0(ccu0 ccu0Var, String str) {
        this.f202490a = str;
        this.f202491b = ccu0Var;
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131954J1)).booleanValue()) {
            if (rxr0Var.f161504j) {
                ccu0 ccu0Var = this.f202491b;
                ccu0Var.f80309E.put(this.f202490a, Boolean.TRUE);
                ccu0 ccu0Var2 = this.f202491b;
                ccu0Var2.m106183i(ccu0Var2.f80323u.zzf(), this.f202491b.f80323u.zzl(), this.f202491b.f80323u.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (rxr0Var.f161504j) {
                    ccu0 ccu0Var3 = this.f202491b;
                    if (ccu0Var3.f80323u == null) {
                        return;
                    }
                    ccu0Var3.f80309E.put(this.f202490a, Boolean.TRUE);
                    ccu0 ccu0Var4 = this.f202491b;
                    ccu0Var4.m106183i(ccu0Var4.f80323u.zzf(), this.f202491b.f80323u.zzl(), this.f202491b.f80323u.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
