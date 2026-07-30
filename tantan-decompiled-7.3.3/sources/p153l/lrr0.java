package p153l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lrr0 implements tor0 {

    /* JADX INFO: renamed from: a */
    public final List f133360a;

    /* JADX INFO: renamed from: b */
    public final long[] f133361b;

    /* JADX INFO: renamed from: c */
    public final long[] f133362c;

    public lrr0(List list) {
        this.f133360a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f133361b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            arr0 arr0Var = (arr0) list.get(i);
            long[] jArr = this.f133361b;
            int i2 = i + i;
            jArr[i2] = arr0Var.f72980b;
            jArr[i2 + 1] = arr0Var.f72981c;
        }
        long[] jArr2 = this.f133361b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f133362c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p153l.tor0
    /* JADX INFO: renamed from: e */
    public final long mo155502e(int i) {
        lev0.m153956d(i >= 0);
        lev0.m153956d(i < this.f133362c.length);
        return this.f133362c[i];
    }

    @Override // p153l.tor0
    /* JADX INFO: renamed from: f */
    public final List mo155503f(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f133360a.size(); i++) {
            long[] jArr = this.f133361b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                arr0 arr0Var = (arr0) this.f133360a.get(i);
                u4v0 u4v0Var = arr0Var.f72979a;
                if (u4v0Var.f177535e == -3.4028235E38f) {
                    arrayList2.add(arr0Var);
                } else {
                    arrayList.add(u4v0Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.krr0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((arr0) obj).f72980b, ((arr0) obj2).f72980b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            j2v0 j2v0VarM194500b = ((arr0) arrayList2.get(i3)).f72979a.m194500b();
            j2v0VarM194500b.m143270e((-1) - i3, 1);
            arrayList.add(j2v0VarM194500b.m143281p());
        }
        return arrayList;
    }

    @Override // p153l.tor0
    public final int zza() {
        return this.f133362c.length;
    }
}
