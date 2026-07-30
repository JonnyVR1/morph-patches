package p149l;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class nxs0 {

    /* JADX INFO: renamed from: a */
    public final int f141049a;

    public nxs0(int i, int i2) {
        this.f141049a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m161951a() {
        int i = this.f141049a;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
