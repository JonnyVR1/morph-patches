package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1869i;
import com.google.android.exoplayer2.C1870j;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.audio.InterfaceC1820c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p149l.aji0;
import p149l.aor;
import p149l.b6j0;
import p149l.cvk;
import p149l.cxb;
import p149l.dhd;
import p149l.dpx;
import p149l.e5l0;
import p149l.erc0;
import p149l.f6q0;
import p149l.fd2;
import p149l.g0f0;
import p149l.ha4;
import p149l.hhd;
import p149l.hk0;
import p149l.ice0;
import p149l.j100;
import p149l.jwv;
import p149l.jxx;
import p149l.lk0;
import p149l.n8f;
import p149l.o8f;
import p149l.ohg0;
import p149l.p11;
import p149l.p95;
import p149l.pj1;
import p149l.qkq0;
import p149l.s6j0;
import p149l.sal0;
import p149l.sfp0;
import p149l.sif0;
import p149l.ss5;
import p149l.uoe;
import p149l.v680;
import p149l.val0;
import p149l.vck0;
import p149l.w3l0;
import p149l.w6j0;
import p149l.y6j0;
import p149l.ywb;
import p149l.z580;
import p149l.z6j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1869i extends AbstractC1833c implements ExoPlayer, ExoPlayer.InterfaceC1789a, ExoPlayer.InterfaceC1794f, ExoPlayer.InterfaceC1793e, ExoPlayer.InterfaceC1792d {

    /* JADX INFO: renamed from: A */
    public final C1831b f7540A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public final StreamVolumeManager f7541B;

    /* JADX INFO: renamed from: C */
    public final sfp0 f7542C;

    /* JADX INFO: renamed from: D */
    public final f6q0 f7543D;

    /* JADX INFO: renamed from: E */
    public final long f7544E;

    /* JADX INFO: renamed from: F */
    public int f7545F;

    /* JADX INFO: renamed from: G */
    public boolean f7546G;

    /* JADX INFO: renamed from: H */
    public int f7547H;

    /* JADX INFO: renamed from: I */
    public int f7548I;

    /* JADX INFO: renamed from: J */
    public boolean f7549J;

    /* JADX INFO: renamed from: K */
    public int f7550K;

    /* JADX INFO: renamed from: L */
    public boolean f7551L;

    /* JADX INFO: renamed from: M */
    public ice0 f7552M;

    /* JADX INFO: renamed from: N */
    public g0f0 f7553N;

    /* JADX INFO: renamed from: O */
    public boolean f7554O;

    /* JADX INFO: renamed from: P */
    public InterfaceC2003t.b f7555P;

    /* JADX INFO: renamed from: Q */
    public C1922o f7556Q;

    /* JADX INFO: renamed from: R */
    public C1922o f7557R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public C1871k f7558S;

    /* JADX INFO: renamed from: T */
    @Nullable
    public C1871k f7559T;

    /* JADX INFO: renamed from: U */
    @Nullable
    public AudioTrack f7560U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public Object f7561V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Surface f7562W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public SurfaceHolder f7563X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public SphericalGLSurfaceView f7564Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7565Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public TextureView f7566a0;

    /* JADX INFO: renamed from: b */
    public final z6j0 f7567b;

    /* JADX INFO: renamed from: b0 */
    public int f7568b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2003t.b f7569c;

    /* JADX INFO: renamed from: c0 */
    public int f7570c0;

    /* JADX INFO: renamed from: d */
    public final ss5 f7571d;

    /* JADX INFO: renamed from: d0 */
    public sif0 f7572d0;

    /* JADX INFO: renamed from: e */
    public final Context f7573e;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public dhd f7574e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2003t f7575f;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public dhd f7576f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2066x[] f7577g;

    /* JADX INFO: renamed from: g0 */
    public int f7578g0;

    /* JADX INFO: renamed from: h */
    public final y6j0 f7579h;

    /* JADX INFO: renamed from: h0 */
    public C1818a f7580h0;

    /* JADX INFO: renamed from: i */
    public final cvk f7581i;

    /* JADX INFO: renamed from: i0 */
    public float f7582i0;

    /* JADX INFO: renamed from: j */
    public final C1870j.f f7583j;

    /* JADX INFO: renamed from: j0 */
    public boolean f7584j0;

    /* JADX INFO: renamed from: k */
    public final C1870j f7585k;

    /* JADX INFO: renamed from: k0 */
    public cxb f7586k0;

    /* JADX INFO: renamed from: l */
    public final aor<InterfaceC2003t.d> f7587l;

    /* JADX INFO: renamed from: l0 */
    @Nullable
    public e5l0 f7588l0;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArraySet<ExoPlayer.InterfaceC1790b> f7589m;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public ha4 f7590m0;

    /* JADX INFO: renamed from: n */
    public final AbstractC1834c0.b f7591n;

    /* JADX INFO: renamed from: n0 */
    public boolean f7592n0;

    /* JADX INFO: renamed from: o */
    public final List<e> f7593o;

    /* JADX INFO: renamed from: o0 */
    public boolean f7594o0;

    /* JADX INFO: renamed from: p */
    public final boolean f7595p;

    /* JADX INFO: renamed from: p0 */
    @Nullable
    public PriorityTaskManager f7596p0;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1965i.a f7597q;

    /* JADX INFO: renamed from: q0 */
    public boolean f7598q0;

    /* JADX INFO: renamed from: r */
    public final hk0 f7599r;

    /* JADX INFO: renamed from: r0 */
    public boolean f7600r0;

    /* JADX INFO: renamed from: s */
    public final Looper f7601s;

    /* JADX INFO: renamed from: s0 */
    public C1868h f7602s0;

    /* JADX INFO: renamed from: t */
    public final fd2 f7603t;

    /* JADX INFO: renamed from: t0 */
    public val0 f7604t0;

    /* JADX INFO: renamed from: u */
    public final long f7605u;

    /* JADX INFO: renamed from: u0 */
    public C1922o f7606u0;

    /* JADX INFO: renamed from: v */
    public final long f7607v;

    /* JADX INFO: renamed from: v0 */
    public z580 f7608v0;

    /* JADX INFO: renamed from: w */
    public final p95 f7609w;

    /* JADX INFO: renamed from: w0 */
    public int f7610w0;

    /* JADX INFO: renamed from: x */
    public final c f7611x;

    /* JADX INFO: renamed from: x0 */
    public int f7612x0;

    /* JADX INFO: renamed from: y */
    public final d f7613y;

    /* JADX INFO: renamed from: y0 */
    public long f7614y0;

    /* JADX INFO: renamed from: z */
    public final AudioBecomingNoisyManager f7615z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$b */
    @RequiresApi(31)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static v680 m10106a(Context context, C1869i c1869i, boolean z) {
            dpx dpxVarM112942z0 = dpx.m112942z0(context);
            if (dpxVarM112942z0 == null) {
                jwv.m143689i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new v680(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                c1869i.addAnalyticsListener(dpxVarM112942z0);
            }
            return new v680(dpxVarM112942z0.m112945G0());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$c */
    public final class c implements sal0, InterfaceC1820c, aji0, j100, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.InterfaceC2062b, C1831b.b, AudioBecomingNoisyManager.InterfaceC1788a, StreamVolumeManager.InterfaceC1796b, ExoPlayer.InterfaceC1790b {
        public c() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.InterfaceC2062b
        /* JADX INFO: renamed from: A */
        public void mo10115A(Surface surface) {
            C1869i.this.m10086Q0(null);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.InterfaceC2062b
        /* JADX INFO: renamed from: B */
        public void mo10116B(Surface surface) {
            C1869i.this.m10086Q0(surface);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.InterfaceC1796b
        /* JADX INFO: renamed from: C */
        public void mo9384C(final int i, final boolean z) {
            C1869i.this.f7587l.m97944k(30, new aor.InterfaceC15678a() { // from class: l.f8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11758H(i, z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.C1831b.b
        /* JADX INFO: renamed from: F */
        public void mo9699F(float f) {
            C1869i.this.m10082M0();
        }

        @Override // com.google.android.exoplayer2.C1831b.b
        /* JADX INFO: renamed from: G */
        public void mo9700G(int i) {
            boolean playWhenReady = C1869i.this.getPlayWhenReady();
            C1869i.this.m10089T0(playWhenReady, i, C1869i.m10069y0(playWhenReady, i));
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: a */
        public void mo9552a(final boolean z) {
            if (C1869i.this.f7584j0 == z) {
                return;
            }
            C1869i.this.f7584j0 = z;
            C1869i.this.f7587l.m97944k(23, new aor.InterfaceC15678a() { // from class: l.j8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11769a(z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: b */
        public void mo9553b(Exception exc) {
            C1869i.this.f7599r.mo131427b(exc);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: c */
        public void mo10117c(String str) {
            C1869i.this.f7599r.mo131428c(str);
        }

        @Override // p149l.aji0
        /* JADX INFO: renamed from: d */
        public void mo10118d(final cxb cxbVar) {
            C1869i.this.f7586k0 = cxbVar;
            C1869i.this.f7587l.m97944k(27, new aor.InterfaceC15678a() { // from class: l.c8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11771d(cxbVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: e */
        public void mo9554e(String str) {
            C1869i.this.f7599r.mo131430e(str);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: f */
        public void mo9555f(String str, long j, long j2) {
            C1869i.this.f7599r.mo131432f(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: g */
        public void mo9556g(C1871k c1871k, @Nullable hhd hhdVar) {
            C1869i.this.f7559T = c1871k;
            C1869i.this.f7599r.mo131433g(c1871k, hhdVar);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: h */
        public void mo10119h(C1871k c1871k, @Nullable hhd hhdVar) {
            C1869i.this.f7558S = c1871k;
            C1869i.this.f7599r.mo131434h(c1871k, hhdVar);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: i */
        public void mo10120i(int i, long j) {
            C1869i.this.f7599r.mo131435i(i, j);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: j */
        public void mo9557j(Exception exc) {
            C1869i.this.f7599r.mo131436j(exc);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: k */
        public void mo10121k(long j, int i) {
            C1869i.this.f7599r.mo131437k(j, i);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: l */
        public void mo10122l(String str, long j, long j2) {
            C1869i.this.f7599r.mo131438l(str, j, j2);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: m */
        public void mo10123m(dhd dhdVar) {
            C1869i.this.f7574e0 = dhdVar;
            C1869i.this.f7599r.mo131439m(dhdVar);
        }

        @Override // p149l.j100
        /* JADX INFO: renamed from: n */
        public void mo10124n(final Metadata metadata) {
            C1869i c1869i = C1869i.this;
            c1869i.f7606u0 = c1869i.f7606u0.m10721b().m10758K(metadata).m10755H();
            C1922o c1922oM10096o0 = C1869i.this.m10096o0();
            if (!c1922oM10096o0.equals(C1869i.this.f7556Q)) {
                C1869i.this.f7556Q = c1922oM10096o0;
                C1869i.this.f7587l.m97941h(14, new aor.InterfaceC15678a() { // from class: l.d8f
                    @Override // p149l.aor.InterfaceC15678a
                    public final void invoke(Object obj) {
                        ((InterfaceC2003t.d) obj).mo11756E(C1869i.this.f7556Q);
                    }
                });
            }
            C1869i.this.f7587l.m97941h(28, new aor.InterfaceC15678a() { // from class: l.e8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11778n(metadata);
                }
            });
            C1869i.this.f7587l.m97939f();
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: o */
        public void mo10125o(dhd dhdVar) {
            C1869i.this.f7599r.mo131441o(dhdVar);
            C1869i.this.f7558S = null;
            C1869i.this.f7574e0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C1869i.this.m10085P0(surfaceTexture);
            C1869i.this.m10076G0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1869i.this.m10086Q0(null);
            C1869i.this.m10076G0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C1869i.this.m10076G0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p149l.aji0
        /* JADX INFO: renamed from: p */
        public void mo10126p(final List<ywb> list) {
            C1869i.this.f7587l.m97944k(27, new aor.InterfaceC15678a() { // from class: l.b8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11781p(list);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: q */
        public void mo9558q(long j) {
            C1869i.this.f7599r.mo131442q(j);
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: r */
        public void mo10127r(Exception exc) {
            C1869i.this.f7599r.mo131443r(exc);
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.InterfaceC1788a
        /* JADX INFO: renamed from: s */
        public void mo9354s() {
            C1869i.this.m10089T0(false, -1, 3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C1869i.this.m10076G0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C1869i.this.f7565Z) {
                C1869i.this.m10086Q0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C1869i.this.f7565Z) {
                C1869i.this.m10086Q0(null);
            }
            C1869i.this.m10076G0(0, 0);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: t */
        public void mo9559t(dhd dhdVar) {
            C1869i.this.f7576f0 = dhdVar;
            C1869i.this.f7599r.mo131444t(dhdVar);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.InterfaceC1790b
        /* JADX INFO: renamed from: u */
        public void mo9358u(boolean z) {
            C1869i.this.m10092W0();
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: v */
        public void mo9560v(dhd dhdVar) {
            C1869i.this.f7599r.mo131445v(dhdVar);
            C1869i.this.f7559T = null;
            C1869i.this.f7576f0 = null;
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: w */
        public void mo10128w(Object obj, long j) {
            C1869i.this.f7599r.mo131446w(obj, j);
            if (C1869i.this.f7561V == obj) {
                C1869i.this.f7587l.m97944k(26, new aor.InterfaceC15678a() { // from class: l.h8f
                    @Override // p149l.aor.InterfaceC15678a
                    public final void invoke(Object obj2) {
                        ((InterfaceC2003t.d) obj2).mo11770b0();
                    }
                });
            }
        }

        @Override // p149l.sal0
        /* JADX INFO: renamed from: x */
        public void mo10129x(final val0 val0Var) {
            C1869i.this.f7604t0 = val0Var;
            C1869i.this.f7587l.m97944k(25, new aor.InterfaceC15678a() { // from class: l.i8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11785x(val0Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1820c
        /* JADX INFO: renamed from: y */
        public void mo9561y(int i, long j, long j2) {
            C1869i.this.f7599r.mo131447y(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.InterfaceC1796b
        /* JADX INFO: renamed from: z */
        public void mo9385z(int i) {
            final C1868h c1868hM10059p0 = C1869i.m10059p0(C1869i.this.f7541B);
            if (c1868hM10059p0.equals(C1869i.this.f7602s0)) {
                return;
            }
            C1869i.this.f7602s0 = c1868hM10059p0;
            C1869i.this.f7587l.m97944k(29, new aor.InterfaceC15678a() { // from class: l.g8f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11768W(c1868hM10059p0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$d */
    public static final class d implements e5l0, ha4, C2004u.b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public e5l0 f7617a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public ha4 f7618b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public e5l0 f7619c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public ha4 f7620d;

        public d() {
        }

        @Override // p149l.e5l0
        /* JADX INFO: renamed from: a */
        public void mo10130a(long j, long j2, C1871k c1871k, @Nullable MediaFormat mediaFormat) {
            e5l0 e5l0Var = this.f7619c;
            if (e5l0Var != null) {
                e5l0Var.mo10130a(j, j2, c1871k, mediaFormat);
            }
            e5l0 e5l0Var2 = this.f7617a;
            if (e5l0Var2 != null) {
                e5l0Var2.mo10130a(j, j2, c1871k, mediaFormat);
            }
        }

        @Override // p149l.ha4
        /* JADX INFO: renamed from: e */
        public void mo10131e(long j, float[] fArr) {
            ha4 ha4Var = this.f7620d;
            if (ha4Var != null) {
                ha4Var.mo10131e(j, fArr);
            }
            ha4 ha4Var2 = this.f7618b;
            if (ha4Var2 != null) {
                ha4Var2.mo10131e(j, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.C2004u.b
        /* JADX INFO: renamed from: f */
        public void mo9655f(int i, @Nullable Object obj) {
            if (i == 7) {
                this.f7617a = (e5l0) obj;
                return;
            }
            if (i == 8) {
                this.f7618b = (ha4) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f7619c = null;
                this.f7620d = null;
            } else {
                this.f7619c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f7620d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // p149l.ha4
        /* JADX INFO: renamed from: h */
        public void mo10132h() {
            ha4 ha4Var = this.f7620d;
            if (ha4Var != null) {
                ha4Var.mo10132h();
            }
            ha4 ha4Var2 = this.f7618b;
            if (ha4Var2 != null) {
                ha4Var2.mo10132h();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$e */
    public static final class e implements jxx {

        /* JADX INFO: renamed from: a */
        public final Object f7621a;

        /* JADX INFO: renamed from: b */
        public AbstractC1834c0 f7622b;

        public e(Object obj, AbstractC1834c0 abstractC1834c0) {
            this.f7621a = obj;
            this.f7622b = abstractC1834c0;
        }

        @Override // p149l.jxx
        /* JADX INFO: renamed from: a */
        public Object mo10134a() {
            return this.f7621a;
        }

        @Override // p149l.jxx
        /* JADX INFO: renamed from: b */
        public AbstractC1834c0 mo10135b() {
            return this.f7622b;
        }
    }

    static {
        n8f.m158492a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C1869i(ExoPlayer.C1791c c1791c, @Nullable InterfaceC2003t interfaceC2003t) {
        ss5 ss5Var = new ss5();
        this.f7571d = ss5Var;
        try {
            jwv.m143686f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + vck0.f180952e + Constants.AES_SUFFIX);
            Context applicationContext = c1791c.f6986a.getApplicationContext();
            this.f7573e = applicationContext;
            hk0 hk0VarApply = c1791c.f6994i.apply(c1791c.f6987b);
            this.f7599r = hk0VarApply;
            this.f7596p0 = c1791c.f6996k;
            this.f7580h0 = c1791c.f6997l;
            this.f7568b0 = c1791c.f7003r;
            this.f7570c0 = c1791c.f7004s;
            this.f7584j0 = c1791c.f7001p;
            this.f7544E = c1791c.f7011z;
            c cVar = new c();
            this.f7611x = cVar;
            d dVar = new d();
            this.f7613y = dVar;
            Handler handler = new Handler(c1791c.f6995j);
            InterfaceC2066x[] interfaceC2066xArrMo117709a = c1791c.f6989d.get().mo117709a(handler, cVar, cVar, cVar, cVar);
            this.f7577g = interfaceC2066xArrMo117709a;
            p11.m167013g(interfaceC2066xArrMo117709a.length > 0);
            y6j0 y6j0Var = c1791c.f6991f.get();
            this.f7579h = y6j0Var;
            this.f7597q = c1791c.f6990e.get();
            fd2 fd2Var = c1791c.f6993h.get();
            this.f7603t = fd2Var;
            this.f7595p = c1791c.f7005t;
            this.f7552M = c1791c.f7006u;
            this.f7605u = c1791c.f7007v;
            this.f7607v = c1791c.f7008w;
            this.f7554O = c1791c.f6982A;
            Looper looper = c1791c.f6995j;
            this.f7601s = looper;
            p95 p95Var = c1791c.f6987b;
            this.f7609w = p95Var;
            InterfaceC2003t interfaceC2003t2 = interfaceC2003t == null ? this : interfaceC2003t;
            this.f7575f = interfaceC2003t2;
            this.f7587l = new aor<>(looper, p95Var, new aor.InterfaceC15679b() { // from class: l.h7f
                @Override // p149l.aor.InterfaceC15679b
                /* JADX INFO: renamed from: a */
                public final void mo97946a(Object obj, dpi dpiVar) {
                    ((InterfaceC2003t.d) obj).mo11777l0(this.f106270a.f7575f, new InterfaceC2003t.c(dpiVar));
                }
            });
            this.f7589m = new CopyOnWriteArraySet<>();
            this.f7593o = new ArrayList();
            this.f7553N = new g0f0.C16972a(0);
            z6j0 z6j0Var = new z6j0(new erc0[interfaceC2066xArrMo117709a.length], new o8f[interfaceC2066xArrMo117709a.length], C1838d0.f7360b, null);
            this.f7567b = z6j0Var;
            this.f7591n = new AbstractC1834c0.b();
            InterfaceC2003t.b bVarM11750e = new InterfaceC2003t.b.a().m11748c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).m11749d(29, y6j0Var.mo151247h()).m11749d(23, c1791c.f7002q).m11749d(25, c1791c.f7002q).m11749d(33, c1791c.f7002q).m11749d(26, c1791c.f7002q).m11749d(34, c1791c.f7002q).m11750e();
            this.f7569c = bVarM11750e;
            this.f7555P = new InterfaceC2003t.b.a().m11747b(bVarM11750e).m11746a(4).m11746a(10).m11750e();
            this.f7581i = p95Var.mo167857c(looper, null);
            C1870j.f fVar = new C1870j.f() { // from class: l.i7f
                @Override // com.google.android.exoplayer2.C1870j.f
                /* JADX INFO: renamed from: a */
                public final void mo10276a(C1870j.e eVar) {
                    C1869i c1869i = this.f111879a;
                    c1869i.f7581i.mo108865a(new Runnable() { // from class: l.p7f
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1869i.m10072C0(eVar);
                        }
                    });
                }
            };
            this.f7583j = fVar;
            this.f7608v0 = z580.m217275k(z6j0Var);
            hk0VarApply.mo131425G(interfaceC2003t2, looper);
            int i = vck0.f180948a;
            C1870j c1870j = new C1870j(interfaceC2066xArrMo117709a, y6j0Var, z6j0Var, c1791c.f6992g.get(), fd2Var, this.f7545F, this.f7546G, hk0VarApply, this.f7552M, c1791c.f7009x, c1791c.f7010y, this.f7554O, looper, p95Var, fVar, i < 31 ? new v680() : b.m10106a(applicationContext, this, c1791c.f6983B), c1791c.f6984C);
            this.f7585k = c1870j;
            this.f7582i0 = 1.0f;
            this.f7545F = 0;
            C1922o c1922o = C1922o.f8103I;
            this.f7556Q = c1922o;
            this.f7557R = c1922o;
            this.f7606u0 = c1922o;
            this.f7610w0 = -1;
            if (i < 21) {
                this.f7578g0 = m10073D0(0);
            } else {
                this.f7578g0 = vck0.m197799G(applicationContext);
            }
            this.f7586k0 = cxb.f82862c;
            this.f7592n0 = true;
            addListener(hk0VarApply);
            fd2Var.mo120876d(new Handler(looper), hk0VarApply);
            addAudioOffloadListener(cVar);
            long j = c1791c.f6988c;
            if (j > 0) {
                c1870j.m10256x(j);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(c1791c.f6986a, handler, cVar);
            this.f7615z = audioBecomingNoisyManager;
            audioBecomingNoisyManager.m9353b(c1791c.f7000o);
            C1831b c1831b = new C1831b(c1791c.f6986a, handler, cVar);
            this.f7540A = c1831b;
            c1831b.m9693m(c1791c.f6998m ? this.f7580h0 : null);
            if (c1791c.f7002q) {
                StreamVolumeManager streamVolumeManager = new StreamVolumeManager(c1791c.f6986a, handler, cVar);
                this.f7541B = streamVolumeManager;
                streamVolumeManager.m9380m(vck0.m197867j0(this.f7580h0.f7151c));
            } else {
                this.f7541B = null;
            }
            sfp0 sfp0Var = new sfp0(c1791c.f6986a);
            this.f7542C = sfp0Var;
            sfp0Var.m183994a(c1791c.f6999n != 0);
            f6q0 f6q0Var = new f6q0(c1791c.f6986a);
            this.f7543D = f6q0Var;
            f6q0Var.m119631a(c1791c.f6999n == 2);
            this.f7602s0 = m10059p0(this.f7541B);
            this.f7604t0 = val0.f180759e;
            this.f7572d0 = sif0.f164712c;
            y6j0Var.mo151249l(this.f7580h0);
            m10081L0(1, 10, Integer.valueOf(this.f7578g0));
            m10081L0(2, 10, Integer.valueOf(this.f7578g0));
            m10081L0(1, 3, this.f7580h0);
            m10081L0(2, 4, Integer.valueOf(this.f7568b0));
            m10081L0(2, 5, Integer.valueOf(this.f7570c0));
            m10081L0(1, 9, Boolean.valueOf(this.f7584j0));
            m10081L0(2, 7, dVar);
            m10081L0(6, 8, dVar);
            ss5Var.m185714e();
        } catch (Throwable th) {
            this.f7571d.m185714e();
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static long m10014B0(z580 z580Var) {
        AbstractC1834c0.d dVar = new AbstractC1834c0.d();
        AbstractC1834c0.b bVar = new AbstractC1834c0.b();
        z580Var.f201766a.mo9400l(z580Var.f201767b.f114355a, bVar);
        return z580Var.f201768c == -9223372036854775807L ? z580Var.f201766a.m9720r(bVar.f7302c, dVar).m9751e() : bVar.m9740q() + z580Var.f201768c;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m10018F(z580 z580Var, InterfaceC2003t.d dVar) {
        dVar.mo11753A(z580Var.f201772g);
        dVar.mo11775i0(z580Var.f201772g);
    }

    /* JADX INFO: renamed from: p0 */
    public static C1868h m10059p0(@Nullable StreamVolumeManager streamVolumeManager) {
        return new C1868h.b(0).m10010g(streamVolumeManager != null ? streamVolumeManager.m9374e() : 0).m10009f(streamVolumeManager != null ? streamVolumeManager.m9373d() : 0).m10008e();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m10066w(int i, InterfaceC2003t.e eVar, InterfaceC2003t.e eVar2, InterfaceC2003t.d dVar) {
        dVar.mo11773g0(i);
        dVar.mo11786z(eVar, eVar2, i);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m10069y0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC2003t.e m10071A0(int i, z580 z580Var, int i2) {
        int i3;
        Object obj;
        C1921n c1921n;
        Object obj2;
        int i4;
        long jM10014B0;
        long jM10014B1;
        AbstractC1834c0.b bVar = new AbstractC1834c0.b();
        if (z580Var.f201766a.m9722u()) {
            i3 = i2;
            obj = null;
            c1921n = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = z580Var.f201767b.f114355a;
            z580Var.f201766a.mo9400l(obj3, bVar);
            int i5 = bVar.f7302c;
            int iMo9396f = z580Var.f201766a.mo9396f(obj3);
            Object obj4 = z580Var.f201766a.m9720r(i5, this.f7288a).f7328a;
            c1921n = this.f7288a.f7330c;
            obj2 = obj3;
            i4 = iMo9396f;
            obj = obj4;
            i3 = i5;
        }
        InterfaceC1965i.b bVar2 = z580Var.f201767b;
        if (i == 0) {
            boolean zM137607b = bVar2.m137607b();
            InterfaceC1965i.b bVar3 = z580Var.f201767b;
            if (zM137607b) {
                jM10014B0 = bVar.m9728e(bVar3.f114356b, bVar3.f114357c);
                jM10014B1 = m10014B0(z580Var);
            } else {
                jM10014B0 = bVar3.f114359e != -1 ? m10014B0(this.f7608v0) : bVar.f7304e + bVar.f7303d;
                jM10014B1 = jM10014B0;
            }
        } else if (bVar2.m137607b()) {
            jM10014B0 = z580Var.f201783r;
            jM10014B1 = m10014B0(z580Var);
        } else {
            jM10014B0 = bVar.f7304e + z580Var.f201783r;
            jM10014B1 = jM10014B0;
        }
        long jM197874l1 = vck0.m197874l1(jM10014B0);
        long jM197874l2 = vck0.m197874l1(jM10014B1);
        InterfaceC1965i.b bVar4 = z580Var.f201767b;
        return new InterfaceC2003t.e(obj, i3, c1921n, obj2, i4, jM197874l1, jM197874l2, bVar4.f114356b, bVar4.f114357c);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m10072C0(C1870j.e eVar) {
        long jM10077H0;
        int i = this.f7547H - eVar.f7681c;
        this.f7547H = i;
        boolean z = true;
        if (eVar.f7682d) {
            this.f7548I = eVar.f7683e;
            this.f7549J = true;
        }
        if (eVar.f7684f) {
            this.f7550K = eVar.f7685g;
        }
        if (i == 0) {
            AbstractC1834c0 abstractC1834c0 = eVar.f7680b.f201766a;
            if (!this.f7608v0.f201766a.m9722u() && abstractC1834c0.m9722u()) {
                this.f7610w0 = -1;
                this.f7614y0 = 0L;
                this.f7612x0 = 0;
            }
            if (!abstractC1834c0.m9722u()) {
                List<AbstractC1834c0> listM12176J = ((C2057v) abstractC1834c0).m12176J();
                p11.m167013g(listM12176J.size() == this.f7593o.size());
                for (int i2 = 0; i2 < listM12176J.size(); i2++) {
                    this.f7593o.get(i2).f7622b = listM12176J.get(i2);
                }
            }
            long j = -9223372036854775807L;
            if (this.f7549J) {
                if (eVar.f7680b.f201767b.equals(this.f7608v0.f201767b) && eVar.f7680b.f201769d == this.f7608v0.f201783r) {
                    z = false;
                }
                if (z) {
                    if (abstractC1834c0.m9722u() || eVar.f7680b.f201767b.m137607b()) {
                        jM10077H0 = eVar.f7680b.f201769d;
                    } else {
                        z580 z580Var = eVar.f7680b;
                        jM10077H0 = m10077H0(abstractC1834c0, z580Var.f201767b, z580Var.f201769d);
                    }
                    j = jM10077H0;
                }
            } else {
                z = false;
            }
            this.f7549J = false;
            m10090U0(eVar.f7680b, 1, this.f7550K, z, this.f7548I, j, -1, false);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final int m10073D0(int i) {
        AudioTrack audioTrack = this.f7560U;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.f7560U.release();
            this.f7560U = null;
        }
        if (this.f7560U == null) {
            this.f7560U = new AudioTrack(3, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, 4, 2, 2, 0, i);
        }
        return this.f7560U.getAudioSessionId();
    }

    /* JADX INFO: renamed from: E0 */
    public final z580 m10074E0(z580 z580Var, AbstractC1834c0 abstractC1834c0, @Nullable Pair<Object, Long> pair) {
        p11.m167007a(abstractC1834c0.m9722u() || pair != null);
        AbstractC1834c0 abstractC1834c1 = z580Var.f201766a;
        long jM10101u0 = m10101u0(z580Var);
        z580 z580VarM217286j = z580Var.m217286j(abstractC1834c0);
        if (abstractC1834c0.m9722u()) {
            InterfaceC1965i.b bVarM217276l = z580.m217276l();
            long jM197806J0 = vck0.m197806J0(this.f7614y0);
            z580 z580VarM217279c = z580VarM217286j.m217280d(bVarM217276l, jM197806J0, jM197806J0, jM197806J0, 0L, b6j0.f73823d, this.f7567b, ImmutableList.m15685of()).m217279c(bVarM217276l);
            z580VarM217279c.f201781p = z580VarM217279c.f201783r;
            return z580VarM217279c;
        }
        Object obj = z580VarM217286j.f201767b.f114355a;
        boolean zEquals = obj.equals(((Pair) vck0.m197866j(pair)).first);
        InterfaceC1965i.b bVar = !zEquals ? new InterfaceC1965i.b(pair.first) : z580VarM217286j.f201767b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM197806J1 = vck0.m197806J0(jM10101u0);
        if (!abstractC1834c1.m9722u()) {
            jM197806J1 -= abstractC1834c1.mo9400l(obj, this.f7591n).m9740q();
        }
        if (!zEquals || jLongValue < jM197806J1) {
            InterfaceC1965i.b bVar2 = bVar;
            p11.m167013g(!bVar2.m137607b());
            z580 z580VarM217279c2 = z580VarM217286j.m217280d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? b6j0.f73823d : z580VarM217286j.f201773h, !zEquals ? this.f7567b : z580VarM217286j.f201774i, !zEquals ? ImmutableList.m15685of() : z580VarM217286j.f201775j).m217279c(bVar2);
            z580VarM217279c2.f201781p = jLongValue;
            return z580VarM217279c2;
        }
        if (jLongValue != jM197806J1) {
            InterfaceC1965i.b bVar3 = bVar;
            p11.m167013g(!bVar3.m137607b());
            long jMax = Math.max(0L, z580VarM217286j.f201782q - (jLongValue - jM197806J1));
            long j = z580VarM217286j.f201781p;
            if (z580VarM217286j.f201776k.equals(z580VarM217286j.f201767b)) {
                j = jLongValue + jMax;
            }
            z580 z580VarM217280d = z580VarM217286j.m217280d(bVar3, jLongValue, jLongValue, jLongValue, jMax, z580VarM217286j.f201773h, z580VarM217286j.f201774i, z580VarM217286j.f201775j);
            z580VarM217280d.f201781p = j;
            return z580VarM217280d;
        }
        int iMo9396f = abstractC1834c0.mo9396f(z580VarM217286j.f201776k.f114355a);
        if (iMo9396f != -1 && abstractC1834c0.m9716j(iMo9396f, this.f7591n).f7302c == abstractC1834c0.mo9400l(bVar.f114355a, this.f7591n).f7302c) {
            return z580VarM217286j;
        }
        abstractC1834c0.mo9400l(bVar.f114355a, this.f7591n);
        boolean zM137607b = bVar.m137607b();
        AbstractC1834c0.b bVar4 = this.f7591n;
        long jM9728e = zM137607b ? bVar4.m9728e(bVar.f114356b, bVar.f114357c) : bVar4.f7303d;
        InterfaceC1965i.b bVar5 = bVar;
        z580 z580VarM217279c3 = z580VarM217286j.m217280d(bVar5, z580VarM217286j.f201783r, z580VarM217286j.f201783r, z580VarM217286j.f201769d, jM9728e - z580VarM217286j.f201783r, z580VarM217286j.f201773h, z580VarM217286j.f201774i, z580VarM217286j.f201775j).m217279c(bVar5);
        z580VarM217279c3.f201781p = jM9728e;
        return z580VarM217279c3;
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public final Pair<Object, Long> m10075F0(AbstractC1834c0 abstractC1834c0, int i, long j) {
        if (abstractC1834c0.m9722u()) {
            this.f7610w0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f7614y0 = j;
            this.f7612x0 = 0;
            return null;
        }
        if (i == -1 || i >= abstractC1834c0.mo9721t()) {
            i = abstractC1834c0.mo9395e(this.f7546G);
            j = abstractC1834c0.m9720r(i, this.f7288a).m9750d();
        }
        return abstractC1834c0.m9718n(this.f7288a, this.f7591n, i, vck0.m197806J0(j));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10076G0(final int i, final int i2) {
        if (i == this.f7572d0.m184338b() && i2 == this.f7572d0.m184337a()) {
            return;
        }
        this.f7572d0 = new sif0(i, i2);
        this.f7587l.m97944k(24, new aor.InterfaceC15678a() { // from class: l.m7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11772f0(i, i2);
            }
        });
        m10081L0(2, 14, new sif0(i, i2));
    }

    /* JADX INFO: renamed from: H0 */
    public final long m10077H0(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar, long j) {
        abstractC1834c0.mo9400l(bVar.f114355a, this.f7591n);
        return j + this.f7591n.m9740q();
    }

    /* JADX INFO: renamed from: I0 */
    public final z580 m10078I0(z580 z580Var, int i, int i2) {
        int iM10103w0 = m10103w0(z580Var);
        long jM10101u0 = m10101u0(z580Var);
        AbstractC1834c0 abstractC1834c0 = z580Var.f201766a;
        int size = this.f7593o.size();
        this.f7547H++;
        m10079J0(i, i2);
        AbstractC1834c0 abstractC1834c0M10097q0 = m10097q0();
        z580 z580VarM10074E0 = m10074E0(z580Var, abstractC1834c0M10097q0, m10104x0(abstractC1834c0, abstractC1834c0M10097q0, iM10103w0, jM10101u0));
        int i3 = z580VarM10074E0.f201770e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iM10103w0 >= z580VarM10074E0.f201766a.mo9721t()) {
            z580VarM10074E0 = z580VarM10074E0.m217284h(4);
        }
        this.f7585k.m10240r0(i, i2, this.f7553N);
        return z580VarM10074E0;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m10079J0(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f7593o.remove(i3);
        }
        this.f7553N = this.f7553N.mo123967f(i, i2);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m10080K0() {
        if (this.f7564Y != null) {
            m10099s0(this.f7613y).m11803n(10000).m11802m(null).m11801l();
            this.f7564Y.m12192g(this.f7611x);
            this.f7564Y = null;
        }
        TextureView textureView = this.f7566a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7611x) {
                jwv.m143689i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7566a0.setSurfaceTextureListener(null);
            }
            this.f7566a0 = null;
        }
        SurfaceHolder surfaceHolder = this.f7563X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7611x);
            this.f7563X = null;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m10081L0(int i, int i2, @Nullable Object obj) {
        for (InterfaceC2066x interfaceC2066x : this.f7577g) {
            if (interfaceC2066x.getTrackType() == i) {
                m10099s0(interfaceC2066x).m11803n(i2).m11802m(obj).m11801l();
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m10082M0() {
        m10081L0(1, 2, Float.valueOf(this.f7582i0 * this.f7540A.m9687g()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX INFO: renamed from: N0 */
    public final void m10083N0(List<InterfaceC1965i> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        z580 z580VarM217284h;
        boolean z2;
        int iMo9395e = i;
        int iM10103w0 = m10103w0(this.f7608v0);
        long currentPosition = getCurrentPosition();
        this.f7547H++;
        if (!this.f7593o.isEmpty()) {
            m10079J0(0, this.f7593o.size());
        }
        List<C1928q.c> listM10094m0 = m10094m0(0, list);
        AbstractC1834c0 abstractC1834c0M10097q0 = m10097q0();
        if (!abstractC1834c0M10097q0.m9722u() && iMo9395e >= abstractC1834c0M10097q0.mo9721t()) {
            throw new IllegalSeekPositionException(abstractC1834c0M10097q0, iMo9395e, j);
        }
        if (!z) {
            if (iMo9395e == -1) {
                i2 = iM10103w0;
                j2 = currentPosition;
            } else {
                j2 = j;
            }
            z580 z580VarM10074E0 = m10074E0(this.f7608v0, abstractC1834c0M10097q0, m10075F0(abstractC1834c0M10097q0, i2, j2));
            i3 = z580VarM10074E0.f201770e;
            if (i2 != -1 && i3 != 1) {
                if (!abstractC1834c0M10097q0.m9722u() || i2 >= abstractC1834c0M10097q0.mo9721t()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            z580VarM217284h = z580VarM10074E0.m217284h(i3);
            this.f7585k.m10183T0(listM10094m0, i2, vck0.m197806J0(j2), this.f7553N);
            if (!this.f7608v0.f201767b.f114355a.equals(z580VarM217284h.f201767b.f114355a) || this.f7608v0.f201766a.m9722u()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m10090U0(z580VarM217284h, 0, 1, z2, 4, m10102v0(z580VarM217284h), -1, false);
        }
        iMo9395e = abstractC1834c0M10097q0.mo9395e(this.f7546G);
        j2 = -9223372036854775807L;
        i2 = iMo9395e;
        z580 z580VarM10074E1 = m10074E0(this.f7608v0, abstractC1834c0M10097q0, m10075F0(abstractC1834c0M10097q0, i2, j2));
        i3 = z580VarM10074E1.f201770e;
        if (i2 != -1) {
            if (abstractC1834c0M10097q0.m9722u()) {
                i3 = 4;
            } else {
                i3 = 4;
            }
        }
        z580VarM217284h = z580VarM10074E1.m217284h(i3);
        this.f7585k.m10183T0(listM10094m0, i2, vck0.m197806J0(j2), this.f7553N);
        if (this.f7608v0.f201767b.f114355a.equals(z580VarM217284h.f201767b.f114355a)) {
            z2 = false;
        } else {
            z2 = false;
        }
        m10090U0(z580VarM217284h, 0, 1, z2, 4, m10102v0(z580VarM217284h), -1, false);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m10084O0(SurfaceHolder surfaceHolder) {
        this.f7565Z = false;
        this.f7563X = surfaceHolder;
        surfaceHolder.addCallback(this.f7611x);
        Surface surface = this.f7563X.getSurface();
        if (surface == null || !surface.isValid()) {
            m10076G0(0, 0);
        } else {
            Rect surfaceFrame = this.f7563X.getSurfaceFrame();
            m10076G0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m10085P0(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m10086Q0(surface);
        this.f7562W = surface;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10086Q0(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (InterfaceC2066x interfaceC2066x : this.f7577g) {
            if (interfaceC2066x.getTrackType() == 2) {
                arrayList.add(m10099s0(interfaceC2066x).m11803n(1).m11802m(obj).m11801l());
            }
        }
        Object obj2 = this.f7561V;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2004u) it.next()).m11790a(this.f7544E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f7561V;
            Surface surface = this.f7562W;
            if (obj3 == surface) {
                surface.release();
                this.f7562W = null;
            }
        }
        this.f7561V = obj;
        if (z) {
            m10087R0(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m10087R0(@Nullable ExoPlaybackException exoPlaybackException) {
        z580 z580Var = this.f7608v0;
        z580 z580VarM217279c = z580Var.m217279c(z580Var.f201767b);
        z580VarM217279c.f201781p = z580VarM217279c.f201783r;
        z580VarM217279c.f201782q = 0L;
        z580 z580VarM217284h = z580VarM217279c.m217284h(1);
        if (exoPlaybackException != null) {
            z580VarM217284h = z580VarM217284h.m217282f(exoPlaybackException);
        }
        this.f7547H++;
        this.f7585k.m10238q1();
        m10090U0(z580VarM217284h, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m10088S0() {
        InterfaceC2003t.b bVar = this.f7555P;
        InterfaceC2003t.b bVarM197803I = vck0.m197803I(this.f7575f, this.f7569c);
        this.f7555P = bVarM197803I;
        if (bVarM197803I.equals(bVar)) {
            return;
        }
        this.f7587l.m97941h(13, new aor.InterfaceC15678a() { // from class: l.r7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11766T(this.f158024a.f7555P);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final void m10089T0(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        z580 z580VarM217277a = this.f7608v0;
        if (z580VarM217277a.f201777l == z2 && z580VarM217277a.f201778m == i3) {
            return;
        }
        this.f7547H++;
        if (z580VarM217277a.f201780o) {
            z580VarM217277a = z580VarM217277a.m217277a();
        }
        z580 z580VarM217281e = z580VarM217277a.m217281e(z2, i3);
        this.f7585k.m10189X0(z2, i3);
        m10090U0(z580VarM217281e, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m10090U0(final z580 z580Var, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        z580 z580Var2 = this.f7608v0;
        this.f7608v0 = z580Var;
        boolean zEquals = z580Var2.f201766a.equals(z580Var.f201766a);
        Pair<Boolean, Integer> pairM10100t0 = m10100t0(z580Var, z580Var2, z, i3, !zEquals, z2);
        boolean zBooleanValue = ((Boolean) pairM10100t0.first).booleanValue();
        final int iIntValue = ((Integer) pairM10100t0.second).intValue();
        C1922o c1922oM10096o0 = this.f7556Q;
        final C1921n c1921n = null;
        if (zBooleanValue) {
            if (!z580Var.f201766a.m9722u()) {
                c1921n = z580Var.f201766a.m9720r(z580Var.f201766a.mo9400l(z580Var.f201767b.f114355a, this.f7591n).f7302c, this.f7288a).f7330c;
            }
            this.f7606u0 = C1922o.f8103I;
        }
        if (zBooleanValue || !z580Var2.f201775j.equals(z580Var.f201775j)) {
            this.f7606u0 = this.f7606u0.m10721b().m10759L(z580Var.f201775j).m10755H();
            c1922oM10096o0 = m10096o0();
        }
        boolean zEquals2 = c1922oM10096o0.equals(this.f7556Q);
        this.f7556Q = c1922oM10096o0;
        boolean z3 = z580Var2.f201777l != z580Var.f201777l;
        boolean z4 = z580Var2.f201770e != z580Var.f201770e;
        if (z4 || z3) {
            m10092W0();
        }
        boolean z5 = z580Var2.f201772g;
        boolean z6 = z580Var.f201772g;
        boolean z7 = z5 != z6;
        if (z7) {
            m10091V0(z6);
        }
        if (!zEquals) {
            this.f7587l.m97941h(0, new aor.InterfaceC15678a() { // from class: l.y6f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    InterfaceC2003t.d dVar = (InterfaceC2003t.d) obj;
                    dVar.mo11754C(z580Var.f201766a, i);
                }
            });
        }
        if (z) {
            final InterfaceC2003t.e eVarM10071A0 = m10071A0(i3, z580Var2, i4);
            final InterfaceC2003t.e eVarM10105z0 = m10105z0(j);
            this.f7587l.m97941h(11, new aor.InterfaceC15678a() { // from class: l.v7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    C1869i.m10066w(i3, eVarM10071A0, eVarM10105z0, (InterfaceC2003t.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f7587l.m97941h(1, new aor.InterfaceC15678a() { // from class: l.w7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11780o0(c1921n, iIntValue);
                }
            });
        }
        if (z580Var2.f201771f != z580Var.f201771f) {
            this.f7587l.m97941h(10, new aor.InterfaceC15678a() { // from class: l.x7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11759I(z580Var.f201771f);
                }
            });
            if (z580Var.f201771f != null) {
                this.f7587l.m97941h(10, new aor.InterfaceC15678a() { // from class: l.y7f
                    @Override // p149l.aor.InterfaceC15678a
                    public final void invoke(Object obj) {
                        ((InterfaceC2003t.d) obj).mo11760J(z580Var.f201771f);
                    }
                });
            }
        }
        z6j0 z6j0Var = z580Var2.f201774i;
        z6j0 z6j0Var2 = z580Var.f201774i;
        if (z6j0Var != z6j0Var2) {
            this.f7579h.mo166136i(z6j0Var2.f201932e);
            this.f7587l.m97941h(2, new aor.InterfaceC15678a() { // from class: l.z7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11774h0(z580Var.f201774i.f201931d);
                }
            });
        }
        if (!zEquals2) {
            final C1922o c1922o = this.f7556Q;
            this.f7587l.m97941h(14, new aor.InterfaceC15678a() { // from class: l.z6f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11756E(c1922o);
                }
            });
        }
        if (z7) {
            this.f7587l.m97941h(3, new aor.InterfaceC15678a() { // from class: l.a7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    C1869i.m10018F(z580Var, (InterfaceC2003t.d) obj);
                }
            });
        }
        if (z4 || z3) {
            this.f7587l.m97941h(-1, new aor.InterfaceC15678a() { // from class: l.b7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    z580 z580Var3 = z580Var;
                    ((InterfaceC2003t.d) obj).mo11779n0(z580Var3.f201777l, z580Var3.f201770e);
                }
            });
        }
        if (z4) {
            this.f7587l.m97941h(4, new aor.InterfaceC15678a() { // from class: l.c7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11767U(z580Var.f201770e);
                }
            });
        }
        if (z3) {
            this.f7587l.m97941h(5, new aor.InterfaceC15678a() { // from class: l.j7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    InterfaceC2003t.d dVar = (InterfaceC2003t.d) obj;
                    dVar.mo11763O(z580Var.f201777l, i2);
                }
            });
        }
        if (z580Var2.f201778m != z580Var.f201778m) {
            this.f7587l.m97941h(6, new aor.InterfaceC15678a() { // from class: l.s7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11765S(z580Var.f201778m);
                }
            });
        }
        if (z580Var2.m217288n() != z580Var.m217288n()) {
            this.f7587l.m97941h(7, new aor.InterfaceC15678a() { // from class: l.t7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11764R(z580Var.m217288n());
                }
            });
        }
        if (!z580Var2.f201779n.equals(z580Var.f201779n)) {
            this.f7587l.m97941h(12, new aor.InterfaceC15678a() { // from class: l.u7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11783s(z580Var.f201779n);
                }
            });
        }
        m10088S0();
        this.f7587l.m97939f();
        if (z580Var2.f201780o != z580Var.f201780o) {
            Iterator<ExoPlayer.InterfaceC1790b> it = this.f7589m.iterator();
            while (it.hasNext()) {
                it.next().mo9358u(z580Var.f201780o);
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m10091V0(boolean z) {
        PriorityTaskManager priorityTaskManager = this.f7596p0;
        if (priorityTaskManager != null) {
            if (z && !this.f7598q0) {
                priorityTaskManager.m12150a(0);
                this.f7598q0 = true;
            } else {
                if (z || !this.f7598q0) {
                    return;
                }
                priorityTaskManager.m12151b(0);
                this.f7598q0 = false;
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m10092W0() {
        int playbackState = getPlaybackState();
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                sfp0 sfp0Var = this.f7542C;
                if (getPlayWhenReady() && !zExperimentalIsSleepingForOffload) {
                    z = true;
                }
                sfp0Var.m183995b(z);
                this.f7543D.m119632b(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                ohg0.m164364a();
                return;
            }
        }
        this.f7542C.m183995b(false);
        this.f7543D.m119632b(false);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m10093X0() {
        this.f7571d.m185711b();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String strM197793D = vck0.m197793D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f7592n0) {
                qkq0.m175383a(strM197793D);
            } else {
                jwv.m143690j("ExoPlayerImpl", strM197793D, this.f7594o0 ? null : new IllegalStateException());
                this.f7594o0 = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(lk0 lk0Var) {
        this.f7599r.mo131429d0((lk0) p11.m167011e(lk0Var));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.InterfaceC1790b interfaceC1790b) {
        this.f7589m.add(interfaceC1790b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void addListener(InterfaceC2003t.d dVar) {
        this.f7587l.m97936c((InterfaceC2003t.d) p11.m167011e(dVar));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void addMediaItems(int i, List<C1921n> list) {
        m10093X0();
        addMediaSources(i, m10098r0(list));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(InterfaceC1965i interfaceC1965i) {
        m10093X0();
        addMediaSources(Collections.singletonList(interfaceC1965i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int i, List<InterfaceC1965i> list) {
        m10093X0();
        p11.m167007a(i >= 0);
        int iMin = Math.min(i, this.f7593o.size());
        if (this.f7593o.isEmpty()) {
            setMediaSources(list, this.f7610w0 == -1);
        } else {
            m10090U0(m10095n0(this.f7608v0, iMin, list), 0, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC1833c
    /* JADX INFO: renamed from: c */
    public void mo9705c(int i, long j, int i2, boolean z) {
        m10093X0();
        p11.m167007a(i >= 0);
        this.f7599r.mo131426X();
        AbstractC1834c0 abstractC1834c0 = this.f7608v0.f201766a;
        if (abstractC1834c0.m9722u() || i < abstractC1834c0.mo9721t()) {
            this.f7547H++;
            if (isPlayingAd()) {
                jwv.m143689i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C1870j.e eVar = new C1870j.e(this.f7608v0);
                eVar.m10272b(1);
                this.f7583j.mo10276a(eVar);
                return;
            }
            z580 z580VarM217284h = this.f7608v0;
            int i3 = z580VarM217284h.f201770e;
            if (i3 == 3 || (i3 == 4 && !abstractC1834c0.m9722u())) {
                z580VarM217284h = this.f7608v0.m217284h(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            z580 z580VarM10074E0 = m10074E0(z580VarM217284h, abstractC1834c0, m10075F0(abstractC1834c0, i, j));
            this.f7585k.m10156F0(abstractC1834c0, i, vck0.m197806J0(j));
            m10090U0(z580VarM10074E0, 0, 1, true, 1, m10102v0(z580VarM10074E0), currentMediaItemIndex, z);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearAuxEffectInfo() {
        m10093X0();
        setAuxEffectInfo(new pj1(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearCameraMotionListener(ha4 ha4Var) {
        m10093X0();
        if (this.f7590m0 != ha4Var) {
            return;
        }
        m10099s0(this.f7613y).m11803n(8).m11802m(null).m11801l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoFrameMetadataListener(e5l0 e5l0Var) {
        m10093X0();
        if (this.f7588l0 != e5l0Var) {
            return;
        }
        m10099s0(this.f7613y).m11803n(7).m11802m(null).m11801l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoSurface() {
        m10093X0();
        m10080K0();
        m10086Q0(null);
        m10076G0(0, 0);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        m10093X0();
        if (surfaceHolder == null || surfaceHolder != this.f7563X) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        m10093X0();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        m10093X0();
        if (textureView == null || textureView != this.f7566a0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C2004u createMessage(C2004u.b bVar) {
        m10093X0();
        return m10099s0(bVar);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void decreaseDeviceVolume() {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9372c(1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
        m10093X0();
        return this.f7608v0.f201780o;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        m10093X0();
        this.f7585k.m10259y(z);
        Iterator<ExoPlayer.InterfaceC1790b> it = this.f7589m.iterator();
        while (it.hasNext()) {
            it.next().m9357I(z);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public hk0 getAnalyticsCollector() {
        m10093X0();
        return this.f7599r;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public Looper getApplicationLooper() {
        return this.f7601s;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C1818a getAudioAttributes() {
        m10093X0();
        return this.f7580h0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1789a getAudioComponent() {
        m10093X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public dhd getAudioDecoderCounters() {
        m10093X0();
        return this.f7576f0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public C1871k getAudioFormat() {
        m10093X0();
        return this.f7559T;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getAudioSessionId() {
        m10093X0();
        return this.f7578g0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public InterfaceC2003t.b getAvailableCommands() {
        m10093X0();
        return this.f7555P;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getBufferedPosition() {
        m10093X0();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        z580 z580Var = this.f7608v0;
        return z580Var.f201776k.equals(z580Var.f201767b) ? vck0.m197874l1(this.f7608v0.f201781p) : getDuration();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public p95 getClock() {
        return this.f7609w;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getContentBufferedPosition() {
        m10093X0();
        if (this.f7608v0.f201766a.m9722u()) {
            return this.f7614y0;
        }
        z580 z580Var = this.f7608v0;
        if (z580Var.f201776k.f114358d != z580Var.f201767b.f114358d) {
            return z580Var.f201766a.m9720r(getCurrentMediaItemIndex(), this.f7288a).m9752f();
        }
        long j = z580Var.f201781p;
        if (this.f7608v0.f201776k.m137607b()) {
            z580 z580Var2 = this.f7608v0;
            AbstractC1834c0.b bVarMo9400l = z580Var2.f201766a.mo9400l(z580Var2.f201776k.f114355a, this.f7591n);
            long jM9732i = bVarMo9400l.m9732i(this.f7608v0.f201776k.f114356b);
            j = jM9732i == Long.MIN_VALUE ? bVarMo9400l.f7303d : jM9732i;
        }
        z580 z580Var3 = this.f7608v0;
        return vck0.m197874l1(m10077H0(z580Var3.f201766a, z580Var3.f201776k, j));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getContentPosition() {
        m10093X0();
        return m10101u0(this.f7608v0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getCurrentAdGroupIndex() {
        m10093X0();
        if (isPlayingAd()) {
            return this.f7608v0.f201767b.f114356b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getCurrentAdIndexInAdGroup() {
        m10093X0();
        if (isPlayingAd()) {
            return this.f7608v0.f201767b.f114357c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public cxb getCurrentCues() {
        m10093X0();
        return this.f7586k0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getCurrentMediaItemIndex() {
        m10093X0();
        int iM10103w0 = m10103w0(this.f7608v0);
        if (iM10103w0 == -1) {
            return 0;
        }
        return iM10103w0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getCurrentPeriodIndex() {
        m10093X0();
        if (this.f7608v0.f201766a.m9722u()) {
            return this.f7612x0;
        }
        z580 z580Var = this.f7608v0;
        return z580Var.f201766a.mo9396f(z580Var.f201767b.f114355a);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getCurrentPosition() {
        m10093X0();
        return vck0.m197874l1(m10102v0(this.f7608v0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public AbstractC1834c0 getCurrentTimeline() {
        m10093X0();
        return this.f7608v0.f201766a;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public b6j0 getCurrentTrackGroups() {
        m10093X0();
        return this.f7608v0.f201773h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public s6j0 getCurrentTrackSelections() {
        m10093X0();
        return new s6j0(this.f7608v0.f201774i.f201930c);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public C1838d0 getCurrentTracks() {
        m10093X0();
        return this.f7608v0.f201774i.f201931d;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1792d getDeviceComponent() {
        m10093X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C1868h getDeviceInfo() {
        m10093X0();
        return this.f7602s0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getDeviceVolume() {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            return streamVolumeManager.m9375g();
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getDuration() {
        m10093X0();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        z580 z580Var = this.f7608v0;
        InterfaceC1965i.b bVar = z580Var.f201767b;
        z580Var.f201766a.mo9400l(bVar.f114355a, this.f7591n);
        return vck0.m197874l1(this.f7591n.m9728e(bVar.f114356b, bVar.f114357c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getMaxSeekToPreviousPosition() {
        m10093X0();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public C1922o getMediaMetadata() {
        m10093X0();
        return this.f7556Q;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        m10093X0();
        return this.f7554O;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public boolean getPlayWhenReady() {
        m10093X0();
        return this.f7608v0.f201777l;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.f7585k.m10155F();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public C1930s getPlaybackParameters() {
        m10093X0();
        return this.f7608v0.f201779n;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getPlaybackState() {
        m10093X0();
        return this.f7608v0.f201770e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getPlaybackSuppressionReason() {
        m10093X0();
        return this.f7608v0.f201778m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    @Nullable
    public ExoPlaybackException getPlayerError() {
        m10093X0();
        return this.f7608v0.f201771f;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C1922o getPlaylistMetadata() {
        m10093X0();
        return this.f7557R;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public InterfaceC2066x getRenderer(int i) {
        m10093X0();
        return this.f7577g[i];
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
        m10093X0();
        return this.f7577g.length;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int i) {
        m10093X0();
        return this.f7577g[i].getTrackType();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public int getRepeatMode() {
        m10093X0();
        return this.f7545F;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getSeekBackIncrement() {
        m10093X0();
        return this.f7605u;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getSeekForwardIncrement() {
        m10093X0();
        return this.f7607v;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public ice0 getSeekParameters() {
        m10093X0();
        return this.f7552M;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public boolean getShuffleModeEnabled() {
        m10093X0();
        return this.f7546G;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        m10093X0();
        return this.f7584j0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public sif0 getSurfaceSize() {
        m10093X0();
        return this.f7572d0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1793e getTextComponent() {
        m10093X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public long getTotalBufferedDuration() {
        m10093X0();
        return vck0.m197874l1(this.f7608v0.f201782q);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public w6j0 getTrackSelectionParameters() {
        m10093X0();
        return this.f7579h.mo151245c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public y6j0 getTrackSelector() {
        m10093X0();
        return this.f7579h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        m10093X0();
        return this.f7570c0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1794f getVideoComponent() {
        m10093X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public dhd getVideoDecoderCounters() {
        m10093X0();
        return this.f7574e0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public C1871k getVideoFormat() {
        m10093X0();
        return this.f7558S;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getVideoScalingMode() {
        m10093X0();
        return this.f7568b0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public val0 getVideoSize() {
        m10093X0();
        return this.f7604t0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public float getVolume() {
        m10093X0();
        return this.f7582i0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void increaseDeviceVolume() {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9376i(1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isDeviceMuted() {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            return streamVolumeManager.m9377j();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isLoading() {
        m10093X0();
        return this.f7608v0.f201772g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public boolean isPlayingAd() {
        m10093X0();
        return this.f7608v0.f201767b.m137607b();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isTunnelingEnabled() {
        m10093X0();
        for (erc0 erc0Var : this.f7608v0.f201774i.f201929b) {
            if (erc0Var != null && erc0Var.f92903a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final List<C1928q.c> m10094m0(int i, List<InterfaceC1965i> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1928q.c cVar = new C1928q.c(list.get(i2), this.f7595p);
            arrayList.add(cVar);
            this.f7593o.add(i2 + i, new e(cVar.f8240b, cVar.f8239a.m11142x()));
        }
        this.f7553N = this.f7553N.mo123968g(i, arrayList.size());
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void moveMediaItems(int i, int i2, int i3) {
        m10093X0();
        p11.m167007a(i >= 0 && i <= i2 && i3 >= 0);
        int size = this.f7593o.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        this.f7547H++;
        vck0.m197804I0(this.f7593o, i, iMin, iMin2);
        AbstractC1834c0 abstractC1834c0M10097q0 = m10097q0();
        z580 z580Var = this.f7608v0;
        z580 z580VarM10074E0 = m10074E0(z580Var, abstractC1834c0M10097q0, m10104x0(currentTimeline, abstractC1834c0M10097q0, m10103w0(z580Var), m10101u0(this.f7608v0)));
        this.f7585k.m10210g0(i, iMin, iMin2, this.f7553N);
        m10090U0(z580VarM10074E0, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final z580 m10095n0(z580 z580Var, int i, List<InterfaceC1965i> list) {
        AbstractC1834c0 abstractC1834c0 = z580Var.f201766a;
        this.f7547H++;
        List<C1928q.c> listM10094m0 = m10094m0(i, list);
        AbstractC1834c0 abstractC1834c0M10097q0 = m10097q0();
        z580 z580VarM10074E0 = m10074E0(z580Var, abstractC1834c0M10097q0, m10104x0(abstractC1834c0, abstractC1834c0M10097q0, m10103w0(z580Var), m10101u0(z580Var)));
        this.f7585k.m10227n(i, listM10094m0, this.f7553N);
        return z580VarM10074E0;
    }

    /* JADX INFO: renamed from: o0 */
    public final C1922o m10096o0() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            return this.f7606u0;
        }
        return this.f7606u0.m10721b().m10757J(currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).f7330c.f7963e).m10755H();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void prepare() {
        m10093X0();
        boolean playWhenReady = getPlayWhenReady();
        int iM9696p = this.f7540A.m9696p(playWhenReady, 2);
        m10089T0(playWhenReady, iM9696p, m10069y0(playWhenReady, iM9696p));
        z580 z580Var = this.f7608v0;
        if (z580Var.f201770e != 1) {
            return;
        }
        z580 z580VarM217282f = z580Var.m217282f(null);
        z580 z580VarM217284h = z580VarM217282f.m217284h(z580VarM217282f.f201766a.m9722u() ? 4 : 2);
        this.f7547H++;
        this.f7585k.m10222l0();
        m10090U0(z580VarM217284h, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final AbstractC1834c0 m10097q0() {
        return new C2057v(this.f7593o, this.f7553N);
    }

    /* JADX INFO: renamed from: r0 */
    public final List<InterfaceC1965i> m10098r0(List<C1921n> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f7597q.mo10958c(list.get(i)));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void release() {
        AudioTrack audioTrack;
        jwv.m143686f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + vck0.f180952e + "] [" + n8f.m158493b() + Constants.AES_SUFFIX);
        m10093X0();
        if (vck0.f180948a < 21 && (audioTrack = this.f7560U) != null) {
            audioTrack.release();
            this.f7560U = null;
        }
        this.f7615z.m9353b(false);
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9378k();
        }
        this.f7542C.m183995b(false);
        this.f7543D.m119632b(false);
        this.f7540A.m9689i();
        if (!this.f7585k.m10228n0()) {
            this.f7587l.m97944k(10, new aor.InterfaceC15678a() { // from class: l.e7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11760J(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.f7587l.m97942i();
        this.f7581i.mo108869e(null);
        this.f7603t.mo120879h(this.f7599r);
        z580 z580Var = this.f7608v0;
        if (z580Var.f201780o) {
            this.f7608v0 = z580Var.m217277a();
        }
        z580 z580VarM217284h = this.f7608v0.m217284h(1);
        this.f7608v0 = z580VarM217284h;
        z580 z580VarM217279c = z580VarM217284h.m217279c(z580VarM217284h.f201767b);
        this.f7608v0 = z580VarM217279c;
        z580VarM217279c.f201781p = z580VarM217279c.f201783r;
        this.f7608v0.f201782q = 0L;
        this.f7599r.release();
        this.f7579h.mo151248j();
        m10080K0();
        Surface surface = this.f7562W;
        if (surface != null) {
            surface.release();
            this.f7562W = null;
        }
        if (this.f7598q0) {
            ((PriorityTaskManager) p11.m167011e(this.f7596p0)).m12151b(0);
            this.f7598q0 = false;
        }
        this.f7586k0 = cxb.f82862c;
        this.f7600r0 = true;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(lk0 lk0Var) {
        m10093X0();
        this.f7599r.mo131431e0((lk0) p11.m167011e(lk0Var));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.InterfaceC1790b interfaceC1790b) {
        m10093X0();
        this.f7589m.remove(interfaceC1790b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void removeListener(InterfaceC2003t.d dVar) {
        m10093X0();
        this.f7587l.m97943j((InterfaceC2003t.d) p11.m167011e(dVar));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void removeMediaItems(int i, int i2) {
        m10093X0();
        p11.m167007a(i >= 0 && i2 >= i);
        int size = this.f7593o.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        z580 z580VarM10078I0 = m10078I0(this.f7608v0, i, iMin);
        m10090U0(z580VarM10078I0, 0, 1, !z580VarM10078I0.f201767b.f114355a.equals(this.f7608v0.f201767b.f114355a), 4, m10102v0(z580VarM10078I0), -1, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void replaceMediaItems(int i, int i2, List<C1921n> list) {
        m10093X0();
        p11.m167007a(i >= 0 && i2 >= i);
        int size = this.f7593o.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        List<InterfaceC1965i> listM10098r0 = m10098r0(list);
        if (this.f7593o.isEmpty()) {
            setMediaSources(listM10098r0, this.f7610w0 == -1);
        } else {
            z580 z580VarM10078I0 = m10078I0(m10095n0(this.f7608v0, iMin, listM10098r0), i, iMin);
            m10090U0(z580VarM10078I0, 0, 1, !z580VarM10078I0.f201767b.f114355a.equals(this.f7608v0.f201767b.f114355a), 4, m10102v0(z580VarM10078I0), -1, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final C2004u m10099s0(C2004u.b bVar) {
        int iM10103w0 = m10103w0(this.f7608v0);
        C1870j c1870j = this.f7585k;
        AbstractC1834c0 abstractC1834c0 = this.f7608v0.f201766a;
        if (iM10103w0 == -1) {
            iM10103w0 = 0;
        }
        return new C2004u(c1870j, bVar, abstractC1834c0, iM10103w0, this.f7609w, c1870j.m10155F());
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setAudioAttributes(final C1818a c1818a, boolean z) {
        m10093X0();
        if (this.f7600r0) {
            return;
        }
        if (!vck0.m197845c(this.f7580h0, c1818a)) {
            this.f7580h0 = c1818a;
            m10081L0(1, 3, c1818a);
            StreamVolumeManager streamVolumeManager = this.f7541B;
            if (streamVolumeManager != null) {
                streamVolumeManager.m9380m(vck0.m197867j0(c1818a.f7151c));
            }
            this.f7587l.m97941h(20, new aor.InterfaceC15678a() { // from class: l.d7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11762M(c1818a);
                }
            });
        }
        this.f7540A.m9693m(z ? c1818a : null);
        this.f7579h.mo151249l(c1818a);
        boolean playWhenReady = getPlayWhenReady();
        int iM9696p = this.f7540A.m9696p(playWhenReady, getPlaybackState());
        m10089T0(playWhenReady, iM9696p, m10069y0(playWhenReady, iM9696p));
        this.f7587l.m97939f();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setAudioSessionId(final int i) {
        m10093X0();
        if (this.f7578g0 == i) {
            return;
        }
        if (i == 0) {
            i = vck0.f180948a < 21 ? m10073D0(0) : vck0.m197799G(this.f7573e);
        } else if (vck0.f180948a < 21) {
            m10073D0(i);
        }
        this.f7578g0 = i;
        m10081L0(1, 10, Integer.valueOf(i));
        m10081L0(2, 10, Integer.valueOf(i));
        this.f7587l.m97944k(21, new aor.InterfaceC15678a() { // from class: l.l7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11755D(i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setAuxEffectInfo(pj1 pj1Var) {
        m10093X0();
        m10081L0(1, 6, pj1Var);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setCameraMotionListener(ha4 ha4Var) {
        m10093X0();
        this.f7590m0 = ha4Var;
        m10099s0(this.f7613y).m11803n(8).m11802m(ha4Var).m11801l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void setDeviceMuted(boolean z) {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9379l(z, 1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void setDeviceVolume(int i) {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9381n(i, 1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean z) {
        m10093X0();
        if (this.f7551L != z) {
            this.f7551L = z;
            if (this.f7585k.m10176P0(z)) {
                return;
            }
            m10087R0(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
        m10093X0();
        if (this.f7600r0) {
            return;
        }
        this.f7615z.m9353b(z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setMediaItems(List<C1921n> list, boolean z) {
        m10093X0();
        setMediaSources(m10098r0(list), z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(InterfaceC1965i interfaceC1965i, long j) {
        m10093X0();
        setMediaSources(Collections.singletonList(interfaceC1965i), 0, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<InterfaceC1965i> list, boolean z) {
        m10093X0();
        m10083N0(list, -1, -9223372036854775807L, z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
        m10093X0();
        if (this.f7554O == z) {
            return;
        }
        this.f7554O = z;
        this.f7585k.m10186V0(z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setPlayWhenReady(boolean z) {
        m10093X0();
        int iM9696p = this.f7540A.m9696p(z, getPlaybackState());
        m10089T0(z, iM9696p, m10069y0(z, iM9696p));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setPlaybackParameters(C1930s c1930s) {
        m10093X0();
        if (c1930s == null) {
            c1930s = C1930s.f8247d;
        }
        if (this.f7608v0.f201779n.equals(c1930s)) {
            return;
        }
        z580 z580VarM217283g = this.f7608v0.m217283g(c1930s);
        this.f7547H++;
        this.f7585k.m10193Z0(c1930s);
        m10090U0(z580VarM217283g, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPlaylistMetadata(C1922o c1922o) {
        m10093X0();
        p11.m167011e(c1922o);
        if (c1922o.equals(this.f7557R)) {
            return;
        }
        this.f7557R = c1922o;
        this.f7587l.m97944k(15, new aor.InterfaceC15678a() { // from class: l.q7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11782r0(this.f153043a.f7557R);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @RequiresApi(23)
    public void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        m10093X0();
        m10081L0(1, 12, audioDeviceInfo);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        m10093X0();
        if (vck0.m197845c(this.f7596p0, priorityTaskManager)) {
            return;
        }
        if (this.f7598q0) {
            ((PriorityTaskManager) p11.m167011e(this.f7596p0)).m12151b(0);
        }
        if (priorityTaskManager == null || !isLoading()) {
            this.f7598q0 = false;
        } else {
            priorityTaskManager.m12150a(0);
            this.f7598q0 = true;
        }
        this.f7596p0 = priorityTaskManager;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setRepeatMode(final int i) {
        m10093X0();
        if (this.f7545F != i) {
            this.f7545F = i;
            this.f7585k.m10198b1(i);
            this.f7587l.m97941h(8, new aor.InterfaceC15678a() { // from class: l.k7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11784u0(i);
                }
            });
            m10088S0();
            this.f7587l.m97939f();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@Nullable ice0 ice0Var) {
        m10093X0();
        if (ice0Var == null) {
            ice0Var = ice0.f112455g;
        }
        if (this.f7552M.equals(ice0Var)) {
            return;
        }
        this.f7552M = ice0Var;
        this.f7585k.m10204d1(ice0Var);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setShuffleModeEnabled(final boolean z) {
        m10093X0();
        if (this.f7546G != z) {
            this.f7546G = z;
            this.f7585k.m10209f1(z);
            this.f7587l.m97941h(9, new aor.InterfaceC15678a() { // from class: l.n7f
                @Override // p149l.aor.InterfaceC15678a
                public final void invoke(Object obj) {
                    ((InterfaceC2003t.d) obj).mo11757F(z);
                }
            });
            m10088S0();
            this.f7587l.m97939f();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(g0f0 g0f0Var) {
        m10093X0();
        p11.m167007a(g0f0Var.getLength() == this.f7593o.size());
        this.f7553N = g0f0Var;
        AbstractC1834c0 abstractC1834c0M10097q0 = m10097q0();
        z580 z580VarM10074E0 = m10074E0(this.f7608v0, abstractC1834c0M10097q0, m10075F0(abstractC1834c0M10097q0, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f7547H++;
        this.f7585k.m10213h1(g0f0Var);
        m10090U0(z580VarM10074E0, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSkipSilenceEnabled(final boolean z) {
        m10093X0();
        if (this.f7584j0 == z) {
            return;
        }
        this.f7584j0 = z;
        m10081L0(1, 9, Boolean.valueOf(z));
        this.f7587l.m97944k(23, new aor.InterfaceC15678a() { // from class: l.f7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11769a(z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setTrackSelectionParameters(final w6j0 w6j0Var) {
        m10093X0();
        if (!this.f7579h.mo151247h() || w6j0Var.equals(this.f7579h.mo151245c())) {
            return;
        }
        this.f7579h.mo151250m(w6j0Var);
        this.f7587l.m97944k(19, new aor.InterfaceC15678a() { // from class: l.o7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11761K(w6j0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int i) {
        m10093X0();
        if (this.f7570c0 == i) {
            return;
        }
        this.f7570c0 = i;
        m10081L0(2, 5, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoEffects(List<uoe> list) {
        m10093X0();
        m10081L0(2, 13, list);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoFrameMetadataListener(e5l0 e5l0Var) {
        m10093X0();
        this.f7588l0 = e5l0Var;
        m10099s0(this.f7613y).m11803n(7).m11802m(e5l0Var).m11801l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoScalingMode(int i) {
        m10093X0();
        this.f7568b0 = i;
        m10081L0(2, 4, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoSurface(@Nullable Surface surface) {
        m10093X0();
        m10080K0();
        m10086Q0(surface);
        int i = surface == null ? 0 : -1;
        m10076G0(i, i);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        m10093X0();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        m10080K0();
        this.f7565Z = true;
        this.f7563X = surfaceHolder;
        surfaceHolder.addCallback(this.f7611x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m10086Q0(null);
            m10076G0(0, 0);
        } else {
            m10086Q0(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m10076G0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        m10093X0();
        if (surfaceView instanceof w3l0) {
            m10080K0();
            m10086Q0(surfaceView);
            m10084O0(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            m10080K0();
            this.f7564Y = (SphericalGLSurfaceView) surfaceView;
            m10099s0(this.f7613y).m11803n(10000).m11802m(this.f7564Y).m11801l();
            this.f7564Y.m12190d(this.f7611x);
            m10086Q0(this.f7564Y.getVideoSurface());
            m10084O0(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setVideoTextureView(@Nullable TextureView textureView) {
        m10093X0();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        m10080K0();
        this.f7566a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            jwv.m143689i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f7611x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m10086Q0(null);
            m10076G0(0, 0);
        } else {
            m10085P0(surfaceTexture);
            m10076G0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVolume(float f) {
        m10093X0();
        final float fM197882p = vck0.m197882p(f, 0.0f, 1.0f);
        if (this.f7582i0 == fM197882p) {
            return;
        }
        this.f7582i0 = fM197882p;
        m10082M0();
        this.f7587l.m97944k(22, new aor.InterfaceC15678a() { // from class: l.g7f
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((InterfaceC2003t.d) obj).mo11776k0(fM197882p);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int i) {
        m10093X0();
        if (i == 0) {
            this.f7542C.m183994a(false);
            this.f7543D.m119631a(false);
        } else if (i == 1) {
            this.f7542C.m183994a(true);
            this.f7543D.m119631a(false);
        } else {
            if (i != 2) {
                return;
            }
            this.f7542C.m183994a(true);
            this.f7543D.m119631a(true);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void stop() {
        m10093X0();
        this.f7540A.m9696p(getPlayWhenReady(), 1);
        m10087R0(null);
        this.f7586k0 = new cxb(ImmutableList.m15685of(), this.f7608v0.f201783r);
    }

    /* JADX INFO: renamed from: t0 */
    public final Pair<Boolean, Integer> m10100t0(z580 z580Var, z580 z580Var2, boolean z, int i, boolean z2, boolean z3) {
        AbstractC1834c0 abstractC1834c0 = z580Var2.f201766a;
        AbstractC1834c0 abstractC1834c1 = z580Var.f201766a;
        if (abstractC1834c1.m9722u() && abstractC1834c0.m9722u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (abstractC1834c1.m9722u() != abstractC1834c0.m9722u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (abstractC1834c0.m9720r(abstractC1834c0.mo9400l(z580Var2.f201767b.f114355a, this.f7591n).f7302c, this.f7288a).f7328a.equals(abstractC1834c1.m9720r(abstractC1834c1.mo9400l(z580Var.f201767b.f114355a, this.f7591n).f7302c, this.f7288a).f7328a)) {
            if (z && i == 0 && z580Var2.f201767b.f114358d < z580Var.f201767b.f114358d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z && i == 1 && z3) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            ohg0.m164364a();
            return null;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: u0 */
    public final long m10101u0(z580 z580Var) {
        if (!z580Var.f201767b.m137607b()) {
            return vck0.m197874l1(m10102v0(z580Var));
        }
        z580Var.f201766a.mo9400l(z580Var.f201767b.f114355a, this.f7591n);
        return z580Var.f201768c == -9223372036854775807L ? z580Var.f201766a.m9720r(m10103w0(z580Var), this.f7288a).m9750d() : this.f7591n.m9739p() + vck0.m197874l1(z580Var.f201768c);
    }

    /* JADX INFO: renamed from: v0 */
    public final long m10102v0(z580 z580Var) {
        if (z580Var.f201766a.m9722u()) {
            return vck0.m197806J0(this.f7614y0);
        }
        long jM217287m = z580Var.f201780o ? z580Var.m217287m() : z580Var.f201783r;
        return z580Var.f201767b.m137607b() ? jM217287m : m10077H0(z580Var.f201766a, z580Var.f201767b, jM217287m);
    }

    /* JADX INFO: renamed from: w0 */
    public final int m10103w0(z580 z580Var) {
        return z580Var.f201766a.m9722u() ? this.f7610w0 : z580Var.f201766a.mo9400l(z580Var.f201767b.f114355a, this.f7591n).f7302c;
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public final Pair<Object, Long> m10104x0(AbstractC1834c0 abstractC1834c0, AbstractC1834c0 abstractC1834c1, int i, long j) {
        if (abstractC1834c0.m9722u() || abstractC1834c1.m9722u()) {
            boolean z = !abstractC1834c0.m9722u() && abstractC1834c1.m9722u();
            return m10075F0(abstractC1834c1, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair<Object, Long> pairM9718n = abstractC1834c0.m9718n(this.f7288a, this.f7591n, i, vck0.m197806J0(j));
        Object obj = ((Pair) vck0.m197866j(pairM9718n)).first;
        if (abstractC1834c1.mo9396f(obj) != -1) {
            return pairM9718n;
        }
        Object objM10139D0 = C1870j.m10139D0(this.f7288a, this.f7591n, this.f7545F, this.f7546G, obj, abstractC1834c0, abstractC1834c1);
        if (objM10139D0 == null) {
            return m10075F0(abstractC1834c1, -1, -9223372036854775807L);
        }
        abstractC1834c1.mo9400l(objM10139D0, this.f7591n);
        int i2 = this.f7591n.f7302c;
        return m10075F0(abstractC1834c1, i2, abstractC1834c1.m9720r(i2, this.f7288a).m9750d());
    }

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC2003t.e m10105z0(long j) {
        Object obj;
        int iMo9396f;
        C1921n c1921n;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.f7608v0.f201766a.m9722u()) {
            obj = null;
            iMo9396f = -1;
            c1921n = null;
            obj2 = null;
        } else {
            z580 z580Var = this.f7608v0;
            Object obj3 = z580Var.f201767b.f114355a;
            z580Var.f201766a.mo9400l(obj3, this.f7591n);
            iMo9396f = this.f7608v0.f201766a.mo9396f(obj3);
            obj2 = obj3;
            obj = this.f7608v0.f201766a.m9720r(currentMediaItemIndex, this.f7288a).f7328a;
            c1921n = this.f7288a.f7330c;
        }
        int i = iMo9396f;
        long jM197874l1 = vck0.m197874l1(j);
        long jM197874l2 = this.f7608v0.f201767b.m137607b() ? vck0.m197874l1(m10014B0(this.f7608v0)) : jM197874l1;
        InterfaceC1965i.b bVar = this.f7608v0.f201767b;
        return new InterfaceC2003t.e(obj, currentMediaItemIndex, c1921n, obj2, i, jM197874l1, jM197874l2, bVar.f114356b, bVar.f114357c);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int i, InterfaceC1965i interfaceC1965i) {
        m10093X0();
        addMediaSources(i, Collections.singletonList(interfaceC1965i));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public void setMediaItems(List<C1921n> list, int i, long j) {
        m10093X0();
        setMediaSources(m10098r0(list), i, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void decreaseDeviceVolume(int i) {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9372c(i);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void increaseDeviceVolume(int i) {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9376i(i);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setDeviceMuted(boolean z, int i) {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9379l(z, i);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setDeviceVolume(int i, int i2) {
        m10093X0();
        StreamVolumeManager streamVolumeManager = this.f7541B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9381n(i, i2);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(InterfaceC1965i interfaceC1965i) {
        m10093X0();
        setMediaSources(Collections.singletonList(interfaceC1965i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(InterfaceC1965i interfaceC1965i, boolean z) {
        m10093X0();
        setMediaSources(Collections.singletonList(interfaceC1965i), z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoSurface(@Nullable Surface surface) {
        m10093X0();
        if (surface == null || surface != this.f7561V) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<InterfaceC1965i> list) {
        m10093X0();
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<InterfaceC1965i> list, int i, long j) {
        m10093X0();
        m10083N0(list, i, j, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List<InterfaceC1965i> list) {
        m10093X0();
        addMediaSources(this.f7593o.size(), list);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(InterfaceC1965i interfaceC1965i) {
        m10093X0();
        setMediaSource(interfaceC1965i);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(InterfaceC1965i interfaceC1965i, boolean z, boolean z2) {
        m10093X0();
        setMediaSource(interfaceC1965i, z);
        prepare();
    }
}
