package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class hjx0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public Iterator f110335a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f110336b;

    /* JADX INFO: renamed from: c */
    public int f110337c = 0;

    /* JADX INFO: renamed from: d */
    public int f110338d;

    /* JADX INFO: renamed from: e */
    public int f110339e;

    /* JADX INFO: renamed from: f */
    public boolean f110340f;

    /* JADX INFO: renamed from: g */
    public byte[] f110341g;

    /* JADX INFO: renamed from: h */
    public int f110342h;

    /* JADX INFO: renamed from: i */
    public long f110343i;

    public hjx0(Iterable iterable) {
        this.f110335a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f110337c++;
        }
        this.f110338d = -1;
        if (m135539k()) {
            return;
        }
        this.f110336b = gjx0.f104692e;
        this.f110338d = 0;
        this.f110339e = 0;
        this.f110343i = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m135538d(int i) {
        int i2 = this.f110339e + i;
        this.f110339e = i2;
        if (i2 == this.f110336b.limit()) {
            m135539k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m135539k() {
        this.f110338d++;
        if (!this.f110335a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f110335a.next();
        this.f110336b = byteBuffer;
        this.f110339e = byteBuffer.position();
        if (this.f110336b.hasArray()) {
            this.f110340f = true;
            this.f110341g = this.f110336b.array();
            this.f110342h = this.f110336b.arrayOffset();
        } else {
            this.f110340f = false;
            this.f110343i = xlx0.m211700m(this.f110336b);
            this.f110341g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f110338d == this.f110337c) {
            return -1;
        }
        int iLimit = this.f110336b.limit();
        int i3 = this.f110339e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f110340f) {
            System.arraycopy(this.f110341g, i3 + this.f110342h, bArr, i, i2);
            m135538d(i2);
            return i2;
        }
        int iPosition = this.f110336b.position();
        this.f110336b.position(this.f110339e);
        this.f110336b.get(bArr, i, i2);
        this.f110336b.position(iPosition);
        m135538d(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f110338d == this.f110337c) {
            return -1;
        }
        if (this.f110340f) {
            int i = this.f110341g[this.f110339e + this.f110342h] & 255;
            m135538d(1);
            return i;
        }
        int iM211696i = xlx0.m211696i(((long) this.f110339e) + this.f110343i) & 255;
        m135538d(1);
        return iM211696i;
    }
}
