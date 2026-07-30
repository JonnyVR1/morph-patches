package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p149l.C16561e9;
import p149l.C17507i9;
import p149l.aa1;
import p149l.dpj0;
import p149l.f3c;
import p149l.gld;
import p149l.jwv;
import p149l.kee;
import p149l.n200;
import p149l.ohg0;
import p149l.p11;
import p149l.p95;
import p149l.pj1;
import p149l.rx50;
import p149l.ss5;
import p149l.v680;
import p149l.vb1;
import p149l.vck0;
import p149l.x9g0;
import p149l.yy00;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: h0 */
    public static boolean f7044h0 = false;

    /* JADX INFO: renamed from: i0 */
    public static final Object f7045i0 = new Object();

    /* JADX INFO: renamed from: j0 */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f7046j0;

    /* JADX INFO: renamed from: k0 */
    @GuardedBy("releaseExecutorLock")
    public static int f7047k0;

    /* JADX INFO: renamed from: A */
    @Nullable
    public C1814i f7048A;

    /* JADX INFO: renamed from: B */
    public C1814i f7049B;

    /* JADX INFO: renamed from: C */
    public C1930s f7050C;

    /* JADX INFO: renamed from: D */
    public boolean f7051D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public ByteBuffer f7052E;

    /* JADX INFO: renamed from: F */
    public int f7053F;

    /* JADX INFO: renamed from: G */
    public long f7054G;

    /* JADX INFO: renamed from: H */
    public long f7055H;

    /* JADX INFO: renamed from: I */
    public long f7056I;

    /* JADX INFO: renamed from: J */
    public long f7057J;

    /* JADX INFO: renamed from: K */
    public int f7058K;

    /* JADX INFO: renamed from: L */
    public boolean f7059L;

    /* JADX INFO: renamed from: M */
    public boolean f7060M;

    /* JADX INFO: renamed from: N */
    public long f7061N;

    /* JADX INFO: renamed from: O */
    public float f7062O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public ByteBuffer f7063P;

    /* JADX INFO: renamed from: Q */
    public int f7064Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    public ByteBuffer f7065R;

    /* JADX INFO: renamed from: S */
    public byte[] f7066S;

    /* JADX INFO: renamed from: T */
    public int f7067T;

    /* JADX INFO: renamed from: U */
    public boolean f7068U;

    /* JADX INFO: renamed from: V */
    public boolean f7069V;

    /* JADX INFO: renamed from: W */
    public boolean f7070W;

    /* JADX INFO: renamed from: X */
    public boolean f7071X;

    /* JADX INFO: renamed from: Y */
    public int f7072Y;

    /* JADX INFO: renamed from: Z */
    public pj1 f7073Z;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Context f7074a;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public C1809d f7075a0;

    /* JADX INFO: renamed from: b */
    public final vb1 f7076b;

    /* JADX INFO: renamed from: b0 */
    public boolean f7077b0;

    /* JADX INFO: renamed from: c */
    public final boolean f7078c;

    /* JADX INFO: renamed from: c0 */
    public long f7079c0;

    /* JADX INFO: renamed from: d */
    public final C1823f f7080d;

    /* JADX INFO: renamed from: d0 */
    public long f7081d0;

    /* JADX INFO: renamed from: e */
    public final C1830m f7082e;

    /* JADX INFO: renamed from: e0 */
    public boolean f7083e0;

    /* JADX INFO: renamed from: f */
    public final ImmutableList<AudioProcessor> f7084f;

    /* JADX INFO: renamed from: f0 */
    public boolean f7085f0;

    /* JADX INFO: renamed from: g */
    public final ImmutableList<AudioProcessor> f7086g;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public Looper f7087g0;

    /* JADX INFO: renamed from: h */
    public final ss5 f7088h;

    /* JADX INFO: renamed from: i */
    public final C1821d f7089i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque<C1814i> f7090j;

    /* JADX INFO: renamed from: k */
    public final boolean f7091k;

    /* JADX INFO: renamed from: l */
    public final int f7092l;

    /* JADX INFO: renamed from: m */
    public C1817l f7093m;

    /* JADX INFO: renamed from: n */
    public final C1815j<AudioSink.InitializationException> f7094n;

    /* JADX INFO: renamed from: o */
    public final C1815j<AudioSink.WriteException> f7095o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1810e f7096p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final ExoPlayer.InterfaceC1790b f7097q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public v680 f7098r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public AudioSink.InterfaceC1805a f7099s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public C1812g f7100t;

    /* JADX INFO: renamed from: u */
    public C1812g f7101u;

    /* JADX INFO: renamed from: v */
    public C1819b f7102v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public AudioTrack f7103w;

    /* JADX INFO: renamed from: x */
    public aa1 f7104x;

    /* JADX INFO: renamed from: y */
    public AudioCapabilitiesReceiver f7105y;

    /* JADX INFO: renamed from: z */
    public C1818a f7106z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    @RequiresApi(23)
    public static final class C1807b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9492a(AudioTrack audioTrack, @Nullable C1809d c1809d) {
            audioTrack.setPreferredDevice(c1809d == null ? null : c1809d.f7107a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    @RequiresApi(31)
    public static final class C1808c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9493a(AudioTrack audioTrack, v680 v680Var) {
            LogSessionId logSessionIdM197200a = v680Var.m197200a();
            if (logSessionIdM197200a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdM197200a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$d */
    @RequiresApi(23)
    public static final class C1809d {

        /* JADX INFO: renamed from: a */
        public final AudioDeviceInfo f7107a;

        public C1809d(AudioDeviceInfo audioDeviceInfo) {
            this.f7107a = audioDeviceInfo;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$e */
    public interface InterfaceC1810e {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC1810e f7108a = new C1824g.a().m9622g();

        /* JADX INFO: renamed from: a */
        int mo9494a(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$g */
    public static final class C1812g {

        /* JADX INFO: renamed from: a */
        public final C1871k f7117a;

        /* JADX INFO: renamed from: b */
        public final int f7118b;

        /* JADX INFO: renamed from: c */
        public final int f7119c;

        /* JADX INFO: renamed from: d */
        public final int f7120d;

        /* JADX INFO: renamed from: e */
        public final int f7121e;

        /* JADX INFO: renamed from: f */
        public final int f7122f;

        /* JADX INFO: renamed from: g */
        public final int f7123g;

        /* JADX INFO: renamed from: h */
        public final int f7124h;

        /* JADX INFO: renamed from: i */
        public final C1819b f7125i;

        /* JADX INFO: renamed from: j */
        public final boolean f7126j;

        public C1812g(C1871k c1871k, int i, int i2, int i3, int i4, int i5, int i6, int i7, C1819b c1819b, boolean z) {
            this.f7117a = c1871k;
            this.f7118b = i;
            this.f7119c = i2;
            this.f7120d = i3;
            this.f7121e = i4;
            this.f7122f = i5;
            this.f7123g = i6;
            this.f7124h = i7;
            this.f7125i = c1819b;
            this.f7126j = z;
        }

        @RequiresApi(21)
        /* JADX INFO: renamed from: i */
        public static AudioAttributes m9505i(C1818a c1818a, boolean z) {
            return z ? m9506j() : c1818a.m9532b().f7155a;
        }

        @RequiresApi(21)
        /* JADX INFO: renamed from: j */
        public static AudioAttributes m9506j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* JADX INFO: renamed from: a */
        public AudioTrack m9507a(boolean z, C1818a c1818a, int i) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackM9510d = m9510d(z, c1818a, i);
                int state = audioTrackM9510d.getState();
                if (state == 1) {
                    return audioTrackM9510d;
                }
                try {
                    audioTrackM9510d.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f7121e, this.f7122f, this.f7124h, this.f7117a, m9516l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.f7121e, this.f7122f, this.f7124h, this.f7117a, m9516l(), e);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m9508b(C1812g c1812g) {
            return c1812g.f7119c == this.f7119c && c1812g.f7123g == this.f7123g && c1812g.f7121e == this.f7121e && c1812g.f7122f == this.f7122f && c1812g.f7120d == this.f7120d && c1812g.f7126j == this.f7126j;
        }

        /* JADX INFO: renamed from: c */
        public C1812g m9509c(int i) {
            return new C1812g(this.f7117a, this.f7118b, this.f7119c, this.f7120d, this.f7121e, this.f7122f, this.f7123g, i, this.f7125i, this.f7126j);
        }

        /* JADX INFO: renamed from: d */
        public final AudioTrack m9510d(boolean z, C1818a c1818a, int i) {
            int i2 = vck0.f180948a;
            if (i2 >= 29) {
                return m9512f(z, c1818a, i);
            }
            return i2 >= 21 ? m9511e(z, c1818a, i) : m9513g(c1818a, i);
        }

        @RequiresApi(21)
        /* JADX INFO: renamed from: e */
        public final AudioTrack m9511e(boolean z, C1818a c1818a, int i) {
            return new AudioTrack(m9505i(c1818a, z), DefaultAudioSink.m9447F(this.f7121e, this.f7122f, this.f7123g), this.f7124h, 1, i);
        }

        @RequiresApi(29)
        /* JADX INFO: renamed from: f */
        public final AudioTrack m9512f(boolean z, C1818a c1818a, int i) {
            return new AudioTrack.Builder().setAudioAttributes(m9505i(c1818a, z)).setAudioFormat(DefaultAudioSink.m9447F(this.f7121e, this.f7122f, this.f7123g)).setTransferMode(1).setBufferSizeInBytes(this.f7124h).setSessionId(i).setOffloadedPlayback(this.f7119c == 1).build();
        }

        /* JADX INFO: renamed from: g */
        public final AudioTrack m9513g(C1818a c1818a, int i) {
            int iM197867j0 = vck0.m197867j0(c1818a.f7151c);
            return i == 0 ? new AudioTrack(iM197867j0, this.f7121e, this.f7122f, this.f7123g, this.f7124h, 1) : new AudioTrack(iM197867j0, this.f7121e, this.f7122f, this.f7123g, this.f7124h, 1, i);
        }

        /* JADX INFO: renamed from: h */
        public long m9514h(long j) {
            return vck0.m197830V0(j, this.f7121e);
        }

        /* JADX INFO: renamed from: k */
        public long m9515k(long j) {
            return vck0.m197830V0(j, this.f7117a.f7762z);
        }

        /* JADX INFO: renamed from: l */
        public boolean m9516l() {
            return this.f7119c == 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$i */
    public static final class C1814i {

        /* JADX INFO: renamed from: a */
        public final C1930s f7130a;

        /* JADX INFO: renamed from: b */
        public final long f7131b;

        /* JADX INFO: renamed from: c */
        public final long f7132c;

        public C1814i(C1930s c1930s, long j, long j2) {
            this.f7130a = c1930s;
            this.f7131b = j;
            this.f7132c = j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$j */
    public static final class C1815j<T extends Exception> {

        /* JADX INFO: renamed from: a */
        public final long f7133a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public T f7134b;

        /* JADX INFO: renamed from: c */
        public long f7135c;

        public C1815j(long j) {
            this.f7133a = j;
        }

        /* JADX INFO: renamed from: a */
        public void m9522a() {
            this.f7134b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        /* JADX INFO: renamed from: b */
        public void m9523b(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7134b == null) {
                this.f7134b = t;
                this.f7135c = this.f7133a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f7135c) {
                T t2 = this.f7134b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f7134b;
                m9522a();
                throw t3;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$k */
    public final class C1816k implements C1821d.a {
        public C1816k() {
        }

        @Override // com.google.android.exoplayer2.audio.C1821d.a
        /* JADX INFO: renamed from: a */
        public void mo9524a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.m9470J() + ", " + DefaultAudioSink.this.m9471K();
            if (DefaultAudioSink.f7044h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            jwv.m143689i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.C1821d.a
        /* JADX INFO: renamed from: b */
        public void mo9525b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.m9470J() + ", " + DefaultAudioSink.this.m9471K();
            if (DefaultAudioSink.f7044h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            jwv.m143689i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.C1821d.a
        /* JADX INFO: renamed from: c */
        public void mo9526c(long j) {
            if (DefaultAudioSink.this.f7099s != null) {
                DefaultAudioSink.this.f7099s.mo9441c(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.C1821d.a
        /* JADX INFO: renamed from: d */
        public void mo9527d(int i, long j) {
            if (DefaultAudioSink.this.f7099s != null) {
                DefaultAudioSink.this.f7099s.mo9442d(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f7081d0);
            }
        }

        @Override // com.google.android.exoplayer2.audio.C1821d.a
        /* JADX INFO: renamed from: e */
        public void mo9528e(long j) {
            jwv.m143689i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$l */
    @RequiresApi(29)
    public final class C1817l {

        /* JADX INFO: renamed from: a */
        public final Handler f7137a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b */
        public final AudioTrack$StreamEventCallback f7138b;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$l$a */
        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultAudioSink f7140a;

            public a(DefaultAudioSink defaultAudioSink) {
                this.f7140a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(DefaultAudioSink.this.f7103w) && DefaultAudioSink.this.f7099s != null && DefaultAudioSink.this.f7070W) {
                    DefaultAudioSink.this.f7099s.mo9446h();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f7103w) && DefaultAudioSink.this.f7099s != null && DefaultAudioSink.this.f7070W) {
                    DefaultAudioSink.this.f7099s.mo9446h();
                }
            }
        }

        public C1817l() {
            this.f7138b = new a(DefaultAudioSink.this);
        }

        /* JADX INFO: renamed from: a */
        public void m9529a(AudioTrack audioTrack) {
            Handler handler = this.f7137a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new gld(handler), this.f7138b);
        }

        /* JADX INFO: renamed from: b */
        public void m9530b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f7138b);
            this.f7137a.removeCallbacksAndMessages(null);
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    public DefaultAudioSink(C1811f c1811f) {
        Context context = c1811f.f7109a;
        this.f7074a = context;
        this.f7104x = context != null ? aa1.m95503c(context) : c1811f.f7110b;
        this.f7076b = c1811f.f7111c;
        int i = vck0.f180948a;
        this.f7078c = i >= 21 && c1811f.f7112d;
        this.f7091k = i >= 23 && c1811f.f7113e;
        this.f7092l = i >= 29 ? c1811f.f7114f : 0;
        this.f7096p = c1811f.f7115g;
        ss5 ss5Var = new ss5(p95.f147671a);
        this.f7088h = ss5Var;
        ss5Var.m185714e();
        this.f7089i = new C1821d(new C1816k());
        C1823f c1823f = new C1823f();
        this.f7080d = c1823f;
        C1830m c1830m = new C1830m();
        this.f7082e = c1830m;
        this.f7084f = ImmutableList.m15688of((C1830m) new C1829l(), (C1830m) c1823f, c1830m);
        this.f7086g = ImmutableList.m15686of(new C1828k());
        this.f7062O = 1.0f;
        this.f7106z = C1818a.f7142g;
        this.f7072Y = 0;
        this.f7073Z = new pj1(0, 0.0f);
        C1930s c1930s = C1930s.f8247d;
        this.f7049B = new C1814i(c1930s, 0L, 0L);
        this.f7050C = c1930s;
        this.f7051D = false;
        this.f7090j = new ArrayDeque<>();
        this.f7094n = new C1815j<>(100L);
        this.f7095o = new C1815j<>(100L);
        this.f7097q = c1811f.f7116h;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: F */
    public static AudioFormat m9447F(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX INFO: renamed from: G */
    public static int m9448G(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        p11.m167013g(minBufferSize != -2);
        return minBufferSize;
    }

    /* JADX INFO: renamed from: H */
    public static int m9449H(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C16561e9.m115323e(byteBuffer);
            case 7:
            case 8:
                return kee.m145766e(byteBuffer);
            case 9:
                int iM216509m = yy00.m216509m(vck0.m197805J(byteBuffer, byteBuffer.position()));
                if (iM216509m != -1) {
                    return iM216509m;
                }
                x9g0.m207497a();
                return 0;
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                f3c.m119257a("Unexpected audio encoding: ", i);
                return 0;
            case 14:
                int iM115320b = C16561e9.m115320b(byteBuffer);
                if (iM115320b == -1) {
                    return 0;
                }
                return C16561e9.m115327i(byteBuffer, iM115320b) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C17507i9.m134995c(byteBuffer);
            case 20:
                return rx50.m181476g(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: M */
    public static boolean m9450M(int i) {
        return (vck0.f180948a >= 24 && i == -6) || i == -32;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m9451O(AudioTrack audioTrack) {
        return vck0.f180948a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: U */
    public static void m9452U(final AudioTrack audioTrack, final ss5 ss5Var) {
        ss5Var.m185712c();
        synchronized (f7045i0) {
            try {
                if (f7046j0 == null) {
                    f7046j0 = vck0.m197808K0("ExoPlayer:AudioTrackReleaseThread");
                }
                f7047k0++;
                f7046j0.execute(new Runnable() { // from class: l.ald
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.m9456q(audioTrack, ss5Var);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: Z */
    public static void m9453Z(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m9454a0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: h0 */
    public static int m9455h0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m9456q(AudioTrack audioTrack, ss5 ss5Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            ss5Var.m185714e();
            synchronized (f7045i0) {
                try {
                    int i = f7047k0 - 1;
                    f7047k0 = i;
                    if (i == 0) {
                        f7046j0.shutdown();
                        f7046j0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            ss5Var.m185714e();
            synchronized (f7045i0) {
                try {
                    int i2 = f7047k0 - 1;
                    f7047k0 = i2;
                    if (i2 == 0) {
                        f7046j0.shutdown();
                        f7046j0 = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m9464A(long j) {
        return j + this.f7101u.m9514h(this.f7076b.mo9519c());
    }

    /* JADX INFO: renamed from: B */
    public final AudioTrack m9465B(C1812g c1812g) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackM9507a = c1812g.m9507a(this.f7077b0, this.f7106z, this.f7072Y);
            ExoPlayer.InterfaceC1790b interfaceC1790b = this.f7097q;
            if (interfaceC1790b == null) {
                return audioTrackM9507a;
            }
            interfaceC1790b.m9356E(m9451O(audioTrackM9507a));
            return audioTrackM9507a;
        } catch (AudioSink.InitializationException e) {
            AudioSink.InterfaceC1805a interfaceC1805a = this.f7099s;
            if (interfaceC1805a != null) {
                interfaceC1805a.mo9440b(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: C */
    public final AudioTrack m9466C() throws AudioSink.InitializationException {
        try {
            return m9465B((C1812g) p11.m167011e(this.f7101u));
        } catch (AudioSink.InitializationException e) {
            C1812g c1812g = this.f7101u;
            if (c1812g.f7124h > 1000000) {
                C1812g c1812gM9509c = c1812g.m9509c(PlaybackException.CUSTOM_ERROR_CODE_BASE);
                try {
                    AudioTrack audioTrackM9465B = m9465B(c1812gM9509c);
                    this.f7101u = c1812gM9509c;
                    return audioTrackM9465B;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    m9474P();
                    throw e;
                }
            }
            m9474P();
            throw e;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9467D() throws Exception {
        ByteBuffer byteBuffer;
        if (this.f7102v.m9546f()) {
            this.f7102v.m9548h();
            m9477S(Long.MIN_VALUE);
            return this.f7102v.m9545e() && ((byteBuffer = this.f7065R) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.f7065R;
        if (byteBuffer2 == null) {
            return true;
        }
        m9488g0(byteBuffer2, Long.MIN_VALUE);
        return this.f7065R == null;
    }

    /* JADX INFO: renamed from: E */
    public final aa1 m9468E() {
        if (this.f7105y == null && this.f7074a != null) {
            this.f7087g0 = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(this.f7074a, new AudioCapabilitiesReceiver.InterfaceC1803e() { // from class: l.zkd
                @Override // com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.InterfaceC1803e
                /* JADX INFO: renamed from: a */
                public final void mo9416a(aa1 aa1Var) {
                    this.f203528a.m9475Q(aa1Var);
                }
            });
            this.f7105y = audioCapabilitiesReceiver;
            this.f7104x = audioCapabilitiesReceiver.m9410d();
        }
        return this.f7104x;
    }

    @RequiresApi(29)
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: I */
    public final int m9469I(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = vck0.f180948a;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i == 30 && vck0.f180951d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final long m9470J() {
        C1812g c1812g = this.f7101u;
        return c1812g.f7119c == 0 ? this.f7054G / ((long) c1812g.f7118b) : this.f7055H;
    }

    /* JADX INFO: renamed from: K */
    public final long m9471K() {
        C1812g c1812g = this.f7101u;
        return c1812g.f7119c == 0 ? this.f7056I / ((long) c1812g.f7120d) : this.f7057J;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m9472L() throws AudioSink.InitializationException {
        v680 v680Var;
        if (!this.f7088h.m185713d()) {
            return false;
        }
        AudioTrack audioTrackM9466C = m9466C();
        this.f7103w = audioTrackM9466C;
        if (m9451O(audioTrackM9466C)) {
            m9478T(this.f7103w);
            if (this.f7092l != 3) {
                AudioTrack audioTrack = this.f7103w;
                C1871k c1871k = this.f7101u.f7117a;
                audioTrack.setOffloadDelayPadding(c1871k.f7730B, c1871k.f7731C);
            }
        }
        int i = vck0.f180948a;
        if (i >= 31 && (v680Var = this.f7098r) != null) {
            C1808c.m9493a(this.f7103w, v680Var);
        }
        this.f7072Y = this.f7103w.getAudioSessionId();
        C1821d c1821d = this.f7089i;
        AudioTrack audioTrack2 = this.f7103w;
        C1812g c1812g = this.f7101u;
        c1821d.m9599r(audioTrack2, c1812g.f7119c == 2, c1812g.f7123g, c1812g.f7120d, c1812g.f7124h);
        m9482Y();
        int i2 = this.f7073Z.f149706a;
        if (i2 != 0) {
            this.f7103w.attachAuxEffect(i2);
            this.f7103w.setAuxEffectSendLevel(this.f7073Z.f149707b);
        }
        C1809d c1809d = this.f7075a0;
        if (c1809d != null && i >= 23) {
            C1807b.m9492a(this.f7103w, c1809d);
        }
        this.f7060M = true;
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9473N() {
        return this.f7103w != null;
    }

    /* JADX INFO: renamed from: P */
    public final void m9474P() {
        if (this.f7101u.m9516l()) {
            this.f7083e0 = true;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m9475Q(aa1 aa1Var) {
        p11.m167013g(this.f7087g0 == Looper.myLooper());
        if (aa1Var.equals(m9468E())) {
            return;
        }
        this.f7104x = aa1Var;
        AudioSink.InterfaceC1805a interfaceC1805a = this.f7099s;
        if (interfaceC1805a != null) {
            interfaceC1805a.mo9443e();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m9476R() {
        if (this.f7069V) {
            return;
        }
        this.f7069V = true;
        this.f7089i.m9588f(m9471K());
        this.f7103w.stop();
        this.f7053F = 0;
    }

    /* JADX INFO: renamed from: S */
    public final void m9477S(long j) throws Exception {
        ByteBuffer byteBufferM9544d;
        if (!this.f7102v.m9546f()) {
            ByteBuffer byteBuffer = this.f7063P;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.f7038a;
            }
            m9488g0(byteBuffer, j);
            return;
        }
        while (!this.f7102v.m9545e()) {
            do {
                byteBufferM9544d = this.f7102v.m9544d();
                if (byteBufferM9544d.hasRemaining()) {
                    m9488g0(byteBufferM9544d, j);
                } else {
                    ByteBuffer byteBuffer2 = this.f7063P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f7102v.m9549i(this.f7063P);
                    }
                }
            } while (!byteBufferM9544d.hasRemaining());
            return;
        }
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: T */
    public final void m9478T(AudioTrack audioTrack) {
        if (this.f7093m == null) {
            this.f7093m = new C1817l();
        }
        this.f7093m.m9529a(audioTrack);
    }

    /* JADX INFO: renamed from: V */
    public final void m9479V() {
        this.f7054G = 0L;
        this.f7055H = 0L;
        this.f7056I = 0L;
        this.f7057J = 0L;
        this.f7085f0 = false;
        this.f7058K = 0;
        this.f7049B = new C1814i(this.f7050C, 0L, 0L);
        this.f7061N = 0L;
        this.f7048A = null;
        this.f7090j.clear();
        this.f7063P = null;
        this.f7064Q = 0;
        this.f7065R = null;
        this.f7069V = false;
        this.f7068U = false;
        this.f7052E = null;
        this.f7053F = 0;
        this.f7082e.m9679i();
        m9483b0();
    }

    /* JADX INFO: renamed from: W */
    public final void m9480W(C1930s c1930s) {
        C1814i c1814i = new C1814i(c1930s, -9223372036854775807L, -9223372036854775807L);
        if (m9473N()) {
            this.f7048A = c1814i;
        } else {
            this.f7049B = c1814i;
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: X */
    public final void m9481X() {
        if (m9473N()) {
            try {
                this.f7103w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f7050C.f8251a).setPitch(this.f7050C.f8252b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                jwv.m143690j("DefaultAudioSink", "Failed to set playback params", e);
            }
            C1930s c1930s = new C1930s(this.f7103w.getPlaybackParams().getSpeed(), this.f7103w.getPlaybackParams().getPitch());
            this.f7050C = c1930s;
            this.f7089i.m9600s(c1930s.f8251a);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m9482Y() {
        if (m9473N()) {
            int i = vck0.f180948a;
            AudioTrack audioTrack = this.f7103w;
            if (i >= 21) {
                m9453Z(audioTrack, this.f7062O);
            } else {
                m9454a0(audioTrack, this.f7062O);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: a */
    public boolean mo9423a(C1871k c1871k) {
        return mo9432j(c1871k) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: b */
    public void mo9424b() {
        if (this.f7077b0) {
            this.f7077b0 = false;
            flush();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m9483b0() {
        C1819b c1819b = this.f7101u.f7125i;
        this.f7102v = c1819b;
        c1819b.m9542b();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: c */
    public boolean mo9425c() {
        if (m9473N()) {
            return this.f7068U && !mo9429g();
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m9484c0() {
        if (this.f7077b0) {
            return false;
        }
        C1812g c1812g = this.f7101u;
        return c1812g.f7119c == 0 && !m9485d0(c1812g.f7117a.f7729A);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: d */
    public void mo9426d(C1818a c1818a) {
        if (this.f7106z.equals(c1818a)) {
            return;
        }
        this.f7106z = c1818a;
        if (this.f7077b0) {
            return;
        }
        flush();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m9485d0(int i) {
        return this.f7078c && vck0.m197790B0(i);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: e */
    public void mo9427e() {
        if (vck0.f180948a < 25) {
            flush();
            return;
        }
        this.f7095o.m9522a();
        this.f7094n.m9522a();
        if (m9473N()) {
            m9479V();
            if (this.f7089i.m9590h()) {
                this.f7103w.pause();
            }
            this.f7103w.flush();
            this.f7089i.m9597p();
            C1821d c1821d = this.f7089i;
            AudioTrack audioTrack = this.f7103w;
            C1812g c1812g = this.f7101u;
            c1821d.m9599r(audioTrack, c1812g.f7119c == 2, c1812g.f7123g, c1812g.f7120d, c1812g.f7124h);
            this.f7060M = true;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m9486e0() {
        C1812g c1812g = this.f7101u;
        return c1812g != null && c1812g.f7126j && vck0.f180948a >= 23;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: f */
    public void mo9428f() {
        p11.m167013g(vck0.f180948a >= 21);
        p11.m167013g(this.f7071X);
        if (this.f7077b0) {
            return;
        }
        this.f7077b0 = true;
        flush();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m9487f0(C1871k c1871k, C1818a c1818a) {
        int iM157524f;
        int iM197801H;
        int iM9469I;
        if (vck0.f180948a < 29 || this.f7092l == 0 || (iM157524f = n200.m157524f((String) p11.m167011e(c1871k.f7748l), c1871k.f7745i)) == 0 || (iM197801H = vck0.m197801H(c1871k.f7761y)) == 0 || (iM9469I = m9469I(m9447F(c1871k.f7762z, iM197801H, iM157524f), c1818a.m9532b().f7155a)) == 0) {
            return false;
        }
        if (iM9469I == 1) {
            return ((c1871k.f7730B != 0 || c1871k.f7731C != 0) && (this.f7092l == 1)) ? false : true;
        }
        if (iM9469I == 2) {
            return true;
        }
        ohg0.m164364a();
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (m9473N()) {
            m9479V();
            if (this.f7089i.m9590h()) {
                this.f7103w.pause();
            }
            if (m9451O(this.f7103w)) {
                ((C1817l) p11.m167011e(this.f7093m)).m9530b(this.f7103w);
            }
            if (vck0.f180948a < 21 && !this.f7071X) {
                this.f7072Y = 0;
            }
            C1812g c1812g = this.f7100t;
            if (c1812g != null) {
                this.f7101u = c1812g;
                this.f7100t = null;
            }
            this.f7089i.m9597p();
            m9452U(this.f7103w, this.f7088h);
            this.f7103w = null;
        }
        this.f7095o.m9522a();
        this.f7094n.m9522a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: g */
    public boolean mo9429g() {
        return m9473N() && this.f7089i.m9589g(m9471K());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m9488g0(ByteBuffer byteBuffer, long j) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iM9455h0;
        AudioSink.InterfaceC1805a interfaceC1805a;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.f7065R;
            if (byteBuffer3 != null) {
                p11.m167007a(byteBuffer3 == byteBuffer);
            } else {
                this.f7065R = byteBuffer;
                if (vck0.f180948a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f7066S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f7066S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f7066S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f7067T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (vck0.f180948a < 21) {
                int iM9584b = this.f7089i.m9584b(this.f7056I);
                if (iM9584b > 0) {
                    iM9455h0 = this.f7103w.write(this.f7066S, this.f7067T, Math.min(iRemaining2, iM9584b));
                    if (iM9455h0 > 0) {
                        this.f7067T += iM9455h0;
                        byteBuffer.position(byteBuffer.position() + iM9455h0);
                    }
                } else {
                    iM9455h0 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.f7077b0) {
                p11.m167013g(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f7079c0;
                } else {
                    this.f7079c0 = j;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iM9455h0 = defaultAudioSink.m9489i0(this.f7103w, byteBuffer2, iRemaining2, j);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iM9455h0 = m9455h0(defaultAudioSink.f7103w, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.f7081d0 = SystemClock.elapsedRealtime();
            if (iM9455h0 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iM9455h0, defaultAudioSink.f7101u.f7117a, m9450M(iM9455h0) && defaultAudioSink.f7057J > 0);
                AudioSink.InterfaceC1805a interfaceC1805a2 = defaultAudioSink.f7099s;
                if (interfaceC1805a2 != null) {
                    interfaceC1805a2.mo9440b(writeException);
                }
                if (writeException.isRecoverable) {
                    defaultAudioSink.f7104x = aa1.f68258c;
                    throw writeException;
                }
                defaultAudioSink.f7095o.m9523b(writeException);
                return;
            }
            defaultAudioSink.f7095o.m9522a();
            if (m9451O(defaultAudioSink.f7103w)) {
                if (defaultAudioSink.f7057J > 0) {
                    defaultAudioSink.f7085f0 = false;
                }
                if (defaultAudioSink.f7070W && (interfaceC1805a = defaultAudioSink.f7099s) != null && iM9455h0 < iRemaining2 && !defaultAudioSink.f7085f0) {
                    interfaceC1805a.mo9444f();
                }
            }
            int i = defaultAudioSink.f7101u.f7119c;
            if (i == 0) {
                defaultAudioSink.f7056I += (long) iM9455h0;
            }
            if (iM9455h0 == iRemaining2) {
                if (i != 0) {
                    p11.m167013g(byteBuffer2 == defaultAudioSink.f7063P);
                    defaultAudioSink.f7057J += ((long) defaultAudioSink.f7058K) * ((long) defaultAudioSink.f7064Q);
                }
                defaultAudioSink.f7065R = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public C1930s getPlaybackParameters() {
        return this.f7050C;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: h */
    public boolean mo9430h(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.f7063P;
        p11.m167007a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7100t != null) {
            if (!m9467D()) {
                return false;
            }
            if (this.f7100t.m9508b(this.f7101u)) {
                this.f7101u = this.f7100t;
                this.f7100t = null;
                if (m9451O(this.f7103w) && this.f7092l != 3) {
                    if (this.f7103w.getPlayState() == 3) {
                        this.f7103w.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f7103w;
                    C1871k c1871k = this.f7101u.f7117a;
                    audioTrack.setOffloadDelayPadding(c1871k.f7730B, c1871k.f7731C);
                    this.f7085f0 = true;
                }
            } else {
                m9476R();
                if (mo9429g()) {
                    return false;
                }
                flush();
            }
            m9490y(j);
        }
        if (!m9473N()) {
            try {
                if (!m9472L()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.f7094n.m9523b(e);
                return false;
            }
        }
        this.f7094n.m9522a();
        if (this.f7060M) {
            this.f7061N = Math.max(0L, j);
            this.f7059L = false;
            this.f7060M = false;
            if (m9486e0()) {
                m9481X();
            }
            m9490y(j);
            if (this.f7070W) {
                play();
            }
        }
        if (!this.f7089i.m9592j(m9471K())) {
            return false;
        }
        if (this.f7063P == null) {
            p11.m167007a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C1812g c1812g = this.f7101u;
            if (c1812g.f7119c != 0 && this.f7058K == 0) {
                int iM9449H = m9449H(c1812g.f7123g, byteBuffer);
                this.f7058K = iM9449H;
                if (iM9449H == 0) {
                    return true;
                }
            }
            if (this.f7048A != null) {
                if (!m9467D()) {
                    return false;
                }
                m9490y(j);
                this.f7048A = null;
            }
            long jM9515k = this.f7061N + this.f7101u.m9515k(m9470J() - this.f7082e.m9678h());
            if (!this.f7059L && Math.abs(jM9515k - j) > 200000) {
                AudioSink.InterfaceC1805a interfaceC1805a = this.f7099s;
                if (interfaceC1805a != null) {
                    interfaceC1805a.mo9440b(new AudioSink.UnexpectedDiscontinuityException(j, jM9515k));
                }
                this.f7059L = true;
            }
            if (this.f7059L) {
                if (!m9467D()) {
                    return false;
                }
                long j2 = j - jM9515k;
                this.f7061N += j2;
                this.f7059L = false;
                m9490y(j);
                AudioSink.InterfaceC1805a interfaceC1805a2 = this.f7099s;
                if (interfaceC1805a2 != null && j2 != 0) {
                    interfaceC1805a2.mo9445g();
                }
            }
            if (this.f7101u.f7119c == 0) {
                this.f7054G += (long) byteBuffer.remaining();
            } else {
                this.f7055H += ((long) this.f7058K) * ((long) i);
            }
            this.f7063P = byteBuffer;
            this.f7064Q = i;
        }
        m9477S(j);
        if (!this.f7063P.hasRemaining()) {
            this.f7063P = null;
            this.f7064Q = 0;
            return true;
        }
        if (!this.f7089i.m9591i(m9471K())) {
            return false;
        }
        jwv.m143689i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: i */
    public void mo9431i(AudioSink.InterfaceC1805a interfaceC1805a) {
        this.f7099s = interfaceC1805a;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: i0 */
    public final int m9489i0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (vck0.f180948a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f7052E == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f7052E = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f7052E.putInt(1431633921);
        }
        if (this.f7053F == 0) {
            this.f7052E.putInt(4, i);
            this.f7052E.putLong(8, j * 1000);
            this.f7052E.position(0);
            this.f7053F = i;
        }
        int iRemaining = this.f7052E.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f7052E, iRemaining, 1);
            if (iWrite < 0) {
                this.f7053F = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iM9455h0 = m9455h0(audioTrack, byteBuffer, i);
        if (iM9455h0 < 0) {
            this.f7053F = 0;
            return iM9455h0;
        }
        this.f7053F -= iM9455h0;
        return iM9455h0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: j */
    public int mo9432j(C1871k c1871k) {
        if (!"audio/raw".equals(c1871k.f7748l)) {
            return ((this.f7083e0 || !m9487f0(c1871k, this.f7106z)) && !m9468E().m95509i(c1871k)) ? 0 : 2;
        }
        boolean zM197792C0 = vck0.m197792C0(c1871k.f7729A);
        int i = c1871k.f7729A;
        if (zM197792C0) {
            return (i == 2 || (this.f7078c && i == 4)) ? 2 : 1;
        }
        jwv.m143689i("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: k */
    public void mo9433k() throws AudioSink.WriteException {
        if (!this.f7068U && m9473N() && m9467D()) {
            m9476R();
            this.f7068U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: l */
    public long mo9434l(boolean z) {
        if (!m9473N() || this.f7060M) {
            return Long.MIN_VALUE;
        }
        return m9464A(m9491z(Math.min(this.f7089i.m9585c(z), this.f7101u.m9514h(m9471K()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: n */
    public void mo9436n() {
        this.f7059L = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: o */
    public void mo9437o(@Nullable v680 v680Var) {
        this.f7098r = v680Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: p */
    public void mo9438p(C1871k c1871k, int i, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        int i2;
        int iIntValue;
        boolean z;
        C1819b c1819b;
        int iM197801H;
        int i3;
        int iM197861h0;
        int iM197861h1;
        int i4;
        int iMo9494a;
        int[] iArr2;
        if ("audio/raw".equals(c1871k.f7748l)) {
            p11.m167007a(vck0.m197792C0(c1871k.f7729A));
            iM197861h0 = vck0.m197861h0(c1871k.f7729A, c1871k.f7761y);
            ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
            if (m9485d0(c1871k.f7729A)) {
                c2781a.m15700k(this.f7086g);
            } else {
                c2781a.m15700k(this.f7084f);
                c2781a.m15699j(this.f7076b.mo9517a());
            }
            C1819b c1819b2 = new C1819b(c2781a.m15702m());
            if (c1819b2.equals(this.f7102v)) {
                c1819b2 = this.f7102v;
            }
            this.f7082e.m9680j(c1871k.f7730B, c1871k.f7731C);
            if (vck0.f180948a < 21 && c1871k.f7761y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.f7080d.m9609h(iArr2);
            try {
                AudioProcessor.C1804a c1804aM9541a = c1819b2.m9541a(new AudioProcessor.C1804a(c1871k.f7762z, c1871k.f7761y, c1871k.f7729A));
                iIntValue = c1804aM9541a.f7042c;
                i2 = c1804aM9541a.f7040a;
                int iM197801H2 = vck0.m197801H(c1804aM9541a.f7041b);
                iM197861h1 = vck0.m197861h0(iIntValue, c1804aM9541a.f7041b);
                z = this.f7091k;
                c1819b = c1819b2;
                iM197801H = iM197801H2;
                i3 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, c1871k);
            }
        } else {
            C1819b c1819b3 = new C1819b(ImmutableList.m15685of());
            i2 = c1871k.f7762z;
            if (m9487f0(c1871k, this.f7106z)) {
                iIntValue = n200.m157524f((String) p11.m167011e(c1871k.f7748l), c1871k.f7745i);
                c1819b = c1819b3;
                iM197801H = vck0.m197801H(c1871k.f7761y);
                iM197861h0 = -1;
                iM197861h1 = -1;
                z = true;
                i3 = 1;
            } else {
                Pair<Integer, Integer> pairM95508f = m9468E().m95508f(c1871k);
                if (pairM95508f == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + c1871k, c1871k);
                }
                iIntValue = ((Integer) pairM95508f.first).intValue();
                int iIntValue2 = ((Integer) pairM95508f.second).intValue();
                z = this.f7091k;
                c1819b = c1819b3;
                iM197801H = iIntValue2;
                i3 = 2;
                iM197861h0 = -1;
                iM197861h1 = -1;
            }
        }
        int i6 = iIntValue;
        if (i6 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i3 + ") for: " + c1871k, c1871k);
        }
        if (iM197801H == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i3 + ") for: " + c1871k, c1871k);
        }
        if (i != 0) {
            i4 = i2;
            iMo9494a = i;
        } else {
            i4 = i2;
            iMo9494a = this.f7096p.mo9494a(m9448G(i2, iM197801H, i6), i6, i3, iM197861h1 != -1 ? iM197861h1 : 1, i4, c1871k.f7744h, z ? 8.0d : 1.0d);
        }
        this.f7083e0 = false;
        C1812g c1812g = new C1812g(c1871k, iM197861h0, i3, iM197861h1, i4, iM197801H, i6, iMo9494a, c1819b, z);
        if (m9473N()) {
            this.f7100t = c1812g;
        } else {
            this.f7101u = c1812g;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.f7070W = false;
        if (m9473N() && this.f7089i.m9596o()) {
            this.f7103w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.f7070W = true;
        if (m9473N()) {
            this.f7089i.m9601t();
            this.f7103w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f7105y;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.m9411e();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        dpj0<AudioProcessor> it = this.f7084f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        dpj0<AudioProcessor> it2 = this.f7086g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        C1819b c1819b = this.f7102v;
        if (c1819b != null) {
            c1819b.m9550j();
        }
        this.f7070W = false;
        this.f7083e0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.f7072Y != i) {
            this.f7072Y = i;
            this.f7071X = i != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(pj1 pj1Var) {
        if (this.f7073Z.equals(pj1Var)) {
            return;
        }
        int i = pj1Var.f149706a;
        float f = pj1Var.f149707b;
        AudioTrack audioTrack = this.f7103w;
        if (audioTrack != null) {
            if (this.f7073Z.f149706a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f7103w.setAuxEffectSendLevel(f);
            }
        }
        this.f7073Z = pj1Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(C1930s c1930s) {
        this.f7050C = new C1930s(vck0.m197882p(c1930s.f8251a, 0.1f, 8.0f), vck0.m197882p(c1930s.f8252b, 0.1f, 8.0f));
        if (m9486e0()) {
            m9481X();
        } else {
            m9480W(c1930s);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        C1809d c1809d = audioDeviceInfo == null ? null : new C1809d(audioDeviceInfo);
        this.f7075a0 = c1809d;
        AudioTrack audioTrack = this.f7103w;
        if (audioTrack != null) {
            C1807b.m9492a(audioTrack, c1809d);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.f7051D = z;
        m9480W(m9486e0() ? C1930s.f8247d : this.f7050C);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f) {
        if (this.f7062O != f) {
            this.f7062O = f;
            m9482Y();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9490y(long j) {
        C1930s c1930sMo9518b;
        if (m9486e0()) {
            c1930sMo9518b = C1930s.f8247d;
        } else {
            c1930sMo9518b = m9484c0() ? this.f7076b.mo9518b(this.f7050C) : C1930s.f8247d;
            this.f7050C = c1930sMo9518b;
        }
        C1930s c1930s = c1930sMo9518b;
        this.f7051D = m9484c0() ? this.f7076b.mo9521e(this.f7051D) : false;
        this.f7090j.add(new C1814i(c1930s, Math.max(0L, j), this.f7101u.m9514h(m9471K())));
        m9483b0();
        AudioSink.InterfaceC1805a interfaceC1805a = this.f7099s;
        if (interfaceC1805a != null) {
            interfaceC1805a.mo9439a(this.f7051D);
        }
    }

    /* JADX INFO: renamed from: z */
    public final long m9491z(long j) {
        while (!this.f7090j.isEmpty() && j >= this.f7090j.getFirst().f7132c) {
            this.f7049B = this.f7090j.remove();
        }
        C1814i c1814i = this.f7049B;
        long j2 = j - c1814i.f7132c;
        if (c1814i.f7130a.equals(C1930s.f8247d)) {
            return this.f7049B.f7131b + j2;
        }
        if (this.f7090j.isEmpty()) {
            return this.f7049B.f7131b + this.f7076b.mo9520d(j2);
        }
        C1814i first = this.f7090j.getFirst();
        return first.f7131b - vck0.m197849d0(first.f7132c - j, this.f7049B.f7130a.f8251a);
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$f */
    public static final class C1811f {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Context f7109a;

        /* JADX INFO: renamed from: b */
        public aa1 f7110b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public vb1 f7111c;

        /* JADX INFO: renamed from: d */
        public boolean f7112d;

        /* JADX INFO: renamed from: e */
        public boolean f7113e;

        /* JADX INFO: renamed from: f */
        public int f7114f;

        /* JADX INFO: renamed from: g */
        public InterfaceC1810e f7115g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public ExoPlayer.InterfaceC1790b f7116h;

        @Deprecated
        public C1811f() {
            this.f7109a = null;
            this.f7110b = aa1.f68258c;
            this.f7114f = 0;
            this.f7115g = InterfaceC1810e.f7108a;
        }

        /* JADX INFO: renamed from: g */
        public DefaultAudioSink m9501g() {
            if (this.f7111c == null) {
                this.f7111c = new C1813h(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        /* JADX INFO: renamed from: h */
        public C1811f m9502h(boolean z) {
            this.f7113e = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1811f m9503i(boolean z) {
            this.f7112d = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C1811f m9504j(int i) {
            this.f7114f = i;
            return this;
        }

        public C1811f(Context context) {
            this.f7109a = context;
            this.f7110b = aa1.f68258c;
            this.f7114f = 0;
            this.f7115g = InterfaceC1810e.f7108a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h */
    public static class C1813h implements vb1 {

        /* JADX INFO: renamed from: a */
        public final AudioProcessor[] f7127a;

        /* JADX INFO: renamed from: b */
        public final C1826i f7128b;

        /* JADX INFO: renamed from: c */
        public final C1827j f7129c;

        public C1813h(AudioProcessor[] audioProcessorArr, C1826i c1826i, C1827j c1827j) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f7127a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f7128b = c1826i;
            this.f7129c = c1827j;
            audioProcessorArr2[audioProcessorArr.length] = c1826i;
            audioProcessorArr2[audioProcessorArr.length + 1] = c1827j;
        }

        @Override // p149l.vb1
        /* JADX INFO: renamed from: a */
        public AudioProcessor[] mo9517a() {
            return this.f7127a;
        }

        @Override // p149l.vb1
        /* JADX INFO: renamed from: b */
        public C1930s mo9518b(C1930s c1930s) {
            this.f7129c.m9676d(c1930s.f8251a);
            this.f7129c.m9675b(c1930s.f8252b);
            return c1930s;
        }

        @Override // p149l.vb1
        /* JADX INFO: renamed from: c */
        public long mo9519c() {
            return this.f7128b.m9666p();
        }

        @Override // p149l.vb1
        /* JADX INFO: renamed from: d */
        public long mo9520d(long j) {
            return this.f7129c.m9674a(j);
        }

        @Override // p149l.vb1
        /* JADX INFO: renamed from: e */
        public boolean mo9521e(boolean z) {
            this.f7128b.m9672v(z);
            return z;
        }

        public C1813h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new C1826i(), new C1827j());
        }
    }
}
