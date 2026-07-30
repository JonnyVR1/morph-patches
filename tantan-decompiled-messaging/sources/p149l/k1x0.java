package p149l;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class k1x0 {

    /* JADX INFO: renamed from: a */
    public ArrayList f120665a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public h1x0 f120666b = h1x0.f105474b;

    /* JADX INFO: renamed from: c */
    public Integer f120667c = null;

    /* JADX INFO: renamed from: a */
    public final k1x0 m144236a(tnw0 tnw0Var, int i, String str, String str2) {
        ArrayList arrayList = this.f120665a;
        if (arrayList != null) {
            arrayList.add(new q1x0(tnw0Var, i, str, str2, null));
            return this;
        }
        qkq0.m175383a("addEntry cannot be called after build()");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final k1x0 m144237b(h1x0 h1x0Var) {
        if (this.f120665a != null) {
            this.f120666b = h1x0Var;
            return this;
        }
        qkq0.m175383a("setAnnotations cannot be called after build()");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final k1x0 m144238c(int i) {
        if (this.f120665a != null) {
            this.f120667c = Integer.valueOf(i);
            return this;
        }
        qkq0.m175383a("setPrimaryKeyId cannot be called after build()");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final s1x0 m144239d() throws GeneralSecurityException {
        if (this.f120665a == null) {
            qkq0.m175383a("cannot call build() twice");
            return null;
        }
        Integer num = this.f120667c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f120665a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int iM172418a = ((q1x0) arrayList.get(i)).m172418a();
                i++;
                if (iM172418a == iIntValue) {
                }
            }
            j8w0.m140474a("primary key ID is not present in entries");
            return null;
        }
        s1x0 s1x0Var = new s1x0(this.f120666b, Collections.unmodifiableList(this.f120665a), this.f120667c, null);
        this.f120665a = null;
        return s1x0Var;
    }
}
