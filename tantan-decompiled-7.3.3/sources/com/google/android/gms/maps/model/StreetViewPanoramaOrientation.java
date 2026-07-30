package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.goy0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new goy0();

    @SafeParcelable.Field(m12517id = 3)
    public final float bearing;

    @SafeParcelable.Field(m12517id = 2)
    public final float tilt;

    /* JADX INFO: renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C2469a {

        /* JADX INFO: renamed from: a */
        public float f10473a;

        /* JADX INFO: renamed from: b */
        public float f10474b;

        /* JADX INFO: renamed from: a */
        public final C2469a m15111a(float f) {
            this.f10473a = f;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final StreetViewPanoramaOrientation m15112b() {
            return new StreetViewPanoramaOrientation(this.f10474b, this.f10473a);
        }

        /* JADX INFO: renamed from: c */
        public final C2469a m15113c(float f) {
            this.f10474b = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param(m12518id = 2) float f, @SafeParcelable.Param(m12518id = 3) float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        Preconditions.checkArgument(z, sb.toString());
        this.tilt = f + 0.0f;
        this.bearing = (((double) f2) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
