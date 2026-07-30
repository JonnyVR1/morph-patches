package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.dqi0;
import p149l.hpj0;
import p149l.ig3;
import p149l.iq3;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CodedOutputStream extends iq3 {

    /* JADX INFO: renamed from: a */
    public static final Logger f11520a = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: b */
    public static final boolean f11521b = hpj0.m132352k();

    /* JADX INFO: renamed from: c */
    public static final long f11522c = hpj0.m132346e();

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStream$b */
    public static abstract class AbstractC3375b extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f11523d;

        /* JADX INFO: renamed from: e */
        public final int f11524e;

        /* JADX INFO: renamed from: f */
        public int f11525f;

        /* JADX INFO: renamed from: g */
        public int f11526g;

        public AbstractC3375b(int i) {
            super();
            if (i < 0) {
                ig3.m135964a("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f11523d = bArr;
            this.f11524e = bArr.length;
        }

        /* JADX INFO: renamed from: K0 */
        public final void m16978K0(byte b) {
            byte[] bArr = this.f11523d;
            int i = this.f11525f;
            this.f11525f = i + 1;
            bArr[i] = b;
            this.f11526g++;
        }

        /* JADX INFO: renamed from: L0 */
        public final void m16979L0(int i) {
            byte[] bArr = this.f11523d;
            int i2 = this.f11525f;
            int i3 = i2 + 1;
            this.f11525f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f11525f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f11525f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f11525f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f11526g += 4;
        }

        /* JADX INFO: renamed from: M0 */
        public final void m16980M0(long j) {
            byte[] bArr = this.f11523d;
            int i = this.f11525f;
            int i2 = i + 1;
            this.f11525f = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f11525f = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f11525f = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f11525f = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f11525f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f11525f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f11525f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f11525f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f11526g += 8;
        }

        /* JADX INFO: renamed from: N0 */
        public final void m16981N0(int i) {
            if (i >= 0) {
                m16983P0(i);
            } else {
                m16984Q0(i);
            }
        }

        /* JADX INFO: renamed from: O0 */
        public final void m16982O0(int i, int i2) {
            m16983P0(WireFormat.m17074c(i, i2));
        }

        /* JADX INFO: renamed from: P0 */
        public final void m16983P0(int i) {
            if (CodedOutputStream.f11521b) {
                long j = CodedOutputStream.f11522c + ((long) this.f11525f);
                long j2 = j;
                while (true) {
                    int i2 = i & (-128);
                    byte[] bArr = this.f11523d;
                    if (i2 == 0) {
                        hpj0.m132354m(bArr, j2, (byte) i);
                        int i3 = (int) ((1 + j2) - j);
                        this.f11525f += i3;
                        this.f11526g += i3;
                        return;
                    }
                    hpj0.m132354m(bArr, j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                    j2 = 1 + j2;
                }
            } else {
                while (true) {
                    int i4 = i & (-128);
                    byte[] bArr2 = this.f11523d;
                    if (i4 == 0) {
                        int i5 = this.f11525f;
                        this.f11525f = i5 + 1;
                        bArr2[i5] = (byte) i;
                        this.f11526g++;
                        return;
                    }
                    int i6 = this.f11525f;
                    this.f11525f = i6 + 1;
                    bArr2[i6] = (byte) ((i & 127) | 128);
                    this.f11526g++;
                    i >>>= 7;
                }
            }
        }

        /* JADX INFO: renamed from: Q0 */
        public final void m16984Q0(long j) {
            if (CodedOutputStream.f11521b) {
                long j2 = CodedOutputStream.f11522c + ((long) this.f11525f);
                long j3 = j2;
                while (true) {
                    long j4 = j & (-128);
                    byte[] bArr = this.f11523d;
                    if (j4 == 0) {
                        hpj0.m132354m(bArr, j3, (byte) j);
                        int i = (int) ((1 + j3) - j2);
                        this.f11525f += i;
                        this.f11526g += i;
                        return;
                    }
                    hpj0.m132354m(bArr, j3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                    j3 = 1 + j3;
                }
            } else {
                while (true) {
                    long j5 = j & (-128);
                    byte[] bArr2 = this.f11523d;
                    if (j5 == 0) {
                        int i2 = this.f11525f;
                        this.f11525f = i2 + 1;
                        bArr2[i2] = (byte) j;
                        this.f11526g++;
                        return;
                    }
                    int i3 = this.f11525f;
                    this.f11525f = i3 + 1;
                    bArr2[i3] = (byte) ((((int) j) & 127) | 128);
                    this.f11526g++;
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Y */
        public final int mo16948Y() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStream$c */
    public static class C3376c extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f11527d;

        /* JADX INFO: renamed from: e */
        public final int f11528e;

        /* JADX INFO: renamed from: f */
        public final int f11529f;

        /* JADX INFO: renamed from: g */
        public int f11530g;

        public C3376c(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                jfd0.m141176a("buffer");
                throw null;
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                dqi0.m113073a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                throw null;
            }
            this.f11527d = bArr;
            this.f11528e = i;
            this.f11530g = i;
            this.f11529f = i3;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D0 */
        public final void mo16939D0(int i, String str) throws IOException {
            mo16941F0(i, 2);
            mo16940E0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E0 */
        public final void mo16940E0(String str) throws IOException {
            int i = this.f11530g;
            try {
                int iM16905O = CodedOutputStream.m16905O(str.length() * 3);
                int iM16905O2 = CodedOutputStream.m16905O(str.length());
                if (iM16905O2 != iM16905O) {
                    mo16943H0(Utf8.m17043h(str));
                    this.f11530g = Utf8.m17042g(str, this.f11527d, this.f11530g, mo16948Y());
                    return;
                }
                int i2 = i + iM16905O2;
                this.f11530g = i2;
                int iM17042g = Utf8.m17042g(str, this.f11527d, i2, mo16948Y());
                this.f11530g = i;
                mo16943H0((iM17042g - i) - iM16905O2);
                this.f11530g = iM17042g;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f11530g = i;
                m16947U(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F0 */
        public final void mo16941F0(int i, int i2) throws IOException {
            mo16943H0(WireFormat.m17074c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G0 */
        public final void mo16942G0(int i, int i2) throws IOException {
            mo16941F0(i, 0);
            mo16943H0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H0 */
        public final void mo16943H0(int i) throws IOException {
            if (!CodedOutputStream.f11521b || mo16948Y() < 10) {
                while (true) {
                    int i2 = i & (-128);
                    byte[] bArr = this.f11527d;
                    if (i2 == 0) {
                        int i3 = this.f11530g;
                        this.f11530g = i3 + 1;
                        bArr[i3] = (byte) i;
                        return;
                    } else {
                        try {
                            int i4 = this.f11530g;
                            this.f11530g = i4 + 1;
                            bArr[i4] = (byte) ((i & 127) | 128);
                            i >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
                }
            }
            long j = CodedOutputStream.f11522c + ((long) this.f11530g);
            while (true) {
                int i5 = i & (-128);
                byte[] bArr2 = this.f11527d;
                if (i5 == 0) {
                    hpj0.m132354m(bArr2, j, (byte) i);
                    this.f11530g++;
                    return;
                } else {
                    hpj0.m132354m(bArr2, j, (byte) ((i & 127) | 128));
                    this.f11530g++;
                    i >>>= 7;
                    j = 1 + j;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I0 */
        public final void mo16944I0(int i, long j) throws IOException {
            mo16941F0(i, 0);
            mo16945J0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J0 */
        public final void mo16945J0(long j) throws IOException {
            if (!CodedOutputStream.f11521b || mo16948Y() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    byte[] bArr = this.f11527d;
                    if (j2 == 0) {
                        int i = this.f11530g;
                        this.f11530g = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            int i2 = this.f11530g;
                            this.f11530g = i2 + 1;
                            bArr[i2] = (byte) ((((int) j) & 127) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
                }
            }
            long j3 = CodedOutputStream.f11522c + ((long) this.f11530g);
            while (true) {
                long j4 = j & (-128);
                byte[] bArr2 = this.f11527d;
                if (j4 == 0) {
                    hpj0.m132354m(bArr2, j3, (byte) j);
                    this.f11530g++;
                    return;
                } else {
                    hpj0.m132354m(bArr2, j3, (byte) ((((int) j) & 127) | 128));
                    this.f11530g++;
                    j >>>= 7;
                    j3 = 1 + j3;
                }
            }
        }

        /* JADX INFO: renamed from: K0 */
        public final void m16985K0(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f11527d, this.f11530g, iRemaining);
                this.f11530g += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), Integer.valueOf(iRemaining)), e);
            }
        }

        /* JADX INFO: renamed from: L0 */
        public final void m16986L0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f11527d, this.f11530g, i2);
                this.f11530g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: T */
        public void mo16946T() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Y */
        public final int mo16948Y() {
            return this.f11529f - this.f11530g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Z */
        public final void mo16949Z(byte b) throws IOException {
            try {
                byte[] bArr = this.f11527d;
                int i = this.f11530g;
                this.f11530g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
            }
        }

        @Override // p149l.iq3
        /* JADX INFO: renamed from: a */
        public final void mo16987a(ByteBuffer byteBuffer) throws IOException {
            m16985K0(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: a0 */
        public final void mo16950a0(int i, boolean z) throws IOException {
            mo16941F0(i, 0);
            mo16949Z(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream, p149l.iq3
        /* JADX INFO: renamed from: b */
        public final void mo16951b(byte[] bArr, int i, int i2) throws IOException {
            m16986L0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: d0 */
        public final void mo16954d0(byte[] bArr, int i, int i2) throws IOException {
            mo16943H0(i2);
            m16986L0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: e0 */
        public final void mo16956e0(int i, ByteString byteString) throws IOException {
            mo16941F0(i, 2);
            mo16957f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: f0 */
        public final void mo16957f0(ByteString byteString) throws IOException {
            mo16943H0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: k0 */
        public final void mo16962k0(int i, int i2) throws IOException {
            mo16941F0(i, 5);
            mo16963l0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: l0 */
        public final void mo16963l0(int i) throws IOException {
            try {
                byte[] bArr = this.f11527d;
                int i2 = this.f11530g;
                int i3 = i2 + 1;
                this.f11530g = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f11530g = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f11530g = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f11530g = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: m0 */
        public final void mo16964m0(int i, long j) throws IOException {
            mo16941F0(i, 1);
            mo16965n0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: n0 */
        public final void mo16965n0(long j) throws IOException {
            try {
                byte[] bArr = this.f11527d;
                int i = this.f11530g;
                int i2 = i + 1;
                this.f11530g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f11530g = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f11530g = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f11530g = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f11530g = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f11530g = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f11530g = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f11530g = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11530g), Integer.valueOf(this.f11529f), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: s0 */
        public final void mo16970s0(int i, int i2) throws IOException {
            mo16941F0(i, 0);
            mo16971t0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: t0 */
        public final void mo16971t0(int i) throws IOException {
            if (i >= 0) {
                mo16943H0(i);
            } else {
                mo16945J0(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: w0 */
        public final void mo16974w0(int i, InterfaceC3419q interfaceC3419q) throws IOException {
            mo16941F0(i, 2);
            mo16975x0(interfaceC3419q);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x0 */
        public final void mo16975x0(InterfaceC3419q interfaceC3419q) throws IOException {
            mo16943H0(interfaceC3419q.getSerializedSize());
            interfaceC3419q.writeTo(this);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStream$d */
    public static final class C3377d extends AbstractC3375b {

        /* JADX INFO: renamed from: h */
        public final OutputStream f11531h;

        public C3377d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f11531h = outputStream;
            } else {
                jfd0.m141176a("out");
                throw null;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D0 */
        public void mo16939D0(int i, String str) throws IOException {
            mo16941F0(i, 2);
            mo16940E0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E0 */
        public void mo16940E0(String str) throws IOException {
            int iM17043h;
            try {
                int length = str.length() * 3;
                int iM16905O = CodedOutputStream.m16905O(length);
                int i = iM16905O + length;
                int i2 = this.f11524e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iM17042g = Utf8.m17042g(str, bArr, 0, length);
                    mo16943H0(iM17042g);
                    mo16951b(bArr, 0, iM17042g);
                    return;
                }
                if (i > i2 - this.f11525f) {
                    m16988R0();
                }
                int iM16905O2 = CodedOutputStream.m16905O(str.length());
                int i3 = this.f11525f;
                try {
                    if (iM16905O2 == iM16905O) {
                        int i4 = i3 + iM16905O2;
                        this.f11525f = i4;
                        int iM17042g2 = Utf8.m17042g(str, this.f11523d, i4, this.f11524e - i4);
                        this.f11525f = i3;
                        iM17043h = (iM17042g2 - i3) - iM16905O2;
                        m16983P0(iM17043h);
                        this.f11525f = iM17042g2;
                    } else {
                        iM17043h = Utf8.m17043h(str);
                        m16983P0(iM17043h);
                        this.f11525f = Utf8.m17042g(str, this.f11523d, this.f11525f, iM17043h);
                    }
                    this.f11526g += iM17043h;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f11526g -= this.f11525f - i3;
                    this.f11525f = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m16947U(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F0 */
        public void mo16941F0(int i, int i2) throws IOException {
            mo16943H0(WireFormat.m17074c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G0 */
        public void mo16942G0(int i, int i2) throws IOException {
            m16989S0(20);
            m16982O0(i, 0);
            m16983P0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H0 */
        public void mo16943H0(int i) throws IOException {
            m16989S0(10);
            m16983P0(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I0 */
        public void mo16944I0(int i, long j) throws IOException {
            m16989S0(20);
            m16982O0(i, 0);
            m16984Q0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J0 */
        public void mo16945J0(long j) throws IOException {
            m16989S0(10);
            m16984Q0(j);
        }

        /* JADX INFO: renamed from: R0 */
        public final void m16988R0() throws IOException {
            this.f11531h.write(this.f11523d, 0, this.f11525f);
            this.f11525f = 0;
        }

        /* JADX INFO: renamed from: S0 */
        public final void m16989S0(int i) throws IOException {
            if (this.f11524e - this.f11525f < i) {
                m16988R0();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: T */
        public void mo16946T() throws IOException {
            if (this.f11525f > 0) {
                m16988R0();
            }
        }

        /* JADX INFO: renamed from: T0 */
        public void m16990T0(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f11524e;
            int i2 = this.f11525f;
            int i3 = i - i2;
            byte[] bArr = this.f11523d;
            if (i3 >= iRemaining) {
                byteBuffer.get(bArr, i2, iRemaining);
                this.f11525f += iRemaining;
                this.f11526g += iRemaining;
                return;
            }
            int i4 = i - i2;
            byteBuffer.get(bArr, i2, i4);
            int i5 = iRemaining - i4;
            this.f11525f = this.f11524e;
            this.f11526g += i4;
            m16988R0();
            while (true) {
                int i6 = this.f11524e;
                byte[] bArr2 = this.f11523d;
                if (i5 <= i6) {
                    byteBuffer.get(bArr2, 0, i5);
                    this.f11525f = i5;
                    this.f11526g += i5;
                    return;
                } else {
                    byteBuffer.get(bArr2, 0, i6);
                    this.f11531h.write(this.f11523d, 0, this.f11524e);
                    int i7 = this.f11524e;
                    i5 -= i7;
                    this.f11526g += i7;
                }
            }
        }

        /* JADX INFO: renamed from: U0 */
        public void m16991U0(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f11524e;
            int i4 = this.f11525f;
            int i5 = i3 - i4;
            byte[] bArr2 = this.f11523d;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f11525f += i2;
                this.f11526g += i2;
                return;
            }
            int i6 = i3 - i4;
            System.arraycopy(bArr, i, bArr2, i4, i6);
            int i7 = i + i6;
            int i8 = i2 - i6;
            this.f11525f = this.f11524e;
            this.f11526g += i6;
            m16988R0();
            if (i8 <= this.f11524e) {
                System.arraycopy(bArr, i7, this.f11523d, 0, i8);
                this.f11525f = i8;
            } else {
                this.f11531h.write(bArr, i7, i8);
            }
            this.f11526g += i8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Z */
        public void mo16949Z(byte b) throws IOException {
            if (this.f11525f == this.f11524e) {
                m16988R0();
            }
            m16978K0(b);
        }

        @Override // p149l.iq3
        /* JADX INFO: renamed from: a */
        public void mo16987a(ByteBuffer byteBuffer) throws IOException {
            m16990T0(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: a0 */
        public void mo16950a0(int i, boolean z) throws IOException {
            m16989S0(11);
            m16982O0(i, 0);
            m16978K0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream, p149l.iq3
        /* JADX INFO: renamed from: b */
        public void mo16951b(byte[] bArr, int i, int i2) throws IOException {
            m16991U0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: d0 */
        public void mo16954d0(byte[] bArr, int i, int i2) throws IOException {
            mo16943H0(i2);
            m16991U0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: e0 */
        public void mo16956e0(int i, ByteString byteString) throws IOException {
            mo16941F0(i, 2);
            mo16957f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: f0 */
        public void mo16957f0(ByteString byteString) throws IOException {
            mo16943H0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: k0 */
        public void mo16962k0(int i, int i2) throws IOException {
            m16989S0(14);
            m16982O0(i, 5);
            m16979L0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: l0 */
        public void mo16963l0(int i) throws IOException {
            m16989S0(4);
            m16979L0(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: m0 */
        public void mo16964m0(int i, long j) throws IOException {
            m16989S0(18);
            m16982O0(i, 1);
            m16980M0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: n0 */
        public void mo16965n0(long j) throws IOException {
            m16989S0(8);
            m16980M0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: s0 */
        public void mo16970s0(int i, int i2) throws IOException {
            m16989S0(20);
            m16982O0(i, 0);
            m16981N0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: t0 */
        public void mo16971t0(int i) throws IOException {
            if (i >= 0) {
                mo16943H0(i);
            } else {
                mo16945J0(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: w0 */
        public void mo16974w0(int i, InterfaceC3419q interfaceC3419q) throws IOException {
            mo16941F0(i, 2);
            mo16975x0(interfaceC3419q);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x0 */
        public void mo16975x0(InterfaceC3419q interfaceC3419q) throws IOException {
            mo16943H0(interfaceC3419q.getSerializedSize());
            interfaceC3419q.writeTo(this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m16891A(int i) {
        return m16905O(i) + i;
    }

    /* JADX INFO: renamed from: B */
    public static int m16892B(int i, InterfaceC3419q interfaceC3419q) {
        return (m16903M(1) * 2) + m16904N(2, i) + m16893C(3, interfaceC3419q);
    }

    /* JADX INFO: renamed from: C */
    public static int m16893C(int i, InterfaceC3419q interfaceC3419q) {
        return m16903M(i) + m16894D(interfaceC3419q);
    }

    /* JADX INFO: renamed from: D */
    public static int m16894D(InterfaceC3419q interfaceC3419q) {
        return m16891A(interfaceC3419q.getSerializedSize());
    }

    /* JADX INFO: renamed from: E */
    public static int m16895E(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    @Deprecated
    /* JADX INFO: renamed from: F */
    public static int m16896F(int i) {
        return m16905O(i);
    }

    /* JADX INFO: renamed from: G */
    public static int m16897G(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: H */
    public static int m16898H(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: I */
    public static int m16899I(int i) {
        return m16905O(m16908R(i));
    }

    /* JADX INFO: renamed from: J */
    public static int m16900J(long j) {
        return m16907Q(m16909S(j));
    }

    /* JADX INFO: renamed from: K */
    public static int m16901K(int i, String str) {
        return m16903M(i) + m16902L(str);
    }

    /* JADX INFO: renamed from: L */
    public static int m16902L(String str) {
        int length;
        try {
            length = Utf8.m17043h(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(C3414l.f11606a).length;
        }
        return m16891A(length);
    }

    /* JADX INFO: renamed from: M */
    public static int m16903M(int i) {
        return m16905O(WireFormat.m17074c(i, 0));
    }

    /* JADX INFO: renamed from: N */
    public static int m16904N(int i, int i2) {
        return m16903M(i) + m16905O(i2);
    }

    /* JADX INFO: renamed from: O */
    public static int m16905O(int i) {
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

    /* JADX INFO: renamed from: P */
    public static int m16906P(int i, long j) {
        return m16903M(i) + m16907Q(j);
    }

    /* JADX INFO: renamed from: Q */
    public static int m16907Q(long j) {
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

    /* JADX INFO: renamed from: R */
    public static int m16908R(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: S */
    public static long m16909S(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: V */
    public static CodedOutputStream m16910V(OutputStream outputStream, int i) {
        return new C3377d(outputStream, i);
    }

    /* JADX INFO: renamed from: W */
    public static CodedOutputStream m16911W(byte[] bArr) {
        return m16912X(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: X */
    public static CodedOutputStream m16912X(byte[] bArr, int i, int i2) {
        return new C3376c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: f */
    public static int m16915f(int i, boolean z) {
        return m16903M(i) + m16916g(z);
    }

    /* JADX INFO: renamed from: g */
    public static int m16916g(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public static int m16917h(byte[] bArr) {
        return m16891A(bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static int m16918i(int i, ByteString byteString) {
        return m16903M(i) + m16919j(byteString);
    }

    /* JADX INFO: renamed from: j */
    public static int m16919j(ByteString byteString) {
        return m16891A(byteString.size());
    }

    /* JADX INFO: renamed from: k */
    public static int m16920k(int i, double d) {
        return m16903M(i) + m16921l(d);
    }

    /* JADX INFO: renamed from: l */
    public static int m16921l(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m16922m(int i, int i2) {
        return m16903M(i) + m16923n(i2);
    }

    /* JADX INFO: renamed from: n */
    public static int m16923n(int i) {
        return m16930u(i);
    }

    /* JADX INFO: renamed from: o */
    public static int m16924o(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: p */
    public static int m16925p(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: q */
    public static int m16926q(int i, float f) {
        return m16903M(i) + m16927r(f);
    }

    /* JADX INFO: renamed from: r */
    public static int m16927r(float f) {
        return 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static int m16928s(InterfaceC3419q interfaceC3419q) {
        return interfaceC3419q.getSerializedSize();
    }

    /* JADX INFO: renamed from: t */
    public static int m16929t(int i, int i2) {
        return m16903M(i) + m16930u(i2);
    }

    /* JADX INFO: renamed from: u */
    public static int m16930u(int i) {
        if (i >= 0) {
            return m16905O(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: v */
    public static int m16931v(int i, long j) {
        return m16903M(i) + m16932w(j);
    }

    /* JADX INFO: renamed from: w */
    public static int m16932w(long j) {
        return m16907Q(j);
    }

    /* JADX INFO: renamed from: x */
    public static int m16933x(int i, C3416n c3416n) {
        return (m16903M(1) * 2) + m16904N(2, i) + m16934y(3, c3416n);
    }

    /* JADX INFO: renamed from: y */
    public static int m16934y(int i, C3416n c3416n) {
        return m16903M(i) + m16935z(c3416n);
    }

    /* JADX INFO: renamed from: z */
    public static int m16935z(C3416n c3416n) {
        return m16891A(c3416n.m17216b());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m16936A0(long j) throws IOException {
        mo16965n0(j);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m16937B0(int i) throws IOException {
        mo16943H0(m16908R(i));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m16938C0(long j) throws IOException {
        mo16945J0(m16909S(j));
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo16939D0(int i, String str) throws IOException;

    /* JADX INFO: renamed from: E0 */
    public abstract void mo16940E0(String str) throws IOException;

    /* JADX INFO: renamed from: F0 */
    public abstract void mo16941F0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: G0 */
    public abstract void mo16942G0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: H0 */
    public abstract void mo16943H0(int i) throws IOException;

    /* JADX INFO: renamed from: I0 */
    public abstract void mo16944I0(int i, long j) throws IOException;

    /* JADX INFO: renamed from: J0 */
    public abstract void mo16945J0(long j) throws IOException;

    /* JADX INFO: renamed from: T */
    public abstract void mo16946T() throws IOException;

    /* JADX INFO: renamed from: U */
    public final void m16947U(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f11520a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(C3414l.f11606a);
        try {
            mo16943H0(bytes.length);
            mo16951b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public abstract int mo16948Y();

    /* JADX INFO: renamed from: Z */
    public abstract void mo16949Z(byte b) throws IOException;

    /* JADX INFO: renamed from: a0 */
    public abstract void mo16950a0(int i, boolean z) throws IOException;

    @Override // p149l.iq3
    /* JADX INFO: renamed from: b */
    public abstract void mo16951b(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: b0 */
    public final void m16952b0(boolean z) throws IOException {
        mo16949Z(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m16953c0(byte[] bArr) throws IOException {
        mo16954d0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo16954d0(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: e */
    public final void m16955e() {
        if (mo16948Y() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo16956e0(int i, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: f0 */
    public abstract void mo16957f0(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: g0 */
    public final void m16958g0(int i, double d) throws IOException {
        mo16964m0(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m16959h0(double d) throws IOException {
        mo16965n0(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m16960i0(int i, int i2) throws IOException {
        mo16970s0(i, i2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m16961j0(int i) throws IOException {
        mo16971t0(i);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo16962k0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: l0 */
    public abstract void mo16963l0(int i) throws IOException;

    /* JADX INFO: renamed from: m0 */
    public abstract void mo16964m0(int i, long j) throws IOException;

    /* JADX INFO: renamed from: n0 */
    public abstract void mo16965n0(long j) throws IOException;

    /* JADX INFO: renamed from: o0 */
    public final void m16966o0(int i, float f) throws IOException {
        mo16962k0(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m16967p0(float f) throws IOException {
        mo16963l0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* JADX INFO: renamed from: q0 */
    public final void m16968q0(int i, InterfaceC3419q interfaceC3419q) throws IOException {
        mo16941F0(i, 3);
        m16969r0(interfaceC3419q);
        mo16941F0(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: r0 */
    public final void m16969r0(InterfaceC3419q interfaceC3419q) throws IOException {
        interfaceC3419q.writeTo(this);
    }

    /* JADX INFO: renamed from: s0 */
    public abstract void mo16970s0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: t0 */
    public abstract void mo16971t0(int i) throws IOException;

    /* JADX INFO: renamed from: u0 */
    public final void m16972u0(int i, long j) throws IOException {
        mo16944I0(i, j);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m16973v0(long j) throws IOException {
        mo16945J0(j);
    }

    /* JADX INFO: renamed from: w0 */
    public abstract void mo16974w0(int i, InterfaceC3419q interfaceC3419q) throws IOException;

    /* JADX INFO: renamed from: x0 */
    public abstract void mo16975x0(InterfaceC3419q interfaceC3419q) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: y0 */
    public final void m16976y0(int i) throws IOException {
        mo16943H0(i);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m16977z0(int i) throws IOException {
        mo16963l0(i);
    }

    public CodedOutputStream() {
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException() {
            super(MESSAGE);
        }
    }
}
