package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzk extends AutocompleteSessionToken {
    private final ParcelUuid zza;

    public zzk(ParcelUuid parcelUuid) {
        if (parcelUuid != null) {
            this.zza = parcelUuid;
        } else {
            jfd0.m141176a("Null UUID");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompleteSessionToken) {
            return this.zza.equals(((AutocompleteSessionToken) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompleteSessionToken
    public final ParcelUuid zza() {
        return this.zza;
    }
}
