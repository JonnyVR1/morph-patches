package com.google.android.libraries.places.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.fig0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbwn {

    @NotNull
    public static final zzbwm zza = new zzbwm(null);

    @JvmField
    @NotNull
    public final byte[] zzb;

    @JvmField
    public int zzc;

    @JvmField
    public int zzd;

    @JvmField
    public boolean zze;

    @JvmField
    public final boolean zzf;

    @JvmField
    @Nullable
    public zzbwn zzg;

    @JvmField
    @Nullable
    public zzbwn zzh;

    public zzbwn(@NotNull byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
        this.zze = z;
        this.zzf = false;
    }

    @Nullable
    public final zzbwn zza() {
        zzbwn zzbwnVar = this.zzg;
        if (zzbwnVar == this) {
            zzbwnVar = null;
        }
        zzbwn zzbwnVar2 = this.zzh;
        zzbwnVar2.getClass();
        zzbwnVar2.zzg = this.zzg;
        zzbwn zzbwnVar3 = this.zzg;
        zzbwnVar3.getClass();
        zzbwnVar3.zzh = this.zzh;
        this.zzg = null;
        this.zzh = null;
        return zzbwnVar;
    }

    @NotNull
    public final zzbwn zzb(@NotNull zzbwn zzbwnVar) {
        zzbwnVar.getClass();
        zzbwnVar.zzh = this;
        zzbwnVar.zzg = this.zzg;
        zzbwn zzbwnVar2 = this.zzg;
        zzbwnVar2.getClass();
        zzbwnVar2.zzh = zzbwnVar;
        this.zzg = zzbwnVar;
        return zzbwnVar;
    }

    @NotNull
    public final zzbwn zzc() {
        this.zze = true;
        return new zzbwn(this.zzb, this.zzc, this.zzd, true, false);
    }

    @NotNull
    public final zzbwn zzd(int i) {
        zzbwn zzbwnVarZza;
        if (i > this.zzd - this.zzc) {
            wg3.m206174a("byteCount out of range");
            return null;
        }
        if (i >= 1024) {
            zzbwnVarZza = zzc();
        } else {
            byte[] bArr = this.zzb;
            zzbwnVarZza = zzbwo.zza();
            byte[] bArr2 = zzbwnVarZza.zzb;
            int i2 = this.zzc;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        zzbwnVarZza.zzd = zzbwnVarZza.zzc + i;
        this.zzc += i;
        zzbwn zzbwnVar = this.zzh;
        zzbwnVar.getClass();
        zzbwnVar.zzb(zzbwnVarZza);
        return zzbwnVarZza;
    }

    public final void zze(@NotNull zzbwn zzbwnVar, int i) {
        zzbwnVar.getClass();
        if (!zzbwnVar.zzf) {
            wtq0.m207906a("only owner can write");
            return;
        }
        int i2 = zzbwnVar.zzd;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zzbwnVar.zze) {
                fig0.m125680a();
                return;
            }
            int i4 = zzbwnVar.zzc;
            if (i3 - i4 > 8192) {
                fig0.m125680a();
                return;
            }
            byte[] bArr = zzbwnVar.zzb;
            ArraysKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            i2 = zzbwnVar.zzd - zzbwnVar.zzc;
            zzbwnVar.zzd = i2;
            zzbwnVar.zzc = 0;
        }
        byte[] bArr2 = this.zzb;
        byte[] bArr3 = zzbwnVar.zzb;
        int i5 = this.zzc;
        ArraysKt.copyInto(bArr2, bArr3, i2, i5, i5 + i);
        zzbwnVar.zzd += i;
        this.zzc += i;
    }

    public zzbwn() {
        this.zzb = new byte[8192];
        this.zzf = true;
        this.zze = false;
    }
}
