package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1837d;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ia4 extends AbstractC1837d {

    /* JADX INFO: renamed from: p */
    public final DecoderInputBuffer f112278p;

    /* JADX INFO: renamed from: q */
    public final d860 f112279q;

    /* JADX INFO: renamed from: r */
    public long f112280r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public ha4 f112281s;

    /* JADX INFO: renamed from: t */
    public long f112282t;

    public ia4() {
        super(6);
        this.f112278p = new DecoderInputBuffer(1);
        this.f112279q = new d860();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: L */
    public void mo9636L() {
        m135127Y();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: N */
    public void mo9638N(long j, boolean z) {
        this.f112282t = Long.MIN_VALUE;
        m135127Y();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: T */
    public void mo9771T(C1871k[] c1871kArr, long j, long j2) {
        this.f112280r = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public final float[] m135126X(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f112279q.m110290S(byteBuffer.array(), byteBuffer.limit());
        this.f112279q.m110292U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f112279q.m110315u());
        }
        return fArr;
    }

    /* JADX INFO: renamed from: Y */
    public final void m135127Y() {
        ha4 ha4Var = this.f112281s;
        if (ha4Var != null) {
            ha4Var.mo10132h();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: a */
    public int mo10384a(C1871k c1871k) {
        return "application/x-camera-motion".equals(c1871k.f7748l) ? InterfaceC2067y.m12212v(4) : InterfaceC2067y.m12212v(0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: b */
    public boolean mo9653b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: c */
    public boolean mo9654c() {
        return mo9775d();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d, com.google.android.exoplayer2.C2004u.b
    /* JADX INFO: renamed from: f */
    public void mo9655f(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.f112281s = (ha4) obj;
        } else {
            super.mo9655f(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x, com.google.android.exoplayer2.InterfaceC2067y
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: j */
    public void mo10393j(long j, long j2) {
        while (!mo9775d() && this.f112282t < 100000 + j) {
            this.f112278p.mo9803i();
            if (m9772U(m9765G(), this.f112278p, 0) != -4 || this.f112278p.m154495p()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f112278p;
            this.f112282t = decoderInputBuffer.f7377e;
            if (this.f112281s != null && !decoderInputBuffer.m154494o()) {
                this.f112278p.m9806w();
                float[] fArrM135126X = m135126X((ByteBuffer) vck0.m197866j(this.f112278p.f7375c));
                if (fArrM135126X != null) {
                    ((ha4) vck0.m197866j(this.f112281s)).mo10131e(this.f112282t - this.f112280r, fArrM135126X);
                }
            }
        }
    }
}
