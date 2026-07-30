package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import java.io.IOException;
import p149l.q2l;
import p149l.x2l;

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
    public interface InterfaceC1959a {
        /* JADX INFO: renamed from: a */
        HlsPlaylistTracker mo11201a(q2l q2lVar, InterfaceC2049c interfaceC2049c, x2l x2lVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b */
    public interface InterfaceC1960b {
        /* JADX INFO: renamed from: a */
        void mo11202a();

        /* JADX INFO: renamed from: b */
        boolean mo11203b(Uri uri, InterfaceC2049c.c cVar, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$c */
    public interface InterfaceC1961c {
        void onPrimaryPlaylistRefreshed(C1963b c1963b);
    }

    /* JADX INFO: renamed from: a */
    void mo11189a(InterfaceC1960b interfaceC1960b);

    /* JADX INFO: renamed from: b */
    long mo11190b();

    /* JADX INFO: renamed from: c */
    void mo11191c(Uri uri, InterfaceC1966j.a aVar, InterfaceC1961c interfaceC1961c);

    /* JADX INFO: renamed from: d */
    void mo11192d(Uri uri) throws IOException;

    @Nullable
    /* JADX INFO: renamed from: e */
    C1964c mo11193e();

    /* JADX INFO: renamed from: f */
    void mo11194f(Uri uri);

    /* JADX INFO: renamed from: g */
    void mo11195g(InterfaceC1960b interfaceC1960b);

    /* JADX INFO: renamed from: h */
    boolean mo11196h(Uri uri);

    /* JADX INFO: renamed from: i */
    boolean mo11197i();

    /* JADX INFO: renamed from: j */
    boolean mo11198j(Uri uri, long j);

    /* JADX INFO: renamed from: k */
    void mo11199k() throws IOException;

    @Nullable
    /* JADX INFO: renamed from: l */
    C1963b mo11200l(Uri uri, boolean z);

    void stop();
}
