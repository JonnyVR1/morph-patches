package p153l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class a1g0 implements mdg0 {

    /* JADX INFO: renamed from: a */
    public final List<List<myb>> f67813a;

    /* JADX INFO: renamed from: b */
    public final List<Long> f67814b;

    public a1g0(List<List<myb>> list, List<Long> list2) {
        this.f67813a = list;
        this.f67814b = list2;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: a */
    public long mo95502a(int i) {
        w11.m204365a(i >= 0);
        w11.m204365a(i < this.f67814b.size());
        return this.f67814b.get(i).longValue();
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: b */
    public int mo95503b() {
        return this.f67814b.size();
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: f */
    public int mo95504f(long j) {
        int iM105126d = bmk0.m105126d(this.f67814b, Long.valueOf(j), false, false);
        if (iM105126d < this.f67814b.size()) {
            return iM105126d;
        }
        return -1;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: g */
    public List<myb> mo95505g(long j) {
        int iM105132f = bmk0.m105132f(this.f67814b, Long.valueOf(j), true, false);
        return iM105132f == -1 ? Collections.EMPTY_LIST : this.f67813a.get(iM105132f);
    }
}
