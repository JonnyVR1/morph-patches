package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class zjf0 {

    /* JADX INFO: renamed from: h */
    public static final Comparator<C21715b> f203402h = new Comparator() { // from class: l.xjf0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zjf0.m219088a((zjf0.C21715b) obj, (zjf0.C21715b) obj2);
        }
    };

    /* JADX INFO: renamed from: i */
    public static final Comparator<C21715b> f203403i = new Comparator() { // from class: l.yjf0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zjf0.C21715b) obj).f203413c, ((zjf0.C21715b) obj2).f203413c);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f203404a;

    /* JADX INFO: renamed from: e */
    public int f203408e;

    /* JADX INFO: renamed from: f */
    public int f203409f;

    /* JADX INFO: renamed from: g */
    public int f203410g;

    /* JADX INFO: renamed from: c */
    public final C21715b[] f203406c = new C21715b[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList<C21715b> f203405b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public int f203407d = -1;

    /* JADX INFO: renamed from: l.zjf0$b */
    public static class C21715b {

        /* JADX INFO: renamed from: a */
        public int f203411a;

        /* JADX INFO: renamed from: b */
        public int f203412b;

        /* JADX INFO: renamed from: c */
        public float f203413c;

        public C21715b() {
        }
    }

    public zjf0(int i) {
        this.f203404a = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m219088a(C21715b c21715b, C21715b c21715b2) {
        return c21715b.f203411a - c21715b2.f203411a;
    }

    /* JADX INFO: renamed from: c */
    public void m219090c(int i, float f) {
        C21715b c21715b;
        m219091d();
        int i2 = this.f203410g;
        if (i2 > 0) {
            C21715b[] c21715bArr = this.f203406c;
            int i3 = i2 - 1;
            this.f203410g = i3;
            c21715b = c21715bArr[i3];
        } else {
            c21715b = new C21715b();
        }
        int i4 = this.f203408e;
        this.f203408e = i4 + 1;
        c21715b.f203411a = i4;
        c21715b.f203412b = i;
        c21715b.f203413c = f;
        this.f203405b.add(c21715b);
        this.f203409f += i;
        while (true) {
            int i5 = this.f203409f;
            int i6 = this.f203404a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C21715b c21715b2 = this.f203405b.get(0);
            int i8 = c21715b2.f203412b;
            if (i8 <= i7) {
                this.f203409f -= i8;
                this.f203405b.remove(0);
                int i9 = this.f203410g;
                if (i9 < 5) {
                    C21715b[] c21715bArr2 = this.f203406c;
                    this.f203410g = i9 + 1;
                    c21715bArr2[i9] = c21715b2;
                }
            } else {
                c21715b2.f203412b = i8 - i7;
                this.f203409f -= i7;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m219091d() {
        if (this.f203407d != 1) {
            Collections.sort(this.f203405b, f203402h);
            this.f203407d = 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m219092e() {
        if (this.f203407d != 0) {
            Collections.sort(this.f203405b, f203403i);
            this.f203407d = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public float m219093f(float f) {
        m219092e();
        float f2 = f * this.f203409f;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.f203405b.size();
            ArrayList<C21715b> arrayList = this.f203405b;
            if (i >= size) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                ArrayList<C21715b> arrayList2 = this.f203405b;
                return arrayList2.get(arrayList2.size() - 1).f203413c;
            }
            C21715b c21715b = arrayList.get(i);
            i2 += c21715b.f203412b;
            if (i2 >= f2) {
                return c21715b.f203413c;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m219094g() {
        this.f203405b.clear();
        this.f203407d = -1;
        this.f203408e = 0;
        this.f203409f = 0;
    }
}
