package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzns {
    public static int zzd(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3;
    }

    public abstract zzns zzb(Object obj);
}
