package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.b70;
import p153l.fju0;
import p153l.jtv;
import p153l.n5d0;
import p153l.nyv0;
import p153l.tlu0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdErrorParcelCreator")
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new nyv0();

    @SafeParcelable.Field(m12517id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final String zzc;

    @Nullable
    @SafeParcelable.Field(m12517id = 4)
    public zze zzd;

    @Nullable
    @SafeParcelable.Field(m12517id = 5, type = "android.os.IBinder")
    public IBinder zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) String str2, @Nullable @SafeParcelable.Param(m12518id = 4) zze zzeVar, @Nullable @SafeParcelable.Param(m12518id = 5) IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public final b70 m12304F() {
        b70 b70Var;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            b70Var = null;
        } else {
            String str = zzeVar.zzc;
            b70Var = new b70(zzeVar.zza, zzeVar.zzb, str);
        }
        return new b70(this.zza, this.zzb, this.zzc, b70Var);
    }

    /* JADX INFO: renamed from: H */
    public final jtv m12305H() {
        b70 b70Var;
        zze zzeVar = this.zzd;
        tlu0 fju0Var = null;
        if (zzeVar == null) {
            b70Var = null;
        } else {
            b70Var = new b70(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            fju0Var = iInterfaceQueryLocalInterface instanceof tlu0 ? (tlu0) iInterfaceQueryLocalInterface : new fju0(iBinder);
        }
        return new jtv(i, str, str2, b70Var, n5d0.m161698d(fju0Var));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
