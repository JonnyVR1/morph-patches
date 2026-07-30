package p153l;

import androidx.annotation.IntRange;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tt2 extends DecoderInputBuffer {

    /* JADX INFO: renamed from: i */
    public long f176050i;

    /* JADX INFO: renamed from: j */
    public int f176051j;

    /* JADX INFO: renamed from: k */
    public int f176052k;

    public tt2() {
        super(2);
        this.f176052k = 32;
    }

    /* JADX INFO: renamed from: A */
    public boolean m192647A(DecoderInputBuffer decoderInputBuffer) {
        w11.m204365a(!decoderInputBuffer.m9861x());
        w11.m204365a(!decoderInputBuffer.m97777n());
        w11.m204365a(!decoderInputBuffer.m97779p());
        if (!m192648B(decoderInputBuffer)) {
            return false;
        }
        int i = this.f176051j;
        this.f176051j = i + 1;
        if (i == 0) {
            this.f7414e = decoderInputBuffer.f7414e;
            if (decoderInputBuffer.m97781r()) {
                m97783t(1);
            }
        }
        if (decoderInputBuffer.m97778o()) {
            m97783t(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f7412c;
        if (byteBuffer != null) {
            m9859v(byteBuffer.remaining());
            this.f7412c.put(byteBuffer);
        }
        this.f176050i = decoderInputBuffer.f7414e;
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m192648B(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!m192652I()) {
            return true;
        }
        if (this.f176051j >= this.f176052k || decoderInputBuffer.m97778o() != m97778o()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f7412c;
        return byteBuffer2 == null || (byteBuffer = this.f7412c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* JADX INFO: renamed from: C */
    public long m192649C() {
        return this.f7414e;
    }

    /* JADX INFO: renamed from: F */
    public long m192650F() {
        return this.f176050i;
    }

    /* JADX INFO: renamed from: H */
    public int m192651H() {
        return this.f176051j;
    }

    /* JADX INFO: renamed from: I */
    public boolean m192652I() {
        return this.f176051j > 0;
    }

    /* JADX INFO: renamed from: J */
    public void m192653J(@IntRange(from = 1) int i) {
        w11.m204365a(i > 0);
        this.f176052k = i;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, p153l.ah3
    /* JADX INFO: renamed from: i */
    public void mo9857i() {
        super.mo9857i();
        this.f176051j = 0;
    }
}
