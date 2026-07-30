package p149l;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class id1 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C17521a f112503a;

    /* JADX INFO: renamed from: b */
    public int f112504b;

    /* JADX INFO: renamed from: c */
    public long f112505c;

    /* JADX INFO: renamed from: d */
    public long f112506d;

    /* JADX INFO: renamed from: e */
    public long f112507e;

    /* JADX INFO: renamed from: f */
    public long f112508f;

    /* JADX INFO: renamed from: l.id1$a */
    @RequiresApi(19)
    public static final class C17521a {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f112509a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f112510b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f112511c;

        /* JADX INFO: renamed from: d */
        public long f112512d;

        /* JADX INFO: renamed from: e */
        public long f112513e;

        public C17521a(AudioTrack audioTrack) {
            this.f112509a = audioTrack;
        }

        /* JADX INFO: renamed from: a */
        public long m135382a() {
            return this.f112513e;
        }

        /* JADX INFO: renamed from: b */
        public long m135383b() {
            return this.f112510b.nanoTime / 1000;
        }

        /* JADX INFO: renamed from: c */
        public boolean m135384c() {
            boolean timestamp = this.f112509a.getTimestamp(this.f112510b);
            if (timestamp) {
                long j = this.f112510b.framePosition;
                if (this.f112512d > j) {
                    this.f112511c++;
                }
                this.f112512d = j;
                this.f112513e = j + (this.f112511c << 32);
            }
            return timestamp;
        }
    }

    public id1(AudioTrack audioTrack) {
        if (vck0.f180948a >= 19) {
            this.f112503a = new C17521a(audioTrack);
            m135380g();
        } else {
            this.f112503a = null;
            m135381h(3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m135374a() {
        if (this.f112504b == 4) {
            m135380g();
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: b */
    public long m135375b() {
        C17521a c17521a = this.f112503a;
        if (c17521a != null) {
            return c17521a.m135382a();
        }
        return -1L;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public long m135376c() {
        C17521a c17521a = this.f112503a;
        if (c17521a != null) {
            return c17521a.m135383b();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public boolean m135377d() {
        return this.f112504b == 2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public boolean m135378e(long j) {
        C17521a c17521a = this.f112503a;
        if (c17521a == null || j - this.f112507e < this.f112506d) {
            return false;
        }
        this.f112507e = j;
        boolean zM135384c = c17521a.m135384c();
        int i = this.f112504b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ohg0.m164364a();
                            return false;
                        }
                    } else if (zM135384c) {
                        m135380g();
                        return zM135384c;
                    }
                } else if (!zM135384c) {
                    m135380g();
                    return zM135384c;
                }
            } else {
                if (!zM135384c) {
                    m135380g();
                    return zM135384c;
                }
                if (this.f112503a.m135382a() > this.f112508f) {
                    m135381h(2);
                    return zM135384c;
                }
            }
        } else {
            if (zM135384c) {
                if (this.f112503a.m135383b() < this.f112505c) {
                    return false;
                }
                this.f112508f = this.f112503a.m135382a();
                m135381h(1);
                return zM135384c;
            }
            if (j - this.f112505c > 500000) {
                m135381h(3);
            }
        }
        return zM135384c;
    }

    /* JADX INFO: renamed from: f */
    public void m135379f() {
        m135381h(4);
    }

    /* JADX INFO: renamed from: g */
    public void m135380g() {
        if (this.f112503a != null) {
            m135381h(0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m135381h(int i) {
        this.f112504b = i;
        if (i == 0) {
            this.f112507e = 0L;
            this.f112508f = -1L;
            this.f112505c = System.nanoTime() / 1000;
            this.f112506d = 10000L;
            return;
        }
        if (i == 1) {
            this.f112506d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f112506d = 10000000L;
        } else if (i == 4) {
            this.f112506d = 500000L;
        } else {
            ohg0.m164364a();
        }
    }
}
