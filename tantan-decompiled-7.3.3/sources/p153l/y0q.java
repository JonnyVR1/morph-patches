package p153l;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.spongycastle.math.p135ec.Tnaf;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class y0q {
    /* JADX INFO: renamed from: a */
    public static int m213885a(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* JADX INFO: renamed from: b */
    public static String m213886b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static double m213887c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    /* JADX INFO: renamed from: d */
    public static double m213888d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* JADX INFO: renamed from: e */
    public static float m213889e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255))) / 256.0f;
    }

    /* JADX INFO: renamed from: f */
    public static String m213890f(ByteBuffer byteBuffer) {
        int iM213893i = m213893i(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((iM213893i >> ((2 - i) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m213891g(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b == 0) {
                return slk0.m186592a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b);
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m213892h(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return slk0.m186592a(bArr);
    }

    /* JADX INFO: renamed from: i */
    public static int m213893i(ByteBuffer byteBuffer) {
        return (m213885a(byteBuffer.get()) << 8) + m213885a(byteBuffer.get());
    }

    /* JADX INFO: renamed from: j */
    public static int m213894j(ByteBuffer byteBuffer) {
        return (m213893i(byteBuffer) << 8) + m213885a(byteBuffer.get());
    }

    /* JADX INFO: renamed from: k */
    public static long m213895k(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* JADX INFO: renamed from: l */
    public static long m213896l(ByteBuffer byteBuffer) {
        long jM213893i = ((long) m213893i(byteBuffer)) << 32;
        if (jM213893i >= 0) {
            return jM213893i + m213895k(byteBuffer);
        }
        azk0.m101074a("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public static long m213897m(ByteBuffer byteBuffer) {
        long jM213895k = m213895k(byteBuffer) << 32;
        if (jM213895k >= 0) {
            return jM213895k + m213895k(byteBuffer);
        }
        azk0.m101074a("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    /* JADX INFO: renamed from: n */
    public static int m213898n(ByteBuffer byteBuffer) {
        return m213885a(byteBuffer.get());
    }
}
