package p149l;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class miy0 {

    /* JADX INFO: renamed from: A */
    public long f134049A;

    /* JADX INFO: renamed from: B */
    public long f134050B;

    /* JADX INFO: renamed from: C */
    public long f134051C;

    /* JADX INFO: renamed from: D */
    public boolean f134052D;

    /* JADX INFO: renamed from: E */
    public long f134053E;

    /* JADX INFO: renamed from: F */
    public long f134054F;

    /* JADX INFO: renamed from: G */
    public boolean f134055G;

    /* JADX INFO: renamed from: H */
    public long f134056H;

    /* JADX INFO: renamed from: I */
    public g6v0 f134057I;

    /* JADX INFO: renamed from: a */
    public final kiy0 f134058a;

    /* JADX INFO: renamed from: b */
    public final long[] f134059b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AudioTrack f134060c;

    /* JADX INFO: renamed from: d */
    public int f134061d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public iiy0 f134062e;

    /* JADX INFO: renamed from: f */
    public int f134063f;

    /* JADX INFO: renamed from: g */
    public boolean f134064g;

    /* JADX INFO: renamed from: h */
    public long f134065h;

    /* JADX INFO: renamed from: i */
    public float f134066i;

    /* JADX INFO: renamed from: j */
    public boolean f134067j;

    /* JADX INFO: renamed from: k */
    public long f134068k;

    /* JADX INFO: renamed from: l */
    public long f134069l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Method f134070m;

    /* JADX INFO: renamed from: n */
    public long f134071n;

    /* JADX INFO: renamed from: o */
    public boolean f134072o;

    /* JADX INFO: renamed from: p */
    public boolean f134073p;

    /* JADX INFO: renamed from: q */
    public long f134074q;

    /* JADX INFO: renamed from: r */
    public long f134075r;

    /* JADX INFO: renamed from: s */
    public long f134076s;

    /* JADX INFO: renamed from: t */
    public long f134077t;

    /* JADX INFO: renamed from: u */
    public long f134078u;

    /* JADX INFO: renamed from: v */
    public int f134079v;

    /* JADX INFO: renamed from: w */
    public int f134080w;

    /* JADX INFO: renamed from: x */
    public long f134081x;

    /* JADX INFO: renamed from: y */
    public long f134082y;

    /* JADX INFO: renamed from: z */
    public long f134083z;

    public miy0(kiy0 kiy0Var) {
        this.f134058a = kiy0Var;
        int i = ggw0.f102568a;
        try {
            this.f134070m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f134059b = new long[10];
        this.f134057I = g6v0.f101315a;
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
    public final long m154769a(boolean z) {
        long j;
        long jM154781m;
        iiy0 iiy0Var;
        long jM136493b;
        long jM136492a;
        long j2;
        long jM154781m2;
        Method method;
        AudioTrack audioTrack;
        long jMax;
        miy0 miy0Var = this;
        AudioTrack audioTrack2 = miy0Var.f134060c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - miy0Var.f134069l >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                long jM154781m3 = miy0Var.m154781m();
                if (jM154781m3 == 0) {
                    j = 1000;
                } else {
                    miy0Var.f134059b[miy0Var.f134079v] = ggw0.m126048E(jM154781m3, miy0Var.f134066i) - jNanoTime;
                    miy0Var.f134079v = (miy0Var.f134079v + 1) % 10;
                    int i = miy0Var.f134080w;
                    if (i < 10) {
                        miy0Var.f134080w = i + 1;
                    }
                    miy0Var.f134069l = jNanoTime;
                    miy0Var.f134068k = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = miy0Var.f134080w;
                        if (i2 >= i3) {
                            break;
                        }
                        miy0Var.f134068k += miy0Var.f134059b[i2] / ((long) i3);
                        i2++;
                    }
                    if (miy0Var.f134064g) {
                        j = 1000;
                    } else {
                        iiy0Var = miy0Var.f134062e;
                        iiy0Var.getClass();
                        if (iiy0Var.m136498g(jNanoTime)) {
                            jM136493b = iiy0Var.m136493b();
                            jM136492a = iiy0Var.m136492a();
                            j2 = 5000000;
                            jM154781m2 = miy0Var.m154781m();
                            j = 1000;
                            if (Math.abs(jM136493b - jNanoTime) > 5000000) {
                                dky0 dky0Var = ((gjy0) miy0Var.f134058a).f103111a;
                                svv0.m186111f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jM136492a + ", " + jM136493b + ", " + jNanoTime + ", " + jM154781m2 + ", " + dky0Var.m112325z() + ", " + dky0Var.m112295A());
                                iiy0Var.m136495d();
                            } else if (Math.abs(ggw0.m126050G(jM136492a, miy0Var.f134063f) - jM154781m2) > 5000000) {
                                dky0 dky0Var2 = ((gjy0) miy0Var.f134058a).f103111a;
                                svv0.m186111f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jM136492a + ", " + jM136493b + ", " + jNanoTime + ", " + jM154781m2 + ", " + dky0Var2.m112325z() + ", " + dky0Var2.m112295A());
                                iiy0Var.m136495d();
                            } else {
                                iiy0Var.m136494c();
                            }
                            miy0Var = this;
                        } else {
                            j = 1000;
                            j2 = 5000000;
                        }
                        if (miy0Var.f134073p && (method = miy0Var.f134070m) != null && jNanoTime - miy0Var.f134074q >= 500000) {
                            try {
                                audioTrack = miy0Var.f134060c;
                                if (audioTrack != null) {
                                    throw null;
                                }
                                Integer num = (Integer) method.invoke(audioTrack, null);
                                int i4 = ggw0.f102568a;
                                long jIntValue = (((long) num.intValue()) * j) - miy0Var.f134065h;
                                miy0Var.f134071n = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                miy0Var.f134071n = jMax;
                                if (jMax > j2) {
                                    svv0.m186111f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    miy0Var.f134071n = 0L;
                                }
                                miy0Var.f134074q = jNanoTime;
                            } catch (Exception unused) {
                                miy0Var.f134070m = null;
                            }
                        }
                    }
                }
            } else if (miy0Var.f134064g) {
                iiy0Var = miy0Var.f134062e;
                iiy0Var.getClass();
                if (iiy0Var.m136498g(jNanoTime)) {
                    j = 1000;
                    j2 = 5000000;
                } else {
                    jM136493b = iiy0Var.m136493b();
                    jM136492a = iiy0Var.m136492a();
                    j2 = 5000000;
                    jM154781m2 = miy0Var.m154781m();
                    j = 1000;
                    if (Math.abs(jM136493b - jNanoTime) > 5000000) {
                        dky0 dky0Var3 = ((gjy0) miy0Var.f134058a).f103111a;
                        svv0.m186111f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jM136492a + ", " + jM136493b + ", " + jNanoTime + ", " + jM154781m2 + ", " + dky0Var3.m112325z() + ", " + dky0Var3.m112295A());
                        iiy0Var.m136495d();
                    } else if (Math.abs(ggw0.m126050G(jM136492a, miy0Var.f134063f) - jM154781m2) > 5000000) {
                        dky0 dky0Var4 = ((gjy0) miy0Var.f134058a).f103111a;
                        svv0.m186111f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jM136492a + ", " + jM136493b + ", " + jNanoTime + ", " + jM154781m2 + ", " + dky0Var4.m112325z() + ", " + dky0Var4.m112295A());
                        iiy0Var.m136495d();
                    } else {
                        iiy0Var.m136494c();
                    }
                    miy0Var = this;
                }
                if (miy0Var.f134073p) {
                    audioTrack = miy0Var.f134060c;
                    if (audioTrack != null) {
                        throw null;
                    }
                    Integer num2 = (Integer) method.invoke(audioTrack, null);
                    int i5 = ggw0.f102568a;
                    long jIntValue2 = (((long) num2.intValue()) * j) - miy0Var.f134065h;
                    miy0Var.f134071n = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    miy0Var.f134071n = jMax;
                    if (jMax > j2) {
                        svv0.m186111f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        miy0Var.f134071n = 0L;
                    }
                    miy0Var.f134074q = jNanoTime;
                }
            } else {
                j = 1000;
            }
        } else {
            j = 1000;
        }
        long jNanoTime2 = System.nanoTime() / j;
        iiy0 iiy0Var2 = miy0Var.f134062e;
        iiy0Var2.getClass();
        boolean zM136497f = iiy0Var2.m136497f();
        if (zM136497f) {
            jM154781m = ggw0.m126050G(iiy0Var2.m136492a(), miy0Var.f134063f) + ggw0.m126047D(jNanoTime2 - iiy0Var2.m136493b(), miy0Var.f134066i);
        } else {
            jM154781m = miy0Var.f134080w == 0 ? miy0Var.m154781m() : ggw0.m126047D(miy0Var.f134068k + jNanoTime2, miy0Var.f134066i);
            if (!z) {
                jM154781m = Math.max(0L, jM154781m - miy0Var.f134071n);
            }
        }
        if (miy0Var.f134052D != zM136497f) {
            miy0Var.f134054F = miy0Var.f134051C;
            miy0Var.f134053E = miy0Var.f134050B;
        }
        long j3 = jNanoTime2 - miy0Var.f134054F;
        if (j3 < 1000000) {
            long jM126047D = miy0Var.f134053E + ggw0.m126047D(j3, miy0Var.f134066i);
            long j4 = (j3 * j) / 1000000;
            jM154781m = ((jM154781m * j4) + ((j - j4) * jM126047D)) / j;
        }
        if (!miy0Var.f134067j) {
            long j5 = miy0Var.f134050B;
            if (jM154781m > j5) {
                miy0Var.f134067j = true;
                int i6 = ggw0.f102568a;
                long jCurrentTimeMillis = System.currentTimeMillis() - ggw0.m126052I(ggw0.m126048E(ggw0.m126052I(jM154781m - j5), miy0Var.f134066i));
                dky0 dky0Var5 = ((gjy0) miy0Var.f134058a).f103111a;
                if (dky0Var5.f86754m != null) {
                    ((iky0) dky0Var5.f86754m).f113754a.f118427b1.m218746v(jCurrentTimeMillis);
                }
            }
        }
        miy0Var.f134051C = jNanoTime2;
        miy0Var.f134050B = jM154781m;
        miy0Var.f134052D = zM136497f;
        return jM154781m;
    }

    /* JADX INFO: renamed from: b */
    public final void m154770b(long j) {
        this.f134083z = m154780l();
        this.f134081x = ggw0.m126049F(SystemClock.elapsedRealtime());
        this.f134049A = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m154771c() {
        m154782n();
        this.f134060c = null;
        this.f134062e = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX INFO: renamed from: d */
    public final void m154772d(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.f134060c = audioTrack;
        this.f134061d = i3;
        this.f134062e = new iiy0(audioTrack);
        this.f134063f = audioTrack.getSampleRate();
        if (!z || ggw0.f102568a >= 23) {
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
        this.f134064g = z2;
        boolean zM126066h = ggw0.m126066h(i);
        this.f134073p = zM126066h;
        this.f134065h = zM126066h ? ggw0.m126050G(i3 / i2, this.f134063f) : -9223372036854775807L;
        this.f134076s = 0L;
        this.f134077t = 0L;
        this.f134055G = false;
        this.f134056H = 0L;
        this.f134078u = 0L;
        this.f134072o = false;
        this.f134081x = -9223372036854775807L;
        this.f134082y = -9223372036854775807L;
        this.f134074q = 0L;
        this.f134071n = 0L;
        this.f134066i = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m154773e(g6v0 g6v0Var) {
        this.f134057I = g6v0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m154774f() {
        if (this.f134081x != -9223372036854775807L) {
            this.f134081x = ggw0.m126049F(SystemClock.elapsedRealtime());
        }
        iiy0 iiy0Var = this.f134062e;
        iiy0Var.getClass();
        iiy0Var.m136496e();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m154775g(long j) {
        if (j > ggw0.m126046C(m154769a(false), this.f134063f)) {
            return true;
        }
        if (this.f134064g) {
            AudioTrack audioTrack = this.f134060c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && m154780l() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m154776h() {
        AudioTrack audioTrack = this.f134060c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m154777i(long j) {
        return this.f134082y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f134082y >= 200;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m154778j(long j) {
        AudioTrack audioTrack = this.f134060c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f134064g) {
            if (playState == 2) {
                this.f134072o = false;
                return false;
            }
            if (playState == 1) {
                if (m154780l() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f134072o;
        boolean zM154775g = m154775g(j);
        this.f134072o = zM154775g;
        if (z && !zM154775g && playState != 1) {
            kiy0 kiy0Var = this.f134058a;
            int i = this.f134061d;
            long jM126052I = ggw0.m126052I(this.f134065h);
            gjy0 gjy0Var = (gjy0) kiy0Var;
            dky0 dky0Var = gjy0Var.f103111a;
            if (dky0Var.f86754m != null) {
                ((iky0) gjy0Var.f103111a.f86754m).f113754a.f118427b1.m218748x(i, jM126052I, SystemClock.elapsedRealtime() - dky0Var.f86734P);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m154779k() {
        m154782n();
        if (this.f134081x != -9223372036854775807L) {
            this.f134083z = m154780l();
            return false;
        }
        iiy0 iiy0Var = this.f134062e;
        iiy0Var.getClass();
        iiy0Var.m136496e();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX INFO: renamed from: l */
    public final long m154780l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.f134081x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f134060c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f134083z;
            }
            return Math.min(this.f134049A, this.f134083z + ggw0.m126046C(ggw0.m126047D(ggw0.m126049F(jElapsedRealtime) - this.f134081x, this.f134066i), this.f134063f));
        }
        if (jElapsedRealtime - this.f134075r >= 5) {
            AudioTrack audioTrack2 = this.f134060c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                long j = 0;
                if (this.f134064g) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.f134078u = this.f134076s;
                    }
                    playbackHeadPosition += this.f134078u;
                    playState = i;
                }
                if (ggw0.f102568a > 29) {
                    if (this.f134076s > playbackHeadPosition) {
                        this.f134077t++;
                    }
                    this.f134076s = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.f134076s > 0 && playState == 3) {
                        if (this.f134082y == -9223372036854775807L) {
                            this.f134082y = jElapsedRealtime;
                        }
                    }
                    this.f134082y = -9223372036854775807L;
                    playbackHeadPosition = j;
                    if (this.f134076s > playbackHeadPosition) {
                        this.f134077t++;
                    }
                    this.f134076s = playbackHeadPosition;
                }
            }
            this.f134075r = jElapsedRealtime;
        }
        return this.f134076s + this.f134056H + (this.f134077t << 32);
    }

    /* JADX INFO: renamed from: m */
    public final long m154781m() {
        return ggw0.m126050G(m154780l(), this.f134063f);
    }

    /* JADX INFO: renamed from: n */
    public final void m154782n() {
        this.f134068k = 0L;
        this.f134080w = 0;
        this.f134079v = 0;
        this.f134069l = 0L;
        this.f134051C = 0L;
        this.f134054F = 0L;
        this.f134067j = false;
    }
}
