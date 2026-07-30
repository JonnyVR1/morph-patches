package p153l;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ory0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final mry0 f148772a;

    /* JADX INFO: renamed from: b */
    public int f148773b;

    /* JADX INFO: renamed from: c */
    public long f148774c;

    /* JADX INFO: renamed from: d */
    public long f148775d;

    /* JADX INFO: renamed from: e */
    public long f148776e;

    /* JADX INFO: renamed from: f */
    public long f148777f;

    public ory0(AudioTrack audioTrack) {
        int i = mpw0.f137957a;
        this.f148772a = new mry0(audioTrack);
        m168955h(0);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public final long m168948a() {
        return this.f148772a.m159716a();
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: b */
    public final long m168949b() {
        return this.f148772a.m159717b();
    }

    /* JADX INFO: renamed from: c */
    public final void m168950c() {
        if (this.f148773b == 4) {
            m168955h(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m168951d() {
        m168955h(4);
    }

    /* JADX INFO: renamed from: e */
    public final void m168952e() {
        m168955h(0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m168953f() {
        return this.f148773b == 2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: g */
    public final boolean m168954g(long j) {
        if (j - this.f148776e < this.f148775d) {
            return false;
        }
        mry0 mry0Var = this.f148772a;
        this.f148776e = j;
        boolean zM159718c = mry0Var.m159718c();
        int i = this.f148773b;
        if (i == 0) {
            if (!zM159718c) {
                if (j - this.f148774c <= 500000) {
                    return false;
                }
                m168955h(3);
                return false;
            }
            if (this.f148772a.m159717b() < this.f148774c) {
                return false;
            }
            this.f148777f = this.f148772a.m159716a();
            m168955h(1);
            return true;
        }
        if (i == 1) {
            if (!zM159718c) {
                m168955h(0);
                return false;
            }
            if (this.f148772a.m159716a() <= this.f148777f) {
                return true;
            }
            m168955h(2);
            return true;
        }
        if (i == 2) {
            if (zM159718c) {
                return true;
            }
            m168955h(0);
            return false;
        }
        if (i != 3) {
            return zM159718c;
        }
        if (!zM159718c) {
            return false;
        }
        m168955h(0);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m168955h(int i) {
        this.f148773b = i;
        long j = 10000;
        if (i == 0) {
            this.f148776e = 0L;
            this.f148777f = -1L;
            this.f148774c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f148775d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f148775d = j;
    }
}
