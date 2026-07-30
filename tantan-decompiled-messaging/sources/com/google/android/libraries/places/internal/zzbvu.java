package com.google.android.libraries.places.internal;

import kotlin.jvm.JvmName;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@JvmName
public final class zzbvu {

    @NotNull
    private static final byte[] zza;

    @NotNull
    private static final byte[] zzb;

    static {
        zzbwe zzbweVar = zzbwf.zza;
        zza = zzbwe.zza("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").zzn();
        zzb = zzbwe.zza("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").zzn();
    }

    public static /* synthetic */ String zza(byte[] bArr, byte[] bArr2, int i, Object obj) {
        byte[] bArr3 = zza;
        bArr.getClass();
        bArr3.getClass();
        int length = bArr.length;
        int i2 = length + 2;
        int i3 = length - (length % 3);
        byte[] bArr4 = new byte[(i2 / 3) * 4];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i5 + 3;
            byte b = bArr[i4];
            int i7 = i4 + 2;
            byte b2 = bArr[i4 + 1];
            i4 += 3;
            byte b3 = bArr[i7];
            bArr4[i5] = bArr3[(b & 255) >> 2];
            bArr4[i5 + 1] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr4[i5 + 2] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i5 += 4;
            bArr4[i6] = bArr3[b3 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - i3;
        if (length2 == 1) {
            byte b4 = bArr[i4];
            bArr4[i5] = bArr3[(b4 & 255) >> 2];
            bArr4[i5 + 1] = bArr3[(b4 & 3) << 4];
            bArr4[i5 + 2] = 61;
            bArr4[i5 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i4 + 1;
            byte b5 = bArr[i4];
            byte b6 = bArr[i8];
            bArr4[i5] = bArr3[(b5 & 255) >> 2];
            bArr4[i5 + 1] = bArr3[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr4[i5 + 2] = bArr3[(b6 & 15) << 2];
            bArr4[i5 + 3] = 61;
        }
        return zzbww.zza(bArr4);
    }
}
