package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ihj0 {
    /* JADX INFO: renamed from: a */
    public static UUID m136206a(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m136207b(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (mostSignificantBits >>> ((7 - i) * 8));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            bArr[i2] = (byte) (leastSignificantBits >>> ((7 - i2) * 8));
        }
        return bArr;
    }
}
