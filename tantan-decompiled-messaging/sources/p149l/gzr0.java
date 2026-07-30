package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class gzr0 extends bzr0 {

    /* JADX INFO: renamed from: c */
    public MessageDigest f105168c;

    @Override // p149l.bzr0
    /* JADX INFO: renamed from: b */
    public final byte[] mo104643b(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iM123918a = fzr0.m123918a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iM123918a);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iM123918a2 = fzr0.m123918a(strArrSplit[i2]);
                    int i3 = (iM123918a2 >> 16) ^ ((char) iM123918a2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iM123918a3 = fzr0.m123918a(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iM123918a3 >> 24) ^ (((iM123918a3 & 255) ^ ((iM123918a3 >> 8) & 255)) ^ ((iM123918a3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f105168c = m104642a();
        synchronized (this.f78054a) {
            try {
                MessageDigest messageDigest = this.f105168c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f105168c.update(bArrArray);
                byte[] bArrDigest = this.f105168c.digest();
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
