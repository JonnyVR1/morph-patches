package p153l;

import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z5f implements xwd0 {

    /* JADX INFO: renamed from: a */
    public final C1894k f203027a;

    /* JADX INFO: renamed from: c */
    public long[] f203029c;

    /* JADX INFO: renamed from: d */
    public boolean f203030d;

    /* JADX INFO: renamed from: e */
    public a6f f203031e;

    /* JADX INFO: renamed from: f */
    public boolean f203032f;

    /* JADX INFO: renamed from: g */
    public int f203033g;

    /* JADX INFO: renamed from: b */
    public final d5f f203028b = new d5f();

    /* JADX INFO: renamed from: h */
    public long f203034h = -9223372036854775807L;

    public z5f(a6f a6fVar, C1894k c1894k, boolean z) {
        this.f203027a = c1894k;
        this.f203031e = a6fVar;
        this.f203029c = a6fVar.f68721b;
        m218658e(a6fVar, z);
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: b */
    public boolean mo10994b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public String m218656c() {
        return this.f203031e.m96325a();
    }

    /* JADX INFO: renamed from: d */
    public void m218657d(long j) {
        int iM105129e = bmk0.m105129e(this.f203029c, j, true, false);
        this.f203033g = iM105129e;
        if (!this.f203030d || iM105129e != this.f203029c.length) {
            j = -9223372036854775807L;
        }
        this.f203034h = j;
    }

    /* JADX INFO: renamed from: e */
    public void m218658e(a6f a6fVar, boolean z) {
        int i = this.f203033g;
        long j = i == 0 ? -9223372036854775807L : this.f203029c[i - 1];
        this.f203030d = z;
        this.f203031e = a6fVar;
        long[] jArr = a6fVar.f68721b;
        this.f203029c = jArr;
        long j2 = this.f203034h;
        if (j2 != -9223372036854775807L) {
            m218657d(j2);
        } else if (j != -9223372036854775807L) {
            this.f203033g = bmk0.m105129e(jArr, j, false, false);
        }
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: k */
    public int mo10996k(long j) {
        int iMax = Math.max(this.f203033g, bmk0.m105129e(this.f203029c, j, true, false));
        int i = iMax - this.f203033g;
        this.f203033g = iMax;
        return i;
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: l */
    public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.f203033g;
        boolean z = i2 == this.f203029c.length;
        if (z && !this.f203030d) {
            decoderInputBuffer.m97783t(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f203032f) {
            p1jVar.f150174b = this.f203027a;
            this.f203032f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f203033g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrM114297a = this.f203028b.m114297a(this.f203031e.f68720a[i2]);
            decoderInputBuffer.m9859v(bArrM114297a.length);
            decoderInputBuffer.f7412c.put(bArrM114297a);
        }
        decoderInputBuffer.f7414e = this.f203029c[i2];
        decoderInputBuffer.m97783t(1);
        return -4;
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: a */
    public void mo10993a() throws IOException {
    }
}
