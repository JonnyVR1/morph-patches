package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.reflect.Method;
import p149l.id1;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1821d {

    /* JADX INFO: renamed from: A */
    public long f7169A;

    /* JADX INFO: renamed from: B */
    public long f7170B;

    /* JADX INFO: renamed from: C */
    public long f7171C;

    /* JADX INFO: renamed from: D */
    public long f7172D;

    /* JADX INFO: renamed from: E */
    public boolean f7173E;

    /* JADX INFO: renamed from: F */
    public long f7174F;

    /* JADX INFO: renamed from: G */
    public long f7175G;

    /* JADX INFO: renamed from: a */
    public final a f7176a;

    /* JADX INFO: renamed from: b */
    public final long[] f7177b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AudioTrack f7178c;

    /* JADX INFO: renamed from: d */
    public int f7179d;

    /* JADX INFO: renamed from: e */
    public int f7180e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public id1 f7181f;

    /* JADX INFO: renamed from: g */
    public int f7182g;

    /* JADX INFO: renamed from: h */
    public boolean f7183h;

    /* JADX INFO: renamed from: i */
    public long f7184i;

    /* JADX INFO: renamed from: j */
    public float f7185j;

    /* JADX INFO: renamed from: k */
    public boolean f7186k;

    /* JADX INFO: renamed from: l */
    public long f7187l;

    /* JADX INFO: renamed from: m */
    public long f7188m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public Method f7189n;

    /* JADX INFO: renamed from: o */
    public long f7190o;

    /* JADX INFO: renamed from: p */
    public boolean f7191p;

    /* JADX INFO: renamed from: q */
    public boolean f7192q;

    /* JADX INFO: renamed from: r */
    public long f7193r;

    /* JADX INFO: renamed from: s */
    public long f7194s;

    /* JADX INFO: renamed from: t */
    public long f7195t;

    /* JADX INFO: renamed from: u */
    public long f7196u;

    /* JADX INFO: renamed from: v */
    public long f7197v;

    /* JADX INFO: renamed from: w */
    public int f7198w;

    /* JADX INFO: renamed from: x */
    public int f7199x;

    /* JADX INFO: renamed from: y */
    public long f7200y;

    /* JADX INFO: renamed from: z */
    public long f7201z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9524a(long j, long j2, long j3, long j4);

        /* JADX INFO: renamed from: b */
        void mo9525b(long j, long j2, long j3, long j4);

        /* JADX INFO: renamed from: c */
        void mo9526c(long j);

        /* JADX INFO: renamed from: d */
        void mo9527d(int i, long j);

        /* JADX INFO: renamed from: e */
        void mo9528e(long j);
    }

    public C1821d(a aVar) {
        this.f7176a = (a) p11.m167011e(aVar);
        if (vck0.f180948a >= 18) {
            try {
                this.f7189n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7177b = new long[10];
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9582n(int i) {
        if (vck0.f180948a < 23) {
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9583a() {
        return this.f7183h && ((AudioTrack) p11.m167011e(this.f7178c)).getPlayState() == 2 && m9586d() == 0;
    }

    /* JADX INFO: renamed from: b */
    public int m9584b(long j) {
        return this.f7180e - ((int) (j - (m9586d() * ((long) this.f7179d))));
    }

    /* JADX INFO: renamed from: c */
    public long m9585c(boolean z) {
        long jM9587e;
        if (((AudioTrack) p11.m167011e(this.f7178c)).getPlayState() == 3) {
            m9594l();
        }
        long jNanoTime = System.nanoTime() / 1000;
        id1 id1Var = (id1) p11.m167011e(this.f7181f);
        boolean zM135377d = id1Var.m135377d();
        if (zM135377d) {
            jM9587e = vck0.m197830V0(id1Var.m135375b(), this.f7182g) + vck0.m197849d0(jNanoTime - id1Var.m135376c(), this.f7185j);
        } else {
            jM9587e = this.f7199x == 0 ? m9587e() : vck0.m197849d0(this.f7187l + jNanoTime, this.f7185j);
            if (!z) {
                jM9587e = Math.max(0L, jM9587e - this.f7190o);
            }
        }
        if (this.f7173E != zM135377d) {
            this.f7175G = this.f7172D;
            this.f7174F = this.f7171C;
        }
        long j = jNanoTime - this.f7175G;
        if (j < 1000000) {
            long jM197849d0 = this.f7174F + vck0.m197849d0(j, this.f7185j);
            long j2 = (j * 1000) / 1000000;
            jM9587e = ((jM9587e * j2) + ((1000 - j2) * jM197849d0)) / 1000;
        }
        if (!this.f7186k) {
            long j3 = this.f7171C;
            if (jM9587e > j3) {
                this.f7186k = true;
                this.f7176a.mo9526c(System.currentTimeMillis() - vck0.m197874l1(vck0.m197864i0(vck0.m197874l1(jM9587e - j3), this.f7185j)));
            }
        }
        this.f7172D = jNanoTime;
        this.f7171C = jM9587e;
        this.f7173E = zM135377d;
        return jM9587e;
    }

    /* JADX INFO: renamed from: d */
    public final long m9586d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f7200y;
        if (j != -9223372036854775807L) {
            return Math.min(this.f7170B, this.f7169A + vck0.m197789B(vck0.m197849d0((jElapsedRealtime * 1000) - j, this.f7185j), this.f7182g));
        }
        if (jElapsedRealtime - this.f7194s >= 5) {
            m9602u(jElapsedRealtime);
            this.f7194s = jElapsedRealtime;
        }
        return this.f7195t + (this.f7196u << 32);
    }

    /* JADX INFO: renamed from: e */
    public final long m9587e() {
        return vck0.m197830V0(m9586d(), this.f7182g);
    }

    /* JADX INFO: renamed from: f */
    public void m9588f(long j) {
        this.f7169A = m9586d();
        this.f7200y = SystemClock.elapsedRealtime() * 1000;
        this.f7170B = j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m9589g(long j) {
        return j > vck0.m197789B(m9585c(false), this.f7182g) || m9583a();
    }

    /* JADX INFO: renamed from: h */
    public boolean m9590h() {
        return ((AudioTrack) p11.m167011e(this.f7178c)).getPlayState() == 3;
    }

    /* JADX INFO: renamed from: i */
    public boolean m9591i(long j) {
        return this.f7201z != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f7201z >= 200;
    }

    /* JADX INFO: renamed from: j */
    public boolean m9592j(long j) {
        int playState = ((AudioTrack) p11.m167011e(this.f7178c)).getPlayState();
        if (this.f7183h) {
            if (playState == 2) {
                this.f7191p = false;
                return false;
            }
            if (playState == 1 && m9586d() == 0) {
                return false;
            }
        }
        boolean z = this.f7191p;
        boolean zM9589g = m9589g(j);
        this.f7191p = zM9589g;
        if (z && !zM9589g && playState != 1) {
            this.f7176a.mo9527d(this.f7180e, vck0.m197874l1(this.f7184i));
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m9593k(long j) {
        id1 id1Var = (id1) p11.m167011e(this.f7181f);
        if (id1Var.m135378e(j)) {
            long jM135376c = id1Var.m135376c();
            long jM135375b = id1Var.m135375b();
            long jM9587e = m9587e();
            if (Math.abs(jM135376c - j) > 5000000) {
                this.f7176a.mo9525b(jM135375b, jM135376c, j, jM9587e);
                id1Var.m135379f();
            } else if (Math.abs(vck0.m197830V0(jM135375b, this.f7182g) - jM9587e) <= 5000000) {
                id1Var.m135374a();
            } else {
                this.f7176a.mo9524a(jM135375b, jM135376c, j, jM9587e);
                id1Var.m135379f();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9594l() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f7188m >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            long jM9587e = m9587e();
            if (jM9587e != 0) {
                this.f7177b[this.f7198w] = vck0.m197864i0(jM9587e, this.f7185j) - jNanoTime;
                this.f7198w = (this.f7198w + 1) % 10;
                int i = this.f7199x;
                if (i < 10) {
                    this.f7199x = i + 1;
                }
                this.f7188m = jNanoTime;
                this.f7187l = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.f7199x;
                    if (i2 >= i3) {
                        break;
                    }
                    this.f7187l += this.f7177b[i2] / ((long) i3);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.f7183h) {
            return;
        }
        m9593k(jNanoTime);
        m9595m(jNanoTime);
    }

    /* JADX INFO: renamed from: m */
    public final void m9595m(long j) {
        Method method;
        if (!this.f7192q || (method = this.f7189n) == null || j - this.f7193r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) vck0.m197866j((Integer) method.invoke(p11.m167011e(this.f7178c), null))).intValue()) * 1000) - this.f7184i;
            this.f7190o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f7190o = jMax;
            if (jMax > 5000000) {
                this.f7176a.mo9528e(jMax);
                this.f7190o = 0L;
            }
        } catch (Exception unused) {
            this.f7189n = null;
        }
        this.f7193r = j;
    }

    /* JADX INFO: renamed from: o */
    public boolean m9596o() {
        m9598q();
        if (this.f7200y != -9223372036854775807L) {
            return false;
        }
        ((id1) p11.m167011e(this.f7181f)).m135380g();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m9597p() {
        m9598q();
        this.f7178c = null;
        this.f7181f = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m9598q() {
        this.f7187l = 0L;
        this.f7199x = 0;
        this.f7198w = 0;
        this.f7188m = 0L;
        this.f7172D = 0L;
        this.f7175G = 0L;
        this.f7186k = false;
    }

    /* JADX INFO: renamed from: r */
    public void m9599r(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f7178c = audioTrack;
        this.f7179d = i2;
        this.f7180e = i3;
        this.f7181f = new id1(audioTrack);
        this.f7182g = audioTrack.getSampleRate();
        this.f7183h = z && m9582n(i);
        boolean zM197792C0 = vck0.m197792C0(i);
        this.f7192q = zM197792C0;
        this.f7184i = zM197792C0 ? vck0.m197830V0(i3 / i2, this.f7182g) : -9223372036854775807L;
        this.f7195t = 0L;
        this.f7196u = 0L;
        this.f7197v = 0L;
        this.f7191p = false;
        this.f7200y = -9223372036854775807L;
        this.f7201z = -9223372036854775807L;
        this.f7193r = 0L;
        this.f7190o = 0L;
        this.f7185j = 1.0f;
    }

    /* JADX INFO: renamed from: s */
    public void m9600s(float f) {
        this.f7185j = f;
        id1 id1Var = this.f7181f;
        if (id1Var != null) {
            id1Var.m135380g();
        }
        m9598q();
    }

    /* JADX INFO: renamed from: t */
    public void m9601t() {
        ((id1) p11.m167011e(this.f7181f)).m135380g();
    }

    /* JADX INFO: renamed from: u */
    public final void m9602u(long j) {
        AudioTrack audioTrack = (AudioTrack) p11.m167011e(this.f7178c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f7183h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7197v = this.f7195t;
            }
            playbackHeadPosition += this.f7197v;
        }
        if (vck0.f180948a <= 29) {
            if (playbackHeadPosition == 0 && this.f7195t > 0 && playState == 3) {
                if (this.f7201z == -9223372036854775807L) {
                    this.f7201z = j;
                    return;
                }
                return;
            }
            this.f7201z = -9223372036854775807L;
        }
        if (this.f7195t > playbackHeadPosition) {
            this.f7196u++;
        }
        this.f7195t = playbackHeadPosition;
    }
}
