package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xsf0 {

    /* JADX INFO: renamed from: a */
    public final ig60 f196096a = new ig60(8);

    /* JADX INFO: renamed from: b */
    public int f196097b;

    /* JADX INFO: renamed from: a */
    public final long m212976a(asf asfVar) throws IOException {
        int i = 0;
        asfVar.mo99900f(this.f196096a.m139815e(), 0, 1);
        int i2 = this.f196096a.m139815e()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        asfVar.mo99900f(this.f196096a.m139815e(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f196096a.m139815e()[i] & 255) + (i5 << 8);
        }
        this.f196097b += i4 + 1;
        return i5;
    }

    /* JADX INFO: renamed from: b */
    public boolean m212977b(asf asfVar) throws IOException {
        long length = asfVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        asfVar.mo99900f(this.f196096a.m139815e(), 0, 4);
        long jM139797J = this.f196096a.m139797J();
        this.f196097b = 4;
        while (jM139797J != 440786851) {
            int i2 = this.f196097b + 1;
            this.f196097b = i2;
            if (i2 == i) {
                return false;
            }
            asfVar.mo99900f(this.f196096a.m139815e(), 0, 1);
            jM139797J = ((jM139797J << 8) & (-256)) | ((long) (this.f196096a.m139815e()[0] & 255));
        }
        long jM212976a = m212976a(asfVar);
        long j2 = this.f196097b;
        if (jM212976a != Long.MIN_VALUE && (length == -1 || j2 + jM212976a < length)) {
            while (true) {
                int i3 = this.f196097b;
                long j3 = j2 + jM212976a;
                if (i3 < j3) {
                    if (m212976a(asfVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jM212976a2 = m212976a(asfVar);
                    if (jM212976a2 < 0 || jM212976a2 > 2147483647L) {
                        return false;
                    }
                    if (jM212976a2 != 0) {
                        int i4 = (int) jM212976a2;
                        asfVar.mo99904m(i4);
                        this.f196097b += i4;
                    }
                } else if (i3 == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
