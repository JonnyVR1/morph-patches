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
import com.google.android.exoplayer2.AbstractC1860d;
import com.google.android.exoplayer2.C1894k;
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
import p153l.b8j;
import p153l.bf80;
import p153l.bmk0;
import p153l.jb20;
import p153l.jg50;
import p153l.jid;
import p153l.kyv;
import p153l.nej0;
import p153l.nid;
import p153l.p1j;
import p153l.tt2;
import p153l.vxb;
import p153l.w11;
import p153l.wpg0;
import p153l.wzi0;
import p153l.xr3;
import p153l.zr3;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class MediaCodecRenderer extends AbstractC1860d {

    /* JADX INFO: renamed from: h1 */
    public static final byte[] f7837h1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, HttpTokens.SPACE, 0, 0, 1, 101, -120, -124, HttpTokens.CARRIAGE_RETURN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A */
    public final jg50 f7838A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public C1894k f7839B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public C1894k f7840C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public DrmSession f7841D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public DrmSession f7842E;

    /* JADX INFO: renamed from: E0 */
    public boolean f7843E0;

    /* JADX INFO: renamed from: F */
    @Nullable
    public MediaCrypto f7844F;

    /* JADX INFO: renamed from: F0 */
    @Nullable
    public xr3 f7845F0;

    /* JADX INFO: renamed from: G */
    public boolean f7846G;

    /* JADX INFO: renamed from: G0 */
    public long f7847G0;

    /* JADX INFO: renamed from: H */
    public long f7848H;

    /* JADX INFO: renamed from: H0 */
    public int f7849H0;

    /* JADX INFO: renamed from: I */
    public float f7850I;

    /* JADX INFO: renamed from: I0 */
    public int f7851I0;

    /* JADX INFO: renamed from: J */
    public float f7852J;

    /* JADX INFO: renamed from: J0 */
    @Nullable
    public ByteBuffer f7853J0;

    /* JADX INFO: renamed from: K */
    @Nullable
    public InterfaceC1907c f7854K;

    /* JADX INFO: renamed from: K0 */
    public boolean f7855K0;

    /* JADX INFO: renamed from: L */
    @Nullable
    public C1894k f7856L;

    /* JADX INFO: renamed from: L0 */
    public boolean f7857L0;

    /* JADX INFO: renamed from: M */
    @Nullable
    public MediaFormat f7858M;

    /* JADX INFO: renamed from: M0 */
    public boolean f7859M0;

    /* JADX INFO: renamed from: N */
    public boolean f7860N;

    /* JADX INFO: renamed from: N0 */
    public boolean f7861N0;

    /* JADX INFO: renamed from: O */
    public float f7862O;

    /* JADX INFO: renamed from: O0 */
    public boolean f7863O0;

    /* JADX INFO: renamed from: P */
    @Nullable
    public ArrayDeque<C1908d> f7864P;

    /* JADX INFO: renamed from: P0 */
    public boolean f7865P0;

    /* JADX INFO: renamed from: Q */
    @Nullable
    public DecoderInitializationException f7866Q;

    /* JADX INFO: renamed from: Q0 */
    public int f7867Q0;

    /* JADX INFO: renamed from: R */
    @Nullable
    public C1908d f7868R;

    /* JADX INFO: renamed from: R0 */
    public int f7869R0;

    /* JADX INFO: renamed from: S */
    public int f7870S;

    /* JADX INFO: renamed from: S0 */
    public int f7871S0;

    /* JADX INFO: renamed from: T */
    public boolean f7872T;

    /* JADX INFO: renamed from: T0 */
    public boolean f7873T0;

    /* JADX INFO: renamed from: U */
    public boolean f7874U;

    /* JADX INFO: renamed from: U0 */
    public boolean f7875U0;

    /* JADX INFO: renamed from: V */
    public boolean f7876V;

    /* JADX INFO: renamed from: V0 */
    public boolean f7877V0;

    /* JADX INFO: renamed from: W */
    public boolean f7878W;

    /* JADX INFO: renamed from: W0 */
    public long f7879W0;

    /* JADX INFO: renamed from: X */
    public boolean f7880X;

    /* JADX INFO: renamed from: X0 */
    public long f7881X0;

    /* JADX INFO: renamed from: Y */
    public boolean f7882Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f7883Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f7884Z;

    /* JADX INFO: renamed from: Z0 */
    public boolean f7885Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f7886a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f7887b1;

    /* JADX INFO: renamed from: c1 */
    @Nullable
    public ExoPlaybackException f7888c1;

    /* JADX INFO: renamed from: d1 */
    public jid f7889d1;

    /* JADX INFO: renamed from: e1 */
    public C1898b f7890e1;

    /* JADX INFO: renamed from: f1 */
    public long f7891f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f7892g1;

    /* JADX INFO: renamed from: k0 */
    public boolean f7893k0;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1907c.b f7894p;

    /* JADX INFO: renamed from: p0 */
    public boolean f7895p0;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1909e f7896q;

    /* JADX INFO: renamed from: r */
    public final boolean f7897r;

    /* JADX INFO: renamed from: s */
    public final float f7898s;

    /* JADX INFO: renamed from: t */
    public final DecoderInputBuffer f7899t;

    /* JADX INFO: renamed from: u */
    public final DecoderInputBuffer f7900u;

    /* JADX INFO: renamed from: v */
    public final DecoderInputBuffer f7901v;

    /* JADX INFO: renamed from: w */
    public final tt2 f7902w;

    /* JADX INFO: renamed from: x */
    public final ArrayList<Long> f7903x;

    /* JADX INFO: renamed from: y */
    public final MediaCodec.BufferInfo f7904y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque<C1898b> f7905z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$a */
    @RequiresApi(31)
    public static final class C1897a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m10476a(InterfaceC1907c.a aVar, bf80 bf80Var) {
            LogSessionId logSessionIdM103880a = bf80Var.m103880a();
            if (logSessionIdM103880a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f7931b.setString("log-session-id", logSessionIdM103880a.getStringId());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b */
    public static final class C1898b {

        /* JADX INFO: renamed from: e */
        public static final C1898b f7906e = new C1898b(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a */
        public final long f7907a;

        /* JADX INFO: renamed from: b */
        public final long f7908b;

        /* JADX INFO: renamed from: c */
        public final long f7909c;

        /* JADX INFO: renamed from: d */
        public final wzi0<C1894k> f7910d = new wzi0<>();

        public C1898b(long j, long j2, long j3) {
            this.f7907a = j;
            this.f7908b = j2;
            this.f7909c = j3;
        }
    }

    public MediaCodecRenderer(int i, InterfaceC1907c.b bVar, InterfaceC1909e interfaceC1909e, boolean z, float f) {
        super(i);
        this.f7894p = bVar;
        this.f7896q = (InterfaceC1909e) w11.m204369e(interfaceC1909e);
        this.f7897r = z;
        this.f7898s = f;
        this.f7899t = DecoderInputBuffer.m9856y();
        this.f7900u = new DecoderInputBuffer(0);
        this.f7901v = new DecoderInputBuffer(2);
        tt2 tt2Var = new tt2();
        this.f7902w = tt2Var;
        this.f7903x = new ArrayList<>();
        this.f7904y = new MediaCodec.BufferInfo();
        this.f7850I = 1.0f;
        this.f7852J = 1.0f;
        this.f7848H = -9223372036854775807L;
        this.f7905z = new ArrayDeque<>();
        m10453l1(C1898b.f7906e);
        tt2Var.m9859v(0);
        tt2Var.f7412c.order(ByteOrder.nativeOrder());
        this.f7838A = new jg50();
        this.f7862O = -1.0f;
        this.f7870S = 0;
        this.f7867Q0 = 0;
        this.f7849H0 = -1;
        this.f7851I0 = -1;
        this.f7847G0 = -9223372036854775807L;
        this.f7879W0 = -9223372036854775807L;
        this.f7881X0 = -9223372036854775807L;
        this.f7891f1 = -9223372036854775807L;
        this.f7869R0 = 0;
        this.f7871S0 = 0;
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m10410K0(IllegalStateException illegalStateException) {
        if (bmk0.f77313a >= 21 && m10411L0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: L0 */
    public static boolean m10411L0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: M0 */
    public static boolean m10412M0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m10413b0(String str, C1894k c1894k) {
        return bmk0.f77313a < 21 && c1894k.f7787n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m10414c0(String str) {
        if (bmk0.f77313a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(bmk0.f77315c)) {
            return false;
        }
        String str2 = bmk0.f77314b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m10415d0(String str) {
        int i = bmk0.f77313a;
        if (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i > 19) {
            return false;
        }
        String str2 = bmk0.f77314b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m10416e0(String str) {
        return bmk0.f77313a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m10417f0(C1908d c1908d) {
        String str = c1908d.f7936a;
        int i = bmk0.f77313a;
        if (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) {
            return true;
        }
        if (i > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(bmk0.f77315c) && "AFTS".equals(bmk0.f77316d) && c1908d.f7942g;
        }
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m10418g0(String str) {
        int i = bmk0.f77313a;
        if (i < 18) {
            return true;
        }
        if (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i == 19 && bmk0.f77316d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m10419h0(String str, C1894k c1894k) {
        return bmk0.f77313a <= 18 && c1894k.f7798y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m10420i0(String str) {
        return bmk0.f77313a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* JADX INFO: renamed from: u1 */
    public static boolean m10421u1(C1894k c1894k) {
        int i = c1894k.f7772G;
        return i == 0 || i == 2;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: A */
    public void mo10422A(float f, float f2) throws ExoPlaybackException {
        this.f7850I = f;
        this.f7852J = f2;
        m10470v1(this.f7856L);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract List<C1908d> mo9684A0(InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: renamed from: B0 */
    public abstract InterfaceC1907c.a mo9685B0(C1908d c1908d, C1894k c1894k, @Nullable MediaCrypto mediaCrypto, float f);

    @Override // com.google.android.exoplayer2.AbstractC1860d, com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: C */
    public final int mo9815C() {
        return 8;
    }

    /* JADX INFO: renamed from: C0 */
    public final long m10423C0() {
        return this.f7890e1.f7909c;
    }

    /* JADX INFO: renamed from: D0 */
    public float m10424D0() {
        return this.f7850I;
    }

    /* JADX INFO: renamed from: E0 */
    public void mo10425E0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m10426F0() {
        return this.f7851I0 >= 0;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10427G0(C1894k c1894k) {
        m10450k0();
        String str = c1894k.f7785l;
        if ("audio/mp4a-latm".equals(str) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str) || "audio/opus".equals(str)) {
            this.f7902w.m192653J(32);
        } else {
            this.f7902w.m192653J(1);
        }
        this.f7859M0 = true;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m10428H0(C1908d c1908d, @Nullable MediaCrypto mediaCrypto) throws Exception {
        String str = c1908d.f7936a;
        int i = bmk0.f77313a;
        float fMo9714y0 = i < 23 ? -1.0f : mo9714y0(this.f7852J, this.f7839B, m9822J());
        float f = fMo9714y0 > this.f7898s ? fMo9714y0 : -1.0f;
        mo10436Y0(this.f7839B);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC1907c.a aVarMo9685B0 = mo9685B0(c1908d, this.f7839B, mediaCrypto, f);
        if (i >= 31) {
            C1897a.m10476a(aVarMo9685B0, m9821I());
        }
        try {
            nej0.m162903a("createCodec:" + str);
            this.f7854K = this.f7894p.mo10542a(aVarMo9685B0);
            nej0.m162905c();
            float f2 = f;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c1908d.m10572o(this.f7839B)) {
                kyv.m152151i("MediaCodecRenderer", bmk0.m105071D("Format exceeds selected codec's capabilities [%s, %s]", C1894k.m10335j(this.f7839B), str));
            }
            this.f7868R = c1908d;
            this.f7862O = f2;
            this.f7856L = this.f7839B;
            this.f7870S = m10439a0(str);
            this.f7872T = m10413b0(str, this.f7856L);
            this.f7874U = m10418g0(str);
            this.f7876V = m10420i0(str);
            this.f7878W = m10415d0(str);
            this.f7880X = m10416e0(str);
            this.f7882Y = m10414c0(str);
            this.f7884Z = m10419h0(str, this.f7856L);
            this.f7843E0 = m10417f0(c1908d) || mo10473x0();
            if (this.f7854K.mo10533a()) {
                this.f7865P0 = true;
                this.f7867Q0 = 1;
                this.f7893k0 = this.f7870S != 0;
            }
            if ("c2.android.mp3.decoder".equals(c1908d.f7936a)) {
                this.f7845F0 = new xr3();
            }
            if (getState() == 2) {
                this.f7847G0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f7889d1.f121063a++;
            mo9696Q0(str, aVarMo9685B0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            nej0.m162905c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m10429I0(C1894k c1894k) {
        return this.f7842E == null && mo9712s1(c1894k);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m10430J0(long j) {
        int size = this.f7903x.size();
        for (int i = 0; i < size; i++) {
            if (this.f7903x.get(i).longValue() == j) {
                this.f7903x.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: L */
    public void mo9690L() {
        this.f7839B = null;
        m10453l1(C1898b.f7906e);
        this.f7905z.clear();
        m10467t0();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: M */
    public void mo9691M(boolean z, boolean z2) throws ExoPlaybackException {
        this.f7889d1 = new jid();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: N */
    public void mo9692N(long j, boolean z) throws ExoPlaybackException {
        this.f7883Y0 = false;
        this.f7885Z0 = false;
        this.f7887b1 = false;
        if (this.f7859M0) {
            this.f7902w.mo9857i();
            this.f7901v.mo9857i();
            this.f7861N0 = false;
            this.f7838A.m144756d();
        } else {
            m10466s0();
        }
        if (this.f7890e1.f7910d.m208736l() > 0) {
            this.f7886a1 = true;
        }
        this.f7890e1.f7910d.m208728c();
        this.f7905z.clear();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m10431N0() throws ExoPlaybackException {
        C1894k c1894k;
        if (this.f7854K != null || this.f7859M0 || (c1894k = this.f7839B) == null) {
            return;
        }
        if (m10429I0(c1894k)) {
            m10427G0(this.f7839B);
            return;
        }
        m10451k1(this.f7842E);
        String str = this.f7839B.f7785l;
        DrmSession drmSession = this.f7841D;
        if (drmSession != null) {
            vxb vxbVarMo9883d = drmSession.mo9883d();
            if (this.f7844F == null) {
                if (vxbVarMo9883d == null) {
                    if (this.f7841D.mo9880a() == null) {
                        return;
                    }
                } else if (vxbVarMo9883d instanceof b8j) {
                    b8j b8jVar = (b8j) vxbVarMo9883d;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(b8jVar.f75435a, b8jVar.f75436b);
                        this.f7844F = mediaCrypto;
                        this.f7846G = !b8jVar.f75437c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw m9816D(e, this.f7839B, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                    }
                }
            }
            if (b8j.f75434d && (vxbVarMo9883d instanceof b8j)) {
                int state = this.f7841D.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) w11.m204369e(this.f7841D.mo9880a());
                    throw m9816D(drmSessionException, this.f7839B, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m10432O0(this.f7844F, this.f7846G);
        } catch (DecoderInitializationException e2) {
            throw m9816D(e2, this.f7839B, 4001);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x004a A[SYNTHETIC] */
    /* JADX INFO: renamed from: O0 */
    public final void m10432O0(@Nullable MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        DecoderInitializationException decoderInitializationException2;
        if (this.f7864P == null) {
            try {
                List<C1908d> listM10468u0 = m10468u0(z);
                ArrayDeque<C1908d> arrayDeque = new ArrayDeque<>();
                this.f7864P = arrayDeque;
                if (this.f7897r) {
                    arrayDeque.addAll(listM10468u0);
                } else if (!listM10468u0.isEmpty()) {
                    this.f7864P.add(listM10468u0.get(0));
                }
                this.f7866Q = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f7839B, e, z, -49998);
            }
        }
        if (this.f7864P.isEmpty()) {
            throw new DecoderInitializationException(this.f7839B, (Throwable) null, z, -49999);
        }
        C1908d c1908dPeekFirst = this.f7864P.peekFirst();
        while (this.f7854K == null) {
            C1908d c1908dPeekFirst2 = this.f7864P.peekFirst();
            if (!mo10463q1(c1908dPeekFirst2)) {
                return;
            }
            try {
                m10428H0(c1908dPeekFirst2, mediaCrypto);
            } catch (Exception e2) {
                if (c1908dPeekFirst2 != c1908dPeekFirst) {
                    throw e2;
                }
                try {
                    kyv.m152151i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    m10428H0(c1908dPeekFirst2, mediaCrypto);
                } catch (Exception e3) {
                    kyv.m152152j("MediaCodecRenderer", "Failed to initialize decoder: " + c1908dPeekFirst2, e3);
                    this.f7864P.removeFirst();
                    decoderInitializationException = new DecoderInitializationException(this.f7839B, e3, z, c1908dPeekFirst2);
                    mo9694P0(decoderInitializationException);
                    decoderInitializationException2 = this.f7866Q;
                    if (decoderInitializationException2 == null) {
                        this.f7866Q = decoderInitializationException;
                    } else {
                        this.f7866Q = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                    }
                    if (!this.f7864P.isEmpty()) {
                        throw this.f7866Q;
                    }
                }
                kyv.m152152j("MediaCodecRenderer", "Failed to initialize decoder: " + c1908dPeekFirst2, e3);
                this.f7864P.removeFirst();
                decoderInitializationException = new DecoderInitializationException(this.f7839B, e3, z, c1908dPeekFirst2);
                mo9694P0(decoderInitializationException);
                decoderInitializationException2 = this.f7866Q;
                if (decoderInitializationException2 == null) {
                    this.f7866Q = decoderInitializationException;
                } else {
                    this.f7866Q = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                }
                if (!this.f7864P.isEmpty()) {
                    throw this.f7866Q;
                }
            }
        }
        this.f7864P = null;
    }

    /* JADX INFO: renamed from: P0 */
    public abstract void mo9694P0(Exception exc);

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: Q */
    public void mo9695Q() {
        try {
            m10450k0();
            m10443e1();
        } finally {
            m10459o1(null);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo9696Q0(String str, InterfaceC1907c.a aVar, long j, long j2);

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: R */
    public void mo9697R() {
    }

    /* JADX INFO: renamed from: R0 */
    public abstract void mo9698R0(String str);

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: S */
    public void mo9699S() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    @Nullable
    @CallSuper
    /* JADX INFO: renamed from: S0 */
    public nid mo9700S0(p1j p1jVar) throws ExoPlaybackException {
        boolean z = true;
        this.f7886a1 = true;
        C1894k c1894k = (C1894k) w11.m204369e(p1jVar.f150174b);
        if (c1894k.f7785l == null) {
            throw m9816D(new IllegalArgumentException(), c1894k, 4005);
        }
        m10459o1(p1jVar.f150173a);
        this.f7839B = c1894k;
        if (this.f7859M0) {
            this.f7863O0 = true;
            return null;
        }
        InterfaceC1907c interfaceC1907c = this.f7854K;
        if (interfaceC1907c == null) {
            this.f7864P = null;
            m10431N0();
            return null;
        }
        C1908d c1908d = this.f7868R;
        C1894k c1894k2 = this.f7856L;
        if (m10460p0(c1908d, c1894k, this.f7841D, this.f7842E)) {
            m10454m0();
            return new nid(c1908d.f7936a, c1894k2, c1894k, 0, 128);
        }
        int i = 0;
        boolean z2 = this.f7842E != this.f7841D;
        w11.m204371g(!z2 || bmk0.f77313a >= 23);
        nid nidVarMo9705Z = mo9705Z(c1908d, c1894k2, c1894k);
        int i2 = nidVarMo9705Z.f142115d;
        if (i2 == 0) {
            m10454m0();
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    wpg0.m207458a();
                    return null;
                }
                if (m10470v1(c1894k)) {
                    this.f7856L = c1894k;
                    if (z2 && !m10456n0()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (m10470v1(c1894k)) {
                this.f7865P0 = true;
                this.f7867Q0 = 1;
                int i3 = this.f7870S;
                if (i3 != 2 && (i3 != 1 || c1894k.f7790q != c1894k2.f7790q || c1894k.f7791r != c1894k2.f7791r)) {
                    z = false;
                }
                this.f7893k0 = z;
                this.f7856L = c1894k;
                if (z2 && !m10456n0()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
        } else if (m10470v1(c1894k)) {
            this.f7856L = c1894k;
            if (!z2 ? !m10452l0() : !m10456n0()) {
                i = 2;
            }
        } else {
            i = 16;
        }
        return (nidVarMo9705Z.f142115d == 0 || (this.f7854K == interfaceC1907c && this.f7871S0 != 3)) ? nidVarMo9705Z : new nid(c1908d.f7936a, c1894k2, c1894k, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9825T(C1894k[] c1894kArr, long j, long j2) throws ExoPlaybackException {
        if (this.f7890e1.f7909c == -9223372036854775807L) {
            m10453l1(new C1898b(-9223372036854775807L, j, j2));
            return;
        }
        if (this.f7905z.isEmpty()) {
            long j3 = this.f7879W0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f7891f1;
                if (j4 != -9223372036854775807L) {
                }
            }
            m10453l1(new C1898b(-9223372036854775807L, j, j2));
            if (this.f7890e1.f7909c != -9223372036854775807L) {
                mo9703W0();
                return;
            }
            return;
        }
        this.f7905z.add(new C1898b(this.f7879W0, j, j2));
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo9701T0(C1894k c1894k, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    /* JADX INFO: renamed from: U0 */
    public void mo9702U0(long j) {
    }

    @CallSuper
    /* JADX INFO: renamed from: V0 */
    public void mo10433V0(long j) {
        this.f7891f1 = j;
        while (!this.f7905z.isEmpty() && j >= this.f7905z.peek().f7907a) {
            m10453l1(this.f7905z.poll());
            mo9703W0();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void mo9703W0() {
    }

    /* JADX INFO: renamed from: X */
    public final void m10434X() throws ExoPlaybackException {
        String str;
        w11.m204371g(!this.f7883Y0);
        p1j p1jVarM9819G = m9819G();
        this.f7901v.mo9857i();
        do {
            this.f7901v.mo9857i();
            int iM9826U = m9826U(p1jVarM9819G, this.f7901v, 0);
            if (iM9826U == -5) {
                mo9700S0(p1jVarM9819G);
                return;
            }
            if (iM9826U != -4) {
                if (iM9826U == -3) {
                    return;
                }
                wpg0.m207458a();
                return;
            } else {
                if (this.f7901v.m97779p()) {
                    this.f7883Y0 = true;
                    return;
                }
                if (this.f7886a1) {
                    C1894k c1894k = (C1894k) w11.m204369e(this.f7839B);
                    this.f7840C = c1894k;
                    mo9701T0(c1894k, null);
                    this.f7886a1 = false;
                }
                this.f7901v.m9860w();
                C1894k c1894k2 = this.f7839B;
                if (c1894k2 != null && (str = c1894k2.f7785l) != null && str.equals("audio/opus")) {
                    this.f7838A.m144753a(this.f7901v, this.f7839B.f7787n);
                }
            }
        } while (this.f7902w.m192647A(this.f7901v));
        this.f7861N0 = true;
    }

    /* JADX INFO: renamed from: X0 */
    public abstract void mo9704X0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    /* JADX INFO: renamed from: Y */
    public final boolean m10435Y(long j, long j2) throws ExoPlaybackException {
        boolean z;
        w11.m204371g(!this.f7885Z0);
        if (this.f7902w.m192652I()) {
            tt2 tt2Var = this.f7902w;
            z = false;
            if (!mo9706a1(j, j2, null, tt2Var.f7412c, this.f7851I0, 0, tt2Var.m192651H(), this.f7902w.m192649C(), this.f7902w.m97778o(), this.f7902w.m97779p(), this.f7840C)) {
                return false;
            }
            mo10433V0(this.f7902w.m192650F());
            this.f7902w.mo9857i();
        } else {
            z = false;
        }
        if (this.f7883Y0) {
            this.f7885Z0 = true;
            return z;
        }
        if (this.f7861N0) {
            w11.m204371g(this.f7902w.m192647A(this.f7901v));
            this.f7861N0 = z;
        }
        if (this.f7863O0) {
            if (this.f7902w.m192652I()) {
                return true;
            }
            m10450k0();
            this.f7863O0 = z;
            m10431N0();
            if (!this.f7859M0) {
                return z;
            }
        }
        m10434X();
        if (this.f7902w.m192652I()) {
            this.f7902w.m9860w();
        }
        if (this.f7902w.m192652I() || this.f7883Y0 || this.f7863O0) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo10436Y0(C1894k c1894k) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: Z */
    public abstract nid mo9705Z(C1908d c1908d, C1894k c1894k, C1894k c1894k2);

    @TargetApi(23)
    /* JADX INFO: renamed from: Z0 */
    public final void m10437Z0() throws ExoPlaybackException {
        int i = this.f7871S0;
        if (i == 1) {
            m10464r0();
            return;
        }
        if (i == 2) {
            m10464r0();
            m10472w1();
        } else if (i == 3) {
            m10442d1();
        } else {
            this.f7885Z0 = true;
            mo9710f1();
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: a */
    public final int mo10438a(C1894k c1894k) throws ExoPlaybackException {
        try {
            return mo9713t1(this.f7896q, c1894k);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw m9816D(e, c1894k, 4002);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final int m10439a0(String str) {
        int i = bmk0.f77313a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = bmk0.f77316d;
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
        String str3 = bmk0.f77314b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: a1 */
    public abstract boolean mo9706a1(long j, long j2, @Nullable InterfaceC1907c interfaceC1907c, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1894k c1894k) throws ExoPlaybackException;

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: b */
    public boolean mo9707b() {
        if (this.f7839B == null) {
            return false;
        }
        if (m9823K() || m10426F0()) {
            return true;
        }
        return this.f7847G0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f7847G0;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m10440b1() {
        this.f7877V0 = true;
        MediaFormat outputFormat = this.f7854K.getOutputFormat();
        if (this.f7870S != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f7895p0 = true;
            return;
        }
        if (this.f7884Z) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.f7858M = outputFormat;
        this.f7860N = true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: c */
    public boolean mo9708c() {
        return this.f7885Z0;
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m10441c1(int i) throws ExoPlaybackException {
        p1j p1jVarM9819G = m9819G();
        this.f7899t.mo9857i();
        int iM9826U = m9826U(p1jVarM9819G, this.f7899t, i | 4);
        if (iM9826U == -5) {
            mo9700S0(p1jVarM9819G);
            return true;
        }
        if (iM9826U != -4 || !this.f7899t.m97779p()) {
            return false;
        }
        this.f7883Y0 = true;
        m10437Z0();
        return false;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m10442d1() throws ExoPlaybackException {
        m10443e1();
        m10431N0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public void m10443e1() {
        try {
            InterfaceC1907c interfaceC1907c = this.f7854K;
            if (interfaceC1907c != null) {
                interfaceC1907c.release();
                this.f7889d1.f121064b++;
                mo9698R0(this.f7868R.f7936a);
            }
            this.f7854K = null;
            try {
                MediaCrypto mediaCrypto = this.f7844F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f7844F = null;
                m10451k1(null);
                m10445h1();
            }
        } catch (Throwable th) {
            this.f7854K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f7844F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f7844F = null;
                m10451k1(null);
                m10445h1();
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void mo9710f1() throws ExoPlaybackException {
    }

    @CallSuper
    /* JADX INFO: renamed from: g1 */
    public void mo10444g1() {
        m10446i1();
        m10449j1();
        this.f7847G0 = -9223372036854775807L;
        this.f7875U0 = false;
        this.f7873T0 = false;
        this.f7893k0 = false;
        this.f7895p0 = false;
        this.f7855K0 = false;
        this.f7857L0 = false;
        this.f7903x.clear();
        this.f7879W0 = -9223372036854775807L;
        this.f7881X0 = -9223372036854775807L;
        this.f7891f1 = -9223372036854775807L;
        xr3 xr3Var = this.f7845F0;
        if (xr3Var != null) {
            xr3Var.m212772c();
        }
        this.f7869R0 = 0;
        this.f7871S0 = 0;
        this.f7867Q0 = this.f7865P0 ? 1 : 0;
    }

    @CallSuper
    /* JADX INFO: renamed from: h1 */
    public void m10445h1() {
        mo10444g1();
        this.f7888c1 = null;
        this.f7845F0 = null;
        this.f7864P = null;
        this.f7868R = null;
        this.f7856L = null;
        this.f7858M = null;
        this.f7860N = false;
        this.f7877V0 = false;
        this.f7862O = -1.0f;
        this.f7870S = 0;
        this.f7872T = false;
        this.f7874U = false;
        this.f7876V = false;
        this.f7878W = false;
        this.f7880X = false;
        this.f7882Y = false;
        this.f7884Z = false;
        this.f7843E0 = false;
        this.f7865P0 = false;
        this.f7867Q0 = 0;
        this.f7846G = false;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m10446i1() {
        this.f7849H0 = -1;
        this.f7900u.f7412c = null;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: j */
    public void mo10447j(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.f7887b1) {
            this.f7887b1 = false;
            m10437Z0();
        }
        ExoPlaybackException exoPlaybackException = this.f7888c1;
        if (exoPlaybackException != null) {
            this.f7888c1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f7885Z0) {
                mo9710f1();
                return;
            }
            if (this.f7839B != null || m10441c1(2)) {
                m10431N0();
                if (this.f7859M0) {
                    nej0.m162903a("bypassRender");
                    while (m10435Y(j, j2)) {
                    }
                    nej0.m162905c();
                } else if (this.f7854K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    nej0.m162903a("drainAndFeed");
                    while (m10458o0(j, j2) && m10461p1(jElapsedRealtime)) {
                    }
                    while (m10462q0() && m10461p1(jElapsedRealtime)) {
                    }
                    nej0.m162905c();
                } else {
                    this.f7889d1.f121066d += m9828W(j);
                    m10441c1(1);
                }
                this.f7889d1.m144978c();
            }
        } catch (IllegalStateException e) {
            if (!m10410K0(e)) {
                throw e;
            }
            mo9694P0(e);
            if (bmk0.f77313a >= 21 && m10412M0(e)) {
                z = true;
            }
            if (z) {
                m10443e1();
            }
            throw m9817E(mo10448j0(e, m10471w0()), this.f7839B, z, 4003);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public MediaCodecDecoderException mo10448j0(Throwable th, @Nullable C1908d c1908d) {
        return new MediaCodecDecoderException(th, c1908d);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m10449j1() {
        this.f7851I0 = -1;
        this.f7853J0 = null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m10450k0() {
        this.f7863O0 = false;
        this.f7902w.mo9857i();
        this.f7901v.mo9857i();
        this.f7861N0 = false;
        this.f7859M0 = false;
        this.f7838A.m144756d();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m10451k1(@Nullable DrmSession drmSession) {
        DrmSession.m9963e(this.f7841D, drmSession);
        this.f7841D = drmSession;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m10452l0() {
        if (this.f7873T0) {
            this.f7869R0 = 1;
            if (this.f7874U || this.f7878W) {
                this.f7871S0 = 3;
                return false;
            }
            this.f7871S0 = 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m10453l1(C1898b c1898b) {
        this.f7890e1 = c1898b;
        long j = c1898b.f7909c;
        if (j != -9223372036854775807L) {
            this.f7892g1 = true;
            mo9702U0(j);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m10454m0() throws ExoPlaybackException {
        if (!this.f7873T0) {
            m10442d1();
        } else {
            this.f7869R0 = 1;
            this.f7871S0 = 3;
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m10455m1() {
        this.f7887b1 = true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: n0 */
    public final boolean m10456n0() throws ExoPlaybackException {
        if (this.f7873T0) {
            this.f7869R0 = 1;
            if (this.f7874U || this.f7878W) {
                this.f7871S0 = 3;
                return false;
            }
            this.f7871S0 = 2;
        } else {
            m10472w1();
        }
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m10457n1(ExoPlaybackException exoPlaybackException) {
        this.f7888c1 = exoPlaybackException;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m10458o0(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean zMo9706a1;
        int iMo10535c;
        if (!m10426F0()) {
            if (this.f7880X && this.f7875U0) {
                try {
                    iMo10535c = this.f7854K.mo10535c(this.f7904y);
                } catch (IllegalStateException unused) {
                    m10437Z0();
                    if (this.f7885Z0) {
                        m10443e1();
                    }
                    return false;
                }
            } else {
                iMo10535c = this.f7854K.mo10535c(this.f7904y);
            }
            if (iMo10535c < 0) {
                if (iMo10535c == -2) {
                    m10440b1();
                    return true;
                }
                if (this.f7843E0 && (this.f7883Y0 || this.f7869R0 == 2)) {
                    m10437Z0();
                }
                return false;
            }
            if (this.f7895p0) {
                this.f7895p0 = false;
                this.f7854K.releaseOutputBuffer(iMo10535c, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f7904y;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m10437Z0();
                return false;
            }
            this.f7851I0 = iMo10535c;
            ByteBuffer outputBuffer = this.f7854K.getOutputBuffer(iMo10535c);
            this.f7853J0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f7904y.offset);
                ByteBuffer byteBuffer = this.f7853J0;
                MediaCodec.BufferInfo bufferInfo2 = this.f7904y;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f7882Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f7904y;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j3 = this.f7879W0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j3;
                    }
                }
            }
            this.f7855K0 = m10430J0(this.f7904y.presentationTimeUs);
            long j4 = this.f7881X0;
            long j5 = this.f7904y.presentationTimeUs;
            this.f7857L0 = j4 == j5;
            m10474x1(j5);
        }
        if (this.f7880X && this.f7875U0) {
            try {
                InterfaceC1907c interfaceC1907c = this.f7854K;
                ByteBuffer byteBuffer2 = this.f7853J0;
                int i = this.f7851I0;
                MediaCodec.BufferInfo bufferInfo4 = this.f7904y;
                z = false;
                try {
                    zMo9706a1 = mo9706a1(j, j2, interfaceC1907c, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f7855K0, this.f7857L0, this.f7840C);
                } catch (IllegalStateException unused2) {
                    m10437Z0();
                    if (this.f7885Z0) {
                        m10443e1();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            InterfaceC1907c interfaceC1907c2 = this.f7854K;
            ByteBuffer byteBuffer3 = this.f7853J0;
            int i2 = this.f7851I0;
            MediaCodec.BufferInfo bufferInfo5 = this.f7904y;
            zMo9706a1 = mo9706a1(j, j2, interfaceC1907c2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f7855K0, this.f7857L0, this.f7840C);
        }
        if (zMo9706a1) {
            mo10433V0(this.f7904y.presentationTimeUs);
            boolean z2 = (this.f7904y.flags & 4) != 0 ? true : z;
            m10449j1();
            if (!z2) {
                return true;
            }
            m10437Z0();
        }
        return z;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m10459o1(@Nullable DrmSession drmSession) {
        DrmSession.m9963e(this.f7842E, drmSession);
        this.f7842E = drmSession;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m10460p0(C1908d c1908d, C1894k c1894k, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        vxb vxbVarMo9883d;
        vxb vxbVarMo9883d2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (vxbVarMo9883d = drmSession2.mo9883d()) != null && (vxbVarMo9883d2 = drmSession.mo9883d()) != null && vxbVarMo9883d.getClass().equals(vxbVarMo9883d2.getClass())) {
            if (!(vxbVarMo9883d instanceof b8j)) {
                return false;
            }
            b8j b8jVar = (b8j) vxbVarMo9883d;
            if (!drmSession2.mo9886h().equals(drmSession.mo9886h()) || bmk0.f77313a < 23) {
                return true;
            }
            UUID uuid = zr3.f205733e;
            if (!uuid.equals(drmSession.mo9886h()) && !uuid.equals(drmSession2.mo9886h())) {
                return !c1908d.f7942g && (b8jVar.f75437c ? false : drmSession2.mo9887i(c1894k.f7785l));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p1 */
    public final boolean m10461p1(long j) {
        return this.f7848H == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f7848H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.exoplayer2.d, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.exoplayer2.d, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r15v3, types: [l.jid] */
    /* JADX INFO: renamed from: q0 */
    public final boolean m10462q0() throws ExoPlaybackException {
        int i;
        if (this.f7854K == null || (i = this.f7869R0) == 2 || this.f7883Y0) {
            return false;
        }
        if (i == 0 && m10465r1()) {
            m10454m0();
        }
        if (this.f7849H0 < 0) {
            int iMo10537e = this.f7854K.mo10537e();
            this.f7849H0 = iMo10537e;
            if (iMo10537e < 0) {
                return false;
            }
            this.f7900u.f7412c = this.f7854K.getInputBuffer(iMo10537e);
            this.f7900u.mo9857i();
        }
        if (this.f7869R0 == 1) {
            if (!this.f7843E0) {
                this.f7875U0 = true;
                this.f7854K.queueInputBuffer(this.f7849H0, 0, 0, 0L, 4);
                m10446i1();
            }
            this.f7869R0 = 2;
            return false;
        }
        if (this.f7893k0) {
            this.f7893k0 = false;
            ByteBuffer byteBuffer = this.f7900u.f7412c;
            byte[] bArr = f7837h1;
            byteBuffer.put(bArr);
            this.f7854K.queueInputBuffer(this.f7849H0, 0, bArr.length, 0L, 0);
            m10446i1();
            this.f7873T0 = true;
            return true;
        }
        if (this.f7867Q0 == 1) {
            for (int i2 = 0; i2 < this.f7856L.f7787n.size(); i2++) {
                this.f7900u.f7412c.put(this.f7856L.f7787n.get(i2));
            }
            this.f7867Q0 = 2;
        }
        int iPosition = this.f7900u.f7412c.position();
        p1j p1jVarM9819G = m9819G();
        try {
            int iM9826U = m9826U(p1jVarM9819G, this.f7900u, 0);
            if (mo9829d() || this.f7900u.m97782s()) {
                this.f7881X0 = this.f7879W0;
            }
            if (iM9826U == -3) {
                return false;
            }
            if (iM9826U == -5) {
                if (this.f7867Q0 == 2) {
                    this.f7900u.mo9857i();
                    this.f7867Q0 = 1;
                }
                mo9700S0(p1jVarM9819G);
                return true;
            }
            if (this.f7900u.m97779p()) {
                if (this.f7867Q0 == 2) {
                    this.f7900u.mo9857i();
                    this.f7867Q0 = 1;
                }
                this.f7883Y0 = true;
                if (!this.f7873T0) {
                    m10437Z0();
                    return false;
                }
                try {
                    if (!this.f7843E0) {
                        this.f7875U0 = true;
                        this.f7854K.queueInputBuffer(this.f7849H0, 0, 0, 0L, 4);
                        m10446i1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m9816D(e, this.f7839B, bmk0.m105111X(e.getErrorCode()));
                }
            }
            if (!this.f7873T0 && !this.f7900u.m97781r()) {
                this.f7900u.mo9857i();
                if (this.f7867Q0 == 2) {
                    this.f7867Q0 = 1;
                }
                return true;
            }
            boolean zM9861x = this.f7900u.m9861x();
            if (zM9861x) {
                this.f7900u.f7411b.m208397b(iPosition);
            }
            if (this.f7872T && !zM9861x) {
                jb20.m144184b(this.f7900u.f7412c);
                if (this.f7900u.f7412c.position() == 0) {
                    return true;
                }
                this.f7872T = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f7900u;
            long jM212773d = decoderInputBuffer.f7414e;
            xr3 xr3Var = this.f7845F0;
            if (xr3Var != null) {
                jM212773d = xr3Var.m212773d(this.f7839B, decoderInputBuffer);
                this.f7879W0 = Math.max(this.f7879W0, this.f7845F0.m212771b(this.f7839B));
            }
            long j = jM212773d;
            if (this.f7900u.m97778o()) {
                this.f7903x.add(Long.valueOf(j));
            }
            if (this.f7886a1) {
                if (this.f7905z.isEmpty()) {
                    this.f7890e1.f7910d.m208726a(j, this.f7839B);
                } else {
                    this.f7905z.peekLast().f7910d.m208726a(j, this.f7839B);
                }
                this.f7886a1 = false;
            }
            this.f7879W0 = Math.max(this.f7879W0, j);
            this.f7900u.m9860w();
            if (this.f7900u.m97777n()) {
                mo10425E0(this.f7900u);
            }
            mo9704X0(this.f7900u);
            InterfaceC1907c interfaceC1907c = this.f7854K;
            try {
                if (zM9861x) {
                    interfaceC1907c.mo10534b(this.f7849H0, 0, this.f7900u.f7411b, j, 0);
                } else {
                    interfaceC1907c.queueInputBuffer(this.f7849H0, 0, this.f7900u.f7412c.limit(), j, 0);
                }
                m10446i1();
                this.f7873T0 = true;
                this.f7867Q0 = 0;
                this = this.f7889d1;
                this.f121065c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw this.m9816D(e2, this.f7839B, bmk0.m105111X(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            mo9694P0(e3);
            m10441c1(0);
            m10464r0();
            return true;
        }
    }

    /* JADX INFO: renamed from: q1 */
    public boolean mo10463q1(C1908d c1908d) {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10464r0() {
        try {
            this.f7854K.flush();
        } finally {
            mo10444g1();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m10465r1() {
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m10466s0() throws ExoPlaybackException {
        boolean zM10467t0 = m10467t0();
        if (zM10467t0) {
            m10431N0();
        }
        return zM10467t0;
    }

    /* JADX INFO: renamed from: s1 */
    public boolean mo9712s1(C1894k c1894k) {
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m10467t0() {
        if (this.f7854K == null) {
            return false;
        }
        int i = this.f7871S0;
        if (i == 3 || this.f7874U || ((this.f7876V && !this.f7877V0) || (this.f7878W && this.f7875U0))) {
            m10443e1();
            return true;
        }
        if (i == 2) {
            int i2 = bmk0.f77313a;
            w11.m204371g(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m10472w1();
                } catch (ExoPlaybackException e) {
                    kyv.m152152j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m10443e1();
                    return true;
                }
            }
        }
        m10464r0();
        return false;
    }

    /* JADX INFO: renamed from: t1 */
    public abstract int mo9713t1(InterfaceC1909e interfaceC1909e, C1894k c1894k) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: renamed from: u0 */
    public final List<C1908d> m10468u0(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<C1908d> listMo9684A0 = mo9684A0(this.f7896q, this.f7839B, z);
        if (!listMo9684A0.isEmpty() || !z) {
            return listMo9684A0;
        }
        List<C1908d> listMo9684A1 = mo9684A0(this.f7896q, this.f7839B, false);
        if (!listMo9684A1.isEmpty()) {
            kyv.m152151i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f7839B.f7785l + ", but no secure decoder available. Trying to proceed with " + listMo9684A1 + ".");
        }
        return listMo9684A1;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC1907c m10469v0() {
        return this.f7854K;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m10470v1(C1894k c1894k) throws ExoPlaybackException {
        if (bmk0.f77313a >= 23 && this.f7854K != null && this.f7871S0 != 3 && getState() != 0) {
            float fMo9714y0 = mo9714y0(this.f7852J, c1894k, m9822J());
            float f = this.f7862O;
            if (f == fMo9714y0) {
                return true;
            }
            if (fMo9714y0 == -1.0f) {
                m10454m0();
                return false;
            }
            if (f == -1.0f && fMo9714y0 <= this.f7898s) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo9714y0);
            this.f7854K.setParameters(bundle);
            this.f7862O = fMo9714y0;
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: w0 */
    public final C1908d m10471w0() {
        return this.f7868R;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: w1 */
    public final void m10472w1() throws ExoPlaybackException {
        vxb vxbVarMo9883d = this.f7842E.mo9883d();
        if (vxbVarMo9883d instanceof b8j) {
            try {
                this.f7844F.setMediaDrmSession(((b8j) vxbVarMo9883d).f75436b);
            } catch (MediaCryptoException e) {
                throw m9816D(e, this.f7839B, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        m10451k1(this.f7842E);
        this.f7869R0 = 0;
        this.f7871S0 = 0;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean mo10473x0() {
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10474x1(long j) throws ExoPlaybackException {
        C1894k c1894kM208734j = this.f7890e1.f7910d.m208734j(j);
        if (c1894kM208734j == null && this.f7892g1 && this.f7858M != null) {
            c1894kM208734j = this.f7890e1.f7910d.m208733i();
        }
        if (c1894kM208734j != null) {
            this.f7840C = c1894kM208734j;
        } else if (!this.f7860N || this.f7840C == null) {
            return;
        }
        mo9701T0(this.f7840C, this.f7858M);
        this.f7860N = false;
        this.f7892g1 = false;
    }

    /* JADX INFO: renamed from: y0 */
    public abstract float mo9714y0(float f, C1894k c1894k, C1894k[] c1894kArr);

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public final MediaFormat m10475z0() {
        return this.f7858M;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final C1908d codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(C1894k c1894k, @Nullable Throwable th, boolean z, C1908d c1908d) {
            this("Decoder init failed: " + c1908d.f7936a + ", " + c1894k, th, c1894k.f7785l, z, c1908d, bmk0.f77313a >= 21 ? getDiagnosticInfoV21(th) : null, null);
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

        public DecoderInitializationException(C1894k c1894k, @Nullable Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c1894k, th, c1894k.f7785l, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private DecoderInitializationException(String str, @Nullable Throwable th, String str2, boolean z, @Nullable C1908d c1908d, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = c1908d;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
