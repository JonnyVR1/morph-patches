package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.l4y0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new l4y0();

    @SafeParcelable.Field(m12463id = 4)
    public final float bearing;

    @SafeParcelable.Field(m12463id = 3)
    public final float tilt;

    @SafeParcelable.Field(m12463id = 2)
    public final float zoom;

    @NonNull
    private final StreetViewPanoramaOrientation zzeg;

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param(m12464id = 2) float f, @SafeParcelable.Param(m12464id = 3) float f2, @SafeParcelable.Param(m12464id = 4) float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.checkArgument(z, sb.toString());
        this.zoom = ((double) f) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 0.0f : f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.zzeg = new StreetViewPanoramaOrientation.C2446a().m15059c(f2).m15057a(f3).m15058b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
