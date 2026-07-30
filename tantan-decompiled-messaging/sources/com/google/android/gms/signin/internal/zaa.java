package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.txq0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new txq0();

    @SafeParcelable.VersionField(m12466id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getConnectionResultCode", m12463id = 2)
    private int zab;

    @Nullable
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", m12463id = 3)
    private Intent zac;

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) int i2, @Nullable @SafeParcelable.Param(m12464id = 3) Intent intent) {
        this.zaa = i;
        this.zab = i2;
        this.zac = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zab == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zaa() {
        this(2, 0, null);
    }
}
