package com.google.android.libraries.places.internal;

import com.facebook.AuthenticationTokenClaims;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbca {
    private static final BitSet zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;
    private final Object zze;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        zza = bitSet;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[SYNTHETIC] */
    public /* synthetic */ zzbca(String str, boolean z, Object obj, zzbbz zzbbzVar) {
        this.zzb = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zzmt.zzc(lowerCase, AuthenticationTokenClaims.JSON_KEY_NAME);
        zzmt.zzf(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            zzbcf.zzd.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char cCharAt = lowerCase.charAt(i);
            if (z && cCharAt == ':') {
                if (i == 0) {
                    i = 0;
                } else {
                    cCharAt = ':';
                    if (zza.get(cCharAt)) {
                        wg3.m206174a(zznb.zzb("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                        throw null;
                    }
                }
            } else if (zza.get(cCharAt)) {
                wg3.m206174a(zznb.zzb("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                throw null;
            }
            i++;
        }
        this.zzc = lowerCase;
        this.zzd = lowerCase.getBytes(zzmb.zza);
        this.zze = obj;
    }

    public static zzbca zzc(String str, zzbbx zzbbxVar) {
        return new zzbbw(str, false, zzbbxVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzc.equals(((zzbca) obj).zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.zzc + "'}";
    }

    public abstract Object zza(byte[] bArr);

    public abstract byte[] zzb(Object obj);

    public final String zzd() {
        return this.zzc;
    }

    public final byte[] zze() {
        return this.zzd;
    }
}
