package p153l;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class qax0 {

    /* JADX INFO: renamed from: a */
    public ArrayList f156436a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public nax0 f156437b = nax0.f141057b;

    /* JADX INFO: renamed from: c */
    public Integer f156438c = null;

    /* JADX INFO: renamed from: a */
    public final qax0 m176000a(zww0 zww0Var, int i, String str, String str2) {
        ArrayList arrayList = this.f156436a;
        if (arrayList != null) {
            arrayList.add(new wax0(zww0Var, i, str, str2, null));
            return this;
        }
        wtq0.m207906a("addEntry cannot be called after build()");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final qax0 m176001b(nax0 nax0Var) {
        if (this.f156436a != null) {
            this.f156437b = nax0Var;
            return this;
        }
        wtq0.m207906a("setAnnotations cannot be called after build()");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final qax0 m176002c(int i) {
        if (this.f156436a != null) {
            this.f156438c = Integer.valueOf(i);
            return this;
        }
        wtq0.m207906a("setPrimaryKeyId cannot be called after build()");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final yax0 m176003d() throws GeneralSecurityException {
        if (this.f156436a == null) {
            wtq0.m207906a("cannot call build() twice");
            return null;
        }
        Integer num = this.f156438c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f156436a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int iM205688a = ((wax0) arrayList.get(i)).m205688a();
                i++;
                if (iM205688a == iIntValue) {
                }
            }
            phw0.m172339a("primary key ID is not present in entries");
            return null;
        }
        yax0 yax0Var = new yax0(this.f156437b, Collections.unmodifiableList(this.f156436a), this.f156438c, null);
        this.f156436a = null;
        return yax0Var;
    }
}
