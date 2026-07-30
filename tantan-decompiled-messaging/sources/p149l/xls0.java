package p149l;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xls0 implements gks0, wls0 {

    /* JADX INFO: renamed from: a */
    public final wls0 f193493a;

    /* JADX INFO: renamed from: b */
    public final HashSet f193494b = new HashSet();

    public xls0(wls0 wls0Var) {
        this.f193493a = wls0Var;
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13674Z(String str, Map map) {
        fks0.m121889a(this, str, map);
    }

    @Override // p149l.gks0, p149l.rks0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo13677b(String str, String str2) {
        fks0.m121891c(this, str, str2);
    }

    @Override // p149l.wls0
    /* JADX INFO: renamed from: k0 */
    public final void mo175388k0(String str, vgs0 vgs0Var) {
        this.f193493a.mo175388k0(str, vgs0Var);
        this.f193494b.remove(new AbstractMap.SimpleEntry(str, vgs0Var));
    }

    @Override // p149l.gks0, p149l.eks0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo13705q(String str, JSONObject jSONObject) {
        fks0.m121890b(this, str, jSONObject);
    }

    @Override // p149l.wls0
    /* JADX INFO: renamed from: q0 */
    public final void mo175389q0(String str, vgs0 vgs0Var) {
        this.f193493a.mo175389q0(str, vgs0Var);
        this.f193494b.add(new AbstractMap.SimpleEntry(str, vgs0Var));
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void mo13723z0(String str, JSONObject jSONObject) {
        fks0.m121892d(this, str, jSONObject);
    }

    @Override // p149l.gks0, p149l.rks0
    public final void zza(String str) {
        this.f193493a.zza(str);
    }

    public final void zzc() {
        for (AbstractMap.SimpleEntry simpleEntry : this.f193494b) {
            xsu0.m210834k("Unregistering eventhandler: ".concat(String.valueOf(((vgs0) simpleEntry.getValue()).toString())));
            this.f193493a.mo175388k0((String) simpleEntry.getKey(), (vgs0) simpleEntry.getValue());
        }
        this.f193494b.clear();
    }
}
