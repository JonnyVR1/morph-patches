package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import com.meituan.robust.Constants;
import p149l.ccr0;
import p149l.q0r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new ccr0();

    @SafeParcelable.Field(getter = "getPanoramaId", m12463id = 3)
    private String panoId;

    @SafeParcelable.Field(getter = "getPosition", m12463id = 4)
    private LatLng position;

    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", m12463id = 10, type = Constants.BYTE)
    private Boolean zzak;

    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", m12463id = 7, type = Constants.BYTE)
    private Boolean zzap;

    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", m12463id = 2)
    private StreetViewPanoramaCamera zzbx;

    @SafeParcelable.Field(getter = "getRadius", m12463id = 5)
    private Integer zzby;

    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", m12463id = 6, type = Constants.BYTE)
    private Boolean zzbz;

    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", m12463id = 8, type = Constants.BYTE)
    private Boolean zzca;

    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", m12463id = 9, type = Constants.BYTE)
    private Boolean zzcb;

    @SafeParcelable.Field(getter = "getSource", m12463id = 11)
    private StreetViewSource zzcc;

    @SafeParcelable.Constructor
    public StreetViewPanoramaOptions(@SafeParcelable.Param(m12464id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param(m12464id = 3) String str, @SafeParcelable.Param(m12464id = 4) LatLng latLng, @SafeParcelable.Param(m12464id = 5) Integer num, @SafeParcelable.Param(m12464id = 6) byte b, @SafeParcelable.Param(m12464id = 7) byte b2, @SafeParcelable.Param(m12464id = 8) byte b3, @SafeParcelable.Param(m12464id = 9) byte b4, @SafeParcelable.Param(m12464id = 10) byte b5, @SafeParcelable.Param(m12464id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zzbz = bool;
        this.zzap = bool;
        this.zzca = bool;
        this.zzcb = bool;
        this.zzcc = StreetViewSource.DEFAULT;
        this.zzbx = streetViewPanoramaCamera;
        this.position = latLng;
        this.zzby = num;
        this.panoId = str;
        this.zzbz = q0r0.m172340b(b);
        this.zzap = q0r0.m172340b(b2);
        this.zzca = q0r0.m172340b(b3);
        this.zzcb = q0r0.m172340b(b4);
        this.zzak = q0r0.m172340b(b5);
        this.zzcc = streetViewSource;
    }

    /* JADX INFO: renamed from: F */
    public final String m15014F() {
        return this.panoId;
    }

    /* JADX INFO: renamed from: H */
    public final LatLng m15015H() {
        return this.position;
    }

    /* JADX INFO: renamed from: I */
    public final Integer m15016I() {
        return this.zzby;
    }

    /* JADX INFO: renamed from: J */
    public final StreetViewSource m15017J() {
        return this.zzcc;
    }

    /* JADX INFO: renamed from: g0 */
    public final StreetViewPanoramaCamera m15018g0() {
        return this.zzbx;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.panoId).add("Position", this.position).add("Radius", this.zzby).add("Source", this.zzcc).add("StreetViewPanoramaCamera", this.zzbx).add("UserNavigationEnabled", this.zzbz).add("ZoomGesturesEnabled", this.zzap).add("PanningGesturesEnabled", this.zzca).add("StreetNamesEnabled", this.zzcb).add("UseViewLifecycleInFragment", this.zzak).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m15018g0(), i, false);
        SafeParcelWriter.writeString(parcel, 3, m15014F(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, m15015H(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, m15016I(), false);
        SafeParcelWriter.writeByte(parcel, 6, q0r0.m172339a(this.zzbz));
        SafeParcelWriter.writeByte(parcel, 7, q0r0.m172339a(this.zzap));
        SafeParcelWriter.writeByte(parcel, 8, q0r0.m172339a(this.zzca));
        SafeParcelWriter.writeByte(parcel, 9, q0r0.m172339a(this.zzcb));
        SafeParcelWriter.writeByte(parcel, 10, q0r0.m172339a(this.zzak));
        SafeParcelWriter.writeParcelable(parcel, 11, m15017J(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zzbz = bool;
        this.zzap = bool;
        this.zzca = bool;
        this.zzcb = bool;
        this.zzcc = StreetViewSource.DEFAULT;
    }
}
