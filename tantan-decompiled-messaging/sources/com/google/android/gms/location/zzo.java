package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import p149l.x9g0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzo {
    public static int zza(int i) {
        boolean z = true;
        if (i != 0 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        Preconditions.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
        return i;
    }

    public static String zzb(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        x9g0.m207497a();
        return null;
    }
}
