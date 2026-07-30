package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaud {
    static final Charset zza = Charset.forName(CharEncoding.US_ASCII);
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzasq zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzasq.zzK(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a("messageType");
        return null;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
