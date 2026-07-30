package p149l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class abg0 extends yag0 {

    /* JADX INFO: renamed from: a */
    public InputStream f68663a;

    /* JADX INFO: renamed from: b */
    public c8g0 f68664b;

    /* JADX INFO: renamed from: c */
    public long f68665c;

    /* JADX INFO: renamed from: d */
    public final byte[] f68666d;

    public abg0(InputStream inputStream) {
        c8g0 c8g0Var = new c8g0(inputStream);
        this.f68666d = new byte[1];
        this.f68664b = c8g0Var;
        this.f68663a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        c8g0 c8g0Var = this.f68664b;
        if (c8g0Var != null) {
            return c8g0Var.f79763b.mo116037a();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            p6g0.m167665c(this.f68664b);
            this.f68664b = null;
        } finally {
            InputStream inputStream = this.f68663a;
            if (inputStream != null) {
                inputStream.close();
                this.f68663a = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws EOFException {
        long bits;
        vig0 vig0Var;
        int iMo116038b;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        c8g0 c8g0Var = this.f68664b;
        if (c8g0Var == null) {
            return -1;
        }
        while (true) {
            if (c8g0Var.f79762a && !c8g0Var.f79763b.mo116040d()) {
                iMo116038b = -1;
                break;
            }
            char c = 1;
            if (c8g0Var.f79763b.mo116039c() == 1) {
                c8g0Var.f79762a = c8g0.m105795d(c8g0Var.f79764c, 1) == 1 ? 1 : i3;
                int i4 = 2;
                int iM105795d = (int) c8g0.m105795d(c8g0Var.f79764c, 2);
                int i5 = 16;
                if (iM105795d == 0) {
                    c8g0Var.f79764c.alignWithByteBoundary();
                    long jM105795d = c8g0.m105795d(c8g0Var.f79764c, 16);
                    if ((65535 & (jM105795d ^ 65535)) != c8g0.m105795d(c8g0Var.f79764c, 16)) {
                        qkq0.m175383a("Illegal LEN / NLEN values");
                        return 0;
                    }
                    c8g0Var.f79763b = new j7g0(c8g0Var, jM105795d);
                } else if (iM105795d == 1) {
                    c8g0Var.f79763b = new tng0(c8g0Var, 4, c8g0.f79760i, c8g0.f79761j);
                } else {
                    if (iM105795d != 2) {
                        int i6 = i3;
                        qkq0.m175383a(vdg0.m197997a(iM105795d, "Unsupported compression: "));
                        return i6;
                    }
                    int[][] iArr = {new int[(int) (c8g0.m105795d(c8g0Var.f79764c, 5) + 257)], new int[(int) (c8g0.m105795d(c8g0Var.f79764c, 5) + 1)]};
                    vig0 vig0Var2 = c8g0Var.f79764c;
                    int[] iArr2 = iArr[i3];
                    int[] iArr3 = iArr[1];
                    int iM105795d2 = (int) (c8g0.m105795d(vig0Var2, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i7 = i3;
                    while (true) {
                        char c2 = c;
                        if (i7 >= iM105795d2) {
                            int[][] iArr5 = iArr;
                            mig0 mig0VarM105796e = c8g0.m105796e(iArr4);
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
                                    int iM105794b = c8g0.m105794b(vig0Var2, mig0VarM105796e);
                                    if (iM105794b < i5) {
                                        iArr6[i8] = iM105794b;
                                        i8++;
                                        i10 = iM105794b;
                                    } else {
                                        if (iM105794b == i5) {
                                            long bits2 = vig0Var2.readBits(i4);
                                            if (bits2 == -1) {
                                                throw new EOFException("Truncated Deflate64 Stream");
                                            }
                                            bits = bits2;
                                        } else if (iM105794b == 17) {
                                            bits = vig0Var2.readBits(3);
                                            if (bits == -1) {
                                                throw new EOFException("Truncated Deflate64 Stream");
                                            }
                                            i10 = 0;
                                        } else {
                                            vig0Var = vig0Var2;
                                            if (iM105794b == 18) {
                                                long bits3 = vig0Var.readBits(7);
                                                if (bits3 == -1) {
                                                    throw new EOFException("Truncated Deflate64 Stream");
                                                }
                                                i9 = (int) (bits3 + 11);
                                                vig0Var2 = vig0Var;
                                                i4 = 2;
                                                i5 = 16;
                                                i10 = 0;
                                            } else {
                                                vig0Var2 = vig0Var;
                                                i4 = 2;
                                                i5 = 16;
                                            }
                                        }
                                        vig0Var = vig0Var2;
                                        i9 = (int) (bits + 3);
                                        vig0Var2 = vig0Var;
                                        i4 = 2;
                                        i5 = 16;
                                    }
                                }
                            }
                            System.arraycopy(iArr6, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr6, iArr2.length, iArr3, 0, iArr3.length);
                            c8g0Var.f79763b = new tng0(c8g0Var, 3, iArr5[0], iArr5[c2]);
                            i3 = 0;
                            break;
                        }
                        int i11 = c8g0.f79759h[i7];
                        int[][] iArr7 = iArr;
                        long bits4 = vig0Var2.readBits(3);
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
                iMo116038b = c8g0Var.f79763b.mo116038b(bArr, i, i2);
                if (iMo116038b != 0) {
                    break;
                }
                i3 = i12;
            }
        }
        this.f68665c = this.f68664b.f79764c.getBytesRead();
        count(iMo116038b);
        if (iMo116038b == -1) {
            p6g0.m167665c(this.f68664b);
            this.f68664b = null;
        }
        return iMo116038b;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        do {
            i = read(this.f68666d);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return this.f68666d[0] & 255;
        }
        qkq0.m175383a(vdg0.m197997a(i, "Invalid return value from read: "));
        return 0;
    }
}
