package com.tencent.youtu.sdkkitframework.common;

import android.annotation.SuppressLint;
import com.clevertap.android.sdk.Constants;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import p149l.hj10;
import p149l.hjl;
import p149l.ig3;
import p149l.kg3;
import p149l.rhg0;
import p149l.zkl;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    public static Decoder getDecoder() {
        return Decoder.f60526e;
    }

    public static Encoder getEncoder() {
        return Encoder.f60544h;
    }

    public static Decoder getMimeDecoder() {
        return Decoder.f60528g;
    }

    public static Encoder getMimeEncoder(int i, byte[] bArr) {
        Objects.requireNonNull(bArr);
        int[] iArr = Decoder.f60524c;
        for (byte b : bArr) {
            if (iArr[b & 255] != -1) {
                kg3.m145878a("Illegal base64 line separator character 0x", Integer.toString(b, 16));
                return null;
            }
        }
        return i <= 0 ? Encoder.f60544h : new Encoder(false, bArr, (i >> 2) << 2, true);
    }

    public static Decoder getUrlDecoder() {
        return Decoder.f60527f;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.f60545i;
    }

    public static Encoder getMimeEncoder() {
        return Encoder.f60546j;
    }

    public static class Decoder {

        /* JADX INFO: renamed from: c */
        public static final int[] f60524c;

        /* JADX INFO: renamed from: d */
        public static final int[] f60525d;

        /* JADX INFO: renamed from: e */
        public static final Decoder f60526e;

        /* JADX INFO: renamed from: f */
        public static final Decoder f60527f;

        /* JADX INFO: renamed from: g */
        public static final Decoder f60528g;

        /* JADX INFO: renamed from: a */
        public final boolean f60529a;

        /* JADX INFO: renamed from: b */
        public final boolean f60530b;

        static {
            int[] iArr = new int[256];
            f60524c = iArr;
            Arrays.fill(iArr, -1);
            int i = 0;
            while (true) {
                char[] cArr = Encoder.f60541e;
                if (i >= cArr.length) {
                    break;
                }
                f60524c[cArr[i]] = i;
                i++;
            }
            f60524c[61] = -2;
            int[] iArr2 = new int[256];
            f60525d = iArr2;
            Arrays.fill(iArr2, -1);
            int i2 = 0;
            while (true) {
                char[] cArr2 = Encoder.f60542f;
                if (i2 >= cArr2.length) {
                    f60525d[61] = -2;
                    f60526e = new Decoder(false, false);
                    f60527f = new Decoder(true, false);
                    f60528g = new Decoder(false, true);
                    return;
                }
                f60525d[cArr2[i2]] = i2;
                i2++;
            }
        }

        public Decoder(boolean z, boolean z2) {
            this.f60529a = z;
            this.f60530b = z2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        
            if (r4 != 18) goto L31;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m84630a(byte[] r12, int r13, int r14, byte[] r15) {
            /*
                r11 = this;
                boolean r0 = r11.f60529a
                if (r0 == 0) goto L7
                int[] r0 = com.tencent.youtu.sdkkitframework.common.Base64.Decoder.f60525d
                goto L9
            L7:
                int[] r0 = com.tencent.youtu.sdkkitframework.common.Base64.Decoder.f60524c
            L9:
                r1 = 18
                r2 = 0
                r4 = r1
                r3 = r2
                r5 = r3
            Lf:
                r6 = 6
                r7 = 16
                if (r13 >= r14) goto L67
                int r8 = r13 + 1
                r9 = r12[r13]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r9 = r0[r9]
                if (r9 >= 0) goto L4a
                r10 = -2
                if (r9 != r10) goto L38
                if (r4 != r6) goto L2e
                if (r8 == r14) goto L32
                int r13 = r13 + 2
                r8 = r12[r8]
                r9 = 61
                if (r8 != r9) goto L32
                goto L2f
            L2e:
                r13 = r8
            L2f:
                if (r4 == r1) goto L32
                goto L67
            L32:
                java.lang.String r11 = "Input byte array has wrong 4-byte ending unit"
                p149l.ig3.m135964a(r11)
                return r2
            L38:
                boolean r6 = r11.f60530b
                if (r6 == 0) goto L3e
            L3c:
                r13 = r8
                goto Lf
            L3e:
                r11 = r12[r13]
                java.lang.String r11 = java.lang.Integer.toString(r11, r7)
                java.lang.String r12 = "Illegal base64 character "
                p149l.kg3.m145878a(r12, r11)
                return r2
            L4a:
                int r13 = r9 << r4
                r3 = r3 | r13
                int r4 = r4 + (-6)
                if (r4 >= 0) goto L3c
                int r13 = r5 + 1
                int r4 = r3 >> 16
                byte r4 = (byte) r4
                r15[r5] = r4
                int r4 = r5 + 2
                int r6 = r3 >> 8
                byte r6 = (byte) r6
                r15[r13] = r6
                int r5 = r5 + 3
                byte r13 = (byte) r3
                r15[r4] = r13
                r4 = r1
                r3 = r2
                goto L3c
            L67:
                if (r4 != r6) goto L71
                int r1 = r5 + 1
                int r3 = r3 >> r7
                byte r3 = (byte) r3
                r15[r5] = r3
                r5 = r1
                goto L86
            L71:
                if (r4 != 0) goto L82
                int r1 = r5 + 1
                int r4 = r3 >> 16
                byte r4 = (byte) r4
                r15[r5] = r4
                int r5 = r5 + 2
                int r3 = r3 >> 8
                byte r3 = (byte) r3
                r15[r1] = r3
                goto L86
            L82:
                r15 = 12
                if (r4 == r15) goto L9e
            L86:
                if (r13 >= r14) goto L9d
                boolean r15 = r11.f60530b
                if (r15 == 0) goto L97
                int r15 = r13 + 1
                r13 = r12[r13]
                r13 = r0[r13]
                if (r13 >= 0) goto L96
                r13 = r15
                goto L86
            L96:
                r13 = r15
            L97:
                java.lang.String r11 = "Input byte array has incorrect ending byte at "
                p149l.k250.m144273a(r11, r13)
                return r2
            L9d:
                return r5
            L9e:
                java.lang.String r11 = "Last unit does not have enough valid bits"
                p149l.ig3.m135964a(r11)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.Base64.Decoder.m84630a(byte[], int, int, byte[]):int");
        }

        public ByteBuffer decode(ByteBuffer byteBuffer) {
            int iRemaining;
            byte[] bArrArray;
            int iArrayOffset;
            int iPosition = byteBuffer.position();
            try {
                if (byteBuffer.hasArray()) {
                    bArrArray = byteBuffer.array();
                    iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    iRemaining = byteBuffer.arrayOffset() + byteBuffer.limit();
                    byteBuffer.position(byteBuffer.limit());
                } else {
                    iRemaining = byteBuffer.remaining();
                    bArrArray = new byte[iRemaining];
                    byteBuffer.get(bArrArray);
                    iArrayOffset = 0;
                }
                byte[] bArr = new byte[m84629a(bArrArray, iArrayOffset, iRemaining)];
                return ByteBuffer.wrap(bArr, 0, m84630a(bArrArray, iArrayOffset, iRemaining, bArr));
            } catch (IllegalArgumentException e) {
                byteBuffer.position(iPosition);
                throw e;
            }
        }

        public InputStream wrap(InputStream inputStream) {
            Objects.requireNonNull(inputStream);
            return new DecInputStream(inputStream, this.f60529a ? f60525d : f60524c, this.f60530b);
        }

        @SuppressLint({"NewApi"})
        public byte[] decode(String str) {
            return decode(str.getBytes(StandardCharsets.ISO_8859_1));
        }

        public int decode(byte[] bArr, byte[] bArr2) {
            if (bArr2.length >= m84629a(bArr, 0, bArr.length)) {
                return m84630a(bArr, 0, bArr.length, bArr2);
            }
            ig3.m135964a("Output byte array is too small for decoding all input bytes");
            return 0;
        }

        public byte[] decode(byte[] bArr) {
            int iM84629a = m84629a(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[iM84629a];
            int iM84630a = m84630a(bArr, 0, bArr.length, bArr2);
            return iM84630a != iM84629a ? Arrays.copyOf(bArr2, iM84630a) : bArr2;
        }

        /* JADX INFO: renamed from: a */
        public final int m84629a(byte[] bArr, int i, int i2) {
            int i3;
            int[] iArr = this.f60529a ? f60525d : f60524c;
            int i4 = i2 - i;
            int i5 = 0;
            if (i4 == 0) {
                return 0;
            }
            boolean z = this.f60530b;
            if (i4 < 2) {
                if (z && iArr[0] == -1) {
                    return 0;
                }
                ig3.m135964a("Input byte[] should at least have 2 bytes for base64 bytes");
                return 0;
            }
            if (z) {
                int i6 = 0;
                while (i < i2) {
                    int i7 = i + 1;
                    int i8 = bArr[i] & 255;
                    if (i8 == 61) {
                        i4 -= (i2 - i7) + 1;
                        break;
                    }
                    if (iArr[i8] == -1) {
                        i6++;
                    }
                    i = i7;
                }
                i4 -= i6;
            } else if (bArr[i2 - 1] == 61) {
                i5 = bArr[i2 - 2] == 61 ? 2 : 1;
            }
            if (i5 == 0 && (i3 = i4 & 3) != 0) {
                i5 = 4 - i3;
            }
            return (((i4 + 3) / 4) * 3) - i5;
        }
    }

    public static class Encoder {

        /* JADX INFO: renamed from: e */
        public static final char[] f60541e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* JADX INFO: renamed from: f */
        public static final char[] f60542f = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

        /* JADX INFO: renamed from: g */
        public static final byte[] f60543g;

        /* JADX INFO: renamed from: h */
        public static final Encoder f60544h;

        /* JADX INFO: renamed from: i */
        public static final Encoder f60545i;

        /* JADX INFO: renamed from: j */
        public static final Encoder f60546j;

        /* JADX INFO: renamed from: a */
        public final byte[] f60547a;

        /* JADX INFO: renamed from: b */
        public final int f60548b;

        /* JADX INFO: renamed from: c */
        public final boolean f60549c;

        /* JADX INFO: renamed from: d */
        public final boolean f60550d;

        static {
            byte[] bArr = {HttpTokens.CARRIAGE_RETURN, 10};
            f60543g = bArr;
            f60544h = new Encoder(false, null, -1, true);
            f60545i = new Encoder(true, null, -1, true);
            f60546j = new Encoder(false, bArr, 76, true);
        }

        public Encoder(boolean z, byte[] bArr, int i, boolean z2) {
            this.f60549c = z;
            this.f60547a = bArr;
            this.f60548b = i;
            this.f60550d = z2;
        }

        /* JADX INFO: renamed from: a */
        public final int m84633a(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            char[] cArr = this.f60549c ? f60542f : f60541e;
            int i4 = ((i2 - i) / 3) * 3;
            int i5 = i + i4;
            int i6 = this.f60548b;
            if (i6 > 0 && i4 > (i3 = (i6 / 4) * 3)) {
                i4 = i3;
            }
            int i7 = i;
            int i8 = 0;
            while (i7 < i5) {
                int iMin = Math.min(i7 + i4, i5);
                int i9 = i7;
                int i10 = i8;
                while (i9 < iMin) {
                    int i11 = i9 + 2;
                    int i12 = ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9] & 255) << 16);
                    i9 += 3;
                    int i13 = i12 | (bArr[i11] & 255);
                    bArr2[i10] = (byte) cArr[(i13 >>> 18) & 63];
                    bArr2[i10 + 1] = (byte) cArr[(i13 >>> 12) & 63];
                    int i14 = i10 + 3;
                    bArr2[i10 + 2] = (byte) cArr[(i13 >>> 6) & 63];
                    i10 += 4;
                    bArr2[i14] = (byte) cArr[i13 & 63];
                }
                int i15 = ((iMin - i7) / 3) * 4;
                i8 += i15;
                if (i15 == this.f60548b && iMin < i2) {
                    byte[] bArr3 = this.f60547a;
                    int length = bArr3.length;
                    int i16 = 0;
                    while (i16 < length) {
                        bArr2[i8] = bArr3[i16];
                        i16++;
                        i8++;
                    }
                }
                i7 = iMin;
            }
            if (i7 >= i2) {
                return i8;
            }
            int i17 = i7 + 1;
            int i18 = bArr[i7] & 255;
            int i19 = i8 + 1;
            bArr2[i8] = (byte) cArr[i18 >> 2];
            if (i17 == i2) {
                int i20 = i8 + 2;
                bArr2[i19] = (byte) cArr[(i18 << 4) & 63];
                if (!this.f60550d) {
                    return i20;
                }
                int i21 = i8 + 3;
                bArr2[i20] = 61;
                int i22 = i8 + 4;
                bArr2[i21] = 61;
                return i22;
            }
            int i23 = bArr[i17] & 255;
            bArr2[i19] = (byte) cArr[((i18 << 4) & 63) | (i23 >> 4)];
            int i24 = i8 + 3;
            bArr2[i8 + 2] = (byte) cArr[(i23 << 2) & 63];
            if (!this.f60550d) {
                return i24;
            }
            int i25 = i8 + 4;
            bArr2[i24] = 61;
            return i25;
        }

        public ByteBuffer encode(ByteBuffer byteBuffer) {
            int iM84633a;
            int iM84632a = m84632a(byteBuffer.remaining());
            byte[] bArrCopyOf = new byte[iM84632a];
            if (byteBuffer.hasArray()) {
                iM84633a = m84633a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.arrayOffset() + byteBuffer.limit(), bArrCopyOf);
                byteBuffer.position(byteBuffer.limit());
            } else {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                iM84633a = m84633a(bArr, 0, iRemaining, bArrCopyOf);
            }
            if (iM84633a != iM84632a) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM84633a);
            }
            return ByteBuffer.wrap(bArrCopyOf);
        }

        public String encodeToString(byte[] bArr) {
            byte[] bArrEncode = encode(bArr);
            return new String(bArrEncode, 0, 0, bArrEncode.length);
        }

        public Encoder withoutPadding() {
            return !this.f60550d ? this : new Encoder(this.f60549c, this.f60547a, this.f60548b, false);
        }

        public OutputStream wrap(OutputStream outputStream) {
            Objects.requireNonNull(outputStream);
            return new EncOutputStream(outputStream, this.f60549c ? f60542f : f60541e, this.f60547a, this.f60548b, this.f60550d);
        }

        public int encode(byte[] bArr, byte[] bArr2) {
            if (bArr2.length >= m84632a(bArr.length)) {
                return m84633a(bArr, 0, bArr.length, bArr2);
            }
            ig3.m135964a("Output byte array is too small for encoding all input bytes");
            return 0;
        }

        public byte[] encode(byte[] bArr) {
            int iM84632a = m84632a(bArr.length);
            byte[] bArr2 = new byte[iM84632a];
            int iM84633a = m84633a(bArr, 0, bArr.length, bArr2);
            return iM84633a != iM84632a ? Arrays.copyOf(bArr2, iM84633a) : bArr2;
        }

        /* JADX INFO: renamed from: a */
        public final int m84632a(int i) {
            int i2;
            if (this.f60550d) {
                i2 = ((i + 2) / 3) * 4;
            } else {
                int i3 = i % 3;
                i2 = ((i / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
            }
            int i4 = this.f60548b;
            return i4 > 0 ? i2 + (((i2 - 1) / i4) * this.f60547a.length) : i2;
        }
    }

    public static class EncOutputStream extends FilterOutputStream {

        /* JADX INFO: renamed from: a */
        public int f60531a;

        /* JADX INFO: renamed from: b */
        public int f60532b;

        /* JADX INFO: renamed from: c */
        public int f60533c;

        /* JADX INFO: renamed from: d */
        public int f60534d;

        /* JADX INFO: renamed from: e */
        public boolean f60535e;

        /* JADX INFO: renamed from: f */
        public final char[] f60536f;

        /* JADX INFO: renamed from: g */
        public final byte[] f60537g;

        /* JADX INFO: renamed from: h */
        public final int f60538h;

        /* JADX INFO: renamed from: i */
        public final boolean f60539i;

        /* JADX INFO: renamed from: j */
        public int f60540j;

        public EncOutputStream(OutputStream outputStream, char[] cArr, byte[] bArr, int i, boolean z) {
            super(outputStream);
            this.f60531a = 0;
            this.f60535e = false;
            this.f60540j = 0;
            this.f60536f = cArr;
            this.f60537g = bArr;
            this.f60538h = i;
            this.f60539i = z;
        }

        /* JADX INFO: renamed from: a */
        public final void m84631a() throws IOException {
            if (this.f60540j == this.f60538h) {
                ((FilterOutputStream) this).out.write(this.f60537g);
                this.f60540j = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f60535e) {
                return;
            }
            this.f60535e = true;
            int i = this.f60531a;
            if (i == 1) {
                m84631a();
                ((FilterOutputStream) this).out.write(this.f60536f[this.f60532b >> 2]);
                ((FilterOutputStream) this).out.write(this.f60536f[(this.f60532b << 4) & 63]);
                if (this.f60539i) {
                    ((FilterOutputStream) this).out.write(61);
                    ((FilterOutputStream) this).out.write(61);
                }
            } else if (i == 2) {
                m84631a();
                ((FilterOutputStream) this).out.write(this.f60536f[this.f60532b >> 2]);
                ((FilterOutputStream) this).out.write(this.f60536f[((this.f60532b << 4) & 63) | (this.f60533c >> 4)]);
                ((FilterOutputStream) this).out.write(this.f60536f[(this.f60533c << 2) & 63]);
                if (this.f60539i) {
                    ((FilterOutputStream) this).out.write(61);
                }
            }
            this.f60531a = 0;
            ((FilterOutputStream) this).out.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f60535e) {
                rhg0.m179353a("Stream is closed");
                return;
            }
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            int i3 = this.f60531a;
            if (i3 != 0) {
                if (i3 == 1) {
                    int i4 = i + 1;
                    this.f60533c = bArr[i] & 255;
                    i2--;
                    if (i2 == 0) {
                        this.f60531a = i3 + 1;
                        return;
                    }
                    i = i4;
                }
                this.f60534d = bArr[i] & 255;
                i2--;
                m84631a();
                ((FilterOutputStream) this).out.write(this.f60536f[this.f60532b >> 2]);
                ((FilterOutputStream) this).out.write(this.f60536f[((this.f60532b << 4) & 63) | (this.f60533c >> 4)]);
                ((FilterOutputStream) this).out.write(this.f60536f[((this.f60533c << 2) & 63) | (this.f60534d >> 6)]);
                ((FilterOutputStream) this).out.write(this.f60536f[this.f60534d & 63]);
                this.f60540j += 4;
                i++;
            }
            int i5 = i2 / 3;
            this.f60531a = i2 - (i5 * 3);
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                m84631a();
                int i7 = i + 2;
                int i8 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                i += 3;
                int i9 = i8 | (bArr[i7] & 255);
                ((FilterOutputStream) this).out.write(this.f60536f[(i9 >>> 18) & 63]);
                ((FilterOutputStream) this).out.write(this.f60536f[(i9 >>> 12) & 63]);
                ((FilterOutputStream) this).out.write(this.f60536f[(i9 >>> 6) & 63]);
                ((FilterOutputStream) this).out.write(this.f60536f[i9 & 63]);
                this.f60540j += 4;
                i5 = i6;
            }
            int i10 = this.f60531a;
            if (i10 == 1) {
                this.f60532b = bArr[i] & 255;
            } else if (i10 == 2) {
                this.f60532b = bArr[i] & 255;
                this.f60533c = bArr[i + 1] & 255;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
        }
    }

    public static class DecInputStream extends InputStream {

        /* JADX INFO: renamed from: a */
        public final InputStream f60515a;

        /* JADX INFO: renamed from: b */
        public final boolean f60516b;

        /* JADX INFO: renamed from: c */
        public final int[] f60517c;

        /* JADX INFO: renamed from: d */
        public int f60518d = 0;

        /* JADX INFO: renamed from: e */
        public int f60519e = 18;

        /* JADX INFO: renamed from: f */
        public int f60520f = -8;

        /* JADX INFO: renamed from: g */
        public boolean f60521g = false;

        /* JADX INFO: renamed from: h */
        public boolean f60522h = false;

        /* JADX INFO: renamed from: i */
        public byte[] f60523i = new byte[1];

        public DecInputStream(InputStream inputStream, int[] iArr, boolean z) {
            this.f60515a = inputStream;
            this.f60517c = iArr;
            this.f60516b = z;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (!this.f60522h) {
                return this.f60515a.available();
            }
            rhg0.m179353a("Stream is closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f60522h) {
                return;
            }
            this.f60522h = true;
            this.f60515a.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            if (this.f60522h) {
                rhg0.m179353a("Stream is closed");
                return 0;
            }
            if (this.f60521g && this.f60520f < 0) {
                return -1;
            }
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                zkl.m219192a();
                return 0;
            }
            if (this.f60520f >= 0) {
                int i4 = i;
                while (i2 != 0) {
                    i3 = i4 + 1;
                    int i5 = this.f60518d;
                    int i6 = this.f60520f;
                    bArr[i4] = (byte) (i5 >> i6);
                    i2--;
                    int i7 = i6 - 8;
                    this.f60520f = i7;
                    if (i7 < 0) {
                        this.f60518d = 0;
                    } else {
                        i4 = i3;
                    }
                }
                return i4 - i;
            }
            i3 = i;
            while (i2 > 0) {
                int i8 = this.f60515a.read();
                if (i8 == -1) {
                    this.f60521g = true;
                    int i9 = this.f60519e;
                    if (i9 != 18) {
                        if (i9 == 12) {
                            rhg0.m179353a("Base64 stream has one un-decoded dangling byte.");
                            return 0;
                        }
                        int i10 = i3 + 1;
                        int i11 = this.f60518d;
                        bArr[i3] = (byte) (i11 >> 16);
                        int i12 = i2 - 1;
                        if (i9 != 0) {
                            i3 = i10;
                        } else if (i12 == 0) {
                            this.f60518d = i11 >> 8;
                            this.f60520f = 0;
                            i3 = i10;
                        } else {
                            i3 += 2;
                            bArr[i10] = (byte) (i11 >> 8);
                        }
                    }
                    if (i3 == i) {
                        return -1;
                    }
                    return i3 - i;
                }
                if (i8 == 61) {
                    int i13 = this.f60519e;
                    if (i13 != 18 && i13 != 12 && (i13 != 6 || this.f60515a.read() == 61)) {
                        int i14 = i3 + 1;
                        int i15 = this.f60518d;
                        bArr[i3] = (byte) (i15 >> 16);
                        int i16 = i2 - 1;
                        if (this.f60519e != 0) {
                            i3 = i14;
                        } else if (i16 == 0) {
                            this.f60518d = i15 >> 8;
                            this.f60520f = 0;
                            i3 = i14;
                        } else {
                            i3 += 2;
                            bArr[i14] = (byte) (i15 >> 8);
                        }
                        this.f60521g = true;
                        break;
                    }
                    hjl.m131386a("Illegal base64 ending sequence:", this.f60519e);
                    return 0;
                }
                int i17 = this.f60517c[i8];
                if (i17 != -1) {
                    int i18 = this.f60518d;
                    int i19 = this.f60519e;
                    this.f60518d = (i17 << i19) | i18;
                    if (i19 == 0) {
                        this.f60519e = 18;
                        this.f60520f = 16;
                        while (true) {
                            int i20 = this.f60520f;
                            if (i20 < 0) {
                                this.f60518d = 0;
                                break;
                            }
                            int i21 = i3 + 1;
                            bArr[i3] = (byte) (this.f60518d >> i20);
                            i2--;
                            int i22 = i20 - 8;
                            this.f60520f = i22;
                            if (i2 == 0 && i22 >= 0) {
                                return i21 - i;
                            }
                            i3 = i21;
                        }
                    } else {
                        this.f60519e = i19 - 6;
                    }
                } else if (!this.f60516b) {
                    hj10.m131352a("Illegal base64 character ", Integer.toString(i17, 16));
                    return 0;
                }
            }
            return i3 - i;
        }

        @Override // java.io.InputStream
        public int read() {
            if (read(this.f60523i, 0, 1) == -1) {
                return -1;
            }
            return this.f60523i[0] & 255;
        }
    }
}
