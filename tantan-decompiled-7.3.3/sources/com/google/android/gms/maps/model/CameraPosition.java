package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.Target;
import p153l.x9r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new x9r0();

    @SafeParcelable.Field(m12517id = 5)
    public final float bearing;

    @SafeParcelable.Field(m12517id = 2)
    public final LatLng target;

    @SafeParcelable.Field(m12517id = 4)
    public final float tilt;

    @SafeParcelable.Field(m12517id = 3)
    public final float zoom;

    /* JADX INFO: renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C2468a {

        /* JADX INFO: renamed from: a */
        public LatLng f10469a;

        /* JADX INFO: renamed from: b */
        public float f10470b;

        /* JADX INFO: renamed from: c */
        public float f10471c;

        /* JADX INFO: renamed from: d */
        public float f10472d;

        /* JADX INFO: renamed from: a */
        public final C2468a m15088a(float f) {
            this.f10472d = f;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final CameraPosition m15089b() {
            return new CameraPosition(this.f10469a, this.f10470b, this.f10471c, this.f10472d);
        }

        /* JADX INFO: renamed from: c */
        public final C2468a m15090c(LatLng latLng) {
            this.f10469a = latLng;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final C2468a m15091d(float f) {
            this.f10471c = f;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final C2468a m15092e(float f) {
            this.f10470b = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(m12518id = 2) LatLng latLng, @SafeParcelable.Param(m12518id = 3) float f, @SafeParcelable.Param(m12518id = 4) float f2, @SafeParcelable.Param(m12518id = 5) float f3) {
        Preconditions.checkNotNull(latLng, "null camera target");
        Preconditions.checkArgument(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* JADX INFO: renamed from: F */
    public static C2468a m15087F() {
        return new C2468a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final int hashCode() {
        return Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(Target.TYPE, this.target).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.target, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
