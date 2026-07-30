package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qhs0 {

    /* JADX INFO: renamed from: a */
    public final String[] f157750a;

    /* JADX INFO: renamed from: b */
    public final double[] f157751b;

    /* JADX INFO: renamed from: c */
    public final double[] f157752c;

    /* JADX INFO: renamed from: d */
    public final int[] f157753d;

    /* JADX INFO: renamed from: e */
    public int f157754e;

    public /* synthetic */ qhs0(ifs0 ifs0Var, jgs0 jgs0Var) {
        int size = ifs0Var.f114688b.size();
        this.f157750a = (String[]) ifs0Var.f114687a.toArray(new String[size]);
        this.f157751b = m176613c(ifs0Var.f114688b);
        this.f157752c = m176613c(ifs0Var.f114689c);
        this.f157753d = new int[size];
        this.f157754e = 0;
    }

    /* JADX INFO: renamed from: c */
    public static final double[] m176613c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: a */
    public final List m176614a() {
        ArrayList arrayList = new ArrayList(this.f157750a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f157750a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double[] dArr = this.f157752c;
            double[] dArr2 = this.f157751b;
            int[] iArr = this.f157753d;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new nes0(str, d, d2, ((double) i2) / ((double) this.f157754e), i2));
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m176615b(double d) {
        this.f157754e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f157752c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.f157751b[i]) {
                int[] iArr = this.f157753d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }
}
