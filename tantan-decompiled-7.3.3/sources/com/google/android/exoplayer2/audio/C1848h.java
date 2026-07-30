package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1953s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2089x;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C1908d;
import com.google.android.exoplayer2.mediacodec.InterfaceC1907c;
import com.google.android.exoplayer2.mediacodec.InterfaceC1909e;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p153l.bmk0;
import p153l.erx;
import p153l.kb00;
import p153l.kyv;
import p153l.nid;
import p153l.p1j;
import p153l.qsx;
import p153l.w11;
import p153l.wj1;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1848h extends MediaCodecRenderer implements erx {

    /* JADX INFO: renamed from: i1 */
    public final Context f7260i1;

    /* JADX INFO: renamed from: j1 */
    public final InterfaceC1843c.a f7261j1;

    /* JADX INFO: renamed from: k1 */
    public final AudioSink f7262k1;

    /* JADX INFO: renamed from: l1 */
    public int f7263l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f7264m1;

    /* JADX INFO: renamed from: n1 */
    @Nullable
    public C1894k f7265n1;

    /* JADX INFO: renamed from: o1 */
    @Nullable
    public C1894k f7266o1;

    /* JADX INFO: renamed from: p1 */
    public long f7267p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f7268q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f7269r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f7270s1;

    /* JADX INFO: renamed from: t1 */
    public boolean f7271t1;

    /* JADX INFO: renamed from: u1 */
    @Nullable
    public InterfaceC2089x.a f7272u1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h$b */
    @RequiresApi(23)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9716a(AudioSink audioSink, @Nullable Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h$c */
    public final class c implements AudioSink.InterfaceC1828a {
        public c() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: a */
        public void mo9493a(boolean z) {
            C1848h.this.f7261j1.m9634s(z);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: b */
        public void mo9494b(Exception exc) {
            kyv.m152146d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C1848h.this.f7261j1.m9627l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: c */
        public void mo9495c(long j) {
            C1848h.this.f7261j1.m9633r(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: d */
        public void mo9496d(int i, long j, long j2) {
            C1848h.this.f7261j1.m9635t(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: e */
        public void mo9497e() {
            C1848h.this.m9824P();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: f */
        public void mo9498f() {
            if (C1848h.this.f7272u1 != null) {
                C1848h.this.f7272u1.mo10317a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: g */
        public void mo9499g() {
            C1848h.this.m9688H1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1828a
        /* JADX INFO: renamed from: h */
        public void mo9500h() {
            if (C1848h.this.f7272u1 != null) {
                C1848h.this.f7272u1.mo10318b();
            }
        }
    }

    public C1848h(Context context, InterfaceC1907c.b bVar, InterfaceC1909e interfaceC1909e, boolean z, @Nullable Handler handler, @Nullable InterfaceC1843c interfaceC1843c, AudioSink audioSink) {
        super(1, bVar, interfaceC1909e, z, 44100.0f);
        this.f7260i1 = context.getApplicationContext();
        this.f7262k1 = audioSink;
        this.f7261j1 = new InterfaceC1843c.a(handler, interfaceC1843c);
        audioSink.mo9485i(new c());
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m9678B1(String str) {
        if (bmk0.f77313a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(bmk0.f77315c)) {
            return false;
        }
        String str2 = bmk0.f77314b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    /* JADX INFO: renamed from: C1 */
    public static boolean m9679C1() {
        if (bmk0.f77313a != 23) {
            return false;
        }
        String str = bmk0.f77316d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    /* JADX INFO: renamed from: D1 */
    private int m9680D1(C1908d c1908d, C1894k c1894k) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c1908d.f7936a) || (i = bmk0.f77313a) >= 24 || (i == 23 && bmk0.m105076F0(this.f7260i1))) {
            return c1894k.f7786m;
        }
        return -1;
    }

    /* JADX INFO: renamed from: F1 */
    public static List<C1908d> m9681F1(InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        C1908d c1908dM10516x;
        if (c1894k.f7785l == null) {
            return ImmutableList.m15739of();
        }
        return (!audioSink.mo9477a(c1894k) || (c1908dM10516x = MediaCodecUtil.m10516x()) == null) ? MediaCodecUtil.m10514v(interfaceC1909e, c1894k, z, false) : ImmutableList.m15740of(c1908dM10516x);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: A0 */
    public List<C1908d> mo9684A0(InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.m10515w(m9681F1(interfaceC1909e, c1894k, z, this.f7262k1), c1894k);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: B0 */
    public InterfaceC1907c.a mo9685B0(C1908d c1908d, C1894k c1894k, @Nullable MediaCrypto mediaCrypto, float f) {
        this.f7263l1 = m9686E1(c1908d, c1894k, m9822J());
        this.f7264m1 = m9678B1(c1908d.f7936a);
        MediaFormat mediaFormatM9687G1 = m9687G1(c1894k, c1908d.f7938c, this.f7263l1, f);
        this.f7266o1 = (!"audio/raw".equals(c1908d.f7937b) || "audio/raw".equals(c1894k.f7785l)) ? null : c1894k;
        return InterfaceC1907c.a.m10544a(c1908d, mediaFormatM9687G1, c1894k, mediaCrypto);
    }

    /* JADX INFO: renamed from: E1 */
    public int m9686E1(C1908d c1908d, C1894k c1894k, C1894k[] c1894kArr) {
        int iM9680D1 = m9680D1(c1908d, c1894k);
        if (c1894kArr.length == 1) {
            return iM9680D1;
        }
        for (C1894k c1894k2 : c1894kArr) {
            if (c1908d.m10566f(c1894k, c1894k2).f142115d != 0) {
                iM9680D1 = Math.max(iM9680D1, m9680D1(c1908d, c1894k2));
            }
        }
        return iM9680D1;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: G1 */
    public MediaFormat m9687G1(C1894k c1894k, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("channel-count", c1894k.f7798y);
        mediaFormat.setInteger("sample-rate", c1894k.f7799z);
        qsx.m177825e(mediaFormat, c1894k.f7787n);
        qsx.m177824d(mediaFormat, "max-input-size", i);
        int i2 = bmk0.f77313a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m9679C1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(c1894k.f7785l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f7262k1.mo9486j(bmk0.m105136g0(4, c1894k.f7798y, c1894k.f7799z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @CallSuper
    /* JADX INFO: renamed from: H1 */
    public void m9688H1() {
        this.f7269r1 = true;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m9689I1() {
        long jMo9488l = this.f7262k1.mo9488l(mo9708c());
        if (jMo9488l != Long.MIN_VALUE) {
            if (!this.f7269r1) {
                jMo9488l = Math.max(this.f7267p1, jMo9488l);
            }
            this.f7267p1 = jMo9488l;
            this.f7269r1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: L */
    public void mo9690L() {
        this.f7270s1 = true;
        this.f7265n1 = null;
        try {
            this.f7262k1.flush();
            try {
                super.mo9690L();
            } finally {
                this.f7261j1.m9630o(this.f7889d1);
            }
        } catch (Throwable th) {
            try {
                super.mo9690L();
                throw th;
            } finally {
                this.f7261j1.m9630o(this.f7889d1);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: M */
    public void mo9691M(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo9691M(z, z2);
        this.f7261j1.m9631p(this.f7889d1);
        boolean z3 = m9818F().f123255a;
        AudioSink audioSink = this.f7262k1;
        if (z3) {
            audioSink.mo9482f();
        } else {
            audioSink.mo9478b();
        }
        this.f7262k1.mo9491o(m9821I());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: N */
    public void mo9692N(long j, boolean z) throws ExoPlaybackException {
        super.mo9692N(j, z);
        boolean z2 = this.f7271t1;
        AudioSink audioSink = this.f7262k1;
        if (z2) {
            audioSink.mo9481e();
        } else {
            audioSink.flush();
        }
        this.f7267p1 = j;
        this.f7268q1 = true;
        this.f7269r1 = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: O */
    public void mo9693O() {
        this.f7262k1.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: P0 */
    public void mo9694P0(Exception exc) {
        kyv.m152146d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f7261j1.m9626k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: Q */
    public void mo9695Q() {
        try {
            super.mo9695Q();
        } finally {
            if (this.f7270s1) {
                this.f7270s1 = false;
                this.f7262k1.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Q0 */
    public void mo9696Q0(String str, InterfaceC1907c.a aVar, long j, long j2) {
        this.f7261j1.m9628m(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: R */
    public void mo9697R() {
        super.mo9697R();
        this.f7262k1.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: R0 */
    public void mo9698R0(String str) {
        this.f7261j1.m9629n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: S */
    public void mo9699S() {
        m9689I1();
        this.f7262k1.pause();
        super.mo9699S();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    /* JADX INFO: renamed from: S0 */
    public nid mo9700S0(p1j p1jVar) throws ExoPlaybackException {
        this.f7265n1 = (C1894k) w11.m204369e(p1jVar.f150174b);
        nid nidVarMo9700S0 = super.mo9700S0(p1jVar);
        this.f7261j1.m9632q(this.f7265n1, nidVarMo9700S0);
        return nidVarMo9700S0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: T0 */
    public void mo9701T0(C1894k c1894k, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM105133f0;
        int i;
        C1894k c1894k2 = this.f7266o1;
        int[] iArr = null;
        if (c1894k2 != null) {
            c1894k = c1894k2;
        } else if (m10469v0() != null) {
            if ("audio/raw".equals(c1894k.f7785l)) {
                iM105133f0 = c1894k.f7766A;
            } else if (bmk0.f77313a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM105133f0 = mediaFormat.containsKey("v-bits-per-sample") ? bmk0.m105133f0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM105133f0 = mediaFormat.getInteger("pcm-encoding");
            }
            C1894k c1894kM10374G = new C1894k.b().m10400g0("audio/raw").m10394a0(iM105133f0).m10383P(c1894k.f7767B).m10384Q(c1894k.f7768C).m10377J(mediaFormat.getInteger("channel-count")).m10401h0(mediaFormat.getInteger("sample-rate")).m10374G();
            if (this.f7264m1 && c1894kM10374G.f7798y == 6 && (i = c1894k.f7798y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < c1894k.f7798y; i2++) {
                    iArr[i2] = i2;
                }
            }
            c1894k = c1894kM10374G;
        }
        try {
            this.f7262k1.mo9492p(c1894k, 0, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw m9816D(e, e.format, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: U0 */
    public void mo9702U0(long j) {
        this.f7262k1.m9489m(j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: W0 */
    public void mo9703W0() {
        super.mo9703W0();
        this.f7262k1.mo9490n();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: X0 */
    public void mo9704X0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f7268q1 || decoderInputBuffer.m97778o()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f7414e - this.f7267p1) > 500000) {
            this.f7267p1 = decoderInputBuffer.f7414e;
        }
        this.f7268q1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Z */
    public nid mo9705Z(C1908d c1908d, C1894k c1894k, C1894k c1894k2) {
        nid nidVarM10566f = c1908d.m10566f(c1894k, c1894k2);
        int i = nidVarM10566f.f142116e;
        if (m10429I0(c1894k2)) {
            i |= 32768;
        }
        if (m9680D1(c1908d, c1894k2) > this.f7263l1) {
            i |= 64;
        }
        int i2 = i;
        return new nid(c1908d.f7936a, c1894k, c1894k2, i2 != 0 ? 0 : nidVarM10566f.f142115d, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: a1 */
    public boolean mo9706a1(long j, long j2, @Nullable InterfaceC1907c interfaceC1907c, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1894k c1894k) throws ExoPlaybackException {
        w11.m204369e(byteBuffer);
        if (this.f7266o1 != null && (i2 & 2) != 0) {
            ((InterfaceC1907c) w11.m204369e(interfaceC1907c)).releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (interfaceC1907c != null) {
                interfaceC1907c.releaseOutputBuffer(i, false);
            }
            this.f7889d1.f121068f += i3;
            this.f7262k1.mo9490n();
            return true;
        }
        try {
            if (!this.f7262k1.mo9484h(byteBuffer, j3, i3)) {
                return false;
            }
            if (interfaceC1907c != null) {
                interfaceC1907c.releaseOutputBuffer(i, false);
            }
            this.f7889d1.f121067e += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw m9817E(e, this.f7265n1, e.isRecoverable, 5001);
        } catch (AudioSink.WriteException e2) {
            throw m9817E(e2, c1894k, e2.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: b */
    public boolean mo9707b() {
        return this.f7262k1.mo9483g() || super.mo9707b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: c */
    public boolean mo9708c() {
        return super.mo9708c() && this.f7262k1.mo9479c();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d, com.google.android.exoplayer2.C2027u.b
    /* JADX INFO: renamed from: f */
    public void mo9709f(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f7262k1.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.f7262k1.mo9480d((C1841a) obj);
            return;
        }
        if (i == 6) {
            this.f7262k1.setAuxEffectInfo((wj1) obj);
            return;
        }
        switch (i) {
            case 9:
                this.f7262k1.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f7262k1.setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.f7272u1 = (InterfaceC2089x.a) obj;
                break;
            case 12:
                if (bmk0.f77313a >= 23) {
                    b.m9716a(this.f7262k1, obj);
                }
                break;
            default:
                super.mo9709f(i, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: f1 */
    public void mo9710f1() throws ExoPlaybackException {
        try {
            this.f7262k1.mo9487k();
        } catch (AudioSink.WriteException e) {
            throw m9817E(e, e.format, e.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x, com.google.android.exoplayer2.InterfaceC2090y
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p153l.erx
    public C1953s getPlaybackParameters() {
        return this.f7262k1.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: s1 */
    public boolean mo9712s1(C1894k c1894k) {
        return this.f7262k1.mo9477a(c1894k);
    }

    @Override // p153l.erx
    public void setPlaybackParameters(C1953s c1953s) {
        this.f7262k1.setPlaybackParameters(c1953s);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: t1 */
    public int mo9713t1(InterfaceC1909e interfaceC1909e, C1894k c1894k) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        if (!kb00.m149014o(c1894k.f7785l)) {
            return InterfaceC2090y.m12266v(0);
        }
        int i = bmk0.f77313a >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = c1894k.f7772G != 0;
        boolean zM10421u1 = MediaCodecRenderer.m10421u1(c1894k);
        int i2 = 8;
        if (zM10421u1 && this.f7262k1.mo9477a(c1894k) && (!z3 || MediaCodecUtil.m10516x() != null)) {
            return InterfaceC2090y.m12261i(4, 8, i);
        }
        if ("audio/raw".equals(c1894k.f7785l) && !this.f7262k1.mo9477a(c1894k)) {
            return InterfaceC2090y.m12266v(1);
        }
        if (!this.f7262k1.mo9477a(bmk0.m105136g0(2, c1894k.f7798y, c1894k.f7799z))) {
            return InterfaceC2090y.m12266v(1);
        }
        List<C1908d> listM9681F1 = m9681F1(interfaceC1909e, c1894k, false, this.f7262k1);
        if (listM9681F1.isEmpty()) {
            return InterfaceC2090y.m12266v(1);
        }
        if (!zM10421u1) {
            return InterfaceC2090y.m12266v(2);
        }
        C1908d c1908d = listM9681F1.get(0);
        boolean zM10572o = c1908d.m10572o(c1894k);
        if (!zM10572o) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM9681F1.size()) {
                    z = true;
                    z2 = zM10572o;
                    break;
                }
                C1908d c1908d2 = listM9681F1.get(i3);
                if (c1908d2.m10572o(c1894k)) {
                    z = false;
                    c1908d = c1908d2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            z2 = zM10572o;
            break;
        }
        int i4 = z2 ? 4 : 3;
        if (z2 && c1908d.m10575r(c1894k)) {
            i2 = 16;
        }
        return InterfaceC2090y.m12264t(i4, i2, i, c1908d.f7943h ? 64 : 0, z ? 128 : 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: y0 */
    public float mo9714y0(float f, C1894k c1894k, C1894k[] c1894kArr) {
        int iMax = -1;
        for (C1894k c1894k2 : c1894kArr) {
            int i = c1894k2.f7799z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // p153l.erx
    /* JADX INFO: renamed from: z */
    public long mo9715z() {
        if (getState() == 2) {
            m9689I1();
        }
        return this.f7267p1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d, com.google.android.exoplayer2.InterfaceC2089x
    @Nullable
    /* JADX INFO: renamed from: m */
    public erx mo9711m() {
        return this;
    }
}
