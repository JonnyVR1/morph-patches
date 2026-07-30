package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.reflect.Method;
import p153l.bmk0;
import p153l.pd1;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1844d {

    /* JADX INFO: renamed from: A */
    public long f7206A;

    /* JADX INFO: renamed from: B */
    public long f7207B;

    /* JADX INFO: renamed from: C */
    public long f7208C;

    /* JADX INFO: renamed from: D */
    public long f7209D;

    /* JADX INFO: renamed from: E */
    public boolean f7210E;

    /* JADX INFO: renamed from: F */
    public long f7211F;

    /* JADX INFO: renamed from: G */
    public long f7212G;

    /* JADX INFO: renamed from: a */
    public final a f7213a;

    /* JADX INFO: renamed from: b */
    public final long[] f7214b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AudioTrack f7215c;

    /* JADX INFO: renamed from: d */
    public int f7216d;

    /* JADX INFO: renamed from: e */
    public int f7217e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public pd1 f7218f;

    /* JADX INFO: renamed from: g */
    public int f7219g;

    /* JADX INFO: renamed from: h */
    public boolean f7220h;

    /* JADX INFO: renamed from: i */
    public long f7221i;

    /* JADX INFO: renamed from: j */
    public float f7222j;

    /* JADX INFO: renamed from: k */
    public boolean f7223k;

    /* JADX INFO: renamed from: l */
    public long f7224l;

    /* JADX INFO: renamed from: m */
    public long f7225m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public Method f7226n;

    /* JADX INFO: renamed from: o */
    public long f7227o;

    /* JADX INFO: renamed from: p */
    public boolean f7228p;

    /* JADX INFO: renamed from: q */
    public boolean f7229q;

    /* JADX INFO: renamed from: r */
    public long f7230r;

    /* JADX INFO: renamed from: s */
    public long f7231s;

    /* JADX INFO: renamed from: t */
    public long f7232t;

    /* JADX INFO: renamed from: u */
    public long f7233u;

    /* JADX INFO: renamed from: v */
    public long f7234v;

    /* JADX INFO: renamed from: w */
    public int f7235w;

    /* JADX INFO: renamed from: x */
    public int f7236x;

    /* JADX INFO: renamed from: y */
    public long f7237y;

    /* JADX INFO: renamed from: z */
    public long f7238z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9578a(long j, long j2, long j3, long j4);

        /* JADX INFO: renamed from: b */
        void mo9579b(long j, long j2, long j3, long j4);

        /* JADX INFO: renamed from: c */
        void mo9580c(long j);

        /* JADX INFO: renamed from: d */
        void mo9581d(int i, long j);

        /* JADX INFO: renamed from: e */
        void mo9582e(long j);
    }

    public C1844d(a aVar) {
        this.f7213a = (a) w11.m204369e(aVar);
        if (bmk0.f77313a >= 18) {
            try {
                this.f7226n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7214b = new long[10];
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9636n(int i) {
        if (bmk0.f77313a < 23) {
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9637a() {
        return this.f7220h && ((AudioTrack) w11.m204369e(this.f7215c)).getPlayState() == 2 && m9640d() == 0;
    }

    /* JADX INFO: renamed from: b */
    public int m9638b(long j) {
        return this.f7217e - ((int) (j - (m9640d() * ((long) this.f7216d))));
    }

    /* JADX INFO: renamed from: c */
    public long m9639c(boolean z) {
        long jM9641e;
        if (((AudioTrack) w11.m204369e(this.f7215c)).getPlayState() == 3) {
            m9648l();
        }
        long jNanoTime = System.nanoTime() / 1000;
        pd1 pd1Var = (pd1) w11.m204369e(this.f7218f);
        boolean zM171752d = pd1Var.m171752d();
        if (zM171752d) {
            jM9641e = bmk0.m105108V0(pd1Var.m171750b(), this.f7219g) + bmk0.m105127d0(jNanoTime - pd1Var.m171751c(), this.f7222j);
        } else {
            jM9641e = this.f7236x == 0 ? m9641e() : bmk0.m105127d0(this.f7224l + jNanoTime, this.f7222j);
            if (!z) {
                jM9641e = Math.max(0L, jM9641e - this.f7227o);
            }
        }
        if (this.f7210E != zM171752d) {
            this.f7212G = this.f7209D;
            this.f7211F = this.f7208C;
        }
        long j = jNanoTime - this.f7212G;
        if (j < 1000000) {
            long jM105127d0 = this.f7211F + bmk0.m105127d0(j, this.f7222j);
            long j2 = (j * 1000) / 1000000;
            jM9641e = ((jM9641e * j2) + ((1000 - j2) * jM105127d0)) / 1000;
        }
        if (!this.f7223k) {
            long j3 = this.f7208C;
            if (jM9641e > j3) {
                this.f7223k = true;
                this.f7213a.mo9580c(System.currentTimeMillis() - bmk0.m105152l1(bmk0.m105142i0(bmk0.m105152l1(jM9641e - j3), this.f7222j)));
            }
        }
        this.f7209D = jNanoTime;
        this.f7208C = jM9641e;
        this.f7210E = zM171752d;
        return jM9641e;
    }

    /* JADX INFO: renamed from: d */
    public final long m9640d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f7237y;
        if (j != -9223372036854775807L) {
            return Math.min(this.f7207B, this.f7206A + bmk0.m105067B(bmk0.m105127d0((jElapsedRealtime * 1000) - j, this.f7222j), this.f7219g));
        }
        if (jElapsedRealtime - this.f7231s >= 5) {
            m9656u(jElapsedRealtime);
            this.f7231s = jElapsedRealtime;
        }
        return this.f7232t + (this.f7233u << 32);
    }

    /* JADX INFO: renamed from: e */
    public final long m9641e() {
        return bmk0.m105108V0(m9640d(), this.f7219g);
    }

    /* JADX INFO: renamed from: f */
    public void m9642f(long j) {
        this.f7206A = m9640d();
        this.f7237y = SystemClock.elapsedRealtime() * 1000;
        this.f7207B = j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m9643g(long j) {
        return j > bmk0.m105067B(m9639c(false), this.f7219g) || m9637a();
    }

    /* JADX INFO: renamed from: h */
    public boolean m9644h() {
        return ((AudioTrack) w11.m204369e(this.f7215c)).getPlayState() == 3;
    }

    /* JADX INFO: renamed from: i */
    public boolean m9645i(long j) {
        return this.f7238z != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f7238z >= 200;
    }

    /* JADX INFO: renamed from: j */
    public boolean m9646j(long j) {
        int playState = ((AudioTrack) w11.m204369e(this.f7215c)).getPlayState();
        if (this.f7220h) {
            if (playState == 2) {
                this.f7228p = false;
                return false;
            }
            if (playState == 1 && m9640d() == 0) {
                return false;
            }
        }
        boolean z = this.f7228p;
        boolean zM9643g = m9643g(j);
        this.f7228p = zM9643g;
        if (z && !zM9643g && playState != 1) {
            this.f7213a.mo9581d(this.f7217e, bmk0.m105152l1(this.f7221i));
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m9647k(long j) {
        pd1 pd1Var = (pd1) w11.m204369e(this.f7218f);
        if (pd1Var.m171753e(j)) {
            long jM171751c = pd1Var.m171751c();
            long jM171750b = pd1Var.m171750b();
            long jM9641e = m9641e();
            if (Math.abs(jM171751c - j) > 5000000) {
                this.f7213a.mo9579b(jM171750b, jM171751c, j, jM9641e);
                pd1Var.m171754f();
            } else if (Math.abs(bmk0.m105108V0(jM171750b, this.f7219g) - jM9641e) <= 5000000) {
                pd1Var.m171749a();
            } else {
                this.f7213a.mo9578a(jM171750b, jM171751c, j, jM9641e);
                pd1Var.m171754f();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9648l() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f7225m >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            long jM9641e = m9641e();
            if (jM9641e != 0) {
                this.f7214b[this.f7235w] = bmk0.m105142i0(jM9641e, this.f7222j) - jNanoTime;
                this.f7235w = (this.f7235w + 1) % 10;
                int i = this.f7236x;
                if (i < 10) {
                    this.f7236x = i + 1;
                }
                this.f7225m = jNanoTime;
                this.f7224l = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.f7236x;
                    if (i2 >= i3) {
                        break;
                    }
                    this.f7224l += this.f7214b[i2] / ((long) i3);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.f7220h) {
            return;
        }
        m9647k(jNanoTime);
        m9649m(jNanoTime);
    }

    /* JADX INFO: renamed from: m */
    public final void m9649m(long j) {
        Method method;
        if (!this.f7229q || (method = this.f7226n) == null || j - this.f7230r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) bmk0.m105144j((Integer) method.invoke(w11.m204369e(this.f7215c), null))).intValue()) * 1000) - this.f7221i;
            this.f7227o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f7227o = jMax;
            if (jMax > 5000000) {
                this.f7213a.mo9582e(jMax);
                this.f7227o = 0L;
            }
        } catch (Exception unused) {
            this.f7226n = null;
        }
        this.f7230r = j;
    }

    /* JADX INFO: renamed from: o */
    public boolean m9650o() {
        m9652q();
        if (this.f7237y != -9223372036854775807L) {
            return false;
        }
        ((pd1) w11.m204369e(this.f7218f)).m171755g();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m9651p() {
        m9652q();
        this.f7215c = null;
        this.f7218f = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m9652q() {
        this.f7224l = 0L;
        this.f7236x = 0;
        this.f7235w = 0;
        this.f7225m = 0L;
        this.f7209D = 0L;
        this.f7212G = 0L;
        this.f7223k = false;
    }

    /* JADX INFO: renamed from: r */
    public void m9653r(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f7215c = audioTrack;
        this.f7216d = i2;
        this.f7217e = i3;
        this.f7218f = new pd1(audioTrack);
        this.f7219g = audioTrack.getSampleRate();
        this.f7220h = z && m9636n(i);
        boolean zM105070C0 = bmk0.m105070C0(i);
        this.f7229q = zM105070C0;
        this.f7221i = zM105070C0 ? bmk0.m105108V0(i3 / i2, this.f7219g) : -9223372036854775807L;
        this.f7232t = 0L;
        this.f7233u = 0L;
        this.f7234v = 0L;
        this.f7228p = false;
        this.f7237y = -9223372036854775807L;
        this.f7238z = -9223372036854775807L;
        this.f7230r = 0L;
        this.f7227o = 0L;
        this.f7222j = 1.0f;
    }

    /* JADX INFO: renamed from: s */
    public void m9654s(float f) {
        this.f7222j = f;
        pd1 pd1Var = this.f7218f;
        if (pd1Var != null) {
            pd1Var.m171755g();
        }
        m9652q();
    }

    /* JADX INFO: renamed from: t */
    public void m9655t() {
        ((pd1) w11.m204369e(this.f7218f)).m171755g();
    }

    /* JADX INFO: renamed from: u */
    public final void m9656u(long j) {
        AudioTrack audioTrack = (AudioTrack) w11.m204369e(this.f7215c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f7220h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7234v = this.f7232t;
            }
            playbackHeadPosition += this.f7234v;
        }
        if (bmk0.f77313a <= 29) {
            if (playbackHeadPosition == 0 && this.f7232t > 0 && playState == 3) {
                if (this.f7238z == -9223372036854775807L) {
                    this.f7238z = j;
                    return;
                }
                return;
            }
            this.f7238z = -9223372036854775807L;
        }
        if (this.f7232t > playbackHeadPosition) {
            this.f7233u++;
        }
        this.f7232t = playbackHeadPosition;
    }
}
