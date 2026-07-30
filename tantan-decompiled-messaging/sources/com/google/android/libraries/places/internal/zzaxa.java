package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzaxa extends zzawz {
    @Override // com.google.android.libraries.places.internal.zzawz
    public final int zza(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i3) {
            return 0;
        }
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                i4 = i5;
            } else {
                if (b < -32) {
                    if (i5 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i4 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i5 >= i3 - 2) {
                        return zzaxc.zza(bArr, i5, i3);
                    }
                    int i6 = i4 + 2;
                    byte b2 = bArr[i5];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i7 = i4 + 3;
                        if (bArr[i6] <= -65) {
                            i4 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i5 >= i3 - 1) {
                    return zzaxc.zza(bArr, i5, i3);
                }
                int i8 = i4 + 2;
                byte b3 = bArr[i5];
                if (b3 > -65 || (b == -32 && b3 < -96)) {
                    return -1;
                }
                if (b == -19 && b3 >= -96) {
                    return -1;
                }
                i4 += 3;
                if (bArr[i8] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
