package p149l;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class cns0 implements rlw0 {

    /* JADX INFO: renamed from: a */
    public final ams0 f81688a;

    /* JADX INFO: renamed from: b */
    public final bms0 f81689b;

    /* JADX INFO: renamed from: c */
    public final String f81690c = "google.afma.activeView.handleUpdate";

    /* JADX INFO: renamed from: d */
    public final gnr f81691d;

    public cns0(gnr gnrVar, String str, bms0 bms0Var, ams0 ams0Var) {
        this.f81691d = gnrVar;
        this.f81689b = bms0Var;
        this.f81688a = ams0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m107832a(Object obj, wls0 wls0Var) throws Exception {
        n3t0 n3t0Var = new n3t0();
        vny0.m199080r();
        String string = UUID.randomUUID().toString();
        ugs0.f176439o.m145994c(string, new bns0(this, n3t0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        wls0Var.mo13723z0(this.f81690c, jSONObject);
        return n3t0Var;
    }

    @Override // p149l.rlw0
    public final gnr zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final gnr zzb(final Object obj) {
        return jmw0.m142241n(this.f81691d, new rlw0() { // from class: l.ans0
            @Override // p149l.rlw0
            public final gnr zza(Object obj2) {
                return this.f70765a.m107832a(obj, (wls0) obj2);
            }
        }, i3t0.f111377f);
    }
}
