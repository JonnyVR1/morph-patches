package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.common.collect.ImmutableList;
import com.tencent.liteav.TXLiteAVCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
@Deprecated
public final class ayx implements hk0, he80.InterfaceC17443a {

    /* JADX INFO: renamed from: A */
    public boolean f74025A;

    /* JADX INFO: renamed from: a */
    public final Context f74026a;

    /* JADX INFO: renamed from: b */
    public final he80 f74027b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f74028c;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f74034i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PlaybackMetrics.Builder f74035j;

    /* JADX INFO: renamed from: k */
    public int f74036k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public PlaybackException f74039n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public C15863b f74040o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public C15863b f74041p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public C15863b f74042q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public C1894k f74043r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public C1894k f74044s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public C1894k f74045t;

    /* JADX INFO: renamed from: u */
    public boolean f74046u;

    /* JADX INFO: renamed from: v */
    public int f74047v;

    /* JADX INFO: renamed from: w */
    public boolean f74048w;

    /* JADX INFO: renamed from: x */
    public int f74049x;

    /* JADX INFO: renamed from: y */
    public int f74050y;

    /* JADX INFO: renamed from: z */
    public int f74051z;

    /* JADX INFO: renamed from: e */
    public final AbstractC1857c0.d f74030e = new AbstractC1857c0.d();

    /* JADX INFO: renamed from: f */
    public final AbstractC1857c0.b f74031f = new AbstractC1857c0.b();

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f74033h = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final HashMap<String, Long> f74032g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final long f74029d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f74037l = 0;

    /* JADX INFO: renamed from: m */
    public int f74038m = 0;

    /* JADX INFO: renamed from: l.ayx$a */
    public static final class C15862a {

        /* JADX INFO: renamed from: a */
        public final int f74052a;

        /* JADX INFO: renamed from: b */
        public final int f74053b;

        public C15862a(int i, int i2) {
            this.f74052a = i;
            this.f74053b = i2;
        }
    }

    /* JADX INFO: renamed from: l.ayx$b */
    public static final class C15863b {

        /* JADX INFO: renamed from: a */
        public final C1894k f74054a;

        /* JADX INFO: renamed from: b */
        public final int f74055b;

        /* JADX INFO: renamed from: c */
        public final String f74056c;

        public C15863b(C1894k c1894k, int i, String str) {
            this.f74054a = c1894k;
            this.f74055b = i;
            this.f74056c = str;
        }
    }

