package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import p149l.n16;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzfr implements n16 {
    @Override // p149l.n16
    public final Object then(Task task) {
        ApiException apiException;
        ApiException apiException2;
        Exception excMo15372k = task.mo15372k();
        if (excMo15372k == null) {
            return task;
        }
        if (excMo15372k instanceof ApiException) {
            apiException2 = (ApiException) excMo15372k;
        } else {
            if (excMo15372k instanceof zzbdq) {
                zzbdo zzbdoVarZze = zzbdo.zze((zzbdq) excMo15372k);
                zzbdj zzbdjVar = zzbdj.OK;
                int iOrdinal = zzbdoVarZze.zza().ordinal();
                if (iOrdinal == 3) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, zzbdoVarZze.zzi()));
                } else if (iOrdinal == 4) {
                    apiException = new ApiException(new Status(15, zzbdoVarZze.zzi()));
                } else if (iOrdinal == 5) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.NOT_FOUND, zzbdoVarZze.zzi()));
                } else if (iOrdinal == 7) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, zzbdoVarZze.zzi()));
                } else if (iOrdinal != 13) {
                    apiException = iOrdinal != 14 ? new ApiException(new Status(13, zzbdoVarZze.zzi())) : new ApiException(new Status(7, zzbdoVarZze.zzi()));
                } else {
                    apiException = new ApiException(new Status(8, zzbdoVarZze.zzi()));
                }
            } else {
                apiException = new ApiException(new Status(13, excMo15372k.toString()));
            }
            apiException2 = apiException;
        }
        return tfi0.m188733e(apiException2);
    }
}
