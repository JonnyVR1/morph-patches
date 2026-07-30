package p153l;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class o5l implements xwd0 {

    /* JADX INFO: renamed from: a */
    public final int f145088a;

    /* JADX INFO: renamed from: b */
    public final s5l f145089b;

    /* JADX INFO: renamed from: c */
    public int f145090c = -1;

    public o5l(s5l s5lVar, int i) {
        this.f145089b = s5lVar;
        this.f145088a = i;
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: a */
    public void mo10993a() throws IOException {
        int i = this.f145090c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.f145089b.m184721m().m125387b(this.f145088a).m115519c(0).f7785l);
        }
        if (i == -1) {
            this.f145089b.m184702T();
        } else if (i != -3) {
            this.f145089b.m184703U(i);
        }
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: b */
    public boolean mo10994b() {
        if (this.f145090c != -3) {
            return m166160d() && this.f145089b.m184699P(this.f145090c);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m166159c() {
        w11.m204365a(this.f145090c == -1);
        this.f145090c = this.f145089b.m184729x(this.f145088a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m166160d() {
        int i = this.f145090c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m166161e() {
        if (this.f145090c != -1) {
            this.f145089b.m184724o0(this.f145088a);
            this.f145090c = -1;
        }
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: k */
    public int mo10996k(long j) {
        if (m166160d()) {
            return this.f145089b.m184723n0(this.f145090c, j);
        }
        return 0;
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: l */
    public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (this.f145090c == -3) {
            decoderInputBuffer.m97774h(4);
            return -4;
        }
        if (m166160d()) {
            return this.f145089b.m184712d0(this.f145090c, p1jVar, decoderInputBuffer, i);
        }
        return -3;
    }
}
