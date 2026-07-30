package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import p149l.ig3;
import p149l.k250;
import p149l.qkq0;
import p149l.shg0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbug {
    String zza;
    String zzb;
    int zzc = -1;

    private static InetAddress zzf(String str, int i, int i2) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        byte[] bArr = new byte[16];
        int i3 = 1;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            InetAddress inetAddress3 = null;
            if (i3 < i2) {
                if (i6 == 16) {
                    return null;
                }
                int i7 = i3 + 2;
                if (i7 > i2 || !str.regionMatches(i3, "::", 0, 2)) {
                    if (i6 == 0) {
                        i5 = i3;
                    } else {
                        if (!str.regionMatches(i3, ":", 0, 1)) {
                            if (!str.regionMatches(i3, ".", 0, 1)) {
                                return null;
                            }
                            int i8 = i6 - 2;
                            int i9 = i8;
                            while (i5 < i2) {
                                if (i9 != 16) {
                                    if (i9 != i8) {
                                        if (str.charAt(i5) == '.') {
                                            i5++;
                                        }
                                    }
                                    int i10 = 0;
                                    int i11 = i5;
                                    while (true) {
                                        if (i11 >= i2) {
                                            inetAddress2 = inetAddress3;
                                            break;
                                        }
                                        char cCharAt = str.charAt(i11);
                                        inetAddress2 = inetAddress3;
                                        if (cCharAt < '0' || cCharAt > '9') {
                                            break;
                                        }
                                        if (i10 == 0) {
                                            if (i5 != i11) {
                                                return inetAddress2;
                                            }
                                            i10 = 0;
                                        }
                                        i10 = ((i10 * 10) + cCharAt) - 48;
                                        if (i10 > 255) {
                                            return inetAddress2;
                                        }
                                        i11++;
                                        inetAddress3 = inetAddress2;
                                    }
                                    if (i11 - i5 == 0) {
                                        return inetAddress2;
                                    }
                                    bArr[i9] = (byte) i10;
                                    inetAddress3 = inetAddress2;
                                    i9++;
                                    i5 = i11;
                                }
                                return inetAddress3;
                            }
                            inetAddress = inetAddress3;
                            if (i9 != i6 + 2) {
                                return inetAddress;
                            }
                            i6 += 2;
                            break;
                        }
                        i5 = i3 + 1;
                    }
                } else {
                    if (i4 != -1) {
                        return null;
                    }
                    i6 += 2;
                    if (i7 == i2) {
                        i4 = i6;
                    } else {
                        i4 = i6;
                        i5 = i7;
                    }
                }
                int i12 = 0;
                i3 = i5;
                while (i3 < i2) {
                    int iZza = zzbui.zza(str.charAt(i3));
                    if (iZza == -1) {
                        break;
                    }
                    i3++;
                    i12 = (i12 << 4) + iZza;
                }
                int i13 = i3 - i5;
                if (i13 == 0 || i13 > 4) {
                    return 0;
                }
                int i14 = i6 + 1;
                bArr[i6] = (byte) (255 & (i12 >>> 8));
                i6 += 2;
                bArr[i14] = (byte) (i12 & 255);
            }
            inetAddress = null;
            break;
        }
        if (i6 != 16) {
            if (i4 == -1) {
                return inetAddress;
            }
            int i15 = i6 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i4, (16 - i6) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            shg0.m184191a();
            return inetAddress;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zza);
        sb.append("://");
        if (this.zzb.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.zzb);
            sb.append(']');
        } else {
            sb.append(this.zzb);
        }
        int iZza = zza();
        if (iZza != zzbui.zzb(this.zza)) {
            sb.append(':');
            sb.append(iZza);
        }
        return sb.toString();
    }

    public final int zza() {
        int i = this.zzc;
        return i != -1 ? i : zzbui.zzb(this.zza);
    }

    public final zzbug zzb(String str) {
        int i;
        String strSubstring;
        String strZzi;
        if (str == null) {
            ig3.m135964a("host == null");
            return null;
        }
        int i2 = 0;
        int iCharCount = 0;
        while (true) {
            int length = str.length();
            i = -1;
            if (iCharCount >= length) {
                strSubstring = str.substring(0, length);
                break;
            }
            if (str.charAt(iCharCount) == '%') {
                zzbwb zzbwbVar = new zzbwb();
                zzbwbVar.zzt(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37) {
                        zzbwbVar.zzu(iCodePointAt);
                    } else {
                        int i3 = iCharCount + 2;
                        if (i3 < length) {
                            int iZza = zzbui.zza(str.charAt(iCharCount + 1));
                            int iZza2 = zzbui.zza(str.charAt(i3));
                            if (iZza != -1 && iZza2 != -1) {
                                zzbwbVar.zzm((iZza << 4) + iZza2);
                                iCharCount = i3;
                                iCodePointAt = 37;
                            }
                        }
                        iCodePointAt = 37;
                        zzbwbVar.zzu(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = zzbwbVar.zzi();
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith(Constants.AES_SUFFIX)) {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i2 >= lowerCase.length()) {
                            strZzi = lowerCase;
                            break;
                        }
                        char cCharAt = lowerCase.charAt(i2);
                        i2 = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i2 + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            strZzi = null;
            break;
        }
        InetAddress inetAddressZzf = zzf(strSubstring, 1, strSubstring.length() - 1);
        if (inetAddressZzf == null) {
            strZzi = null;
            break;
        }
        byte[] address = inetAddressZzf.getAddress();
        if (address.length != 16) {
            shg0.m184191a();
            return null;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            int i8 = i7 > i5 ? i7 : i5;
            if (i7 > i5) {
                i = i4;
            }
            i4 = i6 + 2;
            i5 = i8;
        }
        zzbwb zzbwbVar2 = new zzbwb();
        while (i2 < address.length) {
            if (i2 == i) {
                zzbwbVar2.zzm(58);
                i2 += i5;
                if (i2 == 16) {
                    zzbwbVar2.zzm(58);
                }
            } else {
                if (i2 > 0) {
                    zzbwbVar2.zzm(58);
                }
                zzbwbVar2.zzo(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        strZzi = zzbwbVar2.zzi();
        if (strZzi != null) {
            this.zzb = strZzi;
            return this;
        }
        ig3.m135964a("unexpected host: ".concat(str));
        return null;
    }

    public final zzbug zzc(int i) {
        if (i <= 0 || i > 65535) {
            k250.m144273a("unexpected port: ", i);
            return null;
        }
        this.zzc = i;
        return this;
    }

    public final zzbug zzd(String str) {
        this.zza = "https";
        return this;
    }

    public final zzbui zze() {
        if (this.zza == null) {
            qkq0.m175383a("scheme == null");
            return null;
        }
        if (this.zzb != null) {
            return new zzbui(this, null);
        }
        qkq0.m175383a("host == null");
        return null;
    }
}
