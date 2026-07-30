package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import p153l.cl20;

/* JADX INFO: loaded from: classes7.dex */
final class zzeu {
    public static ApiException zza(VolleyError volleyError) {
        int i;
        if (volleyError instanceof NetworkError) {
            i = 7;
        } else if (volleyError instanceof TimeoutError) {
            i = 15;
        } else if ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) {
            i = 8;
        } else {
            i = volleyError instanceof AuthFailureError ? PlacesStatusCodes.REQUEST_DENIED : 13;
        }
        cl20 cl20Var = volleyError.networkResponse;
        return new ApiException(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", cl20Var == null ? "N/A" : String.valueOf(cl20Var.f82338a), volleyError)));
    }
}
