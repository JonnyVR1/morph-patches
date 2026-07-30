package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.gzi0;
import p153l.ir3;
import p153l.kyj0;
import p153l.mnd0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CodedOutputStream extends ir3 {

    /* JADX INFO: renamed from: a */
    public static final Logger f11557a = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: b */
    public static final boolean f11558b = kyj0.m151990k();

    /* JADX INFO: renamed from: c */
    public static final long f11559c = kyj0.m151984e();

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStream$b */
    public static abstract class AbstractC3398b extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f11560d;

        /* JADX INFO: renamed from: e */
        public final int f11561e;

        /* JADX INFO: renamed from: f */
        public int f11562f;

        /* JADX INFO: renamed from: g */
        public int f11563g;

        public AbstractC3398b(int i) {
            super();
            if (i < 0) {
                wg3.m206174a("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f11560d = bArr;
            this.f11561e = bArr.length;
        }

        /* JADX INFO: renamed from: K0 */
        public final void m17033K0(byte b) {
            byte[] bArr = this.f11560d;
            int i = this.f11562f;
            this.f11562f = i + 1;
            bArr[i] = b;
            this.f11563g++;
        }

        /* JADX INFO: renamed from: L0 */
        public final void m17034L0(int i) {
            byte[] bArr = this.f11560d;
            int i2 = this.f11562f;
            int i3 = i2 + 1;
            this.f11562f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f11562f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f11562f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f11562f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f11563g += 4;
        }

        /* JADX INFO: renamed from: M0 */
        public final void m17035M0(long j) {
            byte[] bArr = this.f11560d;
            int i = this.f11562f;
            int i2 = i + 1;
            this.f11562f = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f11562f = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f11562f = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f11562f = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f11562f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f11562f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f11562f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f11562f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f11563g += 8;
        }

        /* JADX INFO: renamed from: N0 */
        public final void m17036N0(int i) {
            if (i >= 0) {
                m17038P0(i);
            } else {
                m17039Q0(i);
            }
        }

        /* JADX INFO: renamed from: O0 */
        public final void m17037O0(int i, int i2) {
            m17038P0(WireFormat.m17129c(i, i2));
        }

        /* JADX INFO: renamed from: P0 */
        public final void m17038P0(int i) {
            if (CodedOutputStream.f11558b) {
                long j = CodedOutputStream.f11559c + ((long) this.f11562f);
                long j2 = j;
                while (true) {
                    int i2 = i & (-128);
                    byte[] bArr = this.f11560d;
                    if (i2 == 0) {
                        kyj0.m151992m(bArr, j2, (byte) i);
                        int i3 = (int) ((1 + j2) - j);
                        this.f11562f += i3;
                        this.f11563g += i3;
                        return;
                    }
                    kyj0.m151992m(bArr, j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                    j2 = 1 + j2;
                }
            } else {
                while (true) {
                    int i4 = i & (-128);
                    byte[] bArr2 = this.f11560d;
                    if (i4 == 0) {
                        int i5 = this.f11562f;
                        this.f11562f = i5 + 1;
                        bArr2[i5] = (byte) i;
                        this.f11563g++;
                        return;
                    }
                    int i6 = this.f11562f;
                    this.f11562f = i6 + 1;
                    bArr2[i6] = (byte) ((i & 127) | 128);
                    this.f11563g++;
                    i >>>= 7;
                }
            }
        }

        /* JADX INFO: renamed from: Q0 */
        public final void m17039Q0(long j) {
            if (CodedOutputStream.f11558b) {
                long j2 = CodedOutputStream.f11559c + ((long) this.f11562f);
                long j3 = j2;
                while (true) {
                    long j4 = j & (-128);
                    byte[] bArr = this.f11560d;
                    if (j4 == 0) {
                        kyj0.m151992m(bArr, j3, (byte) j);
                        int i = (int) ((1 + j3) - j2);
                        this.f11562f += i;
                        this.f11563g += i;
                        return;
                    }
                    kyj0.m151992m(bArr, j3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                    j3 = 1 + j3;
                }
            } else {
                while (true) {
                    long j5 = j & (-128);
                    byte[] bArr2 = this.f11560d;
                    if (j5 == 0) {
                        int i2 = this.f11562f;
                        this.f11562f = i2 + 1;
                        bArr2[i2] = (byte) j;
                        this.f11563g++;
                        return;
                    }
                    int i3 = this.f11562f;
                    this.f11562f = i3 + 1;
                    bArr2[i3] = (byte) ((((int) j) & 127) | 128);
                    this.f11563g++;
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Y */
        public final int mo17003Y() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStream$c */
    public static class C3399c extends CodedOutputStream {

        /* JADX INFO: renamed from: d */
        public final byte[] f11564d;

        /* JADX INFO: renamed from: e */
        public final int f11565e;

        /* JADX INFO: renamed from: f */
        public final int f11566f;

        /* JADX INFO: renamed from: g */
        public int f11567g;

        public C3399c(byte[] bArr, int i, int i2) {
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
            this.f11564d = bArr;
            this.f11565e = i;
            this.f11567g = i;
            this.f11566f = i3;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D0 */
        public final void mo16994D0(int i, String str) throws IOException {
            mo16996F0(i, 2);
            mo16995E0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E0 */
        public final void mo16995E0(String str) throws IOException {
            int i = this.f11567g;
            try {
                int iM16960O = CodedOutputStream.m16960O(str.length() * 3);
                int iM16960O2 = CodedOutputStream.m16960O(str.length());
                if (iM16960O2 != iM16960O) {
                    mo16998H0(Utf8.m17098h(str));
                    this.f11567g = Utf8.m17097g(str, this.f11564d, this.f11567g, mo17003Y());
                    return;
                }
                int i2 = i + iM16960O2;
                this.f11567g = i2;
                int iM17097g = Utf8.m17097g(str, this.f11564d, i2, mo17003Y());
                this.f11567g = i;
                mo16998H0((iM17097g - i) - iM16960O2);
                this.f11567g = iM17097g;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f11567g = i;
                m17002U(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F0 */
        public final void mo16996F0(int i, int i2) throws IOException {
            mo16998H0(WireFormat.m17129c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G0 */
        public final void mo16997G0(int i, int i2) throws IOException {
            mo16996F0(i, 0);
            mo16998H0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H0 */
        public final void mo16998H0(int i) throws IOException {
            if (!CodedOutputStream.f11558b || mo17003Y() < 10) {
                while (true) {
                    int i2 = i & (-128);
                    byte[] bArr = this.f11564d;
                    if (i2 == 0) {
                        int i3 = this.f11567g;
                        this.f11567g = i3 + 1;
                        bArr[i3] = (byte) i;
                        return;
                    } else {
                        try {
                            int i4 = this.f11567g;
                            this.f11567g = i4 + 1;
                            bArr[i4] = (byte) ((i & 127) | 128);
                            i >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
                }
            }
            long j = CodedOutputStream.f11559c + ((long) this.f11567g);
            while (true) {
                int i5 = i & (-128);
                byte[] bArr2 = this.f11564d;
                if (i5 == 0) {
                    kyj0.m151992m(bArr2, j, (byte) i);
                    this.f11567g++;
                    return;
                } else {
                    kyj0.m151992m(bArr2, j, (byte) ((i & 127) | 128));
                    this.f11567g++;
                    i >>>= 7;
                    j = 1 + j;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I0 */
        public final void mo16999I0(int i, long j) throws IOException {
            mo16996F0(i, 0);
            mo17000J0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J0 */
        public final void mo17000J0(long j) throws IOException {
            if (!CodedOutputStream.f11558b || mo17003Y() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    byte[] bArr = this.f11564d;
                    if (j2 == 0) {
                        int i = this.f11567g;
                        this.f11567g = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            int i2 = this.f11567g;
                            this.f11567g = i2 + 1;
                            bArr[i2] = (byte) ((((int) j) & 127) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
                }
            }
            long j3 = CodedOutputStream.f11559c + ((long) this.f11567g);
            while (true) {
                long j4 = j & (-128);
                byte[] bArr2 = this.f11564d;
                if (j4 == 0) {
                    kyj0.m151992m(bArr2, j3, (byte) j);
                    this.f11567g++;
                    return;
                } else {
                    kyj0.m151992m(bArr2, j3, (byte) ((((int) j) & 127) | 128));
                    this.f11567g++;
                    j >>>= 7;
                    j3 = 1 + j3;
                }
            }
        }

        /* JADX INFO: renamed from: K0 */
        public final void m17040K0(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f11564d, this.f11567g, iRemaining);
                this.f11567g += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), Integer.valueOf(iRemaining)), e);
            }
        }

        /* JADX INFO: renamed from: L0 */
        public final void m17041L0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f11564d, this.f11567g, i2);
                this.f11567g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: T */
        public void mo17001T() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Y */
        public final int mo17003Y() {
            return this.f11566f - this.f11567g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Z */
        public final void mo17004Z(byte b) throws IOException {
            try {
                byte[] bArr = this.f11564d;
                int i = this.f11567g;
                this.f11567g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
            }
        }

        @Override // p153l.ir3
        /* JADX INFO: renamed from: a */
        public final void mo17042a(ByteBuffer byteBuffer) throws IOException {
            m17040K0(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: a0 */
        public final void mo17005a0(int i, boolean z) throws IOException {
            mo16996F0(i, 0);
            mo17004Z(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream, p153l.ir3
        /* JADX INFO: renamed from: b */
        public final void mo17006b(byte[] bArr, int i, int i2) throws IOException {
            m17041L0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: d0 */
        public final void mo17009d0(byte[] bArr, int i, int i2) throws IOException {
            mo16998H0(i2);
            m17041L0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: e0 */
        public final void mo17011e0(int i, ByteString byteString) throws IOException {
            mo16996F0(i, 2);
            mo17012f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: f0 */
        public final void mo17012f0(ByteString byteString) throws IOException {
            mo16998H0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: k0 */
        public final void mo17017k0(int i, int i2) throws IOException {
            mo16996F0(i, 5);
            mo17018l0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: l0 */
        public final void mo17018l0(int i) throws IOException {
            try {
                byte[] bArr = this.f11564d;
                int i2 = this.f11567g;
                int i3 = i2 + 1;
                this.f11567g = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f11567g = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f11567g = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f11567g = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: m0 */
        public final void mo17019m0(int i, long j) throws IOException {
            mo16996F0(i, 1);
            mo17020n0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: n0 */
        public final void mo17020n0(long j) throws IOException {
            try {
                byte[] bArr = this.f11564d;
                int i = this.f11567g;
                int i2 = i + 1;
                this.f11567g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f11567g = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f11567g = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f11567g = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f11567g = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f11567g = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f11567g = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f11567g = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11567g), Integer.valueOf(this.f11566f), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: s0 */
        public final void mo17025s0(int i, int i2) throws IOException {
            mo16996F0(i, 0);
            mo17026t0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: t0 */
        public final void mo17026t0(int i) throws IOException {
            if (i >= 0) {
                mo16998H0(i);
            } else {
                mo17000J0(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: w0 */
        public final void mo17029w0(int i, InterfaceC3442q interfaceC3442q) throws IOException {
            mo16996F0(i, 2);
            mo17030x0(interfaceC3442q);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x0 */
        public final void mo17030x0(InterfaceC3442q interfaceC3442q) throws IOException {
            mo16998H0(interfaceC3442q.getSerializedSize());
            interfaceC3442q.writeTo(this);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStream$d */
    public static final class C3400d extends AbstractC3398b {

        /* JADX INFO: renamed from: h */
        public final OutputStream f11568h;

        public C3400d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f11568h = outputStream;
            } else {
                mnd0.m159157a("out");
                throw null;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: D0 */
        public void mo16994D0(int i, String str) throws IOException {
            mo16996F0(i, 2);
            mo16995E0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: E0 */
        public void mo16995E0(String str) throws IOException {
            int iM17098h;
            try {
                int length = str.length() * 3;
                int iM16960O = CodedOutputStream.m16960O(length);
                int i = iM16960O + length;
                int i2 = this.f11561e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iM17097g = Utf8.m17097g(str, bArr, 0, length);
                    mo16998H0(iM17097g);
                    mo17006b(bArr, 0, iM17097g);
                    return;
                }
                if (i > i2 - this.f11562f) {
                    m17043R0();
                }
                int iM16960O2 = CodedOutputStream.m16960O(str.length());
                int i3 = this.f11562f;
                try {
                    if (iM16960O2 == iM16960O) {
                        int i4 = i3 + iM16960O2;
                        this.f11562f = i4;
                        int iM17097g2 = Utf8.m17097g(str, this.f11560d, i4, this.f11561e - i4);
                        this.f11562f = i3;
                        iM17098h = (iM17097g2 - i3) - iM16960O2;
                        m17038P0(iM17098h);
                        this.f11562f = iM17097g2;
                    } else {
                        iM17098h = Utf8.m17098h(str);
                        m17038P0(iM17098h);
                        this.f11562f = Utf8.m17097g(str, this.f11560d, this.f11562f, iM17098h);
                    }
                    this.f11563g += iM17098h;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f11563g -= this.f11562f - i3;
                    this.f11562f = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                m17002U(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: F0 */
        public void mo16996F0(int i, int i2) throws IOException {
            mo16998H0(WireFormat.m17129c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: G0 */
        public void mo16997G0(int i, int i2) throws IOException {
            m17044S0(20);
            m17037O0(i, 0);
            m17038P0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: H0 */
        public void mo16998H0(int i) throws IOException {
            m17044S0(10);
            m17038P0(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: I0 */
        public void mo16999I0(int i, long j) throws IOException {
            m17044S0(20);
            m17037O0(i, 0);
            m17039Q0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: J0 */
        public void mo17000J0(long j) throws IOException {
            m17044S0(10);
            m17039Q0(j);
        }

        /* JADX INFO: renamed from: R0 */
        public final void m17043R0() throws IOException {
            this.f11568h.write(this.f11560d, 0, this.f11562f);
            this.f11562f = 0;
        }

        /* JADX INFO: renamed from: S0 */
        public final void m17044S0(int i) throws IOException {
            if (this.f11561e - this.f11562f < i) {
                m17043R0();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: T */
        public void mo17001T() throws IOException {
            if (this.f11562f > 0) {
                m17043R0();
            }
        }

        /* JADX INFO: renamed from: T0 */
        public void m17045T0(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f11561e;
            int i2 = this.f11562f;
            int i3 = i - i2;
            byte[] bArr = this.f11560d;
            if (i3 >= iRemaining) {
                byteBuffer.get(bArr, i2, iRemaining);
                this.f11562f += iRemaining;
                this.f11563g += iRemaining;
                return;
            }
            int i4 = i - i2;
            byteBuffer.get(bArr, i2, i4);
            int i5 = iRemaining - i4;
            this.f11562f = this.f11561e;
            this.f11563g += i4;
            m17043R0();
            while (true) {
                int i6 = this.f11561e;
                byte[] bArr2 = this.f11560d;
                if (i5 <= i6) {
                    byteBuffer.get(bArr2, 0, i5);
                    this.f11562f = i5;
                    this.f11563g += i5;
                    return;
                } else {
                    byteBuffer.get(bArr2, 0, i6);
                    this.f11568h.write(this.f11560d, 0, this.f11561e);
                    int i7 = this.f11561e;
                    i5 -= i7;
                    this.f11563g += i7;
                }
            }
        }

        /* JADX INFO: renamed from: U0 */
        public void m17046U0(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f11561e;
            int i4 = this.f11562f;
            int i5 = i3 - i4;
            byte[] bArr2 = this.f11560d;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f11562f += i2;
                this.f11563g += i2;
                return;
            }
            int i6 = i3 - i4;
            System.arraycopy(bArr, i, bArr2, i4, i6);
            int i7 = i + i6;
            int i8 = i2 - i6;
            this.f11562f = this.f11561e;
            this.f11563g += i6;
            m17043R0();
            if (i8 <= this.f11561e) {
                System.arraycopy(bArr, i7, this.f11560d, 0, i8);
                this.f11562f = i8;
            } else {
                this.f11568h.write(bArr, i7, i8);
            }
            this.f11563g += i8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: Z */
        public void mo17004Z(byte b) throws IOException {
            if (this.f11562f == this.f11561e) {
                m17043R0();
            }
            m17033K0(b);
        }

        @Override // p153l.ir3
        /* JADX INFO: renamed from: a */
        public void mo17042a(ByteBuffer byteBuffer) throws IOException {
            m17045T0(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: a0 */
        public void mo17005a0(int i, boolean z) throws IOException {
            m17044S0(11);
            m17037O0(i, 0);
            m17033K0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream, p153l.ir3
        /* JADX INFO: renamed from: b */
        public void mo17006b(byte[] bArr, int i, int i2) throws IOException {
            m17046U0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: d0 */
        public void mo17009d0(byte[] bArr, int i, int i2) throws IOException {
            mo16998H0(i2);
            m17046U0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: e0 */
        public void mo17011e0(int i, ByteString byteString) throws IOException {
            mo16996F0(i, 2);
            mo17012f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: f0 */
        public void mo17012f0(ByteString byteString) throws IOException {
            mo16998H0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: k0 */
        public void mo17017k0(int i, int i2) throws IOException {
            m17044S0(14);
            m17037O0(i, 5);
            m17034L0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: l0 */
        public void mo17018l0(int i) throws IOException {
            m17044S0(4);
            m17034L0(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: m0 */
        public void mo17019m0(int i, long j) throws IOException {
            m17044S0(18);
            m17037O0(i, 1);
            m17035M0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: n0 */
        public void mo17020n0(long j) throws IOException {
            m17044S0(8);
            m17035M0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: s0 */
        public void mo17025s0(int i, int i2) throws IOException {
            m17044S0(20);
            m17037O0(i, 0);
            m17036N0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: t0 */
        public void mo17026t0(int i) throws IOException {
            if (i >= 0) {
                mo16998H0(i);
            } else {
                mo17000J0(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: w0 */
        public void mo17029w0(int i, InterfaceC3442q interfaceC3442q) throws IOException {
            mo16996F0(i, 2);
            mo17030x0(interfaceC3442q);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* JADX INFO: renamed from: x0 */
        public void mo17030x0(InterfaceC3442q interfaceC3442q) throws IOException {
            mo16998H0(interfaceC3442q.getSerializedSize());
            interfaceC3442q.writeTo(this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m16946A(int i) {
        return m16960O(i) + i;
    }

    /* JADX INFO: renamed from: B */
    public static int m16947B(int i, InterfaceC3442q interfaceC3442q) {
        return (m16958M(1) * 2) + m16959N(2, i) + m16948C(3, interfaceC3442q);
    }

    /* JADX INFO: renamed from: C */
    public static int m16948C(int i, InterfaceC3442q interfaceC3442q) {
        return m16958M(i) + m16949D(interfaceC3442q);
    }

    /* JADX INFO: renamed from: D */
    public static int m16949D(InterfaceC3442q interfaceC3442q) {
        return m16946A(interfaceC3442q.getSerializedSize());
    }

    /* JADX INFO: renamed from: E */
    public static int m16950E(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    @Deprecated
    /* JADX INFO: renamed from: F */
    public static int m16951F(int i) {
        return m16960O(i);
    }

    /* JADX INFO: renamed from: G */
    public static int m16952G(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: H */
    public static int m16953H(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: I */
    public static int m16954I(int i) {
        return m16960O(m16963R(i));
    }

    /* JADX INFO: renamed from: J */
    public static int m16955J(long j) {
        return m16962Q(m16964S(j));
    }

    /* JADX INFO: renamed from: K */
    public static int m16956K(int i, String str) {
        return m16958M(i) + m16957L(str);
    }

    /* JADX INFO: renamed from: L */
    public static int m16957L(String str) {
        int length;
        try {
            length = Utf8.m17098h(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(C3437l.f11643a).length;
        }
        return m16946A(length);
    }

    /* JADX INFO: renamed from: M */
    public static int m16958M(int i) {
        return m16960O(WireFormat.m17129c(i, 0));
    }

    /* JADX INFO: renamed from: N */
    public static int m16959N(int i, int i2) {
        return m16958M(i) + m16960O(i2);
    }

    /* JADX INFO: renamed from: O */
    public static int m16960O(int i) {
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
    public static int m16961P(int i, long j) {
        return m16958M(i) + m16962Q(j);
    }

    /* JADX INFO: renamed from: Q */
    public static int m16962Q(long j) {
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
    public static int m16963R(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: S */
    public static long m16964S(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: V */
    public static CodedOutputStream m16965V(OutputStream outputStream, int i) {
        return new C3400d(outputStream, i);
    }

    /* JADX INFO: renamed from: W */
    public static CodedOutputStream m16966W(byte[] bArr) {
        return m16967X(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: X */
    public static CodedOutputStream m16967X(byte[] bArr, int i, int i2) {
        return new C3399c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: f */
    public static int m16970f(int i, boolean z) {
        return m16958M(i) + m16971g(z);
    }

    /* JADX INFO: renamed from: g */
    public static int m16971g(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public static int m16972h(byte[] bArr) {
        return m16946A(bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static int m16973i(int i, ByteString byteString) {
        return m16958M(i) + m16974j(byteString);
    }

    /* JADX INFO: renamed from: j */
    public static int m16974j(ByteString byteString) {
        return m16946A(byteString.size());
    }

    /* JADX INFO: renamed from: k */
    public static int m16975k(int i, double d) {
        return m16958M(i) + m16976l(d);
    }

    /* JADX INFO: renamed from: l */
    public static int m16976l(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m16977m(int i, int i2) {
        return m16958M(i) + m16978n(i2);
    }

    /* JADX INFO: renamed from: n */
    public static int m16978n(int i) {
        return m16985u(i);
    }

    /* JADX INFO: renamed from: o */
    public static int m16979o(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: p */
    public static int m16980p(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: q */
    public static int m16981q(int i, float f) {
        return m16958M(i) + m16982r(f);
    }

    /* JADX INFO: renamed from: r */
    public static int m16982r(float f) {
        return 4;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static int m16983s(InterfaceC3442q interfaceC3442q) {
        return interfaceC3442q.getSerializedSize();
    }

    /* JADX INFO: renamed from: t */
    public static int m16984t(int i, int i2) {
        return m16958M(i) + m16985u(i2);
    }

    /* JADX INFO: renamed from: u */
    public static int m16985u(int i) {
        if (i >= 0) {
            return m16960O(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: v */
    public static int m16986v(int i, long j) {
        return m16958M(i) + m16987w(j);
    }

    /* JADX INFO: renamed from: w */
    public static int m16987w(long j) {
        return m16962Q(j);
    }

    /* JADX INFO: renamed from: x */
    public static int m16988x(int i, C3439n c3439n) {
        return (m16958M(1) * 2) + m16959N(2, i) + m16989y(3, c3439n);
    }

    /* JADX INFO: renamed from: y */
    public static int m16989y(int i, C3439n c3439n) {
        return m16958M(i) + m16990z(c3439n);
    }

    /* JADX INFO: renamed from: z */
    public static int m16990z(C3439n c3439n) {
        return m16946A(c3439n.m17271b());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m16991A0(long j) throws IOException {
        mo17020n0(j);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m16992B0(int i) throws IOException {
        mo16998H0(m16963R(i));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m16993C0(long j) throws IOException {
        mo17000J0(m16964S(j));
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo16994D0(int i, String str) throws IOException;

    /* JADX INFO: renamed from: E0 */
    public abstract void mo16995E0(String str) throws IOException;

    /* JADX INFO: renamed from: F0 */
    public abstract void mo16996F0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: G0 */
    public abstract void mo16997G0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: H0 */
    public abstract void mo16998H0(int i) throws IOException;

    /* JADX INFO: renamed from: I0 */
    public abstract void mo16999I0(int i, long j) throws IOException;

    /* JADX INFO: renamed from: J0 */
    public abstract void mo17000J0(long j) throws IOException;

    /* JADX INFO: renamed from: T */
    public abstract void mo17001T() throws IOException;

    /* JADX INFO: renamed from: U */
    public final void m17002U(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f11557a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(C3437l.f11643a);
        try {
            mo16998H0(bytes.length);
            mo17006b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public abstract int mo17003Y();

    /* JADX INFO: renamed from: Z */
    public abstract void mo17004Z(byte b) throws IOException;

    /* JADX INFO: renamed from: a0 */
    public abstract void mo17005a0(int i, boolean z) throws IOException;

    @Override // p153l.ir3
    /* JADX INFO: renamed from: b */
    public abstract void mo17006b(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: b0 */
    public final void m17007b0(boolean z) throws IOException {
        mo17004Z(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17008c0(byte[] bArr) throws IOException {
        mo17009d0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo17009d0(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: e */
    public final void m17010e() {
        if (mo17003Y() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo17011e0(int i, ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: f0 */
    public abstract void mo17012f0(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: g0 */
    public final void m17013g0(int i, double d) throws IOException {
        mo17019m0(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m17014h0(double d) throws IOException {
        mo17020n0(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m17015i0(int i, int i2) throws IOException {
        mo17025s0(i, i2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m17016j0(int i) throws IOException {
        mo17026t0(i);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo17017k0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: l0 */
    public abstract void mo17018l0(int i) throws IOException;

    /* JADX INFO: renamed from: m0 */
    public abstract void mo17019m0(int i, long j) throws IOException;

    /* JADX INFO: renamed from: n0 */
    public abstract void mo17020n0(long j) throws IOException;

    /* JADX INFO: renamed from: o0 */
    public final void m17021o0(int i, float f) throws IOException {
        mo17017k0(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m17022p0(float f) throws IOException {
        mo17018l0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* JADX INFO: renamed from: q0 */
    public final void m17023q0(int i, InterfaceC3442q interfaceC3442q) throws IOException {
        mo16996F0(i, 3);
        m17024r0(interfaceC3442q);
        mo16996F0(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: r0 */
    public final void m17024r0(InterfaceC3442q interfaceC3442q) throws IOException {
        interfaceC3442q.writeTo(this);
    }

    /* JADX INFO: renamed from: s0 */
    public abstract void mo17025s0(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: t0 */
    public abstract void mo17026t0(int i) throws IOException;

    /* JADX INFO: renamed from: u0 */
    public final void m17027u0(int i, long j) throws IOException {
        mo16999I0(i, j);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m17028v0(long j) throws IOException {
        mo17000J0(j);
    }

    /* JADX INFO: renamed from: w0 */
    public abstract void mo17029w0(int i, InterfaceC3442q interfaceC3442q) throws IOException;

    /* JADX INFO: renamed from: x0 */
    public abstract void mo17030x0(InterfaceC3442q interfaceC3442q) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: y0 */
    public final void m17031y0(int i) throws IOException {
        mo16998H0(i);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m17032z0(int i) throws IOException {
        mo17018l0(i);
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
