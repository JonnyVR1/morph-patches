package p153l;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wos0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        JSONObject jSONObjectZza;
        wit0 wit0Var = (wit0) obj;
        pks0 pks0VarMo13712I = wit0Var.mo13712I();
        if (pks0VarMo13712I == null || (jSONObjectZza = pks0VarMo13712I.zza()) == null) {
            wit0Var.mo13759q("nativeAdViewSignalsReady", new JSONObject());
        } else {
            wit0Var.mo13759q("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
