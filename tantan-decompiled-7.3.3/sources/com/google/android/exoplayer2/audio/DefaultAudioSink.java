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
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1953s;
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
import p153l.C16484d9;
import p153l.C21775z8;
import p153l.bf80;
import p153l.bmk0;
import p153l.cc1;
import p153l.fig0;
import p153l.gyj0;
import p153l.ha1;
import p153l.i710;
import p153l.kb00;
import p153l.kyv;
import p153l.mmd;
import p153l.o4c;
import p153l.ofe;
import p153l.qa5;
import p153l.w11;
import p153l.w560;
import p153l.wj1;
import p153l.wpg0;
import p153l.wt5;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: h0 */
    public static boolean f7081h0 = false;

    /* JADX INFO: renamed from: i0 */
    public static final Object f7082i0 = new Object();

    /* JADX INFO: renamed from: j0 */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f7083j0;

    /* JADX INFO: renamed from: k0 */
    @GuardedBy("releaseExecutorLock")
    public static int f7084k0;

    /* JADX INFO: renamed from: A */
    @Nullable
    public C1837i f7085A;

    /* JADX INFO: renamed from: B */
    public C1837i f7086B;

    /* JADX INFO: renamed from: C */
    public C1953s f7087C;

    /* JADX INFO: renamed from: D */
    public boolean f7088D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public ByteBuffer f7089E;

    /* JADX INFO: renamed from: F */
    public int f7090F;

    /* JADX INFO: renamed from: G */
    public long f7091G;

    /* JADX INFO: renamed from: H */
    public long f7092H;

    /* JADX INFO: renamed from: I */
    public long f7093I;

    /* JADX INFO: renamed from: J */
    public long f7094J;

    /* JADX INFO: renamed from: K */
    public int f7095K;

    /* JADX INFO: renamed from: L */
    public boolean f7096L;

    /* JADX INFO: renamed from: M */
    public boolean f7097M;

    /* JADX INFO: renamed from: N */
    public long f7098N;

    /* JADX INFO: renamed from: O */
    public float f7099O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public ByteBuffer f7100P;

    /* JADX INFO: renamed from: Q */
    public int f7101Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    public ByteBuffer f7102R;

    /* JADX INFO: renamed from: S */
    public byte[] f7103S;

    /* JADX INFO: renamed from: T */
    public int f7104T;

    /* JADX INFO: renamed from: U */
    public boolean f7105U;

    /* JADX INFO: renamed from: V */
    public boolean f7106V;

    /* JADX INFO: renamed from: W */
    public boolean f7107W;

    /* JADX INFO: renamed from: X */
    public boolean f7108X;

    /* JADX INFO: renamed from: Y */
    public int f7109Y;

    /* JADX INFO: renamed from: Z */
    public wj1 f7110Z;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Context f7111a;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public C1832d f7112a0;

    /* JADX INFO: renamed from: b */
    public final cc1 f7113b;

    /* JADX INFO: renamed from: b0 */
    public boolean f7114b0;

    /* JADX INFO: renamed from: c */
    public final boolean f7115c;

    /* JADX INFO: renamed from: c0 */
    public long f7116c0;

    /* JADX INFO: renamed from: d */
    public final C1846f f7117d;

    /* JADX INFO: renamed from: d0 */
    public long f7118d0;

    /* JADX INFO: renamed from: e */
    public final C1853m f7119e;

    /* JADX INFO: renamed from: e0 */
    public boolean f7120e0;

    /* JADX INFO: renamed from: f */
    public final ImmutableList<AudioProcessor> f7121f;

    /* JADX INFO: renamed from: f0 */
    public boolean f7122f0;

    /* JADX INFO: renamed from: g */
    public final ImmutableList<AudioProcessor> f7123g;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public Looper f7124g0;

    /* JADX INFO: renamed from: h */
    public final wt5 f7125h;

    /* JADX INFO: renamed from: i */
    public final C1844d f7126i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque<C1837i> f7127j;

    /* JADX INFO: renamed from: k */
    public final boolean f7128k;

    /* JADX INFO: renamed from: l */
    public final int f7129l;

    /* JADX INFO: renamed from: m */
    public C1840l f7130m;

    /* JADX INFO: renamed from: n */
    public final C1838j<AudioSink.InitializationException> f7131n;

    /* JADX INFO: renamed from: o */
    public final C1838j<AudioSink.WriteException> f7132o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1833e f7133p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final ExoPlayer.InterfaceC1813b f7134q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public bf80 f7135r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public AudioSink.InterfaceC1828a f7136s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public C1835g f7137t;

    /* JADX INFO: renamed from: u */
    public C1835g f7138u;

    /* JADX INFO: renamed from: v */
    public C1842b f7139v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public AudioTrack f7140w;

    /* JADX INFO: renamed from: x */
    public ha1 f7141x;

    /* JADX INFO: renamed from: y */
    public AudioCapabilitiesReceiver f7142y;

    /* JADX INFO: renamed from: z */
    public C1841a f7143z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    @RequiresApi(23)
    public static final class C1830b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9546a(AudioTrack audioTrack, @Nullable C1832d c1832d) {
            audioTrack.setPreferredDevice(c1832d == null ? null : c1832d.f7144a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    @RequiresApi(31)
    public static final class C1831c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9547a(AudioTrack audioTrack, bf80 bf80Var) {
            LogSessionId logSessionIdM103880a = bf80Var.m103880a();
            if (logSessionIdM103880a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdM103880a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$d */
    @RequiresApi(23)
    public static final class C1832d {

        /* JADX INFO: renamed from: a */
        public final AudioDeviceInfo f7144a;

        public C1832d(AudioDeviceInfo audioDeviceInfo) {
            this.f7144a = audioDeviceInfo;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$e */
    public interface InterfaceC1833e {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC1833e f7145a = new C1847g.a().m9676g();

        /* JADX INFO: renamed from: a */
        int mo9548a(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$g */
    public static final class C1835g {

        /* JADX INFO: renamed from: a */
        public final C1894k f7154a;

        /* JADX INFO: renamed from: b */
        public final int f7155b;

        /* JADX INFO: renamed from: c */
        public final int f7156c;

        /* JADX INFO: renamed from: d */
        public final int f7157d;

        /* JADX INFO: renamed from: e */
        public final int f7158e;

        /* JADX INFO: renamed from: f */
        public final int f7159f;

        /* JADX INFO: renamed from: g */
        public final int f7160g;

        /* JADX INFO: renamed from: h */
        public final int f7161h;

        /* JADX INFO: renamed from: i */
        public final C1842b f7162i;

        /* JADX INFO: renamed from: j */
        public final boolean f7163j;

        public C1835g(C1894k c1894k, int i, int i2, int i3, int i4, int i5, int i6, int i7, C1842b c1842b, boolean z) {
            this.f7154a = c1894k;
            this.f7155b = i;
            this.f7156c = i2;
            this.f7157d = i3;
            this.f7158e = i4;
            this.f7159f = i5;
            this.f7160g = i6;
            this.f7161h = i7;
            this.f7162i = c1842b;
            this.f7163j = z;
        }

        @RequiresApi(21)
        /* JADX INFO: renamed from: i */
        public static AudioAttributes m9559i(C1841a c1841a, boolean z) {
            return z ? m9560j() : c1841a.m9586b().f7192a;
        }

        @RequiresApi(21)
        /* JADX INFO: renamed from: j */
        public static AudioAttributes m9560j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* JADX INFO: renamed from: a */
        public AudioTrack m9561a(boolean z, C1841a c1841a, int i) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackM9564d = m9564d(z, c1841a, i);
                int state = audioTrackM9564d.getState();
                if (state == 1) {
                    return audioTrackM9564d;
                }
                try {
                    audioTrackM9564d.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f7158e, this.f7159f, this.f7161h, this.f7154a, m9570l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.f7158e, this.f7159f, this.f7161h, this.f7154a, m9570l(), e);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m9562b(C1835g c1835g) {
            return c1835g.f7156c == this.f7156c && c1835g.f7160g == this.f7160g && c1835g.f7158e == this.f7158e && c1835g.f7159f == this.f7159f && c1835g.f7157d == this.f7157d && c1835g.f7163j == this.f7163j;
        }

        /* JADX INFO: renamed from: c */
        public C1835g m9563c(int i) {
            return new C1835g(this.f7154a, this.f7155b, this.f7156c, this.f7157d, this.f7158e, this.f7159f, this.f7160g, i, this.f7162i, this.f7163j);
        }

        /* JADX INFO: renamed from: d */
        public final AudioTrack m9564d(boolean z, C1841a c1841a, int i) {
            int i2 = bmk0.f77313a;
            if (i2 >= 29) {
                return m9566f(z, c1841a, i);
            }
            return i2 >= 21 ? m9565e(z, c1841a, i) : m9567g(c1841a, i);
        }

        @RequiresApi(21)
        /* JADX INFO: renamed from: e */
        public final AudioTrack m9565e(boolean z, C1841a c1841a, int i) {
            return new AudioTrack(m9559i(c1841a, z), DefaultAudioSink.m9501F(this.f7158e, this.f7159f, this.f7160g), this.f7161h, 1, i);
        }

        @RequiresApi(29)
        /* JADX INFO: renamed from: f */
        public final AudioTrack m9566f(boolean z, C1841a c1841a, int i) {
            return new AudioTrack.Builder().setAudioAttributes(m9559i(c1841a, z)).setAudioFormat(DefaultAudioSink.m9501F(this.f7158e, this.f7159f, this.f7160g)).setTransferMode(1).setBufferSizeInBytes(this.f7161h).setSessionId(i).setOffloadedPlayback(this.f7156c == 1).build();
        }

        /* JADX INFO: renamed from: g */
        public final AudioTrack m9567g(C1841a c1841a, int i) {
            int iM105145j0 = bmk0.m105145j0(c1841a.f7188c);
            return i == 0 ? new AudioTrack(iM105145j0, this.f7158e, this.f7159f, this.f7160g, this.f7161h, 1) : new AudioTrack(iM105145j0, this.f7158e, this.f7159f, this.f7160g, this.f7161h, 1, i);
        }

        /* JADX INFO: renamed from: h */
        public long m9568h(long j) {
            return bmk0.m105108V0(j, this.f7158e);
        }

        /* JADX INFO: renamed from: k */
        public long m9569k(long j) {
            return bmk0.m105108V0(j, this.f7154a.f7799z);
        }

        /* JADX INFO: renamed from: l */
        public boolean m9570l() {
            return this.f7156c == 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$i */
    public static final class C1837i {

        /* JADX INFO: renamed from: a */
        public final C1953s f7167a;

        /* JADX INFO: renamed from: b */
        public final long f7168b;

        /* JADX INFO: renamed from: c */
        public final long f7169c;

        public C1837i(C1953s c1953s, long j, long j2) {
            this.f7167a = c1953s;
            this.f7168b = j;
            this.f7169c = j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$j */
    public static final class C1838j<T extends Exception> {

        /* JADX INFO: renamed from: a */
        public final long f7170a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public T f7171b;

        /* JADX INFO: renamed from: c */
        public long f7172c;

        public C1838j(long j) {
            this.f7170a = j;
        }

        /* JADX INFO: renamed from: a */
        public void m9576a() {
            this.f7171b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        /* JADX INFO: renamed from: b */
        public void m9577b(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7171b == null) {
                this.f7171b = t;
                this.f7172c = this.f7170a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f7172c) {
                T t2 = this.f7171b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f7171b;
                m9576a();
                throw t3;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$k */
    public final class C1839k implements C1844d.a {
        public C1839k() {
        }

        @Override // com.google.android.exoplayer2.audio.C1844d.a
        /* JADX INFO: renamed from: a */
        public void mo9578a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.m9524J() + ", " + DefaultAudioSink.this.m9525K();
            if (DefaultAudioSink.f7081h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            kyv.m152151i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.C1844d.a
        /* JADX INFO: renamed from: b */
        public void mo9579b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.m9524J() + ", " + DefaultAudioSink.this.m9525K();
            if (DefaultAudioSink.f7081h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            kyv.m152151i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.C1844d.a
        /* JADX INFO: renamed from: c */
        public void mo9580c(long j) {
            if (DefaultAudioSink.this.f7136s != null) {
                DefaultAudioSink.this.f7136s.mo9495c(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.C1844d.a
        /* JADX INFO: renamed from: d */
        public void mo9581d(int i, long j) {
            if (DefaultAudioSink.this.f7136s != null) {
                DefaultAudioSink.this.f7136s.mo9496d(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f7118d0);
            }
        }

        @Override // com.google.android.exoplayer2.audio.C1844d.a
        /* JADX INFO: renamed from: e */
        public void mo9582e(long j) {
            kyv.m152151i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$l */
    @RequiresApi(29)
    public final class C1840l {

        /* JADX INFO: renamed from: a */
        public final Handler f7174a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b */
        public final AudioTrack$StreamEventCallback f7175b;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$l$a */
        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultAudioSink f7177a;

            public a(DefaultAudioSink defaultAudioSink) {
                this.f7177a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(DefaultAudioSink.this.f7140w) && DefaultAudioSink.this.f7136s != null && DefaultAudioSink.this.f7107W) {
                    DefaultAudioSink.this.f7136s.mo9500h();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f7140w) && DefaultAudioSink.this.f7136s != null && DefaultAudioSink.this.f7107W) {
                    DefaultAudioSink.this.f7136s.mo9500h();
                }
            }
        }

        public C1840l() {
            this.f7175b = new a(DefaultAudioSink.this);
        }

        /* JADX INFO: renamed from: a */
        public void m9583a(AudioTrack audioTrack) {
            Handler handler = this.f7174a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new mmd(handler), this.f7175b);
        }

        /* JADX INFO: renamed from: b */
        public void m9584b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f7175b);
            this.f7174a.removeCallbacksAndMessages(null);
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    public DefaultAudioSink(C1834f c1834f) {
        Context context = c1834f.f7146a;
        this.f7111a = context;
        this.f7141x = context != null ? ha1.m134106c(context) : c1834f.f7147b;
        this.f7113b = c1834f.f7148c;
        int i = bmk0.f77313a;
        this.f7115c = i >= 21 && c1834f.f7149d;
        this.f7128k = i >= 23 && c1834f.f7150e;
        this.f7129l = i >= 29 ? c1834f.f7151f : 0;
        this.f7133p = c1834f.f7152g;
        wt5 wt5Var = new wt5(qa5.f156345a);
        this.f7125h = wt5Var;
        wt5Var.m207821e();
        this.f7126i = new C1844d(new C1839k());
        C1846f c1846f = new C1846f();
        this.f7117d = c1846f;
        C1853m c1853m = new C1853m();
        this.f7119e = c1853m;
        this.f7121f = ImmutableList.m15742of((C1853m) new C1852l(), (C1853m) c1846f, c1853m);
        this.f7123g = ImmutableList.m15740of(new C1851k());
        this.f7099O = 1.0f;
        this.f7143z = C1841a.f7179g;
        this.f7109Y = 0;
        this.f7110Z = new wj1(0, 0.0f);
        C1953s c1953s = C1953s.f8284d;
        this.f7086B = new C1837i(c1953s, 0L, 0L);
        this.f7087C = c1953s;
        this.f7088D = false;
        this.f7127j = new ArrayDeque<>();
        this.f7131n = new C1838j<>(100L);
        this.f7132o = new C1838j<>(100L);
        this.f7134q = c1834f.f7153h;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: F */
    public static AudioFormat m9501F(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX INFO: renamed from: G */
    public static int m9502G(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        w11.m204371g(minBufferSize != -2);
        return minBufferSize;
    }

    /* JADX INFO: renamed from: H */
    public static int m9503H(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C21775z8.m218931e(byteBuffer);
            case 7:
            case 8:
                return ofe.m167445e(byteBuffer);
            case 9:
                int iM138913m = i710.m138913m(bmk0.m105083J(byteBuffer, byteBuffer.position()));
                if (iM138913m != -1) {
                    return iM138913m;
                }
                fig0.m125680a();
                return 0;
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                o4c.m165980a("Unexpected audio encoding: ", i);
                return 0;
            case 14:
                int iM218928b = C21775z8.m218928b(byteBuffer);
                if (iM218928b == -1) {
                    return 0;
                }
                return C21775z8.m218935i(byteBuffer, iM218928b) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C16484d9.m114990c(byteBuffer);
            case 20:
                return w560.m204965g(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: M */
    public static boolean m9504M(int i) {
        return (bmk0.f77313a >= 24 && i == -6) || i == -32;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m9505O(AudioTrack audioTrack) {
        return bmk0.f77313a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: U */
    public static void m9506U(final AudioTrack audioTrack, final wt5 wt5Var) {
        wt5Var.m207819c();
        synchronized (f7082i0) {
            try {
                if (f7083j0 == null) {
                    f7083j0 = bmk0.m105086K0("ExoPlayer:AudioTrackReleaseThread");
                }
                f7084k0++;
                f7083j0.execute(new Runnable() { // from class: l.gmd
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.m9510q(audioTrack, wt5Var);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: Z */
    public static void m9507Z(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m9508a0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: h0 */
    public static int m9509h0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m9510q(AudioTrack audioTrack, wt5 wt5Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            wt5Var.m207821e();
            synchronized (f7082i0) {
                try {
                    int i = f7084k0 - 1;
                    f7084k0 = i;
                    if (i == 0) {
                        f7083j0.shutdown();
                        f7083j0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            wt5Var.m207821e();
            synchronized (f7082i0) {
                try {
                    int i2 = f7084k0 - 1;
                    f7084k0 = i2;
                    if (i2 == 0) {
                        f7083j0.shutdown();
                        f7083j0 = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m9518A(long j) {
        return j + this.f7138u.m9568h(this.f7113b.mo9573c());
    }

    /* JADX INFO: renamed from: B */
    public final AudioTrack m9519B(C1835g c1835g) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackM9561a = c1835g.m9561a(this.f7114b0, this.f7143z, this.f7109Y);
            ExoPlayer.InterfaceC1813b interfaceC1813b = this.f7134q;
            if (interfaceC1813b == null) {
                return audioTrackM9561a;
            }
            interfaceC1813b.m9410E(m9505O(audioTrackM9561a));
            return audioTrackM9561a;
        } catch (AudioSink.InitializationException e) {
            AudioSink.InterfaceC1828a interfaceC1828a = this.f7136s;
            if (interfaceC1828a != null) {
                interfaceC1828a.mo9494b(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: C */
    public final AudioTrack m9520C() throws AudioSink.InitializationException {
        try {
            return m9519B((C1835g) w11.m204369e(this.f7138u));
        } catch (AudioSink.InitializationException e) {
            C1835g c1835g = this.f7138u;
            if (c1835g.f7161h > 1000000) {
                C1835g c1835gM9563c = c1835g.m9563c(PlaybackException.CUSTOM_ERROR_CODE_BASE);
                try {
                    AudioTrack audioTrackM9519B = m9519B(c1835gM9563c);
                    this.f7138u = c1835gM9563c;
                    return audioTrackM9519B;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    m9528P();
                    throw e;
                }
            }
            m9528P();
            throw e;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9521D() throws Exception {
        ByteBuffer byteBuffer;
        if (this.f7139v.m9600f()) {
            this.f7139v.m9602h();
            m9531S(Long.MIN_VALUE);
            return this.f7139v.m9599e() && ((byteBuffer = this.f7102R) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.f7102R;
        if (byteBuffer2 == null) {
            return true;
        }
        m9542g0(byteBuffer2, Long.MIN_VALUE);
        return this.f7102R == null;
    }

    /* JADX INFO: renamed from: E */
    public final ha1 m9522E() {
        if (this.f7142y == null && this.f7111a != null) {
            this.f7124g0 = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(this.f7111a, new AudioCapabilitiesReceiver.InterfaceC1826e() { // from class: l.fmd
                @Override // com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.InterfaceC1826e
                /* JADX INFO: renamed from: a */
                public final void mo9470a(ha1 ha1Var) {
                    this.f99765a.m9529Q(ha1Var);
                }
            });
            this.f7142y = audioCapabilitiesReceiver;
            this.f7141x = audioCapabilitiesReceiver.m9464d();
        }
        return this.f7141x;
    }

    @RequiresApi(29)
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: I */
    public final int m9523I(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = bmk0.f77313a;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i == 30 && bmk0.f77316d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final long m9524J() {
        C1835g c1835g = this.f7138u;
        return c1835g.f7156c == 0 ? this.f7091G / ((long) c1835g.f7155b) : this.f7092H;
    }

    /* JADX INFO: renamed from: K */
    public final long m9525K() {
        C1835g c1835g = this.f7138u;
        return c1835g.f7156c == 0 ? this.f7093I / ((long) c1835g.f7157d) : this.f7094J;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m9526L() throws AudioSink.InitializationException {
        bf80 bf80Var;
        if (!this.f7125h.m207820d()) {
            return false;
        }
        AudioTrack audioTrackM9520C = m9520C();
        this.f7140w = audioTrackM9520C;
        if (m9505O(audioTrackM9520C)) {
            m9532T(this.f7140w);
            if (this.f7129l != 3) {
                AudioTrack audioTrack = this.f7140w;
                C1894k c1894k = this.f7138u.f7154a;
                audioTrack.setOffloadDelayPadding(c1894k.f7767B, c1894k.f7768C);
            }
        }
        int i = bmk0.f77313a;
        if (i >= 31 && (bf80Var = this.f7135r) != null) {
            C1831c.m9547a(this.f7140w, bf80Var);
        }
        this.f7109Y = this.f7140w.getAudioSessionId();
        C1844d c1844d = this.f7126i;
        AudioTrack audioTrack2 = this.f7140w;
        C1835g c1835g = this.f7138u;
        c1844d.m9653r(audioTrack2, c1835g.f7156c == 2, c1835g.f7160g, c1835g.f7157d, c1835g.f7161h);
        m9536Y();
        int i2 = this.f7110Z.f189407a;
        if (i2 != 0) {
            this.f7140w.attachAuxEffect(i2);
            this.f7140w.setAuxEffectSendLevel(this.f7110Z.f189408b);
        }
        C1832d c1832d = this.f7112a0;
        if (c1832d != null && i >= 23) {
            C1830b.m9546a(this.f7140w, c1832d);
        }
        this.f7097M = true;
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9527N() {
        return this.f7140w != null;
    }

    /* JADX INFO: renamed from: P */
    public final void m9528P() {
        if (this.f7138u.m9570l()) {
            this.f7120e0 = true;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m9529Q(ha1 ha1Var) {
        w11.m204371g(this.f7124g0 == Looper.myLooper());
        if (ha1Var.equals(m9522E())) {
            return;
        }
        this.f7141x = ha1Var;
        AudioSink.InterfaceC1828a interfaceC1828a = this.f7136s;
        if (interfaceC1828a != null) {
            interfaceC1828a.mo9497e();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m9530R() {
        if (this.f7106V) {
            return;
        }
        this.f7106V = true;
        this.f7126i.m9642f(m9525K());
        this.f7140w.stop();
        this.f7090F = 0;
    }

    /* JADX INFO: renamed from: S */
    public final void m9531S(long j) throws Exception {
        ByteBuffer byteBufferM9598d;
        if (!this.f7139v.m9600f()) {
            ByteBuffer byteBuffer = this.f7100P;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.f7075a;
            }
            m9542g0(byteBuffer, j);
            return;
        }
        while (!this.f7139v.m9599e()) {
            do {
                byteBufferM9598d = this.f7139v.m9598d();
                if (byteBufferM9598d.hasRemaining()) {
                    m9542g0(byteBufferM9598d, j);
                } else {
                    ByteBuffer byteBuffer2 = this.f7100P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f7139v.m9603i(this.f7100P);
                    }
                }
            } while (!byteBufferM9598d.hasRemaining());
            return;
        }
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: T */
    public final void m9532T(AudioTrack audioTrack) {
        if (this.f7130m == null) {
            this.f7130m = new C1840l();
        }
        this.f7130m.m9583a(audioTrack);
    }

    /* JADX INFO: renamed from: V */
    public final void m9533V() {
        this.f7091G = 0L;
        this.f7092H = 0L;
        this.f7093I = 0L;
        this.f7094J = 0L;
        this.f7122f0 = false;
        this.f7095K = 0;
        this.f7086B = new C1837i(this.f7087C, 0L, 0L);
        this.f7098N = 0L;
        this.f7085A = null;
        this.f7127j.clear();
        this.f7100P = null;
        this.f7101Q = 0;
        this.f7102R = null;
        this.f7106V = false;
        this.f7105U = false;
        this.f7089E = null;
        this.f7090F = 0;
        this.f7119e.m9733i();
        m9537b0();
    }

    /* JADX INFO: renamed from: W */
    public final void m9534W(C1953s c1953s) {
        C1837i c1837i = new C1837i(c1953s, -9223372036854775807L, -9223372036854775807L);
        if (m9527N()) {
            this.f7085A = c1837i;
        } else {
            this.f7086B = c1837i;
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: X */
    public final void m9535X() {
        if (m9527N()) {
            try {
                this.f7140w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f7087C.f8288a).setPitch(this.f7087C.f8289b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                kyv.m152152j("DefaultAudioSink", "Failed to set playback params", e);
            }
            C1953s c1953s = new C1953s(this.f7140w.getPlaybackParams().getSpeed(), this.f7140w.getPlaybackParams().getPitch());
            this.f7087C = c1953s;
            this.f7126i.m9654s(c1953s.f8288a);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m9536Y() {
        if (m9527N()) {
            int i = bmk0.f77313a;
            AudioTrack audioTrack = this.f7140w;
            if (i >= 21) {
                m9507Z(audioTrack, this.f7099O);
            } else {
                m9508a0(audioTrack, this.f7099O);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: a */
    public boolean mo9477a(C1894k c1894k) {
        return mo9486j(c1894k) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: b */
    public void mo9478b() {
        if (this.f7114b0) {
            this.f7114b0 = false;
            flush();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m9537b0() {
        C1842b c1842b = this.f7138u.f7162i;
        this.f7139v = c1842b;
        c1842b.m9596b();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: c */
    public boolean mo9479c() {
        if (m9527N()) {
            return this.f7105U && !mo9483g();
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m9538c0() {
        if (this.f7114b0) {
            return false;
        }
        C1835g c1835g = this.f7138u;
        return c1835g.f7156c == 0 && !m9539d0(c1835g.f7154a.f7766A);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: d */
    public void mo9480d(C1841a c1841a) {
        if (this.f7143z.equals(c1841a)) {
            return;
        }
        this.f7143z = c1841a;
        if (this.f7114b0) {
            return;
        }
        flush();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m9539d0(int i) {
        return this.f7115c && bmk0.m105068B0(i);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: e */
    public void mo9481e() {
        if (bmk0.f77313a < 25) {
            flush();
            return;
        }
        this.f7132o.m9576a();
        this.f7131n.m9576a();
        if (m9527N()) {
            m9533V();
            if (this.f7126i.m9644h()) {
                this.f7140w.pause();
            }
            this.f7140w.flush();
            this.f7126i.m9651p();
            C1844d c1844d = this.f7126i;
            AudioTrack audioTrack = this.f7140w;
            C1835g c1835g = this.f7138u;
            c1844d.m9653r(audioTrack, c1835g.f7156c == 2, c1835g.f7160g, c1835g.f7157d, c1835g.f7161h);
            this.f7097M = true;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m9540e0() {
        C1835g c1835g = this.f7138u;
        return c1835g != null && c1835g.f7163j && bmk0.f77313a >= 23;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: f */
    public void mo9482f() {
        w11.m204371g(bmk0.f77313a >= 21);
        w11.m204371g(this.f7108X);
        if (this.f7114b0) {
            return;
        }
        this.f7114b0 = true;
        flush();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m9541f0(C1894k c1894k, C1841a c1841a) {
        int iM149005f;
        int iM105079H;
        int iM9523I;
        if (bmk0.f77313a < 29 || this.f7129l == 0 || (iM149005f = kb00.m149005f((String) w11.m204369e(c1894k.f7785l), c1894k.f7782i)) == 0 || (iM105079H = bmk0.m105079H(c1894k.f7798y)) == 0 || (iM9523I = m9523I(m9501F(c1894k.f7799z, iM105079H, iM149005f), c1841a.m9586b().f7192a)) == 0) {
            return false;
        }
        if (iM9523I == 1) {
            return ((c1894k.f7767B != 0 || c1894k.f7768C != 0) && (this.f7129l == 1)) ? false : true;
        }
        if (iM9523I == 2) {
            return true;
        }
        wpg0.m207458a();
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (m9527N()) {
            m9533V();
            if (this.f7126i.m9644h()) {
                this.f7140w.pause();
            }
            if (m9505O(this.f7140w)) {
                ((C1840l) w11.m204369e(this.f7130m)).m9584b(this.f7140w);
            }
            if (bmk0.f77313a < 21 && !this.f7108X) {
                this.f7109Y = 0;
            }
            C1835g c1835g = this.f7137t;
            if (c1835g != null) {
                this.f7138u = c1835g;
                this.f7137t = null;
            }
            this.f7126i.m9651p();
            m9506U(this.f7140w, this.f7125h);
            this.f7140w = null;
        }
        this.f7132o.m9576a();
        this.f7131n.m9576a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: g */
    public boolean mo9483g() {
        return m9527N() && this.f7126i.m9643g(m9525K());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m9542g0(ByteBuffer byteBuffer, long j) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iM9509h0;
        AudioSink.InterfaceC1828a interfaceC1828a;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.f7102R;
            if (byteBuffer3 != null) {
                w11.m204365a(byteBuffer3 == byteBuffer);
            } else {
                this.f7102R = byteBuffer;
                if (bmk0.f77313a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f7103S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f7103S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f7103S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f7104T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (bmk0.f77313a < 21) {
                int iM9638b = this.f7126i.m9638b(this.f7093I);
                if (iM9638b > 0) {
                    iM9509h0 = this.f7140w.write(this.f7103S, this.f7104T, Math.min(iRemaining2, iM9638b));
                    if (iM9509h0 > 0) {
                        this.f7104T += iM9509h0;
                        byteBuffer.position(byteBuffer.position() + iM9509h0);
                    }
                } else {
                    iM9509h0 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.f7114b0) {
                w11.m204371g(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f7116c0;
                } else {
                    this.f7116c0 = j;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iM9509h0 = defaultAudioSink.m9543i0(this.f7140w, byteBuffer2, iRemaining2, j);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iM9509h0 = m9509h0(defaultAudioSink.f7140w, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.f7118d0 = SystemClock.elapsedRealtime();
            if (iM9509h0 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iM9509h0, defaultAudioSink.f7138u.f7154a, m9504M(iM9509h0) && defaultAudioSink.f7094J > 0);
                AudioSink.InterfaceC1828a interfaceC1828a2 = defaultAudioSink.f7136s;
                if (interfaceC1828a2 != null) {
                    interfaceC1828a2.mo9494b(writeException);
                }
                if (writeException.isRecoverable) {
                    defaultAudioSink.f7141x = ha1.f108456c;
                    throw writeException;
                }
                defaultAudioSink.f7132o.m9577b(writeException);
                return;
            }
            defaultAudioSink.f7132o.m9576a();
            if (m9505O(defaultAudioSink.f7140w)) {
                if (defaultAudioSink.f7094J > 0) {
                    defaultAudioSink.f7122f0 = false;
                }
                if (defaultAudioSink.f7107W && (interfaceC1828a = defaultAudioSink.f7136s) != null && iM9509h0 < iRemaining2 && !defaultAudioSink.f7122f0) {
                    interfaceC1828a.mo9498f();
                }
            }
            int i = defaultAudioSink.f7138u.f7156c;
            if (i == 0) {
                defaultAudioSink.f7093I += (long) iM9509h0;
            }
            if (iM9509h0 == iRemaining2) {
                if (i != 0) {
                    w11.m204371g(byteBuffer2 == defaultAudioSink.f7100P);
                    defaultAudioSink.f7094J += ((long) defaultAudioSink.f7095K) * ((long) defaultAudioSink.f7101Q);
                }
                defaultAudioSink.f7102R = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public C1953s getPlaybackParameters() {
        return this.f7087C;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: h */
    public boolean mo9484h(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.f7100P;
        w11.m204365a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7137t != null) {
            if (!m9521D()) {
                return false;
            }
            if (this.f7137t.m9562b(this.f7138u)) {
                this.f7138u = this.f7137t;
                this.f7137t = null;
                if (m9505O(this.f7140w) && this.f7129l != 3) {
                    if (this.f7140w.getPlayState() == 3) {
                        this.f7140w.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f7140w;
                    C1894k c1894k = this.f7138u.f7154a;
                    audioTrack.setOffloadDelayPadding(c1894k.f7767B, c1894k.f7768C);
                    this.f7122f0 = true;
                }
            } else {
                m9530R();
                if (mo9483g()) {
                    return false;
                }
                flush();
            }
            m9544y(j);
        }
        if (!m9527N()) {
            try {
                if (!m9526L()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.f7131n.m9577b(e);
                return false;
            }
        }
        this.f7131n.m9576a();
        if (this.f7097M) {
            this.f7098N = Math.max(0L, j);
            this.f7096L = false;
            this.f7097M = false;
            if (m9540e0()) {
                m9535X();
            }
            m9544y(j);
            if (this.f7107W) {
                play();
            }
        }
        if (!this.f7126i.m9646j(m9525K())) {
            return false;
        }
        if (this.f7100P == null) {
            w11.m204365a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C1835g c1835g = this.f7138u;
            if (c1835g.f7156c != 0 && this.f7095K == 0) {
                int iM9503H = m9503H(c1835g.f7160g, byteBuffer);
                this.f7095K = iM9503H;
                if (iM9503H == 0) {
                    return true;
                }
            }
            if (this.f7085A != null) {
                if (!m9521D()) {
                    return false;
                }
                m9544y(j);
                this.f7085A = null;
            }
            long jM9569k = this.f7098N + this.f7138u.m9569k(m9524J() - this.f7119e.m9732h());
            if (!this.f7096L && Math.abs(jM9569k - j) > 200000) {
                AudioSink.InterfaceC1828a interfaceC1828a = this.f7136s;
                if (interfaceC1828a != null) {
                    interfaceC1828a.mo9494b(new AudioSink.UnexpectedDiscontinuityException(j, jM9569k));
                }
                this.f7096L = true;
            }
            if (this.f7096L) {
                if (!m9521D()) {
                    return false;
                }
                long j2 = j - jM9569k;
                this.f7098N += j2;
                this.f7096L = false;
                m9544y(j);
                AudioSink.InterfaceC1828a interfaceC1828a2 = this.f7136s;
                if (interfaceC1828a2 != null && j2 != 0) {
                    interfaceC1828a2.mo9499g();
                }
            }
            if (this.f7138u.f7156c == 0) {
                this.f7091G += (long) byteBuffer.remaining();
            } else {
                this.f7092H += ((long) this.f7095K) * ((long) i);
            }
            this.f7100P = byteBuffer;
            this.f7101Q = i;
        }
        m9531S(j);
        if (!this.f7100P.hasRemaining()) {
            this.f7100P = null;
            this.f7101Q = 0;
            return true;
        }
        if (!this.f7126i.m9645i(m9525K())) {
            return false;
        }
        kyv.m152151i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: i */
    public void mo9485i(AudioSink.InterfaceC1828a interfaceC1828a) {
        this.f7136s = interfaceC1828a;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: i0 */
    public final int m9543i0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (bmk0.f77313a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f7089E == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f7089E = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f7089E.putInt(1431633921);
        }
        if (this.f7090F == 0) {
            this.f7089E.putInt(4, i);
            this.f7089E.putLong(8, j * 1000);
            this.f7089E.position(0);
            this.f7090F = i;
        }
        int iRemaining = this.f7089E.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f7089E, iRemaining, 1);
            if (iWrite < 0) {
                this.f7090F = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iM9509h0 = m9509h0(audioTrack, byteBuffer, i);
        if (iM9509h0 < 0) {
            this.f7090F = 0;
            return iM9509h0;
        }
        this.f7090F -= iM9509h0;
        return iM9509h0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: j */
    public int mo9486j(C1894k c1894k) {
        if (!"audio/raw".equals(c1894k.f7785l)) {
            return ((this.f7120e0 || !m9541f0(c1894k, this.f7143z)) && !m9522E().m134112i(c1894k)) ? 0 : 2;
        }
        boolean zM105070C0 = bmk0.m105070C0(c1894k.f7766A);
        int i = c1894k.f7766A;
        if (zM105070C0) {
            return (i == 2 || (this.f7115c && i == 4)) ? 2 : 1;
        }
        kyv.m152151i("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: k */
    public void mo9487k() throws AudioSink.WriteException {
        if (!this.f7105U && m9527N() && m9521D()) {
            m9530R();
            this.f7105U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: l */
    public long mo9488l(boolean z) {
        if (!m9527N() || this.f7097M) {
            return Long.MIN_VALUE;
        }
        return m9518A(m9545z(Math.min(this.f7126i.m9639c(z), this.f7138u.m9568h(m9525K()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: n */
    public void mo9490n() {
        this.f7096L = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: o */
    public void mo9491o(@Nullable bf80 bf80Var) {
        this.f7135r = bf80Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* JADX INFO: renamed from: p */
    public void mo9492p(C1894k c1894k, int i, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        int i2;
        int iIntValue;
        boolean z;
        C1842b c1842b;
        int iM105079H;
        int i3;
        int iM105139h0;
        int iM105139h1;
        int i4;
        int iMo9548a;
        int[] iArr2;
        if ("audio/raw".equals(c1894k.f7785l)) {
            w11.m204365a(bmk0.m105070C0(c1894k.f7766A));
            iM105139h0 = bmk0.m105139h0(c1894k.f7766A, c1894k.f7798y);
            ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
            if (m9539d0(c1894k.f7766A)) {
                c2804a.m15754k(this.f7123g);
            } else {
                c2804a.m15754k(this.f7121f);
                c2804a.m15753j(this.f7113b.mo9571a());
            }
            C1842b c1842b2 = new C1842b(c2804a.m15756m());
            if (c1842b2.equals(this.f7139v)) {
                c1842b2 = this.f7139v;
            }
            this.f7119e.m9734j(c1894k.f7767B, c1894k.f7768C);
            if (bmk0.f77313a < 21 && c1894k.f7798y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.f7117d.m9663h(iArr2);
            try {
                AudioProcessor.C1827a c1827aM9595a = c1842b2.m9595a(new AudioProcessor.C1827a(c1894k.f7799z, c1894k.f7798y, c1894k.f7766A));
                iIntValue = c1827aM9595a.f7079c;
                i2 = c1827aM9595a.f7077a;
                int iM105079H2 = bmk0.m105079H(c1827aM9595a.f7078b);
                iM105139h1 = bmk0.m105139h0(iIntValue, c1827aM9595a.f7078b);
                z = this.f7128k;
                c1842b = c1842b2;
                iM105079H = iM105079H2;
                i3 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, c1894k);
            }
        } else {
            C1842b c1842b3 = new C1842b(ImmutableList.m15739of());
            i2 = c1894k.f7799z;
            if (m9541f0(c1894k, this.f7143z)) {
                iIntValue = kb00.m149005f((String) w11.m204369e(c1894k.f7785l), c1894k.f7782i);
                c1842b = c1842b3;
                iM105079H = bmk0.m105079H(c1894k.f7798y);
                iM105139h0 = -1;
                iM105139h1 = -1;
                z = true;
                i3 = 1;
            } else {
                Pair<Integer, Integer> pairM134111f = m9522E().m134111f(c1894k);
                if (pairM134111f == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + c1894k, c1894k);
                }
                iIntValue = ((Integer) pairM134111f.first).intValue();
                int iIntValue2 = ((Integer) pairM134111f.second).intValue();
                z = this.f7128k;
                c1842b = c1842b3;
                iM105079H = iIntValue2;
                i3 = 2;
                iM105139h0 = -1;
                iM105139h1 = -1;
            }
        }
        int i6 = iIntValue;
        if (i6 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i3 + ") for: " + c1894k, c1894k);
        }
        if (iM105079H == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i3 + ") for: " + c1894k, c1894k);
        }
        if (i != 0) {
            i4 = i2;
            iMo9548a = i;
        } else {
            i4 = i2;
            iMo9548a = this.f7133p.mo9548a(m9502G(i2, iM105079H, i6), i6, i3, iM105139h1 != -1 ? iM105139h1 : 1, i4, c1894k.f7781h, z ? 8.0d : 1.0d);
        }
        this.f7120e0 = false;
        C1835g c1835g = new C1835g(c1894k, iM105139h0, i3, iM105139h1, i4, iM105079H, i6, iMo9548a, c1842b, z);
        if (m9527N()) {
            this.f7137t = c1835g;
        } else {
            this.f7138u = c1835g;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.f7107W = false;
        if (m9527N() && this.f7126i.m9650o()) {
            this.f7140w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.f7107W = true;
        if (m9527N()) {
            this.f7126i.m9655t();
            this.f7140w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f7142y;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.m9465e();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        gyj0<AudioProcessor> it = this.f7121f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        gyj0<AudioProcessor> it2 = this.f7123g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        C1842b c1842b = this.f7139v;
        if (c1842b != null) {
            c1842b.m9604j();
        }
        this.f7107W = false;
        this.f7120e0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.f7109Y != i) {
            this.f7109Y = i;
            this.f7108X = i != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(wj1 wj1Var) {
        if (this.f7110Z.equals(wj1Var)) {
            return;
        }
        int i = wj1Var.f189407a;
        float f = wj1Var.f189408b;
        AudioTrack audioTrack = this.f7140w;
        if (audioTrack != null) {
            if (this.f7110Z.f189407a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f7140w.setAuxEffectSendLevel(f);
            }
        }
        this.f7110Z = wj1Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(C1953s c1953s) {
        this.f7087C = new C1953s(bmk0.m105160p(c1953s.f8288a, 0.1f, 8.0f), bmk0.m105160p(c1953s.f8289b, 0.1f, 8.0f));
        if (m9540e0()) {
            m9535X();
        } else {
            m9534W(c1953s);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        C1832d c1832d = audioDeviceInfo == null ? null : new C1832d(audioDeviceInfo);
        this.f7112a0 = c1832d;
        AudioTrack audioTrack = this.f7140w;
        if (audioTrack != null) {
            C1830b.m9546a(audioTrack, c1832d);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.f7088D = z;
        m9534W(m9540e0() ? C1953s.f8284d : this.f7087C);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f) {
        if (this.f7099O != f) {
            this.f7099O = f;
            m9536Y();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9544y(long j) {
        C1953s c1953sMo9572b;
        if (m9540e0()) {
            c1953sMo9572b = C1953s.f8284d;
        } else {
            c1953sMo9572b = m9538c0() ? this.f7113b.mo9572b(this.f7087C) : C1953s.f8284d;
            this.f7087C = c1953sMo9572b;
        }
        C1953s c1953s = c1953sMo9572b;
        this.f7088D = m9538c0() ? this.f7113b.mo9575e(this.f7088D) : false;
        this.f7127j.add(new C1837i(c1953s, Math.max(0L, j), this.f7138u.m9568h(m9525K())));
        m9537b0();
        AudioSink.InterfaceC1828a interfaceC1828a = this.f7136s;
        if (interfaceC1828a != null) {
            interfaceC1828a.mo9493a(this.f7088D);
        }
    }

    /* JADX INFO: renamed from: z */
    public final long m9545z(long j) {
        while (!this.f7127j.isEmpty() && j >= this.f7127j.getFirst().f7169c) {
            this.f7086B = this.f7127j.remove();
        }
        C1837i c1837i = this.f7086B;
        long j2 = j - c1837i.f7169c;
        if (c1837i.f7167a.equals(C1953s.f8284d)) {
            return this.f7086B.f7168b + j2;
        }
        if (this.f7127j.isEmpty()) {
            return this.f7086B.f7168b + this.f7113b.mo9574d(j2);
        }
        C1837i first = this.f7127j.getFirst();
        return first.f7168b - bmk0.m105127d0(first.f7169c - j, this.f7086B.f7167a.f8288a);
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$f */
    public static final class C1834f {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Context f7146a;

        /* JADX INFO: renamed from: b */
        public ha1 f7147b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public cc1 f7148c;

        /* JADX INFO: renamed from: d */
        public boolean f7149d;

        /* JADX INFO: renamed from: e */
        public boolean f7150e;

        /* JADX INFO: renamed from: f */
        public int f7151f;

        /* JADX INFO: renamed from: g */
        public InterfaceC1833e f7152g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public ExoPlayer.InterfaceC1813b f7153h;

        @Deprecated
        public C1834f() {
            this.f7146a = null;
            this.f7147b = ha1.f108456c;
            this.f7151f = 0;
            this.f7152g = InterfaceC1833e.f7145a;
        }

        /* JADX INFO: renamed from: g */
        public DefaultAudioSink m9555g() {
            if (this.f7148c == null) {
                this.f7148c = new C1836h(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        /* JADX INFO: renamed from: h */
        public C1834f m9556h(boolean z) {
            this.f7150e = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1834f m9557i(boolean z) {
            this.f7149d = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C1834f m9558j(int i) {
            this.f7151f = i;
            return this;
        }

        public C1834f(Context context) {
            this.f7146a = context;
            this.f7147b = ha1.f108456c;
            this.f7151f = 0;
            this.f7152g = InterfaceC1833e.f7145a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h */
    public static class C1836h implements cc1 {

        /* JADX INFO: renamed from: a */
        public final AudioProcessor[] f7164a;

        /* JADX INFO: renamed from: b */
        public final C1849i f7165b;

        /* JADX INFO: renamed from: c */
        public final C1850j f7166c;

        public C1836h(AudioProcessor[] audioProcessorArr, C1849i c1849i, C1850j c1850j) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f7164a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f7165b = c1849i;
            this.f7166c = c1850j;
            audioProcessorArr2[audioProcessorArr.length] = c1849i;
            audioProcessorArr2[audioProcessorArr.length + 1] = c1850j;
        }

        @Override // p153l.cc1
        /* JADX INFO: renamed from: a */
        public AudioProcessor[] mo9571a() {
            return this.f7164a;
        }

        @Override // p153l.cc1
        /* JADX INFO: renamed from: b */
        public C1953s mo9572b(C1953s c1953s) {
            this.f7166c.m9730d(c1953s.f8288a);
            this.f7166c.m9729b(c1953s.f8289b);
            return c1953s;
        }

        @Override // p153l.cc1
        /* JADX INFO: renamed from: c */
        public long mo9573c() {
            return this.f7165b.m9720p();
        }

        @Override // p153l.cc1
        /* JADX INFO: renamed from: d */
        public long mo9574d(long j) {
            return this.f7166c.m9728a(j);
        }

        @Override // p153l.cc1
        /* JADX INFO: renamed from: e */
        public boolean mo9575e(boolean z) {
            this.f7165b.m9726v(z);
            return z;
        }

        public C1836h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new C1849i(), new C1850j());
        }
    }
}
