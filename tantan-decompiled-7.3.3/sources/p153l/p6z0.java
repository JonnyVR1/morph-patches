package p153l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class p6z0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public final n8y0 f150888c;

    /* JADX INFO: renamed from: d */
    public final Map<String, mpr0> f150889d;

    public p6z0(n8y0 n8y0Var) {
        super("require");
        this.f150889d = new HashMap();
        this.f150888c = n8y0Var;
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        tqw0.m192373g("require", 1, list);
        String strZzf = gix0Var.m130395c(list.get(0)).zzf();
        if (this.f150889d.containsKey(strZzf)) {
            return this.f150889d.get(strZzf);
        }
        ewr0 ewr0VarM161947a = this.f150888c.m161947a(strZzf);
        if (ewr0VarM161947a instanceof mpr0) {
            this.f150889d.put(strZzf, (mpr0) ewr0VarM161947a);
        }
        return ewr0VarM161947a;
    }
}
