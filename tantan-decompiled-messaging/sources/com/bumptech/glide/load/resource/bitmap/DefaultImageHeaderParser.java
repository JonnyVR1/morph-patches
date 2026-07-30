package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p149l.h01;
import p149l.qf80;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    static final byte[] f4584a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    private static final int[] f4585b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo5508a() throws IOException;

        /* JADX INFO: renamed from: b */
        short mo5509b() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C1084a implements Reader {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4586a;

        public C1084a(ByteBuffer byteBuffer) {
            this.f4586a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public int mo5508a() throws Reader.EndOfFileException {
            return mo5509b() | (mo5509b() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public short mo5509b() throws Reader.EndOfFileException {
            if (this.f4586a.remaining() >= 1) {
                return (short) (this.f4586a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f4586a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f4586a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int iMin = (int) Math.min(this.f4586a.remaining(), j);
            ByteBuffer byteBuffer = this.f4586a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C1085b {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4587a;

        public C1085b(byte[] bArr, int i) {
            this.f4587a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: c */
        private boolean m5510c(int i, int i2) {
            return this.f4587a.remaining() - i >= i2;
        }

        /* JADX INFO: renamed from: a */
        public short m5511a(int i) {
            if (m5510c(i, 2)) {
                return this.f4587a.getShort(i);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        public int m5512b(int i) {
            if (m5510c(i, 4)) {
                return this.f4587a.getInt(i);
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        public int m5513d() {
            return this.f4587a.remaining();
        }

        /* JADX INFO: renamed from: e */
        public void m5514e(ByteOrder byteOrder) {
            this.f4587a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C1086c implements Reader {

        /* JADX INFO: renamed from: a */
        private final InputStream f4588a;

        public C1086c(InputStream inputStream) {
            this.f4588a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public int mo5508a() throws IOException {
            return mo5509b() | (mo5509b() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public short mo5509b() throws IOException {
            int i = this.f4588a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f4588a.read(bArr, i2, i - i2)) != -1) {
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
                long jSkip = this.f4588a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f4588a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m5500d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX INFO: renamed from: e */
    private int m5501e(Reader reader, h01 h01Var) throws IOException {
        try {
            if (!m5503g(reader.mo5508a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM5505i = m5505i(reader);
            if (iM5505i == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) h01Var.mo128942c(iM5505i, byte[].class);
            try {
                return m5507k(reader, bArr, iM5505i);
            } finally {
                h01Var.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private ImageHeaderParser.ImageType m5502f(Reader reader) throws IOException {
        try {
            int iMo5508a = reader.mo5508a();
            if (iMo5508a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo5509b = (iMo5508a << 8) | reader.mo5509b();
            if (iMo5509b == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo5509b2 = (iMo5509b << 8) | reader.mo5509b();
            if (iMo5509b2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo5509b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo5509b2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.mo5508a() << 16) | reader.mo5508a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo5508a2 = (reader.mo5508a() << 16) | reader.mo5508a();
            if ((iMo5508a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iMo5508a2 & 255;
            if (i == 88) {
                reader.skip(4L);
                return (reader.mo5509b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo5509b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m5503g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX INFO: renamed from: h */
    private boolean m5504h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f4584a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f4584a;
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

    /* JADX INFO: renamed from: i */
    private int m5505i(Reader reader) throws IOException {
        while (reader.mo5509b() == 255) {
            short sMo5509b = reader.mo5509b();
            if (sMo5509b == 218) {
                return -1;
            }
            if (sMo5509b == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo5508a = reader.mo5508a() - 2;
            if (sMo5509b == 225) {
                return iMo5508a;
            }
            long j = iMo5508a;
            if (reader.skip(j) != j) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: j */
    private static int m5506j(C1085b c1085b) {
        ByteOrder byteOrder;
        short sM5511a = c1085b.m5511a(6);
        if (sM5511a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM5511a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c1085b.m5514e(byteOrder);
        int iM5512b = c1085b.m5512b(10) + 6;
        short sM5511a2 = c1085b.m5511a(iM5512b);
        for (int i = 0; i < sM5511a2; i++) {
            int iM5500d = m5500d(iM5512b, i);
            if (c1085b.m5511a(iM5500d) == 274) {
                short sM5511a3 = c1085b.m5511a(iM5500d + 2);
                if (sM5511a3 < 1 || sM5511a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM5512b2 = c1085b.m5512b(iM5500d + 4);
                    if (iM5512b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i2 = iM5512b2 + f4585b[sM5511a3];
                        if (i2 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i3 = iM5500d + 8;
                            if (i3 < 0 || i3 > c1085b.m5513d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i2 >= 0 && i2 + i3 <= c1085b.m5513d()) {
                                    return c1085b.m5511a(i3);
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

    /* JADX INFO: renamed from: k */
    private int m5507k(Reader reader, byte[] bArr, int i) throws IOException {
        if (reader.read(bArr, i) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m5504h(bArr, i)) {
            return m5506j(new C1085b(bArr, i));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo5342a(@NonNull InputStream inputStream) throws IOException {
        return m5502f(new C1086c((InputStream) qf80.m174276d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: b */
    public ImageHeaderParser.ImageType mo5343b(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m5502f(new C1084a((ByteBuffer) qf80.m174276d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public int mo5344c(@NonNull InputStream inputStream, @NonNull h01 h01Var) throws IOException {
        return m5501e(new C1086c((InputStream) qf80.m174276d(inputStream)), (h01) qf80.m174276d(h01Var));
    }
}
