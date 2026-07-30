package p149l;

import com.google.android.gms.internal.measurement.C2343r0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class s7y0 extends ulr0 {

    /* JADX INFO: renamed from: b */
    public final m4r0 f162976b;

    public s7y0(m4r0 m4r0Var) {
        this.f162976b = m4r0Var;
    }

    @Override // p149l.ulr0, p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        str.getClass();
        switch (str) {
            case "getEventName":
                nhw0.m159470g("getEventName", 0, list);
                return new ppr0(this.f162976b.m153094d().m213014e());
            case "getTimestamp":
                nhw0.m159470g("getTimestamp", 0, list);
                return new acr0(Double.valueOf(this.f162976b.m153094d().m213011a()));
            case "getParamValue":
                nhw0.m159470g("getParamValue", 1, list);
                return C2343r0.m14279b(this.f162976b.m153094d().m213012b(a9x0Var.m95462c(list.get(0)).zzf()));
            case "getParams":
                nhw0.m159470g("getParams", 0, list);
                Map<String, Object> mapM213016g = this.f162976b.m153094d().m213016g();
                ulr0 ulr0Var = new ulr0();
                for (String str2 : mapM213016g.keySet()) {
                    ulr0Var.mo126000a(str2, C2343r0.m14279b(mapM213016g.get(str2)));
                }
                return ulr0Var;
            case "setParamValue":
                nhw0.m159470g("setParamValue", 2, list);
                String strZzf = a9x0Var.m95462c(list.get(0)).zzf();
                ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(1));
                this.f162976b.m153094d().m213013d(strZzf, nhw0.m159467d(ymr0VarM95462c));
                return ymr0VarM95462c;
            case "setEventName":
                nhw0.m159470g("setEventName", 1, list);
                ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(0));
                if (ymr0.f199051w0.equals(ymr0VarM95462c2) || ymr0.f199052x0.equals(ymr0VarM95462c2)) {
                    ig3.m135964a("Illegal event name");
                    return null;
                }
                this.f162976b.m153094d().m213015f(ymr0VarM95462c2.zzf());
                return new ppr0(ymr0VarM95462c2.zzf());
            default:
                return super.mo95833c(str, a9x0Var, list);
        }
    }
}
