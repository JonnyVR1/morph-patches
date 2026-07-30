package p153l;

import androidx.annotation.Nullable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class aws0 implements evs0 {

    /* JADX INFO: renamed from: a */
    public final gvs0 f73790a;

    /* JADX INFO: renamed from: b */
    public final hvs0 f73791b;

    /* JADX INFO: renamed from: c */
    public final bvs0 f73792c;

    /* JADX INFO: renamed from: d */
    public final String f73793d;

    public aws0(bvs0 bvs0Var, String str, hvs0 hvs0Var, gvs0 gvs0Var) {
        this.f73792c = bvs0Var;
        this.f73793d = str;
        this.f73791b = hvs0Var;
        this.f73790a = gvs0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m100714b(aws0 aws0Var, vus0 vus0Var, cvs0 cvs0Var, Object obj, tct0 tct0Var) {
        try {
            bxy0.m106934r();
            String string = UUID.randomUUID().toString();
            aqs0.f72866o.m177512c(string, new zvs0(aws0Var, vus0Var, tct0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", aws0Var.f73791b.zzb(obj));
            cvs0Var.mo13777z0(aws0Var.f73793d, jSONObject);
        } catch (Exception e) {
            try {
                tct0Var.m190495c(e);
                dct0.m115296e("Unable to invokeJavascript", e);
            } finally {
                vus0Var.m202889g();
            }
        }
    }

    @Override // p153l.xuw0
    public final hpr zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // p153l.evs0
    public final hpr zzb(Object obj) {
        tct0 tct0Var = new tct0();
        vus0 vus0VarM106605b = this.f73792c.m106605b(null);
        d2v0.m113737k("callJs > getEngine: Promise created");
        vus0VarM106605b.m149269e(new pvs0(this, vus0VarM106605b, obj, tct0Var), new qvs0(this, tct0Var, vus0VarM106605b));
        return tct0Var;
    }
}
