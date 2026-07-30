package p149l;

import com.google.android.gms.internal.ads.zzhag;

/* JADX INFO: loaded from: classes6.dex */
public final class zcx0 extends ycx0 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    @Override // p149l.ycx0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo214210a(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.zcx0.mo214210a(int, byte[], int, int):int");
    }

    @Override // p149l.ycx0
    /* JADX INFO: renamed from: b */
    public final String mo214211b(byte[] bArr, int i, int i2) throws zzhag {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            lg3.m149750a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!xcx0.m208169d(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (xcx0.m208169d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (!xcx0.m208169d(b3)) {
                        break;
                    }
                    i++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
            } else {
                if (xcx0.m208171f(b2)) {
                    if (i7 >= i4) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    i += 2;
                    xcx0.m208168c(b2, bArr[i7], cArr, i6);
                } else if (xcx0.m208170e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    xcx0.m208167b(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw zzhag.zzd();
                    }
                    byte b4 = bArr[i7];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    xcx0.m208166a(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }
}
