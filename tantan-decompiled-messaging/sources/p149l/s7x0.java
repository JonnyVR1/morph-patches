package p149l;

import com.google.android.gms.internal.ads.AbstractC2214o5;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7x0 extends AbstractC2214o5 {

    /* JADX INFO: renamed from: d */
    public final byte[] f162955d;

    /* JADX INFO: renamed from: e */
    public final int f162956e;

    /* JADX INFO: renamed from: f */
    public int f162957f;

    /* JADX INFO: renamed from: g */
    public int f162958g;

    public s7x0(int i) {
        super(null);
        if (i < 0) {
            ig3.m135964a("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f162955d = bArr;
        this.f162956e = bArr.length;
    }

    /* JADX INFO: renamed from: C */
    public final void m182529C(byte b) {
        int i = this.f162957f;
        this.f162957f = i + 1;
        this.f162955d[i] = b;
        this.f162958g++;
    }

    /* JADX INFO: renamed from: D */
    public final void m182530D(int i) {
        int i2 = this.f162957f;
        int i3 = i2 + 1;
        this.f162957f = i3;
        byte[] bArr = this.f162955d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f162957f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f162957f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f162957f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f162958g += 4;
    }

    /* JADX INFO: renamed from: E */
    public final void m182531E(long j) {
        int i = this.f162957f;
        int i2 = i + 1;
        this.f162957f = i2;
        byte[] bArr = this.f162955d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f162957f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f162957f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f162957f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f162957f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f162957f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f162957f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f162957f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f162958g += 8;
    }

    /* JADX INFO: renamed from: F */
    public final void m182532F(int i) {
        if (AbstractC2214o5.f10017c) {
            long j = this.f162957f;
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.f162955d;
                if (i2 == 0) {
                    int i3 = this.f162957f;
                    this.f162957f = i3 + 1;
                    rcx0.m178847y(bArr, i3, (byte) i);
                    this.f162958g += (int) (((long) this.f162957f) - j);
                    return;
                }
                int i4 = this.f162957f;
                this.f162957f = i4 + 1;
                rcx0.m178847y(bArr, i4, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i5 = i & (-128);
                byte[] bArr2 = this.f162955d;
                if (i5 == 0) {
                    int i6 = this.f162957f;
                    this.f162957f = i6 + 1;
                    bArr2[i6] = (byte) i;
                    this.f162958g++;
                    return;
                }
                int i7 = this.f162957f;
                this.f162957f = i7 + 1;
                bArr2[i7] = (byte) ((i | 128) & 255);
                this.f162958g++;
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m182533G(long j) {
        if (AbstractC2214o5.f10017c) {
            long j2 = this.f162957f;
            while (true) {
                long j3 = j & (-128);
                int i = (int) j;
                byte[] bArr = this.f162955d;
                if (j3 == 0) {
                    int i2 = this.f162957f;
                    this.f162957f = i2 + 1;
                    rcx0.m178847y(bArr, i2, (byte) i);
                    this.f162958g += (int) (((long) this.f162957f) - j2);
                    return;
                }
                int i3 = this.f162957f;
                this.f162957f = i3 + 1;
                rcx0.m178847y(bArr, i3, (byte) ((i | 128) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                long j4 = j & (-128);
                int i4 = (int) j;
                byte[] bArr2 = this.f162955d;
                if (j4 == 0) {
                    int i5 = this.f162957f;
                    this.f162957f = i5 + 1;
                    bArr2[i5] = (byte) i4;
                    this.f162958g++;
                    return;
                }
                int i6 = this.f162957f;
                this.f162957f = i6 + 1;
                bArr2[i6] = (byte) ((i4 | 128) & 255);
                this.f162958g++;
                j >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: k */
    public final int mo12916k() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
