package p149l;

import android.animation.TimeInterpolator;
import p149l.mml;

/* JADX INFO: loaded from: classes7.dex */
public abstract class apf<T extends mml> implements Cloneable {

    /* JADX INFO: renamed from: a */
    protected T f71029a;

    /* JADX INFO: renamed from: c */
    protected TimeInterpolator f71031c;

    /* JADX INFO: renamed from: d */
    protected long f71032d;

    /* JADX INFO: renamed from: f */
    protected boolean f71034f;

    /* JADX INFO: renamed from: b */
    protected long f71030b = 0;

    /* JADX INFO: renamed from: e */
    protected long f71033e = -1;

    public apf(T t) {
        this.f71029a = t;
    }

    /* JADX INFO: renamed from: a */
    public boolean m98109a(long j) {
        if (!this.f71034f) {
            return false;
        }
        if (this.f71033e == -1) {
            this.f71033e = j;
        }
        long j2 = (j - this.f71033e) - this.f71032d;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f71030b;
        float fM98110b = m98110b(j3 > 0 ? j2 / j3 : 1.0f);
        TimeInterpolator timeInterpolator = this.f71031c;
        if (timeInterpolator != null) {
            fM98110b = timeInterpolator.getInterpolation(fM98110b);
        }
        mo98112d(fM98110b);
        if (fM98110b < 1.0f) {
            return true;
        }
        m98116k();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public float m98110b(float f) {
        return Math.max(0.0f, Math.min(f, 1.0f));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public apf clone() {
        try {
            return (apf) super.clone();
        } catch (CloneNotSupportedException unused) {
            shg0.m184191a();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo98112d(float f);

    /* JADX INFO: renamed from: e */
    public apf m98113e(long j) {
        this.f71030b = j;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public apf m98114f(long j) {
        this.f71032d = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m98115j() {
        this.f71034f = true;
        this.f71033e = 0L;
    }

    /* JADX INFO: renamed from: k */
    public void m98116k() {
        this.f71034f = false;
        this.f71033e = -1L;
    }
}
