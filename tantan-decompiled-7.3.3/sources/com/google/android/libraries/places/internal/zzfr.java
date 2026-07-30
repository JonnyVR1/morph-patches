package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import p153l.s26;
import p153l.toi0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzfr implements s26 {
    @Override // p153l.s26
    public final Object then(Task task) {
        ApiException apiException;
        ApiException apiException2;
        Exception excMo15426k = task.mo15426k();
        if (excMo15426k == null) {
            return task;
        }
        if (excMo15426k instanceof ApiException) {
            apiException2 = (ApiException) excMo15426k;
        } else {
            if (excMo15426k instanceof zzbdq) {
                zzbdo zzbdoVarZze = zzbdo.zze((zzbdq) excMo15426k);
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
                apiException = new ApiException(new Status(13, excMo15426k.toString()));
            }
            apiException2 = apiException;
        }
        return toi0.m192067e(apiException2);
    }
}
