package com.google.android.libraries.places.internal;

import p153l.gig0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzpb extends zzpd {
    private static char[] zzd(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            gig0.m130323a("Cannot increase internal buffer any further");
            return null;
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    @Override // com.google.android.libraries.places.internal.zzpd
    public String zza(String str) {
        throw null;
    }

    public abstract char[] zzb(char c);

    public final String zzc(String str, int i) {
        int length;
        char[] cArrZza = zzpk.zza();
        int length2 = cArrZza.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = str.length();
            if (i >= length) {
                break;
            }
            int i4 = i + 1;
            char[] cArrZzb = zzb(str.charAt(i));
            if (cArrZzb != null) {
                int i5 = i - i2;
                int i6 = i3 + i5;
                int length3 = cArrZzb.length;
                int i7 = i6 + length3;
                if (length2 < i7) {
                    int i8 = length - i;
                    length2 = i7 + i8 + i8;
                    cArrZza = zzd(cArrZza, i3, length2);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, cArrZza, i3);
                    i3 = i6;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrZzb, 0, cArrZza, i3, length3);
                    i3 += length3;
                }
                i2 = i4;
            }
            i = i4;
        }
        int i9 = length - i2;
        if (i9 > 0) {
            int i10 = i9 + i3;
            if (length2 < i10) {
                cArrZza = zzd(cArrZza, i3, i10);
            }
            str.getChars(i2, length, cArrZza, i3);
            i3 = i10;
        }
        return new String(cArrZza, 0, i3);
    }
}
