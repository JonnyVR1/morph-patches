package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.C1986b;
import com.google.android.exoplayer2.source.hls.playlist.C1987c;
import com.google.android.exoplayer2.upstream.C2073d;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mni implements n5l {

    /* JADX INFO: renamed from: a */
    public final n5l f137701a;

    /* JADX INFO: renamed from: b */
    public final List<StreamKey> f137702b;

    public mni(n5l n5lVar, List<StreamKey> list) {
        this.f137701a = n5lVar;
        this.f137702b = list;
    }

    @Override // p153l.n5l
    /* JADX INFO: renamed from: a */
    public C2073d.a<m5l> mo131252a(C1987c c1987c, @Nullable C1986b c1986b) {
        return new nni(this.f137701a.mo131252a(c1987c, c1986b), this.f137702b);
    }

    @Override // p153l.n5l
    /* JADX INFO: renamed from: b */
    public C2073d.a<m5l> mo131253b() {
        return new nni(this.f137701a.mo131253b(), this.f137702b);
    }
}
