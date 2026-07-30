package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c6s0 {

    /* JADX INFO: renamed from: a */
    public final List f79566a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f79567b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f79568c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final c6s0 m105506a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f79566a.size()) {
            double dDoubleValue = ((Double) this.f79568c.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) this.f79567b.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        this.f79566a.add(i, str);
        this.f79568c.add(i, Double.valueOf(d));
        this.f79567b.add(i, Double.valueOf(d2));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final k8s0 m105507b() {
        return new k8s0(this, null);
    }
}
