package p149l;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class rfs0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        q9t0 q9t0Var = (q9t0) obj;
        jbs0 jbs0VarMo13658I = q9t0Var.mo13658I();
        if (jbs0VarMo13658I == null || (jSONObjectZzb = jbs0VarMo13658I.zzb()) == null) {
            q9t0Var.mo13705q("nativeClickMetaReady", new JSONObject());
        } else {
            q9t0Var.mo13705q("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
