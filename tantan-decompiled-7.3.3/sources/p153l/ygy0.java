package p153l;

import com.google.android.gms.internal.measurement.C2366r0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ygy0 extends avr0 {

    /* JADX INFO: renamed from: b */
    public final sdr0 f199892b;

    public ygy0(sdr0 sdr0Var) {
        this.f199892b = sdr0Var;
    }

    @Override // p153l.avr0, p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        str.getClass();
        switch (str) {
            case "getEventName":
                tqw0.m192373g("getEventName", 0, list);
                return new vyr0(this.f199892b.m185506d().m120713e());
            case "getTimestamp":
                tqw0.m192373g("getTimestamp", 0, list);
                return new glr0(Double.valueOf(this.f199892b.m185506d().m120710a()));
            case "getParamValue":
                tqw0.m192373g("getParamValue", 1, list);
                return C2366r0.m14333b(this.f199892b.m185506d().m120711b(gix0Var.m130395c(list.get(0)).zzf()));
            case "getParams":
                tqw0.m192373g("getParams", 0, list);
                Map<String, Object> mapM120715g = this.f199892b.m185506d().m120715g();
                avr0 avr0Var = new avr0();
                for (String str2 : mapM120715g.keySet()) {
                    avr0Var.mo100512a(str2, C2366r0.m14333b(mapM120715g.get(str2)));
                }
                return avr0Var;
            case "setParamValue":
                tqw0.m192373g("setParamValue", 2, list);
                String strZzf = gix0Var.m130395c(list.get(0)).zzf();
                ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(1));
                this.f199892b.m185506d().m120712d(strZzf, tqw0.m192370d(ewr0VarM130395c));
                return ewr0VarM130395c;
            case "setEventName":
                tqw0.m192373g("setEventName", 1, list);
                ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(0));
                if (ewr0.f96187w0.equals(ewr0VarM130395c2) || ewr0.f96188x0.equals(ewr0VarM130395c2)) {
                    wg3.m206174a("Illegal event name");
                    return null;
                }
                this.f199892b.m185506d().m120714f(ewr0VarM130395c2.zzf());
                return new vyr0(ewr0VarM130395c2.zzf());
            default:
                return super.mo100514c(str, gix0Var, list);
        }
    }
}
