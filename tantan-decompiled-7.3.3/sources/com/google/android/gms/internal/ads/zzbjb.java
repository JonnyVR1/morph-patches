package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.kfl0;
import p153l.pd20;
import p153l.qd20;
import p153l.qks0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
public final class zzbjb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjb> CREATOR = new qks0();

    @SafeParcelable.Field(m12517id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    public final boolean zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final int zzc;

    @SafeParcelable.Field(m12517id = 4)
    public final boolean zzd;

    @SafeParcelable.Field(m12517id = 5)
    public final int zze;

    @Nullable
    @SafeParcelable.Field(m12517id = 6)
    public final zzfk zzf;

    @SafeParcelable.Field(m12517id = 7)
    public final boolean zzg;

    @SafeParcelable.Field(m12517id = 8)
    public final int zzh;

    @SafeParcelable.Field(m12517id = 9)
    public final int zzi;

    @SafeParcelable.Field(m12517id = 10)
    public final boolean zzj;

    @SafeParcelable.Field(m12517id = 11)
    public final int zzk;

    @Deprecated
    public zzbjb(@NonNull pd20 pd20Var) {
        this(4, pd20Var.m171765f(), pd20Var.m171761b(), pd20Var.m171764e(), pd20Var.m171760a(), pd20Var.m171763d() != null ? new zzfk(pd20Var.m171763d()) : null, pd20Var.m171766g(), pd20Var.m171762c(), 0, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @NonNull
    /* JADX INFO: renamed from: g */
    public static qd20 m13601g(@Nullable zzbjb zzbjbVar) {
        qd20.C19553a c19553a = new qd20.C19553a();
        if (zzbjbVar == null) {
            return c19553a.m176145a();
        }
        int i = zzbjbVar.zza;
        int i2 = 2;
        if (i == 2) {
            c19553a.m176147c(zzbjbVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    c19553a.m176149e(zzbjbVar.zzg);
                    c19553a.m176148d(zzbjbVar.zzh);
                    c19553a.m176146b(zzbjbVar.zzi, zzbjbVar.zzj);
                    int i3 = zzbjbVar.zzk;
                    if (i3 == 0) {
                        i2 = 1;
                    } else if (i3 == 2) {
                        i2 = 3;
                    } else if (i3 != 1) {
                        i2 = 1;
                    }
                    c19553a.m176153q(i2);
                }
            }
            zzfk zzfkVar = zzbjbVar.zzf;
            if (zzfkVar != null) {
                c19553a.m176152h(new kfl0(zzfkVar));
            }
            c19553a.m176147c(zzbjbVar.zze);
        }
        c19553a.m176151g(zzbjbVar.zzb);
        c19553a.m176150f(zzbjbVar.zzd);
        return c19553a.m176145a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbjb(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) boolean z, @SafeParcelable.Param(m12518id = 3) int i2, @SafeParcelable.Param(m12518id = 4) boolean z2, @SafeParcelable.Param(m12518id = 5) int i3, @SafeParcelable.Param(m12518id = 6) zzfk zzfkVar, @SafeParcelable.Param(m12518id = 7) boolean z3, @SafeParcelable.Param(m12518id = 8) int i4, @SafeParcelable.Param(m12518id = 9) int i5, @SafeParcelable.Param(m12518id = 10) boolean z4, @SafeParcelable.Param(m12518id = 11) int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzfkVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }
}
