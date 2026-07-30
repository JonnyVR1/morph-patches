package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ifs0 {

    /* JADX INFO: renamed from: a */
    public final List f114687a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f114688b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f114689c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ifs0 m139747a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f114687a.size()) {
            double dDoubleValue = ((Double) this.f114689c.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) this.f114688b.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        this.f114687a.add(i, str);
        this.f114689c.add(i, Double.valueOf(d));
        this.f114688b.add(i, Double.valueOf(d2));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final qhs0 m139748b() {
        return new qhs0(this, null);
    }
}
