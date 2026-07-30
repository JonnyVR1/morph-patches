package com.google.android.libraries.places.internal;

import java.io.IOException;
import p153l.gig0;
import p153l.tg3;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzsi {
    private static final zzsi zza = new zzsf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzsi zzb = new zzsf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzsi zzc = new zzsh("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzsi zzd = new zzsh("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzsi zze = new zzse("base16()", "0123456789ABCDEF");

    public static zzsi zzi() {
        return zze;
    }

    public static zzsi zzj() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzsg;

    public abstract void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzd(int i);

    public abstract int zze(int i);

    public abstract zzsi zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzk(byte[] bArr, int i, int i2) {
        zzmt.zzn(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zze(i2));
        try {
            zzc(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    public final byte[] zzl(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzd = zzd(charSequenceZzg.length());
            byte[] bArr = new byte[iZzd];
            int iZza = zza(bArr, charSequenceZzg);
            if (iZza == iZzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzsg e) {
            tg3.m191013a(e);
            return null;
        }
    }
}
