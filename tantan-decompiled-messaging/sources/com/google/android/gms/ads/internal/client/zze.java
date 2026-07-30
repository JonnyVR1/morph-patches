package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.f70;
import p149l.hpv0;
import p149l.irv;
import p149l.kxc0;
import p149l.ncu0;
import p149l.z9u0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdErrorParcelCreator")
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new hpv0();

    @SafeParcelable.Field(m12463id = 1)
    public final int zza;

    @SafeParcelable.Field(m12463id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final String zzc;

    @Nullable
    @SafeParcelable.Field(m12463id = 4)
    public zze zzd;

    @Nullable
    @SafeParcelable.Field(m12463id = 5, type = "android.os.IBinder")
    public IBinder zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) String str, @SafeParcelable.Param(m12464id = 3) String str2, @Nullable @SafeParcelable.Param(m12464id = 4) zze zzeVar, @Nullable @SafeParcelable.Param(m12464id = 5) IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public final f70 m12250F() {
        f70 f70Var;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            f70Var = null;
        } else {
            String str = zzeVar.zzc;
            f70Var = new f70(zzeVar.zza, zzeVar.zzb, str);
        }
        return new f70(this.zza, this.zzb, this.zzc, f70Var);
    }

    /* JADX INFO: renamed from: H */
    public final irv m12251H() {
        f70 f70Var;
        zze zzeVar = this.zzd;
        ncu0 z9u0Var = null;
        if (zzeVar == null) {
            f70Var = null;
        } else {
            f70Var = new f70(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            z9u0Var = iInterfaceQueryLocalInterface instanceof ncu0 ? (ncu0) iInterfaceQueryLocalInterface : new z9u0(iBinder);
        }
        return new irv(i, str, str2, f70Var, kxc0.m147729d(z9u0Var));
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
