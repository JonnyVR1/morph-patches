package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class r3g0 implements e5g0 {

    /* JADX INFO: renamed from: a */
    public final ywb[] f157531a;

    /* JADX INFO: renamed from: b */
    public final long[] f157532b;

    public r3g0(ywb[] ywbVarArr, long[] jArr) {
        this.f157531a = ywbVarArr;
        this.f157532b = jArr;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: a */
    public long mo114791a(int i) {
        p11.m167007a(i >= 0);
        p11.m167007a(i < this.f157532b.length);
        return this.f157532b[i];
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: b */
    public int mo114792b() {
        return this.f157532b.length;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: f */
    public int mo114793f(long j) {
        int iM197851e = vck0.m197851e(this.f157532b, j, false, false);
        if (iM197851e < this.f157532b.length) {
            return iM197851e;
        }
        return -1;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: g */
    public List<ywb> mo114794g(long j) {
        ywb ywbVar;
        int iM197863i = vck0.m197863i(this.f157532b, j, true, false);
        return (iM197863i == -1 || (ywbVar = this.f157531a[iM197863i]) == ywb.f200422r) ? Collections.EMPTY_LIST : Collections.singletonList(ywbVar);
    }
}
