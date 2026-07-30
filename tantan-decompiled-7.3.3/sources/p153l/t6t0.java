package p153l;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class t6t0 {

    /* JADX INFO: renamed from: a */
    public final int f172360a;

    public t6t0(int i, int i2) {
        this.f172360a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m189545a() {
        int i = this.f172360a;
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
