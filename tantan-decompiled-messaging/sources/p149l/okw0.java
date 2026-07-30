package p149l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public final class okw0 extends pkw0 {
    /* JADX INFO: renamed from: a */
    public static int m164905a(long j) {
        int i = (int) j;
        nfw0.m159285g(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m164906b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* JADX INFO: renamed from: c */
    public static int m164907c(long j) {
        if (j > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
