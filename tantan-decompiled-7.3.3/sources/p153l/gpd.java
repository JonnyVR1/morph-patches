package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.hls.playlist.C1986b;
import com.google.android.exoplayer2.source.hls.playlist.C1987c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.C2073d;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gpd implements n5l {
    @Override // p153l.n5l
    /* JADX INFO: renamed from: a */
    public C2073d.a<m5l> mo131252a(C1987c c1987c, @Nullable C1986b c1986b) {
        return new HlsPlaylistParser(c1987c, c1986b);
    }

    @Override // p153l.n5l
    /* JADX INFO: renamed from: b */
    public C2073d.a<m5l> mo131253b() {
        return new HlsPlaylistParser();
    }
}
