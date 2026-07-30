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
import p153l.ilr0;
import p153l.w9r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new ilr0();

    @SafeParcelable.Field(getter = "getPanoramaId", m12517id = 3)
    private String panoId;

    @SafeParcelable.Field(getter = "getPosition", m12517id = 4)
    private LatLng position;

    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", m12517id = 10, type = Constants.BYTE)
    private Boolean zzak;

    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", m12517id = 7, type = Constants.BYTE)
    private Boolean zzap;

    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", m12517id = 2)
    private StreetViewPanoramaCamera zzbx;

    @SafeParcelable.Field(getter = "getRadius", m12517id = 5)
    private Integer zzby;

    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", m12517id = 6, type = Constants.BYTE)
    private Boolean zzbz;

    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", m12517id = 8, type = Constants.BYTE)
    private Boolean zzca;

    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", m12517id = 9, type = Constants.BYTE)
    private Boolean zzcb;

    @SafeParcelable.Field(getter = "getSource", m12517id = 11)
    private StreetViewSource zzcc;

    @SafeParcelable.Constructor
    public StreetViewPanoramaOptions(@SafeParcelable.Param(m12518id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param(m12518id = 3) String str, @SafeParcelable.Param(m12518id = 4) LatLng latLng, @SafeParcelable.Param(m12518id = 5) Integer num, @SafeParcelable.Param(m12518id = 6) byte b, @SafeParcelable.Param(m12518id = 7) byte b2, @SafeParcelable.Param(m12518id = 8) byte b3, @SafeParcelable.Param(m12518id = 9) byte b4, @SafeParcelable.Param(m12518id = 10) byte b5, @SafeParcelable.Param(m12518id = 11) StreetViewSource streetViewSource) {
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
        this.zzbz = w9r0.m205624b(b);
        this.zzap = w9r0.m205624b(b2);
        this.zzca = w9r0.m205624b(b3);
        this.zzcb = w9r0.m205624b(b4);
        this.zzak = w9r0.m205624b(b5);
        this.zzcc = streetViewSource;
    }

    /* JADX INFO: renamed from: F */
    public final String m15068F() {
        return this.panoId;
    }

    /* JADX INFO: renamed from: H */
    public final LatLng m15069H() {
        return this.position;
    }

    /* JADX INFO: renamed from: I */
    public final Integer m15070I() {
        return this.zzby;
    }

    /* JADX INFO: renamed from: J */
    public final StreetViewSource m15071J() {
        return this.zzcc;
    }

    /* JADX INFO: renamed from: h0 */
    public final StreetViewPanoramaCamera m15072h0() {
        return this.zzbx;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.panoId).add("Position", this.position).add("Radius", this.zzby).add("Source", this.zzcc).add("StreetViewPanoramaCamera", this.zzbx).add("UserNavigationEnabled", this.zzbz).add("ZoomGesturesEnabled", this.zzap).add("PanningGesturesEnabled", this.zzca).add("StreetNamesEnabled", this.zzcb).add("UseViewLifecycleInFragment", this.zzak).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m15072h0(), i, false);
        SafeParcelWriter.writeString(parcel, 3, m15068F(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, m15069H(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, m15070I(), false);
        SafeParcelWriter.writeByte(parcel, 6, w9r0.m205623a(this.zzbz));
        SafeParcelWriter.writeByte(parcel, 7, w9r0.m205623a(this.zzap));
        SafeParcelWriter.writeByte(parcel, 8, w9r0.m205623a(this.zzca));
        SafeParcelWriter.writeByte(parcel, 9, w9r0.m205623a(this.zzcb));
        SafeParcelWriter.writeByte(parcel, 10, w9r0.m205623a(this.zzak));
        SafeParcelWriter.writeParcelable(parcel, 11, m15071J(), i, false);
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
