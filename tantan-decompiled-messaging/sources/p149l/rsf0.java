package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rsf0 implements e5g0 {

    /* JADX INFO: renamed from: a */
    public final List<List<ywb>> f160852a;

    /* JADX INFO: renamed from: b */
    public final List<Long> f160853b;

    public rsf0(List<List<ywb>> list, List<Long> list2) {
        this.f160852a = list;
        this.f160853b = list2;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: a */
    public long mo114791a(int i) {
        p11.m167007a(i >= 0);
        p11.m167007a(i < this.f160853b.size());
        return this.f160853b.get(i).longValue();
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: b */
    public int mo114792b() {
        return this.f160853b.size();
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: f */
    public int mo114793f(long j) {
        int iM197848d = vck0.m197848d(this.f160853b, Long.valueOf(j), false, false);
        if (iM197848d < this.f160853b.size()) {
            return iM197848d;
        }
        return -1;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: g */
    public List<ywb> mo114794g(long j) {
        int iM197854f = vck0.m197854f(this.f160853b, Long.valueOf(j), true, false);
        return iM197854f == -1 ? Collections.EMPTY_LIST : this.f160852a.get(iM197854f);
    }
}
