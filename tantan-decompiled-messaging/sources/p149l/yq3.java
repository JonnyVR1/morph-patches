package p149l;

import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yq3 {

    /* JADX INFO: renamed from: a */
    public long f199515a;

    /* JADX INFO: renamed from: b */
    public long f199516b;

    /* JADX INFO: renamed from: c */
    public boolean f199517c;

    /* JADX INFO: renamed from: a */
    public final long m215695a(long j) {
        return this.f199515a + Math.max(0L, ((this.f199516b - 529) * 1000000) / j);
    }

    /* JADX INFO: renamed from: b */
    public long m215696b(C1871k c1871k) {
        return m215695a(c1871k.f7762z);
    }

    /* JADX INFO: renamed from: c */
    public void m215697c() {
        this.f199515a = 0L;
        this.f199516b = 0L;
        this.f199517c = false;
    }

    /* JADX INFO: renamed from: d */
    public long m215698d(C1871k c1871k, DecoderInputBuffer decoderInputBuffer) {
        if (this.f199516b == 0) {
            this.f199515a = decoderInputBuffer.f7377e;
        }
        if (this.f199517c) {
            return decoderInputBuffer.f7377e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) p11.m167011e(decoderInputBuffer.f7375c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int iM216509m = yy00.m216509m(i);
        if (iM216509m != -1) {
            long jM215695a = m215695a(c1871k.f7762z);
            this.f199516b += (long) iM216509m;
            return jM215695a;
        }
        this.f199517c = true;
        this.f199516b = 0L;
        this.f199515a = decoderInputBuffer.f7377e;
        jwv.m143689i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.f7377e;
    }
}
