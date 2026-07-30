package p153l;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dvs0 implements mts0, cvs0 {

    /* JADX INFO: renamed from: a */
    public final cvs0 f90944a;

    /* JADX INFO: renamed from: b */
    public final HashSet f90945b = new HashSet();

    public dvs0(cvs0 cvs0Var) {
        this.f90944a = cvs0Var;
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13728Z(String str, Map map) {
        lts0.m155807a(this, str, map);
    }

    @Override // p153l.mts0, p153l.xts0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo13731b(String str, String str2) {
        lts0.m155809c(this, str, str2);
    }

    @Override // p153l.cvs0
    /* JADX INFO: renamed from: k0 */
    public final void mo112871k0(String str, bqs0 bqs0Var) {
        this.f90944a.mo112871k0(str, bqs0Var);
        this.f90945b.remove(new AbstractMap.SimpleEntry(str, bqs0Var));
    }

    @Override // p153l.mts0, p153l.kts0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo13759q(String str, JSONObject jSONObject) {
        lts0.m155808b(this, str, jSONObject);
    }

    @Override // p153l.cvs0
    /* JADX INFO: renamed from: q0 */
    public final void mo112872q0(String str, bqs0 bqs0Var) {
        this.f90944a.mo112872q0(str, bqs0Var);
        this.f90945b.add(new AbstractMap.SimpleEntry(str, bqs0Var));
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void mo13777z0(String str, JSONObject jSONObject) {
        lts0.m155810d(this, str, jSONObject);
    }

    @Override // p153l.mts0, p153l.xts0
    public final void zza(String str) {
        this.f90944a.zza(str);
    }

    public final void zzc() {
        for (AbstractMap.SimpleEntry simpleEntry : this.f90945b) {
            d2v0.m113737k("Unregistering eventhandler: ".concat(String.valueOf(((bqs0) simpleEntry.getValue()).toString())));
            this.f90944a.mo112871k0((String) simpleEntry.getKey(), (bqs0) simpleEntry.getValue());
        }
        this.f90945b.clear();
    }
}
