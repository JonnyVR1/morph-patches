package com.google.android.libraries.places.internal;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.vic0;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public class zzbwf implements Serializable, Comparable {

    @NotNull
    public static final zzbwe zza = new zzbwe(null);

    @JvmField
    @NotNull
    public static final zzbwf zzb = new zzbwf(new byte[0]);

    @NotNull
    private final byte[] zzc;
    private transient int zzd;

    @Nullable
    private transient String zze;

    public zzbwf(@NotNull byte[] bArr) {
        bArr.getClass();
        this.zzc = bArr;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzbwf zzbwfVar = (zzbwf) obj;
        zzbwfVar.getClass();
        int iZzc = zzc();
        int iZzc2 = zzbwfVar.zzc();
        int iMin = Math.min(iZzc, iZzc2);
        for (int i = 0; i < iMin; i++) {
            int iZza = zza(i) & 255;
            int iZza2 = zzbwfVar.zza(i) & 255;
            if (iZza != iZza2) {
                return iZza >= iZza2 ? 1 : -1;
            }
        }
        if (iZzc == iZzc2) {
            return 0;
        }
        return iZzc >= iZzc2 ? 1 : -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbwf) {
            zzbwf zzbwfVar = (zzbwf) obj;
            int iZzc = zzbwfVar.zzc();
            byte[] bArr = this.zzc;
            int length = bArr.length;
            return iZzc == length && zzbwfVar.zzl(0, bArr, 0, length);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b A[EDGE_INSN: B:18:0x002b->B:126:0x014a BREAK  A[LOOP:0: B:7:0x000f->B:34:0x004f]] */
    @NotNull
    public String toString() {
        int i;
        zzbwf zzbwfVar = this;
        byte[] bArr = zzbwfVar.zzc;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        int i2 = zzbwy.zza;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b = bArr[i3];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        int i6 = i3 + 3;
                        if (length > i6) {
                            byte b2 = bArr[i3 + 1];
                            if ((b2 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            byte b3 = bArr[i3 + 2];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            byte b4 = bArr[i6];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            int i7 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
                            if (i7 <= 1114111) {
                                if (i7 >= 55296 && i7 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                }
                                if (i7 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i5 += 2;
                                    Unit unit = Unit.INSTANCE;
                                    i3 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    } else {
                        int i8 = i3 + 2;
                        if (length > i8) {
                            byte b5 = bArr[i3 + 1];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            byte b6 = bArr[i8];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            int i9 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b << 12);
                            if (i9 >= 2048) {
                                if (i9 >= 55296 && i9 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if (i9 == 65533) {
                                    i5 = -1;
                                    break;
                                }
                                i3 += 3;
                                i5 += i9 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.INSTANCE;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    }
                } else {
                    int i10 = i3 + 1;
                    if (length > i10) {
                        byte b7 = bArr[i10];
                        if ((b7 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        int i11 = (b << 6) ^ (b7 ^ 3968);
                        if (i11 >= 128) {
                            i = i4 + 1;
                            if (i4 != 64) {
                                if (i11 < 160 || i11 == 65533) {
                                    i5 = -1;
                                    break;
                                }
                                i3 += 2;
                                i5 += i11 < 65536 ? 1 : 2;
                                Unit unit3 = Unit.INSTANCE;
                                i4 = i;
                            } else {
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                }
            } else {
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (b == 10 || b == 13 || (b >= 32 && b < 127)) {
                    i5++;
                    i3++;
                    while (true) {
                        if (i3 >= length) {
                            continue;
                        } else {
                            byte b8 = bArr[i3];
                            if (b8 >= 0) {
                                i3++;
                                int i12 = i + 1;
                                if (i == 64) {
                                    break loop0;
                                }
                                if (b8 == 10 || b8 == 13 || (b8 >= 32 && b8 < 127)) {
                                    i5++;
                                    i = i12;
                                }
                            } else {
                                continue;
                            }
                        }
                        i4 = i;
                    }
                }
                i5 = -1;
                break;
            }
        }
        if (i5 != -1) {
            String strZzf = zzbwfVar.zzf();
            String strM94370F = C15493d.m94370F(C15493d.m94370F(C15493d.m94370F(strZzf.substring(0, i5), "\\", "\\\\", false, 4, null), SignParameters.NEW_LINE, "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (i5 >= strZzf.length()) {
                return "[text=" + strM94370F + Constants.AES_SUFFIX;
            }
            return "[size=" + zzbwfVar.zzc.length + " text=" + strM94370F + "…]";
        }
        byte[] bArr2 = zzbwfVar.zzc;
        int length2 = bArr2.length;
        if (length2 <= 64) {
            return "[hex=" + zzbwfVar.zze() + Constants.AES_SUFFIX;
        }
        int length3 = bArr2.length;
        if (length3 < 64) {
            vic0.m201333a("endIndex > length(", length3, ")");
            return null;
        }
        if (length3 != 64) {
            zzbwfVar = new zzbwf(ArraysKt.copyOfRange(bArr2, 0, 64));
        }
        return "[size=" + length2 + " hex=" + zzbwfVar.zze() + "…]";
    }

    public byte zza(int i) {
        return this.zzc[i];
    }

    public final int zzb() {
        return this.zzd;
    }

    public int zzc() {
        return this.zzc.length;
    }

    @NotNull
    public final String zzd() {
        return zzbvu.zza(this.zzc, null, 1, null);
    }

    @NotNull
    public String zze() {
        byte[] bArr = this.zzc;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            cArr[i] = zzbwy.zza()[(b >> 4) & 15];
            cArr[i + 1] = zzbwy.zza()[b & 15];
            i += 2;
        }
        return C15493d.m94375r(cArr);
    }

    @NotNull
    public final String zzf() {
        String str = this.zze;
        if (str != null) {
            return str;
        }
        String strZza = zzbww.zza(zzo());
        this.zze = strZza;
        return strZza;
    }

    @NotNull
    public zzbwf zzg() {
        int i = 0;
        while (true) {
            byte[] bArr = this.zzc;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                bArrCopyOf[i] = (byte) (b + HttpTokens.SPACE);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + HttpTokens.SPACE);
                    }
                    i2 = i3;
                }
                return new zzbwf(bArrCopyOf);
            }
            i = i2;
        }
    }

    public final void zzh(int i) {
        this.zzd = i;
    }

    public final void zzi(@Nullable String str) {
        this.zze = str;
    }

    public void zzj(@NotNull zzbwb zzbwbVar, int i, int i2) {
        zzbwbVar.getClass();
        int i3 = zzbwy.zza;
        zzbwbVar.getClass();
        zzbwbVar.zzl(this.zzc, 0, i2);
    }

    public boolean zzk(int i, @NotNull zzbwf zzbwfVar, int i2, int i3) {
        zzbwfVar.getClass();
        return zzbwfVar.zzl(0, this.zzc, 0, i3);
    }

    public boolean zzl(int i, @NotNull byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.zzc;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && zzbvv.zzc(bArr2, i, bArr, i2, i3);
    }

    public final boolean zzm(@NotNull zzbwf zzbwfVar) {
        zzbwfVar.getClass();
        return zzk(0, zzbwfVar, 0, zzbwfVar.zzc.length);
    }

    @NotNull
    public final byte[] zzn() {
        return this.zzc;
    }

    @NotNull
    public byte[] zzo() {
        return this.zzc;
    }

    @NotNull
    public byte[] zzp() {
        byte[] bArr = this.zzc;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
