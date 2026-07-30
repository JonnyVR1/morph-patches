package p149l;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class iiy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final giy0 f113470a;

    /* JADX INFO: renamed from: b */
    public int f113471b;

    /* JADX INFO: renamed from: c */
    public long f113472c;

    /* JADX INFO: renamed from: d */
    public long f113473d;

    /* JADX INFO: renamed from: e */
    public long f113474e;

    /* JADX INFO: renamed from: f */
    public long f113475f;

    public iiy0(AudioTrack audioTrack) {
        int i = ggw0.f102568a;
        this.f113470a = new giy0(audioTrack);
        m136499h(0);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public final long m136492a() {
        return this.f113470a.m126418a();
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: b */
    public final long m136493b() {
        return this.f113470a.m126419b();
    }

    /* JADX INFO: renamed from: c */
    public final void m136494c() {
        if (this.f113471b == 4) {
            m136499h(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m136495d() {
        m136499h(4);
    }

    /* JADX INFO: renamed from: e */
    public final void m136496e() {
        m136499h(0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m136497f() {
        return this.f113471b == 2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: g */
    public final boolean m136498g(long j) {
        if (j - this.f113474e < this.f113473d) {
            return false;
        }
        giy0 giy0Var = this.f113470a;
        this.f113474e = j;
        boolean zM126420c = giy0Var.m126420c();
        int i = this.f113471b;
        if (i == 0) {
            if (!zM126420c) {
                if (j - this.f113472c <= 500000) {
                    return false;
                }
                m136499h(3);
                return false;
            }
            if (this.f113470a.m126419b() < this.f113472c) {
                return false;
            }
            this.f113475f = this.f113470a.m126418a();
            m136499h(1);
            return true;
        }
        if (i == 1) {
            if (!zM126420c) {
                m136499h(0);
                return false;
            }
            if (this.f113470a.m126418a() <= this.f113475f) {
                return true;
            }
            m136499h(2);
            return true;
        }
        if (i == 2) {
            if (zM126420c) {
                return true;
            }
            m136499h(0);
            return false;
        }
        if (i != 3) {
            return zM126420c;
        }
        if (!zM126420c) {
            return false;
        }
        m136499h(0);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m136499h(int i) {
        this.f113471b = i;
        long j = 10000;
        if (i == 0) {
            this.f113474e = 0L;
            this.f113475f = -1L;
            this.f113472c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f113473d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f113473d = j;
    }
}
