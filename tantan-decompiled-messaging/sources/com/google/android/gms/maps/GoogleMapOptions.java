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
import com.p046p1.mobile.putong.data.User;
import p149l.j1r0;
import p149l.q0r0;
import p149l.w8c0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new j1r0();

    @SafeParcelable.Field(getter = "getMapType", m12463id = 4)
    private int mapType;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getZOrderOnTopForParcel", m12463id = 2, type = Constants.BYTE)
    private Boolean zzaj;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getUseViewLifecycleInFragmentForParcel", m12463id = 3, type = Constants.BYTE)
    private Boolean zzak;

    @SafeParcelable.Field(getter = "getCamera", m12463id = 5)
    private CameraPosition zzal;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getZoomControlsEnabledForParcel", m12463id = 6, type = Constants.BYTE)
    private Boolean zzam;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getCompassEnabledForParcel", m12463id = 7, type = Constants.BYTE)
    private Boolean zzan;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getScrollGesturesEnabledForParcel", m12463id = 8, type = Constants.BYTE)
    private Boolean zzao;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getZoomGesturesEnabledForParcel", m12463id = 9, type = Constants.BYTE)
    private Boolean zzap;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getTiltGesturesEnabledForParcel", m12463id = 10, type = Constants.BYTE)
    private Boolean zzaq;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getRotateGesturesEnabledForParcel", m12463id = 11, type = Constants.BYTE)
    private Boolean zzar;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getLiteModeForParcel", m12463id = 12, type = Constants.BYTE)
    private Boolean zzas;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getMapToolbarEnabledForParcel", m12463id = 14, type = Constants.BYTE)
    private Boolean zzat;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getAmbientEnabledForParcel", m12463id = 15, type = Constants.BYTE)
    private Boolean zzau;

    @SafeParcelable.Field(getter = "getMinZoomPreference", m12463id = 16)
    private Float zzav;

    @SafeParcelable.Field(getter = "getMaxZoomPreference", m12463id = 17)
    private Float zzaw;

    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", m12463id = 18)
    private LatLngBounds zzax;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", m12463id = 19, type = Constants.BYTE)
    private Boolean zzay;

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(m12464id = 2) byte b, @SafeParcelable.Param(m12464id = 3) byte b2, @SafeParcelable.Param(m12464id = 4) int i, @SafeParcelable.Param(m12464id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(m12464id = 6) byte b3, @SafeParcelable.Param(m12464id = 7) byte b4, @SafeParcelable.Param(m12464id = 8) byte b5, @SafeParcelable.Param(m12464id = 9) byte b6, @SafeParcelable.Param(m12464id = 10) byte b7, @SafeParcelable.Param(m12464id = 11) byte b8, @SafeParcelable.Param(m12464id = 12) byte b9, @SafeParcelable.Param(m12464id = 14) byte b10, @SafeParcelable.Param(m12464id = 15) byte b11, @SafeParcelable.Param(m12464id = 16) Float f, @SafeParcelable.Param(m12464id = 17) Float f2, @SafeParcelable.Param(m12464id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(m12464id = 19) byte b12) {
        this.mapType = -1;
        this.zzav = null;
        this.zzaw = null;
        this.zzax = null;
        this.zzaj = q0r0.m172340b(b);
        this.zzak = q0r0.m172340b(b2);
        this.mapType = i;
        this.zzal = cameraPosition;
        this.zzam = q0r0.m172340b(b3);
        this.zzan = q0r0.m172340b(b4);
        this.zzao = q0r0.m172340b(b5);
        this.zzap = q0r0.m172340b(b6);
        this.zzaq = q0r0.m172340b(b7);
        this.zzar = q0r0.m172340b(b8);
        this.zzas = q0r0.m172340b(b9);
        this.zzat = q0r0.m172340b(b10);
        this.zzau = q0r0.m172340b(b11);
        this.zzav = f;
        this.zzaw = f2;
        this.zzax = latLngBounds;
        this.zzay = q0r0.m172340b(b12);
    }

    /* JADX INFO: renamed from: F */
    public static GoogleMapOptions m14973F(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w8c0.f185176a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(w8c0.f185190o)) {
            googleMapOptions.m14987l0(typedArrayObtainAttributes.getInt(w8c0.f185190o, -1));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185200y)) {
            googleMapOptions.m14995t0(typedArrayObtainAttributes.getBoolean(w8c0.f185200y, false));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185199x)) {
            googleMapOptions.m14994s0(typedArrayObtainAttributes.getBoolean(w8c0.f185199x, false));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185191p)) {
            googleMapOptions.m14983i(typedArrayObtainAttributes.getBoolean(w8c0.f185191p, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185193r)) {
            googleMapOptions.m14990o0(typedArrayObtainAttributes.getBoolean(w8c0.f185193r, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185195t)) {
            googleMapOptions.m14992q0(typedArrayObtainAttributes.getBoolean(w8c0.f185195t, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185194s)) {
            googleMapOptions.m14991p0(typedArrayObtainAttributes.getBoolean(w8c0.f185194s, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185196u)) {
            googleMapOptions.m14993r0(typedArrayObtainAttributes.getBoolean(w8c0.f185196u, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185198w)) {
            googleMapOptions.m14997v0(typedArrayObtainAttributes.getBoolean(w8c0.f185198w, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185197v)) {
            googleMapOptions.m14996u0(typedArrayObtainAttributes.getBoolean(w8c0.f185197v, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185189n)) {
            googleMapOptions.m14985j0(typedArrayObtainAttributes.getBoolean(w8c0.f185189n, false));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185192q)) {
            googleMapOptions.m14986k0(typedArrayObtainAttributes.getBoolean(w8c0.f185192q, true));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185177b)) {
            googleMapOptions.m14979g(typedArrayObtainAttributes.getBoolean(w8c0.f185177b, false));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185180e)) {
            googleMapOptions.m14989n0(typedArrayObtainAttributes.getFloat(w8c0.f185180e, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185180e)) {
            googleMapOptions.m14988m0(typedArrayObtainAttributes.getFloat(w8c0.f185179d, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.m14984i0(m14974w0(context, attributeSet));
        googleMapOptions.m14981h(m14975x0(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    /* JADX INFO: renamed from: w0 */
    public static LatLngBounds m14974w0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w8c0.f185176a);
        Float fValueOf = typedArrayObtainAttributes.hasValue(w8c0.f185187l) ? Float.valueOf(typedArrayObtainAttributes.getFloat(w8c0.f185187l, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(w8c0.f185188m) ? Float.valueOf(typedArrayObtainAttributes.getFloat(w8c0.f185188m, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(w8c0.f185185j) ? Float.valueOf(typedArrayObtainAttributes.getFloat(w8c0.f185185j, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(w8c0.f185186k) ? Float.valueOf(typedArrayObtainAttributes.getFloat(w8c0.f185186k, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    /* JADX INFO: renamed from: x0 */
    public static CameraPosition m14975x0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w8c0.f185176a);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(w8c0.f185181f) ? typedArrayObtainAttributes.getFloat(w8c0.f185181f, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(w8c0.f185182g) ? typedArrayObtainAttributes.getFloat(w8c0.f185182g, 0.0f) : 0.0f);
        CameraPosition.C2445a c2445aM15033F = CameraPosition.m15033F();
        c2445aM15033F.m15036c(latLng);
        if (typedArrayObtainAttributes.hasValue(w8c0.f185184i)) {
            c2445aM15033F.m15038e(typedArrayObtainAttributes.getFloat(w8c0.f185184i, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185178c)) {
            c2445aM15033F.m15034a(typedArrayObtainAttributes.getFloat(w8c0.f185178c, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(w8c0.f185183h)) {
            c2445aM15033F.m15037d(typedArrayObtainAttributes.getFloat(w8c0.f185183h, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return c2445aM15033F.m15035b();
    }

    /* JADX INFO: renamed from: H */
    public final CameraPosition m14976H() {
        return this.zzal;
    }

    /* JADX INFO: renamed from: I */
    public final LatLngBounds m14977I() {
        return this.zzax;
    }

    /* JADX INFO: renamed from: J */
    public final int m14978J() {
        return this.mapType;
    }

    /* JADX INFO: renamed from: g */
    public final GoogleMapOptions m14979g(boolean z) {
        this.zzau = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public final Float m14980g0() {
        return this.zzaw;
    }

    /* JADX INFO: renamed from: h */
    public final GoogleMapOptions m14981h(CameraPosition cameraPosition) {
        this.zzal = cameraPosition;
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final Float m14982h0() {
        return this.zzav;
    }

    /* JADX INFO: renamed from: i */
    public final GoogleMapOptions m14983i(boolean z) {
        this.zzan = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: i0 */
    public final GoogleMapOptions m14984i0(LatLngBounds latLngBounds) {
        this.zzax = latLngBounds;
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public final GoogleMapOptions m14985j0(boolean z) {
        this.zzas = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public final GoogleMapOptions m14986k0(boolean z) {
        this.zzat = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public final GoogleMapOptions m14987l0(int i) {
        this.mapType = i;
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public final GoogleMapOptions m14988m0(float f) {
        this.zzaw = Float.valueOf(f);
        return this;
    }

    /* JADX INFO: renamed from: n0 */
    public final GoogleMapOptions m14989n0(float f) {
        this.zzav = Float.valueOf(f);
        return this;
    }

    /* JADX INFO: renamed from: o0 */
    public final GoogleMapOptions m14990o0(boolean z) {
        this.zzar = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: p0 */
    public final GoogleMapOptions m14991p0(boolean z) {
        this.zzao = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: q0 */
    public final GoogleMapOptions m14992q0(boolean z) {
        this.zzay = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: r0 */
    public final GoogleMapOptions m14993r0(boolean z) {
        this.zzaq = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: s0 */
    public final GoogleMapOptions m14994s0(boolean z) {
        this.zzak = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: t0 */
    public final GoogleMapOptions m14995t0(boolean z) {
        this.zzaj = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.mapType)).add("LiteMode", this.zzas).add(MDLogTag.MOMENT_CAMERA_TAG, this.zzal).add("CompassEnabled", this.zzan).add("ZoomControlsEnabled", this.zzam).add("ScrollGesturesEnabled", this.zzao).add("ZoomGesturesEnabled", this.zzap).add("TiltGesturesEnabled", this.zzaq).add("RotateGesturesEnabled", this.zzar).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzay).add("MapToolbarEnabled", this.zzat).add("AmbientEnabled", this.zzau).add("MinZoomPreference", this.zzav).add("MaxZoomPreference", this.zzaw).add("LatLngBoundsForCameraTarget", this.zzax).add("ZOrderOnTop", this.zzaj).add("UseViewLifecycleInFragment", this.zzak).toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final GoogleMapOptions m14996u0(boolean z) {
        this.zzam = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: v0 */
    public final GoogleMapOptions m14997v0(boolean z) {
        this.zzap = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, q0r0.m172339a(this.zzaj));
        SafeParcelWriter.writeByte(parcel, 3, q0r0.m172339a(this.zzak));
        SafeParcelWriter.writeInt(parcel, 4, m14978J());
        SafeParcelWriter.writeParcelable(parcel, 5, m14976H(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, q0r0.m172339a(this.zzam));
        SafeParcelWriter.writeByte(parcel, 7, q0r0.m172339a(this.zzan));
        SafeParcelWriter.writeByte(parcel, 8, q0r0.m172339a(this.zzao));
        SafeParcelWriter.writeByte(parcel, 9, q0r0.m172339a(this.zzap));
        SafeParcelWriter.writeByte(parcel, 10, q0r0.m172339a(this.zzaq));
        SafeParcelWriter.writeByte(parcel, 11, q0r0.m172339a(this.zzar));
        SafeParcelWriter.writeByte(parcel, 12, q0r0.m172339a(this.zzas));
        SafeParcelWriter.writeByte(parcel, 14, q0r0.m172339a(this.zzat));
        SafeParcelWriter.writeByte(parcel, 15, q0r0.m172339a(this.zzau));
        SafeParcelWriter.writeFloatObject(parcel, 16, m14982h0(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, m14980g0(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, m14977I(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, q0r0.m172339a(this.zzay));
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GoogleMapOptions() {
        this.mapType = -1;
        this.zzav = null;
        this.zzaw = null;
        this.zzax = null;
    }
}
