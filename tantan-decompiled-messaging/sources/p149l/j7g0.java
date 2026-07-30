package p149l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j7g0 extends efg0 {

    /* JADX INFO: renamed from: a */
    public final long f116594a;

    /* JADX INFO: renamed from: b */
    public long f116595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c8g0 f116596c;

    public j7g0(c8g0 c8g0Var, long j) {
        this.f116596c = c8g0Var;
        this.f116594a = j;
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: a */
    public final int mo116037a() {
        return (int) Math.min(this.f116594a - this.f116595b, this.f116596c.f79764c.bitsAvailable() / 8);
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: b */
    public final int mo116038b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f116594a - this.f116595b, i2);
        while (i3 < iMin) {
            int iBitsCached = this.f116596c.f79764c.bitsCached();
            c8g0 c8g0Var = this.f116596c;
            int i4 = 1;
            if (iBitsCached > 0) {
                byte bM105795d = (byte) c8g0.m105795d(c8g0Var.f79764c, 8);
                int i5 = i + i3;
                hlg0 hlg0Var = this.f116596c.f79766e;
                byte[] bArr2 = hlg0Var.f108343a;
                int i6 = hlg0Var.f108344b;
                bArr2[i6] = bM105795d;
                int i7 = 65535 & (i6 + 1);
                if (!hlg0Var.f108345c && i7 < i6) {
                    hlg0Var.f108345c = true;
                }
                hlg0Var.f108344b = i7;
                bArr[i5] = bM105795d;
            } else {
                InputStream inputStream = c8g0Var.f79765d;
                int i8 = i + i3;
                int i9 = inputStream.read(bArr, i8, iMin - i3);
                if (i9 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                hlg0 hlg0Var2 = this.f116596c.f79766e;
                for (int i10 = i8; i10 < i8 + i9; i10++) {
                    byte b = bArr[i10];
                    byte[] bArr3 = hlg0Var2.f108343a;
                    int i11 = hlg0Var2.f108344b;
                    bArr3[i11] = b;
                    int i12 = (i11 + 1) & j6f.COLOR_SPACE_UNCALIBRATED;
                    if (!hlg0Var2.f108345c && i12 < i11) {
                        hlg0Var2.f108345c = true;
                    }
                    hlg0Var2.f108344b = i12;
                }
                i4 = i9;
            }
            this.f116595b += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: c */
    public final int mo116039c() {
        return this.f116595b < this.f116594a ? 2 : 1;
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: d */
    public final boolean mo116040d() {
        return this.f116595b < this.f116594a;
    }
}
