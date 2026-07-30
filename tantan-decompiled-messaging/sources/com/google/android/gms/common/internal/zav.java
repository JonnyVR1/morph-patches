package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    @SafeParcelable.VersionField(m12466id = 1)
    final int zaa;

    @Nullable
    @SafeParcelable.Field(m12463id = 2)
    final IBinder zab;

    @SafeParcelable.Field(getter = "getConnectionResult", m12463id = 3)
    private final ConnectionResult zac;

    @SafeParcelable.Field(getter = "getSaveDefaultAccount", m12463id = 4)
    private final boolean zad;

    @SafeParcelable.Field(getter = "isFromCrossClientAuth", m12463id = 5)
    private final boolean zae;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(m12464id = 1) int i, @Nullable @SafeParcelable.Param(m12464id = 2) IBinder iBinder, @SafeParcelable.Param(m12464id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(m12464id = 4) boolean z, @SafeParcelable.Param(m12464id = 5) boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.zac.equals(zavVar.zac) && Objects.equal(zab(), zavVar.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zac;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }
}
