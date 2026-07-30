package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p153l.o01;
import p153l.vn80;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    static final byte[] f4596a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    private static final int[] f4597b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo5535a() throws IOException;

        /* JADX INFO: renamed from: b */
        short mo5536b() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C1094a implements Reader {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4598a;

        public C1094a(ByteBuffer byteBuffer) {
            this.f4598a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public int mo5535a() throws Reader.EndOfFileException {
            return mo5536b() | (mo5536b() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public short mo5536b() throws Reader.EndOfFileException {
            if (this.f4598a.remaining() >= 1) {
                return (short) (this.f4598a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f4598a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f4598a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int iMin = (int) Math.min(this.f4598a.remaining(), j);
            ByteBuffer byteBuffer = this.f4598a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C1095b {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4599a;

        public C1095b(byte[] bArr, int i) {
            this.f4599a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: c */
        private boolean m5537c(int i, int i2) {
            return this.f4599a.remaining() - i >= i2;
        }

        /* JADX INFO: renamed from: a */
        public short m5538a(int i) {
            if (m5537c(i, 2)) {
                return this.f4599a.getShort(i);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        public int m5539b(int i) {
            if (m5537c(i, 4)) {
                return this.f4599a.getInt(i);
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        public int m5540d() {
            return this.f4599a.remaining();
        }

        /* JADX INFO: renamed from: e */
        public void m5541e(ByteOrder byteOrder) {
            this.f4599a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C1096c implements Reader {

        /* JADX INFO: renamed from: a */
        private final InputStream f4600a;

        public C1096c(InputStream inputStream) {
            this.f4600a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public int mo5535a() throws IOException {
            return mo5536b() | (mo5536b() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public short mo5536b() throws IOException {
            int i = this.f4600a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f4600a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f4600a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f4600a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m5526e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX INFO: renamed from: f */
    private int m5527f(Reader reader, o01 o01Var) throws IOException {
        try {
            if (!m5529h(reader.mo5535a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM5531j = m5531j(reader);
            if (iM5531j == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) o01Var.mo165411c(iM5531j, byte[].class);
            try {
                return m5533l(reader, bArr, iM5531j);
            } finally {
                o01Var.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private ImageHeaderParser.ImageType m5528g(Reader reader) throws IOException {
        try {
            int iMo5535a = reader.mo5535a();
            if (iMo5535a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo5536b = (iMo5535a << 8) | reader.mo5536b();
            if (iMo5536b == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo5536b2 = (iMo5536b << 8) | reader.mo5536b();
            if (iMo5536b2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo5536b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo5536b2 != 1380533830) {
                return m5534m(reader, iMo5536b2) ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.mo5535a() << 16) | reader.mo5535a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo5535a2 = (reader.mo5535a() << 16) | reader.mo5535a();
            if ((iMo5535a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iMo5535a2 & 255;
            if (i != 88) {
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.mo5536b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            short sMo5536b = reader.mo5536b();
            if ((sMo5536b & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (sMo5536b & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m5529h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX INFO: renamed from: i */
    private boolean m5530i(byte[] bArr, int i) {
        boolean z = bArr != null && i > f4596a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f4596a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    private int m5531j(Reader reader) throws IOException {
        while (reader.mo5536b() == 255) {
            short sMo5536b = reader.mo5536b();
            if (sMo5536b == 218) {
                return -1;
            }
            if (sMo5536b == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo5535a = reader.mo5535a() - 2;
            if (sMo5536b == 225) {
                return iMo5535a;
            }
            long j = iMo5535a;
            if (reader.skip(j) != j) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: k */
    private static int m5532k(C1095b c1095b) {
        ByteOrder byteOrder;
        short sM5538a = c1095b.m5538a(6);
        if (sM5538a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM5538a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c1095b.m5541e(byteOrder);
        int iM5539b = c1095b.m5539b(10) + 6;
        short sM5538a2 = c1095b.m5538a(iM5539b);
        for (int i = 0; i < sM5538a2; i++) {
            int iM5526e = m5526e(iM5539b, i);
            if (c1095b.m5538a(iM5526e) == 274) {
                short sM5538a3 = c1095b.m5538a(iM5526e + 2);
                if (sM5538a3 < 1 || sM5538a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM5539b2 = c1095b.m5539b(iM5526e + 4);
                    if (iM5539b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i2 = iM5539b2 + f4597b[sM5538a3];
                        if (i2 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i3 = iM5526e + 8;
                            if (i3 < 0 || i3 > c1095b.m5540d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i2 >= 0 && i2 + i3 <= c1095b.m5540d()) {
                                    return c1095b.m5538a(i3);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    private int m5533l(Reader reader, byte[] bArr, int i) throws IOException {
        if (reader.read(bArr, i) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m5530i(bArr, i)) {
            return m5532k(new C1095b(bArr, i));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: m */
    private boolean m5534m(Reader reader, int i) throws IOException {
        if (((reader.mo5535a() << 16) | reader.mo5535a()) != 1718909296) {
            return false;
        }
        int iMo5535a = (reader.mo5535a() << 16) | reader.mo5535a();
        if (iMo5535a == 1635150182 || iMo5535a == 1635150195) {
            return true;
        }
        reader.skip(4L);
        int i2 = i - 16;
        if (i2 % 4 != 0) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && i2 > 0) {
            int iMo5535a2 = (reader.mo5535a() << 16) | reader.mo5535a();
            if (iMo5535a2 == 1635150182 || iMo5535a2 == 1635150195) {
                return true;
            }
            i3++;
            i2 -= 4;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo5354a(@NonNull InputStream inputStream) throws IOException {
        return m5528g(new C1096c((InputStream) vn80.m201944d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: b */
    public ImageHeaderParser.ImageType mo5355b(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m5528g(new C1094a((ByteBuffer) vn80.m201944d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public int mo5356c(@NonNull InputStream inputStream, @NonNull o01 o01Var) throws IOException {
        return m5527f(new C1096c((InputStream) vn80.m201944d(inputStream)), (o01) vn80.m201944d(o01Var));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: d */
    public int mo5357d(@NonNull ByteBuffer byteBuffer, @NonNull o01 o01Var) throws IOException {
        return m5527f(new C1094a((ByteBuffer) vn80.m201944d(byteBuffer)), (o01) vn80.m201944d(o01Var));
    }
}
