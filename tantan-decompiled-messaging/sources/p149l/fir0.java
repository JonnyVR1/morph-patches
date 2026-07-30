package p149l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fir0 implements nfr0 {

    /* JADX INFO: renamed from: a */
    public final List f97714a;

    /* JADX INFO: renamed from: b */
    public final long[] f97715b;

    /* JADX INFO: renamed from: c */
    public final long[] f97716c;

    public fir0(List list) {
        this.f97714a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f97715b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            uhr0 uhr0Var = (uhr0) list.get(i);
            long[] jArr = this.f97715b;
            int i2 = i + i;
            jArr[i2] = uhr0Var.f176588b;
            jArr[i2 + 1] = uhr0Var.f176589c;
        }
        long[] jArr2 = this.f97715b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f97716c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p149l.nfr0
    /* JADX INFO: renamed from: e */
    public final long mo121422e(int i) {
        f5v0.m119533d(i >= 0);
        f5v0.m119533d(i < this.f97716c.length);
        return this.f97716c[i];
    }

    @Override // p149l.nfr0
    /* JADX INFO: renamed from: f */
    public final List mo121423f(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f97714a.size(); i++) {
            long[] jArr = this.f97715b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                uhr0 uhr0Var = (uhr0) this.f97714a.get(i);
                ovu0 ovu0Var = uhr0Var.f176587a;
                if (ovu0Var.f145878e == -3.4028235E38f) {
                    arrayList2.add(uhr0Var);
                } else {
                    arrayList.add(ovu0Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.eir0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((uhr0) obj).f176588b, ((uhr0) obj2).f176588b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            dtu0 dtu0VarM166209b = ((uhr0) arrayList2.get(i3)).f176587a.m166209b();
            dtu0VarM166209b.m113587e((-1) - i3, 1);
            arrayList.add(dtu0VarM166209b.m113598p());
        }
        return arrayList;
    }

    @Override // p149l.nfr0
    public final int zza() {
        return this.f97716c.length;
    }
}
