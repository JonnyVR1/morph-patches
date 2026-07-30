package p153l;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class sry0 {

    /* JADX INFO: renamed from: A */
    public long f170387A;

    /* JADX INFO: renamed from: B */
    public long f170388B;

    /* JADX INFO: renamed from: C */
    public long f170389C;

    /* JADX INFO: renamed from: D */
    public boolean f170390D;

    /* JADX INFO: renamed from: E */
    public long f170391E;

    /* JADX INFO: renamed from: F */
    public long f170392F;

    /* JADX INFO: renamed from: G */
    public boolean f170393G;

    /* JADX INFO: renamed from: H */
    public long f170394H;

    /* JADX INFO: renamed from: I */
    public mfv0 f170395I;

    /* JADX INFO: renamed from: a */
    public final qry0 f170396a;

    /* JADX INFO: renamed from: b */
    public final long[] f170397b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AudioTrack f170398c;

    /* JADX INFO: renamed from: d */
    public int f170399d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ory0 f170400e;

    /* JADX INFO: renamed from: f */
    public int f170401f;

    /* JADX INFO: renamed from: g */
    public boolean f170402g;

    /* JADX INFO: renamed from: h */
    public long f170403h;

    /* JADX INFO: renamed from: i */
    public float f170404i;

    /* JADX INFO: renamed from: j */
    public boolean f170405j;

    /* JADX INFO: renamed from: k */
    public long f170406k;

    /* JADX INFO: renamed from: l */
    public long f170407l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Method f170408m;

    /* JADX INFO: renamed from: n */
    public long f170409n;

    /* JADX INFO: renamed from: o */
    public boolean f170410o;

    /* JADX INFO: renamed from: p */
    public boolean f170411p;

    /* JADX INFO: renamed from: q */
    public long f170412q;

    /* JADX INFO: renamed from: r */
    public long f170413r;

    /* JADX INFO: renamed from: s */
    public long f170414s;

    /* JADX INFO: renamed from: t */
    public long f170415t;

    /* JADX INFO: renamed from: u */
    public long f170416u;

    /* JADX INFO: renamed from: v */
    public int f170417v;

    /* JADX INFO: renamed from: w */
    public int f170418w;

    /* JADX INFO: renamed from: x */
    public long f170419x;

    /* JADX INFO: renamed from: y */
    public long f170420y;

    /* JADX INFO: renamed from: z */
    public long f170421z;

    public sry0(qry0 qry0Var) {
        this.f170396a = qry0Var;
        int i = mpw0.f137957a;
        try {
            this.f170408m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f170397b = new long[10];
        this.f170395I = mfv0.f136676a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:28:0x012f  */
    /* JADX WARN: Code duplicated, block: B:38:0x014b A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:36:0x0147, B:38:0x014b, B:40:0x016b, B:41:0x0184), top: B:68:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x016b A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:36:0x0147, B:38:0x014b, B:40:0x016b, B:41:0x0184), top: B:68:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0184 A[Catch: Exception -> 0x0185, TRY_LEAVE, TryCatch #0 {Exception -> 0x0185, blocks: (B:36:0x0147, B:38:0x014b, B:40:0x016b, B:41:0x0184), top: B:68:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0097, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00ee, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x016b, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final long m187647a(boolean z) {
        long j;
        long jM187659m;
        ory0 ory0Var;
        long jM168949b;
        long jM168948a;
        long j2;
        long jM187659m2;
        Method method;
        AudioTrack audioTrack;
        long jMax;
        sry0 sry0Var = this;
        AudioTrack audioTrack2 = sry0Var.f170398c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - sry0Var.f170407l >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                long jM187659m3 = sry0Var.m187659m();
                if (jM187659m3 == 0) {
                    j = 1000;
                } else {
                    sry0Var.f170397b[sry0Var.f170417v] = mpw0.m159392E(jM187659m3, sry0Var.f170404i) - jNanoTime;
                    sry0Var.f170417v = (sry0Var.f170417v + 1) % 10;
                    int i = sry0Var.f170418w;
                    if (i < 10) {
                        sry0Var.f170418w = i + 1;
                    }
                    sry0Var.f170407l = jNanoTime;
                    sry0Var.f170406k = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = sry0Var.f170418w;
                        if (i2 >= i3) {
                            break;
                        }
                        sry0Var.f170406k += sry0Var.f170397b[i2] / ((long) i3);
                        i2++;
                    }
                    if (sry0Var.f170402g) {
                        j = 1000;
                    } else {
                        ory0Var = sry0Var.f170400e;
                        ory0Var.getClass();
                        if (ory0Var.m168954g(jNanoTime)) {
                            jM168949b = ory0Var.m168949b();
                            jM168948a = ory0Var.m168948a();
                            j2 = 5000000;
                            jM187659m2 = sry0Var.m187659m();
                            j = 1000;
                            if (Math.abs(jM168949b - jNanoTime) > 5000000) {
                                jty0 jty0Var = ((msy0) sry0Var.f170396a).f138530a;
                                y4w0.m214278f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jM168948a + ", " + jM168949b + ", " + jNanoTime + ", " + jM187659m2 + ", " + jty0Var.m146963z() + ", " + jty0Var.m146933A());
                                ory0Var.m168951d();
                            } else if (Math.abs(mpw0.m159394G(jM168948a, sry0Var.f170401f) - jM187659m2) > 5000000) {
                                jty0 jty0Var2 = ((msy0) sry0Var.f170396a).f138530a;
                                y4w0.m214278f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jM168948a + ", " + jM168949b + ", " + jNanoTime + ", " + jM187659m2 + ", " + jty0Var2.m146963z() + ", " + jty0Var2.m146933A());
                                ory0Var.m168951d();
                            } else {
                                ory0Var.m168950c();
                            }
                            sry0Var = this;
                        } else {
                            j = 1000;
                            j2 = 5000000;
                        }
                        if (sry0Var.f170411p && (method = sry0Var.f170408m) != null && jNanoTime - sry0Var.f170412q >= 500000) {
                            try {
                                audioTrack = sry0Var.f170398c;
                                if (audioTrack != null) {
                                    throw null;
                                }
                                Integer num = (Integer) method.invoke(audioTrack, null);
                                int i4 = mpw0.f137957a;
                                long jIntValue = (((long) num.intValue()) * j) - sry0Var.f170403h;
                                sry0Var.f170409n = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                sry0Var.f170409n = jMax;
                                if (jMax > j2) {
                                    y4w0.m214278f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    sry0Var.f170409n = 0L;
                                }
                                sry0Var.f170412q = jNanoTime;
                            } catch (Exception unused) {
                                sry0Var.f170408m = null;
                            }
                        }
                    }
                }
            } else if (sry0Var.f170402g) {
                ory0Var = sry0Var.f170400e;
                ory0Var.getClass();
                if (ory0Var.m168954g(jNanoTime)) {
                    j = 1000;
                    j2 = 5000000;
                } else {
                    jM168949b = ory0Var.m168949b();
                    jM168948a = ory0Var.m168948a();
                    j2 = 5000000;
                    jM187659m2 = sry0Var.m187659m();
                    j = 1000;
                    if (Math.abs(jM168949b - jNanoTime) > 5000000) {
                        jty0 jty0Var3 = ((msy0) sry0Var.f170396a).f138530a;
                        y4w0.m214278f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jM168948a + ", " + jM168949b + ", " + jNanoTime + ", " + jM187659m2 + ", " + jty0Var3.m146963z() + ", " + jty0Var3.m146933A());
                        ory0Var.m168951d();
                    } else if (Math.abs(mpw0.m159394G(jM168948a, sry0Var.f170401f) - jM187659m2) > 5000000) {
                        jty0 jty0Var4 = ((msy0) sry0Var.f170396a).f138530a;
                        y4w0.m214278f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jM168948a + ", " + jM168949b + ", " + jNanoTime + ", " + jM187659m2 + ", " + jty0Var4.m146963z() + ", " + jty0Var4.m146933A());
                        ory0Var.m168951d();
                    } else {
                        ory0Var.m168950c();
                    }
                    sry0Var = this;
                }
                if (sry0Var.f170411p) {
                    audioTrack = sry0Var.f170398c;
                    if (audioTrack != null) {
                        throw null;
                    }
                    Integer num2 = (Integer) method.invoke(audioTrack, null);
                    int i5 = mpw0.f137957a;
                    long jIntValue2 = (((long) num2.intValue()) * j) - sry0Var.f170403h;
                    sry0Var.f170409n = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    sry0Var.f170409n = jMax;
                    if (jMax > j2) {
                        y4w0.m214278f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        sry0Var.f170409n = 0L;
                    }
                    sry0Var.f170412q = jNanoTime;
                }
            } else {
                j = 1000;
            }
        } else {
            j = 1000;
        }
        long jNanoTime2 = System.nanoTime() / j;
        ory0 ory0Var2 = sry0Var.f170400e;
        ory0Var2.getClass();
        boolean zM168953f = ory0Var2.m168953f();
        if (zM168953f) {
            jM187659m = mpw0.m159394G(ory0Var2.m168948a(), sry0Var.f170401f) + mpw0.m159391D(jNanoTime2 - ory0Var2.m168949b(), sry0Var.f170404i);
        } else {
            jM187659m = sry0Var.f170418w == 0 ? sry0Var.m187659m() : mpw0.m159391D(sry0Var.f170406k + jNanoTime2, sry0Var.f170404i);
            if (!z) {
                jM187659m = Math.max(0L, jM187659m - sry0Var.f170409n);
            }
        }
        if (sry0Var.f170390D != zM168953f) {
            sry0Var.f170392F = sry0Var.f170389C;
            sry0Var.f170391E = sry0Var.f170388B;
        }
        long j3 = jNanoTime2 - sry0Var.f170392F;
        if (j3 < 1000000) {
            long jM159391D = sry0Var.f170391E + mpw0.m159391D(j3, sry0Var.f170404i);
            long j4 = (j3 * j) / 1000000;
            jM187659m = ((jM187659m * j4) + ((j - j4) * jM159391D)) / j;
        }
        if (!sry0Var.f170405j) {
            long j5 = sry0Var.f170388B;
            if (jM187659m > j5) {
                sry0Var.f170405j = true;
                int i6 = mpw0.f137957a;
                long jCurrentTimeMillis = System.currentTimeMillis() - mpw0.m159396I(mpw0.m159392E(mpw0.m159396I(jM187659m - j5), sry0Var.f170404i));
                jty0 jty0Var5 = ((msy0) sry0Var.f170396a).f138530a;
                if (jty0Var5.f122671m != null) {
                    ((oty0) jty0Var5.f122671m).f149034a.f154119b1.m126841v(jCurrentTimeMillis);
                }
            }
        }
        sry0Var.f170389C = jNanoTime2;
        sry0Var.f170388B = jM187659m;
        sry0Var.f170390D = zM168953f;
        return jM187659m;
    }

    /* JADX INFO: renamed from: b */
    public final void m187648b(long j) {
        this.f170421z = m187658l();
        this.f170419x = mpw0.m159393F(SystemClock.elapsedRealtime());
        this.f170387A = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m187649c() {
        m187660n();
        this.f170398c = null;
        this.f170400e = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX INFO: renamed from: d */
    public final void m187650d(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.f170398c = audioTrack;
        this.f170399d = i3;
        this.f170400e = new ory0(audioTrack);
        this.f170401f = audioTrack.getSampleRate();
        if (!z || mpw0.f137957a >= 23) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                } else {
                    z2 = false;
                }
            }
        }
        this.f170402g = z2;
        boolean zM159410h = mpw0.m159410h(i);
        this.f170411p = zM159410h;
        this.f170403h = zM159410h ? mpw0.m159394G(i3 / i2, this.f170401f) : -9223372036854775807L;
        this.f170414s = 0L;
        this.f170415t = 0L;
        this.f170393G = false;
        this.f170394H = 0L;
        this.f170416u = 0L;
        this.f170410o = false;
        this.f170419x = -9223372036854775807L;
        this.f170420y = -9223372036854775807L;
        this.f170412q = 0L;
        this.f170409n = 0L;
        this.f170404i = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m187651e(mfv0 mfv0Var) {
        this.f170395I = mfv0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m187652f() {
        if (this.f170419x != -9223372036854775807L) {
            this.f170419x = mpw0.m159393F(SystemClock.elapsedRealtime());
        }
        ory0 ory0Var = this.f170400e;
        ory0Var.getClass();
        ory0Var.m168952e();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m187653g(long j) {
        if (j > mpw0.m159390C(m187647a(false), this.f170401f)) {
            return true;
        }
        if (this.f170402g) {
            AudioTrack audioTrack = this.f170398c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && m187658l() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m187654h() {
        AudioTrack audioTrack = this.f170398c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m187655i(long j) {
        return this.f170420y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f170420y >= 200;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m187656j(long j) {
        AudioTrack audioTrack = this.f170398c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f170402g) {
            if (playState == 2) {
                this.f170410o = false;
                return false;
            }
            if (playState == 1) {
                if (m187658l() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f170410o;
        boolean zM187653g = m187653g(j);
        this.f170410o = zM187653g;
        if (z && !zM187653g && playState != 1) {
            qry0 qry0Var = this.f170396a;
            int i = this.f170399d;
            long jM159396I = mpw0.m159396I(this.f170403h);
            msy0 msy0Var = (msy0) qry0Var;
            jty0 jty0Var = msy0Var.f138530a;
            if (jty0Var.f122671m != null) {
                ((oty0) msy0Var.f138530a.f122671m).f149034a.f154119b1.m126843x(i, jM159396I, SystemClock.elapsedRealtime() - jty0Var.f122651P);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m187657k() {
        m187660n();
        if (this.f170419x != -9223372036854775807L) {
            this.f170421z = m187658l();
            return false;
        }
        ory0 ory0Var = this.f170400e;
        ory0Var.getClass();
        ory0Var.m168952e();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX INFO: renamed from: l */
    public final long m187658l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.f170419x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f170398c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f170421z;
            }
            return Math.min(this.f170387A, this.f170421z + mpw0.m159390C(mpw0.m159391D(mpw0.m159393F(jElapsedRealtime) - this.f170419x, this.f170404i), this.f170401f));
        }
        if (jElapsedRealtime - this.f170413r >= 5) {
            AudioTrack audioTrack2 = this.f170398c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                long j = 0;
                if (this.f170402g) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.f170416u = this.f170414s;
                    }
                    playbackHeadPosition += this.f170416u;
                    playState = i;
                }
                if (mpw0.f137957a > 29) {
                    if (this.f170414s > playbackHeadPosition) {
                        this.f170415t++;
                    }
                    this.f170414s = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.f170414s > 0 && playState == 3) {
                        if (this.f170420y == -9223372036854775807L) {
                            this.f170420y = jElapsedRealtime;
                        }
                    }
                    this.f170420y = -9223372036854775807L;
                    playbackHeadPosition = j;
                    if (this.f170414s > playbackHeadPosition) {
                        this.f170415t++;
                    }
                    this.f170414s = playbackHeadPosition;
                }
            }
            this.f170413r = jElapsedRealtime;
        }
        return this.f170414s + this.f170394H + (this.f170415t << 32);
    }

    /* JADX INFO: renamed from: m */
    public final long m187659m() {
        return mpw0.m159394G(m187658l(), this.f170401f);
    }

    /* JADX INFO: renamed from: n */
    public final void m187660n() {
        this.f170406k = 0L;
        this.f170418w = 0;
        this.f170417v = 0;
        this.f170407l = 0L;
        this.f170389C = 0L;
        this.f170392F = 0L;
        this.f170405j = false;
    }
}
