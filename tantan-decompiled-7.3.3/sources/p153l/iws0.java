package p153l;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class iws0 implements xuw0 {

    /* JADX INFO: renamed from: a */
    public final gvs0 f117293a;

    /* JADX INFO: renamed from: b */
    public final hvs0 f117294b;

    /* JADX INFO: renamed from: c */
    public final String f117295c = "google.afma.activeView.handleUpdate";

    /* JADX INFO: renamed from: d */
    public final hpr f117296d;

    public iws0(hpr hprVar, String str, hvs0 hvs0Var, gvs0 gvs0Var) {
        this.f117296d = hprVar;
        this.f117294b = hvs0Var;
        this.f117293a = gvs0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m142391a(Object obj, cvs0 cvs0Var) throws Exception {
        tct0 tct0Var = new tct0();
        bxy0.m106934r();
        String string = UUID.randomUUID().toString();
        aqs0.f72866o.m177512c(string, new hws0(this, tct0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        cvs0Var.mo13777z0(this.f117295c, jSONObject);
        return tct0Var;
    }

    @Override // p153l.xuw0
    public final hpr zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final hpr zzb(final Object obj) {
        return pvw0.m173987n(this.f117296d, new xuw0() { // from class: l.gws0
            @Override // p153l.xuw0
            public final hpr zza(Object obj2) {
                return this.f106867a.m142391a(obj, (cvs0) obj2);
            }
        }, oct0.f146738f);
    }
}
