package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mn4 implements e5g0 {

    /* JADX INFO: renamed from: a */
    public final List<ywb> f134733a;

    public mn4(List<ywb> list) {
        this.f134733a = list;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: a */
    public long mo114791a(int i) {
        p11.m167007a(i == 0);
        return 0L;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: b */
    public int mo114792b() {
        return 1;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: f */
    public int mo114793f(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: g */
    public List<ywb> mo114794g(long j) {
        return j >= 0 ? this.f134733a : Collections.EMPTY_LIST;
    }
}
