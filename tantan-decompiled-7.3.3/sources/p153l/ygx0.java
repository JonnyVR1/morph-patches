package p153l;

import com.google.android.gms.internal.ads.AbstractC2237o5;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ygx0 extends AbstractC2237o5 {

    /* JADX INFO: renamed from: d */
    public final byte[] f199887d;

    /* JADX INFO: renamed from: e */
    public final int f199888e;

    /* JADX INFO: renamed from: f */
    public int f199889f;

    /* JADX INFO: renamed from: g */
    public int f199890g;

    public ygx0(int i) {
        super(null);
        if (i < 0) {
            wg3.m206174a("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f199887d = bArr;
        this.f199888e = bArr.length;
    }

    /* JADX INFO: renamed from: C */
    public final void m215883C(byte b) {
        int i = this.f199889f;
        this.f199889f = i + 1;
        this.f199887d[i] = b;
        this.f199890g++;
    }

    /* JADX INFO: renamed from: D */
    public final void m215884D(int i) {
        int i2 = this.f199889f;
        int i3 = i2 + 1;
        this.f199889f = i3;
        byte[] bArr = this.f199887d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f199889f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f199889f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f199889f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f199890g += 4;
    }

    /* JADX INFO: renamed from: E */
    public final void m215885E(long j) {
        int i = this.f199889f;
        int i2 = i + 1;
        this.f199889f = i2;
        byte[] bArr = this.f199887d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f199889f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f199889f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f199889f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f199889f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f199889f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f199889f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f199889f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f199890g += 8;
    }

    /* JADX INFO: renamed from: F */
    public final void m215886F(int i) {
        if (AbstractC2237o5.f10054c) {
            long j = this.f199889f;
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.f199887d;
                if (i2 == 0) {
                    int i3 = this.f199889f;
                    this.f199889f = i3 + 1;
                    xlx0.m211712y(bArr, i3, (byte) i);
                    this.f199890g += (int) (((long) this.f199889f) - j);
                    return;
                }
                int i4 = this.f199889f;
                this.f199889f = i4 + 1;
                xlx0.m211712y(bArr, i4, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i5 = i & (-128);
                byte[] bArr2 = this.f199887d;
                if (i5 == 0) {
                    int i6 = this.f199889f;
                    this.f199889f = i6 + 1;
                    bArr2[i6] = (byte) i;
                    this.f199890g++;
                    return;
                }
                int i7 = this.f199889f;
                this.f199889f = i7 + 1;
                bArr2[i7] = (byte) ((i | 128) & 255);
                this.f199890g++;
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m215887G(long j) {
        if (AbstractC2237o5.f10054c) {
            long j2 = this.f199889f;
            while (true) {
                long j3 = j & (-128);
                int i = (int) j;
                byte[] bArr = this.f199887d;
                if (j3 == 0) {
                    int i2 = this.f199889f;
                    this.f199889f = i2 + 1;
                    xlx0.m211712y(bArr, i2, (byte) i);
                    this.f199890g += (int) (((long) this.f199889f) - j2);
                    return;
                }
                int i3 = this.f199889f;
                this.f199889f = i3 + 1;
                xlx0.m211712y(bArr, i3, (byte) ((i | 128) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                long j4 = j & (-128);
                int i4 = (int) j;
                byte[] bArr2 = this.f199887d;
                if (j4 == 0) {
                    int i5 = this.f199889f;
                    this.f199889f = i5 + 1;
                    bArr2[i5] = (byte) i4;
                    this.f199890g++;
                    return;
                }
                int i6 = this.f199889f;
                this.f199889f = i6 + 1;
                bArr2[i6] = (byte) ((i4 | 128) & 255);
                this.f199890g++;
                j >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: k */
    public final int mo12970k() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
