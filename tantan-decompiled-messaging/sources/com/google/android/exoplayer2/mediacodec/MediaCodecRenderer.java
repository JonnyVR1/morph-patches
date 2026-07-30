package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC1837d;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.ar3;
import p149l.b320;
import p149l.c850;
import p149l.dhd;
import p149l.dt2;
import p149l.g5j;
import p149l.hhd;
import p149l.hwb;
import p149l.j5j0;
import p149l.jwv;
import p149l.ohg0;
import p149l.p11;
import p149l.tqi0;
import p149l.uyi;
import p149l.v680;
import p149l.vck0;
import p149l.yq3;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class MediaCodecRenderer extends AbstractC1837d {

    /* JADX INFO: renamed from: h1 */
    public static final byte[] f7800h1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, HttpTokens.SPACE, 0, 0, 1, 101, -120, -124, HttpTokens.CARRIAGE_RETURN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A */
    public final c850 f7801A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public C1871k f7802B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public C1871k f7803C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public DrmSession f7804D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public DrmSession f7805E;

    /* JADX INFO: renamed from: E0 */
    public boolean f7806E0;

    /* JADX INFO: renamed from: F */
    @Nullable
    public MediaCrypto f7807F;

    /* JADX INFO: renamed from: F0 */
    @Nullable
    public yq3 f7808F0;

    /* JADX INFO: renamed from: G */
    public boolean f7809G;

    /* JADX INFO: renamed from: G0 */
    public long f7810G0;

    /* JADX INFO: renamed from: H */
    public long f7811H;

    /* JADX INFO: renamed from: H0 */
    public int f7812H0;

    /* JADX INFO: renamed from: I */
    public float f7813I;

    /* JADX INFO: renamed from: I0 */
    public int f7814I0;

    /* JADX INFO: renamed from: J */
    public float f7815J;

    /* JADX INFO: renamed from: J0 */
    @Nullable
    public ByteBuffer f7816J0;

    /* JADX INFO: renamed from: K */
    @Nullable
    public InterfaceC1884c f7817K;

    /* JADX INFO: renamed from: K0 */
    public boolean f7818K0;

    /* JADX INFO: renamed from: L */
    @Nullable
    public C1871k f7819L;

    /* JADX INFO: renamed from: L0 */
    public boolean f7820L0;

    /* JADX INFO: renamed from: M */
    @Nullable
    public MediaFormat f7821M;

    /* JADX INFO: renamed from: M0 */
    public boolean f7822M0;

    /* JADX INFO: renamed from: N */
    public boolean f7823N;

    /* JADX INFO: renamed from: N0 */
    public boolean f7824N0;

    /* JADX INFO: renamed from: O */
    public float f7825O;

    /* JADX INFO: renamed from: O0 */
    public boolean f7826O0;

    /* JADX INFO: renamed from: P */
    @Nullable
    public ArrayDeque<C1885d> f7827P;

    /* JADX INFO: renamed from: P0 */
    public boolean f7828P0;

    /* JADX INFO: renamed from: Q */
    @Nullable
    public DecoderInitializationException f7829Q;

    /* JADX INFO: renamed from: Q0 */
    public int f7830Q0;

    /* JADX INFO: renamed from: R */
    @Nullable
    public C1885d f7831R;

    /* JADX INFO: renamed from: R0 */
    public int f7832R0;

    /* JADX INFO: renamed from: S */
    public int f7833S;

    /* JADX INFO: renamed from: S0 */
    public int f7834S0;

    /* JADX INFO: renamed from: T */
    public boolean f7835T;

    /* JADX INFO: renamed from: T0 */
    public boolean f7836T0;

    /* JADX INFO: renamed from: U */
    public boolean f7837U;

    /* JADX INFO: renamed from: U0 */
    public boolean f7838U0;

    /* JADX INFO: renamed from: V */
    public boolean f7839V;

    /* JADX INFO: renamed from: V0 */
    public boolean f7840V0;

    /* JADX INFO: renamed from: W */
    public boolean f7841W;

    /* JADX INFO: renamed from: W0 */
    public long f7842W0;

    /* JADX INFO: renamed from: X */
    public boolean f7843X;

    /* JADX INFO: renamed from: X0 */
    public long f7844X0;

    /* JADX INFO: renamed from: Y */
    public boolean f7845Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f7846Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f7847Z;

    /* JADX INFO: renamed from: Z0 */
    public boolean f7848Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f7849a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f7850b1;

    /* JADX INFO: renamed from: c1 */
    @Nullable
    public ExoPlaybackException f7851c1;

    /* JADX INFO: renamed from: d1 */
    public dhd f7852d1;

    /* JADX INFO: renamed from: e1 */
    public C1875b f7853e1;

    /* JADX INFO: renamed from: f1 */
    public long f7854f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f7855g1;

    /* JADX INFO: renamed from: k0 */
    public boolean f7856k0;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1884c.b f7857p;

    /* JADX INFO: renamed from: p0 */
    public boolean f7858p0;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1886e f7859q;

    /* JADX INFO: renamed from: r */
    public final boolean f7860r;

    /* JADX INFO: renamed from: s */
    public final float f7861s;

    /* JADX INFO: renamed from: t */
    public final DecoderInputBuffer f7862t;

    /* JADX INFO: renamed from: u */
    public final DecoderInputBuffer f7863u;

    /* JADX INFO: renamed from: v */
    public final DecoderInputBuffer f7864v;

    /* JADX INFO: renamed from: w */
    public final dt2 f7865w;

    /* JADX INFO: renamed from: x */
    public final ArrayList<Long> f7866x;

    /* JADX INFO: renamed from: y */
    public final MediaCodec.BufferInfo f7867y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque<C1875b> f7868z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$a */
    @RequiresApi(31)
    public static final class C1874a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m10422a(InterfaceC1884c.a aVar, v680 v680Var) {
            LogSessionId logSessionIdM197200a = v680Var.m197200a();
            if (logSessionIdM197200a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f7894b.setString("log-session-id", logSessionIdM197200a.getStringId());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b */
    public static final class C1875b {

        /* JADX INFO: renamed from: e */
        public static final C1875b f7869e = new C1875b(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a */
        public final long f7870a;

        /* JADX INFO: renamed from: b */
        public final long f7871b;

        /* JADX INFO: renamed from: c */
        public final long f7872c;

        /* JADX INFO: renamed from: d */
        public final tqi0<C1871k> f7873d = new tqi0<>();

        public C1875b(long j, long j2, long j3) {
            this.f7870a = j;
            this.f7871b = j2;
            this.f7872c = j3;
        }
    }

    public MediaCodecRenderer(int i, InterfaceC1884c.b bVar, InterfaceC1886e interfaceC1886e, boolean z, float f) {
        super(i);
        this.f7857p = bVar;
        this.f7859q = (InterfaceC1886e) p11.m167011e(interfaceC1886e);
        this.f7860r = z;
        this.f7861s = f;
        this.f7862t = DecoderInputBuffer.m9802y();
        this.f7863u = new DecoderInputBuffer(0);
        this.f7864v = new DecoderInputBuffer(2);
        dt2 dt2Var = new dt2();
        this.f7865w = dt2Var;
        this.f7866x = new ArrayList<>();
        this.f7867y = new MediaCodec.BufferInfo();
        this.f7813I = 1.0f;
        this.f7815J = 1.0f;
        this.f7811H = -9223372036854775807L;
        this.f7868z = new ArrayDeque<>();
        m10399l1(C1875b.f7869e);
        dt2Var.m9805v(0);
        dt2Var.f7375c.order(ByteOrder.nativeOrder());
        this.f7801A = new c850();
        this.f7825O = -1.0f;
        this.f7833S = 0;
        this.f7830Q0 = 0;
        this.f7812H0 = -1;
        this.f7814I0 = -1;
        this.f7810G0 = -9223372036854775807L;
        this.f7842W0 = -9223372036854775807L;
        this.f7844X0 = -9223372036854775807L;
        this.f7854f1 = -9223372036854775807L;
        this.f7832R0 = 0;
        this.f7834S0 = 0;
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m10356K0(IllegalStateException illegalStateException) {
        if (vck0.f180948a >= 21 && m10357L0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: L0 */
    public static boolean m10357L0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: M0 */
    public static boolean m10358M0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m10359b0(String str, C1871k c1871k) {
        return vck0.f180948a < 21 && c1871k.f7750n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m10360c0(String str) {
        if (vck0.f180948a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(vck0.f180950c)) {
            return false;
        }
        String str2 = vck0.f180949b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m10361d0(String str) {
        int i = vck0.f180948a;
        if (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i > 19) {
            return false;
        }
        String str2 = vck0.f180949b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m10362e0(String str) {
        return vck0.f180948a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m10363f0(C1885d c1885d) {
        String str = c1885d.f7899a;
        int i = vck0.f180948a;
        if (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) {
            return true;
        }
        if (i > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(vck0.f180950c) && "AFTS".equals(vck0.f180951d) && c1885d.f7905g;
        }
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m10364g0(String str) {
        int i = vck0.f180948a;
        if (i < 18) {
            return true;
        }
        if (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i == 19 && vck0.f180951d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m10365h0(String str, C1871k c1871k) {
        return vck0.f180948a <= 18 && c1871k.f7761y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m10366i0(String str) {
        return vck0.f180948a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* JADX INFO: renamed from: u1 */
    public static boolean m10367u1(C1871k c1871k) {
        int i = c1871k.f7735G;
        return i == 0 || i == 2;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: A */
    public void mo10368A(float f, float f2) throws ExoPlaybackException {
        this.f7813I = f;
        this.f7815J = f2;
        m10416v1(this.f7819L);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract List<C1885d> mo9630A0(InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: renamed from: B0 */
    public abstract InterfaceC1884c.a mo9631B0(C1885d c1885d, C1871k c1871k, @Nullable MediaCrypto mediaCrypto, float f);

    @Override // com.google.android.exoplayer2.AbstractC1837d, com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: C */
    public final int mo9761C() {
        return 8;
    }

    /* JADX INFO: renamed from: C0 */
    public final long m10369C0() {
        return this.f7853e1.f7872c;
    }

    /* JADX INFO: renamed from: D0 */
    public float m10370D0() {
        return this.f7813I;
    }

    /* JADX INFO: renamed from: E0 */
    public void mo10371E0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m10372F0() {
        return this.f7814I0 >= 0;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10373G0(C1871k c1871k) {
        m10396k0();
        String str = c1871k.f7748l;
        if ("audio/mp4a-latm".equals(str) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str) || "audio/opus".equals(str)) {
            this.f7865w.m113530J(32);
        } else {
            this.f7865w.m113530J(1);
        }
        this.f7822M0 = true;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m10374H0(C1885d c1885d, @Nullable MediaCrypto mediaCrypto) throws Exception {
        String str = c1885d.f7899a;
        int i = vck0.f180948a;
        float fMo9660y0 = i < 23 ? -1.0f : mo9660y0(this.f7815J, this.f7802B, m9768J());
        float f = fMo9660y0 > this.f7861s ? fMo9660y0 : -1.0f;
        mo10382Y0(this.f7802B);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC1884c.a aVarMo9631B0 = mo9631B0(c1885d, this.f7802B, mediaCrypto, f);
        if (i >= 31) {
            C1874a.m10422a(aVarMo9631B0, m9767I());
        }
        try {
            j5j0.m139865a("createCodec:" + str);
            this.f7817K = this.f7857p.mo10488a(aVarMo9631B0);
            j5j0.m139867c();
            float f2 = f;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c1885d.m10518o(this.f7802B)) {
                jwv.m143689i("MediaCodecRenderer", vck0.m197793D("Format exceeds selected codec's capabilities [%s, %s]", C1871k.m10281j(this.f7802B), str));
            }
            this.f7831R = c1885d;
            this.f7825O = f2;
            this.f7819L = this.f7802B;
            this.f7833S = m10385a0(str);
            this.f7835T = m10359b0(str, this.f7819L);
            this.f7837U = m10364g0(str);
            this.f7839V = m10366i0(str);
            this.f7841W = m10361d0(str);
            this.f7843X = m10362e0(str);
            this.f7845Y = m10360c0(str);
            this.f7847Z = m10365h0(str, this.f7819L);
            this.f7806E0 = m10363f0(c1885d) || mo10419x0();
            if (this.f7817K.mo10479a()) {
                this.f7828P0 = true;
                this.f7830Q0 = 1;
                this.f7856k0 = this.f7833S != 0;
            }
            if ("c2.android.mp3.decoder".equals(c1885d.f7899a)) {
                this.f7808F0 = new yq3();
            }
            if (getState() == 2) {
                this.f7810G0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f7852d1.f86262a++;
            mo9642Q0(str, aVarMo9631B0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            j5j0.m139867c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m10375I0(C1871k c1871k) {
        return this.f7805E == null && mo9658s1(c1871k);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m10376J0(long j) {
        int size = this.f7866x.size();
        for (int i = 0; i < size; i++) {
            if (this.f7866x.get(i).longValue() == j) {
                this.f7866x.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: L */
    public void mo9636L() {
        this.f7802B = null;
        m10399l1(C1875b.f7869e);
        this.f7868z.clear();
        m10413t0();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: M */
    public void mo9637M(boolean z, boolean z2) throws ExoPlaybackException {
        this.f7852d1 = new dhd();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: N */
    public void mo9638N(long j, boolean z) throws ExoPlaybackException {
        this.f7846Y0 = false;
        this.f7848Z0 = false;
        this.f7850b1 = false;
        if (this.f7822M0) {
            this.f7865w.mo9803i();
            this.f7864v.mo9803i();
            this.f7824N0 = false;
            this.f7801A.m105654d();
        } else {
            m10412s0();
        }
        if (this.f7853e1.f7873d.m190123l() > 0) {
            this.f7849a1 = true;
        }
        this.f7853e1.f7873d.m190115c();
        this.f7868z.clear();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m10377N0() throws ExoPlaybackException {
        C1871k c1871k;
        if (this.f7817K != null || this.f7822M0 || (c1871k = this.f7802B) == null) {
            return;
        }
        if (m10375I0(c1871k)) {
            m10373G0(this.f7802B);
            return;
        }
        m10397k1(this.f7805E);
        String str = this.f7802B.f7748l;
        DrmSession drmSession = this.f7804D;
        if (drmSession != null) {
            hwb hwbVarMo9829d = drmSession.mo9829d();
            if (this.f7807F == null) {
                if (hwbVarMo9829d == null) {
                    if (this.f7804D.mo9826a() == null) {
                        return;
                    }
                } else if (hwbVarMo9829d instanceof g5j) {
                    g5j g5jVar = (g5j) hwbVarMo9829d;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(g5jVar.f101163a, g5jVar.f101164b);
                        this.f7807F = mediaCrypto;
                        this.f7809G = !g5jVar.f101165c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw m9762D(e, this.f7802B, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                    }
                }
            }
            if (g5j.f101162d && (hwbVarMo9829d instanceof g5j)) {
                int state = this.f7804D.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) p11.m167011e(this.f7804D.mo9826a());
                    throw m9762D(drmSessionException, this.f7802B, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m10378O0(this.f7807F, this.f7809G);
        } catch (DecoderInitializationException e2) {
            throw m9762D(e2, this.f7802B, 4001);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x004a A[SYNTHETIC] */
    /* JADX INFO: renamed from: O0 */
    public final void m10378O0(@Nullable MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        DecoderInitializationException decoderInitializationException2;
        if (this.f7827P == null) {
            try {
                List<C1885d> listM10414u0 = m10414u0(z);
                ArrayDeque<C1885d> arrayDeque = new ArrayDeque<>();
                this.f7827P = arrayDeque;
                if (this.f7860r) {
                    arrayDeque.addAll(listM10414u0);
                } else if (!listM10414u0.isEmpty()) {
                    this.f7827P.add(listM10414u0.get(0));
                }
                this.f7829Q = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f7802B, e, z, -49998);
            }
        }
        if (this.f7827P.isEmpty()) {
            throw new DecoderInitializationException(this.f7802B, (Throwable) null, z, -49999);
        }
        C1885d c1885dPeekFirst = this.f7827P.peekFirst();
        while (this.f7817K == null) {
            C1885d c1885dPeekFirst2 = this.f7827P.peekFirst();
            if (!mo10409q1(c1885dPeekFirst2)) {
                return;
            }
            try {
                m10374H0(c1885dPeekFirst2, mediaCrypto);
            } catch (Exception e2) {
                if (c1885dPeekFirst2 != c1885dPeekFirst) {
                    throw e2;
                }
                try {
                    jwv.m143689i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    m10374H0(c1885dPeekFirst2, mediaCrypto);
                } catch (Exception e3) {
                    jwv.m143690j("MediaCodecRenderer", "Failed to initialize decoder: " + c1885dPeekFirst2, e3);
                    this.f7827P.removeFirst();
                    decoderInitializationException = new DecoderInitializationException(this.f7802B, e3, z, c1885dPeekFirst2);
                    mo9640P0(decoderInitializationException);
                    decoderInitializationException2 = this.f7829Q;
                    if (decoderInitializationException2 == null) {
                        this.f7829Q = decoderInitializationException;
                    } else {
                        this.f7829Q = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                    }
                    if (!this.f7827P.isEmpty()) {
                        throw this.f7829Q;
                    }
                }
                jwv.m143690j("MediaCodecRenderer", "Failed to initialize decoder: " + c1885dPeekFirst2, e3);
                this.f7827P.removeFirst();
                decoderInitializationException = new DecoderInitializationException(this.f7802B, e3, z, c1885dPeekFirst2);
                mo9640P0(decoderInitializationException);
                decoderInitializationException2 = this.f7829Q;
                if (decoderInitializationException2 == null) {
                    this.f7829Q = decoderInitializationException;
                } else {
                    this.f7829Q = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                }
                if (!this.f7827P.isEmpty()) {
                    throw this.f7829Q;
                }
            }
        }
        this.f7827P = null;
    }

    /* JADX INFO: renamed from: P0 */
    public abstract void mo9640P0(Exception exc);

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: Q */
    public void mo9641Q() {
        try {
            m10396k0();
            m10389e1();
        } finally {
            m10405o1(null);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo9642Q0(String str, InterfaceC1884c.a aVar, long j, long j2);

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: R */
    public void mo9643R() {
    }

    /* JADX INFO: renamed from: R0 */
    public abstract void mo9644R0(String str);

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: S */
    public void mo9645S() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    @Nullable
    @CallSuper
    /* JADX INFO: renamed from: S0 */
    public hhd mo9646S0(uyi uyiVar) throws ExoPlaybackException {
        boolean z = true;
        this.f7849a1 = true;
        C1871k c1871k = (C1871k) p11.m167011e(uyiVar.f178866b);
        if (c1871k.f7748l == null) {
            throw m9762D(new IllegalArgumentException(), c1871k, 4005);
        }
        m10405o1(uyiVar.f178865a);
        this.f7802B = c1871k;
        if (this.f7822M0) {
            this.f7826O0 = true;
            return null;
        }
        InterfaceC1884c interfaceC1884c = this.f7817K;
        if (interfaceC1884c == null) {
            this.f7827P = null;
            m10377N0();
            return null;
        }
        C1885d c1885d = this.f7831R;
        C1871k c1871k2 = this.f7819L;
        if (m10406p0(c1885d, c1871k, this.f7804D, this.f7805E)) {
            m10400m0();
            return new hhd(c1885d.f7899a, c1871k2, c1871k, 0, 128);
        }
        int i = 0;
        boolean z2 = this.f7805E != this.f7804D;
        p11.m167013g(!z2 || vck0.f180948a >= 23);
        hhd hhdVarMo9651Z = mo9651Z(c1885d, c1871k2, c1871k);
        int i2 = hhdVarMo9651Z.f107702d;
        if (i2 == 0) {
            m10400m0();
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    ohg0.m164364a();
                    return null;
                }
                if (m10416v1(c1871k)) {
                    this.f7819L = c1871k;
                    if (z2 && !m10402n0()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (m10416v1(c1871k)) {
                this.f7828P0 = true;
                this.f7830Q0 = 1;
                int i3 = this.f7833S;
                if (i3 != 2 && (i3 != 1 || c1871k.f7753q != c1871k2.f7753q || c1871k.f7754r != c1871k2.f7754r)) {
                    z = false;
                }
                this.f7856k0 = z;
                this.f7819L = c1871k;
                if (z2 && !m10402n0()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
        } else if (m10416v1(c1871k)) {
            this.f7819L = c1871k;
            if (!z2 ? !m10398l0() : !m10402n0()) {
                i = 2;
            }
        } else {
            i = 16;
        }
        return (hhdVarMo9651Z.f107702d == 0 || (this.f7817K == interfaceC1884c && this.f7834S0 != 3)) ? hhdVarMo9651Z : new hhd(c1885d.f7899a, c1871k2, c1871k, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9771T(com.google.android.exoplayer2.C1871k[] r13, long r14, long r16) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r12 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r13 = r12.f7853e1
            long r0 = r13.f7872c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.m10399l1(r4)
            return
        L1e:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b> r13 = r12.f7868z
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f7842W0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.f7854f1
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m10399l1(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r13 = r12.f7853e1
            long r13 = r13.f7872c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.mo9649W0()
        L51:
            return
        L52:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b> r13 = r12.f7868z
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            long r6 = r12.f7842W0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo9771T(com.google.android.exoplayer2.k[], long, long):void");
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo9647T0(C1871k c1871k, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    /* JADX INFO: renamed from: U0 */
    public void mo9648U0(long j) {
    }

    @CallSuper
    /* JADX INFO: renamed from: V0 */
    public void mo10379V0(long j) {
        this.f7854f1 = j;
        while (!this.f7868z.isEmpty() && j >= this.f7868z.peek().f7870a) {
            m10399l1(this.f7868z.poll());
            mo9649W0();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void mo9649W0() {
    }

    /* JADX INFO: renamed from: X */
    public final void m10380X() throws ExoPlaybackException {
        String str;
        p11.m167013g(!this.f7846Y0);
        uyi uyiVarM9765G = m9765G();
        this.f7864v.mo9803i();
        do {
            this.f7864v.mo9803i();
            int iM9772U = m9772U(uyiVarM9765G, this.f7864v, 0);
            if (iM9772U == -5) {
                mo9646S0(uyiVarM9765G);
                return;
            }
            if (iM9772U != -4) {
                if (iM9772U == -3) {
                    return;
                }
                ohg0.m164364a();
                return;
            } else {
                if (this.f7864v.m154495p()) {
                    this.f7846Y0 = true;
                    return;
                }
                if (this.f7849a1) {
                    C1871k c1871k = (C1871k) p11.m167011e(this.f7802B);
                    this.f7803C = c1871k;
                    mo9647T0(c1871k, null);
                    this.f7849a1 = false;
                }
                this.f7864v.m9806w();
                C1871k c1871k2 = this.f7802B;
                if (c1871k2 != null && (str = c1871k2.f7748l) != null && str.equals("audio/opus")) {
                    this.f7801A.m105651a(this.f7864v, this.f7802B.f7750n);
                }
            }
        } while (this.f7865w.m113524A(this.f7864v));
        this.f7824N0 = true;
    }

    /* JADX INFO: renamed from: X0 */
    public abstract void mo9650X0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    /* JADX INFO: renamed from: Y */
    public final boolean m10381Y(long j, long j2) throws ExoPlaybackException {
        boolean z;
        p11.m167013g(!this.f7848Z0);
        if (this.f7865w.m113529I()) {
            dt2 dt2Var = this.f7865w;
            z = false;
            if (!mo9652a1(j, j2, null, dt2Var.f7375c, this.f7814I0, 0, dt2Var.m113528H(), this.f7865w.m113526C(), this.f7865w.m154494o(), this.f7865w.m154495p(), this.f7803C)) {
                return false;
            }
            mo10379V0(this.f7865w.m113527F());
            this.f7865w.mo9803i();
        } else {
            z = false;
        }
        if (this.f7846Y0) {
            this.f7848Z0 = true;
            return z;
        }
        if (this.f7824N0) {
            p11.m167013g(this.f7865w.m113524A(this.f7864v));
            this.f7824N0 = z;
        }
        if (this.f7826O0) {
            if (this.f7865w.m113529I()) {
                return true;
            }
            m10396k0();
            this.f7826O0 = z;
            m10377N0();
            if (!this.f7822M0) {
                return z;
            }
        }
        m10380X();
        if (this.f7865w.m113529I()) {
            this.f7865w.m9806w();
        }
        if (this.f7865w.m113529I() || this.f7846Y0 || this.f7826O0) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo10382Y0(C1871k c1871k) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: Z */
    public abstract hhd mo9651Z(C1885d c1885d, C1871k c1871k, C1871k c1871k2);

    @TargetApi(23)
    /* JADX INFO: renamed from: Z0 */
    public final void m10383Z0() throws ExoPlaybackException {
        int i = this.f7834S0;
        if (i == 1) {
            m10410r0();
            return;
        }
        if (i == 2) {
            m10410r0();
            m10418w1();
        } else if (i == 3) {
            m10388d1();
        } else {
            this.f7848Z0 = true;
            mo9656f1();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: a */
    public final int mo10384a(C1871k c1871k) throws ExoPlaybackException {
        try {
            return mo9659t1(this.f7859q, c1871k);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw m9762D(e, c1871k, 4002);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final int m10385a0(String str) {
        int i = vck0.f180948a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = vck0.f180951d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = vck0.f180949b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: a1 */
    public abstract boolean mo9652a1(long j, long j2, @Nullable InterfaceC1884c interfaceC1884c, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1871k c1871k) throws ExoPlaybackException;

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: b */
    public boolean mo9653b() {
        if (this.f7802B == null) {
            return false;
        }
        if (m9769K() || m10372F0()) {
            return true;
        }
        return this.f7810G0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f7810G0;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m10386b1() {
        this.f7840V0 = true;
        MediaFormat outputFormat = this.f7817K.getOutputFormat();
        if (this.f7833S != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f7858p0 = true;
            return;
        }
        if (this.f7847Z) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.f7821M = outputFormat;
        this.f7823N = true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: c */
    public boolean mo9654c() {
        return this.f7848Z0;
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m10387c1(int i) throws ExoPlaybackException {
        uyi uyiVarM9765G = m9765G();
        this.f7862t.mo9803i();
        int iM9772U = m9772U(uyiVarM9765G, this.f7862t, i | 4);
        if (iM9772U == -5) {
            mo9646S0(uyiVarM9765G);
            return true;
        }
        if (iM9772U != -4 || !this.f7862t.m154495p()) {
            return false;
        }
        this.f7846Y0 = true;
        m10383Z0();
        return false;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m10388d1() throws ExoPlaybackException {
        m10389e1();
        m10377N0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public void m10389e1() {
        try {
            InterfaceC1884c interfaceC1884c = this.f7817K;
            if (interfaceC1884c != null) {
                interfaceC1884c.release();
                this.f7852d1.f86263b++;
                mo9644R0(this.f7831R.f7899a);
            }
            this.f7817K = null;
            try {
                MediaCrypto mediaCrypto = this.f7807F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f7807F = null;
                m10397k1(null);
                m10391h1();
            }
        } catch (Throwable th) {
            this.f7817K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f7807F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f7807F = null;
                m10397k1(null);
                m10391h1();
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void mo9656f1() throws ExoPlaybackException {
    }

    @CallSuper
    /* JADX INFO: renamed from: g1 */
    public void mo10390g1() {
        m10392i1();
        m10395j1();
        this.f7810G0 = -9223372036854775807L;
        this.f7838U0 = false;
        this.f7836T0 = false;
        this.f7856k0 = false;
        this.f7858p0 = false;
        this.f7818K0 = false;
        this.f7820L0 = false;
        this.f7866x.clear();
        this.f7842W0 = -9223372036854775807L;
        this.f7844X0 = -9223372036854775807L;
        this.f7854f1 = -9223372036854775807L;
        yq3 yq3Var = this.f7808F0;
        if (yq3Var != null) {
            yq3Var.m215697c();
        }
        this.f7832R0 = 0;
        this.f7834S0 = 0;
        this.f7830Q0 = this.f7828P0 ? 1 : 0;
    }

    @CallSuper
    /* JADX INFO: renamed from: h1 */
    public void m10391h1() {
        mo10390g1();
        this.f7851c1 = null;
        this.f7808F0 = null;
        this.f7827P = null;
        this.f7831R = null;
        this.f7819L = null;
        this.f7821M = null;
        this.f7823N = false;
        this.f7840V0 = false;
        this.f7825O = -1.0f;
        this.f7833S = 0;
        this.f7835T = false;
        this.f7837U = false;
        this.f7839V = false;
        this.f7841W = false;
        this.f7843X = false;
        this.f7845Y = false;
        this.f7847Z = false;
        this.f7806E0 = false;
        this.f7828P0 = false;
        this.f7830Q0 = 0;
        this.f7809G = false;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m10392i1() {
        this.f7812H0 = -1;
        this.f7863u.f7375c = null;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: j */
    public void mo10393j(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.f7850b1) {
            this.f7850b1 = false;
            m10383Z0();
        }
        ExoPlaybackException exoPlaybackException = this.f7851c1;
        if (exoPlaybackException != null) {
            this.f7851c1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f7848Z0) {
                mo9656f1();
                return;
            }
            if (this.f7802B != null || m10387c1(2)) {
                m10377N0();
                if (this.f7822M0) {
                    j5j0.m139865a("bypassRender");
                    while (m10381Y(j, j2)) {
                    }
                    j5j0.m139867c();
                } else if (this.f7817K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    j5j0.m139865a("drainAndFeed");
                    while (m10404o0(j, j2) && m10407p1(jElapsedRealtime)) {
                    }
                    while (m10408q0() && m10407p1(jElapsedRealtime)) {
                    }
                    j5j0.m139867c();
                } else {
                    this.f7852d1.f86265d += m9774W(j);
                    m10387c1(1);
                }
                this.f7852d1.m111817c();
            }
        } catch (IllegalStateException e) {
            if (!m10356K0(e)) {
                throw e;
            }
            mo9640P0(e);
            if (vck0.f180948a >= 21 && m10358M0(e)) {
                z = true;
            }
            if (z) {
                m10389e1();
            }
            throw m9763E(mo10394j0(e, m10417w0()), this.f7802B, z, 4003);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public MediaCodecDecoderException mo10394j0(Throwable th, @Nullable C1885d c1885d) {
        return new MediaCodecDecoderException(th, c1885d);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m10395j1() {
        this.f7814I0 = -1;
        this.f7816J0 = null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m10396k0() {
        this.f7826O0 = false;
        this.f7865w.mo9803i();
        this.f7864v.mo9803i();
        this.f7824N0 = false;
        this.f7822M0 = false;
        this.f7801A.m105654d();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m10397k1(@Nullable DrmSession drmSession) {
        DrmSession.m9909e(this.f7804D, drmSession);
        this.f7804D = drmSession;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m10398l0() {
        if (this.f7836T0) {
            this.f7832R0 = 1;
            if (this.f7837U || this.f7841W) {
                this.f7834S0 = 3;
                return false;
            }
            this.f7834S0 = 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m10399l1(C1875b c1875b) {
        this.f7853e1 = c1875b;
        long j = c1875b.f7872c;
        if (j != -9223372036854775807L) {
            this.f7855g1 = true;
            mo9648U0(j);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m10400m0() throws ExoPlaybackException {
        if (!this.f7836T0) {
            m10388d1();
        } else {
            this.f7832R0 = 1;
            this.f7834S0 = 3;
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m10401m1() {
        this.f7850b1 = true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: n0 */
    public final boolean m10402n0() throws ExoPlaybackException {
        if (this.f7836T0) {
            this.f7832R0 = 1;
            if (this.f7837U || this.f7841W) {
                this.f7834S0 = 3;
                return false;
            }
            this.f7834S0 = 2;
        } else {
            m10418w1();
        }
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m10403n1(ExoPlaybackException exoPlaybackException) {
        this.f7851c1 = exoPlaybackException;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m10404o0(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean zMo9652a1;
        int iMo10481c;
        if (!m10372F0()) {
            if (this.f7843X && this.f7838U0) {
                try {
                    iMo10481c = this.f7817K.mo10481c(this.f7867y);
                } catch (IllegalStateException unused) {
                    m10383Z0();
                    if (this.f7848Z0) {
                        m10389e1();
                    }
                    return false;
                }
            } else {
                iMo10481c = this.f7817K.mo10481c(this.f7867y);
            }
            if (iMo10481c < 0) {
                if (iMo10481c == -2) {
                    m10386b1();
                    return true;
                }
                if (this.f7806E0 && (this.f7846Y0 || this.f7832R0 == 2)) {
                    m10383Z0();
                }
                return false;
            }
            if (this.f7858p0) {
                this.f7858p0 = false;
                this.f7817K.releaseOutputBuffer(iMo10481c, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f7867y;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m10383Z0();
                return false;
            }
            this.f7814I0 = iMo10481c;
            ByteBuffer outputBuffer = this.f7817K.getOutputBuffer(iMo10481c);
            this.f7816J0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f7867y.offset);
                ByteBuffer byteBuffer = this.f7816J0;
                MediaCodec.BufferInfo bufferInfo2 = this.f7867y;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f7845Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f7867y;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j3 = this.f7842W0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j3;
                    }
                }
            }
            this.f7818K0 = m10376J0(this.f7867y.presentationTimeUs);
            long j4 = this.f7844X0;
            long j5 = this.f7867y.presentationTimeUs;
            this.f7820L0 = j4 == j5;
            m10420x1(j5);
        }
        if (this.f7843X && this.f7838U0) {
            try {
                InterfaceC1884c interfaceC1884c = this.f7817K;
                ByteBuffer byteBuffer2 = this.f7816J0;
                int i = this.f7814I0;
                MediaCodec.BufferInfo bufferInfo4 = this.f7867y;
                z = false;
                try {
                    zMo9652a1 = mo9652a1(j, j2, interfaceC1884c, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f7818K0, this.f7820L0, this.f7803C);
                } catch (IllegalStateException unused2) {
                    m10383Z0();
                    if (this.f7848Z0) {
                        m10389e1();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            InterfaceC1884c interfaceC1884c2 = this.f7817K;
            ByteBuffer byteBuffer3 = this.f7816J0;
            int i2 = this.f7814I0;
            MediaCodec.BufferInfo bufferInfo5 = this.f7867y;
            zMo9652a1 = mo9652a1(j, j2, interfaceC1884c2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f7818K0, this.f7820L0, this.f7803C);
        }
        if (zMo9652a1) {
            mo10379V0(this.f7867y.presentationTimeUs);
            boolean z2 = (this.f7867y.flags & 4) != 0 ? true : z;
            m10395j1();
            if (!z2) {
                return true;
            }
            m10383Z0();
        }
        return z;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m10405o1(@Nullable DrmSession drmSession) {
        DrmSession.m9909e(this.f7805E, drmSession);
        this.f7805E = drmSession;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m10406p0(C1885d c1885d, C1871k c1871k, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        hwb hwbVarMo9829d;
        hwb hwbVarMo9829d2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (hwbVarMo9829d = drmSession2.mo9829d()) != null && (hwbVarMo9829d2 = drmSession.mo9829d()) != null && hwbVarMo9829d.getClass().equals(hwbVarMo9829d2.getClass())) {
            if (!(hwbVarMo9829d instanceof g5j)) {
                return false;
            }
            g5j g5jVar = (g5j) hwbVarMo9829d;
            if (!drmSession2.mo9832h().equals(drmSession.mo9832h()) || vck0.f180948a < 23) {
                return true;
            }
            UUID uuid = ar3.f71232e;
            if (!uuid.equals(drmSession.mo9832h()) && !uuid.equals(drmSession2.mo9832h())) {
                return !c1885d.f7905g && (g5jVar.f101165c ? false : drmSession2.mo9833i(c1871k.f7748l));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p1 */
    public final boolean m10407p1(long j) {
        return this.f7811H == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f7811H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.exoplayer2.d, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.exoplayer2.d, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r15v3, types: [l.dhd] */
    /* JADX INFO: renamed from: q0 */
    public final boolean m10408q0() throws ExoPlaybackException {
        int i;
        if (this.f7817K == null || (i = this.f7832R0) == 2 || this.f7846Y0) {
            return false;
        }
        if (i == 0 && m10411r1()) {
            m10400m0();
        }
        if (this.f7812H0 < 0) {
            int iMo10483e = this.f7817K.mo10483e();
            this.f7812H0 = iMo10483e;
            if (iMo10483e < 0) {
                return false;
            }
            this.f7863u.f7375c = this.f7817K.getInputBuffer(iMo10483e);
            this.f7863u.mo9803i();
        }
        if (this.f7832R0 == 1) {
            if (!this.f7806E0) {
                this.f7838U0 = true;
                this.f7817K.queueInputBuffer(this.f7812H0, 0, 0, 0L, 4);
                m10392i1();
            }
            this.f7832R0 = 2;
            return false;
        }
        if (this.f7856k0) {
            this.f7856k0 = false;
            ByteBuffer byteBuffer = this.f7863u.f7375c;
            byte[] bArr = f7800h1;
            byteBuffer.put(bArr);
            this.f7817K.queueInputBuffer(this.f7812H0, 0, bArr.length, 0L, 0);
            m10392i1();
            this.f7836T0 = true;
            return true;
        }
        if (this.f7830Q0 == 1) {
            for (int i2 = 0; i2 < this.f7819L.f7750n.size(); i2++) {
                this.f7863u.f7375c.put(this.f7819L.f7750n.get(i2));
            }
            this.f7830Q0 = 2;
        }
        int iPosition = this.f7863u.f7375c.position();
        uyi uyiVarM9765G = m9765G();
        try {
            int iM9772U = m9772U(uyiVarM9765G, this.f7863u, 0);
            if (mo9775d() || this.f7863u.m154498s()) {
                this.f7844X0 = this.f7842W0;
            }
            if (iM9772U == -3) {
                return false;
            }
            if (iM9772U == -5) {
                if (this.f7830Q0 == 2) {
                    this.f7863u.mo9803i();
                    this.f7830Q0 = 1;
                }
                mo9646S0(uyiVarM9765G);
                return true;
            }
            if (this.f7863u.m154495p()) {
                if (this.f7830Q0 == 2) {
                    this.f7863u.mo9803i();
                    this.f7830Q0 = 1;
                }
                this.f7846Y0 = true;
                if (!this.f7836T0) {
                    m10383Z0();
                    return false;
                }
                try {
                    if (!this.f7806E0) {
                        this.f7838U0 = true;
                        this.f7817K.queueInputBuffer(this.f7812H0, 0, 0, 0L, 4);
                        m10392i1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m9762D(e, this.f7802B, vck0.m197833X(e.getErrorCode()));
                }
            }
            if (!this.f7836T0 && !this.f7863u.m154497r()) {
                this.f7863u.mo9803i();
                if (this.f7830Q0 == 2) {
                    this.f7830Q0 = 1;
                }
                return true;
            }
            boolean zM9807x = this.f7863u.m9807x();
            if (zM9807x) {
                this.f7863u.f7374b.m138721b(iPosition);
            }
            if (this.f7835T && !zM9807x) {
                b320.m100039b(this.f7863u.f7375c);
                if (this.f7863u.f7375c.position() == 0) {
                    return true;
                }
                this.f7835T = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f7863u;
            long jM215698d = decoderInputBuffer.f7377e;
            yq3 yq3Var = this.f7808F0;
            if (yq3Var != null) {
                jM215698d = yq3Var.m215698d(this.f7802B, decoderInputBuffer);
                this.f7842W0 = Math.max(this.f7842W0, this.f7808F0.m215696b(this.f7802B));
            }
            long j = jM215698d;
            if (this.f7863u.m154494o()) {
                this.f7866x.add(Long.valueOf(j));
            }
            if (this.f7849a1) {
                if (this.f7868z.isEmpty()) {
                    this.f7853e1.f7873d.m190113a(j, this.f7802B);
                } else {
                    this.f7868z.peekLast().f7873d.m190113a(j, this.f7802B);
                }
                this.f7849a1 = false;
            }
            this.f7842W0 = Math.max(this.f7842W0, j);
            this.f7863u.m9806w();
            if (this.f7863u.m154493n()) {
                mo10371E0(this.f7863u);
            }
            mo9650X0(this.f7863u);
            InterfaceC1884c interfaceC1884c = this.f7817K;
            try {
                if (zM9807x) {
                    interfaceC1884c.mo10480b(this.f7812H0, 0, this.f7863u.f7374b, j, 0);
                } else {
                    interfaceC1884c.queueInputBuffer(this.f7812H0, 0, this.f7863u.f7375c.limit(), j, 0);
                }
                m10392i1();
                this.f7836T0 = true;
                this.f7830Q0 = 0;
                this = this.f7852d1;
                this.f86264c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw this.m9762D(e2, this.f7802B, vck0.m197833X(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            mo9640P0(e3);
            m10387c1(0);
            m10410r0();
            return true;
        }
    }

    /* JADX INFO: renamed from: q1 */
    public boolean mo10409q1(C1885d c1885d) {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10410r0() {
        try {
            this.f7817K.flush();
        } finally {
            mo10390g1();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m10411r1() {
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m10412s0() throws ExoPlaybackException {
        boolean zM10413t0 = m10413t0();
        if (zM10413t0) {
            m10377N0();
        }
        return zM10413t0;
    }

    /* JADX INFO: renamed from: s1 */
    public boolean mo9658s1(C1871k c1871k) {
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m10413t0() {
        if (this.f7817K == null) {
            return false;
        }
        int i = this.f7834S0;
        if (i == 3 || this.f7837U || ((this.f7839V && !this.f7840V0) || (this.f7841W && this.f7838U0))) {
            m10389e1();
            return true;
        }
        if (i == 2) {
            int i2 = vck0.f180948a;
            p11.m167013g(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m10418w1();
                } catch (ExoPlaybackException e) {
                    jwv.m143690j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m10389e1();
                    return true;
                }
            }
        }
        m10410r0();
        return false;
    }

    /* JADX INFO: renamed from: t1 */
    public abstract int mo9659t1(InterfaceC1886e interfaceC1886e, C1871k c1871k) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: renamed from: u0 */
    public final List<C1885d> m10414u0(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<C1885d> listMo9630A0 = mo9630A0(this.f7859q, this.f7802B, z);
        if (!listMo9630A0.isEmpty() || !z) {
            return listMo9630A0;
        }
        List<C1885d> listMo9630A1 = mo9630A0(this.f7859q, this.f7802B, false);
        if (!listMo9630A1.isEmpty()) {
            jwv.m143689i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f7802B.f7748l + ", but no secure decoder available. Trying to proceed with " + listMo9630A1 + ".");
        }
        return listMo9630A1;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC1884c m10415v0() {
        return this.f7817K;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m10416v1(C1871k c1871k) throws ExoPlaybackException {
        if (vck0.f180948a >= 23 && this.f7817K != null && this.f7834S0 != 3 && getState() != 0) {
            float fMo9660y0 = mo9660y0(this.f7815J, c1871k, m9768J());
            float f = this.f7825O;
            if (f == fMo9660y0) {
                return true;
            }
            if (fMo9660y0 == -1.0f) {
                m10400m0();
                return false;
            }
            if (f == -1.0f && fMo9660y0 <= this.f7861s) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo9660y0);
            this.f7817K.setParameters(bundle);
            this.f7825O = fMo9660y0;
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: w0 */
    public final C1885d m10417w0() {
        return this.f7831R;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: w1 */
    public final void m10418w1() throws ExoPlaybackException {
        hwb hwbVarMo9829d = this.f7805E.mo9829d();
        if (hwbVarMo9829d instanceof g5j) {
            try {
                this.f7807F.setMediaDrmSession(((g5j) hwbVarMo9829d).f101164b);
            } catch (MediaCryptoException e) {
                throw m9762D(e, this.f7802B, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        m10397k1(this.f7805E);
        this.f7832R0 = 0;
        this.f7834S0 = 0;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean mo10419x0() {
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10420x1(long j) throws ExoPlaybackException {
        C1871k c1871kM190121j = this.f7853e1.f7873d.m190121j(j);
        if (c1871kM190121j == null && this.f7855g1 && this.f7821M != null) {
            c1871kM190121j = this.f7853e1.f7873d.m190120i();
        }
        if (c1871kM190121j != null) {
            this.f7803C = c1871kM190121j;
        } else if (!this.f7823N || this.f7803C == null) {
            return;
        }
        mo9647T0(this.f7803C, this.f7821M);
        this.f7823N = false;
        this.f7855g1 = false;
    }

    /* JADX INFO: renamed from: y0 */
    public abstract float mo9660y0(float f, C1871k c1871k, C1871k[] c1871kArr);

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public final MediaFormat m10421z0() {
        return this.f7821M;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final C1885d codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(C1871k c1871k, @Nullable Throwable th, boolean z, C1885d c1885d) {
            this("Decoder init failed: " + c1885d.f7899a + ", " + c1871k, th, c1871k.f7748l, z, c1885d, vck0.f180948a >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        @Nullable
        @RequiresApi(21)
        private static String getDiagnosticInfoV21(@Nullable Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(C1871k c1871k, @Nullable Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c1871k, th, c1871k.f7748l, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private DecoderInitializationException(String str, @Nullable Throwable th, String str2, boolean z, @Nullable C1885d c1885d, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = c1885d;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
