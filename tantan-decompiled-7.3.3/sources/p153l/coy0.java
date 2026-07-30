package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class coy0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pky0 f82944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coy0(ody0 ody0Var, String str, pky0 pky0Var) {
        super(str);
        this.f82944c = pky0Var;
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        tqw0.m192373g("getValue", 2, list);
        ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
        ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(1));
        String strZza = this.f82944c.zza(ewr0VarM130395c.zzf());
        return strZza != null ? new vyr0(strZza) : ewr0VarM130395c2;
    }
}
