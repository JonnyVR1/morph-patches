package p153l;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class kas0 extends h8s0 {

    /* JADX INFO: renamed from: c */
    public MessageDigest f124715c;

    /* JADX INFO: renamed from: d */
    public final int f124716d;

    /* JADX INFO: renamed from: e */
    public final int f124717e;

    public kas0(int i) {
        int i2 = i >> 3;
        this.f124716d = (i & 7) > 0 ? i2 + 1 : i2;
        this.f124717e = i;
    }

    @Override // p153l.h8s0
    /* JADX INFO: renamed from: b */
    public final byte[] mo133954b(String str) {
        synchronized (this.f108263a) {
            try {
                MessageDigest messageDigestM133953a = m133953a();
                this.f124715c = messageDigestM133953a;
                if (messageDigestM133953a == null) {
                    return new byte[0];
                }
                messageDigestM133953a.reset();
                this.f124715c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f124715c.digest();
                int length = bArrDigest.length;
                int i = this.f124716d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f124717e & 7) > 0) {
                    long j = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i2] & 255);
                    }
                    long j2 = j >>> (8 - (this.f124717e & 7));
                    int i3 = this.f124716d;
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
