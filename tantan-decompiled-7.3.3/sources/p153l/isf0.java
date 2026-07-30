package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class isf0 {

    /* JADX INFO: renamed from: h */
    public static final Comparator<C17790b> f116646h = new Comparator() { // from class: l.gsf0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return isf0.m141871a((isf0.C17790b) obj, (isf0.C17790b) obj2);
        }
    };

    /* JADX INFO: renamed from: i */
    public static final Comparator<C17790b> f116647i = new Comparator() { // from class: l.hsf0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((isf0.C17790b) obj).f116657c, ((isf0.C17790b) obj2).f116657c);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f116648a;

    /* JADX INFO: renamed from: e */
    public int f116652e;

    /* JADX INFO: renamed from: f */
    public int f116653f;

    /* JADX INFO: renamed from: g */
    public int f116654g;

    /* JADX INFO: renamed from: c */
    public final C17790b[] f116650c = new C17790b[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList<C17790b> f116649b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public int f116651d = -1;

    /* JADX INFO: renamed from: l.isf0$b */
    public static class C17790b {

        /* JADX INFO: renamed from: a */
        public int f116655a;

        /* JADX INFO: renamed from: b */
        public int f116656b;

        /* JADX INFO: renamed from: c */
        public float f116657c;

        public C17790b() {
        }
    }

    public isf0(int i) {
        this.f116648a = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m141871a(C17790b c17790b, C17790b c17790b2) {
        return c17790b.f116655a - c17790b2.f116655a;
    }

    /* JADX INFO: renamed from: c */
    public void m141873c(int i, float f) {
        C17790b c17790b;
        m141874d();
        int i2 = this.f116654g;
        if (i2 > 0) {
            C17790b[] c17790bArr = this.f116650c;
            int i3 = i2 - 1;
            this.f116654g = i3;
            c17790b = c17790bArr[i3];
        } else {
            c17790b = new C17790b();
        }
        int i4 = this.f116652e;
        this.f116652e = i4 + 1;
        c17790b.f116655a = i4;
        c17790b.f116656b = i;
        c17790b.f116657c = f;
        this.f116649b.add(c17790b);
        this.f116653f += i;
        while (true) {
            int i5 = this.f116653f;
            int i6 = this.f116648a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C17790b c17790b2 = this.f116649b.get(0);
            int i8 = c17790b2.f116656b;
            if (i8 <= i7) {
                this.f116653f -= i8;
                this.f116649b.remove(0);
                int i9 = this.f116654g;
                if (i9 < 5) {
                    C17790b[] c17790bArr2 = this.f116650c;
                    this.f116654g = i9 + 1;
                    c17790bArr2[i9] = c17790b2;
                }
            } else {
                c17790b2.f116656b = i8 - i7;
                this.f116653f -= i7;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m141874d() {
        if (this.f116651d != 1) {
            Collections.sort(this.f116649b, f116646h);
            this.f116651d = 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m141875e() {
        if (this.f116651d != 0) {
            Collections.sort(this.f116649b, f116647i);
            this.f116651d = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public float m141876f(float f) {
        m141875e();
        float f2 = f * this.f116653f;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.f116649b.size();
            ArrayList<C17790b> arrayList = this.f116649b;
            if (i >= size) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                ArrayList<C17790b> arrayList2 = this.f116649b;
                return arrayList2.get(arrayList2.size() - 1).f116657c;
            }
            C17790b c17790b = arrayList.get(i);
            i2 += c17790b.f116656b;
            if (i2 >= f2) {
                return c17790b.f116657c;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m141877g() {
        this.f116649b.clear();
        this.f116651d = -1;
        this.f116652e = 0;
        this.f116653f = 0;
    }
}
