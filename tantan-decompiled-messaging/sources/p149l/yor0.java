package p149l;

import java.nio.ByteBuffer;
import org.spongycastle.math.p131ec.Tnaf;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class yor0 {
    /* JADX INFO: renamed from: a */
    public static double m215545a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << Tnaf.POW_2_WIDTH;
        int i3 = bArr[2] << 8;
        return ((double) ((((i & RoundedDrawable.DEFAULT_BORDER_COLOR) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    /* JADX INFO: renamed from: b */
    public static double m215546b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << Tnaf.POW_2_WIDTH;
        int i3 = bArr[2] << 8;
        return ((double) ((((i & RoundedDrawable.DEFAULT_BORDER_COLOR) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* JADX INFO: renamed from: c */
    public static int m215547c(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* JADX INFO: renamed from: d */
    public static int m215548d(ByteBuffer byteBuffer) {
        return (m215547c(byteBuffer.get()) << 8) + m215547c(byteBuffer.get());
    }

    /* JADX INFO: renamed from: e */
    public static long m215549e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* JADX INFO: renamed from: f */
    public static long m215550f(ByteBuffer byteBuffer) {
        long jM215549e = m215549e(byteBuffer) << 32;
        if (jM215549e >= 0) {
            return jM215549e + m215549e(byteBuffer);
        }
        upk0.m194883a("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }
}
