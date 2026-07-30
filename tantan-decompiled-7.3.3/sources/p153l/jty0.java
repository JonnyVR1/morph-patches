package p153l;

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
public final class jty0 implements kry0 {

    /* JADX INFO: renamed from: X */
    public static final Object f122633X = new Object();

    /* JADX INFO: renamed from: Y */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f122634Y;

    /* JADX INFO: renamed from: Z */
    @GuardedBy("releaseExecutorLock")
    public static int f122635Z;

    /* JADX INFO: renamed from: A */
    public long f122636A;

    /* JADX INFO: renamed from: B */
    public int f122637B;

    /* JADX INFO: renamed from: C */
    public boolean f122638C;

    /* JADX INFO: renamed from: D */
    public boolean f122639D;

    /* JADX INFO: renamed from: E */
    public long f122640E;

    /* JADX INFO: renamed from: F */
    public float f122641F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public ByteBuffer f122642G;

    /* JADX INFO: renamed from: H */
    public int f122643H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public ByteBuffer f122644I;

    /* JADX INFO: renamed from: J */
    public boolean f122645J;

    /* JADX INFO: renamed from: K */
    public boolean f122646K;

    /* JADX INFO: renamed from: L */
    public boolean f122647L;

    /* JADX INFO: renamed from: M */
    public int f122648M;

    /* JADX INFO: renamed from: N */
    public z8y0 f122649N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public dsy0 f122650O;

    /* JADX INFO: renamed from: P */
    public long f122651P;

    /* JADX INFO: renamed from: Q */
    public boolean f122652Q;

    /* JADX INFO: renamed from: R */
    public boolean f122653R;

    /* JADX INFO: renamed from: S */
    public long f122654S;

    /* JADX INFO: renamed from: T */
    public long f122655T;

    /* JADX INFO: renamed from: U */
    public Handler f122656U;

    /* JADX INFO: renamed from: V */
    public final hsy0 f122657V;

    /* JADX INFO: renamed from: W */
    public final xry0 f122658W;

    /* JADX INFO: renamed from: a */
    public final ury0 f122659a;

    /* JADX INFO: renamed from: b */
    public final tty0 f122660b;

    /* JADX INFO: renamed from: c */
    public final zzgaa f122661c;

    /* JADX INFO: renamed from: d */
    public final zzgaa f122662d;

    /* JADX INFO: renamed from: e */
    public final bjv0 f122663e;

    /* JADX INFO: renamed from: f */
    public final sry0 f122664f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f122665g;

    /* JADX INFO: renamed from: h */
    public hty0 f122666h;

    /* JADX INFO: renamed from: i */
    public final ksy0 f122667i;

    /* JADX INFO: renamed from: j */
    public final ksy0 f122668j;

    /* JADX INFO: renamed from: k */
    public final esy0 f122669k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public voy0 f122670l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public nqy0 f122671m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public gsy0 f122672n;

    /* JADX INFO: renamed from: o */
    public gsy0 f122673o;

    /* JADX INFO: renamed from: p */
    public gpu0 f122674p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public AudioTrack f122675q;

    /* JADX INFO: renamed from: r */
    public zoy0 f122676r;

    /* JADX INFO: renamed from: s */
    public w3y0 f122677s = w3y0.f187185b;

    /* JADX INFO: renamed from: t */
    @Nullable
    public jsy0 f122678t;

    /* JADX INFO: renamed from: u */
    public jsy0 f122679u;

    /* JADX INFO: renamed from: v */
    public iet0 f122680v;

    /* JADX INFO: renamed from: w */
    public boolean f122681w;

    /* JADX INFO: renamed from: x */
    public long f122682x;

    /* JADX INFO: renamed from: y */
    public long f122683y;

    /* JADX INFO: renamed from: z */
    public long f122684z;

