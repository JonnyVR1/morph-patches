package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: loaded from: classes7.dex */
public final class PlacesStatusCodes extends CommonStatusCodes {
    public static final int INVALID_REQUEST = 9012;
    public static final int NOT_FOUND = 9013;
    public static final int OVER_QUERY_LIMIT = 9010;
    public static final int REQUEST_DENIED = 9011;

    @RecentlyNonNull
    public static String getStatusCodeString(int i) {
        switch (i) {
            case OVER_QUERY_LIMIT /* 9010 */:
                return "OVER_QUERY_LIMIT";
            case REQUEST_DENIED /* 9011 */:
                return "REQUEST_DENIED";
            case INVALID_REQUEST /* 9012 */:
                return "INVALID_REQUEST";
            case NOT_FOUND /* 9013 */:
                return "NOT_FOUND";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }

    public static boolean isError(int i) {
        return i > 0;
    }
}
