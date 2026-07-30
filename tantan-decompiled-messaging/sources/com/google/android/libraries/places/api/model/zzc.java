package com.google.android.libraries.places.api.model;

import java.util.List;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzc extends AddressComponents {
    private final List zza;

    public zzc(List list) {
        if (list != null) {
            this.zza = list;
        } else {
            jfd0.m141176a("Null asList");
            throw null;
        }
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponents
    public final List<AddressComponent> asList() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponents) {
            return this.zza.equals(((AddressComponents) obj).asList());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddressComponents{asList=" + this.zza.toString() + "}";
    }
}
