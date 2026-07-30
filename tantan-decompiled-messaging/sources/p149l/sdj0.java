package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sdj0 implements e5g0 {

    /* JADX INFO: renamed from: b */
    public static final sdj0 f163856b = new sdj0();

    /* JADX INFO: renamed from: a */
    public final List<ywb> f163857a;

    public sdj0(ywb ywbVar) {
        this.f163857a = Collections.singletonList(ywbVar);
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
        return j >= 0 ? this.f163857a : Collections.EMPTY_LIST;
    }

    public sdj0() {
        this.f163857a = Collections.EMPTY_LIST;
    }
}
