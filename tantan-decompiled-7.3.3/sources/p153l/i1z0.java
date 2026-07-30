package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i1z0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public zar0 f112574c;

    public i1z0(zar0 zar0Var) {
        super("internal.registerCallback");
        this.f112574c = zar0Var;
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        tqw0.m192373g(this.f137945a, 3, list);
        String strZzf = gix0Var.m130395c(list.get(0)).zzf();
        ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(1));
        if (!(ewr0VarM130395c instanceof pxr0)) {
            wg3.m206174a("Invalid callback type");
            return null;
        }
        ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(2));
        if (!(ewr0VarM130395c2 instanceof avr0)) {
            wg3.m206174a("Invalid callback params");
            return null;
        }
        avr0 avr0Var = (avr0) ewr0VarM130395c2;
        if (!avr0Var.zzc("type")) {
            wg3.m206174a("Undefined rule type");
            return null;
        }
        this.f112574c.m219134b(strZzf, avr0Var.zzc("priority") ? tqw0.m192375i(avr0Var.zza("priority").zze().doubleValue()) : 1000, (pxr0) ewr0VarM130395c, avr0Var.zza("type").zzf());
        return ewr0.f96187w0;
    }
}
