package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class seu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ teu0 f164067a;

    public seu0(teu0 teu0Var) {
        this.f164067a = teu0Var;
    }

    @Override // p149l.fmw0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            q9t0 q9t0Var = (q9t0) list.get(0);
            if (q9t0Var != null) {
                this.f164067a.m188624c(q9t0Var);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132175b5)).booleanValue()) {
                vny0.m199079q().m212290w(e, "omid native display exp");
            }
        }
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132175b5)).booleanValue()) {
            vny0.m199079q().m212290w(th, "omid native display exp");
        }
    }
}
