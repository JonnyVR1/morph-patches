package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.g6l0;
import p149l.h520;
import p149l.i520;
import p149l.kbs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
public final class zzbjb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjb> CREATOR = new kbs0();

    @SafeParcelable.Field(m12463id = 1)
    public final int zza;

    @SafeParcelable.Field(m12463id = 2)
    public final boolean zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final int zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final boolean zzd;

    @SafeParcelable.Field(m12463id = 5)
    public final int zze;

    @Nullable
    @SafeParcelable.Field(m12463id = 6)
    public final zzfk zzf;

    @SafeParcelable.Field(m12463id = 7)
    public final boolean zzg;

    @SafeParcelable.Field(m12463id = 8)
    public final int zzh;

    @SafeParcelable.Field(m12463id = 9)
    public final int zzi;

    @SafeParcelable.Field(m12463id = 10)
    public final boolean zzj;

    @SafeParcelable.Field(m12463id = 11)
    public final int zzk;

    @Deprecated
    public zzbjb(@NonNull h520 h520Var) {
        this(4, h520Var.m129357f(), h520Var.m129353b(), h520Var.m129356e(), h520Var.m129352a(), h520Var.m129355d() != null ? new zzfk(h520Var.m129355d()) : null, h520Var.m129358g(), h520Var.m129354c(), 0, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @NonNull
    /* JADX INFO: renamed from: g */
    public static i520 m13547g(@Nullable zzbjb zzbjbVar) {
        i520.C17483a c17483a = new i520.C17483a();
        if (zzbjbVar == null) {
            return c17483a.m134459a();
        }
        int i = zzbjbVar.zza;
        int i2 = 2;
        if (i == 2) {
            c17483a.m134461c(zzbjbVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    c17483a.m134463e(zzbjbVar.zzg);
                    c17483a.m134462d(zzbjbVar.zzh);
                    c17483a.m134460b(zzbjbVar.zzi, zzbjbVar.zzj);
                    int i3 = zzbjbVar.zzk;
                    if (i3 == 0) {
                        i2 = 1;
                    } else if (i3 == 2) {
                        i2 = 3;
                    } else if (i3 != 1) {
                        i2 = 1;
                    }
                    c17483a.m134467q(i2);
                }
            }
            zzfk zzfkVar = zzbjbVar.zzf;
            if (zzfkVar != null) {
                c17483a.m134466h(new g6l0(zzfkVar));
            }
            c17483a.m134461c(zzbjbVar.zze);
        }
        c17483a.m134465g(zzbjbVar.zzb);
        c17483a.m134464f(zzbjbVar.zzd);
        return c17483a.m134459a();
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
    public zzbjb(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) boolean z, @SafeParcelable.Param(m12464id = 3) int i2, @SafeParcelable.Param(m12464id = 4) boolean z2, @SafeParcelable.Param(m12464id = 5) int i3, @SafeParcelable.Param(m12464id = 6) zzfk zzfkVar, @SafeParcelable.Param(m12464id = 7) boolean z3, @SafeParcelable.Param(m12464id = 8) int i4, @SafeParcelable.Param(m12464id = 9) int i5, @SafeParcelable.Param(m12464id = 10) boolean z4, @SafeParcelable.Param(m12464id = 11) int i6) {
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
