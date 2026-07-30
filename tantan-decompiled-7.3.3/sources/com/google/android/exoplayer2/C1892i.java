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
import com.google.android.exoplayer2.C1892i;
import com.google.android.exoplayer2.C1893j;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.audio.InterfaceC1843c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1988i;
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
import p153l.adl0;
import p153l.agj0;
import p153l.asi0;
import p153l.ayx;
import p153l.bf80;
import p153l.bmk0;
import p153l.bqr;
import p153l.brf0;
import p153l.cgj0;
import p153l.dgj0;
import p153l.dk0;
import p153l.fe80;
import p153l.ffj0;
import p153l.g6y;
import p153l.ga00;
import p153l.gb4;
import p153l.hk0;
import p153l.iel0;
import p153l.jid;
import p153l.jzc0;
import p153l.kfq0;
import p153l.kyv;
import p153l.md2;
import p153l.myb;
import p153l.n8f0;
import p153l.nid;
import p153l.nke0;
import p153l.qa5;
import p153l.qyb;
import p153l.sxk;
import p153l.t9f;
import p153l.u9f;
import p153l.w11;
import p153l.wfj0;
import p153l.wj1;
import p153l.wjl0;
import p153l.wop0;
import p153l.wpg0;
import p153l.wt5;
import p153l.wtq0;
import p153l.ype;
import p153l.zjl0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1892i extends AbstractC1856c implements ExoPlayer, ExoPlayer.InterfaceC1812a, ExoPlayer.InterfaceC1817f, ExoPlayer.InterfaceC1816e, ExoPlayer.InterfaceC1815d {

    /* JADX INFO: renamed from: A */
    public final C1854b f7577A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public final StreamVolumeManager f7578B;

    /* JADX INFO: renamed from: C */
    public final wop0 f7579C;

    /* JADX INFO: renamed from: D */
    public final kfq0 f7580D;

    /* JADX INFO: renamed from: E */
    public final long f7581E;

    /* JADX INFO: renamed from: F */
    public int f7582F;

    /* JADX INFO: renamed from: G */
    public boolean f7583G;

    /* JADX INFO: renamed from: H */
    public int f7584H;

    /* JADX INFO: renamed from: I */
    public int f7585I;

    /* JADX INFO: renamed from: J */
    public boolean f7586J;

    /* JADX INFO: renamed from: K */
    public int f7587K;

    /* JADX INFO: renamed from: L */
    public boolean f7588L;

    /* JADX INFO: renamed from: M */
    public nke0 f7589M;

    /* JADX INFO: renamed from: N */
    public n8f0 f7590N;

    /* JADX INFO: renamed from: O */
    public boolean f7591O;

    /* JADX INFO: renamed from: P */
    public InterfaceC2026t.b f7592P;

    /* JADX INFO: renamed from: Q */
    public C1945o f7593Q;

    /* JADX INFO: renamed from: R */
    public C1945o f7594R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public C1894k f7595S;

    /* JADX INFO: renamed from: T */
    @Nullable
    public C1894k f7596T;

    /* JADX INFO: renamed from: U */
    @Nullable
    public AudioTrack f7597U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public Object f7598V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Surface f7599W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public SurfaceHolder f7600X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public SphericalGLSurfaceView f7601Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7602Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public TextureView f7603a0;

    /* JADX INFO: renamed from: b */
    public final dgj0 f7604b;

    /* JADX INFO: renamed from: b0 */
    public int f7605b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2026t.b f7606c;

    /* JADX INFO: renamed from: c0 */
    public int f7607c0;

    /* JADX INFO: renamed from: d */
    public final wt5 f7608d;

    /* JADX INFO: renamed from: d0 */
    public brf0 f7609d0;

    /* JADX INFO: renamed from: e */
    public final Context f7610e;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public jid f7611e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2026t f7612f;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public jid f7613f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2089x[] f7614g;

    /* JADX INFO: renamed from: g0 */
    public int f7615g0;

    /* JADX INFO: renamed from: h */
    public final cgj0 f7616h;

    /* JADX INFO: renamed from: h0 */
    public C1841a f7617h0;

    /* JADX INFO: renamed from: i */
    public final sxk f7618i;

    /* JADX INFO: renamed from: i0 */
    public float f7619i0;

    /* JADX INFO: renamed from: j */
    public final C1893j.f f7620j;

    /* JADX INFO: renamed from: j0 */
    public boolean f7621j0;

    /* JADX INFO: renamed from: k */
    public final C1893j f7622k;

    /* JADX INFO: renamed from: k0 */
    public qyb f7623k0;

    /* JADX INFO: renamed from: l */
    public final bqr<InterfaceC2026t.d> f7624l;

    /* JADX INFO: renamed from: l0 */
    @Nullable
    public iel0 f7625l0;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArraySet<ExoPlayer.InterfaceC1813b> f7626m;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public gb4 f7627m0;

    /* JADX INFO: renamed from: n */
    public final AbstractC1857c0.b f7628n;

    /* JADX INFO: renamed from: n0 */
    public boolean f7629n0;

    /* JADX INFO: renamed from: o */
    public final List<e> f7630o;

    /* JADX INFO: renamed from: o0 */
    public boolean f7631o0;

    /* JADX INFO: renamed from: p */
    public final boolean f7632p;

    /* JADX INFO: renamed from: p0 */
    @Nullable
    public PriorityTaskManager f7633p0;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1988i.a f7634q;

    /* JADX INFO: renamed from: q0 */
    public boolean f7635q0;

    /* JADX INFO: renamed from: r */
    public final dk0 f7636r;

    /* JADX INFO: renamed from: r0 */
    public boolean f7637r0;

    /* JADX INFO: renamed from: s */
    public final Looper f7638s;

    /* JADX INFO: renamed from: s0 */
    public C1891h f7639s0;

    /* JADX INFO: renamed from: t */
    public final md2 f7640t;

    /* JADX INFO: renamed from: t0 */
    public zjl0 f7641t0;

    /* JADX INFO: renamed from: u */
    public final long f7642u;

    /* JADX INFO: renamed from: u0 */
    public C1945o f7643u0;

    /* JADX INFO: renamed from: v */
    public final long f7644v;

    /* JADX INFO: renamed from: v0 */
    public fe80 f7645v0;

    /* JADX INFO: renamed from: w */
    public final qa5 f7646w;

    /* JADX INFO: renamed from: w0 */
    public int f7647w0;

    /* JADX INFO: renamed from: x */
    public final c f7648x;

    /* JADX INFO: renamed from: x0 */
    public int f7649x0;

    /* JADX INFO: renamed from: y */
    public final d f7650y;

    /* JADX INFO: renamed from: y0 */
    public long f7651y0;

    /* JADX INFO: renamed from: z */
    public final AudioBecomingNoisyManager f7652z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$b */
    @RequiresApi(31)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static bf80 m10160a(Context context, C1892i c1892i, boolean z) {
            ayx ayxVarM100942z0 = ayx.m100942z0(context);
            if (ayxVarM100942z0 == null) {
                kyv.m152151i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new bf80(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                c1892i.addAnalyticsListener(ayxVarM100942z0);
            }
            return new bf80(ayxVarM100942z0.m100945G0());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$c */
    public final class c implements wjl0, InterfaceC1843c, asi0, ga00, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.InterfaceC2085b, C1854b.b, AudioBecomingNoisyManager.InterfaceC1811a, StreamVolumeManager.InterfaceC1819b, ExoPlayer.InterfaceC1813b {
        public c() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.InterfaceC2085b
        /* JADX INFO: renamed from: A */
        public void mo10169A(Surface surface) {
            C1892i.this.m10140Q0(null);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.InterfaceC2085b
        /* JADX INFO: renamed from: B */
        public void mo10170B(Surface surface) {
            C1892i.this.m10140Q0(surface);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.InterfaceC1819b
        /* JADX INFO: renamed from: C */
        public void mo9438C(final int i, final boolean z) {
            C1892i.this.f7624l.m105965k(30, new bqr.InterfaceC16083a() { // from class: l.l9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11812H(i, z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.C1854b.b
        /* JADX INFO: renamed from: F */
        public void mo9753F(float f) {
            C1892i.this.m10136M0();
        }

        @Override // com.google.android.exoplayer2.C1854b.b
        /* JADX INFO: renamed from: G */
        public void mo9754G(int i) {
            boolean playWhenReady = C1892i.this.getPlayWhenReady();
            C1892i.this.m10143T0(playWhenReady, i, C1892i.m10123y0(playWhenReady, i));
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: a */
        public void mo9606a(final boolean z) {
            if (C1892i.this.f7621j0 == z) {
                return;
            }
            C1892i.this.f7621j0 = z;
            C1892i.this.f7624l.m105965k(23, new bqr.InterfaceC16083a() { // from class: l.p9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11823a(z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: b */
        public void mo9607b(Exception exc) {
            C1892i.this.f7636r.mo116165b(exc);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: c */
        public void mo10171c(String str) {
            C1892i.this.f7636r.mo116166c(str);
        }

        @Override // p153l.asi0
        /* JADX INFO: renamed from: d */
        public void mo10172d(final qyb qybVar) {
            C1892i.this.f7623k0 = qybVar;
            C1892i.this.f7624l.m105965k(27, new bqr.InterfaceC16083a() { // from class: l.i9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11825d(qybVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: e */
        public void mo9608e(String str) {
            C1892i.this.f7636r.mo116168e(str);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: f */
        public void mo9609f(String str, long j, long j2) {
            C1892i.this.f7636r.mo116170f(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: g */
        public void mo9610g(C1894k c1894k, @Nullable nid nidVar) {
            C1892i.this.f7596T = c1894k;
            C1892i.this.f7636r.mo116171g(c1894k, nidVar);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: h */
        public void mo10173h(C1894k c1894k, @Nullable nid nidVar) {
            C1892i.this.f7595S = c1894k;
            C1892i.this.f7636r.mo116172h(c1894k, nidVar);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: i */
        public void mo10174i(int i, long j) {
            C1892i.this.f7636r.mo116173i(i, j);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: j */
        public void mo9611j(Exception exc) {
            C1892i.this.f7636r.mo116174j(exc);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: k */
        public void mo10175k(long j, int i) {
            C1892i.this.f7636r.mo116175k(j, i);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: l */
        public void mo10176l(String str, long j, long j2) {
            C1892i.this.f7636r.mo116176l(str, j, j2);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: m */
        public void mo10177m(jid jidVar) {
            C1892i.this.f7611e0 = jidVar;
            C1892i.this.f7636r.mo116177m(jidVar);
        }

        @Override // p153l.ga00
        /* JADX INFO: renamed from: n */
        public void mo10178n(final Metadata metadata) {
            C1892i c1892i = C1892i.this;
            c1892i.f7643u0 = c1892i.f7643u0.m10775b().m10812K(metadata).m10809H();
            C1945o c1945oM10150o0 = C1892i.this.m10150o0();
            if (!c1945oM10150o0.equals(C1892i.this.f7593Q)) {
                C1892i.this.f7593Q = c1945oM10150o0;
                C1892i.this.f7624l.m105962h(14, new bqr.InterfaceC16083a() { // from class: l.j9f
                    @Override // p153l.bqr.InterfaceC16083a
                    public final void invoke(Object obj) {
                        ((InterfaceC2026t.d) obj).mo11810E(C1892i.this.f7593Q);
                    }
                });
            }
            C1892i.this.f7624l.m105962h(28, new bqr.InterfaceC16083a() { // from class: l.k9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11832n(metadata);
                }
            });
            C1892i.this.f7624l.m105960f();
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: o */
        public void mo10179o(jid jidVar) {
            C1892i.this.f7636r.mo116179o(jidVar);
            C1892i.this.f7595S = null;
            C1892i.this.f7611e0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C1892i.this.m10139P0(surfaceTexture);
            C1892i.this.m10130G0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1892i.this.m10140Q0(null);
            C1892i.this.m10130G0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C1892i.this.m10130G0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p153l.asi0
        /* JADX INFO: renamed from: p */
        public void mo10180p(final List<myb> list) {
            C1892i.this.f7624l.m105965k(27, new bqr.InterfaceC16083a() { // from class: l.h9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11835p(list);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: q */
        public void mo9612q(long j) {
            C1892i.this.f7636r.mo116180q(j);
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: r */
        public void mo10181r(Exception exc) {
            C1892i.this.f7636r.mo116181r(exc);
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.InterfaceC1811a
        /* JADX INFO: renamed from: s */
        public void mo9408s() {
            C1892i.this.m10143T0(false, -1, 3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C1892i.this.m10130G0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C1892i.this.f7602Z) {
                C1892i.this.m10140Q0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C1892i.this.f7602Z) {
                C1892i.this.m10140Q0(null);
            }
            C1892i.this.m10130G0(0, 0);
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: t */
        public void mo9613t(jid jidVar) {
            C1892i.this.f7613f0 = jidVar;
            C1892i.this.f7636r.mo116182t(jidVar);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.InterfaceC1813b
        /* JADX INFO: renamed from: u */
        public void mo9412u(boolean z) {
            C1892i.this.m10146W0();
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: v */
        public void mo9614v(jid jidVar) {
            C1892i.this.f7636r.mo116183v(jidVar);
            C1892i.this.f7596T = null;
            C1892i.this.f7613f0 = null;
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: w */
        public void mo10182w(Object obj, long j) {
            C1892i.this.f7636r.mo116184w(obj, j);
            if (C1892i.this.f7598V == obj) {
                C1892i.this.f7624l.m105965k(26, new bqr.InterfaceC16083a() { // from class: l.n9f
                    @Override // p153l.bqr.InterfaceC16083a
                    public final void invoke(Object obj2) {
                        ((InterfaceC2026t.d) obj2).mo11824b0();
                    }
                });
            }
        }

        @Override // p153l.wjl0
        /* JADX INFO: renamed from: x */
        public void mo10183x(final zjl0 zjl0Var) {
            C1892i.this.f7641t0 = zjl0Var;
            C1892i.this.f7624l.m105965k(25, new bqr.InterfaceC16083a() { // from class: l.o9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11839x(zjl0Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC1843c
        /* JADX INFO: renamed from: y */
        public void mo9615y(int i, long j, long j2) {
            C1892i.this.f7636r.mo116185y(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.InterfaceC1819b
        /* JADX INFO: renamed from: z */
        public void mo9439z(int i) {
            final C1891h c1891hM10113p0 = C1892i.m10113p0(C1892i.this.f7578B);
            if (c1891hM10113p0.equals(C1892i.this.f7639s0)) {
                return;
            }
            C1892i.this.f7639s0 = c1891hM10113p0;
            C1892i.this.f7624l.m105965k(29, new bqr.InterfaceC16083a() { // from class: l.m9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11822W(c1891hM10113p0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$d */
    public static final class d implements iel0, gb4, C2027u.b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public iel0 f7654a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public gb4 f7655b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public iel0 f7656c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public gb4 f7657d;

        public d() {
        }

        @Override // p153l.iel0
        /* JADX INFO: renamed from: a */
        public void mo10184a(long j, long j2, C1894k c1894k, @Nullable MediaFormat mediaFormat) {
            iel0 iel0Var = this.f7656c;
            if (iel0Var != null) {
                iel0Var.mo10184a(j, j2, c1894k, mediaFormat);
            }
            iel0 iel0Var2 = this.f7654a;
            if (iel0Var2 != null) {
                iel0Var2.mo10184a(j, j2, c1894k, mediaFormat);
            }
        }

        @Override // p153l.gb4
        /* JADX INFO: renamed from: e */
        public void mo10185e(long j, float[] fArr) {
            gb4 gb4Var = this.f7657d;
            if (gb4Var != null) {
                gb4Var.mo10185e(j, fArr);
            }
            gb4 gb4Var2 = this.f7655b;
            if (gb4Var2 != null) {
                gb4Var2.mo10185e(j, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.C2027u.b
        /* JADX INFO: renamed from: f */
        public void mo9709f(int i, @Nullable Object obj) {
            if (i == 7) {
                this.f7654a = (iel0) obj;
                return;
            }
            if (i == 8) {
                this.f7655b = (gb4) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f7656c = null;
                this.f7657d = null;
            } else {
                this.f7656c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f7657d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // p153l.gb4
        /* JADX INFO: renamed from: h */
        public void mo10186h() {
            gb4 gb4Var = this.f7657d;
            if (gb4Var != null) {
                gb4Var.mo10186h();
            }
            gb4 gb4Var2 = this.f7655b;
            if (gb4Var2 != null) {
                gb4Var2.mo10186h();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.i$e */
    public static final class e implements g6y {

        /* JADX INFO: renamed from: a */
        public final Object f7658a;

        /* JADX INFO: renamed from: b */
        public AbstractC1857c0 f7659b;

        public e(Object obj, AbstractC1857c0 abstractC1857c0) {
            this.f7658a = obj;
            this.f7659b = abstractC1857c0;
        }

        @Override // p153l.g6y
        /* JADX INFO: renamed from: a */
        public Object mo10188a() {
            return this.f7658a;
        }

        @Override // p153l.g6y
        /* JADX INFO: renamed from: b */
        public AbstractC1857c0 mo10189b() {
            return this.f7659b;
        }
    }

    static {
        t9f.m189752a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C1892i(ExoPlayer.C1814c c1814c, @Nullable InterfaceC2026t interfaceC2026t) {
        wt5 wt5Var = new wt5();
        this.f7608d = wt5Var;
        try {
            kyv.m152148f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + bmk0.f77317e + Constants.AES_SUFFIX);
            Context applicationContext = c1814c.f7023a.getApplicationContext();
            this.f7610e = applicationContext;
            dk0 dk0VarApply = c1814c.f7031i.apply(c1814c.f7024b);
            this.f7636r = dk0VarApply;
            this.f7633p0 = c1814c.f7033k;
            this.f7617h0 = c1814c.f7034l;
            this.f7605b0 = c1814c.f7040r;
            this.f7607c0 = c1814c.f7041s;
            this.f7621j0 = c1814c.f7038p;
            this.f7581E = c1814c.f7048z;
            c cVar = new c();
            this.f7648x = cVar;
            d dVar = new d();
            this.f7650y = dVar;
            Handler handler = new Handler(c1814c.f7032j);
            InterfaceC2089x[] interfaceC2089xArrMo156429a = c1814c.f7026d.get().mo156429a(handler, cVar, cVar, cVar, cVar);
            this.f7614g = interfaceC2089xArrMo156429a;
            w11.m204371g(interfaceC2089xArrMo156429a.length > 0);
            cgj0 cgj0Var = c1814c.f7028f.get();
            this.f7616h = cgj0Var;
            this.f7634q = c1814c.f7027e.get();
            md2 md2Var = c1814c.f7030h.get();
            this.f7640t = md2Var;
            this.f7632p = c1814c.f7042t;
            this.f7589M = c1814c.f7043u;
            this.f7642u = c1814c.f7044v;
            this.f7644v = c1814c.f7045w;
            this.f7591O = c1814c.f7019A;
            Looper looper = c1814c.f7032j;
            this.f7638s = looper;
            qa5 qa5Var = c1814c.f7024b;
            this.f7646w = qa5Var;
            InterfaceC2026t interfaceC2026t2 = interfaceC2026t == null ? this : interfaceC2026t;
            this.f7612f = interfaceC2026t2;
            this.f7624l = new bqr<>(looper, qa5Var, new bqr.InterfaceC16084b() { // from class: l.n8f
                @Override // p153l.bqr.InterfaceC16084b
                /* JADX INFO: renamed from: a */
                public final void mo105967a(Object obj, zri zriVar) {
                    ((InterfaceC2026t.d) obj).mo11831l0(this.f140677a.f7612f, new InterfaceC2026t.c(zriVar));
                }
            });
            this.f7626m = new CopyOnWriteArraySet<>();
            this.f7630o = new ArrayList();
            this.f7590N = new n8f0.C18822a(0);
            dgj0 dgj0Var = new dgj0(new jzc0[interfaceC2089xArrMo156429a.length], new u9f[interfaceC2089xArrMo156429a.length], C1861d0.f7397b, null);
            this.f7604b = dgj0Var;
            this.f7628n = new AbstractC1857c0.b();
            InterfaceC2026t.b bVarM11804e = new InterfaceC2026t.b.a().m11802c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).m11803d(29, cgj0Var.mo100066h()).m11803d(23, c1814c.f7039q).m11803d(25, c1814c.f7039q).m11803d(33, c1814c.f7039q).m11803d(26, c1814c.f7039q).m11803d(34, c1814c.f7039q).m11804e();
            this.f7606c = bVarM11804e;
            this.f7592P = new InterfaceC2026t.b.a().m11801b(bVarM11804e).m11800a(4).m11800a(10).m11804e();
            this.f7618i = qa5Var.mo111761c(looper, null);
            C1893j.f fVar = new C1893j.f() { // from class: l.o8f
                @Override // com.google.android.exoplayer2.C1893j.f
                /* JADX INFO: renamed from: a */
                public final void mo10330a(C1893j.e eVar) {
                    C1892i c1892i = this.f145407a;
                    c1892i.f7618i.mo131271i(new Runnable() { // from class: l.v8f
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1892i.m10126C0(eVar);
                        }
                    });
                }
            };
            this.f7620j = fVar;
            this.f7645v0 = fe80.m125284k(dgj0Var);
            dk0VarApply.mo116163G(interfaceC2026t2, looper);
            int i = bmk0.f77313a;
            C1893j c1893j = new C1893j(interfaceC2089xArrMo156429a, cgj0Var, dgj0Var, c1814c.f7029g.get(), md2Var, this.f7582F, this.f7583G, dk0VarApply, this.f7589M, c1814c.f7046x, c1814c.f7047y, this.f7591O, looper, qa5Var, fVar, i < 31 ? new bf80() : b.m10160a(applicationContext, this, c1814c.f7020B), c1814c.f7021C);
            this.f7622k = c1893j;
            this.f7619i0 = 1.0f;
            this.f7582F = 0;
            C1945o c1945o = C1945o.f8140I;
            this.f7593Q = c1945o;
            this.f7594R = c1945o;
            this.f7643u0 = c1945o;
            this.f7647w0 = -1;
            if (i < 21) {
                this.f7615g0 = m10127D0(0);
            } else {
                this.f7615g0 = bmk0.m105077G(applicationContext);
            }
            this.f7623k0 = qyb.f160127c;
            this.f7629n0 = true;
            addListener(dk0VarApply);
            md2Var.mo157941d(new Handler(looper), dk0VarApply);
            addAudioOffloadListener(cVar);
            long j = c1814c.f7025c;
            if (j > 0) {
                c1893j.m10310x(j);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(c1814c.f7023a, handler, cVar);
            this.f7652z = audioBecomingNoisyManager;
            audioBecomingNoisyManager.m9407b(c1814c.f7037o);
            C1854b c1854b = new C1854b(c1814c.f7023a, handler, cVar);
            this.f7577A = c1854b;
            c1854b.m9747m(c1814c.f7035m ? this.f7617h0 : null);
            if (c1814c.f7039q) {
                StreamVolumeManager streamVolumeManager = new StreamVolumeManager(c1814c.f7023a, handler, cVar);
                this.f7578B = streamVolumeManager;
                streamVolumeManager.m9434m(bmk0.m105145j0(this.f7617h0.f7188c));
            } else {
                this.f7578B = null;
            }
            wop0 wop0Var = new wop0(c1814c.f7023a);
            this.f7579C = wop0Var;
            wop0Var.m207344a(c1814c.f7036n != 0);
            kfq0 kfq0Var = new kfq0(c1814c.f7023a);
            this.f7580D = kfq0Var;
            kfq0Var.m149619a(c1814c.f7036n == 2);
            this.f7639s0 = m10113p0(this.f7578B);
            this.f7641t0 = zjl0.f204676e;
            this.f7609d0 = brf0.f78020c;
            cgj0Var.mo100068l(this.f7617h0);
            m10135L0(1, 10, Integer.valueOf(this.f7615g0));
            m10135L0(2, 10, Integer.valueOf(this.f7615g0));
            m10135L0(1, 3, this.f7617h0);
            m10135L0(2, 4, Integer.valueOf(this.f7605b0));
            m10135L0(2, 5, Integer.valueOf(this.f7607c0));
            m10135L0(1, 9, Boolean.valueOf(this.f7621j0));
            m10135L0(2, 7, dVar);
            m10135L0(6, 8, dVar);
            wt5Var.m207821e();
        } catch (Throwable th) {
            this.f7608d.m207821e();
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static long m10068B0(fe80 fe80Var) {
        AbstractC1857c0.d dVar = new AbstractC1857c0.d();
        AbstractC1857c0.b bVar = new AbstractC1857c0.b();
        fe80Var.f98629a.mo9454l(fe80Var.f98630b.f101422a, bVar);
        return fe80Var.f98631c == -9223372036854775807L ? fe80Var.f98629a.m9774r(bVar.f7339c, dVar).m9805e() : bVar.m9794q() + fe80Var.f98631c;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m10072F(fe80 fe80Var, InterfaceC2026t.d dVar) {
        dVar.mo11807A(fe80Var.f98635g);
        dVar.mo11829i0(fe80Var.f98635g);
    }

    /* JADX INFO: renamed from: p0 */
    public static C1891h m10113p0(@Nullable StreamVolumeManager streamVolumeManager) {
        return new C1891h.b(0).m10064g(streamVolumeManager != null ? streamVolumeManager.m9428e() : 0).m10063f(streamVolumeManager != null ? streamVolumeManager.m9427d() : 0).m10062e();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m10120w(int i, InterfaceC2026t.e eVar, InterfaceC2026t.e eVar2, InterfaceC2026t.d dVar) {
        dVar.mo11827g0(i);
        dVar.mo11840z(eVar, eVar2, i);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m10123y0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC2026t.e m10125A0(int i, fe80 fe80Var, int i2) {
        int i3;
        Object obj;
        C1944n c1944n;
        Object obj2;
        int i4;
        long jM10068B0;
        long jM10068B1;
        AbstractC1857c0.b bVar = new AbstractC1857c0.b();
        if (fe80Var.f98629a.m9776u()) {
            i3 = i2;
            obj = null;
            c1944n = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = fe80Var.f98630b.f101422a;
            fe80Var.f98629a.mo9454l(obj3, bVar);
            int i5 = bVar.f7339c;
            int iMo9450f = fe80Var.f98629a.mo9450f(obj3);
            Object obj4 = fe80Var.f98629a.m9774r(i5, this.f7325a).f7365a;
            c1944n = this.f7325a.f7367c;
            obj2 = obj3;
            i4 = iMo9450f;
            obj = obj4;
            i3 = i5;
        }
        InterfaceC1988i.b bVar2 = fe80Var.f98630b;
        if (i == 0) {
            boolean zM128142b = bVar2.m128142b();
            InterfaceC1988i.b bVar3 = fe80Var.f98630b;
            if (zM128142b) {
                jM10068B0 = bVar.m9782e(bVar3.f101423b, bVar3.f101424c);
                jM10068B1 = m10068B0(fe80Var);
            } else {
                jM10068B0 = bVar3.f101426e != -1 ? m10068B0(this.f7645v0) : bVar.f7341e + bVar.f7340d;
                jM10068B1 = jM10068B0;
            }
        } else if (bVar2.m128142b()) {
            jM10068B0 = fe80Var.f98646r;
            jM10068B1 = m10068B0(fe80Var);
        } else {
            jM10068B0 = bVar.f7341e + fe80Var.f98646r;
            jM10068B1 = jM10068B0;
        }
        long jM105152l1 = bmk0.m105152l1(jM10068B0);
        long jM105152l2 = bmk0.m105152l1(jM10068B1);
        InterfaceC1988i.b bVar4 = fe80Var.f98630b;
        return new InterfaceC2026t.e(obj, i3, c1944n, obj2, i4, jM105152l1, jM105152l2, bVar4.f101423b, bVar4.f101424c);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m10126C0(C1893j.e eVar) {
        long jM10131H0;
        int i = this.f7584H - eVar.f7718c;
        this.f7584H = i;
        boolean z = true;
        if (eVar.f7719d) {
            this.f7585I = eVar.f7720e;
            this.f7586J = true;
        }
        if (eVar.f7721f) {
            this.f7587K = eVar.f7722g;
        }
        if (i == 0) {
            AbstractC1857c0 abstractC1857c0 = eVar.f7717b.f98629a;
            if (!this.f7645v0.f98629a.m9776u() && abstractC1857c0.m9776u()) {
                this.f7647w0 = -1;
                this.f7651y0 = 0L;
                this.f7649x0 = 0;
            }
            if (!abstractC1857c0.m9776u()) {
                List<AbstractC1857c0> listM12230J = ((C2080v) abstractC1857c0).m12230J();
                w11.m204371g(listM12230J.size() == this.f7630o.size());
                for (int i2 = 0; i2 < listM12230J.size(); i2++) {
                    this.f7630o.get(i2).f7659b = listM12230J.get(i2);
                }
            }
            long j = -9223372036854775807L;
            if (this.f7586J) {
                if (eVar.f7717b.f98630b.equals(this.f7645v0.f98630b) && eVar.f7717b.f98632d == this.f7645v0.f98646r) {
                    z = false;
                }
                if (z) {
                    if (abstractC1857c0.m9776u() || eVar.f7717b.f98630b.m128142b()) {
                        jM10131H0 = eVar.f7717b.f98632d;
                    } else {
                        fe80 fe80Var = eVar.f7717b;
                        jM10131H0 = m10131H0(abstractC1857c0, fe80Var.f98630b, fe80Var.f98632d);
                    }
                    j = jM10131H0;
                }
            } else {
                z = false;
            }
            this.f7586J = false;
            m10144U0(eVar.f7717b, 1, this.f7587K, z, this.f7585I, j, -1, false);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final int m10127D0(int i) {
        AudioTrack audioTrack = this.f7597U;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.f7597U.release();
            this.f7597U = null;
        }
        if (this.f7597U == null) {
            this.f7597U = new AudioTrack(3, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, 4, 2, 2, 0, i);
        }
        return this.f7597U.getAudioSessionId();
    }

    /* JADX INFO: renamed from: E0 */
    public final fe80 m10128E0(fe80 fe80Var, AbstractC1857c0 abstractC1857c0, @Nullable Pair<Object, Long> pair) {
        w11.m204365a(abstractC1857c0.m9776u() || pair != null);
        AbstractC1857c0 abstractC1857c1 = fe80Var.f98629a;
        long jM10155u0 = m10155u0(fe80Var);
        fe80 fe80VarM125295j = fe80Var.m125295j(abstractC1857c0);
        if (abstractC1857c0.m9776u()) {
            InterfaceC1988i.b bVarM125285l = fe80.m125285l();
            long jM105084J0 = bmk0.m105084J0(this.f7651y0);
            fe80 fe80VarM125288c = fe80VarM125295j.m125289d(bVarM125285l, jM105084J0, jM105084J0, jM105084J0, 0L, ffj0.f98782d, this.f7604b, ImmutableList.m15739of()).m125288c(bVarM125285l);
            fe80VarM125288c.f98644p = fe80VarM125288c.f98646r;
            return fe80VarM125288c;
        }
        Object obj = fe80VarM125295j.f98630b.f101422a;
        boolean zEquals = obj.equals(((Pair) bmk0.m105144j(pair)).first);
        InterfaceC1988i.b bVar = !zEquals ? new InterfaceC1988i.b(pair.first) : fe80VarM125295j.f98630b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM105084J1 = bmk0.m105084J0(jM10155u0);
        if (!abstractC1857c1.m9776u()) {
            jM105084J1 -= abstractC1857c1.mo9454l(obj, this.f7628n).m9794q();
        }
        if (!zEquals || jLongValue < jM105084J1) {
            InterfaceC1988i.b bVar2 = bVar;
            w11.m204371g(!bVar2.m128142b());
            fe80 fe80VarM125288c2 = fe80VarM125295j.m125289d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? ffj0.f98782d : fe80VarM125295j.f98636h, !zEquals ? this.f7604b : fe80VarM125295j.f98637i, !zEquals ? ImmutableList.m15739of() : fe80VarM125295j.f98638j).m125288c(bVar2);
            fe80VarM125288c2.f98644p = jLongValue;
            return fe80VarM125288c2;
        }
        if (jLongValue != jM105084J1) {
            InterfaceC1988i.b bVar3 = bVar;
            w11.m204371g(!bVar3.m128142b());
            long jMax = Math.max(0L, fe80VarM125295j.f98645q - (jLongValue - jM105084J1));
            long j = fe80VarM125295j.f98644p;
            if (fe80VarM125295j.f98639k.equals(fe80VarM125295j.f98630b)) {
                j = jLongValue + jMax;
            }
            fe80 fe80VarM125289d = fe80VarM125295j.m125289d(bVar3, jLongValue, jLongValue, jLongValue, jMax, fe80VarM125295j.f98636h, fe80VarM125295j.f98637i, fe80VarM125295j.f98638j);
            fe80VarM125289d.f98644p = j;
            return fe80VarM125289d;
        }
        int iMo9450f = abstractC1857c0.mo9450f(fe80VarM125295j.f98639k.f101422a);
        if (iMo9450f != -1 && abstractC1857c0.m9770j(iMo9450f, this.f7628n).f7339c == abstractC1857c0.mo9454l(bVar.f101422a, this.f7628n).f7339c) {
            return fe80VarM125295j;
        }
        abstractC1857c0.mo9454l(bVar.f101422a, this.f7628n);
        boolean zM128142b = bVar.m128142b();
        AbstractC1857c0.b bVar4 = this.f7628n;
        long jM9782e = zM128142b ? bVar4.m9782e(bVar.f101423b, bVar.f101424c) : bVar4.f7340d;
        InterfaceC1988i.b bVar5 = bVar;
        fe80 fe80VarM125288c3 = fe80VarM125295j.m125289d(bVar5, fe80VarM125295j.f98646r, fe80VarM125295j.f98646r, fe80VarM125295j.f98632d, jM9782e - fe80VarM125295j.f98646r, fe80VarM125295j.f98636h, fe80VarM125295j.f98637i, fe80VarM125295j.f98638j).m125288c(bVar5);
        fe80VarM125288c3.f98644p = jM9782e;
        return fe80VarM125288c3;
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public final Pair<Object, Long> m10129F0(AbstractC1857c0 abstractC1857c0, int i, long j) {
        if (abstractC1857c0.m9776u()) {
            this.f7647w0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f7651y0 = j;
            this.f7649x0 = 0;
            return null;
        }
        if (i == -1 || i >= abstractC1857c0.mo9775t()) {
            i = abstractC1857c0.mo9449e(this.f7583G);
            j = abstractC1857c0.m9774r(i, this.f7325a).m9804d();
        }
        return abstractC1857c0.m9772n(this.f7325a, this.f7628n, i, bmk0.m105084J0(j));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10130G0(final int i, final int i2) {
        if (i == this.f7609d0.m106135b() && i2 == this.f7609d0.m106134a()) {
            return;
        }
        this.f7609d0 = new brf0(i, i2);
        this.f7624l.m105965k(24, new bqr.InterfaceC16083a() { // from class: l.s8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11826f0(i, i2);
            }
        });
        m10135L0(2, 14, new brf0(i, i2));
    }

    /* JADX INFO: renamed from: H0 */
    public final long m10131H0(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar, long j) {
        abstractC1857c0.mo9454l(bVar.f101422a, this.f7628n);
        return j + this.f7628n.m9794q();
    }

    /* JADX INFO: renamed from: I0 */
    public final fe80 m10132I0(fe80 fe80Var, int i, int i2) {
        int iM10157w0 = m10157w0(fe80Var);
        long jM10155u0 = m10155u0(fe80Var);
        AbstractC1857c0 abstractC1857c0 = fe80Var.f98629a;
        int size = this.f7630o.size();
        this.f7584H++;
        m10133J0(i, i2);
        AbstractC1857c0 abstractC1857c0M10151q0 = m10151q0();
        fe80 fe80VarM10128E0 = m10128E0(fe80Var, abstractC1857c0M10151q0, m10158x0(abstractC1857c0, abstractC1857c0M10151q0, iM10157w0, jM10155u0));
        int i3 = fe80VarM10128E0.f98633e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iM10157w0 >= fe80VarM10128E0.f98629a.mo9775t()) {
            fe80VarM10128E0 = fe80VarM10128E0.m125293h(4);
        }
        this.f7622k.m10294r0(i, i2, this.f7590N);
        return fe80VarM10128E0;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m10133J0(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f7630o.remove(i3);
        }
        this.f7590N = this.f7590N.mo161918f(i, i2);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m10134K0() {
        if (this.f7601Y != null) {
            m10153s0(this.f7650y).m11857n(10000).m11856m(null).m11855l();
            this.f7601Y.m12246g(this.f7648x);
            this.f7601Y = null;
        }
        TextureView textureView = this.f7603a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7648x) {
                kyv.m152151i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7603a0.setSurfaceTextureListener(null);
            }
            this.f7603a0 = null;
        }
        SurfaceHolder surfaceHolder = this.f7600X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7648x);
            this.f7600X = null;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m10135L0(int i, int i2, @Nullable Object obj) {
        for (InterfaceC2089x interfaceC2089x : this.f7614g) {
            if (interfaceC2089x.getTrackType() == i) {
                m10153s0(interfaceC2089x).m11857n(i2).m11856m(obj).m11855l();
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m10136M0() {
        m10135L0(1, 2, Float.valueOf(this.f7619i0 * this.f7577A.m9741g()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX INFO: renamed from: N0 */
    public final void m10137N0(List<InterfaceC1988i> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        fe80 fe80VarM125293h;
        boolean z2;
        int iMo9449e = i;
        int iM10157w0 = m10157w0(this.f7645v0);
        long currentPosition = getCurrentPosition();
        this.f7584H++;
        if (!this.f7630o.isEmpty()) {
            m10133J0(0, this.f7630o.size());
        }
        List<C1951q.c> listM10148m0 = m10148m0(0, list);
        AbstractC1857c0 abstractC1857c0M10151q0 = m10151q0();
        if (!abstractC1857c0M10151q0.m9776u() && iMo9449e >= abstractC1857c0M10151q0.mo9775t()) {
            throw new IllegalSeekPositionException(abstractC1857c0M10151q0, iMo9449e, j);
        }
        if (!z) {
            if (iMo9449e == -1) {
                i2 = iM10157w0;
                j2 = currentPosition;
            } else {
                j2 = j;
            }
            fe80 fe80VarM10128E0 = m10128E0(this.f7645v0, abstractC1857c0M10151q0, m10129F0(abstractC1857c0M10151q0, i2, j2));
            i3 = fe80VarM10128E0.f98633e;
            if (i2 != -1 && i3 != 1) {
                if (!abstractC1857c0M10151q0.m9776u() || i2 >= abstractC1857c0M10151q0.mo9775t()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            fe80VarM125293h = fe80VarM10128E0.m125293h(i3);
            this.f7622k.m10237T0(listM10148m0, i2, bmk0.m105084J0(j2), this.f7590N);
            if (!this.f7645v0.f98630b.f101422a.equals(fe80VarM125293h.f98630b.f101422a) || this.f7645v0.f98629a.m9776u()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m10144U0(fe80VarM125293h, 0, 1, z2, 4, m10156v0(fe80VarM125293h), -1, false);
        }
        iMo9449e = abstractC1857c0M10151q0.mo9449e(this.f7583G);
        j2 = -9223372036854775807L;
        i2 = iMo9449e;
        fe80 fe80VarM10128E1 = m10128E0(this.f7645v0, abstractC1857c0M10151q0, m10129F0(abstractC1857c0M10151q0, i2, j2));
        i3 = fe80VarM10128E1.f98633e;
        if (i2 != -1) {
            if (abstractC1857c0M10151q0.m9776u()) {
                i3 = 4;
            } else {
                i3 = 4;
            }
        }
        fe80VarM125293h = fe80VarM10128E1.m125293h(i3);
        this.f7622k.m10237T0(listM10148m0, i2, bmk0.m105084J0(j2), this.f7590N);
        if (this.f7645v0.f98630b.f101422a.equals(fe80VarM125293h.f98630b.f101422a)) {
            z2 = false;
        } else {
            z2 = false;
        }
        m10144U0(fe80VarM125293h, 0, 1, z2, 4, m10156v0(fe80VarM125293h), -1, false);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m10138O0(SurfaceHolder surfaceHolder) {
        this.f7602Z = false;
        this.f7600X = surfaceHolder;
        surfaceHolder.addCallback(this.f7648x);
        Surface surface = this.f7600X.getSurface();
        if (surface == null || !surface.isValid()) {
            m10130G0(0, 0);
        } else {
            Rect surfaceFrame = this.f7600X.getSurfaceFrame();
            m10130G0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m10139P0(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m10140Q0(surface);
        this.f7599W = surface;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10140Q0(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (InterfaceC2089x interfaceC2089x : this.f7614g) {
            if (interfaceC2089x.getTrackType() == 2) {
                arrayList.add(m10153s0(interfaceC2089x).m11857n(1).m11856m(obj).m11855l());
            }
        }
        Object obj2 = this.f7598V;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2027u) it.next()).m11844a(this.f7581E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f7598V;
            Surface surface = this.f7599W;
            if (obj3 == surface) {
                surface.release();
                this.f7599W = null;
            }
        }
        this.f7598V = obj;
        if (z) {
            m10141R0(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m10141R0(@Nullable ExoPlaybackException exoPlaybackException) {
        fe80 fe80Var = this.f7645v0;
        fe80 fe80VarM125288c = fe80Var.m125288c(fe80Var.f98630b);
        fe80VarM125288c.f98644p = fe80VarM125288c.f98646r;
        fe80VarM125288c.f98645q = 0L;
        fe80 fe80VarM125293h = fe80VarM125288c.m125293h(1);
        if (exoPlaybackException != null) {
            fe80VarM125293h = fe80VarM125293h.m125291f(exoPlaybackException);
        }
        this.f7584H++;
        this.f7622k.m10292q1();
        m10144U0(fe80VarM125293h, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m10142S0() {
        InterfaceC2026t.b bVar = this.f7592P;
        InterfaceC2026t.b bVarM105081I = bmk0.m105081I(this.f7612f, this.f7606c);
        this.f7592P = bVarM105081I;
        if (bVarM105081I.equals(bVar)) {
            return;
        }
        this.f7624l.m105962h(13, new bqr.InterfaceC16083a() { // from class: l.x8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11820T(this.f192813a.f7592P);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final void m10143T0(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        fe80 fe80VarM125286a = this.f7645v0;
        if (fe80VarM125286a.f98640l == z2 && fe80VarM125286a.f98641m == i3) {
            return;
        }
        this.f7584H++;
        if (fe80VarM125286a.f98643o) {
            fe80VarM125286a = fe80VarM125286a.m125286a();
        }
        fe80 fe80VarM125290e = fe80VarM125286a.m125290e(z2, i3);
        this.f7622k.m10243X0(z2, i3);
        m10144U0(fe80VarM125290e, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m10144U0(final fe80 fe80Var, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        fe80 fe80Var2 = this.f7645v0;
        this.f7645v0 = fe80Var;
        boolean zEquals = fe80Var2.f98629a.equals(fe80Var.f98629a);
        Pair<Boolean, Integer> pairM10154t0 = m10154t0(fe80Var, fe80Var2, z, i3, !zEquals, z2);
        boolean zBooleanValue = ((Boolean) pairM10154t0.first).booleanValue();
        final int iIntValue = ((Integer) pairM10154t0.second).intValue();
        C1945o c1945oM10150o0 = this.f7593Q;
        final C1944n c1944n = null;
        if (zBooleanValue) {
            if (!fe80Var.f98629a.m9776u()) {
                c1944n = fe80Var.f98629a.m9774r(fe80Var.f98629a.mo9454l(fe80Var.f98630b.f101422a, this.f7628n).f7339c, this.f7325a).f7367c;
            }
            this.f7643u0 = C1945o.f8140I;
        }
        if (zBooleanValue || !fe80Var2.f98638j.equals(fe80Var.f98638j)) {
            this.f7643u0 = this.f7643u0.m10775b().m10813L(fe80Var.f98638j).m10809H();
            c1945oM10150o0 = m10150o0();
        }
        boolean zEquals2 = c1945oM10150o0.equals(this.f7593Q);
        this.f7593Q = c1945oM10150o0;
        boolean z3 = fe80Var2.f98640l != fe80Var.f98640l;
        boolean z4 = fe80Var2.f98633e != fe80Var.f98633e;
        if (z4 || z3) {
            m10146W0();
        }
        boolean z5 = fe80Var2.f98635g;
        boolean z6 = fe80Var.f98635g;
        boolean z7 = z5 != z6;
        if (z7) {
            m10145V0(z6);
        }
        if (!zEquals) {
            this.f7624l.m105962h(0, new bqr.InterfaceC16083a() { // from class: l.e8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    InterfaceC2026t.d dVar = (InterfaceC2026t.d) obj;
                    dVar.mo11808C(fe80Var.f98629a, i);
                }
            });
        }
        if (z) {
            final InterfaceC2026t.e eVarM10125A0 = m10125A0(i3, fe80Var2, i4);
            final InterfaceC2026t.e eVarM10159z0 = m10159z0(j);
            this.f7624l.m105962h(11, new bqr.InterfaceC16083a() { // from class: l.b9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    C1892i.m10120w(i3, eVarM10125A0, eVarM10159z0, (InterfaceC2026t.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f7624l.m105962h(1, new bqr.InterfaceC16083a() { // from class: l.c9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11834o0(c1944n, iIntValue);
                }
            });
        }
        if (fe80Var2.f98634f != fe80Var.f98634f) {
            this.f7624l.m105962h(10, new bqr.InterfaceC16083a() { // from class: l.d9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11813I(fe80Var.f98634f);
                }
            });
            if (fe80Var.f98634f != null) {
                this.f7624l.m105962h(10, new bqr.InterfaceC16083a() { // from class: l.e9f
                    @Override // p153l.bqr.InterfaceC16083a
                    public final void invoke(Object obj) {
                        ((InterfaceC2026t.d) obj).mo11814J(fe80Var.f98634f);
                    }
                });
            }
        }
        dgj0 dgj0Var = fe80Var2.f98637i;
        dgj0 dgj0Var2 = fe80Var.f98637i;
        if (dgj0Var != dgj0Var2) {
            this.f7616h.mo109695i(dgj0Var2.f88314e);
            this.f7624l.m105962h(2, new bqr.InterfaceC16083a() { // from class: l.f9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11828h0(fe80Var.f98637i.f88313d);
                }
            });
        }
        if (!zEquals2) {
            final C1945o c1945o = this.f7593Q;
            this.f7624l.m105962h(14, new bqr.InterfaceC16083a() { // from class: l.f8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11810E(c1945o);
                }
            });
        }
        if (z7) {
            this.f7624l.m105962h(3, new bqr.InterfaceC16083a() { // from class: l.g8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    C1892i.m10072F(fe80Var, (InterfaceC2026t.d) obj);
                }
            });
        }
        if (z4 || z3) {
            this.f7624l.m105962h(-1, new bqr.InterfaceC16083a() { // from class: l.h8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    fe80 fe80Var3 = fe80Var;
                    ((InterfaceC2026t.d) obj).mo11833n0(fe80Var3.f98640l, fe80Var3.f98633e);
                }
            });
        }
        if (z4) {
            this.f7624l.m105962h(4, new bqr.InterfaceC16083a() { // from class: l.i8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11821U(fe80Var.f98633e);
                }
            });
        }
        if (z3) {
            this.f7624l.m105962h(5, new bqr.InterfaceC16083a() { // from class: l.p8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    InterfaceC2026t.d dVar = (InterfaceC2026t.d) obj;
                    dVar.mo11817O(fe80Var.f98640l, i2);
                }
            });
        }
        if (fe80Var2.f98641m != fe80Var.f98641m) {
            this.f7624l.m105962h(6, new bqr.InterfaceC16083a() { // from class: l.y8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11819S(fe80Var.f98641m);
                }
            });
        }
        if (fe80Var2.m125297n() != fe80Var.m125297n()) {
            this.f7624l.m105962h(7, new bqr.InterfaceC16083a() { // from class: l.z8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11818R(fe80Var.m125297n());
                }
            });
        }
        if (!fe80Var2.f98642n.equals(fe80Var.f98642n)) {
            this.f7624l.m105962h(12, new bqr.InterfaceC16083a() { // from class: l.a9f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11837s(fe80Var.f98642n);
                }
            });
        }
        m10142S0();
        this.f7624l.m105960f();
        if (fe80Var2.f98643o != fe80Var.f98643o) {
            Iterator<ExoPlayer.InterfaceC1813b> it = this.f7626m.iterator();
            while (it.hasNext()) {
                it.next().mo9412u(fe80Var.f98643o);
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m10145V0(boolean z) {
        PriorityTaskManager priorityTaskManager = this.f7633p0;
        if (priorityTaskManager != null) {
            if (z && !this.f7635q0) {
                priorityTaskManager.m12204a(0);
                this.f7635q0 = true;
            } else {
                if (z || !this.f7635q0) {
                    return;
                }
                priorityTaskManager.m12205b(0);
                this.f7635q0 = false;
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m10146W0() {
        int playbackState = getPlaybackState();
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                wop0 wop0Var = this.f7579C;
                if (getPlayWhenReady() && !zExperimentalIsSleepingForOffload) {
                    z = true;
                }
                wop0Var.m207345b(z);
                this.f7580D.m149620b(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                wpg0.m207458a();
                return;
            }
        }
        this.f7579C.m207345b(false);
        this.f7580D.m149620b(false);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m10147X0() {
        this.f7608d.m207818b();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String strM105071D = bmk0.m105071D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.f7629n0) {
                wtq0.m207906a(strM105071D);
            } else {
                kyv.m152152j("ExoPlayerImpl", strM105071D, this.f7631o0 ? null : new IllegalStateException());
                this.f7631o0 = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(hk0 hk0Var) {
        this.f7636r.mo116167d0((hk0) w11.m204369e(hk0Var));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.InterfaceC1813b interfaceC1813b) {
        this.f7626m.add(interfaceC1813b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void addListener(InterfaceC2026t.d dVar) {
        this.f7624l.m105957c((InterfaceC2026t.d) w11.m204369e(dVar));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void addMediaItems(int i, List<C1944n> list) {
        m10147X0();
        addMediaSources(i, m10152r0(list));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(InterfaceC1988i interfaceC1988i) {
        m10147X0();
        addMediaSources(Collections.singletonList(interfaceC1988i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int i, List<InterfaceC1988i> list) {
        m10147X0();
        w11.m204365a(i >= 0);
        int iMin = Math.min(i, this.f7630o.size());
        if (this.f7630o.isEmpty()) {
            setMediaSources(list, this.f7647w0 == -1);
        } else {
            m10144U0(m10149n0(this.f7645v0, iMin, list), 0, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC1856c
    /* JADX INFO: renamed from: c */
    public void mo9759c(int i, long j, int i2, boolean z) {
        m10147X0();
        w11.m204365a(i >= 0);
        this.f7636r.mo116164X();
        AbstractC1857c0 abstractC1857c0 = this.f7645v0.f98629a;
        if (abstractC1857c0.m9776u() || i < abstractC1857c0.mo9775t()) {
            this.f7584H++;
            if (isPlayingAd()) {
                kyv.m152151i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C1893j.e eVar = new C1893j.e(this.f7645v0);
                eVar.m10326b(1);
                this.f7620j.mo10330a(eVar);
                return;
            }
            fe80 fe80VarM125293h = this.f7645v0;
            int i3 = fe80VarM125293h.f98633e;
            if (i3 == 3 || (i3 == 4 && !abstractC1857c0.m9776u())) {
                fe80VarM125293h = this.f7645v0.m125293h(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            fe80 fe80VarM10128E0 = m10128E0(fe80VarM125293h, abstractC1857c0, m10129F0(abstractC1857c0, i, j));
            this.f7622k.m10210F0(abstractC1857c0, i, bmk0.m105084J0(j));
            m10144U0(fe80VarM10128E0, 0, 1, true, 1, m10156v0(fe80VarM10128E0), currentMediaItemIndex, z);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearAuxEffectInfo() {
        m10147X0();
        setAuxEffectInfo(new wj1(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearCameraMotionListener(gb4 gb4Var) {
        m10147X0();
        if (this.f7627m0 != gb4Var) {
            return;
        }
        m10153s0(this.f7650y).m11857n(8).m11856m(null).m11855l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoFrameMetadataListener(iel0 iel0Var) {
        m10147X0();
        if (this.f7625l0 != iel0Var) {
            return;
        }
        m10153s0(this.f7650y).m11857n(7).m11856m(null).m11855l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoSurface() {
        m10147X0();
        m10134K0();
        m10140Q0(null);
        m10130G0(0, 0);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        m10147X0();
        if (surfaceHolder == null || surfaceHolder != this.f7600X) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        m10147X0();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        m10147X0();
        if (textureView == null || textureView != this.f7603a0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C2027u createMessage(C2027u.b bVar) {
        m10147X0();
        return m10153s0(bVar);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void decreaseDeviceVolume() {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9426c(1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
        m10147X0();
        return this.f7645v0.f98643o;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        m10147X0();
        this.f7622k.m10313y(z);
        Iterator<ExoPlayer.InterfaceC1813b> it = this.f7626m.iterator();
        while (it.hasNext()) {
            it.next().m9411I(z);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public dk0 getAnalyticsCollector() {
        m10147X0();
        return this.f7636r;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public Looper getApplicationLooper() {
        return this.f7638s;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C1841a getAudioAttributes() {
        m10147X0();
        return this.f7617h0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1812a getAudioComponent() {
        m10147X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public jid getAudioDecoderCounters() {
        m10147X0();
        return this.f7613f0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public C1894k getAudioFormat() {
        m10147X0();
        return this.f7596T;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getAudioSessionId() {
        m10147X0();
        return this.f7615g0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public InterfaceC2026t.b getAvailableCommands() {
        m10147X0();
        return this.f7592P;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getBufferedPosition() {
        m10147X0();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        fe80 fe80Var = this.f7645v0;
        return fe80Var.f98639k.equals(fe80Var.f98630b) ? bmk0.m105152l1(this.f7645v0.f98644p) : getDuration();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public qa5 getClock() {
        return this.f7646w;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getContentBufferedPosition() {
        m10147X0();
        if (this.f7645v0.f98629a.m9776u()) {
            return this.f7651y0;
        }
        fe80 fe80Var = this.f7645v0;
        if (fe80Var.f98639k.f101425d != fe80Var.f98630b.f101425d) {
            return fe80Var.f98629a.m9774r(getCurrentMediaItemIndex(), this.f7325a).m9806f();
        }
        long j = fe80Var.f98644p;
        if (this.f7645v0.f98639k.m128142b()) {
            fe80 fe80Var2 = this.f7645v0;
            AbstractC1857c0.b bVarMo9454l = fe80Var2.f98629a.mo9454l(fe80Var2.f98639k.f101422a, this.f7628n);
            long jM9786i = bVarMo9454l.m9786i(this.f7645v0.f98639k.f101423b);
            j = jM9786i == Long.MIN_VALUE ? bVarMo9454l.f7340d : jM9786i;
        }
        fe80 fe80Var3 = this.f7645v0;
        return bmk0.m105152l1(m10131H0(fe80Var3.f98629a, fe80Var3.f98639k, j));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getContentPosition() {
        m10147X0();
        return m10155u0(this.f7645v0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getCurrentAdGroupIndex() {
        m10147X0();
        if (isPlayingAd()) {
            return this.f7645v0.f98630b.f101423b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getCurrentAdIndexInAdGroup() {
        m10147X0();
        if (isPlayingAd()) {
            return this.f7645v0.f98630b.f101424c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public qyb getCurrentCues() {
        m10147X0();
        return this.f7623k0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getCurrentMediaItemIndex() {
        m10147X0();
        int iM10157w0 = m10157w0(this.f7645v0);
        if (iM10157w0 == -1) {
            return 0;
        }
        return iM10157w0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getCurrentPeriodIndex() {
        m10147X0();
        if (this.f7645v0.f98629a.m9776u()) {
            return this.f7649x0;
        }
        fe80 fe80Var = this.f7645v0;
        return fe80Var.f98629a.mo9450f(fe80Var.f98630b.f101422a);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getCurrentPosition() {
        m10147X0();
        return bmk0.m105152l1(m10156v0(this.f7645v0));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public AbstractC1857c0 getCurrentTimeline() {
        m10147X0();
        return this.f7645v0.f98629a;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public ffj0 getCurrentTrackGroups() {
        m10147X0();
        return this.f7645v0.f98636h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public wfj0 getCurrentTrackSelections() {
        m10147X0();
        return new wfj0(this.f7645v0.f98637i.f88312c);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public C1861d0 getCurrentTracks() {
        m10147X0();
        return this.f7645v0.f98637i.f88313d;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1815d getDeviceComponent() {
        m10147X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C1891h getDeviceInfo() {
        m10147X0();
        return this.f7639s0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getDeviceVolume() {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            return streamVolumeManager.m9429g();
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getDuration() {
        m10147X0();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        fe80 fe80Var = this.f7645v0;
        InterfaceC1988i.b bVar = fe80Var.f98630b;
        fe80Var.f98629a.mo9454l(bVar.f101422a, this.f7628n);
        return bmk0.m105152l1(this.f7628n.m9782e(bVar.f101423b, bVar.f101424c));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getMaxSeekToPreviousPosition() {
        m10147X0();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public C1945o getMediaMetadata() {
        m10147X0();
        return this.f7593Q;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        m10147X0();
        return this.f7591O;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public boolean getPlayWhenReady() {
        m10147X0();
        return this.f7645v0.f98640l;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.f7622k.m10209F();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public C1953s getPlaybackParameters() {
        m10147X0();
        return this.f7645v0.f98642n;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getPlaybackState() {
        m10147X0();
        return this.f7645v0.f98633e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getPlaybackSuppressionReason() {
        m10147X0();
        return this.f7645v0.f98641m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    @Nullable
    public ExoPlaybackException getPlayerError() {
        m10147X0();
        return this.f7645v0.f98634f;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public C1945o getPlaylistMetadata() {
        m10147X0();
        return this.f7594R;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public InterfaceC2089x getRenderer(int i) {
        m10147X0();
        return this.f7614g[i];
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
        m10147X0();
        return this.f7614g.length;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int i) {
        m10147X0();
        return this.f7614g[i].getTrackType();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public int getRepeatMode() {
        m10147X0();
        return this.f7582F;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getSeekBackIncrement() {
        m10147X0();
        return this.f7642u;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getSeekForwardIncrement() {
        m10147X0();
        return this.f7644v;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public nke0 getSeekParameters() {
        m10147X0();
        return this.f7589M;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public boolean getShuffleModeEnabled() {
        m10147X0();
        return this.f7583G;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        m10147X0();
        return this.f7621j0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public brf0 getSurfaceSize() {
        m10147X0();
        return this.f7609d0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1816e getTextComponent() {
        m10147X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public long getTotalBufferedDuration() {
        m10147X0();
        return bmk0.m105152l1(this.f7645v0.f98645q);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public agj0 getTrackSelectionParameters() {
        m10147X0();
        return this.f7616h.mo100064c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public cgj0 getTrackSelector() {
        m10147X0();
        return this.f7616h;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        m10147X0();
        return this.f7607c0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public ExoPlayer.InterfaceC1817f getVideoComponent() {
        m10147X0();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public jid getVideoDecoderCounters() {
        m10147X0();
        return this.f7611e0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public C1894k getVideoFormat() {
        m10147X0();
        return this.f7595S;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getVideoScalingMode() {
        m10147X0();
        return this.f7605b0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public zjl0 getVideoSize() {
        m10147X0();
        return this.f7641t0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public float getVolume() {
        m10147X0();
        return this.f7619i0;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void increaseDeviceVolume() {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9430i(1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isDeviceMuted() {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            return streamVolumeManager.m9431j();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isLoading() {
        m10147X0();
        return this.f7645v0.f98635g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public boolean isPlayingAd() {
        m10147X0();
        return this.f7645v0.f98630b.m128142b();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isTunnelingEnabled() {
        m10147X0();
        for (jzc0 jzc0Var : this.f7645v0.f98637i.f88311b) {
            if (jzc0Var != null && jzc0Var.f123255a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final List<C1951q.c> m10148m0(int i, List<InterfaceC1988i> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1951q.c cVar = new C1951q.c(list.get(i2), this.f7632p);
            arrayList.add(cVar);
            this.f7630o.add(i2 + i, new e(cVar.f8277b, cVar.f8276a.m11196x()));
        }
        this.f7590N = this.f7590N.mo161919g(i, arrayList.size());
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void moveMediaItems(int i, int i2, int i3) {
        m10147X0();
        w11.m204365a(i >= 0 && i <= i2 && i3 >= 0);
        int size = this.f7630o.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        this.f7584H++;
        bmk0.m105082I0(this.f7630o, i, iMin, iMin2);
        AbstractC1857c0 abstractC1857c0M10151q0 = m10151q0();
        fe80 fe80Var = this.f7645v0;
        fe80 fe80VarM10128E0 = m10128E0(fe80Var, abstractC1857c0M10151q0, m10158x0(currentTimeline, abstractC1857c0M10151q0, m10157w0(fe80Var), m10155u0(this.f7645v0)));
        this.f7622k.m10264g0(i, iMin, iMin2, this.f7590N);
        m10144U0(fe80VarM10128E0, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final fe80 m10149n0(fe80 fe80Var, int i, List<InterfaceC1988i> list) {
        AbstractC1857c0 abstractC1857c0 = fe80Var.f98629a;
        this.f7584H++;
        List<C1951q.c> listM10148m0 = m10148m0(i, list);
        AbstractC1857c0 abstractC1857c0M10151q0 = m10151q0();
        fe80 fe80VarM10128E0 = m10128E0(fe80Var, abstractC1857c0M10151q0, m10158x0(abstractC1857c0, abstractC1857c0M10151q0, m10157w0(fe80Var), m10155u0(fe80Var)));
        this.f7622k.m10281n(i, listM10148m0, this.f7590N);
        return fe80VarM10128E0;
    }

    /* JADX INFO: renamed from: o0 */
    public final C1945o m10150o0() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            return this.f7643u0;
        }
        return this.f7643u0.m10775b().m10811J(currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).f7367c.f8000e).m10809H();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void prepare() {
        m10147X0();
        boolean playWhenReady = getPlayWhenReady();
        int iM9750p = this.f7577A.m9750p(playWhenReady, 2);
        m10143T0(playWhenReady, iM9750p, m10123y0(playWhenReady, iM9750p));
        fe80 fe80Var = this.f7645v0;
        if (fe80Var.f98633e != 1) {
            return;
        }
        fe80 fe80VarM125291f = fe80Var.m125291f(null);
        fe80 fe80VarM125293h = fe80VarM125291f.m125293h(fe80VarM125291f.f98629a.m9776u() ? 4 : 2);
        this.f7584H++;
        this.f7622k.m10276l0();
        m10144U0(fe80VarM125293h, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final AbstractC1857c0 m10151q0() {
        return new C2080v(this.f7630o, this.f7590N);
    }

    /* JADX INFO: renamed from: r0 */
    public final List<InterfaceC1988i> m10152r0(List<C1944n> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f7634q.mo11012c(list.get(i)));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void release() {
        AudioTrack audioTrack;
        kyv.m152148f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + bmk0.f77317e + "] [" + t9f.m189753b() + Constants.AES_SUFFIX);
        m10147X0();
        if (bmk0.f77313a < 21 && (audioTrack = this.f7597U) != null) {
            audioTrack.release();
            this.f7597U = null;
        }
        this.f7652z.m9407b(false);
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9432k();
        }
        this.f7579C.m207345b(false);
        this.f7580D.m149620b(false);
        this.f7577A.m9743i();
        if (!this.f7622k.m10282n0()) {
            this.f7624l.m105965k(10, new bqr.InterfaceC16083a() { // from class: l.k8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11814J(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.f7624l.m105963i();
        this.f7618i.mo131266d(null);
        this.f7640t.mo157944h(this.f7636r);
        fe80 fe80Var = this.f7645v0;
        if (fe80Var.f98643o) {
            this.f7645v0 = fe80Var.m125286a();
        }
        fe80 fe80VarM125293h = this.f7645v0.m125293h(1);
        this.f7645v0 = fe80VarM125293h;
        fe80 fe80VarM125288c = fe80VarM125293h.m125288c(fe80VarM125293h.f98630b);
        this.f7645v0 = fe80VarM125288c;
        fe80VarM125288c.f98644p = fe80VarM125288c.f98646r;
        this.f7645v0.f98645q = 0L;
        this.f7636r.release();
        this.f7616h.mo100067j();
        m10134K0();
        Surface surface = this.f7599W;
        if (surface != null) {
            surface.release();
            this.f7599W = null;
        }
        if (this.f7635q0) {
            ((PriorityTaskManager) w11.m204369e(this.f7633p0)).m12205b(0);
            this.f7635q0 = false;
        }
        this.f7623k0 = qyb.f160127c;
        this.f7637r0 = true;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(hk0 hk0Var) {
        m10147X0();
        this.f7636r.mo116169e0((hk0) w11.m204369e(hk0Var));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.InterfaceC1813b interfaceC1813b) {
        m10147X0();
        this.f7626m.remove(interfaceC1813b);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void removeListener(InterfaceC2026t.d dVar) {
        m10147X0();
        this.f7624l.m105964j((InterfaceC2026t.d) w11.m204369e(dVar));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void removeMediaItems(int i, int i2) {
        m10147X0();
        w11.m204365a(i >= 0 && i2 >= i);
        int size = this.f7630o.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        fe80 fe80VarM10132I0 = m10132I0(this.f7645v0, i, iMin);
        m10144U0(fe80VarM10132I0, 0, 1, !fe80VarM10132I0.f98630b.f101422a.equals(this.f7645v0.f98630b.f101422a), 4, m10156v0(fe80VarM10132I0), -1, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void replaceMediaItems(int i, int i2, List<C1944n> list) {
        m10147X0();
        w11.m204365a(i >= 0 && i2 >= i);
        int size = this.f7630o.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        List<InterfaceC1988i> listM10152r0 = m10152r0(list);
        if (this.f7630o.isEmpty()) {
            setMediaSources(listM10152r0, this.f7647w0 == -1);
        } else {
            fe80 fe80VarM10132I0 = m10132I0(m10149n0(this.f7645v0, iMin, listM10152r0), i, iMin);
            m10144U0(fe80VarM10132I0, 0, 1, !fe80VarM10132I0.f98630b.f101422a.equals(this.f7645v0.f98630b.f101422a), 4, m10156v0(fe80VarM10132I0), -1, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final C2027u m10153s0(C2027u.b bVar) {
        int iM10157w0 = m10157w0(this.f7645v0);
        C1893j c1893j = this.f7622k;
        AbstractC1857c0 abstractC1857c0 = this.f7645v0.f98629a;
        if (iM10157w0 == -1) {
            iM10157w0 = 0;
        }
        return new C2027u(c1893j, bVar, abstractC1857c0, iM10157w0, this.f7646w, c1893j.m10209F());
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setAudioAttributes(final C1841a c1841a, boolean z) {
        m10147X0();
        if (this.f7637r0) {
            return;
        }
        if (!bmk0.m105123c(this.f7617h0, c1841a)) {
            this.f7617h0 = c1841a;
            m10135L0(1, 3, c1841a);
            StreamVolumeManager streamVolumeManager = this.f7578B;
            if (streamVolumeManager != null) {
                streamVolumeManager.m9434m(bmk0.m105145j0(c1841a.f7188c));
            }
            this.f7624l.m105962h(20, new bqr.InterfaceC16083a() { // from class: l.j8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11816M(c1841a);
                }
            });
        }
        this.f7577A.m9747m(z ? c1841a : null);
        this.f7616h.mo100068l(c1841a);
        boolean playWhenReady = getPlayWhenReady();
        int iM9750p = this.f7577A.m9750p(playWhenReady, getPlaybackState());
        m10143T0(playWhenReady, iM9750p, m10123y0(playWhenReady, iM9750p));
        this.f7624l.m105960f();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setAudioSessionId(final int i) {
        m10147X0();
        if (this.f7615g0 == i) {
            return;
        }
        if (i == 0) {
            i = bmk0.f77313a < 21 ? m10127D0(0) : bmk0.m105077G(this.f7610e);
        } else if (bmk0.f77313a < 21) {
            m10127D0(i);
        }
        this.f7615g0 = i;
        m10135L0(1, 10, Integer.valueOf(i));
        m10135L0(2, 10, Integer.valueOf(i));
        this.f7624l.m105965k(21, new bqr.InterfaceC16083a() { // from class: l.r8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11809D(i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setAuxEffectInfo(wj1 wj1Var) {
        m10147X0();
        m10135L0(1, 6, wj1Var);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setCameraMotionListener(gb4 gb4Var) {
        m10147X0();
        this.f7627m0 = gb4Var;
        m10153s0(this.f7650y).m11857n(8).m11856m(gb4Var).m11855l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void setDeviceMuted(boolean z) {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9433l(z, 1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void setDeviceVolume(int i) {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9435n(i, 1);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean z) {
        m10147X0();
        if (this.f7588L != z) {
            this.f7588L = z;
            if (this.f7622k.m10230P0(z)) {
                return;
            }
            m10141R0(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
        m10147X0();
        if (this.f7637r0) {
            return;
        }
        this.f7652z.m9407b(z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setMediaItems(List<C1944n> list, boolean z) {
        m10147X0();
        setMediaSources(m10152r0(list), z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(InterfaceC1988i interfaceC1988i, long j) {
        m10147X0();
        setMediaSources(Collections.singletonList(interfaceC1988i), 0, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<InterfaceC1988i> list, boolean z) {
        m10147X0();
        m10137N0(list, -1, -9223372036854775807L, z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
        m10147X0();
        if (this.f7591O == z) {
            return;
        }
        this.f7591O = z;
        this.f7622k.m10240V0(z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setPlayWhenReady(boolean z) {
        m10147X0();
        int iM9750p = this.f7577A.m9750p(z, getPlaybackState());
        m10143T0(z, iM9750p, m10123y0(z, iM9750p));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setPlaybackParameters(C1953s c1953s) {
        m10147X0();
        if (c1953s == null) {
            c1953s = C1953s.f8284d;
        }
        if (this.f7645v0.f98642n.equals(c1953s)) {
            return;
        }
        fe80 fe80VarM125292g = this.f7645v0.m125292g(c1953s);
        this.f7584H++;
        this.f7622k.m10247Z0(c1953s);
        m10144U0(fe80VarM125292g, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPlaylistMetadata(C1945o c1945o) {
        m10147X0();
        w11.m204369e(c1945o);
        if (c1945o.equals(this.f7594R)) {
            return;
        }
        this.f7594R = c1945o;
        this.f7624l.m105965k(15, new bqr.InterfaceC16083a() { // from class: l.w8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11836r0(this.f187850a.f7594R);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @RequiresApi(23)
    public void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        m10147X0();
        m10135L0(1, 12, audioDeviceInfo);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        m10147X0();
        if (bmk0.m105123c(this.f7633p0, priorityTaskManager)) {
            return;
        }
        if (this.f7635q0) {
            ((PriorityTaskManager) w11.m204369e(this.f7633p0)).m12205b(0);
        }
        if (priorityTaskManager == null || !isLoading()) {
            this.f7635q0 = false;
        } else {
            priorityTaskManager.m12204a(0);
            this.f7635q0 = true;
        }
        this.f7633p0 = priorityTaskManager;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setRepeatMode(final int i) {
        m10147X0();
        if (this.f7582F != i) {
            this.f7582F = i;
            this.f7622k.m10252b1(i);
            this.f7624l.m105962h(8, new bqr.InterfaceC16083a() { // from class: l.q8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11838u0(i);
                }
            });
            m10142S0();
            this.f7624l.m105960f();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@Nullable nke0 nke0Var) {
        m10147X0();
        if (nke0Var == null) {
            nke0Var = nke0.f142453g;
        }
        if (this.f7589M.equals(nke0Var)) {
            return;
        }
        this.f7589M = nke0Var;
        this.f7622k.m10258d1(nke0Var);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setShuffleModeEnabled(final boolean z) {
        m10147X0();
        if (this.f7583G != z) {
            this.f7583G = z;
            this.f7622k.m10263f1(z);
            this.f7624l.m105962h(9, new bqr.InterfaceC16083a() { // from class: l.t8f
                @Override // p153l.bqr.InterfaceC16083a
                public final void invoke(Object obj) {
                    ((InterfaceC2026t.d) obj).mo11811F(z);
                }
            });
            m10142S0();
            this.f7624l.m105960f();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(n8f0 n8f0Var) {
        m10147X0();
        w11.m204365a(n8f0Var.getLength() == this.f7630o.size());
        this.f7590N = n8f0Var;
        AbstractC1857c0 abstractC1857c0M10151q0 = m10151q0();
        fe80 fe80VarM10128E0 = m10128E0(this.f7645v0, abstractC1857c0M10151q0, m10129F0(abstractC1857c0M10151q0, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f7584H++;
        this.f7622k.m10267h1(n8f0Var);
        m10144U0(fe80VarM10128E0, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSkipSilenceEnabled(final boolean z) {
        m10147X0();
        if (this.f7621j0 == z) {
            return;
        }
        this.f7621j0 = z;
        m10135L0(1, 9, Boolean.valueOf(z));
        this.f7624l.m105965k(23, new bqr.InterfaceC16083a() { // from class: l.l8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11823a(z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setTrackSelectionParameters(final agj0 agj0Var) {
        m10147X0();
        if (!this.f7616h.mo100066h() || agj0Var.equals(this.f7616h.mo100064c())) {
            return;
        }
        this.f7616h.mo100069m(agj0Var);
        this.f7624l.m105965k(19, new bqr.InterfaceC16083a() { // from class: l.u8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11815K(agj0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int i) {
        m10147X0();
        if (this.f7607c0 == i) {
            return;
        }
        this.f7607c0 = i;
        m10135L0(2, 5, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoEffects(List<ype> list) {
        m10147X0();
        m10135L0(2, 13, list);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoFrameMetadataListener(iel0 iel0Var) {
        m10147X0();
        this.f7625l0 = iel0Var;
        m10153s0(this.f7650y).m11857n(7).m11856m(iel0Var).m11855l();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoScalingMode(int i) {
        m10147X0();
        this.f7605b0 = i;
        m10135L0(2, 4, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoSurface(@Nullable Surface surface) {
        m10147X0();
        m10134K0();
        m10140Q0(surface);
        int i = surface == null ? 0 : -1;
        m10130G0(i, i);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        m10147X0();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        m10134K0();
        this.f7602Z = true;
        this.f7600X = surfaceHolder;
        surfaceHolder.addCallback(this.f7648x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m10140Q0(null);
            m10130G0(0, 0);
        } else {
            m10140Q0(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m10130G0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        m10147X0();
        if (surfaceView instanceof adl0) {
            m10134K0();
            m10140Q0(surfaceView);
            m10138O0(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            m10134K0();
            this.f7601Y = (SphericalGLSurfaceView) surfaceView;
            m10153s0(this.f7650y).m11857n(10000).m11856m(this.f7601Y).m11855l();
            this.f7601Y.m12244d(this.f7648x);
            m10140Q0(this.f7601Y.getVideoSurface());
            m10138O0(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setVideoTextureView(@Nullable TextureView textureView) {
        m10147X0();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        m10134K0();
        this.f7603a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kyv.m152151i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f7648x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m10140Q0(null);
            m10130G0(0, 0);
        } else {
            m10139P0(surfaceTexture);
            m10130G0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setVolume(float f) {
        m10147X0();
        final float fM105160p = bmk0.m105160p(f, 0.0f, 1.0f);
        if (this.f7619i0 == fM105160p) {
            return;
        }
        this.f7619i0 = fM105160p;
        m10136M0();
        this.f7624l.m105965k(22, new bqr.InterfaceC16083a() { // from class: l.m8f
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((InterfaceC2026t.d) obj).mo11830k0(fM105160p);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int i) {
        m10147X0();
        if (i == 0) {
            this.f7579C.m207344a(false);
            this.f7580D.m149619a(false);
        } else if (i == 1) {
            this.f7579C.m207344a(true);
            this.f7580D.m149619a(false);
        } else {
            if (i != 2) {
                return;
            }
            this.f7579C.m207344a(true);
            this.f7580D.m149619a(true);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void stop() {
        m10147X0();
        this.f7577A.m9750p(getPlayWhenReady(), 1);
        m10141R0(null);
        this.f7623k0 = new qyb(ImmutableList.m15739of(), this.f7645v0.f98646r);
    }

    /* JADX INFO: renamed from: t0 */
    public final Pair<Boolean, Integer> m10154t0(fe80 fe80Var, fe80 fe80Var2, boolean z, int i, boolean z2, boolean z3) {
        AbstractC1857c0 abstractC1857c0 = fe80Var2.f98629a;
        AbstractC1857c0 abstractC1857c1 = fe80Var.f98629a;
        if (abstractC1857c1.m9776u() && abstractC1857c0.m9776u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (abstractC1857c1.m9776u() != abstractC1857c0.m9776u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (abstractC1857c0.m9774r(abstractC1857c0.mo9454l(fe80Var2.f98630b.f101422a, this.f7628n).f7339c, this.f7325a).f7365a.equals(abstractC1857c1.m9774r(abstractC1857c1.mo9454l(fe80Var.f98630b.f101422a, this.f7628n).f7339c, this.f7325a).f7365a)) {
            if (z && i == 0 && fe80Var2.f98630b.f101425d < fe80Var.f98630b.f101425d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z && i == 1 && z3) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            wpg0.m207458a();
            return null;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: u0 */
    public final long m10155u0(fe80 fe80Var) {
        if (!fe80Var.f98630b.m128142b()) {
            return bmk0.m105152l1(m10156v0(fe80Var));
        }
        fe80Var.f98629a.mo9454l(fe80Var.f98630b.f101422a, this.f7628n);
        return fe80Var.f98631c == -9223372036854775807L ? fe80Var.f98629a.m9774r(m10157w0(fe80Var), this.f7325a).m9804d() : this.f7628n.m9793p() + bmk0.m105152l1(fe80Var.f98631c);
    }

    /* JADX INFO: renamed from: v0 */
    public final long m10156v0(fe80 fe80Var) {
        if (fe80Var.f98629a.m9776u()) {
            return bmk0.m105084J0(this.f7651y0);
        }
        long jM125296m = fe80Var.f98643o ? fe80Var.m125296m() : fe80Var.f98646r;
        return fe80Var.f98630b.m128142b() ? jM125296m : m10131H0(fe80Var.f98629a, fe80Var.f98630b, jM125296m);
    }

    /* JADX INFO: renamed from: w0 */
    public final int m10157w0(fe80 fe80Var) {
        return fe80Var.f98629a.m9776u() ? this.f7647w0 : fe80Var.f98629a.mo9454l(fe80Var.f98630b.f101422a, this.f7628n).f7339c;
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public final Pair<Object, Long> m10158x0(AbstractC1857c0 abstractC1857c0, AbstractC1857c0 abstractC1857c1, int i, long j) {
        if (abstractC1857c0.m9776u() || abstractC1857c1.m9776u()) {
            boolean z = !abstractC1857c0.m9776u() && abstractC1857c1.m9776u();
            return m10129F0(abstractC1857c1, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair<Object, Long> pairM9772n = abstractC1857c0.m9772n(this.f7325a, this.f7628n, i, bmk0.m105084J0(j));
        Object obj = ((Pair) bmk0.m105144j(pairM9772n)).first;
        if (abstractC1857c1.mo9450f(obj) != -1) {
            return pairM9772n;
        }
        Object objM10193D0 = C1893j.m10193D0(this.f7325a, this.f7628n, this.f7582F, this.f7583G, obj, abstractC1857c0, abstractC1857c1);
        if (objM10193D0 == null) {
            return m10129F0(abstractC1857c1, -1, -9223372036854775807L);
        }
        abstractC1857c1.mo9454l(objM10193D0, this.f7628n);
        int i2 = this.f7628n.f7339c;
        return m10129F0(abstractC1857c1, i2, abstractC1857c1.m9774r(i2, this.f7325a).m9804d());
    }

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC2026t.e m10159z0(long j) {
        Object obj;
        int iMo9450f;
        C1944n c1944n;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.f7645v0.f98629a.m9776u()) {
            obj = null;
            iMo9450f = -1;
            c1944n = null;
            obj2 = null;
        } else {
            fe80 fe80Var = this.f7645v0;
            Object obj3 = fe80Var.f98630b.f101422a;
            fe80Var.f98629a.mo9454l(obj3, this.f7628n);
            iMo9450f = this.f7645v0.f98629a.mo9450f(obj3);
            obj2 = obj3;
            obj = this.f7645v0.f98629a.m9774r(currentMediaItemIndex, this.f7325a).f7365a;
            c1944n = this.f7325a.f7367c;
        }
        int i = iMo9450f;
        long jM105152l1 = bmk0.m105152l1(j);
        long jM105152l2 = this.f7645v0.f98630b.m128142b() ? bmk0.m105152l1(m10068B0(this.f7645v0)) : jM105152l1;
        InterfaceC1988i.b bVar = this.f7645v0.f98630b;
        return new InterfaceC2026t.e(obj, currentMediaItemIndex, c1944n, obj2, i, jM105152l1, jM105152l2, bVar.f101423b, bVar.f101424c);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int i, InterfaceC1988i interfaceC1988i) {
        m10147X0();
        addMediaSources(i, Collections.singletonList(interfaceC1988i));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public void setMediaItems(List<C1944n> list, int i, long j) {
        m10147X0();
        setMediaSources(m10152r0(list), i, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void decreaseDeviceVolume(int i) {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9426c(i);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void increaseDeviceVolume(int i) {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9430i(i);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setDeviceMuted(boolean z, int i) {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9433l(z, i);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setDeviceVolume(int i, int i2) {
        m10147X0();
        StreamVolumeManager streamVolumeManager = this.f7578B;
        if (streamVolumeManager != null) {
            streamVolumeManager.m9435n(i, i2);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(InterfaceC1988i interfaceC1988i) {
        m10147X0();
        setMediaSources(Collections.singletonList(interfaceC1988i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(InterfaceC1988i interfaceC1988i, boolean z) {
        m10147X0();
        setMediaSources(Collections.singletonList(interfaceC1988i), z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void clearVideoSurface(@Nullable Surface surface) {
        m10147X0();
        if (surface == null || surface != this.f7598V) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<InterfaceC1988i> list) {
        m10147X0();
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<InterfaceC1988i> list, int i, long j) {
        m10147X0();
        m10137N0(list, i, j, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List<InterfaceC1988i> list) {
        m10147X0();
        addMediaSources(this.f7630o.size(), list);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(InterfaceC1988i interfaceC1988i) {
        m10147X0();
        setMediaSource(interfaceC1988i);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(InterfaceC1988i interfaceC1988i, boolean z, boolean z2) {
        m10147X0();
        setMediaSource(interfaceC1988i, z);
        prepare();
    }
}
