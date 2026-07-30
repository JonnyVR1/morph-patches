package com.google.android.libraries.places.internal;

import java.util.Locale;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
final class zzbty {
    private static final String[] zza = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] zzb = new String[64];
    private static final String[] zzc = new String[256];

    static {
        for (int i = 0; i < 256; i++) {
            zzc[i] = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        String[] strArr = zzb;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr2 = zzb;
            strArr2[i3 | 8] = String.valueOf(strArr2[i3]).concat("|PADDED");
        }
        String[] strArr3 = zzb;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr4 = zzb;
                strArr4[i8] = strArr4[i7] + "|" + strArr4[i5];
                strArr4[i8 | 8] = strArr4[i7] + "|" + strArr4[i5] + "|PADDED";
            }
        }
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr5 = zzb;
            if (strArr5[i9] == null) {
                strArr5[i9] = zzc[i9];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    public static String zza(boolean z, int i, int i2, byte b, byte b2) {
        String strReplace;
        String str = b < 10 ? zza[b] : String.format("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            strReplace = "";
        } else if (b == 2 || b == 3) {
            strReplace = zzc[b2];
        } else if (b == 4 || b == 6) {
            strReplace = b2 == 1 ? "ACK" : zzc[b2];
        } else if (b == 7 || b == 8) {
            strReplace = zzc[b2];
        } else {
            String str2 = b2 < 64 ? zzb[b2] : zzc[b2];
            if (b == 5) {
                if ((b2 & 4) != 0) {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                } else {
                    strReplace = str2;
                }
            } else if (b != 0 || (b2 & HttpTokens.SPACE) == 0) {
                strReplace = str2;
            } else {
                strReplace = str2.replace("PRIORITY", "COMPRESSED");
            }
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", true != z ? ">>" : "<<", Integer.valueOf(i), Integer.valueOf(i2), str, strReplace);
    }
}
