package p153l;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pd1 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C19352a f151677a;

    /* JADX INFO: renamed from: b */
    public int f151678b;

    /* JADX INFO: renamed from: c */
    public long f151679c;

    /* JADX INFO: renamed from: d */
    public long f151680d;

    /* JADX INFO: renamed from: e */
    public long f151681e;

    /* JADX INFO: renamed from: f */
    public long f151682f;

    /* JADX INFO: renamed from: l.pd1$a */
    @RequiresApi(19)
    public static final class C19352a {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f151683a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f151684b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f151685c;

        /* JADX INFO: renamed from: d */
        public long f151686d;

        /* JADX INFO: renamed from: e */
        public long f151687e;

        public C19352a(AudioTrack audioTrack) {
            this.f151683a = audioTrack;
        }

        /* JADX INFO: renamed from: a */
        public long m171757a() {
            return this.f151687e;
        }

        /* JADX INFO: renamed from: b */
        public long m171758b() {
            return this.f151684b.nanoTime / 1000;
        }

        /* JADX INFO: renamed from: c */
        public boolean m171759c() {
            boolean timestamp = this.f151683a.getTimestamp(this.f151684b);
            if (timestamp) {
                long j = this.f151684b.framePosition;
                if (this.f151686d > j) {
                    this.f151685c++;
                }
                this.f151686d = j;
                this.f151687e = j + (this.f151685c << 32);
            }
            return timestamp;
        }
    }

    public pd1(AudioTrack audioTrack) {
        if (bmk0.f77313a >= 19) {
            this.f151677a = new C19352a(audioTrack);
            m171755g();
        } else {
            this.f151677a = null;
            m171756h(3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m171749a() {
        if (this.f151678b == 4) {
            m171755g();
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: b */
    public long m171750b() {
        C19352a c19352a = this.f151677a;
        if (c19352a != null) {
            return c19352a.m171757a();
        }
        return -1L;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public long m171751c() {
        C19352a c19352a = this.f151677a;
        if (c19352a != null) {
            return c19352a.m171758b();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public boolean m171752d() {
        return this.f151678b == 2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public boolean m171753e(long j) {
        C19352a c19352a = this.f151677a;
        if (c19352a == null || j - this.f151681e < this.f151680d) {
            return false;
        }
        this.f151681e = j;
        boolean zM171759c = c19352a.m171759c();
        int i = this.f151678b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            wpg0.m207458a();
                            return false;
                        }
                    } else if (zM171759c) {
                        m171755g();
                        return zM171759c;
                    }
                } else if (!zM171759c) {
                    m171755g();
                    return zM171759c;
                }
            } else {
                if (!zM171759c) {
                    m171755g();
                    return zM171759c;
                }
                if (this.f151677a.m171757a() > this.f151682f) {
                    m171756h(2);
                    return zM171759c;
                }
            }
        } else {
            if (zM171759c) {
                if (this.f151677a.m171758b() < this.f151679c) {
                    return false;
                }
                this.f151682f = this.f151677a.m171757a();
                m171756h(1);
                return zM171759c;
            }
            if (j - this.f151679c > 500000) {
                m171756h(3);
            }
        }
        return zM171759c;
    }

    /* JADX INFO: renamed from: f */
    public void m171754f() {
        m171756h(4);
    }

    /* JADX INFO: renamed from: g */
    public void m171755g() {
        if (this.f151677a != null) {
            m171756h(0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m171756h(int i) {
        this.f151678b = i;
        if (i == 0) {
            this.f151681e = 0L;
            this.f151682f = -1L;
            this.f151679c = System.nanoTime() / 1000;
            this.f151680d = 10000L;
            return;
        }
        if (i == 1) {
            this.f151680d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f151680d = 10000000L;
        } else if (i == 4) {
            this.f151680d = 500000L;
        } else {
            wpg0.m207458a();
        }
    }
}
