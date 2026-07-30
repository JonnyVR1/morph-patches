package p149l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fhw0 {
    /* JADX INFO: renamed from: b */
    public static int m121469b(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3;
    }

    /* JADX INFO: renamed from: a */
    public abstract fhw0 mo13444a(Object obj);
}
