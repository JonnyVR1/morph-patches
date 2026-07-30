package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x004c A[RETURN] */
    public static int zza(@Nullable String str) {
        if (str == null) {
            return 13;
        }
        switch (str) {
            case "REQUEST_DENIED":
                return PlacesStatusCodes.REQUEST_DENIED;
            case "INVALID_REQUEST":
                return PlacesStatusCodes.INVALID_REQUEST;
            case "ZERO_RESULTS":
                return 0;
            case "OK":
                return 0;
            case "NOT_FOUND":
                return PlacesStatusCodes.NOT_FOUND;
            case "OVER_QUERY_LIMIT":
                return PlacesStatusCodes.OVER_QUERY_LIMIT;
            default:
                return 13;
        }
    }

    @Nullable
    public static String zzb(@Nullable String str, @Nullable String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}
