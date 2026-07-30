package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import java.util.List;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzb extends AddressComponent {
    private final String zza;

    @Nullable
    private final String zzb;
    private final List zzc;

    public zzb(String str, @Nullable String str2, List list) {
        if (str == null) {
            mnd0.m159157a("Null name");
            throw null;
        }
        this.zza = str;
        this.zzb = str2;
        if (list != null) {
            this.zzc = list;
        } else {
            mnd0.m159157a("Null types");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            if (this.zza.equals(addressComponent.getName()) && ((str = this.zzb) != null ? str.equals(addressComponent.getShortName()) : addressComponent.getShortName() == null) && this.zzc.equals(addressComponent.getTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    @Nullable
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final List<String> getTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        return this.zzc.hashCode() ^ (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final String toString() {
        return "AddressComponent{name=" + this.zza + ", shortName=" + this.zzb + ", types=" + this.zzc.toString() + "}";
    }
}
