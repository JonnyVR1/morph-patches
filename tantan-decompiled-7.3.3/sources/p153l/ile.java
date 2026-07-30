package p153l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ile {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final rdl0 f115573a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private final List<kt2> f115574b;

    public ile() {
        ArrayList arrayList = new ArrayList();
        this.f115574b = arrayList;
        this.f115573a = new rdl0(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m140621a(kt2 kt2Var) {
        kt2 kt2Var2;
        List<kt2> listM150862Z = this.f115573a.m150862Z();
        if (listM150862Z == null || listM150862Z.size() <= 0 || (kt2Var2 = listM150862Z.get(listM150862Z.size() - 1)) == null || !kt2Var2.equals(kt2Var)) {
            this.f115573a.m150860W(kt2Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m140622b(kt2 kt2Var) {
        kt2 kt2Var2;
        List<kt2> listM150862Z = this.f115573a.m150862Z();
        if ((listM150862Z == null || listM150862Z.size() <= 0 || (kt2Var2 = listM150862Z.get(0)) == null || !kt2Var2.equals(kt2Var)) && kt2Var != null) {
            this.f115573a.m150861X(kt2Var);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public rdl0 m140623c() {
        return this.f115573a;
    }
}
