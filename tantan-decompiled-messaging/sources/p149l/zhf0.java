package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class zhf0 extends zdk {

    /* JADX INFO: renamed from: H */
    private List<us2> f203166H;

    /* JADX INFO: renamed from: I */
    private List<f3w> f203167I = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public zhf0(List<us2> list) {
        this.f203166H = list;
        if (list.size() > 0) {
            us2 us2Var = list.get(0);
            us2 us2Var2 = list.get(list.size() - 1);
            m218168R(us2Var);
            us2 us2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                us2 us2Var4 = list.get(i);
                us2Var4.m158948J().clear();
                if (us2Var3 != null) {
                    us2Var3.m158945C(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    m218167Q(us2Var4);
                }
                us2Var3 = list.get(i);
                if (us2Var4 instanceof f3w) {
                    this.f203167I.add((f3w) us2Var4);
                }
            }
            us2Var2.m158945C(this);
            m218169S(us2Var2);
        }
    }
}
