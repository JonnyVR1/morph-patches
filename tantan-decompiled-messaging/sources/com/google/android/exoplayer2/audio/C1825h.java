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
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2066x;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C1885d;
import com.google.android.exoplayer2.mediacodec.InterfaceC1884c;
import com.google.android.exoplayer2.mediacodec.InterfaceC1886e;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p149l.hhd;
import p149l.hix;
import p149l.jwv;
import p149l.n200;
import p149l.p11;
import p149l.pj1;
import p149l.tjx;
import p149l.uyi;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1825h extends MediaCodecRenderer implements hix {

    /* JADX INFO: renamed from: i1 */
    public final Context f7223i1;

    /* JADX INFO: renamed from: j1 */
    public final InterfaceC1820c.a f7224j1;

    /* JADX INFO: renamed from: k1 */
    public final AudioSink f7225k1;

    /* JADX INFO: renamed from: l1 */
    public int f7226l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f7227m1;

    /* JADX INFO: renamed from: n1 */
    @Nullable
    public C1871k f7228n1;

    /* JADX INFO: renamed from: o1 */
    @Nullable
    public C1871k f7229o1;

    /* JADX INFO: renamed from: p1 */
    public long f7230p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f7231q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f7232r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f7233s1;

    /* JADX INFO: renamed from: t1 */
    public boolean f7234t1;

    /* JADX INFO: renamed from: u1 */
    @Nullable
    public InterfaceC2066x.a f7235u1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h$b */
    @RequiresApi(23)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9662a(AudioSink audioSink, @Nullable Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.h$c */
    public final class c implements AudioSink.InterfaceC1805a {
        public c() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: a */
        public void mo9439a(boolean z) {
            C1825h.this.f7224j1.m9580s(z);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: b */
        public void mo9440b(Exception exc) {
            jwv.m143684d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C1825h.this.f7224j1.m9573l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: c */
        public void mo9441c(long j) {
            C1825h.this.f7224j1.m9579r(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: d */
        public void mo9442d(int i, long j, long j2) {
            C1825h.this.f7224j1.m9581t(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: e */
        public void mo9443e() {
            C1825h.this.m9770P();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: f */
        public void mo9444f() {
            if (C1825h.this.f7235u1 != null) {
                C1825h.this.f7235u1.mo10263a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: g */
        public void mo9445g() {
            C1825h.this.m9634H1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.InterfaceC1805a
        /* JADX INFO: renamed from: h */
        public void mo9446h() {
            if (C1825h.this.f7235u1 != null) {
                C1825h.this.f7235u1.mo10264b();
            }
        }
    }

    public C1825h(Context context, InterfaceC1884c.b bVar, InterfaceC1886e interfaceC1886e, boolean z, @Nullable Handler handler, @Nullable InterfaceC1820c interfaceC1820c, AudioSink audioSink) {
        super(1, bVar, interfaceC1886e, z, 44100.0f);
        this.f7223i1 = context.getApplicationContext();
        this.f7225k1 = audioSink;
        this.f7224j1 = new InterfaceC1820c.a(handler, interfaceC1820c);
        audioSink.mo9431i(new c());
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m9624B1(String str) {
        if (vck0.f180948a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(vck0.f180950c)) {
            return false;
        }
        String str2 = vck0.f180949b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    /* JADX INFO: renamed from: C1 */
    public static boolean m9625C1() {
        if (vck0.f180948a != 23) {
            return false;
        }
        String str = vck0.f180951d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    /* JADX INFO: renamed from: D1 */
    private int m9626D1(C1885d c1885d, C1871k c1871k) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c1885d.f7899a) || (i = vck0.f180948a) >= 24 || (i == 23 && vck0.m197798F0(this.f7223i1))) {
            return c1871k.f7749m;
        }
        return -1;
    }

    /* JADX INFO: renamed from: F1 */
    public static List<C1885d> m9627F1(InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        C1885d c1885dM10462x;
        if (c1871k.f7748l == null) {
            return ImmutableList.m15685of();
        }
        return (!audioSink.mo9423a(c1871k) || (c1885dM10462x = MediaCodecUtil.m10462x()) == null) ? MediaCodecUtil.m10460v(interfaceC1886e, c1871k, z, false) : ImmutableList.m15686of(c1885dM10462x);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: A0 */
    public List<C1885d> mo9630A0(InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.m10461w(m9627F1(interfaceC1886e, c1871k, z, this.f7225k1), c1871k);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: B0 */
    public InterfaceC1884c.a mo9631B0(C1885d c1885d, C1871k c1871k, @Nullable MediaCrypto mediaCrypto, float f) {
        this.f7226l1 = m9632E1(c1885d, c1871k, m9768J());
        this.f7227m1 = m9624B1(c1885d.f7899a);
        MediaFormat mediaFormatM9633G1 = m9633G1(c1871k, c1885d.f7901c, this.f7226l1, f);
        this.f7229o1 = (!"audio/raw".equals(c1885d.f7900b) || "audio/raw".equals(c1871k.f7748l)) ? null : c1871k;
        return InterfaceC1884c.a.m10490a(c1885d, mediaFormatM9633G1, c1871k, mediaCrypto);
    }

    /* JADX INFO: renamed from: E1 */
    public int m9632E1(C1885d c1885d, C1871k c1871k, C1871k[] c1871kArr) {
        int iM9626D1 = m9626D1(c1885d, c1871k);
        if (c1871kArr.length == 1) {
            return iM9626D1;
        }
        for (C1871k c1871k2 : c1871kArr) {
            if (c1885d.m10512f(c1871k, c1871k2).f107702d != 0) {
                iM9626D1 = Math.max(iM9626D1, m9626D1(c1885d, c1871k2));
            }
        }
        return iM9626D1;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: G1 */
    public MediaFormat m9633G1(C1871k c1871k, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("channel-count", c1871k.f7761y);
        mediaFormat.setInteger("sample-rate", c1871k.f7762z);
        tjx.m189419e(mediaFormat, c1871k.f7750n);
        tjx.m189418d(mediaFormat, "max-input-size", i);
        int i2 = vck0.f180948a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m9625C1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(c1871k.f7748l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f7225k1.mo9432j(vck0.m197858g0(4, c1871k.f7761y, c1871k.f7762z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @CallSuper
    /* JADX INFO: renamed from: H1 */
    public void m9634H1() {
        this.f7232r1 = true;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m9635I1() {
        long jMo9434l = this.f7225k1.mo9434l(mo9654c());
        if (jMo9434l != Long.MIN_VALUE) {
            if (!this.f7232r1) {
                jMo9434l = Math.max(this.f7230p1, jMo9434l);
            }
            this.f7230p1 = jMo9434l;
            this.f7232r1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: L */
    public void mo9636L() {
        this.f7233s1 = true;
        this.f7228n1 = null;
        try {
            this.f7225k1.flush();
            try {
                super.mo9636L();
            } finally {
                this.f7224j1.m9576o(this.f7852d1);
            }
        } catch (Throwable th) {
            try {
                super.mo9636L();
                throw th;
            } finally {
                this.f7224j1.m9576o(this.f7852d1);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: M */
    public void mo9637M(boolean z, boolean z2) throws ExoPlaybackException {
        super.mo9637M(z, z2);
        this.f7224j1.m9577p(this.f7852d1);
        boolean z3 = m9764F().f92903a;
        AudioSink audioSink = this.f7225k1;
        if (z3) {
            audioSink.mo9428f();
        } else {
            audioSink.mo9424b();
        }
        this.f7225k1.mo9437o(m9767I());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: N */
    public void mo9638N(long j, boolean z) throws ExoPlaybackException {
        super.mo9638N(j, z);
        boolean z2 = this.f7234t1;
        AudioSink audioSink = this.f7225k1;
        if (z2) {
            audioSink.mo9427e();
        } else {
            audioSink.flush();
        }
        this.f7230p1 = j;
        this.f7231q1 = true;
        this.f7232r1 = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: O */
    public void mo9639O() {
        this.f7225k1.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: P0 */
    public void mo9640P0(Exception exc) {
        jwv.m143684d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f7224j1.m9572k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: Q */
    public void mo9641Q() {
        try {
            super.mo9641Q();
        } finally {
            if (this.f7233s1) {
                this.f7233s1 = false;
                this.f7225k1.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Q0 */
    public void mo9642Q0(String str, InterfaceC1884c.a aVar, long j, long j2) {
        this.f7224j1.m9574m(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: R */
    public void mo9643R() {
        super.mo9643R();
        this.f7225k1.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: R0 */
    public void mo9644R0(String str) {
        this.f7224j1.m9575n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: S */
    public void mo9645S() {
        m9635I1();
        this.f7225k1.pause();
        super.mo9645S();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    /* JADX INFO: renamed from: S0 */
    public hhd mo9646S0(uyi uyiVar) throws ExoPlaybackException {
        this.f7228n1 = (C1871k) p11.m167011e(uyiVar.f178866b);
        hhd hhdVarMo9646S0 = super.mo9646S0(uyiVar);
        this.f7224j1.m9578q(this.f7228n1, hhdVarMo9646S0);
        return hhdVarMo9646S0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: T0 */
    public void mo9647T0(C1871k c1871k, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM197855f0;
        int i;
        C1871k c1871k2 = this.f7229o1;
        int[] iArr = null;
        if (c1871k2 != null) {
            c1871k = c1871k2;
        } else if (m10415v0() != null) {
            if ("audio/raw".equals(c1871k.f7748l)) {
                iM197855f0 = c1871k.f7729A;
            } else if (vck0.f180948a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM197855f0 = mediaFormat.containsKey("v-bits-per-sample") ? vck0.m197855f0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM197855f0 = mediaFormat.getInteger("pcm-encoding");
            }
            C1871k c1871kM10320G = new C1871k.b().m10346g0("audio/raw").m10340a0(iM197855f0).m10329P(c1871k.f7730B).m10330Q(c1871k.f7731C).m10323J(mediaFormat.getInteger("channel-count")).m10347h0(mediaFormat.getInteger("sample-rate")).m10320G();
            if (this.f7227m1 && c1871kM10320G.f7761y == 6 && (i = c1871k.f7761y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < c1871k.f7761y; i2++) {
                    iArr[i2] = i2;
                }
            }
            c1871k = c1871kM10320G;
        }
        try {
            this.f7225k1.mo9438p(c1871k, 0, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw m9762D(e, e.format, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: U0 */
    public void mo9648U0(long j) {
        this.f7225k1.m9435m(j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: W0 */
    public void mo9649W0() {
        super.mo9649W0();
        this.f7225k1.mo9436n();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: X0 */
    public void mo9650X0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f7231q1 || decoderInputBuffer.m154494o()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f7377e - this.f7230p1) > 500000) {
            this.f7230p1 = decoderInputBuffer.f7377e;
        }
        this.f7231q1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: Z */
    public hhd mo9651Z(C1885d c1885d, C1871k c1871k, C1871k c1871k2) {
        hhd hhdVarM10512f = c1885d.m10512f(c1871k, c1871k2);
        int i = hhdVarM10512f.f107703e;
        if (m10375I0(c1871k2)) {
            i |= 32768;
        }
        if (m9626D1(c1885d, c1871k2) > this.f7226l1) {
            i |= 64;
        }
        int i2 = i;
        return new hhd(c1885d.f7899a, c1871k, c1871k2, i2 != 0 ? 0 : hhdVarM10512f.f107702d, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: a1 */
    public boolean mo9652a1(long j, long j2, @Nullable InterfaceC1884c interfaceC1884c, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1871k c1871k) throws ExoPlaybackException {
        p11.m167011e(byteBuffer);
        if (this.f7229o1 != null && (i2 & 2) != 0) {
            ((InterfaceC1884c) p11.m167011e(interfaceC1884c)).releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (interfaceC1884c != null) {
                interfaceC1884c.releaseOutputBuffer(i, false);
            }
            this.f7852d1.f86267f += i3;
            this.f7225k1.mo9436n();
            return true;
        }
        try {
            if (!this.f7225k1.mo9430h(byteBuffer, j3, i3)) {
                return false;
            }
            if (interfaceC1884c != null) {
                interfaceC1884c.releaseOutputBuffer(i, false);
            }
            this.f7852d1.f86266e += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw m9763E(e, this.f7228n1, e.isRecoverable, 5001);
        } catch (AudioSink.WriteException e2) {
            throw m9763E(e2, c1871k, e2.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: b */
    public boolean mo9653b() {
        return this.f7225k1.mo9429g() || super.mo9653b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: c */
    public boolean mo9654c() {
        return super.mo9654c() && this.f7225k1.mo9425c();
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d, com.google.android.exoplayer2.C2004u.b
    /* JADX INFO: renamed from: f */
    public void mo9655f(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f7225k1.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.f7225k1.mo9426d((C1818a) obj);
            return;
        }
        if (i == 6) {
            this.f7225k1.setAuxEffectInfo((pj1) obj);
            return;
        }
        switch (i) {
            case 9:
                this.f7225k1.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f7225k1.setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.f7235u1 = (InterfaceC2066x.a) obj;
                break;
            case 12:
                if (vck0.f180948a >= 23) {
                    b.m9662a(this.f7225k1, obj);
                }
                break;
            default:
                super.mo9655f(i, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: f1 */
    public void mo9656f1() throws ExoPlaybackException {
        try {
            this.f7225k1.mo9433k();
        } catch (AudioSink.WriteException e) {
            throw m9763E(e, e.format, e.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x, com.google.android.exoplayer2.InterfaceC2067y
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p149l.hix
    public C1930s getPlaybackParameters() {
        return this.f7225k1.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: s1 */
    public boolean mo9658s1(C1871k c1871k) {
        return this.f7225k1.mo9423a(c1871k);
    }

    @Override // p149l.hix
    public void setPlaybackParameters(C1930s c1930s) {
        this.f7225k1.setPlaybackParameters(c1930s);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: t1 */
    public int mo9659t1(InterfaceC1886e interfaceC1886e, C1871k c1871k) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        if (!n200.m157533o(c1871k.f7748l)) {
            return InterfaceC2067y.m12212v(0);
        }
        int i = vck0.f180948a >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = c1871k.f7735G != 0;
        boolean zM10367u1 = MediaCodecRenderer.m10367u1(c1871k);
        int i2 = 8;
        if (zM10367u1 && this.f7225k1.mo9423a(c1871k) && (!z3 || MediaCodecUtil.m10462x() != null)) {
            return InterfaceC2067y.m12207i(4, 8, i);
        }
        if ("audio/raw".equals(c1871k.f7748l) && !this.f7225k1.mo9423a(c1871k)) {
            return InterfaceC2067y.m12212v(1);
        }
        if (!this.f7225k1.mo9423a(vck0.m197858g0(2, c1871k.f7761y, c1871k.f7762z))) {
            return InterfaceC2067y.m12212v(1);
        }
        List<C1885d> listM9627F1 = m9627F1(interfaceC1886e, c1871k, false, this.f7225k1);
        if (listM9627F1.isEmpty()) {
            return InterfaceC2067y.m12212v(1);
        }
        if (!zM10367u1) {
            return InterfaceC2067y.m12212v(2);
        }
        C1885d c1885d = listM9627F1.get(0);
        boolean zM10518o = c1885d.m10518o(c1871k);
        if (!zM10518o) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM9627F1.size()) {
                    z = true;
                    z2 = zM10518o;
                    break;
                }
                C1885d c1885d2 = listM9627F1.get(i3);
                if (c1885d2.m10518o(c1871k)) {
                    z = false;
                    c1885d = c1885d2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            z2 = zM10518o;
            break;
        }
        int i4 = z2 ? 4 : 3;
        if (z2 && c1885d.m10521r(c1871k)) {
            i2 = 16;
        }
        return InterfaceC2067y.m12210t(i4, i2, i, c1885d.f7906h ? 64 : 0, z ? 128 : 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* JADX INFO: renamed from: y0 */
    public float mo9660y0(float f, C1871k c1871k, C1871k[] c1871kArr) {
        int iMax = -1;
        for (C1871k c1871k2 : c1871kArr) {
            int i = c1871k2.f7762z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // p149l.hix
    /* JADX INFO: renamed from: z */
    public long mo9661z() {
        if (getState() == 2) {
            m9635I1();
        }
        return this.f7230p1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d, com.google.android.exoplayer2.InterfaceC2066x
    @Nullable
    /* JADX INFO: renamed from: m */
    public hix mo9657m() {
        return this;
    }
}
