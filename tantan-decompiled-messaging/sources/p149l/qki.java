package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.C1963b;
import com.google.android.exoplayer2.source.hls.playlist.C1964c;
import com.google.android.exoplayer2.upstream.C2050d;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qki implements x2l {

    /* JADX INFO: renamed from: a */
    public final x2l f155128a;

    /* JADX INFO: renamed from: b */
    public final List<StreamKey> f155129b;

    public qki(x2l x2lVar, List<StreamKey> list) {
        this.f155128a = x2lVar;
        this.f155129b = list;
    }

    @Override // p149l.x2l
    /* JADX INFO: renamed from: a */
    public C2050d.a<w2l> mo102938a(C1964c c1964c, @Nullable C1963b c1963b) {
        return new rki(this.f155128a.mo102938a(c1964c, c1963b), this.f155129b);
    }

    @Override // p149l.x2l
    /* JADX INFO: renamed from: b */
    public C2050d.a<w2l> mo102939b() {
        return new rki(this.f155128a.mo102939b(), this.f155129b);
    }
}
