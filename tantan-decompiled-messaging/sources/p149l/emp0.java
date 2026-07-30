package p149l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class emp0 implements e5g0 {

    /* JADX INFO: renamed from: a */
    public final List<xlp0> f92230a;

    /* JADX INFO: renamed from: b */
    public final long[] f92231b;

    /* JADX INFO: renamed from: c */
    public final long[] f92232c;

    public emp0(List<xlp0> list) {
        this.f92230a = Collections.unmodifiableList(new ArrayList(list));
        this.f92231b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            xlp0 xlp0Var = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f92231b;
            jArr[i2] = xlp0Var.f193479b;
            jArr[i2 + 1] = xlp0Var.f193480c;
        }
        long[] jArr2 = this.f92231b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f92232c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: a */
    public long mo114791a(int i) {
        p11.m167007a(i >= 0);
        p11.m167007a(i < this.f92232c.length);
        return this.f92232c[i];
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: b */
    public int mo114792b() {
        return this.f92232c.length;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: f */
    public int mo114793f(long j) {
        int iM197851e = vck0.m197851e(this.f92232c, j, false, false);
        if (iM197851e < this.f92232c.length) {
            return iM197851e;
        }
        return -1;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: g */
    public List<ywb> mo114794g(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f92230a.size(); i++) {
            long[] jArr = this.f92231b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                xlp0 xlp0Var = this.f92230a.get(i);
                ywb ywbVar = xlp0Var.f193478a;
                if (ywbVar.f200435e == -3.4028235E38f) {
                    arrayList2.add(xlp0Var);
                } else {
                    arrayList.add(ywbVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: l.dmp0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((xlp0) obj).f193479b, ((xlp0) obj2).f193479b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((xlp0) arrayList2.get(i3)).f193478a.m216310b().m216318h((-1) - i3, 1).m216311a());
        }
        return arrayList;
    }
}
