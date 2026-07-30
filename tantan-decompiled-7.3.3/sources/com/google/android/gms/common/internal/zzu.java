package com.google.android.gms.common.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class zzu {
    private static final Uri zza;
    private static final Uri zzb;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        zza = uri;
        zzb = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
