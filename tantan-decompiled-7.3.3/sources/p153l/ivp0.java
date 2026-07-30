package p153l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ivp0 implements mdg0 {

    /* JADX INFO: renamed from: a */
    public final List<bvp0> f117104a;

    /* JADX INFO: renamed from: b */
    public final long[] f117105b;

    /* JADX INFO: renamed from: c */
    public final long[] f117106c;

    public ivp0(List<bvp0> list) {
        this.f117104a = Collections.unmodifiableList(new ArrayList(list));
        this.f117105b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            bvp0 bvp0Var = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f117105b;
            jArr[i2] = bvp0Var.f78617b;
            jArr[i2 + 1] = bvp0Var.f78618c;
        }
        long[] jArr2 = this.f117105b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f117106c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: a */
    public long mo95502a(int i) {
        w11.m204365a(i >= 0);
        w11.m204365a(i < this.f117106c.length);
        return this.f117106c[i];
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: b */
    public int mo95503b() {
        return this.f117106c.length;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: f */
    public int mo95504f(long j) {
        int iM105129e = bmk0.m105129e(this.f117106c, j, false, false);
        if (iM105129e < this.f117106c.length) {
            return iM105129e;
        }
        return -1;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: g */
    public List<myb> mo95505g(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f117104a.size(); i++) {
            long[] jArr = this.f117105b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                bvp0 bvp0Var = this.f117104a.get(i);
                myb mybVar = bvp0Var.f78616a;
                if (mybVar.f139371e == -3.4028235E38f) {
                    arrayList2.add(bvp0Var);
                } else {
                    arrayList.add(mybVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.hvp0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((bvp0) obj).f78617b, ((bvp0) obj2).f78617b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((bvp0) arrayList2.get(i3)).f78616a.m160753b().m160761h((-1) - i3, 1).m160754a());
        }
        return arrayList;
    }
}
