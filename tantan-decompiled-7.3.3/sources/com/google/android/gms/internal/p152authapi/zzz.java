package com.google.android.gms.internal.p152authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.b5z0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SaveRequestCreator")
@SafeParcelable.Reserved({1000})
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new b5z0();

    @SafeParcelable.Field(getter = "getCredential", m12517id = 1)
    private final Credential zzam;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(m12518id = 1) Credential credential) {
        this.zzam = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzam, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
