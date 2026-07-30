package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.gzi0;
import p153l.jr3;
import p153l.lyj0;
import p153l.mnd0;
import p153l.sn0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends jr3 {

    /* JADX INFO: renamed from: c */
    public static final Logger f1552c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d */
    public static final boolean f1553d = lyj0.m156301G();

    /* JADX INFO: renamed from: a */
    public C0335i f1554a;

    /* JADX INFO: renamed from: b */
    public boolean f1555b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$b */
    public static abstract class AbstractC0285b extends CodedOutputStream {

        /* JADX INFO: renamed from: e */
        public final byte[] f1556e;

        /* JADX INFO: renamed from: f */
        public final int f1557f;

        /* JADX INFO: renamed from: g */
        public int f1558g;

        /* JADX INFO: renamed from: h */
        public int f1559h;

        public AbstractC0285b(int i) {
            super();
            if (i < 0) {
                wg3.m206174a("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f1556e = bArr;
            this.f1557f = bArr.length;
        }

        /* JADX INFO: renamed from: c1 */
        public final void m1602c1(byte b) {
            byte[] bArr = this.f1556e;
            int i = this.f1558g;
            this.f1558g = i + 1;
            bArr[i] = b;
            this.f1559h++;
        }

        /* JADX INFO: renamed from: d1 */
        public final void m1603d1(int i) {
            byte[] bArr = this.f1556e;
            int i2 = this.f1558g;
            int i3 = i2 + 1;
            this.f1558g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f1558g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f1558g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f1558g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f1559h += 4;
        }

        /* JADX INFO: renamed from: e1 */
        public final void m1604e1(long j) {
            byte[] bArr = this.f1556e;
            int i = this.f1558g;
            int i2 = i + 1;
            this.f1558g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f1558g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f1558g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f1558g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f1558g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f1558g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f1558g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f1558g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f1559h += 8;
        }

        /* JADX INFO: renamed from: f1 */
        public final void m1605f1(int i) {
            if (i >= 0) {
                m1607h1(i);
            } else {
                m1608i1(i);
            }
        }

        /* JADX INFO: renamed from: g1 */
        public final void m1606g1(int i, int i2) {
            m1607h1(WireFormat.m1749c(i, i2));
        }

        /* JADX INFO: renamed from: h1 */
        public final void m1607h1(int i) {
            if (CodedOutputStream.f1553d) {
                long j = this.f1558g;
                while (true) {
                    int i2 = i & (-128);
                    byte[] bArr = this.f1556e;
                    if (i2 == 0) {
                        int i3 = this.f1558g;
                        this.f1558g = i3 + 1;
                        lyj0.m156307M(bArr, i3, (byte) i);
                        this.f1559h += (int) (((long) this.f1558g) - j);
                        return;
                    }
                    int i4 = this.f1558g;
                    this.f1558g = i4 + 1;
                    lyj0.m156307M(bArr, i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                while (true) {
                    int i5 = i & (-128);
                    byte[] bArr2 = this.f1556e;
                    if (i5 == 0) {
                        int i6 = this.f1558g;
                        this.f1558g = i6 + 1;
                        bArr2[i6] = (byte) i;
                        this.f1559h++;
                        return;
                    }
                    int i7 = this.f1558g;
                    this.f1558g = i7 + 1;
                    bArr2[i7] = (byte) ((i & 127) | 128);
                    this.f1559h++;
                    i >>>= 7;
                }
            }
        }

        /* JADX INFO: renamed from: i1 */
        public final void m1608i1(long j) {
            if (CodedOutputStream.f1553d) {
                long j2 = this.f1558g;
                while (true) {
                    long j3 = j & (-128);
                    byte[] bArr = this.f1556e;
                    if (j3 == 0) {
                        int i = this.f1558g;
                        this.f1558g = i + 1;
                        lyj0.m156307M(bArr, i, (byte) j);
                        this.f1559h += (int) (((long) this.f1558g) - j2);
                        return;
                    }
                    int i2 = this.f1558g;
                    this.f1558g = i2 + 1;
                    lyj0.m156307M(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    long j4 = j & (-128);
                    byte[] bArr2 = this.f1556e;
                    if (j4 == 0) {
                        int i3 = this.f1558g;
                        this.f1558g = i3 + 1;
                        bArr2[i3] = (byte) j;
                        this.f1559h++;
                        return;
                    }
                    int i4 = this.f1558g;
                    this.f1558g = i4 + 1;
                    bArr2[i4] = (byte) ((((int) j) & 127) | 128);
                    this.f1559h++;
                    j >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: j0 */
        public final int mo1585j0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$c */
    public static class C0286c extends CodedOutputStream {

        /* JADX INFO: renamed from: e */
        public final byte[] f1560e;

        /* JADX INFO: renamed from: f */
        public final int f1561f;

        /* JADX INFO: renamed from: g */
        public final int f1562g;

        /* JADX INFO: renamed from: h */
        public int f1563h;

        public C0286c(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                mnd0.m159157a("buffer");
                throw null;
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                gzi0.m133102a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                throw null;
            }
            this.f1560e = bArr;
            this.f1561f = i;
            this.f1563h = i;
            this.f1562g = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F0 */
        public final void mo1557F0(int i, int i2) throws IOException {
            mo1575X0(i, 0);
            mo1558G0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G0 */
        public final void mo1558G0(int i) throws IOException {
            if (i >= 0) {
                mo1577Z0(i);
            } else {
                mo1580b1(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J0 */
        public final void mo1561J0(int i, InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) throws IOException {
            mo1575X0(i, 2);
            mo1577Z0(((AbstractC0319a) interfaceC0322b0).m1792d(interfaceC0336i0));
            interfaceC0336i0.mo1903c(interfaceC0322b0, this.f1554a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K0 */
        public final void mo1562K0(InterfaceC0322b0 interfaceC0322b0) throws IOException {
            mo1577Z0(interfaceC0322b0.getSerializedSize());
            interfaceC0322b0.mo1634a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L0 */
        public final void mo1563L0(int i, InterfaceC0322b0 interfaceC0322b0) throws IOException {
            mo1575X0(1, 3);
            mo1576Y0(2, i);
            m1612e1(3, interfaceC0322b0);
            mo1575X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: M0 */
        public final void mo1564M0(int i, ByteString byteString) throws IOException {
            mo1575X0(1, 3);
            mo1576Y0(2, i);
            mo1591p0(3, byteString);
            mo1575X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: V0 */
        public final void mo1573V0(int i, String str) throws IOException {
            mo1575X0(i, 2);
            mo1574W0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: W0 */
        public final void mo1574W0(String str) throws IOException {
            int i = this.f1563h;
            try {
                int iM1521Y = CodedOutputStream.m1521Y(str.length() * 3);
                int iM1521Y2 = CodedOutputStream.m1521Y(str.length());
                if (iM1521Y2 != iM1521Y) {
                    mo1577Z0(Utf8.m1695j(str));
                    this.f1563h = Utf8.m1694i(str, this.f1560e, this.f1563h, mo1585j0());
                    return;
                }
                int i2 = i + iM1521Y2;
                this.f1563h = i2;
                int iM1694i = Utf8.m1694i(str, this.f1560e, i2, mo1585j0());
                this.f1563h = i;
                mo1577Z0((iM1694i - i) - iM1521Y2);
                this.f1563h = iM1694i;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f1563h = i;
                m1583e0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: X0 */
        public final void mo1575X0(int i, int i2) throws IOException {
            mo1577Z0(WireFormat.m1749c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Y0 */
        public final void mo1576Y0(int i, int i2) throws IOException {
            mo1575X0(i, 0);
            mo1577Z0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Z0 */
        public final void mo1577Z0(int i) throws IOException {
            if (!CodedOutputStream.f1553d || sn0.m186857c() || mo1585j0() < 5) {
                while (true) {
                    int i2 = i & (-128);
                    byte[] bArr = this.f1560e;
                    if (i2 == 0) {
                        int i3 = this.f1563h;
                        this.f1563h = i3 + 1;
                        bArr[i3] = (byte) i;
                        return;
                    } else {
                        try {
                            int i4 = this.f1563h;
                            this.f1563h = i4 + 1;
                            bArr[i4] = (byte) ((i & 127) | 128);
                            i >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
                }
            }
            int i5 = i & (-128);
            byte[] bArr2 = this.f1560e;
            if (i5 == 0) {
                int i6 = this.f1563h;
                this.f1563h = i6 + 1;
                lyj0.m156307M(bArr2, i6, (byte) i);
                return;
            }
            int i7 = this.f1563h;
            this.f1563h = i7 + 1;
            lyj0.m156307M(bArr2, i7, (byte) (i | 128));
            int i8 = i >>> 7;
            int i9 = i8 & (-128);
            byte[] bArr3 = this.f1560e;
            if (i9 == 0) {
                int i10 = this.f1563h;
                this.f1563h = i10 + 1;
                lyj0.m156307M(bArr3, i10, (byte) i8);
                return;
            }
            int i11 = this.f1563h;
            this.f1563h = i11 + 1;
            lyj0.m156307M(bArr3, i11, (byte) (i8 | 128));
            int i12 = i >>> 14;
            int i13 = i12 & (-128);
            byte[] bArr4 = this.f1560e;
            if (i13 == 0) {
                int i14 = this.f1563h;
                this.f1563h = i14 + 1;
                lyj0.m156307M(bArr4, i14, (byte) i12);
                return;
            }
            int i15 = this.f1563h;
            this.f1563h = i15 + 1;
            lyj0.m156307M(bArr4, i15, (byte) (i12 | 128));
            int i16 = i >>> 21;
            int i17 = i16 & (-128);
            byte[] bArr5 = this.f1560e;
            if (i17 == 0) {
                int i18 = this.f1563h;
                this.f1563h = i18 + 1;
                lyj0.m156307M(bArr5, i18, (byte) i16);
                return;
            }
            int i19 = this.f1563h;
            this.f1563h = i19 + 1;
            lyj0.m156307M(bArr5, i19, (byte) (i16 | 128));
            byte[] bArr6 = this.f1560e;
            int i20 = this.f1563h;
            this.f1563h = i20 + 1;
            lyj0.m156307M(bArr6, i20, (byte) (i >>> 28));
        }

        @Override // p153l.jr3
        /* JADX INFO: renamed from: a */
        public final void mo1609a(ByteBuffer byteBuffer) throws IOException {
            m1610c1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: a1 */
        public final void mo1578a1(int i, long j) throws IOException {
            mo1575X0(i, 0);
            mo1580b1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, p153l.jr3
        /* JADX INFO: renamed from: b */
        public final void mo1579b(byte[] bArr, int i, int i2) throws IOException {
            m1611d1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: b1 */
        public final void mo1580b1(long j) throws IOException {
            if (!CodedOutputStream.f1553d || mo1585j0() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    byte[] bArr = this.f1560e;
                    if (j2 == 0) {
                        int i = this.f1563h;
                        this.f1563h = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            int i2 = this.f1563h;
                            this.f1563h = i2 + 1;
                            bArr[i2] = (byte) ((((int) j) & 127) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                byte[] bArr2 = this.f1560e;
                if (j3 == 0) {
                    int i3 = this.f1563h;
                    this.f1563h = i3 + 1;
                    lyj0.m156307M(bArr2, i3, (byte) j);
                    return;
                } else {
                    int i4 = this.f1563h;
                    this.f1563h = i4 + 1;
                    lyj0.m156307M(bArr2, i4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* JADX INFO: renamed from: c1 */
        public final void m1610c1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f1560e, this.f1563h, iRemaining);
                this.f1563h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: d0 */
        public void mo1582d0() {
        }

        /* JADX INFO: renamed from: d1 */
        public final void m1611d1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f1560e, this.f1563h, i2);
                this.f1563h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), Integer.valueOf(i2)), e);
            }
        }

        /* JADX INFO: renamed from: e1 */
        public final void m1612e1(int i, InterfaceC0322b0 interfaceC0322b0) throws IOException {
            mo1575X0(i, 2);
            mo1562K0(interfaceC0322b0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: j0 */
        public final int mo1585j0() {
            return this.f1562g - this.f1563h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: k0 */
        public final void mo1586k0(byte b) throws IOException {
            try {
                byte[] bArr = this.f1560e;
                int i = this.f1563h;
                this.f1563h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: l0 */
        public final void mo1587l0(int i, boolean z) throws IOException {
            mo1575X0(i, 0);
            mo1586k0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: o0 */
        public final void mo1590o0(byte[] bArr, int i, int i2) throws IOException {
            mo1577Z0(i2);
            m1611d1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: p0 */
        public final void mo1591p0(int i, ByteString byteString) throws IOException {
            mo1575X0(i, 2);
            mo1592q0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: q0 */
        public final void mo1592q0(ByteString byteString) throws IOException {
            mo1577Z0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: v0 */
        public final void mo1597v0(int i, int i2) throws IOException {
            mo1575X0(i, 5);
            mo1598w0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: w0 */
        public final void mo1598w0(int i) throws IOException {
            try {
                byte[] bArr = this.f1560e;
                int i2 = this.f1563h;
                int i3 = i2 + 1;
                this.f1563h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f1563h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f1563h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f1563h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x0 */
        public final void mo1599x0(int i, long j) throws IOException {
            mo1575X0(i, 1);
            mo1600y0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y0 */
        public final void mo1600y0(long j) throws IOException {
            try {
                byte[] bArr = this.f1560e;
                int i = this.f1563h;
                int i2 = i + 1;
                this.f1563h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f1563h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f1563h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f1563h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f1563h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f1563h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f1563h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f1563h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1563h), Integer.valueOf(this.f1562g), 1), e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$d */
    public static final class C0287d extends AbstractC0285b {

        /* JADX INFO: renamed from: i */
        public final OutputStream f1564i;

        public C0287d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f1564i = outputStream;
            } else {
                mnd0.m159157a("out");
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F0 */
        public void mo1557F0(int i, int i2) throws IOException {
            m1614k1(20);
            m1606g1(i, 0);
            m1605f1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G0 */
        public void mo1558G0(int i) throws IOException {
            if (i >= 0) {
                mo1577Z0(i);
            } else {
                mo1580b1(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J0 */
        public void mo1561J0(int i, InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) throws IOException {
            mo1575X0(i, 2);
            m1618o1(interfaceC0322b0, interfaceC0336i0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: K0 */
        public void mo1562K0(InterfaceC0322b0 interfaceC0322b0) throws IOException {
            mo1577Z0(interfaceC0322b0.getSerializedSize());
            interfaceC0322b0.mo1634a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: L0 */
        public void mo1563L0(int i, InterfaceC0322b0 interfaceC0322b0) throws IOException {
            mo1575X0(1, 3);
            mo1576Y0(2, i);
            m1617n1(3, interfaceC0322b0);
            mo1575X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: M0 */
        public void mo1564M0(int i, ByteString byteString) throws IOException {
            mo1575X0(1, 3);
            mo1576Y0(2, i);
            mo1591p0(3, byteString);
            mo1575X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: V0 */
        public void mo1573V0(int i, String str) throws IOException {
            mo1575X0(i, 2);
            mo1574W0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: W0 */
        public void mo1574W0(String str) throws IOException {
            int iM1695j;
            try {
                int length = str.length() * 3;
                int iM1521Y = CodedOutputStream.m1521Y(length);
                int i = iM1521Y + length;
                int i2 = this.f1557f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iM1694i = Utf8.m1694i(str, bArr, 0, length);
                    mo1577Z0(iM1694i);
                    mo1579b(bArr, 0, iM1694i);
                    return;
                }
                if (i > i2 - this.f1558g) {
                    m1613j1();
                }
                int iM1521Y2 = CodedOutputStream.m1521Y(str.length());
                int i3 = this.f1558g;
                try {
                    if (iM1521Y2 == iM1521Y) {
                        int i4 = i3 + iM1521Y2;
                        this.f1558g = i4;
                        int iM1694i2 = Utf8.m1694i(str, this.f1556e, i4, this.f1557f - i4);
                        this.f1558g = i3;
                        iM1695j = (iM1694i2 - i3) - iM1521Y2;
                        m1607h1(iM1695j);
                        this.f1558g = iM1694i2;
                    } else {
                        iM1695j = Utf8.m1695j(str);
                        m1607h1(iM1695j);
                        this.f1558g = Utf8.m1694i(str, this.f1556e, this.f1558g, iM1695j);
                    }
                    this.f1559h += iM1695j;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f1559h -= this.f1558g - i3;
                    this.f1558g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m1583e0(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: X0 */
        public void mo1575X0(int i, int i2) throws IOException {
            mo1577Z0(WireFormat.m1749c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Y0 */
        public void mo1576Y0(int i, int i2) throws IOException {
            m1614k1(20);
            m1606g1(i, 0);
            m1607h1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Z0 */
        public void mo1577Z0(int i) throws IOException {
            m1614k1(5);
            m1607h1(i);
        }

        @Override // p153l.jr3
        /* JADX INFO: renamed from: a */
        public void mo1609a(ByteBuffer byteBuffer) throws IOException {
            m1615l1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: a1 */
        public void mo1578a1(int i, long j) throws IOException {
            m1614k1(20);
            m1606g1(i, 0);
            m1608i1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, p153l.jr3
        /* JADX INFO: renamed from: b */
        public void mo1579b(byte[] bArr, int i, int i2) throws IOException {
            m1616m1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: b1 */
        public void mo1580b1(long j) throws IOException {
            m1614k1(10);
            m1608i1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: d0 */
        public void mo1582d0() throws IOException {
            if (this.f1558g > 0) {
                m1613j1();
            }
        }

        /* JADX INFO: renamed from: j1 */
        public final void m1613j1() throws IOException {
            this.f1564i.write(this.f1556e, 0, this.f1558g);
            this.f1558g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: k0 */
        public void mo1586k0(byte b) throws IOException {
            if (this.f1558g == this.f1557f) {
                m1613j1();
            }
            m1602c1(b);
        }

        /* JADX INFO: renamed from: k1 */
        public final void m1614k1(int i) throws IOException {
            if (this.f1557f - this.f1558g < i) {
                m1613j1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: l0 */
        public void mo1587l0(int i, boolean z) throws IOException {
            m1614k1(11);
            m1606g1(i, 0);
            m1602c1(z ? (byte) 1 : (byte) 0);
        }

        /* JADX INFO: renamed from: l1 */
        public void m1615l1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f1557f;
            int i2 = this.f1558g;
            int i3 = i - i2;
            byte[] bArr = this.f1556e;
            if (i3 >= iRemaining) {
                byteBuffer.get(bArr, i2, iRemaining);
                this.f1558g += iRemaining;
                this.f1559h += iRemaining;
                return;
            }
            int i4 = i - i2;
            byteBuffer.get(bArr, i2, i4);
            int i5 = iRemaining - i4;
            this.f1558g = this.f1557f;
            this.f1559h += i4;
            m1613j1();
            while (true) {
                int i6 = this.f1557f;
                byte[] bArr2 = this.f1556e;
                if (i5 <= i6) {
                    byteBuffer.get(bArr2, 0, i5);
                    this.f1558g = i5;
                    this.f1559h += i5;
                    return;
                } else {
                    byteBuffer.get(bArr2, 0, i6);
                    this.f1564i.write(this.f1556e, 0, this.f1557f);
                    int i7 = this.f1557f;
                    i5 -= i7;
                    this.f1559h += i7;
                }
            }
        }

        /* JADX INFO: renamed from: m1 */
        public void m1616m1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f1557f;
            int i4 = this.f1558g;
            int i5 = i3 - i4;
            byte[] bArr2 = this.f1556e;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f1558g += i2;
                this.f1559h += i2;
                return;
            }
            int i6 = i3 - i4;
            System.arraycopy(bArr, i, bArr2, i4, i6);
            int i7 = i + i6;
            int i8 = i2 - i6;
            this.f1558g = this.f1557f;
            this.f1559h += i6;
            m1613j1();
            if (i8 <= this.f1557f) {
                System.arraycopy(bArr, i7, this.f1556e, 0, i8);
                this.f1558g = i8;
            } else {
                this.f1564i.write(bArr, i7, i8);
            }
            this.f1559h += i8;
        }

        /* JADX INFO: renamed from: n1 */
        public void m1617n1(int i, InterfaceC0322b0 interfaceC0322b0) throws IOException {
            mo1575X0(i, 2);
            mo1562K0(interfaceC0322b0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: o0 */
        public void mo1590o0(byte[] bArr, int i, int i2) throws IOException {
            mo1577Z0(i2);
            m1616m1(bArr, i, i2);
        }

        /* JADX INFO: renamed from: o1 */
        public void m1618o1(InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) throws IOException {
            mo1577Z0(((AbstractC0319a) interfaceC0322b0).m1792d(interfaceC0336i0));
            interfaceC0336i0.mo1903c(interfaceC0322b0, this.f1554a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: p0 */
        public void mo1591p0(int i, ByteString byteString) throws IOException {
            mo1575X0(i, 2);
            mo1592q0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: q0 */
        public void mo1592q0(ByteString byteString) throws IOException {
            mo1577Z0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: v0 */
        public void mo1597v0(int i, int i2) throws IOException {
            m1614k1(14);
            m1606g1(i, 5);
            m1603d1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: w0 */
        public void mo1598w0(int i) throws IOException {
            m1614k1(4);
            m1603d1(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x0 */
        public void mo1599x0(int i, long j) throws IOException {
            m1614k1(18);
            m1606g1(i, 1);
            m1604e1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: y0 */
        public void mo1600y0(long j) throws IOException {
            m1614k1(8);
            m1604e1(j);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m1497A(int i, C0353u c0353u) {
        return (m1519W(1) * 2) + m1520X(2, i) + m1498B(3, c0353u);
    }

    /* JADX INFO: renamed from: B */
    public static int m1498B(int i, C0353u c0353u) {
        return m1519W(i) + m1499C(c0353u);
    }

    /* JADX INFO: renamed from: C */
    public static int m1499C(C0353u c0353u) {
        return m1500D(c0353u.m2354b());
    }

    /* JADX INFO: renamed from: D */
    public static int m1500D(int i) {
        return m1521Y(i) + i;
    }

    /* JADX INFO: renamed from: E */
    public static int m1501E(int i, InterfaceC0322b0 interfaceC0322b0) {
        return (m1519W(1) * 2) + m1520X(2, i) + m1502F(3, interfaceC0322b0);
    }

    /* JADX INFO: renamed from: F */
    public static int m1502F(int i, InterfaceC0322b0 interfaceC0322b0) {
        return m1519W(i) + m1504H(interfaceC0322b0);
    }

    /* JADX INFO: renamed from: G */
    public static int m1503G(int i, InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) {
        return m1519W(i) + m1505I(interfaceC0322b0, interfaceC0336i0);
    }

    /* JADX INFO: renamed from: H */
    public static int m1504H(InterfaceC0322b0 interfaceC0322b0) {
        return m1500D(interfaceC0322b0.getSerializedSize());
    }

    /* JADX INFO: renamed from: I */
    public static int m1505I(InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) {
        return m1500D(((AbstractC0319a) interfaceC0322b0).m1792d(interfaceC0336i0));
    }

    /* JADX INFO: renamed from: J */
    public static int m1506J(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* JADX INFO: renamed from: K */
    public static int m1507K(int i, ByteString byteString) {
        return (m1519W(1) * 2) + m1520X(2, i) + m1531h(3, byteString);
    }

    @Deprecated
    /* JADX INFO: renamed from: L */
    public static int m1508L(int i) {
        return m1521Y(i);
    }

    /* JADX INFO: renamed from: M */
    public static int m1509M(int i, int i2) {
        return m1519W(i) + m1510N(i2);
    }

    /* JADX INFO: renamed from: N */
    public static int m1510N(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: O */
    public static int m1511O(int i, long j) {
        return m1519W(i) + m1512P(j);
    }

    /* JADX INFO: renamed from: P */
    public static int m1512P(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: Q */
    public static int m1513Q(int i, int i2) {
        return m1519W(i) + m1514R(i2);
    }

    /* JADX INFO: renamed from: R */
    public static int m1514R(int i) {
        return m1521Y(m1524b0(i));
    }

    /* JADX INFO: renamed from: S */
    public static int m1515S(int i, long j) {
        return m1519W(i) + m1516T(j);
    }

    /* JADX INFO: renamed from: T */
    public static int m1516T(long j) {
        return m1523a0(m1526c0(j));
    }

    /* JADX INFO: renamed from: U */
    public static int m1517U(int i, String str) {
        return m1519W(i) + m1518V(str);
    }

    /* JADX INFO: renamed from: V */
    public static int m1518V(String str) {
        int length;
        try {
            length = Utf8.m1695j(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(C0351s.f1737a).length;
        }
        return m1500D(length);
    }

    /* JADX INFO: renamed from: W */
    public static int m1519W(int i) {
        return m1521Y(WireFormat.m1749c(i, 0));
    }

    /* JADX INFO: renamed from: X */
    public static int m1520X(int i, int i2) {
        return m1519W(i) + m1521Y(i2);
    }

    /* JADX INFO: renamed from: Y */
    public static int m1521Y(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: Z */
    public static int m1522Z(int i, long j) {
        return m1519W(i) + m1523a0(j);
    }

    /* JADX INFO: renamed from: a0 */
    public static int m1523a0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m1524b0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: c0 */
    public static long m1526c0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: e */
    public static int m1527e(int i, boolean z) {
        return m1519W(i) + m1528f(z);
    }

    /* JADX INFO: renamed from: f */
    public static int m1528f(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m1529g(byte[] bArr) {
        return m1500D(bArr.length);
    }

    /* JADX INFO: renamed from: g0 */
    public static CodedOutputStream m1530g0(OutputStream outputStream, int i) {
        return new C0287d(outputStream, i);
    }

    /* JADX INFO: renamed from: h */
    public static int m1531h(int i, ByteString byteString) {
        return m1519W(i) + m1533i(byteString);
    }

    /* JADX INFO: renamed from: h0 */
    public static CodedOutputStream m1532h0(byte[] bArr) {
        return m1534i0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static int m1533i(ByteString byteString) {
        return m1500D(byteString.size());
    }

    /* JADX INFO: renamed from: i0 */
    public static CodedOutputStream m1534i0(byte[] bArr, int i, int i2) {
        return new C0286c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m1535j(int i, double d) {
        return m1519W(i) + m1536k(d);
    }

    /* JADX INFO: renamed from: k */
    public static int m1536k(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m1537l(int i, int i2) {
        return m1519W(i) + m1538m(i2);
    }

    /* JADX INFO: renamed from: m */
    public static int m1538m(int i) {
        return m1549x(i);
    }

    /* JADX INFO: renamed from: n */
    public static int m1539n(int i, int i2) {
        return m1519W(i) + m1540o(i2);
    }

    /* JADX INFO: renamed from: o */
    public static int m1540o(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: p */
    public static int m1541p(int i, long j) {
        return m1519W(i) + m1542q(j);
    }

    /* JADX INFO: renamed from: q */
    public static int m1542q(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: r */
    public static int m1543r(int i, float f) {
        return m1519W(i) + m1544s(f);
    }

    /* JADX INFO: renamed from: s */
    public static int m1544s(float f) {
        return 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static int m1545t(int i, InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) {
        return (m1519W(i) * 2) + m1547v(interfaceC0322b0, interfaceC0336i0);
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static int m1546u(InterfaceC0322b0 interfaceC0322b0) {
        return interfaceC0322b0.getSerializedSize();
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public static int m1547v(InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) {
        return ((AbstractC0319a) interfaceC0322b0).m1792d(interfaceC0336i0);
    }

    /* JADX INFO: renamed from: w */
    public static int m1548w(int i, int i2) {
        return m1519W(i) + m1549x(i2);
    }

    /* JADX INFO: renamed from: x */
    public static int m1549x(int i) {
        if (i >= 0) {
            return m1521Y(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: y */
    public static int m1550y(int i, long j) {
        return m1519W(i) + m1551z(j);
    }

    /* JADX INFO: renamed from: z */
    public static int m1551z(long j) {
        return m1523a0(j);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m1552A0(float f) throws IOException {
        mo1598w0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* JADX INFO: renamed from: B0 */
    public final void m1553B0(int i, InterfaceC0322b0 interfaceC0322b0) throws IOException {
        mo1575X0(i, 3);
        m1555D0(interfaceC0322b0);
        mo1575X0(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: C0 */
    public final void m1554C0(int i, InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        mo1575X0(i, 3);
        m1556E0(interfaceC0322b0, interfaceC0336i0);
        mo1575X0(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: D0 */
    public final void m1555D0(InterfaceC0322b0 interfaceC0322b0) throws IOException {
        interfaceC0322b0.mo1634a(this);
    }

    @Deprecated
    /* JADX INFO: renamed from: E0 */
    public final void m1556E0(InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) throws IOException {
        interfaceC0336i0.mo1903c(interfaceC0322b0, this.f1554a);
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo1557F0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: G0 */
    public abstract void mo1558G0(int i) throws IOException;

    /* JADX INFO: renamed from: H0 */
    public final void m1559H0(int i, long j) throws IOException {
        mo1578a1(i, j);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m1560I0(long j) throws IOException {
        mo1580b1(j);
    }

    /* JADX INFO: renamed from: J0 */
    public abstract void mo1561J0(int i, InterfaceC0322b0 interfaceC0322b0, InterfaceC0336i0 interfaceC0336i0) throws IOException;

    /* JADX INFO: renamed from: K0 */
    public abstract void mo1562K0(InterfaceC0322b0 interfaceC0322b0) throws IOException;

    /* JADX INFO: renamed from: L0 */
    public abstract void mo1563L0(int i, InterfaceC0322b0 interfaceC0322b0) throws IOException;

    /* JADX INFO: renamed from: M0 */
    public abstract void mo1564M0(int i, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: N0 */
    public final void m1565N0(int i, int i2) throws IOException {
        mo1597v0(i, i2);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m1566O0(int i) throws IOException {
        mo1598w0(i);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m1567P0(int i, long j) throws IOException {
        mo1599x0(i, j);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m1568Q0(long j) throws IOException {
        mo1600y0(j);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m1569R0(int i, int i2) throws IOException {
        mo1576Y0(i, m1524b0(i2));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m1570S0(int i) throws IOException {
        mo1577Z0(m1524b0(i));
    }

    /* JADX INFO: renamed from: T0 */
    public final void m1571T0(int i, long j) throws IOException {
        mo1578a1(i, m1526c0(j));
    }

    /* JADX INFO: renamed from: U0 */
    public final void m1572U0(long j) throws IOException {
        mo1580b1(m1526c0(j));
    }

    /* JADX INFO: renamed from: V0 */
    public abstract void mo1573V0(int i, String str) throws IOException;

    /* JADX INFO: renamed from: W0 */
    public abstract void mo1574W0(String str) throws IOException;

    /* JADX INFO: renamed from: X0 */
    public abstract void mo1575X0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: Y0 */
    public abstract void mo1576Y0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: Z0 */
    public abstract void mo1577Z0(int i) throws IOException;

    /* JADX INFO: renamed from: a1 */
    public abstract void mo1578a1(int i, long j) throws IOException;

    @Override // p153l.jr3
    /* JADX INFO: renamed from: b */
    public abstract void mo1579b(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: b1 */
    public abstract void mo1580b1(long j) throws IOException;

    /* JADX INFO: renamed from: d */
    public final void m1581d() {
        if (mo1585j0() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo1582d0() throws IOException;

    /* JADX INFO: renamed from: e0 */
    public final void m1583e0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f1552c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(C0351s.f1737a);
        try {
            mo1577Z0(bytes.length);
            mo1579b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m1584f0() {
        return this.f1555b;
    }

    /* JADX INFO: renamed from: j0 */
    public abstract int mo1585j0();

    /* JADX INFO: renamed from: k0 */
    public abstract void mo1586k0(byte b) throws IOException;

    /* JADX INFO: renamed from: l0 */
    public abstract void mo1587l0(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: m0 */
    public final void m1588m0(boolean z) throws IOException {
        mo1586k0(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1589n0(byte[] bArr) throws IOException {
        mo1590o0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: o0 */
    public abstract void mo1590o0(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: p0 */
    public abstract void mo1591p0(int i, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: q0 */
    public abstract void mo1592q0(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: r0 */
    public final void m1593r0(int i, double d) throws IOException {
        mo1599x0(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1594s0(double d) throws IOException {
        mo1600y0(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1595t0(int i, int i2) throws IOException {
        mo1557F0(i, i2);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1596u0(int i) throws IOException {
        mo1558G0(i);
    }

    /* JADX INFO: renamed from: v0 */
    public abstract void mo1597v0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: w0 */
    public abstract void mo1598w0(int i) throws IOException;

    /* JADX INFO: renamed from: x0 */
    public abstract void mo1599x0(int i, long j) throws IOException;

    /* JADX INFO: renamed from: y0 */
    public abstract void mo1600y0(long j) throws IOException;

    /* JADX INFO: renamed from: z0 */
    public final void m1601z0(int i, float f) throws IOException {
        mo1597v0(i, Float.floatToRawIntBits(f));
    }

    public CodedOutputStream() {
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }
}
