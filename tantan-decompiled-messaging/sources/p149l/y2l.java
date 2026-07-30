package p149l;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class y2l implements vod0 {

    /* JADX INFO: renamed from: a */
    public final int f195623a;

    /* JADX INFO: renamed from: b */
    public final c3l f195624b;

    /* JADX INFO: renamed from: c */
    public int f195625c = -1;

    public y2l(c3l c3lVar, int i) {
        this.f195624b = c3lVar;
        this.f195623a = i;
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: a */
    public void mo10939a() throws IOException {
        int i = this.f195625c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.f195624b.m105073m().m100410b(this.f195623a).m217358c(0).f7748l);
        }
        if (i == -1) {
            this.f195624b.m105054T();
        } else if (i != -3) {
            this.f195624b.m105055U(i);
        }
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: b */
    public boolean mo10940b() {
        if (this.f195625c != -3) {
            return m212379d() && this.f195624b.m105051P(this.f195625c);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m212378c() {
        p11.m167007a(this.f195625c == -1);
        this.f195625c = this.f195624b.m105081x(this.f195623a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m212379d() {
        int i = this.f195625c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m212380e() {
        if (this.f195625c != -1) {
            this.f195624b.m105076o0(this.f195623a);
            this.f195625c = -1;
        }
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: k */
    public int mo10942k(long j) {
        if (m212379d()) {
            return this.f195624b.m105075n0(this.f195625c, j);
        }
        return 0;
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: l */
    public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (this.f195625c == -3) {
            decoderInputBuffer.m154490h(4);
            return -4;
        }
        if (m212379d()) {
            return this.f195624b.m105064d0(this.f195625c, uyiVar, decoderInputBuffer, i);
        }
        return -3;
    }
}
