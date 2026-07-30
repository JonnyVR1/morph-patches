package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbqu {
    private static final Logger zza = Logger.getLogger(zzbqu.class.getName());
    private static final byte[] zzb = "-bin".getBytes(zzmb.zza);

    private zzbqu() {
    }

    public static byte[][] zza(zzbcf zzbcfVar) {
        int length;
        int i;
        byte[][] bArrZzd = zzbar.zzd(zzbcfVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArrZzd.length;
            if (i2 >= length) {
                break;
            }
            byte[] bArr = bArrZzd[i2];
            byte[] bArr2 = bArrZzd[i2 + 1];
            if (zzc(bArr, zzb)) {
                i = i3 + 2;
                bArrZzd[i3] = bArr;
                bArrZzd[i3 + 1] = zzbar.zzb.zzk(bArr2, 0, bArr2.length).getBytes(zzmb.zza);
            } else {
                int length2 = bArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = i3 + 2;
                        bArrZzd[i3] = bArr;
                        bArrZzd[i3 + 1] = bArr2;
                    } else {
                        byte b = bArr2[i4];
                        if (b < 32 || b > 126) {
                            String str = new String(bArr, zzmb.zza);
                            zza.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
                        } else {
                            i4++;
                        }
                    }
                    i2 += 2;
                }
            }
            i3 = i;
            i2 += 2;
        }
        return i3 == length ? bArrZzd : (byte[][]) Arrays.copyOfRange(bArrZzd, 0, i3);
    }

    public static byte[][] zzb(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (zzc(bArr2, zzb)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr4 = bArr[i];
                            byte[] bArr5 = bArr[i + 1];
                            if (zzc(bArr4, zzb)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr5.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr5[i4] == 44) {
                                            byte[] bArrZzl = zzsi.zzj().zzl(new String(bArr5, i5, i4 - i5, zzmb.zza));
                                            arrayList.add(bArr4);
                                            arrayList.add(bArrZzl);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = zzsi.zzj().zzl(new String(bArr3, zzmb.zza));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
