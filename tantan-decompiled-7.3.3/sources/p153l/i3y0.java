package p153l;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i3y0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public final sdr0 f112796c;

    public i3y0(sdr0 sdr0Var) {
        super("internal.eventLogger");
        this.f112796c = sdr0Var;
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        tqw0.m192373g(this.f137945a, 3, list);
        String strZzf = gix0Var.m130395c(list.get(0)).zzf();
        long jM192367a = (long) tqw0.m192367a(gix0Var.m130395c(list.get(1)).zze().doubleValue());
        ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(2));
        this.f112796c.m185504b(strZzf, jM192367a, ewr0VarM130395c instanceof avr0 ? tqw0.m192371e((avr0) ewr0VarM130395c) : new HashMap<>());
        return ewr0.f96187w0;
    }
}