    public ayx(Context context, PlaybackSession playbackSession) {
        this.f74026a = context.getApplicationContext();
        this.f74028c = playbackSession;
        krd krdVar = new krd();
        this.f74027b = krdVar;
        krdVar.mo134623b(this);
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: B0 */
    public static int m100934B0(int i) {
        switch (bmk0.m105111X(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public static DrmInitData m100935C0(ImmutableList<C1861d0.a> immutableList) {
        DrmInitData drmInitData;
        gyj0<C1861d0.a> it = immutableList.iterator();
        while (it.hasNext()) {
            C1861d0.a next = it.next();
            for (int i = 0; i < next.f7406a; i++) {
                if (next.m9853h(i) && (drmInitData = next.m9848c(i).f7788o) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static int m100936D0(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            UUID uuid = drmInitData.m9953e(i).uuid;
            if (uuid.equals(zr3.f205732d)) {
                return 3;
            }
            if (uuid.equals(zr3.f205733e)) {
                return 2;
            }
            if (uuid.equals(zr3.f205731c)) {
                return 6;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E0 */
    public static C15862a m100937E0(PlaybackException playbackException, Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new C15862a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) w11.m204369e(playbackException.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new C15862a(35, 0);
            }
            if (z2 && i == 3) {
                return new C15862a(15, 0);
            }
            if (z2 && i == 2) {
                return new C15862a(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new C15862a(13, bmk0.m105113Y(((MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new C15862a(14, bmk0.m105113Y(((MediaCodecDecoderException) th).diagnosticInfo));
            }
            if (th instanceof OutOfMemoryError) {
                return new C15862a(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new C15862a(17, ((AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof AudioSink.WriteException) {
                return new C15862a(18, ((AudioSink.WriteException) th).errorCode);
            }
            if (bmk0.f77313a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new C15862a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C15862a(m100934B0(errorCode), errorCode);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            return new C15862a(5, ((HttpDataSource$InvalidResponseCodeException) th).responseCode);
        }
        if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
            return new C15862a(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof HttpDataSource$HttpDataSourceException;
        if (z3 || (th instanceof UdpDataSource.UdpDataSourceException)) {
            if (NetworkTypeObserver.m12195d(context).m12198f() == 1) {
                return new C15862a(3, 0);
            }
            Throwable cause = th.getCause();
            if (cause instanceof UnknownHostException) {
                return new C15862a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new C15862a(7, 0);
            }
            return (z3 && ((HttpDataSource$HttpDataSourceException) th).type == 1) ? new C15862a(4, 0) : new C15862a(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new C15862a(21, 0);
        }
        if (!(th instanceof DrmSession.DrmSessionException)) {
            if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
                return new C15862a(9, 0);
            }
            Throwable cause2 = ((Throwable) w11.m204369e(th.getCause())).getCause();
            return (bmk0.f77313a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new C15862a(32, 0) : new C15862a(31, 0);
        }
        Throwable th2 = (Throwable) w11.m204369e(th.getCause());
        int i2 = bmk0.f77313a;
        if (i2 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
            int iM105113Y = bmk0.m105113Y(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new C15862a(m100934B0(iM105113Y), iM105113Y);
        }
        if (i2 >= 23 && (th2 instanceof MediaDrmResetException)) {
            return new C15862a(27, 0);
        }
        if (i2 >= 18 && (th2 instanceof NotProvisionedException)) {
            return new C15862a(24, 0);
        }
        if (i2 >= 18 && (th2 instanceof DeniedByServerException)) {
            return new C15862a(29, 0);
        }
        if (th2 instanceof UnsupportedDrmException) {
            return new C15862a(23, 0);
        }
        return th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new C15862a(28, 0) : new C15862a(30, 0);
    }

    /* JADX INFO: renamed from: F0 */
    public static Pair<String, String> m100938F0(String str) {
        String[] strArrM105119a1 = bmk0.m105119a1(str, "-");
        return Pair.create(strArrM105119a1[0], strArrM105119a1.length >= 2 ? strArrM105119a1[1] : null);
    }

    /* JADX INFO: renamed from: H0 */
    public static int m100939H0(Context context) {
        switch (NetworkTypeObserver.m12195d(context).m12198f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static int m100940I0(C1944n c1944n) {
        C1944n.h hVar = c1944n.f7997b;
        if (hVar == null) {
            return 0;
        }
        int iM105177x0 = bmk0.m105177x0(hVar.f8094a, hVar.f8095b);
        if (iM105177x0 == 0) {
            return 3;
        }
        if (iM105177x0 != 1) {
            return iM105177x0 != 2 ? 1 : 4;
        }
        return 5;
    }

    /* JADX INFO: renamed from: J0 */
    public static int m100941J0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public static ayx m100942z0(Context context) {
        MediaMetricsManager mediaMetricsManagerM203891a = vxx.m203891a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM203891a == null) {
            return null;
        }
        return new ayx(context, mediaMetricsManagerM203891a.createPlaybackSession());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m100943A0() {
        PlaybackMetrics.Builder builder = this.f74035j;
        if (builder != null && this.f74025A) {
            builder.setAudioUnderrunCount(this.f74051z);
            this.f74035j.setVideoFramesDropped(this.f74049x);
            this.f74035j.setVideoFramesPlayed(this.f74050y);
            Long l2 = this.f74032g.get(this.f74034i);
            this.f74035j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = this.f74033h.get(this.f74034i);
            this.f74035j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f74035j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f74028c.reportPlaybackMetrics(this.f74035j.build());
        }
        this.f74035j = null;
        this.f74034i = null;
        this.f74051z = 0;
        this.f74049x = 0;
        this.f74050y = 0;
        this.f74043r = null;
        this.f74044s = null;
        this.f74045t = null;
        this.f74025A = false;
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: B */
    public void mo100944B(hk0.C17480a c17480a, jid jidVar) {
        this.f74049x += jidVar.f121069g;
        this.f74050y += jidVar.f121067e;
    }

    /* JADX INFO: renamed from: G0 */
    public LogSessionId m100945G0() {
        return this.f74028c.getSessionId();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m100946K0(hk0.C17481b c17481b) {
        for (int i = 0; i < c17481b.m135607d(); i++) {
            int iM135605b = c17481b.m135605b(i);
            hk0.C17480a c17480aM135606c = c17481b.m135606c(iM135605b);
            if (iM135605b == 0) {
                this.f74027b.mo134624c(c17480aM135606c);
            } else {
                he80 he80Var = this.f74027b;
                if (iM135605b == 11) {
                    he80Var.mo134622a(c17480aM135606c, this.f74036k);
                } else {
                    he80Var.mo134627f(c17480aM135606c);
                }
            }
        }
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: L */
    public void mo100947L(hk0.C17480a c17480a, mtv mtvVar, ktx ktxVar, IOException iOException, boolean z) {
        this.f74047v = ktxVar.f128764a;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m100948L0(long j) {
        int iM100939H0 = m100939H0(this.f74026a);
        if (iM100939H0 != this.f74038m) {
            this.f74038m = iM100939H0;
            this.f74028c.reportNetworkEvent(gxx.m132927a().setNetworkType(iM100939H0).setTimeSinceCreatedMillis(j - this.f74029d).build());
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m100950M0(long j) {
        PlaybackException playbackException = this.f74039n;
        if (playbackException == null) {
            return;
        }
        C15862a c15862aM100937E0 = m100937E0(playbackException, this.f74026a, this.f74047v == 4);
        this.f74028c.reportPlaybackErrorEvent(kwx.m151745a().setTimeSinceCreatedMillis(j - this.f74029d).setErrorCode(c15862aM100937E0.f74052a).setSubErrorCode(c15862aM100937E0.f74053b).setException(playbackException).build());
        this.f74025A = true;
        this.f74039n = null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m100951N0(InterfaceC2026t interfaceC2026t, hk0.C17481b c17481b, long j) {
        if (interfaceC2026t.getPlaybackState() != 2) {
            this.f74046u = false;
        }
        if (interfaceC2026t.getPlayerError() == null) {
            this.f74048w = false;
        } else if (c17481b.m135604a(10)) {
            this.f74048w = true;
        }
        int iM100961V0 = m100961V0(interfaceC2026t);
        if (this.f74037l != iM100961V0) {
            this.f74037l = iM100961V0;
            this.f74025A = true;
            this.f74028c.reportPlaybackStateEvent(zvx.m221826a().setState(this.f74037l).setTimeSinceCreatedMillis(j - this.f74029d).build());
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m100952O0(InterfaceC2026t interfaceC2026t, hk0.C17481b c17481b, long j) {
        if (c17481b.m135604a(2)) {
            C1861d0 currentTracks = interfaceC2026t.getCurrentTracks();
            boolean zM9843d = currentTracks.m9843d(2);
            boolean zM9843d2 = currentTracks.m9843d(1);
            boolean zM9843d3 = currentTracks.m9843d(3);
            if (zM9843d || zM9843d2 || zM9843d3) {
                if (!zM9843d) {
                    m100958T0(j, null, 0);
                }
                if (!zM9843d2) {
                    m100953P0(j, null, 0);
                }
                if (!zM9843d3) {
                    m100955R0(j, null, 0);
                }
            }
        }
        if (m100969y0(this.f74040o)) {
            C15863b c15863b = this.f74040o;
            C1894k c1894k = c15863b.f74054a;
            if (c1894k.f7791r != -1) {
                m100958T0(j, c1894k, c15863b.f74055b);
                this.f74040o = null;
            }
        }
        if (m100969y0(this.f74041p)) {
            C15863b c15863b2 = this.f74041p;
            m100953P0(j, c15863b2.f74054a, c15863b2.f74055b);
            this.f74041p = null;
        }
        if (m100969y0(this.f74042q)) {
            C15863b c15863b3 = this.f74042q;
            m100955R0(j, c15863b3.f74054a, c15863b3.f74055b);
            this.f74042q = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m100953P0(long j, @Nullable C1894k c1894k, int i) {
        if (bmk0.m105123c(this.f74044s, c1894k)) {
            return;
        }
        if (this.f74044s == null && i == 0) {
            i = 1;
        }
        this.f74044s = c1894k;
        m100959U0(0, j, c1894k, i);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m100954Q0(InterfaceC2026t interfaceC2026t, hk0.C17481b c17481b) {
        DrmInitData drmInitDataM100935C0;
        if (c17481b.m135604a(0)) {
            hk0.C17480a c17480aM135606c = c17481b.m135606c(0);
            if (this.f74035j != null) {
                m100957S0(c17480aM135606c.f110348b, c17480aM135606c.f110350d);
            }
        }
        if (c17481b.m135604a(2) && this.f74035j != null && (drmInitDataM100935C0 = m100935C0(interfaceC2026t.getCurrentTracks().m9841b())) != null) {
            bwx.m106812a(bmk0.m105144j(this.f74035j)).setDrmType(m100936D0(drmInitDataM100935C0));
        }
        if (c17481b.m135604a(1011)) {
            this.f74051z++;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m100955R0(long j, @Nullable C1894k c1894k, int i) {
        if (bmk0.m105123c(this.f74045t, c1894k)) {
            return;
        }
        if (this.f74045t == null && i == 0) {
            i = 1;
        }
        this.f74045t = c1894k;
        m100959U0(2, j, c1894k, i);
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: S */
    public void mo100956S(hk0.C17480a c17480a, PlaybackException playbackException) {
        this.f74039n = playbackException;
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: S0 */
    public final void m100957S0(AbstractC1857c0 abstractC1857c0, @Nullable InterfaceC1988i.b bVar) {
        int iMo9450f;
        PlaybackMetrics.Builder builder = this.f74035j;
        if (bVar == null || (iMo9450f = abstractC1857c0.mo9450f(bVar.f101422a)) == -1) {
            return;
        }
        abstractC1857c0.m9770j(iMo9450f, this.f74031f);
        abstractC1857c0.m9774r(this.f74031f.f7339c, this.f74030e);
        builder.setStreamType(m100940I0(this.f74030e.f7367c));
        AbstractC1857c0.d dVar = this.f74030e;
        if (dVar.f7378n != -9223372036854775807L && !dVar.f7376l && !dVar.f7373i && !dVar.m9808h()) {
            builder.setMediaDurationMillis(this.f74030e.m9806f());
        }
        builder.setPlaybackType(this.f74030e.m9808h() ? 2 : 1);
        this.f74025A = true;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m100958T0(long j, @Nullable C1894k c1894k, int i) {
        if (bmk0.m105123c(this.f74043r, c1894k)) {
            return;
        }
        if (this.f74043r == null && i == 0) {
            i = 1;
        }
        this.f74043r = c1894k;
        m100959U0(1, j, c1894k, i);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m100959U0(int i, long j, @Nullable C1894k c1894k, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = vwx.m203821a(i).setTimeSinceCreatedMillis(j - this.f74029d);
        if (c1894k != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m100941J0(i2));
            String str = c1894k.f7784k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1894k.f7785l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1894k.f7782i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c1894k.f7781h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c1894k.f7790q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c1894k.f7791r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c1894k.f7798y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c1894k.f7799z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c1894k.f7776c;
            if (str4 != null) {
                Pair<String, String> pairM100938F0 = m100938F0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairM100938F0.first);
                Object obj = pairM100938F0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c1894k.f7792s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f74025A = true;
        this.f74028c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* JADX INFO: renamed from: V0 */
    public final int m100961V0(InterfaceC2026t interfaceC2026t) {
        int playbackState = interfaceC2026t.getPlaybackState();
        if (this.f74046u) {
            return 5;
        }
        if (this.f74048w) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.f74037l;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (interfaceC2026t.getPlayWhenReady()) {
                return interfaceC2026t.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (interfaceC2026t.getPlayWhenReady()) {
                return interfaceC2026t.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f74037l == 0) {
            return this.f74037l;
        }
        return 12;
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: b0 */
    public void mo100962b0(hk0.C17480a c17480a, InterfaceC2026t.e eVar, InterfaceC2026t.e eVar2, int i) {
        if (i == 1) {
            this.f74046u = true;
        }
        this.f74036k = i;
    }

    @Override // p153l.he80.InterfaceC17443a
    /* JADX INFO: renamed from: d */
    public void mo100963d(hk0.C17480a c17480a, String str) {
        InterfaceC1988i.b bVar = c17480a.f110350d;
        if (bVar == null || !bVar.m128142b()) {
            m100943A0();
            this.f74034i = str;
            this.f74035j = rxx.m183570a().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
            m100957S0(c17480a.f110348b, c17480a.f110350d);
        }
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: j */
    public void mo100964j(hk0.C17480a c17480a, zjl0 zjl0Var) {
        C15863b c15863b = this.f74040o;
        if (c15863b != null) {
            C1894k c1894k = c15863b.f74054a;
            if (c1894k.f7791r == -1) {
                this.f74040o = new C15863b(c1894k.m10336b().m10407n0(zjl0Var.f204682a).m10386S(zjl0Var.f204683b).m10374G(), c15863b.f74055b, c15863b.f74056c);
            }
        }
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: q */
    public void mo100965q(InterfaceC2026t interfaceC2026t, hk0.C17481b c17481b) {
        if (c17481b.m135607d() == 0) {
            return;
        }
        m100946K0(c17481b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m100954Q0(interfaceC2026t, c17481b);
        m100950M0(jElapsedRealtime);
        m100952O0(interfaceC2026t, c17481b, jElapsedRealtime);
        m100948L0(jElapsedRealtime);
        m100951N0(interfaceC2026t, c17481b, jElapsedRealtime);
        if (c17481b.m135604a(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC)) {
            this.f74027b.mo134625d(c17481b.m135606c(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC));
        }
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: u0 */
    public void mo100966u0(hk0.C17480a c17480a, int i, long j, long j2) {
        InterfaceC1988i.b bVar = c17480a.f110350d;
        if (bVar != null) {
            String strMo134628g = this.f74027b.mo134628g(c17480a.f110348b, (InterfaceC1988i.b) w11.m204369e(bVar));
            Long l2 = this.f74033h.get(strMo134628g);
            Long l3 = this.f74032g.get(strMo134628g);
            this.f74033h.put(strMo134628g, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            this.f74032g.put(strMo134628g, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p153l.hk0
    /* JADX INFO: renamed from: w */
    public void mo100967w(hk0.C17480a c17480a, ktx ktxVar) {
        if (c17480a.f110350d == null) {
            return;
        }
        C15863b c15863b = new C15863b((C1894k) w11.m204369e(ktxVar.f128766c), ktxVar.f128767d, this.f74027b.mo134628g(c17480a.f110348b, (InterfaceC1988i.b) w11.m204369e(c17480a.f110350d)));
        int i = ktxVar.f128765b;
        if (i != 0) {
            if (i == 1) {
                this.f74041p = c15863b;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f74042q = c15863b;
                return;
            }
        }
        this.f74040o = c15863b;
    }

    @Override // p153l.he80.InterfaceC17443a
    /* JADX INFO: renamed from: x */
    public void mo100968x(hk0.C17480a c17480a, String str, boolean z) {
        InterfaceC1988i.b bVar = c17480a.f110350d;
        if ((bVar == null || !bVar.m128142b()) && str.equals(this.f74034i)) {
            m100943A0();
        }
        this.f74032g.remove(str);
        this.f74033h.remove(str);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: y0 */
    public final boolean m100969y0(@Nullable C15863b c15863b) {
        return c15863b != null && c15863b.f74056c.equals(this.f74027b.mo134626e());
    }

    @Override // p153l.he80.InterfaceC17443a
    /* JADX INFO: renamed from: V */
    public void mo100960V(hk0.C17480a c17480a, String str) {
    }

    @Override // p153l.he80.InterfaceC17443a
    /* JADX INFO: renamed from: M */
    public void mo100949M(hk0.C17480a c17480a, String str, String str2) {
    }
}
