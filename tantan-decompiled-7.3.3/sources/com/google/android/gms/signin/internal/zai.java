package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;
import p153l.b8r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new b8r0();

    @SafeParcelable.VersionField(m12520id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getResolveAccountRequest", m12517id = 2)
    final zat zab;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) zat zatVar) {
        this.zaa = i;
        this.zab = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
