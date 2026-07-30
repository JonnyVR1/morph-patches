package p153l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lo4 implements mdg0 {

    /* JADX INFO: renamed from: a */
    public final List<myb> f132873a;

    public lo4(List<myb> list) {
        this.f132873a = list;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: a */
    public long mo95502a(int i) {
        w11.m204365a(i == 0);
        return 0L;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: b */
    public int mo95503b() {
        return 1;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: f */
    public int mo95504f(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: g */
    public List<myb> mo95505g(long j) {
        return j >= 0 ? this.f132873a : Collections.EMPTY_LIST;
    }
}
