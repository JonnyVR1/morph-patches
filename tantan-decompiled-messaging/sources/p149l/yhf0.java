package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class yhf0 extends ydk {

    /* JADX INFO: renamed from: a */
    private List<ts2> f198339a;

    /* JADX INFO: renamed from: b */
    private List<e3w> f198340b = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public yhf0(List<ts2> list) {
        this.f198339a = list;
        if (list.size() > 0) {
            ts2 ts2Var = list.get(0);
            ts2 ts2Var2 = list.get(list.size() - 1);
            registerInitialFilter(ts2Var);
            ts2 ts2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                ts2 ts2Var4 = list.get(i);
                ts2Var4.getTargets().clear();
                if (ts2Var3 != null) {
                    ts2Var3.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(ts2Var4);
                }
                ts2Var3 = list.get(i);
                if (ts2Var4 instanceof e3w) {
                    this.f198340b.add((e3w) ts2Var4);
                }
            }
            ts2Var2.addTarget(this);
            registerTerminalFilter(ts2Var2);
        }
    }

    public synchronized void setIntensity(float f) {
        List<e3w> list = this.f198340b;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.f198340b.size(); i++) {
                this.f198340b.get(i).setIntensity(f);
            }
        }
    }
}
