package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.hls.playlist.C1963b;
import com.google.android.exoplayer2.source.hls.playlist.C1964c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.C2050d;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bod implements x2l {
    @Override // p149l.x2l
    /* JADX INFO: renamed from: a */
    public C2050d.a<w2l> mo102938a(C1964c c1964c, @Nullable C1963b c1963b) {
        return new HlsPlaylistParser(c1964c, c1963b);
    }

    @Override // p149l.x2l
    /* JADX INFO: renamed from: b */
    public C2050d.a<w2l> mo102939b() {
        return new HlsPlaylistParser();
    }
}
