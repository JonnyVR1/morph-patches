package p153l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class dqw0 extends gqw0 {
    public dqw0() {
        super(null);
    }

    /* JADX INFO: renamed from: k */
    public static final gqw0 m117576k(int i) {
        if (i < 0) {
            return gqw0.f105973b;
        }
        return i > 0 ? gqw0.f105974c : gqw0.f105972a;
    }

    @Override // p153l.gqw0
    /* JADX INFO: renamed from: a */
    public final int mo117577a() {
        return 0;
    }

    @Override // p153l.gqw0
    /* JADX INFO: renamed from: b */
    public final gqw0 mo117578b(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return m117576k(i3);
    }

    @Override // p153l.gqw0
    /* JADX INFO: renamed from: c */
    public final gqw0 mo117579c(long j, long j2) {
        int i;
        if (j < j2) {
            i = -1;
        } else {
            i = j > j2 ? 1 : 0;
        }
        return m117576k(i);
    }

    @Override // p153l.gqw0
    /* JADX INFO: renamed from: d */
    public final gqw0 mo117580d(Object obj, Object obj2, Comparator comparator) {
        return m117576k(comparator.compare(obj, obj2));
    }

    @Override // p153l.gqw0
    /* JADX INFO: renamed from: e */
    public final gqw0 mo117581e(boolean z, boolean z2) {
        return m117576k(stw0.m187975a(z, z2));
    }

    @Override // p153l.gqw0
    /* JADX INFO: renamed from: f */
    public final gqw0 mo117582f(boolean z, boolean z2) {
        return m117576k(stw0.m187975a(z2, z));
    }
}
