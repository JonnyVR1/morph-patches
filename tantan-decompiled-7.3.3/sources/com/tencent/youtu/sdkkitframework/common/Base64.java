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
import p153l.onl;
import p153l.rr10;
import p153l.wg3;
import p153l.yg3;
import p153l.yll;
import p153l.za50;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    public static Decoder getDecoder() {
        return Decoder.f61373e;
    }

    public static Encoder getEncoder() {
        return Encoder.f61391h;
    }

    public static Decoder getMimeDecoder() {
        return Decoder.f61375g;
    }

    public static Encoder getMimeEncoder(int i, byte[] bArr) {
        Objects.requireNonNull(bArr);
        int[] iArr = Decoder.f61371c;
        for (byte b : bArr) {
            if (iArr[b & 255] != -1) {
                yg3.m215829a("Illegal base64 line separator character 0x", Integer.toString(b, 16));
                return null;
            }
        }
        return i <= 0 ? Encoder.f61391h : new Encoder(false, bArr, (i >> 2) << 2, true);
    }

    public static Decoder getUrlDecoder() {
        return Decoder.f61374f;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.f61392i;
    }

    public static Encoder getMimeEncoder() {
        return Encoder.f61393j;
    }

    public static class Decoder {

        /* JADX INFO: renamed from: c */
        public static final int[] f61371c;

        /* JADX INFO: renamed from: d */
        public static final int[] f61372d;

        /* JADX INFO: renamed from: e */
        public static final Decoder f61373e;

        /* JADX INFO: renamed from: f */
        public static final Decoder f61374f;

        /* JADX INFO: renamed from: g */
        public static final Decoder f61375g;

        /* JADX INFO: renamed from: a */
        public final boolean f61376a;

        /* JADX INFO: renamed from: b */
        public final boolean f61377b;

        static {
            int[] iArr = new int[256];
            f61371c = iArr;
            Arrays.fill(iArr, -1);
            int i = 0;
            while (true) {
                char[] cArr = Encoder.f61388e;
                if (i >= cArr.length) {
                    break;
                }
                f61371c[cArr[i]] = i;
                i++;
            }
            f61371c[61] = -2;
            int[] iArr2 = new int[256];
            f61372d = iArr2;
            Arrays.fill(iArr2, -1);
            int i2 = 0;
            while (true) {
                char[] cArr2 = Encoder.f61389f;
                if (i2 >= cArr2.length) {
                    f61372d[61] = -2;
                    f61373e = new Decoder(false, false);
                    f61374f = new Decoder(true, false);
                    f61375g = new Decoder(false, true);
                    return;
                }
                f61372d[cArr2[i2]] = i2;
                i2++;
            }
        }

        public Decoder(boolean z, boolean z2) {
            this.f61376a = z;
            this.f61377b = z2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        
            if (r4 != 18) goto L31;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m85801a(byte[] bArr, int i, int i2, byte[] bArr2) {
            int[] iArr = this.f61376a ? f61372d : f61371c;
            int i3 = 18;
            int i4 = 0;
            int i5 = 0;
            while (i < i2) {
                int i6 = i + 1;
                int i7 = iArr[bArr[i] & 255];
                if (i7 >= 0) {
                    i4 |= i7 << i3;
                    i3 -= 6;
                    if (i3 < 0) {
                        bArr2[i5] = (byte) (i4 >> 16);
                        int i8 = i5 + 2;
                        bArr2[i5 + 1] = (byte) (i4 >> 8);
                        i5 += 3;
                        bArr2[i8] = (byte) i4;
                        i3 = 18;
                        i4 = 0;
                    }
                } else if (i7 == -2) {
                    if (i3 == 6) {
                        if (i6 != i2) {
                            i += 2;
                            if (bArr[i6] == 61) {
                                break;
                            }
                        }
                        wg3.m206174a("Input byte array has wrong 4-byte ending unit");
                        return 0;
                    }
                    i = i6;
                } else if (!this.f61377b) {
                    yg3.m215829a("Illegal base64 character ", Integer.toString(bArr[i], 16));
                    return 0;
                }
                i = i6;
            }
            if (i3 == 6) {
                bArr2[i5] = (byte) (i4 >> 16);
                i5++;
            } else if (i3 == 0) {
                int i9 = i5 + 1;
                bArr2[i5] = (byte) (i4 >> 16);
                i5 += 2;
                bArr2[i9] = (byte) (i4 >> 8);
            } else if (i3 == 12) {
                wg3.m206174a("Last unit does not have enough valid bits");
                return 0;
            }
            while (i < i2) {
                if (this.f61377b) {
                    int i10 = i + 1;
                    if (iArr[bArr[i]] < 0) {
                        i = i10;
                    } else {
                        i = i10;
                    }
                }
                za50.m219101a("Input byte array has incorrect ending byte at ", i);
                return 0;
            }
            return i5;
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
                byte[] bArr = new byte[m85800a(bArrArray, iArrayOffset, iRemaining)];
                return ByteBuffer.wrap(bArr, 0, m85801a(bArrArray, iArrayOffset, iRemaining, bArr));
            } catch (IllegalArgumentException e) {
                byteBuffer.position(iPosition);
                throw e;
            }
        }

        public InputStream wrap(InputStream inputStream) {
            Objects.requireNonNull(inputStream);
            return new DecInputStream(inputStream, this.f61376a ? f61372d : f61371c, this.f61377b);
        }

        @SuppressLint({"NewApi"})
        public byte[] decode(String str) {
            return decode(str.getBytes(StandardCharsets.ISO_8859_1));
        }

        public int decode(byte[] bArr, byte[] bArr2) {
            if (bArr2.length >= m85800a(bArr, 0, bArr.length)) {
                return m85801a(bArr, 0, bArr.length, bArr2);
            }
            wg3.m206174a("Output byte array is too small for decoding all input bytes");
            return 0;
        }

        public byte[] decode(byte[] bArr) {
            int iM85800a = m85800a(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[iM85800a];
            int iM85801a = m85801a(bArr, 0, bArr.length, bArr2);
            return iM85801a != iM85800a ? Arrays.copyOf(bArr2, iM85801a) : bArr2;
        }

        /* JADX INFO: renamed from: a */
        public final int m85800a(byte[] bArr, int i, int i2) {
            int i3;
            int[] iArr = this.f61376a ? f61372d : f61371c;
            int i4 = i2 - i;
            int i5 = 0;
            if (i4 == 0) {
                return 0;
            }
            boolean z = this.f61377b;
            if (i4 < 2) {
                if (z && iArr[0] == -1) {
                    return 0;
                }
                wg3.m206174a("Input byte[] should at least have 2 bytes for base64 bytes");
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
        public static final char[] f61388e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* JADX INFO: renamed from: f */
        public static final char[] f61389f = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

        /* JADX INFO: renamed from: g */
        public static final byte[] f61390g;

        /* JADX INFO: renamed from: h */
        public static final Encoder f61391h;

        /* JADX INFO: renamed from: i */
        public static final Encoder f61392i;

        /* JADX INFO: renamed from: j */
        public static final Encoder f61393j;

        /* JADX INFO: renamed from: a */
        public final byte[] f61394a;

        /* JADX INFO: renamed from: b */
        public final int f61395b;

        /* JADX INFO: renamed from: c */
        public final boolean f61396c;

        /* JADX INFO: renamed from: d */
        public final boolean f61397d;

        static {
            byte[] bArr = {HttpTokens.CARRIAGE_RETURN, 10};
            f61390g = bArr;
            f61391h = new Encoder(false, null, -1, true);
            f61392i = new Encoder(true, null, -1, true);
            f61393j = new Encoder(false, bArr, 76, true);
        }

        public Encoder(boolean z, byte[] bArr, int i, boolean z2) {
            this.f61396c = z;
            this.f61394a = bArr;
            this.f61395b = i;
            this.f61397d = z2;
        }

        /* JADX INFO: renamed from: a */
        public final int m85804a(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            char[] cArr = this.f61396c ? f61389f : f61388e;
            int i4 = ((i2 - i) / 3) * 3;
            int i5 = i + i4;
            int i6 = this.f61395b;
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
                if (i15 == this.f61395b && iMin < i2) {
                    byte[] bArr3 = this.f61394a;
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
                if (!this.f61397d) {
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
            if (!this.f61397d) {
                return i24;
            }
            int i25 = i8 + 4;
            bArr2[i24] = 61;
            return i25;
        }

        public ByteBuffer encode(ByteBuffer byteBuffer) {
            int iM85804a;
            int iM85803a = m85803a(byteBuffer.remaining());
            byte[] bArrCopyOf = new byte[iM85803a];
            if (byteBuffer.hasArray()) {
                iM85804a = m85804a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.arrayOffset() + byteBuffer.limit(), bArrCopyOf);
                byteBuffer.position(byteBuffer.limit());
            } else {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                iM85804a = m85804a(bArr, 0, iRemaining, bArrCopyOf);
            }
            if (iM85804a != iM85803a) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM85804a);
            }
            return ByteBuffer.wrap(bArrCopyOf);
        }

        public String encodeToString(byte[] bArr) {
            byte[] bArrEncode = encode(bArr);
            return new String(bArrEncode, 0, 0, bArrEncode.length);
        }

        public Encoder withoutPadding() {
            return !this.f61397d ? this : new Encoder(this.f61396c, this.f61394a, this.f61395b, false);
        }

        public OutputStream wrap(OutputStream outputStream) {
            Objects.requireNonNull(outputStream);
            return new EncOutputStream(outputStream, this.f61396c ? f61389f : f61388e, this.f61394a, this.f61395b, this.f61397d);
        }

        public int encode(byte[] bArr, byte[] bArr2) {
            if (bArr2.length >= m85803a(bArr.length)) {
                return m85804a(bArr, 0, bArr.length, bArr2);
            }
            wg3.m206174a("Output byte array is too small for encoding all input bytes");
            return 0;
        }

        public byte[] encode(byte[] bArr) {
            int iM85803a = m85803a(bArr.length);
            byte[] bArr2 = new byte[iM85803a];
            int iM85804a = m85804a(bArr, 0, bArr.length, bArr2);
            return iM85804a != iM85803a ? Arrays.copyOf(bArr2, iM85804a) : bArr2;
        }

        /* JADX INFO: renamed from: a */
        public final int m85803a(int i) {
            int i2;
            if (this.f61397d) {
                i2 = ((i + 2) / 3) * 4;
            } else {
                int i3 = i % 3;
                i2 = ((i / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
            }
            int i4 = this.f61395b;
            return i4 > 0 ? i2 + (((i2 - 1) / i4) * this.f61394a.length) : i2;
        }
    }

    public static class EncOutputStream extends FilterOutputStream {

        /* JADX INFO: renamed from: a */
        public int f61378a;

        /* JADX INFO: renamed from: b */
        public int f61379b;

        /* JADX INFO: renamed from: c */
        public int f61380c;

        /* JADX INFO: renamed from: d */
        public int f61381d;

        /* JADX INFO: renamed from: e */
        public boolean f61382e;

        /* JADX INFO: renamed from: f */
        public final char[] f61383f;

        /* JADX INFO: renamed from: g */
        public final byte[] f61384g;

        /* JADX INFO: renamed from: h */
        public final int f61385h;

        /* JADX INFO: renamed from: i */
        public final boolean f61386i;

        /* JADX INFO: renamed from: j */
        public int f61387j;

        public EncOutputStream(OutputStream outputStream, char[] cArr, byte[] bArr, int i, boolean z) {
            super(outputStream);
            this.f61378a = 0;
            this.f61382e = false;
            this.f61387j = 0;
            this.f61383f = cArr;
            this.f61384g = bArr;
            this.f61385h = i;
            this.f61386i = z;
        }

        /* JADX INFO: renamed from: a */
        public final void m85802a() throws IOException {
            if (this.f61387j == this.f61385h) {
                ((FilterOutputStream) this).out.write(this.f61384g);
                this.f61387j = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f61382e) {
                return;
            }
            this.f61382e = true;
            int i = this.f61378a;
            if (i == 1) {
                m85802a();
                ((FilterOutputStream) this).out.write(this.f61383f[this.f61379b >> 2]);
                ((FilterOutputStream) this).out.write(this.f61383f[(this.f61379b << 4) & 63]);
                if (this.f61386i) {
                    ((FilterOutputStream) this).out.write(61);
                    ((FilterOutputStream) this).out.write(61);
                }
            } else if (i == 2) {
                m85802a();
                ((FilterOutputStream) this).out.write(this.f61383f[this.f61379b >> 2]);
                ((FilterOutputStream) this).out.write(this.f61383f[((this.f61379b << 4) & 63) | (this.f61380c >> 4)]);
                ((FilterOutputStream) this).out.write(this.f61383f[(this.f61380c << 2) & 63]);
                if (this.f61386i) {
                    ((FilterOutputStream) this).out.write(61);
                }
            }
            this.f61378a = 0;
            ((FilterOutputStream) this).out.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f61382e) {
                zpg0.m220844a("Stream is closed");
                return;
            }
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            int i3 = this.f61378a;
            if (i3 != 0) {
                if (i3 == 1) {
                    int i4 = i + 1;
                    this.f61380c = bArr[i] & 255;
                    i2--;
                    if (i2 == 0) {
                        this.f61378a = i3 + 1;
                        return;
                    }
                    i = i4;
                }
                this.f61381d = bArr[i] & 255;
                i2--;
                m85802a();
                ((FilterOutputStream) this).out.write(this.f61383f[this.f61379b >> 2]);
                ((FilterOutputStream) this).out.write(this.f61383f[((this.f61379b << 4) & 63) | (this.f61380c >> 4)]);
                ((FilterOutputStream) this).out.write(this.f61383f[((this.f61380c << 2) & 63) | (this.f61381d >> 6)]);
                ((FilterOutputStream) this).out.write(this.f61383f[this.f61381d & 63]);
                this.f61387j += 4;
                i++;
            }
            int i5 = i2 / 3;
            this.f61378a = i2 - (i5 * 3);
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                m85802a();
                int i7 = i + 2;
                int i8 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                i += 3;
                int i9 = i8 | (bArr[i7] & 255);
                ((FilterOutputStream) this).out.write(this.f61383f[(i9 >>> 18) & 63]);
                ((FilterOutputStream) this).out.write(this.f61383f[(i9 >>> 12) & 63]);
                ((FilterOutputStream) this).out.write(this.f61383f[(i9 >>> 6) & 63]);
                ((FilterOutputStream) this).out.write(this.f61383f[i9 & 63]);
                this.f61387j += 4;
                i5 = i6;
            }
            int i10 = this.f61378a;
            if (i10 == 1) {
                this.f61379b = bArr[i] & 255;
            } else if (i10 == 2) {
                this.f61379b = bArr[i] & 255;
                this.f61380c = bArr[i + 1] & 255;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
        }
    }

    public static class DecInputStream extends InputStream {

        /* JADX INFO: renamed from: a */
        public final InputStream f61362a;

        /* JADX INFO: renamed from: b */
        public final boolean f61363b;

        /* JADX INFO: renamed from: c */
        public final int[] f61364c;

        /* JADX INFO: renamed from: d */
        public int f61365d = 0;

        /* JADX INFO: renamed from: e */
        public int f61366e = 18;

        /* JADX INFO: renamed from: f */
        public int f61367f = -8;

        /* JADX INFO: renamed from: g */
        public boolean f61368g = false;

        /* JADX INFO: renamed from: h */
        public boolean f61369h = false;

        /* JADX INFO: renamed from: i */
        public byte[] f61370i = new byte[1];

        public DecInputStream(InputStream inputStream, int[] iArr, boolean z) {
            this.f61362a = inputStream;
            this.f61364c = iArr;
            this.f61363b = z;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (!this.f61369h) {
                return this.f61362a.available();
            }
            zpg0.m220844a("Stream is closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f61369h) {
                return;
            }
            this.f61369h = true;
            this.f61362a.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            if (this.f61369h) {
                zpg0.m220844a("Stream is closed");
                return 0;
            }
            if (this.f61368g && this.f61367f < 0) {
                return -1;
            }
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                onl.m168333a();
                return 0;
            }
            if (this.f61367f >= 0) {
                int i4 = i;
                while (i2 != 0) {
                    i3 = i4 + 1;
                    int i5 = this.f61365d;
                    int i6 = this.f61367f;
                    bArr[i4] = (byte) (i5 >> i6);
                    i2--;
                    int i7 = i6 - 8;
                    this.f61367f = i7;
                    if (i7 < 0) {
                        this.f61365d = 0;
                    } else {
                        i4 = i3;
                    }
                }
                return i4 - i;
            }
            i3 = i;
            while (i2 > 0) {
                int i8 = this.f61362a.read();
                if (i8 == -1) {
                    this.f61368g = true;
                    int i9 = this.f61366e;
                    if (i9 != 18) {
                        if (i9 == 12) {
                            zpg0.m220844a("Base64 stream has one un-decoded dangling byte.");
                            return 0;
                        }
                        int i10 = i3 + 1;
                        int i11 = this.f61365d;
                        bArr[i3] = (byte) (i11 >> 16);
                        int i12 = i2 - 1;
                        if (i9 != 0) {
                            i3 = i10;
                        } else if (i12 == 0) {
                            this.f61365d = i11 >> 8;
                            this.f61367f = 0;
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
                    int i13 = this.f61366e;
                    if (i13 != 18 && i13 != 12 && (i13 != 6 || this.f61362a.read() == 61)) {
                        int i14 = i3 + 1;
                        int i15 = this.f61365d;
                        bArr[i3] = (byte) (i15 >> 16);
                        int i16 = i2 - 1;
                        if (this.f61366e != 0) {
                            i3 = i14;
                        } else if (i16 == 0) {
                            this.f61365d = i15 >> 8;
                            this.f61367f = 0;
                            i3 = i14;
                        } else {
                            i3 += 2;
                            bArr[i14] = (byte) (i15 >> 8);
                        }
                        this.f61368g = true;
                        break;
                    }
                    yll.m216601a("Illegal base64 ending sequence:", this.f61366e);
                    return 0;
                }
                int i17 = this.f61364c[i8];
                if (i17 != -1) {
                    int i18 = this.f61365d;
                    int i19 = this.f61366e;
                    this.f61365d = (i17 << i19) | i18;
                    if (i19 == 0) {
                        this.f61366e = 18;
                        this.f61367f = 16;
                        while (true) {
                            int i20 = this.f61367f;
                            if (i20 < 0) {
                                this.f61365d = 0;
                                break;
                            }
                            int i21 = i3 + 1;
                            bArr[i3] = (byte) (this.f61365d >> i20);
                            i2--;
                            int i22 = i20 - 8;
                            this.f61367f = i22;
                            if (i2 == 0 && i22 >= 0) {
                                return i21 - i;
                            }
                            i3 = i21;
                        }
                    } else {
                        this.f61366e = i19 - 6;
                    }
                } else if (!this.f61363b) {
                    rr10.m182681a("Illegal base64 character ", Integer.toString(i17, 16));
                    return 0;
                }
            }
            return i3 - i;
        }

        @Override // java.io.InputStream
        public int read() {
            if (read(this.f61370i, 0, 1) == -1) {
                return -1;
            }
            return this.f61370i[0] & 255;
        }
    }
}
