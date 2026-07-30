package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class hqf0 extends ogk {

    /* JADX INFO: renamed from: a */
    private List<jt2> f111123a;

    /* JADX INFO: renamed from: b */
    private List<c5w> f111124b = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public hqf0(List<jt2> list) {
        this.f111123a = list;
        if (list.size() > 0) {
            jt2 jt2Var = list.get(0);
            jt2 jt2Var2 = list.get(list.size() - 1);
            registerInitialFilter(jt2Var);
            jt2 jt2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                jt2 jt2Var4 = list.get(i);
                jt2Var4.getTargets().clear();
                if (jt2Var3 != null) {
                    jt2Var3.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(jt2Var4);
                }
                jt2Var3 = list.get(i);
                if (jt2Var4 instanceof c5w) {
                    this.f111124b.add((c5w) jt2Var4);
                }
            }
            jt2Var2.addTarget(this);
            registerTerminalFilter(jt2Var2);
        }
    }

    public synchronized void setIntensity(float f) {
        List<c5w> list = this.f111124b;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.f111124b.size(); i++) {
                this.f111124b.get(i).setIntensity(f);
            }
        }
    }
}
