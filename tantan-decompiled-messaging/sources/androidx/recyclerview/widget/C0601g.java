package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p149l.dnr;
import p149l.ft2;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C0601g {

    /* JADX INFO: renamed from: a */
    public static final Comparator<d> f2762a = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f2765a - dVar2.f2765a;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo3645a(int i, int i2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo3646b(int i, int i2);

        @Nullable
        /* JADX INFO: renamed from: c */
        public Object mo3647c(int i, int i2) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo3648d();

        /* JADX INFO: renamed from: e */
        public abstract int mo3649e();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int[] f2763a;

        /* JADX INFO: renamed from: b */
        public final int f2764b;

        public c(int i) {
            int[] iArr = new int[i];
            this.f2763a = iArr;
            this.f2764b = iArr.length / 2;
        }

        /* JADX INFO: renamed from: a */
        public int[] m3685a() {
            return this.f2763a;
        }

        /* JADX INFO: renamed from: b */
        public int m3686b(int i) {
            return this.f2763a[i + this.f2764b];
        }

        /* JADX INFO: renamed from: c */
        public void m3687c(int i, int i2) {
            this.f2763a[i + this.f2764b] = i2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int f2765a;

        /* JADX INFO: renamed from: b */
        public final int f2766b;

        /* JADX INFO: renamed from: c */
        public final int f2767c;

        public d(int i, int i2, int i3) {
            this.f2765a = i;
            this.f2766b = i2;
            this.f2767c = i3;
        }

        /* JADX INFO: renamed from: a */
        public int m3688a() {
            return this.f2765a + this.f2767c;
        }

        /* JADX INFO: renamed from: b */
        public int m3689b() {
            return this.f2766b + this.f2767c;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final List<d> f2768a;

        /* JADX INFO: renamed from: b */
        public final int[] f2769b;

        /* JADX INFO: renamed from: c */
        public final int[] f2770c;

        /* JADX INFO: renamed from: d */
        public final b f2771d;

        /* JADX INFO: renamed from: e */
        public final int f2772e;

        /* JADX INFO: renamed from: f */
        public final int f2773f;

        /* JADX INFO: renamed from: g */
        public final boolean f2774g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f2768a = list;
            this.f2769b = iArr;
            this.f2770c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f2771d = bVar;
            this.f2772e = bVar.mo3649e();
            this.f2773f = bVar.mo3648d();
            this.f2774g = z;
            m3691a();
            m3695e();
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static g m3690g(Collection<g> collection, int i, boolean z) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f2775a == i && next.f2777c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z) {
                    next2.f2776b--;
                } else {
                    next2.f2776b++;
                }
            }
            return next;
        }

        /* JADX INFO: renamed from: a */
        public final void m3691a() {
            d dVar = this.f2768a.isEmpty() ? null : this.f2768a.get(0);
            if (dVar == null || dVar.f2765a != 0 || dVar.f2766b != 0) {
                this.f2768a.add(0, new d(0, 0, 0));
            }
            this.f2768a.add(new d(this.f2772e, this.f2773f, 0));
        }

        /* JADX INFO: renamed from: b */
        public void m3692b(@NonNull RecyclerView.Adapter adapter) {
            m3693c(new C0596b(adapter));
        }

        /* JADX INFO: renamed from: c */
        public void m3693c(@NonNull dnr dnrVar) {
            int i;
            ft2 ft2Var = dnrVar instanceof ft2 ? (ft2) dnrVar : new ft2(dnrVar);
            int i2 = this.f2772e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f2772e;
            int i4 = this.f2773f;
            for (int size = this.f2768a.size() - 1; size >= 0; size--) {
                d dVar = this.f2768a.get(size);
                int iM3688a = dVar.m3688a();
                int iM3689b = dVar.m3689b();
                while (true) {
                    if (i3 <= iM3688a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f2769b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        g gVarM3690g = m3690g(arrayDeque, i6, false);
                        if (gVarM3690g != null) {
                            int i7 = (i2 - gVarM3690g.f2776b) - 1;
                            ft2Var.mo3634d(i3, i7);
                            if ((i5 & 4) != 0) {
                                ft2Var.mo3631a(i7, 1, this.f2771d.mo3647c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        ft2Var.mo3633c(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iM3689b) {
                    i4--;
                    int i8 = this.f2770c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g gVarM3690g2 = m3690g(arrayDeque, i9, true);
                        if (gVarM3690g2 == null) {
                            arrayDeque.add(new g(i4, i2 - i3, false));
                        } else {
                            ft2Var.mo3634d((i2 - gVarM3690g2.f2776b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                ft2Var.mo3631a(i3, 1, this.f2771d.mo3647c(i9, i4));
                            }
                        }
                    } else {
                        ft2Var.mo3632b(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f2765a;
                int i11 = dVar.f2766b;
                for (i = 0; i < dVar.f2767c; i++) {
                    if ((this.f2769b[i10] & 15) == 2) {
                        ft2Var.mo3631a(i10, 1, this.f2771d.mo3647c(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f2765a;
                i4 = dVar.f2766b;
            }
            ft2Var.m123006e();
        }

        /* JADX INFO: renamed from: d */
        public final void m3694d(int i) {
            int size = this.f2768a.size();
            int iM3689b = 0;
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.f2768a.get(i2);
                while (iM3689b < dVar.f2766b) {
                    if (this.f2770c[iM3689b] == 0 && this.f2771d.mo3646b(i, iM3689b)) {
                        int i3 = this.f2771d.mo3645a(i, iM3689b) ? 8 : 4;
                        this.f2769b[i] = (iM3689b << 4) | i3;
                        this.f2770c[iM3689b] = (i << 4) | i3;
                        return;
                    }
                    iM3689b++;
                }
                iM3689b = dVar.m3689b();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m3695e() {
            for (d dVar : this.f2768a) {
                for (int i = 0; i < dVar.f2767c; i++) {
                    int i2 = dVar.f2765a + i;
                    int i3 = dVar.f2766b + i;
                    int i4 = this.f2771d.mo3645a(i2, i3) ? 1 : 2;
                    this.f2769b[i2] = (i3 << 4) | i4;
                    this.f2770c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f2774g) {
                m3696f();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m3696f() {
            int iM3688a = 0;
            for (d dVar : this.f2768a) {
                while (iM3688a < dVar.f2765a) {
                    if (this.f2769b[iM3688a] == 0) {
                        m3694d(iM3688a);
                    }
                    iM3688a++;
                }
                iM3688a = dVar.m3688a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$f */
    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public int f2775a;

        /* JADX INFO: renamed from: b */
        public int f2776b;

        /* JADX INFO: renamed from: c */
        public boolean f2777c;

        public g(int i, int i2, boolean z) {
            this.f2775a = i;
            this.f2776b = i2;
            this.f2777c = z;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public int f2782a;

        /* JADX INFO: renamed from: b */
        public int f2783b;

        /* JADX INFO: renamed from: c */
        public int f2784c;

        /* JADX INFO: renamed from: d */
        public int f2785d;

        /* JADX INFO: renamed from: e */
        public boolean f2786e;

        /* JADX INFO: renamed from: a */
        public int m3699a() {
            return Math.min(this.f2784c - this.f2782a, this.f2785d - this.f2783b);
        }

        /* JADX INFO: renamed from: b */
        public boolean m3700b() {
            return this.f2785d - this.f2783b != this.f2784c - this.f2782a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m3701c() {
            return this.f2785d - this.f2783b > this.f2784c - this.f2782a;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public d m3702d() {
            if (!m3700b()) {
                int i = this.f2782a;
                return new d(i, this.f2783b, this.f2784c - i);
            }
            if (this.f2786e) {
                return new d(this.f2782a, this.f2783b, m3699a());
            }
            boolean zM3701c = m3701c();
            int i2 = this.f2782a;
            return zM3701c ? new d(i2, this.f2783b + 1, m3699a()) : new d(i2 + 1, this.f2783b, m3699a());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static i m3679a(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int iM3686b;
        int i3;
        int i4;
        boolean z = (hVar.m3698b() - hVar.m3697a()) % 2 == 0;
        int iM3698b = hVar.m3698b() - hVar.m3697a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar2.m3686b(i6 + 1) < cVar2.m3686b(i6 - 1))) {
                iM3686b = cVar2.m3686b(i6 + 1);
                i3 = iM3686b;
            } else {
                iM3686b = cVar2.m3686b(i6 - 1);
                i3 = iM3686b - 1;
            }
            int i7 = hVar.f2781d - ((hVar.f2779b - i3) - i6);
            int i8 = (i2 == 0 || i3 != iM3686b) ? i7 : i7 + 1;
            while (i3 > hVar.f2778a && i7 > hVar.f2780c && bVar.mo3646b(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            cVar2.m3687c(i6, i3);
            if (z && (i4 = iM3698b - i6) >= i5 && i4 <= i2 && cVar.m3686b(i4) >= i3) {
                i iVar = new i();
                iVar.f2782a = i3;
                iVar.f2783b = i7;
                iVar.f2784c = iM3686b;
                iVar.f2785d = i8;
                iVar.f2786e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static e m3680b(@NonNull b bVar) {
        return m3681c(bVar, true);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static e m3681c(@NonNull b bVar, boolean z) {
        int iMo3649e = bVar.mo3649e();
        int iMo3648d = bVar.mo3648d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iMo3649e, 0, iMo3648d));
        int i2 = ((((iMo3649e + iMo3648d) + 1) / 2) * 2) + 1;
        c cVar = new c(i2);
        c cVar2 = new c(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarM3683e = m3683e(hVar, bVar, cVar, cVar2);
            if (iVarM3683e != null) {
                if (iVarM3683e.m3699a() > 0) {
                    arrayList.add(iVarM3683e.m3702d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f2778a = hVar.f2778a;
                hVar2.f2780c = hVar.f2780c;
                hVar2.f2779b = iVarM3683e.f2782a;
                hVar2.f2781d = iVarM3683e.f2783b;
                arrayList2.add(hVar2);
                hVar.f2779b = hVar.f2779b;
                hVar.f2781d = hVar.f2781d;
                hVar.f2778a = iVarM3683e.f2784c;
                hVar.f2780c = iVarM3683e.f2785d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f2762a);
        return new e(bVar, arrayList, cVar.m3685a(), cVar2.m3685a(), z);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static i m3682d(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int iM3686b;
        int i3;
        int i4;
        boolean z = Math.abs(hVar.m3698b() - hVar.m3697a()) % 2 == 1;
        int iM3698b = hVar.m3698b() - hVar.m3697a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar.m3686b(i6 + 1) > cVar.m3686b(i6 - 1))) {
                iM3686b = cVar.m3686b(i6 + 1);
                i3 = iM3686b;
            } else {
                iM3686b = cVar.m3686b(i6 - 1);
                i3 = iM3686b + 1;
            }
            int i7 = (hVar.f2780c + (i3 - hVar.f2778a)) - i6;
            int i8 = (i2 == 0 || i3 != iM3686b) ? i7 : i7 - 1;
            while (i3 < hVar.f2779b && i7 < hVar.f2781d && bVar.mo3646b(i3, i7)) {
                i3++;
                i7++;
            }
            cVar.m3687c(i6, i3);
            if (z && (i4 = iM3698b - i6) >= i5 + 1 && i4 <= i2 - 1 && cVar2.m3686b(i4) <= i3) {
                i iVar = new i();
                iVar.f2782a = iM3686b;
                iVar.f2783b = i8;
                iVar.f2784c = i3;
                iVar.f2785d = i7;
                iVar.f2786e = false;
                return iVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static i m3683e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.m3698b() >= 1 && hVar.m3697a() >= 1) {
            int iM3698b = ((hVar.m3698b() + hVar.m3697a()) + 1) / 2;
            cVar.m3687c(1, hVar.f2778a);
            cVar2.m3687c(1, hVar.f2779b);
            for (int i2 = 0; i2 < iM3698b; i2++) {
                i iVarM3682d = m3682d(hVar, bVar, cVar, cVar2, i2);
                if (iVarM3682d != null) {
                    return iVarM3682d;
                }
                i iVarM3679a = m3679a(hVar, bVar, cVar, cVar2, i2);
                if (iVarM3679a != null) {
                    return iVarM3679a;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public int f2778a;

        /* JADX INFO: renamed from: b */
        public int f2779b;

        /* JADX INFO: renamed from: c */
        public int f2780c;

        /* JADX INFO: renamed from: d */
        public int f2781d;

        public h(int i, int i2, int i3, int i4) {
            this.f2778a = i;
            this.f2779b = i2;
            this.f2780c = i3;
            this.f2781d = i4;
        }

        /* JADX INFO: renamed from: a */
        public int m3697a() {
            return this.f2781d - this.f2780c;
        }

        /* JADX INFO: renamed from: b */
        public int m3698b() {
            return this.f2779b - this.f2778a;
        }

        public h() {
        }
    }
}
