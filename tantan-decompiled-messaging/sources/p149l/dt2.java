package p149l;

import androidx.annotation.IntRange;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dt2 extends DecoderInputBuffer {

    /* JADX INFO: renamed from: i */
    public long f87813i;

    /* JADX INFO: renamed from: j */
    public int f87814j;

    /* JADX INFO: renamed from: k */
    public int f87815k;

    public dt2() {
        super(2);
        this.f87815k = 32;
    }

    /* JADX INFO: renamed from: A */
    public boolean m113524A(DecoderInputBuffer decoderInputBuffer) {
        p11.m167007a(!decoderInputBuffer.m9807x());
        p11.m167007a(!decoderInputBuffer.m154493n());
        p11.m167007a(!decoderInputBuffer.m154495p());
        if (!m113525B(decoderInputBuffer)) {
            return false;
        }
        int i = this.f87814j;
        this.f87814j = i + 1;
        if (i == 0) {
            this.f7377e = decoderInputBuffer.f7377e;
            if (decoderInputBuffer.m154497r()) {
                m154499t(1);
            }
        }
        if (decoderInputBuffer.m154494o()) {
            m154499t(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f7375c;
        if (byteBuffer != null) {
            m9805v(byteBuffer.remaining());
            this.f7375c.put(byteBuffer);
        }
        this.f87813i = decoderInputBuffer.f7377e;
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m113525B(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!m113529I()) {
            return true;
        }
        if (this.f87814j >= this.f87815k || decoderInputBuffer.m154494o() != m154494o()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f7375c;
        return byteBuffer2 == null || (byteBuffer = this.f7375c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* JADX INFO: renamed from: C */
    public long m113526C() {
        return this.f7377e;
    }

    /* JADX INFO: renamed from: F */
    public long m113527F() {
        return this.f87813i;
    }

    /* JADX INFO: renamed from: H */
    public int m113528H() {
        return this.f87814j;
    }

    /* JADX INFO: renamed from: I */
    public boolean m113529I() {
        return this.f87814j > 0;
    }

    /* JADX INFO: renamed from: J */
    public void m113530J(@IntRange(from = 1) int i) {
        p11.m167007a(i > 0);
        this.f87815k = i;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, p149l.mg3
    /* JADX INFO: renamed from: i */
    public void mo9803i() {
        super.mo9803i();
        this.f87814j = 0;
    }
}
