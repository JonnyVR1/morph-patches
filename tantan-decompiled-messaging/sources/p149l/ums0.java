package p149l;

import androidx.annotation.Nullable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ums0 implements yls0 {

    /* JADX INFO: renamed from: a */
    public final ams0 f177298a;

    /* JADX INFO: renamed from: b */
    public final bms0 f177299b;

    /* JADX INFO: renamed from: c */
    public final vls0 f177300c;

    /* JADX INFO: renamed from: d */
    public final String f177301d;

    public ums0(vls0 vls0Var, String str, bms0 bms0Var, ams0 ams0Var) {
        this.f177300c = vls0Var;
        this.f177301d = str;
        this.f177299b = bms0Var;
        this.f177298a = ams0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m194406b(ums0 ums0Var, pls0 pls0Var, wls0 wls0Var, Object obj, n3t0 n3t0Var) {
        try {
            vny0.m199080r();
            String string = UUID.randomUUID().toString();
            ugs0.f176439o.m145994c(string, new tms0(ums0Var, pls0Var, n3t0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ums0Var.f177299b.zzb(obj));
            wls0Var.mo13723z0(ums0Var.f177301d, jSONObject);
        } catch (Exception e) {
            try {
                n3t0Var.m157775c(e);
                x2t0.m206867e("Unable to invokeJavascript", e);
            } finally {
                pls0Var.m170255g();
            }
        }
    }

    @Override // p149l.rlw0
    public final gnr zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // p149l.yls0
    public final gnr zzb(Object obj) {
        n3t0 n3t0Var = new n3t0();
        pls0 pls0VarM198863b = this.f177300c.m198863b(null);
        xsu0.m210834k("callJs > getEngine: Promise created");
        pls0VarM198863b.m114708e(new jms0(this, pls0VarM198863b, obj, n3t0Var), new kms0(this, n3t0Var, pls0VarM198863b));
        return n3t0Var;
    }
}
