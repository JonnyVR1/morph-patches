package p149l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public class z7t0 {
    /* JADX INFO: renamed from: a */
    public static int m217505a(int i, int i2) {
        if (i2 < 0) {
            ig3.m135964a("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3;
    }
}
