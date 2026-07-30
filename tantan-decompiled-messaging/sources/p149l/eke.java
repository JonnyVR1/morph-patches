package p149l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eke {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final n4l0 f91967a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private final List<us2> f91968b;

    public eke() {
        ArrayList arrayList = new ArrayList();
        this.f91968b = arrayList;
        this.f91967a = new n4l0(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m116956a(us2 us2Var) {
        us2 us2Var2;
        List<us2> listM102036Z = this.f91967a.m102036Z();
        if (listM102036Z == null || listM102036Z.size() <= 0 || (us2Var2 = listM102036Z.get(listM102036Z.size() - 1)) == null || !us2Var2.equals(us2Var)) {
            this.f91967a.m102034W(us2Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m116957b(us2 us2Var) {
        us2 us2Var2;
        List<us2> listM102036Z = this.f91967a.m102036Z();
        if ((listM102036Z == null || listM102036Z.size() <= 0 || (us2Var2 = listM102036Z.get(0)) == null || !us2Var2.equals(us2Var)) && us2Var != null) {
            this.f91967a.m102035X(us2Var);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public n4l0 m116958c() {
        return this.f91967a;
    }
}
