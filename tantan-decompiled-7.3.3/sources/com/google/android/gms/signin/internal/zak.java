package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
import p153l.e8r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e8r0();

    @SafeParcelable.VersionField(m12520id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getConnectionResult", m12517id = 2)
    private final ConnectionResult zab;

    @Nullable
    @SafeParcelable.Field(getter = "getResolveAccountResponse", m12517id = 3)
    private final zav zac;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) ConnectionResult connectionResult, @Nullable @SafeParcelable.Param(m12518id = 3) zav zavVar) {
        this.zaa = i;
        this.zab = connectionResult;
        this.zac = zavVar;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final zav m15414F() {
        return this.zac;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }
}
