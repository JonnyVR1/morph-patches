package p153l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public class oar0 {
    /* JADX INFO: renamed from: a */
    public static int m166849a(int i, int i2) {
        if (i2 < 0) {
            gig0.m130323a("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3;
    }
}
