package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class m8s0 extends h8s0 {

    /* JADX INFO: renamed from: c */
    public MessageDigest f135280c;

    @Override // p153l.h8s0
    /* JADX INFO: renamed from: b */
    public final byte[] mo133954b(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iM153298a = l8s0.m153298a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iM153298a);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iM153298a2 = l8s0.m153298a(strArrSplit[i2]);
                    int i3 = (iM153298a2 >> 16) ^ ((char) iM153298a2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iM153298a3 = l8s0.m153298a(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iM153298a3 >> 24) ^ (((iM153298a3 & 255) ^ ((iM153298a3 >> 8) & 255)) ^ ((iM153298a3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f135280c = m133953a();
        synchronized (this.f108263a) {
            try {
                MessageDigest messageDigest = this.f135280c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f135280c.update(bArrArray);
                byte[] bArrDigest = this.f135280c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
