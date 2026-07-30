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
import p153l.epr;
import p153l.vt2;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C0603g {

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
        public abstract boolean mo3646a(int i, int i2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo3647b(int i, int i2);

        @Nullable
        /* JADX INFO: renamed from: c */
        public Object mo3648c(int i, int i2) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo3649d();

        /* JADX INFO: renamed from: e */
        public abstract int mo3650e();
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
        public int[] m3686a() {
            return this.f2763a;
        }

        /* JADX INFO: renamed from: b */
        public int m3687b(int i) {
            return this.f2763a[i + this.f2764b];
        }

        /* JADX INFO: renamed from: c */
        public void m3688c(int i, int i2) {
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
        public int m3689a() {
            return this.f2765a + this.f2767c;
        }

        /* JADX INFO: renamed from: b */
        public int m3690b() {
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
            this.f2772e = bVar.mo3650e();
            this.f2773f = bVar.mo3649d();
            this.f2774g = z;
            m3692a();
            m3696e();
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static g m3691g(Collection<g> collection, int i, boolean z) {
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
        public final void m3692a() {
            d dVar = this.f2768a.isEmpty() ? null : this.f2768a.get(0);
            if (dVar == null || dVar.f2765a != 0 || dVar.f2766b != 0) {
                this.f2768a.add(0, new d(0, 0, 0));
            }
            this.f2768a.add(new d(this.f2772e, this.f2773f, 0));
        }

        /* JADX INFO: renamed from: b */
        public void m3693b(@NonNull RecyclerView.Adapter adapter) {
            m3694c(new C0598b(adapter));
        }

        /* JADX INFO: renamed from: c */
        public void m3694c(@NonNull epr eprVar) {
            int i;
            vt2 vt2Var = eprVar instanceof vt2 ? (vt2) eprVar : new vt2(eprVar);
            int i2 = this.f2772e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f2772e;
            int i4 = this.f2773f;
            for (int size = this.f2768a.size() - 1; size >= 0; size--) {
                d dVar = this.f2768a.get(size);
                int iM3689a = dVar.m3689a();
                int iM3690b = dVar.m3690b();
                while (true) {
                    if (i3 <= iM3689a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f2769b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        g gVarM3691g = m3691g(arrayDeque, i6, false);
                        if (gVarM3691g != null) {
                            int i7 = (i2 - gVarM3691g.f2776b) - 1;
                            vt2Var.mo3635d(i3, i7);
                            if ((i5 & 4) != 0) {
                                vt2Var.mo3632a(i7, 1, this.f2771d.mo3648c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        vt2Var.mo3634c(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iM3690b) {
                    i4--;
                    int i8 = this.f2770c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g gVarM3691g2 = m3691g(arrayDeque, i9, true);
                        if (gVarM3691g2 == null) {
                            arrayDeque.add(new g(i4, i2 - i3, false));
                        } else {
                            vt2Var.mo3635d((i2 - gVarM3691g2.f2776b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                vt2Var.mo3632a(i3, 1, this.f2771d.mo3648c(i9, i4));
                            }
                        }
                    } else {
                        vt2Var.mo3633b(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f2765a;
                int i11 = dVar.f2766b;
                for (i = 0; i < dVar.f2767c; i++) {
                    if ((this.f2769b[i10] & 15) == 2) {
                        vt2Var.mo3632a(i10, 1, this.f2771d.mo3648c(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f2765a;
                i4 = dVar.f2766b;
            }
            vt2Var.m202670e();
        }

        /* JADX INFO: renamed from: d */
        public final void m3695d(int i) {
            int size = this.f2768a.size();
            int iM3690b = 0;
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.f2768a.get(i2);
                while (iM3690b < dVar.f2766b) {
                    if (this.f2770c[iM3690b] == 0 && this.f2771d.mo3647b(i, iM3690b)) {
                        int i3 = this.f2771d.mo3646a(i, iM3690b) ? 8 : 4;
                        this.f2769b[i] = (iM3690b << 4) | i3;
                        this.f2770c[iM3690b] = (i << 4) | i3;
                        return;
                    }
                    iM3690b++;
                }
                iM3690b = dVar.m3690b();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m3696e() {
            for (d dVar : this.f2768a) {
                for (int i = 0; i < dVar.f2767c; i++) {
                    int i2 = dVar.f2765a + i;
                    int i3 = dVar.f2766b + i;
                    int i4 = this.f2771d.mo3646a(i2, i3) ? 1 : 2;
                    this.f2769b[i2] = (i3 << 4) | i4;
                    this.f2770c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f2774g) {
                m3697f();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m3697f() {
            int iM3689a = 0;
            for (d dVar : this.f2768a) {
                while (iM3689a < dVar.f2765a) {
                    if (this.f2769b[iM3689a] == 0) {
                        m3695d(iM3689a);
                    }
                    iM3689a++;
                }
                iM3689a = dVar.m3689a();
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
        public int m3700a() {
            return Math.min(this.f2784c - this.f2782a, this.f2785d - this.f2783b);
        }

        /* JADX INFO: renamed from: b */
        public boolean m3701b() {
            return this.f2785d - this.f2783b != this.f2784c - this.f2782a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m3702c() {
            return this.f2785d - this.f2783b > this.f2784c - this.f2782a;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public d m3703d() {
            if (!m3701b()) {
                int i = this.f2782a;
                return new d(i, this.f2783b, this.f2784c - i);
            }
            if (this.f2786e) {
                return new d(this.f2782a, this.f2783b, m3700a());
            }
            boolean zM3702c = m3702c();
            int i2 = this.f2782a;
            return zM3702c ? new d(i2, this.f2783b + 1, m3700a()) : new d(i2 + 1, this.f2783b, m3700a());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static i m3680a(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int iM3687b;
        int i3;
        int i4;
        boolean z = (hVar.m3699b() - hVar.m3698a()) % 2 == 0;
        int iM3699b = hVar.m3699b() - hVar.m3698a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar2.m3687b(i6 + 1) < cVar2.m3687b(i6 - 1))) {
                iM3687b = cVar2.m3687b(i6 + 1);
                i3 = iM3687b;
            } else {
                iM3687b = cVar2.m3687b(i6 - 1);
                i3 = iM3687b - 1;
            }
            int i7 = hVar.f2781d - ((hVar.f2779b - i3) - i6);
            int i8 = (i2 == 0 || i3 != iM3687b) ? i7 : i7 + 1;
            while (i3 > hVar.f2778a && i7 > hVar.f2780c && bVar.mo3647b(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            cVar2.m3688c(i6, i3);
            if (z && (i4 = iM3699b - i6) >= i5 && i4 <= i2 && cVar.m3687b(i4) >= i3) {
                i iVar = new i();
                iVar.f2782a = i3;
                iVar.f2783b = i7;
                iVar.f2784c = iM3687b;
                iVar.f2785d = i8;
                iVar.f2786e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static e m3681b(@NonNull b bVar) {
        return m3682c(bVar, true);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static e m3682c(@NonNull b bVar, boolean z) {
        int iMo3650e = bVar.mo3650e();
        int iMo3649d = bVar.mo3649d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iMo3650e, 0, iMo3649d));
        int i2 = ((((iMo3650e + iMo3649d) + 1) / 2) * 2) + 1;
        c cVar = new c(i2);
        c cVar2 = new c(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarM3684e = m3684e(hVar, bVar, cVar, cVar2);
            if (iVarM3684e != null) {
                if (iVarM3684e.m3700a() > 0) {
                    arrayList.add(iVarM3684e.m3703d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f2778a = hVar.f2778a;
                hVar2.f2780c = hVar.f2780c;
                hVar2.f2779b = iVarM3684e.f2782a;
                hVar2.f2781d = iVarM3684e.f2783b;
                arrayList2.add(hVar2);
                hVar.f2779b = hVar.f2779b;
                hVar.f2781d = hVar.f2781d;
                hVar.f2778a = iVarM3684e.f2784c;
                hVar.f2780c = iVarM3684e.f2785d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f2762a);
        return new e(bVar, arrayList, cVar.m3686a(), cVar2.m3686a(), z);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static i m3683d(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int iM3687b;
        int i3;
        int i4;
        boolean z = Math.abs(hVar.m3699b() - hVar.m3698a()) % 2 == 1;
        int iM3699b = hVar.m3699b() - hVar.m3698a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar.m3687b(i6 + 1) > cVar.m3687b(i6 - 1))) {
                iM3687b = cVar.m3687b(i6 + 1);
                i3 = iM3687b;
            } else {
                iM3687b = cVar.m3687b(i6 - 1);
                i3 = iM3687b + 1;
            }
            int i7 = (hVar.f2780c + (i3 - hVar.f2778a)) - i6;
            int i8 = (i2 == 0 || i3 != iM3687b) ? i7 : i7 - 1;
            while (i3 < hVar.f2779b && i7 < hVar.f2781d && bVar.mo3647b(i3, i7)) {
                i3++;
                i7++;
            }
            cVar.m3688c(i6, i3);
            if (z && (i4 = iM3699b - i6) >= i5 + 1 && i4 <= i2 - 1 && cVar2.m3687b(i4) <= i3) {
                i iVar = new i();
                iVar.f2782a = iM3687b;
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
    public static i m3684e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.m3699b() >= 1 && hVar.m3698a() >= 1) {
            int iM3699b = ((hVar.m3699b() + hVar.m3698a()) + 1) / 2;
            cVar.m3688c(1, hVar.f2778a);
            cVar2.m3688c(1, hVar.f2779b);
            for (int i2 = 0; i2 < iM3699b; i2++) {
                i iVarM3683d = m3683d(hVar, bVar, cVar, cVar2, i2);
                if (iVarM3683d != null) {
                    return iVarM3683d;
                }
                i iVarM3680a = m3680a(hVar, bVar, cVar, cVar2, i2);
                if (iVarM3680a != null) {
                    return iVarM3680a;
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
        public int m3698a() {
            return this.f2781d - this.f2780c;
        }

        /* JADX INFO: renamed from: b */
        public int m3699b() {
            return this.f2779b - this.f2778a;
        }

        public h() {
        }
    }
}
