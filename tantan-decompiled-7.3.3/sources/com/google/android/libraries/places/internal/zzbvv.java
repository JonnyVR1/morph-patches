package com.google.android.libraries.places.internal;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@JvmName
@SourceDebugExtension
public final class zzbvv {

    @NotNull
    private static final zzbwa zza = new zzbwa();

    @NotNull
    public static final String zza(int i) {
        int i2 = 0;
        char[] cArr = {zzbwy.zza()[i >> 28], zzbwy.zza()[(i >> 24) & 15], zzbwy.zza()[(i >> 20) & 15], zzbwy.zza()[(i >> 16) & 15], zzbwy.zza()[(i >> 12) & 15], zzbwy.zza()[(i >> 8) & 15], zzbwy.zza()[(i >> 4) & 15], zzbwy.zza()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return C15493d.m94376s(cArr, i2, 8);
    }

    public static final void zzb(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean zzc(@NotNull byte[] bArr, int i, @NotNull byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
