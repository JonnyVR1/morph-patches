package p149l;

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
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.source.InterfaceC1965i;
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
public final class dpx implements lk0, b680.InterfaceC15816a {

    /* JADX INFO: renamed from: A */
    public boolean f87327A;

    /* JADX INFO: renamed from: a */
    public final Context f87328a;

    /* JADX INFO: renamed from: b */
    public final b680 f87329b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f87330c;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f87336i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PlaybackMetrics.Builder f87337j;

    /* JADX INFO: renamed from: k */
    public int f87338k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public PlaybackException f87341n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public C16427b f87342o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public C16427b f87343p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public C16427b f87344q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public C1871k f87345r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public C1871k f87346s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public C1871k f87347t;

    /* JADX INFO: renamed from: u */
    public boolean f87348u;

    /* JADX INFO: renamed from: v */
    public int f87349v;

    /* JADX INFO: renamed from: w */
    public boolean f87350w;

    /* JADX INFO: renamed from: x */
    public int f87351x;

    /* JADX INFO: renamed from: y */
    public int f87352y;

    /* JADX INFO: renamed from: z */
    public int f87353z;

    /* JADX INFO: renamed from: e */
    public final AbstractC1834c0.d f87332e = new AbstractC1834c0.d();

    /* JADX INFO: renamed from: f */
    public final AbstractC1834c0.b f87333f = new AbstractC1834c0.b();

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f87335h = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final HashMap<String, Long> f87334g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final long f87331d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f87339l = 0;

    /* JADX INFO: renamed from: m */
    public int f87340m = 0;

    /* JADX INFO: renamed from: l.dpx$a */
    public static final class C16426a {

        /* JADX INFO: renamed from: a */
        public final int f87354a;

        /* JADX INFO: renamed from: b */
        public final int f87355b;

        public C16426a(int i, int i2) {
            this.f87354a = i;
            this.f87355b = i2;
        }
    }

    /* JADX INFO: renamed from: l.dpx$b */
    public static final class C16427b {

        /* JADX INFO: renamed from: a */
        public final C1871k f87356a;

        /* JADX INFO: renamed from: b */
        public final int f87357b;

        /* JADX INFO: renamed from: c */
        public final String f87358c;

        public C16427b(C1871k c1871k, int i, String str) {
            this.f87356a = c1871k;
            this.f87357b = i;
            this.f87358c = str;
        }
    }

