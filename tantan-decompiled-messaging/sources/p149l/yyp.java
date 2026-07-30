package p149l;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.spongycastle.math.p131ec.Tnaf;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class yyp {
    /* JADX INFO: renamed from: a */
    public static int m216548a(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* JADX INFO: renamed from: b */
    public static String m216549b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static double m216550c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    /* JADX INFO: renamed from: d */
    public static double m216551d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* JADX INFO: renamed from: e */
    public static float m216552e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255))) / 256.0f;
    }

    /* JADX INFO: renamed from: f */
    public static String m216553f(ByteBuffer byteBuffer) {
        int iM216556i = m216556i(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((iM216556i >> ((2 - i) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m216554g(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b == 0) {
                return mck0.m154016a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b);
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m216555h(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return mck0.m154016a(bArr);
    }

    /* JADX INFO: renamed from: i */
    public static int m216556i(ByteBuffer byteBuffer) {
        return (m216548a(byteBuffer.get()) << 8) + m216548a(byteBuffer.get());
    }

    /* JADX INFO: renamed from: j */
    public static int m216557j(ByteBuffer byteBuffer) {
        return (m216556i(byteBuffer) << 8) + m216548a(byteBuffer.get());
    }

    /* JADX INFO: renamed from: k */
    public static long m216558k(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* JADX INFO: renamed from: l */
    public static long m216559l(ByteBuffer byteBuffer) {
        long jM216556i = ((long) m216556i(byteBuffer)) << 32;
        if (jM216556i >= 0) {
            return jM216556i + m216558k(byteBuffer);
        }
        upk0.m194883a("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public static long m216560m(ByteBuffer byteBuffer) {
        long jM216558k = m216558k(byteBuffer) << 32;
        if (jM216558k >= 0) {
            return jM216558k + m216558k(byteBuffer);
        }
        upk0.m194883a("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    /* JADX INFO: renamed from: n */
    public static int m216561n(ByteBuffer byteBuffer) {
        return m216548a(byteBuffer.get());
    }
}
