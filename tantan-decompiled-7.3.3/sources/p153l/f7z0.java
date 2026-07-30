package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class f7z0 {

    /* JADX INFO: renamed from: g */
    public static final Comparator f97683g = new Comparator() { // from class: l.b7z0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((e7z0) obj).f92489a - ((e7z0) obj2).f92489a;
        }
    };

    /* JADX INFO: renamed from: h */
    public static final Comparator f97684h = new Comparator() { // from class: l.c7z0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((e7z0) obj).f92491c, ((e7z0) obj2).f92491c);
        }
    };

    /* JADX INFO: renamed from: d */
    public int f97688d;

    /* JADX INFO: renamed from: e */
    public int f97689e;

    /* JADX INFO: renamed from: f */
    public int f97690f;

    /* JADX INFO: renamed from: b */
    public final e7z0[] f97686b = new e7z0[5];

    /* JADX INFO: renamed from: a */
    public final ArrayList f97685a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f97687c = -1;

    public f7z0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final float m124508a(float f) {
        int i = 0;
        if (this.f97687c != 0) {
            Collections.sort(this.f97685a, f97684h);
            this.f97687c = 0;
        }
        float f2 = this.f97689e;
        int i2 = 0;
        while (true) {
            int size = this.f97685a.size();
            ArrayList arrayList = this.f97685a;
            if (i >= size) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                ArrayList arrayList2 = this.f97685a;
                return ((e7z0) arrayList2.get(arrayList2.size() - 1)).f92491c;
            }
            float f3 = 0.5f * f2;
            e7z0 e7z0Var = (e7z0) arrayList.get(i);
            i2 += e7z0Var.f92490b;
            if (i2 >= f3) {
                return e7z0Var.f92491c;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m124509b(int i, float f) {
        e7z0 e7z0Var;
        if (this.f97687c != 1) {
            Collections.sort(this.f97685a, f97683g);
            this.f97687c = 1;
        }
        int i2 = this.f97690f;
        if (i2 > 0) {
            e7z0[] e7z0VarArr = this.f97686b;
            int i3 = i2 - 1;
            this.f97690f = i3;
            e7z0Var = e7z0VarArr[i3];
        } else {
            e7z0Var = new e7z0(null);
        }
        int i4 = this.f97688d;
        this.f97688d = i4 + 1;
        e7z0Var.f92489a = i4;
        e7z0Var.f92490b = i;
        e7z0Var.f92491c = f;
        this.f97685a.add(e7z0Var);
        this.f97689e += i;
        while (true) {
            int i5 = this.f97689e;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            e7z0 e7z0Var2 = (e7z0) this.f97685a.get(0);
            int i7 = e7z0Var2.f92490b;
            if (i7 <= i6) {
                this.f97689e -= i7;
                this.f97685a.remove(0);
                int i8 = this.f97690f;
                if (i8 < 5) {
                    e7z0[] e7z0VarArr2 = this.f97686b;
                    this.f97690f = i8 + 1;
                    e7z0VarArr2[i8] = e7z0Var2;
                }
            } else {
                e7z0Var2.f92490b = i7 - i6;
                this.f97689e -= i6;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m124510c() {
        this.f97685a.clear();
        this.f97687c = -1;
        this.f97688d = 0;
        this.f97689e = 0;
    }
}
