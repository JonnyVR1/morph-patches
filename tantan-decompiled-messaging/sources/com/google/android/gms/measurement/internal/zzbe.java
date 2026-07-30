package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Iterator;
import p149l.i7s0;
import p149l.n4s0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new i7s0();

    @SafeParcelable.Field(getter = BaseSei.f13932Z, m12463id = 2)
    private final Bundle zza;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(m12464id = 2) Bundle bundle) {
        this.zza = bundle;
    }

    /* JADX INFO: renamed from: F */
    public final Bundle m15324F() {
        return new Bundle(this.zza);
    }

    /* JADX INFO: renamed from: H */
    public final Long m15325H(String str) {
        return Long.valueOf(this.zza.getLong(str));
    }

    /* JADX INFO: renamed from: I */
    public final Object m15326I(String str) {
        return this.zza.get(str);
    }

    /* JADX INFO: renamed from: J */
    public final String m15327J(String str) {
        return this.zza.getString(str);
    }

    /* JADX INFO: renamed from: h */
    public final Double m15328h(String str) {
        return Double.valueOf(this.zza.getDouble(str));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new n4s0(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, m15324F(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza.size();
    }
}
