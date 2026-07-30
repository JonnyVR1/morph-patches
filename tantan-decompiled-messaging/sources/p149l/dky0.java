package p149l;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzpz;
import com.google.android.gms.internal.ads.zzqa;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class dky0 implements eiy0 {

    /* JADX INFO: renamed from: X */
    public static final Object f86716X = new Object();

    /* JADX INFO: renamed from: Y */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f86717Y;

    /* JADX INFO: renamed from: Z */
    @GuardedBy("releaseExecutorLock")
    public static int f86718Z;

    /* JADX INFO: renamed from: A */
    public long f86719A;

    /* JADX INFO: renamed from: B */
    public int f86720B;

    /* JADX INFO: renamed from: C */
    public boolean f86721C;

    /* JADX INFO: renamed from: D */
    public boolean f86722D;

    /* JADX INFO: renamed from: E */
    public long f86723E;

    /* JADX INFO: renamed from: F */
    public float f86724F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public ByteBuffer f86725G;

    /* JADX INFO: renamed from: H */
    public int f86726H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public ByteBuffer f86727I;

    /* JADX INFO: renamed from: J */
    public boolean f86728J;

    /* JADX INFO: renamed from: K */
    public boolean f86729K;

    /* JADX INFO: renamed from: L */
    public boolean f86730L;

    /* JADX INFO: renamed from: M */
    public int f86731M;

    /* JADX INFO: renamed from: N */
    public tzx0 f86732N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public xiy0 f86733O;

    /* JADX INFO: renamed from: P */
    public long f86734P;

    /* JADX INFO: renamed from: Q */
    public boolean f86735Q;

    /* JADX INFO: renamed from: R */
    public boolean f86736R;

    /* JADX INFO: renamed from: S */
    public long f86737S;

    /* JADX INFO: renamed from: T */
    public long f86738T;

    /* JADX INFO: renamed from: U */
    public Handler f86739U;

    /* JADX INFO: renamed from: V */
    public final bjy0 f86740V;

    /* JADX INFO: renamed from: W */
    public final riy0 f86741W;

    /* JADX INFO: renamed from: a */
    public final oiy0 f86742a;

    /* JADX INFO: renamed from: b */
    public final nky0 f86743b;

    /* JADX INFO: renamed from: c */
    public final zzgaa f86744c;

    /* JADX INFO: renamed from: d */
    public final zzgaa f86745d;

    /* JADX INFO: renamed from: e */
    public final v9v0 f86746e;

    /* JADX INFO: renamed from: f */
    public final miy0 f86747f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f86748g;

    /* JADX INFO: renamed from: h */
    public bky0 f86749h;

    /* JADX INFO: renamed from: i */
    public final ejy0 f86750i;

    /* JADX INFO: renamed from: j */
    public final ejy0 f86751j;

    /* JADX INFO: renamed from: k */
    public final yiy0 f86752k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public pfy0 f86753l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public hhy0 f86754m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public ajy0 f86755n;

    /* JADX INFO: renamed from: o */
    public ajy0 f86756o;

    /* JADX INFO: renamed from: p */
    public agu0 f86757p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public AudioTrack f86758q;

    /* JADX INFO: renamed from: r */
    public tfy0 f86759r;

    /* JADX INFO: renamed from: s */
    public qux0 f86760s = qux0.f156553b;

    /* JADX INFO: renamed from: t */
    @Nullable
    public djy0 f86761t;

    /* JADX INFO: renamed from: u */
    public djy0 f86762u;

    /* JADX INFO: renamed from: v */
    public c5t0 f86763v;

    /* JADX INFO: renamed from: w */
    public boolean f86764w;

    /* JADX INFO: renamed from: x */
    public long f86765x;

    /* JADX INFO: renamed from: y */
    public long f86766y;

    /* JADX INFO: renamed from: z */
    public long f86767z;

    public /* synthetic */ dky0(ziy0 ziy0Var, cky0 cky0Var) {
        this.f86759r = ziy0Var.f203358a;
        this.f86740V = ziy0Var.f203361d;
        int i = ggw0.f102568a;
        this.f86752k = ziy0Var.f203360c;
        riy0 riy0Var = ziy0Var.f203362e;
        riy0Var.getClass();
        this.f86741W = riy0Var;
        v9v0 v9v0Var = new v9v0(g6v0.f101315a);
        this.f86746e = v9v0Var;
        v9v0Var.m197605e();
        this.f86747f = new miy0(new gjy0(this, null));
        oiy0 oiy0Var = new oiy0();
        this.f86742a = oiy0Var;
        nky0 nky0Var = new nky0();
        this.f86743b = nky0Var;
        this.f86744c = zzgaa.zzo(new mou0(), oiy0Var, nky0Var);
        this.f86745d = zzgaa.zzm(new mky0());
        this.f86724F = 1.0f;
        this.f86731M = 0;
        this.f86732N = new tzx0(0, 0.0f);
        c5t0 c5t0Var = c5t0.f79412d;
        this.f86762u = new djy0(c5t0Var, 0L, 0L, null);
        this.f86763v = c5t0Var;
        this.f86764w = false;
        this.f86748g = new ArrayDeque();
        this.f86750i = new ejy0(100L);
        this.f86751j = new ejy0(100L);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m112286M(AudioTrack audioTrack) {
        return ggw0.f102568a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m112292w(dky0 dky0Var) {
        if (dky0Var.f86738T >= 1000000) {
            ((iky0) dky0Var.f86754m).f113754a.f118438m1 = true;
        }
        dky0Var.f86738T = 0L;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m112293x(AudioTrack audioTrack, final hhy0 hhy0Var, Handler handler, final dhy0 dhy0Var, v9v0 v9v0Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (hhy0Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: l.tiy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((iky0) hhy0Var).f113754a.f118427b1.m218728d(dhy0Var);
                    }
                });
            }
            v9v0Var.m197605e();
            synchronized (f86716X) {
                try {
                    int i = f86718Z - 1;
                    f86718Z = i;
                    if (i == 0) {
                        f86717Y.shutdown();
                        f86717Y = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (hhy0Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: l.tiy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((iky0) hhy0Var).f113754a.f118427b1.m218728d(dhy0Var);
                    }
                });
            }
            v9v0Var.m197605e();
            synchronized (f86716X) {
                try {
                    int i2 = f86718Z - 1;
                    f86718Z = i2;
                    if (i2 == 0) {
                        f86717Y.shutdown();
                        f86717Y = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m112295A() {
        ajy0 ajy0Var = this.f86756o;
        if (ajy0Var.f70218c != 0) {
            return this.f86719A;
        }
        long j = this.f86767z;
        long j2 = ajy0Var.f70219d;
        int i = ggw0.f102568a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: B */
    public final AudioTrack m112296B(ajy0 ajy0Var) throws zzpx {
        try {
            return ajy0Var.m97091a(this.f86760s, this.f86731M);
        } catch (zzpx e) {
            hhy0 hhy0Var = this.f86754m;
            if (hhy0Var != null) {
                hhy0Var.mo131195b(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m112297C(long j) {
        c5t0 c5t0Var;
        boolean z;
        if (m112307N()) {
            bjy0 bjy0Var = this.f86740V;
            c5t0Var = this.f86763v;
            bjy0Var.m102246c(c5t0Var);
        } else {
            c5t0Var = c5t0.f79412d;
        }
        c5t0 c5t0Var2 = c5t0Var;
        this.f86763v = c5t0Var2;
        if (m112307N()) {
            bjy0 bjy0Var2 = this.f86740V;
            z = this.f86764w;
            bjy0Var2.m102247d(z);
        } else {
            z = false;
        }
        this.f86764w = z;
        this.f86748g.add(new djy0(c5t0Var2, Math.max(0L, j), ggw0.m126050G(m112295A(), this.f86756o.f70220e), null));
        m112303I();
        hhy0 hhy0Var = this.f86754m;
        if (hhy0Var != null) {
            ((iky0) hhy0Var).f113754a.f118427b1.m218747w(this.f86764w);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m112298D() {
        if (this.f86756o.m97093c()) {
            this.f86735Q = true;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m112299E() {
        if (this.f86729K) {
            return;
        }
        this.f86729K = true;
        this.f86747f.m154770b(m112295A());
        this.f86758q.stop();
    }

    /* JADX INFO: renamed from: F */
    public final void m112300F(long j) throws Exception {
        ByteBuffer byteBufferM96334b;
        if (!this.f86757p.m96340h()) {
            ByteBuffer byteBuffer = this.f86725G;
            if (byteBuffer == null) {
                byteBuffer = qju0.f154991a;
            }
            m112304J(byteBuffer, j);
            return;
        }
        while (!this.f86757p.m96339g()) {
            do {
                byteBufferM96334b = this.f86757p.m96334b();
                if (byteBufferM96334b.hasRemaining()) {
                    m112304J(byteBufferM96334b, j);
                } else {
                    ByteBuffer byteBuffer2 = this.f86725G;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f86757p.m96337e(this.f86725G);
                    }
                }
            } while (!byteBufferM96334b.hasRemaining());
            return;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m112301G(c5t0 c5t0Var) {
        djy0 djy0Var = new djy0(c5t0Var, -9223372036854775807L, -9223372036854775807L, null);
        if (m112306L()) {
            this.f86761t = djy0Var;
        } else {
            this.f86762u = djy0Var;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m112302H() {
        if (m112306L()) {
            int i = ggw0.f102568a;
            this.f86758q.setVolume(this.f86724F);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m112303I() {
        agu0 agu0Var = this.f86756o.f70224i;
        this.f86757p = agu0Var;
        agu0Var.m96335c();
    }

    /* JADX INFO: renamed from: J */
    public final void m112304J(ByteBuffer byteBuffer, long j) throws Exception {
        hhy0 hhy0Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f86727I;
            boolean z = false;
            if (byteBuffer2 != null) {
                f5v0.m119533d(byteBuffer2 == byteBuffer);
            } else {
                this.f86727I = byteBuffer;
                int i = ggw0.f102568a;
            }
            int iRemaining = byteBuffer.remaining();
            int i2 = ggw0.f102568a;
            int iWrite = this.f86758q.write(byteBuffer, iRemaining, 1);
            this.f86734P = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((ggw0.f102568a >= 24 && iWrite == -6) || iWrite == -32) {
                    if (m112295A() > 0) {
                        z = true;
                    } else if (m112286M(this.f86758q)) {
                        m112298D();
                        z = true;
                    }
                }
                zzqa zzqaVar = new zzqa(iWrite, this.f86756o.f70216a, z);
                hhy0 hhy0Var2 = this.f86754m;
                if (hhy0Var2 != null) {
                    hhy0Var2.mo131195b(zzqaVar);
                }
                if (zzqaVar.zzb) {
                    this.f86759r = tfy0.f170032c;
                    throw zzqaVar;
                }
                this.f86751j.m116909b(zzqaVar);
                return;
            }
            this.f86751j.m116908a();
            if (m112286M(this.f86758q)) {
                if (this.f86719A > 0) {
                    this.f86736R = false;
                }
                if (this.f86730L && (hhy0Var = this.f86754m) != null && iWrite < iRemaining) {
                    jky0 jky0Var = ((iky0) hhy0Var).f113754a;
                    if (jky0Var.f118437l1 != null) {
                        jky0Var.f118437l1.zza();
                    }
                }
            }
            int i3 = this.f86756o.f70218c;
            if (i3 == 0) {
                this.f86767z += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i3 != 0) {
                    f5v0.m119535f(byteBuffer == this.f86725G);
                    this.f86719A += ((long) this.f86720B) * ((long) this.f86726H);
                }
                this.f86727I = null;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m112305K() throws Exception {
        if (!this.f86757p.m96340h()) {
            ByteBuffer byteBuffer = this.f86727I;
            if (byteBuffer == null) {
                return true;
            }
            m112304J(byteBuffer, Long.MIN_VALUE);
            return this.f86727I == null;
        }
        this.f86757p.m96336d();
        m112300F(Long.MIN_VALUE);
        if (!this.f86757p.m96339g()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f86727I;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m112306L() {
        return this.f86758q != null;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m112307N() {
        ajy0 ajy0Var = this.f86756o;
        if (ajy0Var.f70218c != 0) {
            return false;
        }
        int i = ajy0Var.f70216a.f133874A;
        return true;
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: a */
    public final int mo112308a(mhr0 mhr0Var) {
        if (!"audio/raw".equals(mhr0Var.f133892l)) {
            return this.f86759r.m188754a(mhr0Var, this.f86760s) != null ? 2 : 0;
        }
        boolean zM126066h = ggw0.m126066h(mhr0Var.f133874A);
        int i = mhr0Var.f133874A;
        if (zM126066h) {
            return i != 2 ? 1 : 2;
        }
        svv0.m186111f("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: b */
    public final zfy0 mo112309b(mhr0 mhr0Var) {
        return this.f86735Q ? zfy0.f202996d : this.f86741W.m179539a(mhr0Var, this.f86760s);
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: c */
    public final boolean mo112310c(mhr0 mhr0Var) {
        return mo112308a(mhr0Var) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d3 A[RETURN] */
    @Override // p149l.eiy0
    /* JADX INFO: renamed from: d */
    public final boolean mo112311d(ByteBuffer byteBuffer, long j, int i) throws Exception {
        AudioTrack audioTrackM112296B;
        pfy0 pfy0Var;
        boolean z;
        int iM217054a;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        ByteBuffer byteBuffer2 = this.f86725G;
        f5v0.m119533d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f86755n != null) {
            if (!m112305K()) {
                return false;
            }
            ajy0 ajy0Var = this.f86755n;
            ajy0 ajy0Var2 = this.f86756o;
            if (ajy0Var2.f70218c == ajy0Var.f70218c && ajy0Var2.f70222g == ajy0Var.f70222g && ajy0Var2.f70220e == ajy0Var.f70220e && ajy0Var2.f70221f == ajy0Var.f70221f && ajy0Var2.f70219d == ajy0Var.f70219d) {
                this.f86756o = ajy0Var;
                this.f86755n = null;
                AudioTrack audioTrack = this.f86758q;
                if (audioTrack != null && m112286M(audioTrack)) {
                    boolean z2 = this.f86756o.f70226k;
                }
            } else {
                m112299E();
                if (mo112314g()) {
                    return false;
                }
                zzf();
            }
            m112297C(j);
        }
        if (!m112306L()) {
            try {
                if (!this.f86746e.m197604d()) {
                    return false;
                }
                try {
                    ajy0 ajy0Var3 = this.f86756o;
                    if (ajy0Var3 == null) {
                        throw null;
                    }
                    audioTrackM112296B = m112296B(ajy0Var3);
                    this.f86758q = audioTrackM112296B;
                    if (m112286M(audioTrackM112296B)) {
                        AudioTrack audioTrack2 = this.f86758q;
                        if (this.f86749h == null) {
                            this.f86749h = new bky0(this);
                        }
                        this.f86749h.m102505a(audioTrack2);
                        boolean z3 = this.f86756o.f70226k;
                    }
                    int i6 = ggw0.f102568a;
                    if (i6 >= 31 && (pfy0Var = this.f86753l) != null) {
                        wiy0.m203359a(this.f86758q, pfy0Var);
                    }
                    this.f86731M = this.f86758q.getAudioSessionId();
                    miy0 miy0Var = this.f86747f;
                    AudioTrack audioTrack3 = this.f86758q;
                    ajy0 ajy0Var4 = this.f86756o;
                    miy0Var.m154772d(audioTrack3, ajy0Var4.f70218c == 2, ajy0Var4.f70222g, ajy0Var4.f70219d, ajy0Var4.f70223h);
                    m112302H();
                    int i7 = this.f86732N.f172769a;
                    xiy0 xiy0Var = this.f86733O;
                    if (xiy0Var != null && i6 >= 23) {
                        viy0.m198613a(this.f86758q, xiy0Var);
                    }
                    this.f86722D = true;
                    hhy0 hhy0Var = this.f86754m;
                    if (hhy0Var != null) {
                        ((iky0) hhy0Var).f113754a.f118427b1.m218727c(this.f86756o.m97092b());
                    }
                } catch (zzpx e) {
                    ajy0 ajy0Var5 = this.f86756o;
                    if (ajy0Var5.f70223h > 1000000) {
                        ajy0 ajy0Var6 = new ajy0(ajy0Var5.f70216a, ajy0Var5.f70217b, ajy0Var5.f70218c, ajy0Var5.f70219d, ajy0Var5.f70220e, ajy0Var5.f70221f, ajy0Var5.f70222g, PlaybackException.CUSTOM_ERROR_CODE_BASE, ajy0Var5.f70224i, false, false, false);
                        try {
                            audioTrackM112296B = m112296B(ajy0Var6);
                            this.f86756o = ajy0Var6;
                        } catch (zzpx e2) {
                            e.addSuppressed(e2);
                            m112298D();
                            throw e;
                        }
                    }
                    m112298D();
                    throw e;
                }
            } catch (zzpx e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.f86750i.m116909b(e3);
                return false;
            }
        }
        this.f86750i.m116908a();
        if (this.f86722D) {
            this.f86723E = Math.max(0L, j);
            this.f86721C = false;
            this.f86722D = false;
            m112297C(j);
            if (this.f86730L) {
                zzi();
            }
        }
        if (!this.f86747f.m154778j(m112295A())) {
            return false;
        }
        if (this.f86725G == null) {
            f5v0.m119533d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            ajy0 ajy0Var7 = this.f86756o;
            if (ajy0Var7.f70218c != 0 && this.f86720B == 0) {
                int i8 = ajy0Var7.f70222g;
                switch (i8) {
                    case 5:
                    case 6:
                    case 18:
                        z = true;
                        iM217054a = z3r0.m217054a(byteBuffer);
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 7:
                    case 8:
                        int[] iArr = g5r0.f101187a;
                        if (byteBuffer.getInt(0) != -233094848) {
                            if (byteBuffer.getInt(0) == -398277519) {
                                iM217054a = 1024;
                            } else if (byteBuffer.getInt(0) == 622876772) {
                                iM217054a = 4096;
                            } else {
                                int iPosition = byteBuffer.position();
                                byte b2 = byteBuffer.get(iPosition);
                                if (b2 != -2) {
                                    if (b2 != -1) {
                                        if (b2 != 31) {
                                            i3 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                            i4 = byteBuffer.get(iPosition + 5) & 252;
                                        } else {
                                            i3 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                            b = byteBuffer.get(iPosition + 6);
                                        }
                                        i2 = (i4 >> 2) | i3;
                                        z = true;
                                    } else {
                                        i3 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                        b = byteBuffer.get(iPosition + 7);
                                    }
                                    i4 = b & 60;
                                    i2 = (i4 >> 2) | i3;
                                    z = true;
                                } else {
                                    z = true;
                                    i2 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                }
                                iM217054a = (i2 + 1) * 32;
                            }
                            z = true;
                        } else {
                            z = true;
                            iM217054a = 1024;
                        }
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 9:
                        iM217054a = q6r0.m173161c(ggw0.m126081w(byteBuffer, byteBuffer.position()));
                        if (iM217054a == -1) {
                            x9g0.m207497a();
                            return false;
                        }
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 10:
                    case 16:
                        iM217054a = 1024;
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 11:
                    case 12:
                        iM217054a = 2048;
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        f3c.m119257a("Unexpected audio encoding: ", i8);
                        return false;
                    case 14:
                        int[] iArr2 = z3r0.f201396a;
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i9 = iPosition2;
                        while (true) {
                            if (i9 > iLimit) {
                                i5 = -1;
                            } else if ((ggw0.m126081w(byteBuffer, i9 + 4) & (-2)) == -126718022) {
                                i5 = i9 - iPosition2;
                            } else {
                                i9++;
                            }
                        }
                        if (i5 == -1) {
                            iM217054a = 0;
                        } else {
                            iM217054a = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 15:
                        iM217054a = 512;
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 17:
                        int[] iArr3 = c4r0.f79291a;
                        byte[] bArr = new byte[16];
                        int iPosition3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition3);
                        iM217054a = c4r0.m105239a(new x5w0(bArr, 16)).f73401c;
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                    case 20:
                        iM217054a = r6r0.m178087b(byteBuffer);
                        z = true;
                        this.f86720B = iM217054a;
                        if (iM217054a == 0) {
                            return z;
                        }
                        break;
                }
            }
            if (this.f86761t != null) {
                if (!m112305K()) {
                    return false;
                }
                m112297C(j);
                this.f86761t = null;
            }
            long jM126050G = this.f86723E + ggw0.m126050G(m112325z() - this.f86743b.m160010i(), this.f86756o.f70216a.f133906z);
            if (!this.f86721C && Math.abs(jM126050G - j) > 200000) {
                hhy0 hhy0Var2 = this.f86754m;
                if (hhy0Var2 != null) {
                    hhy0Var2.mo131195b(new zzpz(j, jM126050G));
                }
                this.f86721C = true;
            }
            if (this.f86721C) {
                if (!m112305K()) {
                    return false;
                }
                long j2 = j - jM126050G;
                this.f86723E += j2;
                this.f86721C = false;
                m112297C(j);
                hhy0 hhy0Var3 = this.f86754m;
                if (hhy0Var3 != null && j2 != 0) {
                    ((iky0) hhy0Var3).f113754a.m141923W0();
                }
            }
            if (this.f86756o.f70218c == 0) {
                this.f86765x += (long) byteBuffer.remaining();
            } else {
                this.f86766y += ((long) this.f86720B) * ((long) i);
            }
            this.f86725G = byteBuffer;
            this.f86726H = i;
        }
        m112300F(j);
        if (!this.f86725G.hasRemaining()) {
            this.f86725G = null;
            this.f86726H = 0;
            return true;
        }
        if (!this.f86747f.m154777i(m112295A())) {
            return false;
        }
        svv0.m186111f("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: e */
    public final void mo112312e(mhr0 mhr0Var, int i, @Nullable int[] iArr) throws zzpw {
        int i2;
        int iIntValue;
        int iIntValue2;
        int i3;
        int i4;
        agu0 agu0Var;
        int iM126044A;
        int iMax;
        if ("audio/raw".equals(mhr0Var.f133892l)) {
            f5v0.m119533d(ggw0.m126066h(mhr0Var.f133874A));
            int iM126044A2 = ggw0.m126044A(mhr0Var.f133874A, mhr0Var.f133905y);
            ghw0 ghw0Var = new ghw0();
            ghw0Var.m126242i(this.f86744c);
            ghw0Var.m126241h(this.f86740V.m102248e());
            agu0 agu0Var2 = new agu0(ghw0Var.m126243j());
            if (agu0Var2.equals(this.f86757p)) {
                agu0Var2 = this.f86757p;
            }
            this.f86743b.m160012k(mhr0Var.f133875B, mhr0Var.f133876C);
            this.f86742a.m164583i(iArr);
            try {
                ghu0 ghu0VarM96333a = agu0Var2.m96333a(new ghu0(mhr0Var.f133906z, mhr0Var.f133905y, mhr0Var.f133874A));
                iIntValue = ghu0VarM96333a.f102818c;
                i2 = ghu0VarM96333a.f102816a;
                int i5 = ghu0VarM96333a.f102817b;
                iIntValue2 = ggw0.m126080v(i5);
                agu0Var = agu0Var2;
                iM126044A = ggw0.m126044A(iIntValue, i5);
                i4 = iM126044A2;
                i3 = 0;
            } catch (zzds e) {
                throw new zzpw(e, mhr0Var);
            }
        } else {
            agu0 agu0Var3 = new agu0(zzgaa.zzl());
            i2 = mhr0Var.f133906z;
            zfy0 zfy0Var = zfy0.f202996d;
            Pair pairM188754a = this.f86759r.m188754a(mhr0Var, this.f86760s);
            if (pairM188754a == null) {
                throw new zzpw("Unable to configure passthrough for: ".concat(String.valueOf(mhr0Var)), mhr0Var);
            }
            iIntValue = ((Integer) pairM188754a.first).intValue();
            iIntValue2 = ((Integer) pairM188754a.second).intValue();
            i3 = 2;
            i4 = -1;
            agu0Var = agu0Var3;
            iM126044A = -1;
        }
        if (iIntValue == 0) {
            throw new zzpw("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(mhr0Var), mhr0Var);
        }
        if (iIntValue2 == 0) {
            throw new zzpw("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(mhr0Var), mhr0Var);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        f5v0.m119535f(minBufferSize != -2);
        int i6 = iM126044A != -1 ? iM126044A : 1;
        int i7 = mhr0Var.f133888h;
        int i8 = 250000;
        if (i3 == 0) {
            iMax = Math.max(fky0.m121945a(250000, i2, i6), Math.min(minBufferSize * 4, fky0.m121945a(750000, i2, i6)));
        } else if (i3 != 1) {
            if (iIntValue == 5) {
                i8 = 500000;
            } else if (iIntValue == 8) {
                i8 = PlaybackException.CUSTOM_ERROR_CODE_BASE;
                iIntValue = 8;
            }
            iMax = okw0.m164905a((((long) i8) * ((long) (i7 != -1 ? ikw0.m136900a(i7, 8, RoundingMode.CEILING) : fky0.m121946b(iIntValue)))) / 1000000);
        } else {
            iMax = okw0.m164905a((((long) fky0.m121946b(iIntValue)) * 50000000) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, iMax) + i6) - 1) / i6) * i6;
        this.f86735Q = false;
        ajy0 ajy0Var = new ajy0(mhr0Var, i4, i3, iM126044A, i2, iIntValue2, iIntValue, iMax2, agu0Var, false, false, false);
        if (m112306L()) {
            this.f86755n = ajy0Var;
        } else {
            this.f86756o = ajy0Var;
        }
    }

    @Override // p149l.eiy0
    @RequiresApi(23)
    /* JADX INFO: renamed from: f */
    public final void mo112313f(@Nullable AudioDeviceInfo audioDeviceInfo) {
        xiy0 xiy0Var = audioDeviceInfo == null ? null : new xiy0(audioDeviceInfo);
        this.f86733O = xiy0Var;
        AudioTrack audioTrack = this.f86758q;
        if (audioTrack != null) {
            viy0.m198613a(audioTrack, xiy0Var);
        }
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: g */
    public final boolean mo112314g() {
        return m112306L() && this.f86747f.m154775g(m112295A());
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: h */
    public final void mo112315h(boolean z) {
        this.f86764w = z;
        m112301G(this.f86763v);
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: i */
    public final void mo112316i(float f) {
        if (this.f86724F != f) {
            this.f86724F = f;
            m112302H();
        }
    }

    @Override // p149l.eiy0
    @RequiresApi(29)
    /* JADX INFO: renamed from: j */
    public final void mo112317j(int i, int i2) {
        AudioTrack audioTrack = this.f86758q;
        if (audioTrack != null) {
            m112286M(audioTrack);
        }
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: k */
    public final void mo112318k(tzx0 tzx0Var) {
        if (this.f86732N.equals(tzx0Var)) {
            return;
        }
        if (this.f86758q != null) {
            int i = this.f86732N.f172769a;
        }
        this.f86732N = tzx0Var;
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: l */
    public final void mo112319l(@Nullable pfy0 pfy0Var) {
        this.f86753l = pfy0Var;
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: m */
    public final void mo112320m(g6v0 g6v0Var) {
        this.f86747f.m154773e(g6v0Var);
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: n */
    public final void mo112321n(qux0 qux0Var) {
        if (this.f86760s.equals(qux0Var)) {
            return;
        }
        this.f86760s = qux0Var;
        zzf();
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: o */
    public final void mo112322o(c5t0 c5t0Var) {
        this.f86763v = new c5t0(Math.max(0.1f, Math.min(c5t0Var.f79416a, 8.0f)), Math.max(0.1f, Math.min(c5t0Var.f79417b, 8.0f)));
        m112301G(c5t0Var);
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: p */
    public final void mo112323p(hhy0 hhy0Var) {
        this.f86754m = hhy0Var;
    }

    @Override // p149l.eiy0
    /* JADX INFO: renamed from: r */
    public final boolean mo112324r() {
        if (m112306L()) {
            return this.f86728J && !mo112314g();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final long m112325z() {
        ajy0 ajy0Var = this.f86756o;
        return ajy0Var.f70218c == 0 ? this.f86765x / ((long) ajy0Var.f70217b) : this.f86766y;
    }

    @Override // p149l.eiy0
    public final long zzb(boolean z) {
        long jM126047D;
        if (!m112306L() || this.f86722D) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f86747f.m154769a(z), ggw0.m126050G(m112295A(), this.f86756o.f70220e));
        while (!this.f86748g.isEmpty() && jMin >= ((djy0) this.f86748g.getFirst()).f86582c) {
            this.f86762u = (djy0) this.f86748g.remove();
        }
        djy0 djy0Var = this.f86762u;
        long j = jMin - djy0Var.f86582c;
        if (djy0Var.f86580a.equals(c5t0.f79412d)) {
            jM126047D = this.f86762u.f86581b + j;
        } else if (this.f86748g.isEmpty()) {
            jM126047D = this.f86740V.m102244a(j) + this.f86762u.f86581b;
        } else {
            djy0 djy0Var2 = (djy0) this.f86748g.getFirst();
            jM126047D = djy0Var2.f86581b - ggw0.m126047D(djy0Var2.f86582c - jMin, this.f86762u.f86580a.f79416a);
        }
        long jM102245b = this.f86740V.m102245b();
        long jM126050G = jM126047D + ggw0.m126050G(jM102245b, this.f86756o.f70220e);
        long j2 = this.f86737S;
        if (jM102245b > j2) {
            long jM126050G2 = ggw0.m126050G(jM102245b - j2, this.f86756o.f70220e);
            this.f86737S = jM102245b;
            this.f86738T += jM126050G2;
            if (this.f86739U == null) {
                this.f86739U = new Handler(Looper.myLooper());
            }
            this.f86739U.removeCallbacksAndMessages(null);
            this.f86739U.postDelayed(new Runnable() { // from class: l.uiy0
                @Override // java.lang.Runnable
                public final void run() {
                    dky0.m112292w(this.f176708a);
                }
            }, 100L);
        }
        return jM126050G;
    }

    @Override // p149l.eiy0
    public final c5t0 zzc() {
        return this.f86763v;
    }

    @Override // p149l.eiy0
    public final void zzf() {
        if (m112306L()) {
            this.f86765x = 0L;
            this.f86766y = 0L;
            this.f86767z = 0L;
            this.f86719A = 0L;
            this.f86736R = false;
            this.f86720B = 0;
            this.f86762u = new djy0(this.f86763v, 0L, 0L, null);
            this.f86723E = 0L;
            this.f86761t = null;
            this.f86748g.clear();
            this.f86725G = null;
            this.f86726H = 0;
            this.f86727I = null;
            this.f86729K = false;
            this.f86728J = false;
            this.f86743b.m160011j();
            m112303I();
            if (this.f86747f.m154776h()) {
                this.f86758q.pause();
            }
            if (m112286M(this.f86758q)) {
                bky0 bky0Var = this.f86749h;
                bky0Var.getClass();
                bky0Var.m102506b(this.f86758q);
            }
            int i = ggw0.f102568a;
            final dhy0 dhy0VarM97092b = this.f86756o.m97092b();
            ajy0 ajy0Var = this.f86755n;
            if (ajy0Var != null) {
                this.f86756o = ajy0Var;
                this.f86755n = null;
            }
            this.f86747f.m154771c();
            final AudioTrack audioTrack = this.f86758q;
            final v9v0 v9v0Var = this.f86746e;
            final hhy0 hhy0Var = this.f86754m;
            v9v0Var.m197603c();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f86716X) {
                try {
                    if (f86717Y == null) {
                        f86717Y = ggw0.m126062d("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f86718Z++;
                    f86717Y.execute(new Runnable() { // from class: l.siy0
                        @Override // java.lang.Runnable
                        public final void run() {
                            dky0.m112293x(audioTrack, hhy0Var, handler, dhy0VarM97092b, v9v0Var);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f86758q = null;
        }
        this.f86751j.m116908a();
        this.f86750i.m116908a();
        this.f86737S = 0L;
        this.f86738T = 0L;
        Handler handler2 = this.f86739U;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // p149l.eiy0
    public final void zzg() {
        this.f86721C = true;
    }

    @Override // p149l.eiy0
    public final void zzh() {
        this.f86730L = false;
        if (m112306L()) {
            if (this.f86747f.m154779k() || m112286M(this.f86758q)) {
                this.f86758q.pause();
            }
        }
    }

    @Override // p149l.eiy0
    public final void zzi() {
        this.f86730L = true;
        if (m112306L()) {
            this.f86747f.m154774f();
            this.f86758q.play();
        }
    }

    @Override // p149l.eiy0
    public final void zzj() throws zzqa {
        if (!this.f86728J && m112306L() && m112305K()) {
            m112299E();
            this.f86728J = true;
        }
    }

    @Override // p149l.eiy0
    public final void zzk() {
        zzf();
        zzgaa zzgaaVar = this.f86744c;
        int size = zzgaaVar.size();
        for (int i = 0; i < size; i++) {
            ((qju0) zzgaaVar.get(i)).zzf();
        }
        zzgaa zzgaaVar2 = this.f86745d;
        int size2 = zzgaaVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qju0) zzgaaVar2.get(i2)).zzf();
        }
        agu0 agu0Var = this.f86757p;
        if (agu0Var != null) {
            agu0Var.m96338f();
        }
        this.f86730L = false;
        this.f86735Q = false;
    }

    @Override // p149l.eiy0
    public final void zzm(int i) {
        if (this.f86731M != i) {
            this.f86731M = i;
            zzf();
        }
    }
}
