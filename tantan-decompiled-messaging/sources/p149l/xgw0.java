package p149l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class xgw0 extends ahw0 {
    public xgw0() {
        super(null);
    }

    /* JADX INFO: renamed from: k */
    public static final ahw0 m208713k(int i) {
        if (i < 0) {
            return ahw0.f69934b;
        }
        return i > 0 ? ahw0.f69935c : ahw0.f69933a;
    }

    @Override // p149l.ahw0
    /* JADX INFO: renamed from: a */
    public final int mo96743a() {
        return 0;
    }

    @Override // p149l.ahw0
    /* JADX INFO: renamed from: b */
    public final ahw0 mo96744b(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return m208713k(i3);
    }

    @Override // p149l.ahw0
    /* JADX INFO: renamed from: c */
    public final ahw0 mo96745c(long j, long j2) {
        int i;
        if (j < j2) {
            i = -1;
        } else {
            i = j > j2 ? 1 : 0;
        }
        return m208713k(i);
    }

    @Override // p149l.ahw0
    /* JADX INFO: renamed from: d */
    public final ahw0 mo96746d(Object obj, Object obj2, Comparator comparator) {
        return m208713k(comparator.compare(obj, obj2));
    }

    @Override // p149l.ahw0
    /* JADX INFO: renamed from: e */
    public final ahw0 mo96747e(boolean z, boolean z2) {
        return m208713k(mkw0.m155105a(z, z2));
    }

    @Override // p149l.ahw0
    /* JADX INFO: renamed from: f */
    public final ahw0 mo96748f(boolean z, boolean z2) {
        return m208713k(mkw0.m155105a(z2, z));
    }
}
