package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class k8s0 {

    /* JADX INFO: renamed from: a */
    public final String[] f121850a;

    /* JADX INFO: renamed from: b */
    public final double[] f121851b;

    /* JADX INFO: renamed from: c */
    public final double[] f121852c;

    /* JADX INFO: renamed from: d */
    public final int[] f121853d;

    /* JADX INFO: renamed from: e */
    public int f121854e;

    public /* synthetic */ k8s0(c6s0 c6s0Var, d7s0 d7s0Var) {
        int size = c6s0Var.f79567b.size();
        this.f121850a = (String[]) c6s0Var.f79566a.toArray(new String[size]);
        this.f121851b = m144969c(c6s0Var.f79567b);
        this.f121852c = m144969c(c6s0Var.f79568c);
        this.f121853d = new int[size];
        this.f121854e = 0;
    }

    /* JADX INFO: renamed from: c */
    public static final double[] m144969c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: a */
    public final List m144970a() {
        ArrayList arrayList = new ArrayList(this.f121850a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f121850a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double[] dArr = this.f121852c;
            double[] dArr2 = this.f121851b;
            int[] iArr = this.f121853d;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new h5s0(str, d, d2, ((double) i2) / ((double) this.f121854e), i2));
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m144971b(double d) {
        this.f121854e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f121852c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.f121851b[i]) {
                int[] iArr = this.f121853d;
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
