package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.b13;
import p149l.d9x0;
import p149l.ig3;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new d9x0();

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", m12463id = 14)
    private float alpha;

    @SafeParcelable.Field(getter = "getPosition", m12463id = 2)
    private LatLng position;

    @SafeParcelable.Field(getter = "getZIndex", m12463id = 15)
    private float zzcs;

    @SafeParcelable.Field(getter = "isVisible", m12463id = 9)
    private boolean zzct;

    @SafeParcelable.Field(getter = "getAnchorU", m12463id = 6)
    private float zzdb;

    @SafeParcelable.Field(getter = "getAnchorV", m12463id = 7)
    private float zzdc;

    @SafeParcelable.Field(getter = "getTitle", m12463id = 3)
    private String zzdn;

    @SafeParcelable.Field(getter = "getSnippet", m12463id = 4)
    private String zzdo;

    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", m12463id = 5, type = "android.os.IBinder")
    private b13 zzdp;

    @SafeParcelable.Field(getter = "isDraggable", m12463id = 8)
    private boolean zzdq;

    @SafeParcelable.Field(getter = "isFlat", m12463id = 10)
    private boolean zzdr;

    @SafeParcelable.Field(getter = "getRotation", m12463id = 11)
    private float zzds;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", m12463id = 12)
    private float zzdt;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", m12463id = 13)
    private float zzdu;

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(m12464id = 2) LatLng latLng, @SafeParcelable.Param(m12464id = 3) String str, @SafeParcelable.Param(m12464id = 4) String str2, @SafeParcelable.Param(m12464id = 5) IBinder iBinder, @SafeParcelable.Param(m12464id = 6) float f, @SafeParcelable.Param(m12464id = 7) float f2, @SafeParcelable.Param(m12464id = 8) boolean z, @SafeParcelable.Param(m12464id = 9) boolean z2, @SafeParcelable.Param(m12464id = 10) boolean z3, @SafeParcelable.Param(m12464id = 11) float f3, @SafeParcelable.Param(m12464id = 12) float f4, @SafeParcelable.Param(m12464id = 13) float f5, @SafeParcelable.Param(m12464id = 14) float f6, @SafeParcelable.Param(m12464id = 15) float f7) {
        this.zzdb = 0.5f;
        this.zzdc = 1.0f;
        this.zzct = true;
        this.zzdr = false;
        this.zzds = 0.0f;
        this.zzdt = 0.5f;
        this.zzdu = 0.0f;
        this.alpha = 1.0f;
        this.position = latLng;
        this.zzdn = str;
        this.zzdo = str2;
        if (iBinder == null) {
            this.zzdp = null;
        } else {
            this.zzdp = new b13(uyl.AbstractBinderC20541a.m196295O(iBinder));
        }
        this.zzdb = f;
        this.zzdc = f2;
        this.zzdq = z;
        this.zzct = z2;
        this.zzdr = z3;
        this.zzds = f3;
        this.zzdt = f4;
        this.zzdu = f5;
        this.alpha = f6;
        this.zzcs = f7;
    }

    /* JADX INFO: renamed from: F */
    public final float m15039F() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: H */
    public final float m15040H() {
        return this.zzdb;
    }

    /* JADX INFO: renamed from: I */
    public final float m15041I() {
        return this.zzdc;
    }

    /* JADX INFO: renamed from: J */
    public final float m15042J() {
        return this.zzdt;
    }

    /* JADX INFO: renamed from: g */
    public final MarkerOptions m15043g(float f, float f2) {
        this.zzdb = f;
        this.zzdc = f2;
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public final float m15044g0() {
        return this.zzdu;
    }

    /* JADX INFO: renamed from: h */
    public final MarkerOptions m15045h(boolean z) {
        this.zzdq = z;
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final LatLng m15046h0() {
        return this.position;
    }

    /* JADX INFO: renamed from: i0 */
    public final float m15047i0() {
        return this.zzds;
    }

    /* JADX INFO: renamed from: j0 */
    public final String m15048j0() {
        return this.zzdo;
    }

    /* JADX INFO: renamed from: k0 */
    public final String m15049k0() {
        return this.zzdn;
    }

    /* JADX INFO: renamed from: l0 */
    public final float m15050l0() {
        return this.zzcs;
    }

    /* JADX INFO: renamed from: m0 */
    public final MarkerOptions m15051m0(@Nullable b13 b13Var) {
        this.zzdp = b13Var;
        return this;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m15052n0() {
        return this.zzdq;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m15053o0() {
        return this.zzdr;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m15054p0() {
        return this.zzct;
    }

    /* JADX INFO: renamed from: q0 */
    public final MarkerOptions m15055q0(@NonNull LatLng latLng) {
        if (latLng != null) {
            this.position = latLng;
            return this;
        }
        ig3.m135964a("latlng cannot be null - a position is required.");
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final MarkerOptions m15056r0(float f) {
        this.zzcs = f;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m15046h0(), i, false);
        SafeParcelWriter.writeString(parcel, 3, m15049k0(), false);
        SafeParcelWriter.writeString(parcel, 4, m15048j0(), false);
        b13 b13Var = this.zzdp;
        SafeParcelWriter.writeIBinder(parcel, 5, b13Var == null ? null : b13Var.m99807a().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, m15040H());
        SafeParcelWriter.writeFloat(parcel, 7, m15041I());
        SafeParcelWriter.writeBoolean(parcel, 8, m15052n0());
        SafeParcelWriter.writeBoolean(parcel, 9, m15054p0());
        SafeParcelWriter.writeBoolean(parcel, 10, m15053o0());
        SafeParcelWriter.writeFloat(parcel, 11, m15047i0());
        SafeParcelWriter.writeFloat(parcel, 12, m15042J());
        SafeParcelWriter.writeFloat(parcel, 13, m15044g0());
        SafeParcelWriter.writeFloat(parcel, 14, m15039F());
        SafeParcelWriter.writeFloat(parcel, 15, m15050l0());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public MarkerOptions() {
        this.zzdb = 0.5f;
        this.zzdc = 1.0f;
        this.zzct = true;
        this.zzdr = false;
        this.zzds = 0.0f;
        this.zzdt = 0.5f;
        this.zzdu = 0.0f;
        this.alpha = 1.0f;
    }
}
