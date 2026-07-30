package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.meituan.robust.Constants;
import com.momo.mcamera.util.MDLogTag;
import com.p051p1.mobile.putong.data.User;
import p153l.bhc0;
import p153l.par0;
import p153l.w9r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new par0();

    @SafeParcelable.Field(getter = "getMapType", m12517id = 4)
    private int mapType;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getZOrderOnTopForParcel", m12517id = 2, type = Constants.BYTE)
    private Boolean zzaj;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getUseViewLifecycleInFragmentForParcel", m12517id = 3, type = Constants.BYTE)
    private Boolean zzak;

    @SafeParcelable.Field(getter = "getCamera", m12517id = 5)
    private CameraPosition zzal;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getZoomControlsEnabledForParcel", m12517id = 6, type = Constants.BYTE)
    private Boolean zzam;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getCompassEnabledForParcel", m12517id = 7, type = Constants.BYTE)
    private Boolean zzan;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getScrollGesturesEnabledForParcel", m12517id = 8, type = Constants.BYTE)
    private Boolean zzao;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getZoomGesturesEnabledForParcel", m12517id = 9, type = Constants.BYTE)
    private Boolean zzap;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getTiltGesturesEnabledForParcel", m12517id = 10, type = Constants.BYTE)
    private Boolean zzaq;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getRotateGesturesEnabledForParcel", m12517id = 11, type = Constants.BYTE)
    private Boolean zzar;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getLiteModeForParcel", m12517id = 12, type = Constants.BYTE)
    private Boolean zzas;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getMapToolbarEnabledForParcel", m12517id = 14, type = Constants.BYTE)
    private Boolean zzat;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getAmbientEnabledForParcel", m12517id = 15, type = Constants.BYTE)
    private Boolean zzau;

    @SafeParcelable.Field(getter = "getMinZoomPreference", m12517id = 16)
    private Float zzav;

    @SafeParcelable.Field(getter = "getMaxZoomPreference", m12517id = 17)
    private Float zzaw;

    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", m12517id = 18)
    private LatLngBounds zzax;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", m12517id = 19, type = Constants.BYTE)
    private Boolean zzay;

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(m12518id = 2) byte b, @SafeParcelable.Param(m12518id = 3) byte b2, @SafeParcelable.Param(m12518id = 4) int i, @SafeParcelable.Param(m12518id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(m12518id = 6) byte b3, @SafeParcelable.Param(m12518id = 7) byte b4, @SafeParcelable.Param(m12518id = 8) byte b5, @SafeParcelable.Param(m12518id = 9) byte b6, @SafeParcelable.Param(m12518id = 10) byte b7, @SafeParcelable.Param(m12518id = 11) byte b8, @SafeParcelable.Param(m12518id = 12) byte b9, @SafeParcelable.Param(m12518id = 14) byte b10, @SafeParcelable.Param(m12518id = 15) byte b11, @SafeParcelable.Param(m12518id = 16) Float f, @SafeParcelable.Param(m12518id = 17) Float f2, @SafeParcelable.Param(m12518id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(m12518id = 19) byte b12) {
        this.mapType = -1;
        this.zzav = null;
        this.zzaw = null;
        this.zzax = null;
        this.zzaj = w9r0.m205624b(b);
        this.zzak = w9r0.m205624b(b2);
        this.mapType = i;
        this.zzal = cameraPosition;
        this.zzam = w9r0.m205624b(b3);
        this.zzan = w9r0.m205624b(b4);
        this.zzao = w9r0.m205624b(b5);
        this.zzap = w9r0.m205624b(b6);
        this.zzaq = w9r0.m205624b(b7);
        this.zzar = w9r0.m205624b(b8);
        this.zzas = w9r0.m205624b(b9);
        this.zzat = w9r0.m205624b(b10);
        this.zzau = w9r0.m205624b(b11);
        this.zzav = f;
        this.zzaw = f2;
        this.zzax = latLngBounds;
        this.zzay = w9r0.m205624b(b12);
    }

    /* JADX INFO: renamed from: F */
    public static GoogleMapOptions m15027F(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, bhc0.f76747a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(bhc0.f76761o)) {
            googleMapOptions.m15041m0(typedArrayObtainAttributes.getInt(bhc0.f76761o, -1));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76771y)) {
            googleMapOptions.m15049u0(typedArrayObtainAttributes.getBoolean(bhc0.f76771y, false));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76770x)) {
            googleMapOptions.m15048t0(typedArrayObtainAttributes.getBoolean(bhc0.f76770x, false));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76762p)) {
            googleMapOptions.m15036i(typedArrayObtainAttributes.getBoolean(bhc0.f76762p, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76764r)) {
            googleMapOptions.m15044p0(typedArrayObtainAttributes.getBoolean(bhc0.f76764r, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76766t)) {
            googleMapOptions.m15046r0(typedArrayObtainAttributes.getBoolean(bhc0.f76766t, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76765s)) {
            googleMapOptions.m15045q0(typedArrayObtainAttributes.getBoolean(bhc0.f76765s, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76767u)) {
            googleMapOptions.m15047s0(typedArrayObtainAttributes.getBoolean(bhc0.f76767u, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76769w)) {
            googleMapOptions.m15051w0(typedArrayObtainAttributes.getBoolean(bhc0.f76769w, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76768v)) {
            googleMapOptions.m15050v0(typedArrayObtainAttributes.getBoolean(bhc0.f76768v, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76760n)) {
            googleMapOptions.m15039k0(typedArrayObtainAttributes.getBoolean(bhc0.f76760n, false));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76763q)) {
            googleMapOptions.m15040l0(typedArrayObtainAttributes.getBoolean(bhc0.f76763q, true));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76748b)) {
            googleMapOptions.m15033g(typedArrayObtainAttributes.getBoolean(bhc0.f76748b, false));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76751e)) {
            googleMapOptions.m15043o0(typedArrayObtainAttributes.getFloat(bhc0.f76751e, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76751e)) {
            googleMapOptions.m15042n0(typedArrayObtainAttributes.getFloat(bhc0.f76750d, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.m15038j0(m15028x0(context, attributeSet));
        googleMapOptions.m15034h(m15029y0(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    /* JADX INFO: renamed from: x0 */
    public static LatLngBounds m15028x0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, bhc0.f76747a);
        Float fValueOf = typedArrayObtainAttributes.hasValue(bhc0.f76758l) ? Float.valueOf(typedArrayObtainAttributes.getFloat(bhc0.f76758l, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(bhc0.f76759m) ? Float.valueOf(typedArrayObtainAttributes.getFloat(bhc0.f76759m, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(bhc0.f76756j) ? Float.valueOf(typedArrayObtainAttributes.getFloat(bhc0.f76756j, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(bhc0.f76757k) ? Float.valueOf(typedArrayObtainAttributes.getFloat(bhc0.f76757k, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    /* JADX INFO: renamed from: y0 */
    public static CameraPosition m15029y0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, bhc0.f76747a);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(bhc0.f76752f) ? typedArrayObtainAttributes.getFloat(bhc0.f76752f, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(bhc0.f76753g) ? typedArrayObtainAttributes.getFloat(bhc0.f76753g, 0.0f) : 0.0f);
        CameraPosition.C2468a c2468aM15087F = CameraPosition.m15087F();
        c2468aM15087F.m15090c(latLng);
        if (typedArrayObtainAttributes.hasValue(bhc0.f76755i)) {
            c2468aM15087F.m15092e(typedArrayObtainAttributes.getFloat(bhc0.f76755i, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76749c)) {
            c2468aM15087F.m15088a(typedArrayObtainAttributes.getFloat(bhc0.f76749c, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(bhc0.f76754h)) {
            c2468aM15087F.m15091d(typedArrayObtainAttributes.getFloat(bhc0.f76754h, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return c2468aM15087F.m15089b();
    }

    /* JADX INFO: renamed from: H */
    public final CameraPosition m15030H() {
        return this.zzal;
    }

    /* JADX INFO: renamed from: I */
    public final LatLngBounds m15031I() {
        return this.zzax;
    }

    /* JADX INFO: renamed from: J */
    public final int m15032J() {
        return this.mapType;
    }

    /* JADX INFO: renamed from: g */
    public final GoogleMapOptions m15033g(boolean z) {
        this.zzau = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final GoogleMapOptions m15034h(CameraPosition cameraPosition) {
        this.zzal = cameraPosition;
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final Float m15035h0() {
        return this.zzaw;
    }

    /* JADX INFO: renamed from: i */
    public final GoogleMapOptions m15036i(boolean z) {
        this.zzan = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: i0 */
    public final Float m15037i0() {
        return this.zzav;
    }

    /* JADX INFO: renamed from: j0 */
    public final GoogleMapOptions m15038j0(LatLngBounds latLngBounds) {
        this.zzax = latLngBounds;
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public final GoogleMapOptions m15039k0(boolean z) {
        this.zzas = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public final GoogleMapOptions m15040l0(boolean z) {
        this.zzat = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public final GoogleMapOptions m15041m0(int i) {
        this.mapType = i;
        return this;
    }

    /* JADX INFO: renamed from: n0 */
    public final GoogleMapOptions m15042n0(float f) {
        this.zzaw = Float.valueOf(f);
        return this;
    }

    /* JADX INFO: renamed from: o0 */
    public final GoogleMapOptions m15043o0(float f) {
        this.zzav = Float.valueOf(f);
        return this;
    }

    /* JADX INFO: renamed from: p0 */
    public final GoogleMapOptions m15044p0(boolean z) {
        this.zzar = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: q0 */
    public final GoogleMapOptions m15045q0(boolean z) {
        this.zzao = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: r0 */
    public final GoogleMapOptions m15046r0(boolean z) {
        this.zzay = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: s0 */
    public final GoogleMapOptions m15047s0(boolean z) {
        this.zzaq = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: t0 */
    public final GoogleMapOptions m15048t0(boolean z) {
        this.zzak = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.mapType)).add("LiteMode", this.zzas).add(MDLogTag.MOMENT_CAMERA_TAG, this.zzal).add("CompassEnabled", this.zzan).add("ZoomControlsEnabled", this.zzam).add("ScrollGesturesEnabled", this.zzao).add("ZoomGesturesEnabled", this.zzap).add("TiltGesturesEnabled", this.zzaq).add("RotateGesturesEnabled", this.zzar).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzay).add("MapToolbarEnabled", this.zzat).add("AmbientEnabled", this.zzau).add("MinZoomPreference", this.zzav).add("MaxZoomPreference", this.zzaw).add("LatLngBoundsForCameraTarget", this.zzax).add("ZOrderOnTop", this.zzaj).add("UseViewLifecycleInFragment", this.zzak).toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final GoogleMapOptions m15049u0(boolean z) {
        this.zzaj = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: v0 */
    public final GoogleMapOptions m15050v0(boolean z) {
        this.zzam = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: w0 */
    public final GoogleMapOptions m15051w0(boolean z) {
        this.zzap = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, w9r0.m205623a(this.zzaj));
        SafeParcelWriter.writeByte(parcel, 3, w9r0.m205623a(this.zzak));
        SafeParcelWriter.writeInt(parcel, 4, m15032J());
        SafeParcelWriter.writeParcelable(parcel, 5, m15030H(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, w9r0.m205623a(this.zzam));
        SafeParcelWriter.writeByte(parcel, 7, w9r0.m205623a(this.zzan));
        SafeParcelWriter.writeByte(parcel, 8, w9r0.m205623a(this.zzao));
        SafeParcelWriter.writeByte(parcel, 9, w9r0.m205623a(this.zzap));
        SafeParcelWriter.writeByte(parcel, 10, w9r0.m205623a(this.zzaq));
        SafeParcelWriter.writeByte(parcel, 11, w9r0.m205623a(this.zzar));
        SafeParcelWriter.writeByte(parcel, 12, w9r0.m205623a(this.zzas));
        SafeParcelWriter.writeByte(parcel, 14, w9r0.m205623a(this.zzat));
        SafeParcelWriter.writeByte(parcel, 15, w9r0.m205623a(this.zzau));
        SafeParcelWriter.writeFloatObject(parcel, 16, m15037i0(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, m15035h0(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, m15031I(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, w9r0.m205623a(this.zzay));
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GoogleMapOptions() {
        this.mapType = -1;
        this.zzav = null;
        this.zzaw = null;
        this.zzax = null;
    }
}
