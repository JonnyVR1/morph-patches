package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ynu0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ znu0 f200928a;

    public ynu0(znu0 znu0Var) {
        this.f200928a = znu0Var;
    }

    @Override // p153l.lvw0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            wit0 wit0Var = (wit0) list.get(0);
            if (wit0Var != null) {
                this.f200928a.m220677c(wit0Var);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168246b5)).booleanValue()) {
                bxy0.m106933q().m120275w(e, "omid native display exp");
            }
        }
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168246b5)).booleanValue()) {
            bxy0.m106933q().m120275w(th, "omid native display exp");
        }
    }
}
