package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import java.io.IOException;
import p153l.g5l;
import p153l.n5l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a */
    public interface InterfaceC1982a {
        /* JADX INFO: renamed from: a */
        HlsPlaylistTracker mo11255a(g5l g5lVar, InterfaceC2072c interfaceC2072c, n5l n5lVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b */
    public interface InterfaceC1983b {
        /* JADX INFO: renamed from: a */
        void mo11256a();

        /* JADX INFO: renamed from: b */
        boolean mo11257b(Uri uri, InterfaceC2072c.c cVar, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$c */
    public interface InterfaceC1984c {
        void onPrimaryPlaylistRefreshed(C1986b c1986b);
    }

    /* JADX INFO: renamed from: a */
    void mo11243a(InterfaceC1983b interfaceC1983b);

    /* JADX INFO: renamed from: b */
    long mo11244b();

    /* JADX INFO: renamed from: c */
    void mo11245c(Uri uri, InterfaceC1989j.a aVar, InterfaceC1984c interfaceC1984c);

    /* JADX INFO: renamed from: d */
    void mo11246d(Uri uri) throws IOException;

    @Nullable
    /* JADX INFO: renamed from: e */
    C1987c mo11247e();

    /* JADX INFO: renamed from: f */
    void mo11248f(Uri uri);

    /* JADX INFO: renamed from: g */
    void mo11249g(InterfaceC1983b interfaceC1983b);

    /* JADX INFO: renamed from: h */
    boolean mo11250h(Uri uri);

    /* JADX INFO: renamed from: i */
    boolean mo11251i();

    /* JADX INFO: renamed from: j */
    boolean mo11252j(Uri uri, long j);

    /* JADX INFO: renamed from: k */
    void mo11253k() throws IOException;

    @Nullable
    /* JADX INFO: renamed from: l */
    C1986b mo11254l(Uri uri, boolean z);

    void stop();
}
