package p153l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ybg0 implements mdg0 {

    /* JADX INFO: renamed from: a */
    public final myb[] f198307a;

    /* JADX INFO: renamed from: b */
    public final long[] f198308b;

    public ybg0(myb[] mybVarArr, long[] jArr) {
        this.f198307a = mybVarArr;
        this.f198308b = jArr;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: a */
    public long mo95502a(int i) {
        w11.m204365a(i >= 0);
        w11.m204365a(i < this.f198308b.length);
        return this.f198308b[i];
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: b */
    public int mo95503b() {
        return this.f198308b.length;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: f */
    public int mo95504f(long j) {
        int iM105129e = bmk0.m105129e(this.f198308b, j, false, false);
        if (iM105129e < this.f198308b.length) {
            return iM105129e;
        }
        return -1;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: g */
    public List<myb> mo95505g(long j) {
        myb mybVar;
        int iM105141i = bmk0.m105141i(this.f198308b, j, true, false);
        return (iM105141i == -1 || (mybVar = this.f198307a[iM105141i]) == myb.f139358r) ? Collections.EMPTY_LIST : Collections.singletonList(mybVar);
    }
}
