package p149l;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class e1s0 extends bzr0 {

    /* JADX INFO: renamed from: c */
    public MessageDigest f88849c;

    /* JADX INFO: renamed from: d */
    public final int f88850d;

    /* JADX INFO: renamed from: e */
    public final int f88851e;

    public e1s0(int i) {
        int i2 = i >> 3;
        this.f88850d = (i & 7) > 0 ? i2 + 1 : i2;
        this.f88851e = i;
    }

    @Override // p149l.bzr0
    /* JADX INFO: renamed from: b */
    public final byte[] mo104643b(String str) {
        synchronized (this.f78054a) {
            try {
                MessageDigest messageDigestM104642a = m104642a();
                this.f88849c = messageDigestM104642a;
                if (messageDigestM104642a == null) {
                    return new byte[0];
                }
                messageDigestM104642a.reset();
                this.f88849c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f88849c.digest();
                int length = bArrDigest.length;
                int i = this.f88850d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f88851e & 7) > 0) {
                    long j = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i2] & 255);
                    }
                    long j2 = j >>> (8 - (this.f88851e & 7));
                    int i3 = this.f88850d;
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        bArr[i3] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
