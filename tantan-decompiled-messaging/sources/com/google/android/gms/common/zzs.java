package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.s050;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(getter = "getCallingPackage", m12463id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getCallingCertificateBinder", m12463id = 2, type = "android.os.IBinder")
    private final zzj zzb;

    @SafeParcelable.Field(getter = "getAllowTestKeys", m12463id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", m12463id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) IBinder iBinder, @SafeParcelable.Param(m12464id = 3) boolean z, @SafeParcelable.Param(m12464id = 4) boolean z2) {
        this.zza = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                uyl uylVarZzd = com.google.android.gms.common.internal.zzz.zzg(iBinder).zzd();
                byte[] bArr = uylVarZzd == null ? null : (byte[]) s050.m181847P2(uylVarZzd);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zzkVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        zzj zzjVar = this.zzb;
        if (zzjVar == null) {
            zzjVar = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzjVar, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzs(String str, zzj zzjVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzjVar;
        this.zzc = z;
        this.zzd = z2;
    }
}
