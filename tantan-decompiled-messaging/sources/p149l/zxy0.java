package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class zxy0 {

    /* JADX INFO: renamed from: g */
    public static final Comparator f205572g = new Comparator() { // from class: l.vxy0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((yxy0) obj).f200680a - ((yxy0) obj2).f200680a;
        }
    };

    /* JADX INFO: renamed from: h */
    public static final Comparator f205573h = new Comparator() { // from class: l.wxy0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((yxy0) obj).f200682c, ((yxy0) obj2).f200682c);
        }
    };

    /* JADX INFO: renamed from: d */
    public int f205577d;

    /* JADX INFO: renamed from: e */
    public int f205578e;

    /* JADX INFO: renamed from: f */
    public int f205579f;

    /* JADX INFO: renamed from: b */
    public final yxy0[] f205575b = new yxy0[5];

    /* JADX INFO: renamed from: a */
    public final ArrayList f205574a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f205576c = -1;

    public zxy0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final float m220855a(float f) {
        int i = 0;
        if (this.f205576c != 0) {
            Collections.sort(this.f205574a, f205573h);
            this.f205576c = 0;
        }
        float f2 = this.f205578e;
        int i2 = 0;
        while (true) {
            int size = this.f205574a.size();
            ArrayList arrayList = this.f205574a;
            if (i >= size) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                ArrayList arrayList2 = this.f205574a;
                return ((yxy0) arrayList2.get(arrayList2.size() - 1)).f200682c;
            }
            float f3 = 0.5f * f2;
            yxy0 yxy0Var = (yxy0) arrayList.get(i);
            i2 += yxy0Var.f200681b;
            if (i2 >= f3) {
                return yxy0Var.f200682c;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m220856b(int i, float f) {
        yxy0 yxy0Var;
        if (this.f205576c != 1) {
            Collections.sort(this.f205574a, f205572g);
            this.f205576c = 1;
        }
        int i2 = this.f205579f;
        if (i2 > 0) {
            yxy0[] yxy0VarArr = this.f205575b;
            int i3 = i2 - 1;
            this.f205579f = i3;
            yxy0Var = yxy0VarArr[i3];
        } else {
            yxy0Var = new yxy0(null);
        }
        int i4 = this.f205577d;
        this.f205577d = i4 + 1;
        yxy0Var.f200680a = i4;
        yxy0Var.f200681b = i;
        yxy0Var.f200682c = f;
        this.f205574a.add(yxy0Var);
        this.f205578e += i;
        while (true) {
            int i5 = this.f205578e;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            yxy0 yxy0Var2 = (yxy0) this.f205574a.get(0);
            int i7 = yxy0Var2.f200681b;
            if (i7 <= i6) {
                this.f205578e -= i7;
                this.f205574a.remove(0);
                int i8 = this.f205579f;
                if (i8 < 5) {
                    yxy0[] yxy0VarArr2 = this.f205575b;
                    this.f205579f = i8 + 1;
                    yxy0VarArr2[i8] = yxy0Var2;
                }
            } else {
                yxy0Var2.f200681b = i7 - i6;
                this.f205578e -= i6;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m220857c() {
        this.f205574a.clear();
        this.f205576c = -1;
        this.f205577d = 0;
        this.f205578e = 0;
    }
}
