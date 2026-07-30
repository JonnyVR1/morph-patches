package p153l;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jju0 implements nzt0 {

    /* JADX INFO: renamed from: a */
    public final Map f121242a;

    /* JADX INFO: renamed from: b */
    public final Map f121243b;

    /* JADX INFO: renamed from: c */
    public final Map f121244c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f121245d;

    /* JADX INFO: renamed from: e */
    public final fmu0 f121246e;

    public jju0(Map map, Map map2, Map map3, kqx0 kqx0Var, fmu0 fmu0Var) {
        this.f121242a = map;
        this.f121243b = map2;
        this.f121244c = map3;
        this.f121245d = kqx0Var;
        this.f121246e = fmu0Var;
    }

    @Override // p153l.nzt0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final pcv0 mo145142d(int i, String str) {
        pcv0 pcv0VarMo145142d;
        pcv0 pcv0Var = (pcv0) this.f121242a.get(str);
        if (pcv0Var != null) {
            return pcv0Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            tfv0 tfv0Var = (tfv0) this.f121244c.get(str);
            if (tfv0Var != null) {
                return new qcv0(tfv0Var, new eow0() { // from class: l.pzt0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        return new szt0((List) obj);
                    }
                });
            }
            pcv0VarMo145142d = (pcv0) this.f121243b.get(str);
            if (pcv0VarMo145142d == null) {
                return null;
            }
        } else if (this.f121246e.m126329e() == null || (pcv0VarMo145142d = ((nzt0) this.f121245d.zzb()).mo145142d(i, str)) == null) {
            return null;
        }
        return new qcv0(pcv0VarMo145142d, new eow0() { // from class: l.qzt0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return new szt0((kzt0) obj);
            }
        });
    }
}
