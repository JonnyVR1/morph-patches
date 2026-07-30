package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class bax0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public Iterator f74735a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f74736b;

    /* JADX INFO: renamed from: c */
    public int f74737c = 0;

    /* JADX INFO: renamed from: d */
    public int f74738d;

    /* JADX INFO: renamed from: e */
    public int f74739e;

    /* JADX INFO: renamed from: f */
    public boolean f74740f;

    /* JADX INFO: renamed from: g */
    public byte[] f74741g;

    /* JADX INFO: renamed from: h */
    public int f74742h;

    /* JADX INFO: renamed from: i */
    public long f74743i;

    public bax0(Iterable iterable) {
        this.f74735a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f74737c++;
        }
        this.f74738d = -1;
        if (m100933k()) {
            return;
        }
        this.f74736b = aax0.f68611e;
        this.f74738d = 0;
        this.f74739e = 0;
        this.f74743i = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m100932d(int i) {
        int i2 = this.f74739e + i;
        this.f74739e = i2;
        if (i2 == this.f74736b.limit()) {
            m100933k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m100933k() {
        this.f74738d++;
        if (!this.f74735a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f74735a.next();
        this.f74736b = byteBuffer;
        this.f74739e = byteBuffer.position();
        if (this.f74736b.hasArray()) {
            this.f74740f = true;
            this.f74741g = this.f74736b.array();
            this.f74742h = this.f74736b.arrayOffset();
        } else {
            this.f74740f = false;
            this.f74743i = rcx0.m178835m(this.f74736b);
            this.f74741g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f74738d == this.f74737c) {
            return -1;
        }
        int iLimit = this.f74736b.limit();
        int i3 = this.f74739e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f74740f) {
            System.arraycopy(this.f74741g, i3 + this.f74742h, bArr, i, i2);
            m100932d(i2);
            return i2;
        }
        int iPosition = this.f74736b.position();
        this.f74736b.position(this.f74739e);
        this.f74736b.get(bArr, i, i2);
        this.f74736b.position(iPosition);
        m100932d(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f74738d == this.f74737c) {
            return -1;
        }
        if (this.f74740f) {
            int i = this.f74741g[this.f74739e + this.f74742h] & 255;
            m100932d(1);
            return i;
        }
        int iM178831i = rcx0.m178831i(((long) this.f74739e) + this.f74743i) & 255;
        m100932d(1);
        return iM178831i;
    }
}
