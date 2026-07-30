package p153l;

import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xr3 {

    /* JADX INFO: renamed from: a */
    public long f195879a;

    /* JADX INFO: renamed from: b */
    public long f195880b;

    /* JADX INFO: renamed from: c */
    public boolean f195881c;

    /* JADX INFO: renamed from: a */
    public final long m212770a(long j) {
        return this.f195879a + Math.max(0L, ((this.f195880b - 529) * 1000000) / j);
    }

    /* JADX INFO: renamed from: b */
    public long m212771b(C1894k c1894k) {
        return m212770a(c1894k.f7799z);
    }

    /* JADX INFO: renamed from: c */
    public void m212772c() {
        this.f195879a = 0L;
        this.f195880b = 0L;
        this.f195881c = false;
    }

    /* JADX INFO: renamed from: d */
    public long m212773d(C1894k c1894k, DecoderInputBuffer decoderInputBuffer) {
        if (this.f195880b == 0) {
            this.f195879a = decoderInputBuffer.f7414e;
        }
        if (this.f195881c) {
            return decoderInputBuffer.f7414e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) w11.m204369e(decoderInputBuffer.f7412c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int iM138913m = i710.m138913m(i);
        if (iM138913m != -1) {
            long jM212770a = m212770a(c1894k.f7799z);
            this.f195880b += (long) iM138913m;
            return jM212770a;
        }
        this.f195881c = true;
        this.f195880b = 0L;
        this.f195879a = decoderInputBuffer.f7414e;
        kyv.m152151i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.f7414e;
    }
}
