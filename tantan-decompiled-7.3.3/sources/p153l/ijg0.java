package p153l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ijg0 extends gjg0 {

    /* JADX INFO: renamed from: a */
    public InputStream f115218a;

    /* JADX INFO: renamed from: b */
    public kgg0 f115219b;

    /* JADX INFO: renamed from: c */
    public long f115220c;

    /* JADX INFO: renamed from: d */
    public final byte[] f115221d;

    public ijg0(InputStream inputStream) {
        kgg0 kgg0Var = new kgg0(inputStream);
        this.f115221d = new byte[1];
        this.f115219b = kgg0Var;
        this.f115218a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        kgg0 kgg0Var = this.f115219b;
        if (kgg0Var != null) {
            return kgg0Var.f126607b.mo106694a();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            xeg0.m210678c(this.f115219b);
            this.f115219b = null;
        } finally {
            InputStream inputStream = this.f115218a;
            if (inputStream != null) {
                inputStream.close();
                this.f115218a = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws EOFException {
        long bits;
        drg0 drg0Var;
        int iMo106695b;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        kgg0 kgg0Var = this.f115219b;
        if (kgg0Var == null) {
            return -1;
        }
        while (true) {
            if (kgg0Var.f126606a && !kgg0Var.f126607b.mo106697d()) {
                iMo106695b = -1;
                break;
            }
            char c = 1;
            if (kgg0Var.f126607b.mo106696c() == 1) {
                kgg0Var.f126606a = kgg0.m149745d(kgg0Var.f126608c, 1) == 1 ? 1 : i3;
                int i4 = 2;
                int iM149745d = (int) kgg0.m149745d(kgg0Var.f126608c, 2);
                int i5 = 16;
                if (iM149745d == 0) {
                    kgg0Var.f126608c.alignWithByteBoundary();
                    long jM149745d = kgg0.m149745d(kgg0Var.f126608c, 16);
                    if ((65535 & (jM149745d ^ 65535)) != kgg0.m149745d(kgg0Var.f126608c, 16)) {
                        wtq0.m207906a("Illegal LEN / NLEN values");
                        return 0;
                    }
                    kgg0Var.f126607b = new rfg0(kgg0Var, jM149745d);
                } else if (iM149745d == 1) {
                    kgg0Var.f126607b = new bwg0(kgg0Var, 4, kgg0.f126604i, kgg0.f126605j);
                } else {
                    if (iM149745d != 2) {
                        int i6 = i3;
                        wtq0.m207906a(dmg0.m116959a(iM149745d, "Unsupported compression: "));
                        return i6;
                    }
                    int[][] iArr = {new int[(int) (kgg0.m149745d(kgg0Var.f126608c, 5) + 257)], new int[(int) (kgg0.m149745d(kgg0Var.f126608c, 5) + 1)]};
                    drg0 drg0Var2 = kgg0Var.f126608c;
                    int[] iArr2 = iArr[i3];
                    int[] iArr3 = iArr[1];
                    int iM149745d2 = (int) (kgg0.m149745d(drg0Var2, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i7 = i3;
                    while (true) {
                        char c2 = c;
                        if (i7 >= iM149745d2) {
                            int[][] iArr5 = iArr;
                            uqg0 uqg0VarM149746e = kgg0.m149746e(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr6 = new int[length];
                            int i8 = i3;
                            int i9 = i8;
                            int i10 = -1;
                            while (i8 < length) {
                                if (i9 > 0) {
                                    iArr6[i8] = i10;
                                    i9--;
                                    i8++;
                                } else {
                                    int iM149744b = kgg0.m149744b(drg0Var2, uqg0VarM149746e);
                                    if (iM149744b < i5) {
                                        iArr6[i8] = iM149744b;
                                        i8++;
                                        i10 = iM149744b;
                                    } else {
                                        if (iM149744b == i5) {
                                            long bits2 = drg0Var2.readBits(i4);
                                            if (bits2 == -1) {
                                                throw new EOFException("Truncated Deflate64 Stream");
                                            }
                                            bits = bits2;
                                        } else if (iM149744b == 17) {
                                            bits = drg0Var2.readBits(3);
                                            if (bits == -1) {
                                                throw new EOFException("Truncated Deflate64 Stream");
                                            }
                                            i10 = 0;
                                        } else {
                                            drg0Var = drg0Var2;
                                            if (iM149744b == 18) {
                                                long bits3 = drg0Var.readBits(7);
                                                if (bits3 == -1) {
                                                    throw new EOFException("Truncated Deflate64 Stream");
                                                }
                                                i9 = (int) (bits3 + 11);
                                                drg0Var2 = drg0Var;
                                                i4 = 2;
                                                i5 = 16;
                                                i10 = 0;
                                            } else {
                                                drg0Var2 = drg0Var;
                                                i4 = 2;
                                                i5 = 16;
                                            }
                                        }
                                        drg0Var = drg0Var2;
                                        i9 = (int) (bits + 3);
                                        drg0Var2 = drg0Var;
                                        i4 = 2;
                                        i5 = 16;
                                    }
                                }
                            }
                            System.arraycopy(iArr6, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr6, iArr2.length, iArr3, 0, iArr3.length);
                            kgg0Var.f126607b = new bwg0(kgg0Var, 3, iArr5[0], iArr5[c2]);
                            i3 = 0;
                            break;
                        }
                        int i11 = kgg0.f126603h[i7];
                        int[][] iArr7 = iArr;
                        long bits4 = drg0Var2.readBits(3);
                        if (bits4 == -1) {
                            throw new EOFException("Truncated Deflate64 Stream");
                        }
                        iArr4[i11] = (int) bits4;
                        i7++;
                        c = c2;
                        iArr = iArr7;
                    }
                }
                i3 = 0;
            } else {
                int i12 = i3;
                iMo106695b = kgg0Var.f126607b.mo106695b(bArr, i, i2);
                if (iMo106695b != 0) {
                    break;
                }
                i3 = i12;
            }
        }
        this.f115220c = this.f115219b.f126608c.getBytesRead();
        count(iMo106695b);
        if (iMo106695b == -1) {
            xeg0.m210678c(this.f115219b);
            this.f115219b = null;
        }
        return iMo106695b;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        do {
            i = read(this.f115221d);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return this.f115221d[0] & 255;
        }
        wtq0.m207906a(dmg0.m116959a(i, "Invalid return value from read: "));
        return 0;
    }
}
