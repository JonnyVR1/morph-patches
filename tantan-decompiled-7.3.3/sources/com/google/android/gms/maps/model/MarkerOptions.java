package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.jix0;
import p153l.p1m;
import p153l.q13;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new jix0();

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", m12517id = 14)
    private float alpha;

    @SafeParcelable.Field(getter = "getPosition", m12517id = 2)
    private LatLng position;

    @SafeParcelable.Field(getter = "getZIndex", m12517id = 15)
    private float zzcs;

    @SafeParcelable.Field(getter = "isVisible", m12517id = 9)
    private boolean zzct;

    @SafeParcelable.Field(getter = "getAnchorU", m12517id = 6)
    private float zzdb;

    @SafeParcelable.Field(getter = "getAnchorV", m12517id = 7)
    private float zzdc;

    @SafeParcelable.Field(getter = "getTitle", m12517id = 3)
    private String zzdn;

    @SafeParcelable.Field(getter = "getSnippet", m12517id = 4)
    private String zzdo;

    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", m12517id = 5, type = "android.os.IBinder")
    private q13 zzdp;

    @SafeParcelable.Field(getter = "isDraggable", m12517id = 8)
    private boolean zzdq;

    @SafeParcelable.Field(getter = "isFlat", m12517id = 10)
    private boolean zzdr;

    @SafeParcelable.Field(getter = "getRotation", m12517id = 11)
    private float zzds;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", m12517id = 12)
    private float zzdt;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", m12517id = 13)
    private float zzdu;

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(m12518id = 2) LatLng latLng, @SafeParcelable.Param(m12518id = 3) String str, @SafeParcelable.Param(m12518id = 4) String str2, @SafeParcelable.Param(m12518id = 5) IBinder iBinder, @SafeParcelable.Param(m12518id = 6) float f, @SafeParcelable.Param(m12518id = 7) float f2, @SafeParcelable.Param(m12518id = 8) boolean z, @SafeParcelable.Param(m12518id = 9) boolean z2, @SafeParcelable.Param(m12518id = 10) boolean z3, @SafeParcelable.Param(m12518id = 11) float f3, @SafeParcelable.Param(m12518id = 12) float f4, @SafeParcelable.Param(m12518id = 13) float f5, @SafeParcelable.Param(m12518id = 14) float f6, @SafeParcelable.Param(m12518id = 15) float f7) {
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
            this.zzdp = new q13(p1m.AbstractBinderC19271a.m170217O(iBinder));
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
    public final float m15093F() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: H */
    public final float m15094H() {
        return this.zzdb;
    }

    /* JADX INFO: renamed from: I */
    public final float m15095I() {
        return this.zzdc;
    }

    /* JADX INFO: renamed from: J */
    public final float m15096J() {
        return this.zzdt;
    }

    /* JADX INFO: renamed from: g */
    public final MarkerOptions m15097g(float f, float f2) {
        this.zzdb = f;
        this.zzdc = f2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final MarkerOptions m15098h(boolean z) {
        this.zzdq = z;
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final float m15099h0() {
        return this.zzdu;
    }

    /* JADX INFO: renamed from: i0 */
    public final LatLng m15100i0() {
        return this.position;
    }

    /* JADX INFO: renamed from: j0 */
    public final float m15101j0() {
        return this.zzds;
    }

    /* JADX INFO: renamed from: k0 */
    public final String m15102k0() {
        return this.zzdo;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m15103l0() {
        return this.zzdn;
    }

    /* JADX INFO: renamed from: m0 */
    public final float m15104m0() {
        return this.zzcs;
    }

    /* JADX INFO: renamed from: n0 */
    public final MarkerOptions m15105n0(@Nullable q13 q13Var) {
        this.zzdp = q13Var;
        return this;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m15106o0() {
        return this.zzdq;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m15107p0() {
        return this.zzdr;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m15108q0() {
        return this.zzct;
    }

    /* JADX INFO: renamed from: r0 */
    public final MarkerOptions m15109r0(@NonNull LatLng latLng) {
        if (latLng != null) {
            this.position = latLng;
            return this;
        }
        wg3.m206174a("latlng cannot be null - a position is required.");
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public final MarkerOptions m15110s0(float f) {
        this.zzcs = f;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m15100i0(), i, false);
        SafeParcelWriter.writeString(parcel, 3, m15103l0(), false);
        SafeParcelWriter.writeString(parcel, 4, m15102k0(), false);
        q13 q13Var = this.zzdp;
        SafeParcelWriter.writeIBinder(parcel, 5, q13Var == null ? null : q13Var.m174812a().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, m15094H());
        SafeParcelWriter.writeFloat(parcel, 7, m15095I());
        SafeParcelWriter.writeBoolean(parcel, 8, m15106o0());
        SafeParcelWriter.writeBoolean(parcel, 9, m15108q0());
        SafeParcelWriter.writeBoolean(parcel, 10, m15107p0());
        SafeParcelWriter.writeFloat(parcel, 11, m15101j0());
        SafeParcelWriter.writeFloat(parcel, 12, m15096J());
        SafeParcelWriter.writeFloat(parcel, 13, m15099h0());
        SafeParcelWriter.writeFloat(parcel, 14, m15093F());
        SafeParcelWriter.writeFloat(parcel, 15, m15104m0());
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