    public /* synthetic */ jty0(fsy0 fsy0Var, ity0 ity0Var) {
        this.f122676r = fsy0Var.f100697a;
        this.f122657V = fsy0Var.f100700d;
        int i = mpw0.f137957a;
        this.f122669k = fsy0Var.f100699c;
        xry0 xry0Var = fsy0Var.f100701e;
        xry0Var.getClass();
        this.f122658W = xry0Var;
        bjv0 bjv0Var = new bjv0(mfv0.f136676a);
        this.f122663e = bjv0Var;
        bjv0Var.m104777e();
        this.f122664f = new sry0(new msy0(this, null));
        ury0 ury0Var = new ury0();
        this.f122659a = ury0Var;
        tty0 tty0Var = new tty0();
        this.f122660b = tty0Var;
        this.f122661c = zzgaa.zzo(new sxu0(), ury0Var, tty0Var);
        this.f122662d = zzgaa.zzm(new sty0());
        this.f122641F = 1.0f;
        this.f122648M = 0;
        this.f122649N = new z8y0(0, 0.0f);
        iet0 iet0Var = iet0.f114611d;
        this.f122679u = new jsy0(iet0Var, 0L, 0L, null);
        this.f122680v = iet0Var;
        this.f122681w = false;
        this.f122665g = new ArrayDeque();
        this.f122667i = new ksy0(100L);
        this.f122668j = new ksy0(100L);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m146924M(AudioTrack audioTrack) {
        return mpw0.f137957a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m146930w(jty0 jty0Var) {
        if (jty0Var.f122655T >= 1000000) {
            ((oty0) jty0Var.f122671m).f149034a.f154130m1 = true;
        }
        jty0Var.f122655T = 0L;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m146931x(AudioTrack audioTrack, final nqy0 nqy0Var, Handler handler, final jqy0 jqy0Var, bjv0 bjv0Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nqy0Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: l.zry0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((oty0) nqy0Var).f149034a.f154119b1.m126823d(jqy0Var);
                    }
                });
            }
            bjv0Var.m104777e();
            synchronized (f122633X) {
                try {
                    int i = f122635Z - 1;
                    f122635Z = i;
                    if (i == 0) {
                        f122634Y.shutdown();
                        f122634Y = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (nqy0Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: l.zry0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((oty0) nqy0Var).f149034a.f154119b1.m126823d(jqy0Var);
                    }
                });
            }
            bjv0Var.m104777e();
            synchronized (f122633X) {
                try {
                    int i2 = f122635Z - 1;
                    f122635Z = i2;
                    if (i2 == 0) {
                        f122634Y.shutdown();
                        f122634Y = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m146933A() {
        gsy0 gsy0Var = this.f122673o;
        if (gsy0Var.f106336c != 0) {
            return this.f122636A;
        }
        long j = this.f122684z;
        long j2 = gsy0Var.f106337d;
        int i = mpw0.f137957a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: B */
    public final AudioTrack m146934B(gsy0 gsy0Var) throws zzpx {
        try {
            return gsy0Var.m132152a(this.f122677s, this.f122648M);
        } catch (zzpx e) {
            nqy0 nqy0Var = this.f122671m;
            if (nqy0Var != null) {
                nqy0Var.mo164436b(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m146935C(long j) {
        iet0 iet0Var;
        boolean z;
        if (m146945N()) {
            hsy0 hsy0Var = this.f122657V;
            iet0Var = this.f122680v;
            hsy0Var.m137058c(iet0Var);
        } else {
            iet0Var = iet0.f114611d;
        }
        iet0 iet0Var2 = iet0Var;
        this.f122680v = iet0Var2;
        if (m146945N()) {
            hsy0 hsy0Var2 = this.f122657V;
            z = this.f122681w;
            hsy0Var2.m137059d(z);
        } else {
            z = false;
        }
        this.f122681w = z;
        this.f122665g.add(new jsy0(iet0Var2, Math.max(0L, j), mpw0.m159394G(m146933A(), this.f122673o.f106338e), null));
        m146941I();
        nqy0 nqy0Var = this.f122671m;
        if (nqy0Var != null) {
            ((oty0) nqy0Var).f149034a.f154119b1.m126842w(this.f122681w);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m146936D() {
        if (this.f122673o.m132154c()) {
            this.f122652Q = true;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m146937E() {
        if (this.f122646K) {
            return;
        }
        this.f122646K = true;
        this.f122664f.m187648b(m146933A());
        this.f122675q.stop();
    }

    /* JADX INFO: renamed from: F */
    public final void m146938F(long j) throws Exception {
        ByteBuffer byteBufferM131323b;
        if (!this.f122674p.m131329h()) {
            ByteBuffer byteBuffer = this.f122642G;
            if (byteBuffer == null) {
                byteBuffer = wsu0.f190695a;
            }
            m146942J(byteBuffer, j);
            return;
        }
        while (!this.f122674p.m131328g()) {
            do {
                byteBufferM131323b = this.f122674p.m131323b();
                if (byteBufferM131323b.hasRemaining()) {
                    m146942J(byteBufferM131323b, j);
                } else {
                    ByteBuffer byteBuffer2 = this.f122642G;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f122674p.m131326e(this.f122642G);
                    }
                }
            } while (!byteBufferM131323b.hasRemaining());
            return;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m146939G(iet0 iet0Var) {
        jsy0 jsy0Var = new jsy0(iet0Var, -9223372036854775807L, -9223372036854775807L, null);
        if (m146944L()) {
            this.f122678t = jsy0Var;
        } else {
            this.f122679u = jsy0Var;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m146940H() {
        if (m146944L()) {
            int i = mpw0.f137957a;
            this.f122675q.setVolume(this.f122641F);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m146941I() {
        gpu0 gpu0Var = this.f122673o.f106342i;
        this.f122674p = gpu0Var;
        gpu0Var.m131324c();
    }

    /* JADX INFO: renamed from: J */
    public final void m146942J(ByteBuffer byteBuffer, long j) throws Exception {
        nqy0 nqy0Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f122644I;
            boolean z = false;
            if (byteBuffer2 != null) {
                lev0.m153956d(byteBuffer2 == byteBuffer);
            } else {
                this.f122644I = byteBuffer;
                int i = mpw0.f137957a;
            }
            int iRemaining = byteBuffer.remaining();
            int i2 = mpw0.f137957a;
            int iWrite = this.f122675q.write(byteBuffer, iRemaining, 1);
            this.f122651P = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((mpw0.f137957a >= 24 && iWrite == -6) || iWrite == -32) {
                    if (m146933A() > 0) {
                        z = true;
                    } else if (m146924M(this.f122675q)) {
                        m146936D();
                        z = true;
                    }
                }
                zzqa zzqaVar = new zzqa(iWrite, this.f122673o.f106334a, z);
                nqy0 nqy0Var2 = this.f122671m;
                if (nqy0Var2 != null) {
                    nqy0Var2.mo164436b(zzqaVar);
                }
                if (zzqaVar.zzb) {
                    this.f122676r = zoy0.f205401c;
                    throw zzqaVar;
                }
                this.f122668j.m151312b(zzqaVar);
                return;
            }
            this.f122668j.m151311a();
            if (m146924M(this.f122675q)) {
                if (this.f122636A > 0) {
                    this.f122653R = false;
                }
                if (this.f122647L && (nqy0Var = this.f122671m) != null && iWrite < iRemaining) {
                    pty0 pty0Var = ((oty0) nqy0Var).f149034a;
                    if (pty0Var.f154129l1 != null) {
                        pty0Var.f154129l1.zza();
                    }
                }
            }
            int i3 = this.f122673o.f106336c;
            if (i3 == 0) {
                this.f122684z += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i3 != 0) {
                    lev0.m153958f(byteBuffer == this.f122642G);
                    this.f122636A += ((long) this.f122637B) * ((long) this.f122643H);
                }
                this.f122644I = null;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m146943K() throws Exception {
        if (!this.f122674p.m131329h()) {
            ByteBuffer byteBuffer = this.f122644I;
            if (byteBuffer == null) {
                return true;
            }
            m146942J(byteBuffer, Long.MIN_VALUE);
            return this.f122644I == null;
        }
        this.f122674p.m131325d();
        m146938F(Long.MIN_VALUE);
        if (!this.f122674p.m131328g()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f122644I;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m146944L() {
        return this.f122675q != null;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m146945N() {
        gsy0 gsy0Var = this.f122673o;
        if (gsy0Var.f106336c != 0) {
            return false;
        }
        int i = gsy0Var.f106334a.f170233A;
        return true;
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: a */
    public final int mo146946a(sqr0 sqr0Var) {
        if (!"audio/raw".equals(sqr0Var.f170251l)) {
            return this.f122676r.m220804a(sqr0Var, this.f122677s) != null ? 2 : 0;
        }
        boolean zM159410h = mpw0.m159410h(sqr0Var.f170233A);
        int i = sqr0Var.f170233A;
        if (zM159410h) {
            return i != 2 ? 1 : 2;
        }
        y4w0.m214278f("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: b */
    public final fpy0 mo146947b(sqr0 sqr0Var) {
        return this.f122652Q ? fpy0.f100230d : this.f122658W.m212945a(sqr0Var, this.f122677s);
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: c */
    public final boolean mo146948c(sqr0 sqr0Var) {
        return mo146946a(sqr0Var) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d3 A[RETURN] */
    @Override // p153l.kry0
    /* JADX INFO: renamed from: d */
    public final boolean mo146949d(ByteBuffer byteBuffer, long j, int i) throws Exception {
        AudioTrack audioTrackM146934B;
        voy0 voy0Var;
        boolean z;
        int iM125129a;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        ByteBuffer byteBuffer2 = this.f122642G;
        lev0.m153956d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f122672n != null) {
            if (!m146943K()) {
                return false;
            }
            gsy0 gsy0Var = this.f122672n;
            gsy0 gsy0Var2 = this.f122673o;
            if (gsy0Var2.f106336c == gsy0Var.f106336c && gsy0Var2.f106340g == gsy0Var.f106340g && gsy0Var2.f106338e == gsy0Var.f106338e && gsy0Var2.f106339f == gsy0Var.f106339f && gsy0Var2.f106337d == gsy0Var.f106337d) {
                this.f122673o = gsy0Var;
                this.f122672n = null;
                AudioTrack audioTrack = this.f122675q;
                if (audioTrack != null && m146924M(audioTrack)) {
                    boolean z2 = this.f122673o.f106344k;
                }
            } else {
                m146937E();
                if (mo146952g()) {
                    return false;
                }
                zzf();
            }
            m146935C(j);
        }
        if (!m146944L()) {
            try {
                if (!this.f122663e.m104776d()) {
                    return false;
                }
                try {
                    gsy0 gsy0Var3 = this.f122673o;
                    if (gsy0Var3 == null) {
                        throw null;
                    }
                    audioTrackM146934B = m146934B(gsy0Var3);
                    this.f122675q = audioTrackM146934B;
                    if (m146924M(audioTrackM146934B)) {
                        AudioTrack audioTrack2 = this.f122675q;
                        if (this.f122666h == null) {
                            this.f122666h = new hty0(this);
                        }
                        this.f122666h.m137102a(audioTrack2);
                        boolean z3 = this.f122673o.f106344k;
                    }
                    int i6 = mpw0.f137957a;
                    if (i6 >= 31 && (voy0Var = this.f122670l) != null) {
                        csy0.m112441a(this.f122675q, voy0Var);
                    }
                    this.f122648M = this.f122675q.getAudioSessionId();
                    sry0 sry0Var = this.f122664f;
                    AudioTrack audioTrack3 = this.f122675q;
                    gsy0 gsy0Var4 = this.f122673o;
                    sry0Var.m187650d(audioTrack3, gsy0Var4.f106336c == 2, gsy0Var4.f106340g, gsy0Var4.f106337d, gsy0Var4.f106341h);
                    m146940H();
                    int i7 = this.f122649N.f203429a;
                    dsy0 dsy0Var = this.f122650O;
                    if (dsy0Var != null && i6 >= 23) {
                        bsy0.m106317a(this.f122675q, dsy0Var);
                    }
                    this.f122639D = true;
                    nqy0 nqy0Var = this.f122671m;
                    if (nqy0Var != null) {
                        ((oty0) nqy0Var).f149034a.f154119b1.m126822c(this.f122673o.m132153b());
                    }
                } catch (zzpx e) {
                    gsy0 gsy0Var5 = this.f122673o;
                    if (gsy0Var5.f106341h > 1000000) {
                        gsy0 gsy0Var6 = new gsy0(gsy0Var5.f106334a, gsy0Var5.f106335b, gsy0Var5.f106336c, gsy0Var5.f106337d, gsy0Var5.f106338e, gsy0Var5.f106339f, gsy0Var5.f106340g, PlaybackException.CUSTOM_ERROR_CODE_BASE, gsy0Var5.f106342i, false, false, false);
                        try {
                            audioTrackM146934B = m146934B(gsy0Var6);
                            this.f122673o = gsy0Var6;
                        } catch (zzpx e2) {
                            e.addSuppressed(e2);
                            m146936D();
                            throw e;
                        }
                    }
                    m146936D();
                    throw e;
                }
            } catch (zzpx e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.f122667i.m151312b(e3);
                return false;
            }
        }
        this.f122667i.m151311a();
        if (this.f122639D) {
            this.f122640E = Math.max(0L, j);
            this.f122638C = false;
            this.f122639D = false;
            m146935C(j);
            if (this.f122647L) {
                zzi();
            }
        }
        if (!this.f122664f.m187656j(m146933A())) {
            return false;
        }
        if (this.f122642G == null) {
            lev0.m153956d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            gsy0 gsy0Var7 = this.f122673o;
            if (gsy0Var7.f106336c != 0 && this.f122637B == 0) {
                int i8 = gsy0Var7.f106340g;
                switch (i8) {
                    case 5:
                    case 6:
                    case 18:
                        z = true;
                        iM125129a = fdr0.m125129a(byteBuffer);
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 7:
                    case 8:
                        int[] iArr = mer0.f136560a;
                        if (byteBuffer.getInt(0) != -233094848) {
                            if (byteBuffer.getInt(0) == -398277519) {
                                iM125129a = 1024;
                            } else if (byteBuffer.getInt(0) == 622876772) {
                                iM125129a = 4096;
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
                                iM125129a = (i2 + 1) * 32;
                            }
                            z = true;
                        } else {
                            z = true;
                            iM125129a = 1024;
                        }
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 9:
                        iM125129a = wfr0.m206147c(mpw0.m159425w(byteBuffer, byteBuffer.position()));
                        if (iM125129a == -1) {
                            fig0.m125680a();
                            return false;
                        }
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 10:
                    case 16:
                        iM125129a = 1024;
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 11:
                    case 12:
                        iM125129a = 2048;
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        o4c.m165980a("Unexpected audio encoding: ", i8);
                        return false;
                    case 14:
                        int[] iArr2 = fdr0.f98494a;
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i9 = iPosition2;
                        while (true) {
                            if (i9 > iLimit) {
                                i5 = -1;
                            } else if ((mpw0.m159425w(byteBuffer, i9 + 4) & (-2)) == -126718022) {
                                i5 = i9 - iPosition2;
                            } else {
                                i9++;
                            }
                        }
                        if (i5 == -1) {
                            iM125129a = 0;
                        } else {
                            iM125129a = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 15:
                        iM125129a = 512;
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 17:
                        int[] iArr3 = idr0.f114520a;
                        byte[] bArr = new byte[16];
                        int iPosition3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition3);
                        iM125129a = idr0.m139541a(new dfw0(bArr, 16)).f109037c;
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                    case 20:
                        iM125129a = xfr0.m210816b(byteBuffer);
                        z = true;
                        this.f122637B = iM125129a;
                        if (iM125129a == 0) {
                            return z;
                        }
                        break;
                }
            }
            if (this.f122678t != null) {
                if (!m146943K()) {
                    return false;
                }
                m146935C(j);
                this.f122678t = null;
            }
            long jM159394G = this.f122640E + mpw0.m159394G(m146963z() - this.f122660b.m192698i(), this.f122673o.f106334a.f170265z);
            if (!this.f122638C && Math.abs(jM159394G - j) > 200000) {
                nqy0 nqy0Var2 = this.f122671m;
                if (nqy0Var2 != null) {
                    nqy0Var2.mo164436b(new zzpz(j, jM159394G));
                }
                this.f122638C = true;
            }
            if (this.f122638C) {
                if (!m146943K()) {
                    return false;
                }
                long j2 = j - jM159394G;
                this.f122640E += j2;
                this.f122638C = false;
                m146935C(j);
                nqy0 nqy0Var3 = this.f122671m;
                if (nqy0Var3 != null && j2 != 0) {
                    ((oty0) nqy0Var3).f149034a.m173793W0();
                }
            }
            if (this.f122673o.f106336c == 0) {
                this.f122682x += (long) byteBuffer.remaining();
            } else {
                this.f122683y += ((long) this.f122637B) * ((long) i);
            }
            this.f122642G = byteBuffer;
            this.f122643H = i;
        }
        m146938F(j);
        if (!this.f122642G.hasRemaining()) {
            this.f122642G = null;
            this.f122643H = 0;
            return true;
        }
        if (!this.f122664f.m187655i(m146933A())) {
            return false;
        }
        y4w0.m214278f("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: e */
    public final void mo146950e(sqr0 sqr0Var, int i, @Nullable int[] iArr) throws zzpw {
        int i2;
        int iIntValue;
        int iIntValue2;
        int i3;
        int i4;
        gpu0 gpu0Var;
        int iM159388A;
        int iMax;
        if ("audio/raw".equals(sqr0Var.f170251l)) {
            lev0.m153956d(mpw0.m159410h(sqr0Var.f170233A));
            int iM159388A2 = mpw0.m159388A(sqr0Var.f170233A, sqr0Var.f170264y);
            mqw0 mqw0Var = new mqw0();
            mqw0Var.m159615i(this.f122661c);
            mqw0Var.m159614h(this.f122657V.m137060e());
            gpu0 gpu0Var2 = new gpu0(mqw0Var.m159616j());
            if (gpu0Var2.equals(this.f122674p)) {
                gpu0Var2 = this.f122674p;
            }
            this.f122660b.m192700k(sqr0Var.f170234B, sqr0Var.f170235C);
            this.f122659a.m197670i(iArr);
            try {
                mqu0 mqu0VarM131322a = gpu0Var2.m131322a(new mqu0(sqr0Var.f170265z, sqr0Var.f170264y, sqr0Var.f170233A));
                iIntValue = mqu0VarM131322a.f138278c;
                i2 = mqu0VarM131322a.f138276a;
                int i5 = mqu0VarM131322a.f138277b;
                iIntValue2 = mpw0.m159424v(i5);
                gpu0Var = gpu0Var2;
                iM159388A = mpw0.m159388A(iIntValue, i5);
                i4 = iM159388A2;
                i3 = 0;
            } catch (zzds e) {
                throw new zzpw(e, sqr0Var);
            }
        } else {
            gpu0 gpu0Var3 = new gpu0(zzgaa.zzl());
            i2 = sqr0Var.f170265z;
            fpy0 fpy0Var = fpy0.f100230d;
            Pair pairM220804a = this.f122676r.m220804a(sqr0Var, this.f122677s);
            if (pairM220804a == null) {
                throw new zzpw("Unable to configure passthrough for: ".concat(String.valueOf(sqr0Var)), sqr0Var);
            }
            iIntValue = ((Integer) pairM220804a.first).intValue();
            iIntValue2 = ((Integer) pairM220804a.second).intValue();
            i3 = 2;
            i4 = -1;
            gpu0Var = gpu0Var3;
            iM159388A = -1;
        }
        if (iIntValue == 0) {
            throw new zzpw("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(sqr0Var), sqr0Var);
        }
        if (iIntValue2 == 0) {
            throw new zzpw("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(sqr0Var), sqr0Var);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        lev0.m153958f(minBufferSize != -2);
        int i6 = iM159388A != -1 ? iM159388A : 1;
        int i7 = sqr0Var.f170247h;
        int i8 = 250000;
        if (i3 == 0) {
            iMax = Math.max(lty0.m155826a(250000, i2, i6), Math.min(minBufferSize * 4, lty0.m155826a(750000, i2, i6)));
        } else if (i3 != 1) {
            if (iIntValue == 5) {
                i8 = 500000;
            } else if (iIntValue == 8) {
                i8 = PlaybackException.CUSTOM_ERROR_CODE_BASE;
                iIntValue = 8;
            }
            iMax = utw0.m198111a((((long) i8) * ((long) (i7 != -1 ? otw0.m169185a(i7, 8, RoundingMode.CEILING) : lty0.m155827b(iIntValue)))) / 1000000);
        } else {
            iMax = utw0.m198111a((((long) lty0.m155827b(iIntValue)) * 50000000) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, iMax) + i6) - 1) / i6) * i6;
        this.f122652Q = false;
        gsy0 gsy0Var = new gsy0(sqr0Var, i4, i3, iM159388A, i2, iIntValue2, iIntValue, iMax2, gpu0Var, false, false, false);
        if (m146944L()) {
            this.f122672n = gsy0Var;
        } else {
            this.f122673o = gsy0Var;
        }
    }

    @Override // p153l.kry0
    @RequiresApi(23)
    /* JADX INFO: renamed from: f */
    public final void mo146951f(@Nullable AudioDeviceInfo audioDeviceInfo) {
        dsy0 dsy0Var = audioDeviceInfo == null ? null : new dsy0(audioDeviceInfo);
        this.f122650O = dsy0Var;
        AudioTrack audioTrack = this.f122675q;
        if (audioTrack != null) {
            bsy0.m106317a(audioTrack, dsy0Var);
        }
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: g */
    public final boolean mo146952g() {
        return m146944L() && this.f122664f.m187653g(m146933A());
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: h */
    public final void mo146953h(boolean z) {
        this.f122681w = z;
        m146939G(this.f122680v);
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: i */
    public final void mo146954i(float f) {
        if (this.f122641F != f) {
            this.f122641F = f;
            m146940H();
        }
    }

    @Override // p153l.kry0
    @RequiresApi(29)
    /* JADX INFO: renamed from: j */
    public final void mo146955j(int i, int i2) {
        AudioTrack audioTrack = this.f122675q;
        if (audioTrack != null) {
            m146924M(audioTrack);
        }
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: k */
    public final void mo146956k(z8y0 z8y0Var) {
        if (this.f122649N.equals(z8y0Var)) {
            return;
        }
        if (this.f122675q != null) {
            int i = this.f122649N.f203429a;
        }
        this.f122649N = z8y0Var;
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: l */
    public final void mo146957l(@Nullable voy0 voy0Var) {
        this.f122670l = voy0Var;
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: m */
    public final void mo146958m(mfv0 mfv0Var) {
        this.f122664f.m187651e(mfv0Var);
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: n */
    public final void mo146959n(w3y0 w3y0Var) {
        if (this.f122677s.equals(w3y0Var)) {
            return;
        }
        this.f122677s = w3y0Var;
        zzf();
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: o */
    public final void mo146960o(iet0 iet0Var) {
        this.f122680v = new iet0(Math.max(0.1f, Math.min(iet0Var.f114615a, 8.0f)), Math.max(0.1f, Math.min(iet0Var.f114616b, 8.0f)));
        m146939G(iet0Var);
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: p */
    public final void mo146961p(nqy0 nqy0Var) {
        this.f122671m = nqy0Var;
    }

    @Override // p153l.kry0
    /* JADX INFO: renamed from: r */
    public final boolean mo146962r() {
        if (m146944L()) {
            return this.f122645J && !mo146952g();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final long m146963z() {
        gsy0 gsy0Var = this.f122673o;
        return gsy0Var.f106336c == 0 ? this.f122682x / ((long) gsy0Var.f106335b) : this.f122683y;
    }

    @Override // p153l.kry0
    public final long zzb(boolean z) {
        long jM159391D;
        if (!m146944L() || this.f122639D) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f122664f.m187647a(z), mpw0.m159394G(m146933A(), this.f122673o.f106338e));
        while (!this.f122665g.isEmpty() && jMin >= ((jsy0) this.f122665g.getFirst()).f122540c) {
            this.f122679u = (jsy0) this.f122665g.remove();
        }
        jsy0 jsy0Var = this.f122679u;
        long j = jMin - jsy0Var.f122540c;
        if (jsy0Var.f122538a.equals(iet0.f114611d)) {
            jM159391D = this.f122679u.f122539b + j;
        } else if (this.f122665g.isEmpty()) {
            jM159391D = this.f122657V.m137056a(j) + this.f122679u.f122539b;
        } else {
            jsy0 jsy0Var2 = (jsy0) this.f122665g.getFirst();
            jM159391D = jsy0Var2.f122539b - mpw0.m159391D(jsy0Var2.f122540c - jMin, this.f122679u.f122538a.f114615a);
        }
        long jM137057b = this.f122657V.m137057b();
        long jM159394G = jM159391D + mpw0.m159394G(jM137057b, this.f122673o.f106338e);
        long j2 = this.f122654S;
        if (jM137057b > j2) {
            long jM159394G2 = mpw0.m159394G(jM137057b - j2, this.f122673o.f106338e);
            this.f122654S = jM137057b;
            this.f122655T += jM159394G2;
            if (this.f122656U == null) {
                this.f122656U = new Handler(Looper.myLooper());
            }
            this.f122656U.removeCallbacksAndMessages(null);
            this.f122656U.postDelayed(new Runnable() { // from class: l.asy0
                @Override // java.lang.Runnable
                public final void run() {
                    jty0.m146930w(this.f73198a);
                }
            }, 100L);
        }
        return jM159394G;
    }

    @Override // p153l.kry0
    public final iet0 zzc() {
        return this.f122680v;
    }

    @Override // p153l.kry0
    public final void zzf() {
        if (m146944L()) {
            this.f122682x = 0L;
            this.f122683y = 0L;
            this.f122684z = 0L;
            this.f122636A = 0L;
            this.f122653R = false;
            this.f122637B = 0;
            this.f122679u = new jsy0(this.f122680v, 0L, 0L, null);
            this.f122640E = 0L;
            this.f122678t = null;
            this.f122665g.clear();
            this.f122642G = null;
            this.f122643H = 0;
            this.f122644I = null;
            this.f122646K = false;
            this.f122645J = false;
            this.f122660b.m192699j();
            m146941I();
            if (this.f122664f.m187654h()) {
                this.f122675q.pause();
            }
            if (m146924M(this.f122675q)) {
                hty0 hty0Var = this.f122666h;
                hty0Var.getClass();
                hty0Var.m137103b(this.f122675q);
            }
            int i = mpw0.f137957a;
            final jqy0 jqy0VarM132153b = this.f122673o.m132153b();
            gsy0 gsy0Var = this.f122672n;
            if (gsy0Var != null) {
                this.f122673o = gsy0Var;
                this.f122672n = null;
            }
            this.f122664f.m187649c();
            final AudioTrack audioTrack = this.f122675q;
            final bjv0 bjv0Var = this.f122663e;
            final nqy0 nqy0Var = this.f122671m;
            bjv0Var.m104775c();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f122633X) {
                try {
                    if (f122634Y == null) {
                        f122634Y = mpw0.m159406d("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f122635Z++;
                    f122634Y.execute(new Runnable() { // from class: l.yry0
                        @Override // java.lang.Runnable
                        public final void run() {
                            jty0.m146931x(audioTrack, nqy0Var, handler, jqy0VarM132153b, bjv0Var);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f122675q = null;
        }
        this.f122668j.m151311a();
        this.f122667i.m151311a();
        this.f122654S = 0L;
        this.f122655T = 0L;
        Handler handler2 = this.f122656U;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // p153l.kry0
    public final void zzg() {
        this.f122638C = true;
    }

    @Override // p153l.kry0
    public final void zzh() {
        this.f122647L = false;
        if (m146944L()) {
            if (this.f122664f.m187657k() || m146924M(this.f122675q)) {
                this.f122675q.pause();
            }
        }
    }

    @Override // p153l.kry0
    public final void zzi() {
        this.f122647L = true;
        if (m146944L()) {
            this.f122664f.m187652f();
            this.f122675q.play();
        }
    }

    @Override // p153l.kry0
    public final void zzj() throws zzqa {
        if (!this.f122645J && m146944L() && m146943K()) {
            m146937E();
            this.f122645J = true;
        }
    }

    @Override // p153l.kry0
    public final void zzk() {
        zzf();
        zzgaa zzgaaVar = this.f122661c;
        int size = zzgaaVar.size();
        for (int i = 0; i < size; i++) {
            ((wsu0) zzgaaVar.get(i)).zzf();
        }
        zzgaa zzgaaVar2 = this.f122662d;
        int size2 = zzgaaVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((wsu0) zzgaaVar2.get(i2)).zzf();
        }
        gpu0 gpu0Var = this.f122674p;
        if (gpu0Var != null) {
            gpu0Var.m131327f();
        }
        this.f122647L = false;
        this.f122652Q = false;
    }

    @Override // p153l.kry0
    public final void zzm(int i) {
        if (this.f122648M != i) {
            this.f122648M = i;
            zzf();
        }
    }
}
