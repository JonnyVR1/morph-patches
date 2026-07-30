package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1860d;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hb4 extends AbstractC1860d {

    /* JADX INFO: renamed from: p */
    public final DecoderInputBuffer f108563p;

    /* JADX INFO: renamed from: q */
    public final ig60 f108564q;

    /* JADX INFO: renamed from: r */
    public long f108565r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public gb4 f108566s;

    /* JADX INFO: renamed from: t */
    public long f108567t;

    public hb4() {
        super(6);
        this.f108563p = new DecoderInputBuffer(1);
        this.f108564q = new ig60();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: L */
    public void mo9690L() {
        m134347Y();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: N */
    public void mo9692N(long j, boolean z) {
        this.f108567t = Long.MIN_VALUE;
        m134347Y();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: T */
    public void mo9825T(C1894k[] c1894kArr, long j, long j2) {
        this.f108565r = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public final float[] m134346X(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f108564q.m139806S(byteBuffer.array(), byteBuffer.limit());
        this.f108564q.m139808U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f108564q.m139831u());
        }
        return fArr;
    }

    /* JADX INFO: renamed from: Y */
    public final void m134347Y() {
        gb4 gb4Var = this.f108566s;
        if (gb4Var != null) {
            gb4Var.mo10186h();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: a */
    public int mo10438a(C1894k c1894k) {
        return "application/x-camera-motion".equals(c1894k.f7785l) ? InterfaceC2090y.m12266v(4) : InterfaceC2090y.m12266v(0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: b */
    public boolean mo9707b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: c */
    public boolean mo9708c() {
        return mo9829d();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d, com.google.android.exoplayer2.C2027u.b
    /* JADX INFO: renamed from: f */
    public void mo9709f(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.f108566s = (gb4) obj;
        } else {
            super.mo9709f(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x, com.google.android.exoplayer2.InterfaceC2090y
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: j */
    public void mo10447j(long j, long j2) {
        while (!mo9829d() && this.f108567t < 100000 + j) {
            this.f108563p.mo9857i();
            if (m9826U(m9819G(), this.f108563p, 0) != -4 || this.f108563p.m97779p()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f108563p;
            this.f108567t = decoderInputBuffer.f7414e;
            if (this.f108566s != null && !decoderInputBuffer.m97778o()) {
                this.f108563p.m9860w();
                float[] fArrM134346X = m134346X((ByteBuffer) bmk0.m105144j(this.f108563p.f7412c));
                if (fArrM134346X != null) {
                    ((gb4) bmk0.m105144j(this.f108566s)).mo10185e(this.f108567t - this.f108565r, fArrM134346X);
                }
            }
        }
    }
}
