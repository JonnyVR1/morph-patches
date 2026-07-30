package p153l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class rfg0 extends mng0 {

    /* JADX INFO: renamed from: a */
    public final long f162783a;

    /* JADX INFO: renamed from: b */
    public long f162784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kgg0 f162785c;

    public rfg0(kgg0 kgg0Var, long j) {
        this.f162785c = kgg0Var;
        this.f162783a = j;
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: a */
    public final int mo106694a() {
        return (int) Math.min(this.f162783a - this.f162784b, this.f162785c.f126608c.bitsAvailable() / 8);
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: b */
    public final int mo106695b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f162783a - this.f162784b, i2);
        while (i3 < iMin) {
            int iBitsCached = this.f162785c.f126608c.bitsCached();
            kgg0 kgg0Var = this.f162785c;
            int i4 = 1;
            if (iBitsCached > 0) {
                byte bM149745d = (byte) kgg0.m149745d(kgg0Var.f126608c, 8);
                int i5 = i + i3;
                ptg0 ptg0Var = this.f162785c.f126610e;
                byte[] bArr2 = ptg0Var.f154071a;
                int i6 = ptg0Var.f154072b;
                bArr2[i6] = bM149745d;
                int i7 = 65535 & (i6 + 1);
                if (!ptg0Var.f154073c && i7 < i6) {
                    ptg0Var.f154073c = true;
                }
                ptg0Var.f154072b = i7;
                bArr[i5] = bM149745d;
            } else {
                InputStream inputStream = kgg0Var.f126609d;
                int i8 = i + i3;
                int i9 = inputStream.read(bArr, i8, iMin - i3);
                if (i9 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                ptg0 ptg0Var2 = this.f162785c.f126610e;
                for (int i10 = i8; i10 < i8 + i9; i10++) {
                    byte b = bArr[i10];
                    byte[] bArr3 = ptg0Var2.f154071a;
                    int i11 = ptg0Var2.f154072b;
                    bArr3[i11] = b;
                    int i12 = (i11 + 1) & p7f.COLOR_SPACE_UNCALIBRATED;
                    if (!ptg0Var2.f154073c && i12 < i11) {
                        ptg0Var2.f154073c = true;
                    }
                    ptg0Var2.f154072b = i12;
                }
                i4 = i9;
            }
            this.f162784b += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: c */
    public final int mo106696c() {
        return this.f162784b < this.f162783a ? 2 : 1;
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: d */
    public final boolean mo106697d() {
        return this.f162784b < this.f162783a;
    }
}
