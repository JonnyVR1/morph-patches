package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class okf0 {

    /* JADX INFO: renamed from: a */
    public final d860 f144423a = new d860(8);

    /* JADX INFO: renamed from: b */
    public int f144424b;

    /* JADX INFO: renamed from: a */
    public final long m164858a(tqf tqfVar) throws IOException {
        int i = 0;
        tqfVar.mo150655f(this.f144423a.m110299e(), 0, 1);
        int i2 = this.f144423a.m110299e()[0] & 255;
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
        tqfVar.mo150655f(this.f144423a.m110299e(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f144423a.m110299e()[i] & 255) + (i5 << 8);
        }
        this.f144424b += i4 + 1;
        return i5;
    }

    /* JADX INFO: renamed from: b */
    public boolean m164859b(tqf tqfVar) throws IOException {
        long length = tqfVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        tqfVar.mo150655f(this.f144423a.m110299e(), 0, 4);
        long jM110281J = this.f144423a.m110281J();
        this.f144424b = 4;
        while (jM110281J != 440786851) {
            int i2 = this.f144424b + 1;
            this.f144424b = i2;
            if (i2 == i) {
                return false;
            }
            tqfVar.mo150655f(this.f144423a.m110299e(), 0, 1);
            jM110281J = ((jM110281J << 8) & (-256)) | ((long) (this.f144423a.m110299e()[0] & 255));
        }
        long jM164858a = m164858a(tqfVar);
        long j2 = this.f144424b;
        if (jM164858a != Long.MIN_VALUE && (length == -1 || j2 + jM164858a < length)) {
            while (true) {
                int i3 = this.f144424b;
                long j3 = j2 + jM164858a;
                if (i3 < j3) {
                    if (m164858a(tqfVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jM164858a2 = m164858a(tqfVar);
                    if (jM164858a2 < 0 || jM164858a2 > 2147483647L) {
                        return false;
                    }
                    if (jM164858a2 != 0) {
                        int i4 = (int) jM164858a2;
                        tqfVar.mo150660m(i4);
                        this.f144424b += i4;
                    }
                } else if (i3 == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
