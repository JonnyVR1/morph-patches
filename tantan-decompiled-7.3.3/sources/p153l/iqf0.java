package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class iqf0 extends pgk {

    /* JADX INFO: renamed from: H */
    private List<kt2> f116410H;

    /* JADX INFO: renamed from: I */
    private List<d5w> f116411I = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public iqf0(List<kt2> list) {
        this.f116410H = list;
        if (list.size() > 0) {
            kt2 kt2Var = list.get(0);
            kt2 kt2Var2 = list.get(list.size() - 1);
            m172256R(kt2Var);
            kt2 kt2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                kt2 kt2Var4 = list.get(i);
                kt2Var4.m134801J().clear();
                if (kt2Var3 != null) {
                    kt2Var3.m134795C(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    m172255Q(kt2Var4);
                }
                kt2Var3 = list.get(i);
                if (kt2Var4 instanceof d5w) {
                    this.f116411I.add((d5w) kt2Var4);
                }
            }
            kt2Var2.m134795C(this);
            m172257S(kt2Var2);
        }
    }
}
