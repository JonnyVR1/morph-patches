package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzz();

    @SafeParcelable.Field(getter = "getLocationRequests", m12463id = 1)
    private final List zza;

    @SafeParcelable.Field(defaultValue = "false", getter = "alwaysShow", m12463id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "needBle", m12463id = 3)
    private final boolean zzc;

    public static final class Builder {
        private final ArrayList zza = new ArrayList();
        private boolean zzb = false;
        private boolean zzc = false;

        @NonNull
        public Builder addAllLocationRequests(@NonNull Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zza.add(locationRequest);
                }
            }
            return this;
        }

        @NonNull
        public Builder addLocationRequest(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        @NonNull
        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        public Builder setAlwaysShow(boolean z) {
            this.zzb = z;
            return this;
        }

        @NonNull
        public Builder setNeedBle(boolean z) {
            this.zzc = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param(m12464id = 1) List list, @SafeParcelable.Param(m12464id = 2) boolean z, @SafeParcelable.Param(m12464id = 3) boolean z2) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