    public dpx(Context context, PlaybackSession playbackSession) {
        this.f87328a = context.getApplicationContext();
        this.f87330c = playbackSession;
        tpd tpdVar = new tpd();
        this.f87329b = tpdVar;
        tpdVar.mo100392b(this);
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: B0 */
    public static int m112934B0(int i) {
        switch (vck0.m197833X(i)) {
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
    public static DrmInitData m112935C0(ImmutableList<C1838d0.a> immutableList) {
        DrmInitData drmInitData;
        dpj0<C1838d0.a> it = immutableList.iterator();
        while (it.hasNext()) {
            C1838d0.a next = it.next();
            for (int i = 0; i < next.f7369a; i++) {
                if (next.m9799h(i) && (drmInitData = next.m9794c(i).f7751o) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static int m112936D0(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            UUID uuid = drmInitData.m9899e(i).uuid;
            if (uuid.equals(ar3.f71231d)) {
                return 3;
            }
            if (uuid.equals(ar3.f71232e)) {
                return 2;
            }
            if (uuid.equals(ar3.f71230c)) {
                return 6;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E0 */
    public static C16426a m112937E0(PlaybackException playbackException, Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new C16426a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) p11.m167011e(playbackException.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new C16426a(35, 0);
            }
            if (z2 && i == 3) {
                return new C16426a(15, 0);
            }
            if (z2 && i == 2) {
                return new C16426a(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new C16426a(13, vck0.m197835Y(((MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new C16426a(14, vck0.m197835Y(((MediaCodecDecoderException) th).diagnosticInfo));
            }
            if (th instanceof OutOfMemoryError) {
                return new C16426a(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new C16426a(17, ((AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof AudioSink.WriteException) {
                return new C16426a(18, ((AudioSink.WriteException) th).errorCode);
            }
            if (vck0.f180948a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new C16426a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C16426a(m112934B0(errorCode), errorCode);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            return new C16426a(5, ((HttpDataSource$InvalidResponseCodeException) th).responseCode);
        }
        if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
            return new C16426a(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof HttpDataSource$HttpDataSourceException;
        if (z3 || (th instanceof UdpDataSource.UdpDataSourceException)) {
            if (NetworkTypeObserver.m12141d(context).m12144f() == 1) {
                return new C16426a(3, 0);
            }
            Throwable cause = th.getCause();
            if (cause instanceof UnknownHostException) {
                return new C16426a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new C16426a(7, 0);
            }
            return (z3 && ((HttpDataSource$HttpDataSourceException) th).type == 1) ? new C16426a(4, 0) : new C16426a(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new C16426a(21, 0);
        }
        if (!(th instanceof DrmSession.DrmSessionException)) {
            if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
                return new C16426a(9, 0);
            }
            Throwable cause2 = ((Throwable) p11.m167011e(th.getCause())).getCause();
            return (vck0.f180948a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new C16426a(32, 0) : new C16426a(31, 0);
        }
        Throwable th2 = (Throwable) p11.m167011e(th.getCause());
        int i2 = vck0.f180948a;
        if (i2 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
            int iM197835Y = vck0.m197835Y(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new C16426a(m112934B0(iM197835Y), iM197835Y);
        }
        if (i2 >= 23 && (th2 instanceof MediaDrmResetException)) {
            return new C16426a(27, 0);
        }
        if (i2 >= 18 && (th2 instanceof NotProvisionedException)) {
            return new C16426a(24, 0);
        }
        if (i2 >= 18 && (th2 instanceof DeniedByServerException)) {
            return new C16426a(29, 0);
        }
        if (th2 instanceof UnsupportedDrmException) {
            return new C16426a(23, 0);
        }
        return th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new C16426a(28, 0) : new C16426a(30, 0);
    }

    /* JADX INFO: renamed from: F0 */
    public static Pair<String, String> m112938F0(String str) {
        String[] strArrM197841a1 = vck0.m197841a1(str, "-");
        return Pair.create(strArrM197841a1[0], strArrM197841a1.length >= 2 ? strArrM197841a1[1] : null);
    }

    /* JADX INFO: renamed from: H0 */
    public static int m112939H0(Context context) {
        switch (NetworkTypeObserver.m12141d(context).m12144f()) {
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
    public static int m112940I0(C1921n c1921n) {
        C1921n.h hVar = c1921n.f7960b;
        if (hVar == null) {
            return 0;
        }
        int iM197899x0 = vck0.m197899x0(hVar.f8057a, hVar.f8058b);
        if (iM197899x0 == 0) {
            return 3;
        }
        if (iM197899x0 != 1) {
            return iM197899x0 != 2 ? 1 : 4;
        }
        return 5;
    }

    /* JADX INFO: renamed from: J0 */
    public static int m112941J0(int i) {
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
    public static dpx m112942z0(Context context) {
        MediaMetricsManager mediaMetricsManagerM215553a = yox.m215553a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM215553a == null) {
            return null;
        }
        return new dpx(context, mediaMetricsManagerM215553a.createPlaybackSession());
    }

    /* JADX INFO: renamed from: A0 */
    public final void m112943A0() {
        PlaybackMetrics.Builder builder = this.f87337j;
        if (builder != null && this.f87327A) {
            builder.setAudioUnderrunCount(this.f87353z);
            this.f87337j.setVideoFramesDropped(this.f87351x);
            this.f87337j.setVideoFramesPlayed(this.f87352y);
            Long l2 = this.f87334g.get(this.f87336i);
            this.f87337j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = this.f87335h.get(this.f87336i);
            this.f87337j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f87337j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f87330c.reportPlaybackMetrics(this.f87337j.build());
        }
        this.f87337j = null;
        this.f87336i = null;
        this.f87353z = 0;
        this.f87351x = 0;
        this.f87352y = 0;
        this.f87345r = null;
        this.f87346s = null;
        this.f87347t = null;
        this.f87327A = false;
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: B */
    public void mo112944B(lk0.C18238a c18238a, dhd dhdVar) {
        this.f87351x += dhdVar.f86268g;
        this.f87352y += dhdVar.f86266e;
    }

    /* JADX INFO: renamed from: G0 */
    public LogSessionId m112945G0() {
        return this.f87330c.getSessionId();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m112946K0(lk0.C18239b c18239b) {
        for (int i = 0; i < c18239b.m150122d(); i++) {
            int iM150120b = c18239b.m150120b(i);
            lk0.C18238a c18238aM150121c = c18239b.m150121c(iM150120b);
            if (iM150120b == 0) {
                this.f87329b.mo100393c(c18238aM150121c);
            } else {
                b680 b680Var = this.f87329b;
                if (iM150120b == 11) {
                    b680Var.mo100391a(c18238aM150121c, this.f87338k);
                } else {
                    b680Var.mo100396f(c18238aM150121c);
                }
            }
        }
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: L */
    public void mo112947L(lk0.C18238a c18238a, lrv lrvVar, nkx nkxVar, IOException iOException, boolean z) {
        this.f87349v = nkxVar.f139481a;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m112948L0(long j) {
        int iM112939H0 = m112939H0(this.f87328a);
        if (iM112939H0 != this.f87340m) {
            this.f87340m = iM112939H0;
            this.f87330c.reportNetworkEvent(jox.m142536a().setNetworkType(iM112939H0).setTimeSinceCreatedMillis(j - this.f87331d).build());
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m112949M0(long j) {
        PlaybackException playbackException = this.f87341n;
        if (playbackException == null) {
            return;
        }
        C16426a c16426aM112937E0 = m112937E0(playbackException, this.f87328a, this.f87349v == 4);
        this.f87330c.reportPlaybackErrorEvent(nnx.m160375a().setTimeSinceCreatedMillis(j - this.f87331d).setErrorCode(c16426aM112937E0.f87354a).setSubErrorCode(c16426aM112937E0.f87355b).setException(playbackException).build());
        this.f87327A = true;
        this.f87341n = null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m112950N0(InterfaceC2003t interfaceC2003t, lk0.C18239b c18239b, long j) {
        if (interfaceC2003t.getPlaybackState() != 2) {
            this.f87348u = false;
        }
        if (interfaceC2003t.getPlayerError() == null) {
            this.f87350w = false;
        } else if (c18239b.m150119a(10)) {
            this.f87350w = true;
        }
        int iM112959V0 = m112959V0(interfaceC2003t);
        if (this.f87339l != iM112959V0) {
            this.f87339l = iM112959V0;
            this.f87327A = true;
            this.f87330c.reportPlaybackStateEvent(cnx.m107836a().setState(this.f87339l).setTimeSinceCreatedMillis(j - this.f87331d).build());
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m112951O0(InterfaceC2003t interfaceC2003t, lk0.C18239b c18239b, long j) {
        if (c18239b.m150119a(2)) {
            C1838d0 currentTracks = interfaceC2003t.getCurrentTracks();
            boolean zM9789d = currentTracks.m9789d(2);
            boolean zM9789d2 = currentTracks.m9789d(1);
            boolean zM9789d3 = currentTracks.m9789d(3);
            if (zM9789d || zM9789d2 || zM9789d3) {
                if (!zM9789d) {
                    m112957T0(j, null, 0);
                }
                if (!zM9789d2) {
                    m112952P0(j, null, 0);
                }
                if (!zM9789d3) {
                    m112954R0(j, null, 0);
                }
            }
        }
        if (m112965y0(this.f87342o)) {
            C16427b c16427b = this.f87342o;
            C1871k c1871k = c16427b.f87356a;
            if (c1871k.f7754r != -1) {
                m112957T0(j, c1871k, c16427b.f87357b);
                this.f87342o = null;
            }
        }
        if (m112965y0(this.f87343p)) {
            C16427b c16427b2 = this.f87343p;
            m112952P0(j, c16427b2.f87356a, c16427b2.f87357b);
            this.f87343p = null;
        }
        if (m112965y0(this.f87344q)) {
            C16427b c16427b3 = this.f87344q;
            m112954R0(j, c16427b3.f87356a, c16427b3.f87357b);
            this.f87344q = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m112952P0(long j, @Nullable C1871k c1871k, int i) {
        if (vck0.m197845c(this.f87346s, c1871k)) {
            return;
        }
        if (this.f87346s == null && i == 0) {
            i = 1;
        }
        this.f87346s = c1871k;
        m112958U0(0, j, c1871k, i);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m112953Q0(InterfaceC2003t interfaceC2003t, lk0.C18239b c18239b) {
        DrmInitData drmInitDataM112935C0;
        if (c18239b.m150119a(0)) {
            lk0.C18238a c18238aM150121c = c18239b.m150121c(0);
            if (this.f87337j != null) {
                m112956S0(c18238aM150121c.f128430b, c18238aM150121c.f128432d);
            }
        }
        if (c18239b.m150119a(2) && this.f87337j != null && (drmInitDataM112935C0 = m112935C0(interfaceC2003t.getCurrentTracks().m9787b())) != null) {
            enx.m117299a(vck0.m197866j(this.f87337j)).setDrmType(m112936D0(drmInitDataM112935C0));
        }
        if (c18239b.m150119a(1011)) {
            this.f87353z++;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m112954R0(long j, @Nullable C1871k c1871k, int i) {
        if (vck0.m197845c(this.f87347t, c1871k)) {
            return;
        }
        if (this.f87347t == null && i == 0) {
            i = 1;
        }
        this.f87347t = c1871k;
        m112958U0(2, j, c1871k, i);
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: S */
    public void mo112955S(lk0.C18238a c18238a, PlaybackException playbackException) {
        this.f87341n = playbackException;
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: S0 */
    public final void m112956S0(AbstractC1834c0 abstractC1834c0, @Nullable InterfaceC1965i.b bVar) {
        int iMo9396f;
        PlaybackMetrics.Builder builder = this.f87337j;
        if (bVar == null || (iMo9396f = abstractC1834c0.mo9396f(bVar.f114355a)) == -1) {
            return;
        }
        abstractC1834c0.m9716j(iMo9396f, this.f87333f);
        abstractC1834c0.m9720r(this.f87333f.f7302c, this.f87332e);
        builder.setStreamType(m112940I0(this.f87332e.f7330c));
        AbstractC1834c0.d dVar = this.f87332e;
        if (dVar.f7341n != -9223372036854775807L && !dVar.f7339l && !dVar.f7336i && !dVar.m9754h()) {
            builder.setMediaDurationMillis(this.f87332e.m9752f());
        }
        builder.setPlaybackType(this.f87332e.m9754h() ? 2 : 1);
        this.f87327A = true;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m112957T0(long j, @Nullable C1871k c1871k, int i) {
        if (vck0.m197845c(this.f87345r, c1871k)) {
            return;
        }
        if (this.f87345r == null && i == 0) {
            i = 1;
        }
        this.f87345r = c1871k;
        m112958U0(1, j, c1871k, i);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m112958U0(int i, long j, @Nullable C1871k c1871k, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = ynx.m215471a(i).setTimeSinceCreatedMillis(j - this.f87331d);
        if (c1871k != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m112941J0(i2));
            String str = c1871k.f7747k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1871k.f7748l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1871k.f7745i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c1871k.f7744h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c1871k.f7753q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c1871k.f7754r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c1871k.f7761y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c1871k.f7762z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c1871k.f7739c;
            if (str4 != null) {
                Pair<String, String> pairM112938F0 = m112938F0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairM112938F0.first);
                Object obj = pairM112938F0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c1871k.f7755s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f87327A = true;
        this.f87330c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* JADX INFO: renamed from: V0 */
    public final int m112959V0(InterfaceC2003t interfaceC2003t) {
        int playbackState = interfaceC2003t.getPlaybackState();
        if (this.f87348u) {
            return 5;
        }
        if (this.f87350w) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.f87339l;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (interfaceC2003t.getPlayWhenReady()) {
                return interfaceC2003t.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (interfaceC2003t.getPlayWhenReady()) {
                return interfaceC2003t.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f87339l == 0) {
            return this.f87339l;
        }
        return 12;
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: b0 */
    public void mo112960b0(lk0.C18238a c18238a, InterfaceC2003t.e eVar, InterfaceC2003t.e eVar2, int i) {
        if (i == 1) {
            this.f87348u = true;
        }
        this.f87338k = i;
    }

    @Override // p149l.b680.InterfaceC15816a
    /* JADX INFO: renamed from: d */
    public void mo100400d(lk0.C18238a c18238a, String str) {
        InterfaceC1965i.b bVar = c18238a.f128432d;
        if (bVar == null || !bVar.m137607b()) {
            m112943A0();
            this.f87336i = str;
            this.f87337j = uox.m194570a().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
            m112956S0(c18238a.f128430b, c18238a.f128432d);
        }
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: j */
    public void mo112961j(lk0.C18238a c18238a, val0 val0Var) {
        C16427b c16427b = this.f87342o;
        if (c16427b != null) {
            C1871k c1871k = c16427b.f87356a;
            if (c1871k.f7754r == -1) {
                this.f87342o = new C16427b(c1871k.m10282b().m10353n0(val0Var.f180765a).m10332S(val0Var.f180766b).m10320G(), c16427b.f87357b, c16427b.f87358c);
            }
        }
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: q */
    public void mo112962q(InterfaceC2003t interfaceC2003t, lk0.C18239b c18239b) {
        if (c18239b.m150122d() == 0) {
            return;
        }
        m112946K0(c18239b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m112953Q0(interfaceC2003t, c18239b);
        m112949M0(jElapsedRealtime);
        m112951O0(interfaceC2003t, c18239b, jElapsedRealtime);
        m112948L0(jElapsedRealtime);
        m112950N0(interfaceC2003t, c18239b, jElapsedRealtime);
        if (c18239b.m150119a(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC)) {
            this.f87329b.mo100394d(c18239b.m150121c(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC));
        }
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: u0 */
    public void mo112963u0(lk0.C18238a c18238a, int i, long j, long j2) {
        InterfaceC1965i.b bVar = c18238a.f128432d;
        if (bVar != null) {
            String strMo100397g = this.f87329b.mo100397g(c18238a.f128430b, (InterfaceC1965i.b) p11.m167011e(bVar));
            Long l2 = this.f87335h.get(strMo100397g);
            Long l3 = this.f87334g.get(strMo100397g);
            this.f87335h.put(strMo100397g, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            this.f87334g.put(strMo100397g, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p149l.lk0
    /* JADX INFO: renamed from: w */
    public void mo112964w(lk0.C18238a c18238a, nkx nkxVar) {
        if (c18238a.f128432d == null) {
            return;
        }
        C16427b c16427b = new C16427b((C1871k) p11.m167011e(nkxVar.f139483c), nkxVar.f139484d, this.f87329b.mo100397g(c18238a.f128430b, (InterfaceC1965i.b) p11.m167011e(c18238a.f128432d)));
        int i = nkxVar.f139482b;
        if (i != 0) {
            if (i == 1) {
                this.f87343p = c16427b;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f87344q = c16427b;
                return;
            }
        }
        this.f87342o = c16427b;
    }

    @Override // p149l.b680.InterfaceC15816a
    /* JADX INFO: renamed from: x */
    public void mo100401x(lk0.C18238a c18238a, String str, boolean z) {
        InterfaceC1965i.b bVar = c18238a.f128432d;
        if ((bVar == null || !bVar.m137607b()) && str.equals(this.f87336i)) {
            m112943A0();
        }
        this.f87334g.remove(str);
        this.f87335h.remove(str);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: y0 */
    public final boolean m112965y0(@Nullable C16427b c16427b) {
        return c16427b != null && c16427b.f87358c.equals(this.f87329b.mo100395e());
    }

    @Override // p149l.b680.InterfaceC15816a
    /* JADX INFO: renamed from: V */
    public void mo100399V(lk0.C18238a c18238a, String str) {
    }

    @Override // p149l.b680.InterfaceC15816a
    /* JADX INFO: renamed from: M */
    public void mo100398M(lk0.C18238a c18238a, String str, String str2) {
    }
}
