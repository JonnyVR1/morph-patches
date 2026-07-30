package p153l;

import android.animation.TimeInterpolator;
import p153l.yol;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hqf<T extends yol> implements Cloneable {

    /* JADX INFO: renamed from: a */
    protected T f111117a;

    /* JADX INFO: renamed from: c */
    protected TimeInterpolator f111119c;

    /* JADX INFO: renamed from: d */
    protected long f111120d;

    /* JADX INFO: renamed from: f */
    protected boolean f111122f;

    /* JADX INFO: renamed from: b */
    protected long f111118b = 0;

    /* JADX INFO: renamed from: e */
    protected long f111121e = -1;

    public hqf(T t) {
        this.f111117a = t;
    }

    /* JADX INFO: renamed from: a */
    public boolean m136619a(long j) {
        if (!this.f111122f) {
            return false;
        }
        if (this.f111121e == -1) {
            this.f111121e = j;
        }
        long j2 = (j - this.f111121e) - this.f111120d;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f111118b;
        float fM136620b = m136620b(j3 > 0 ? j2 / j3 : 1.0f);
        TimeInterpolator timeInterpolator = this.f111119c;
        if (timeInterpolator != null) {
            fM136620b = timeInterpolator.getInterpolation(fM136620b);
        }
        mo131372d(fM136620b);
        if (fM136620b < 1.0f) {
            return true;
        }
        m136625k();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public float m136620b(float f) {
        return Math.max(0.0f, Math.min(f, 1.0f));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public hqf clone() {
        try {
            return (hqf) super.clone();
        } catch (CloneNotSupportedException unused) {
            aqg0.m99478a();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo131372d(float f);

    /* JADX INFO: renamed from: e */
    public hqf m136622e(long j) {
        this.f111118b = j;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public hqf m136623f(long j) {
        this.f111120d = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m136624j() {
        this.f111122f = true;
        this.f111121e = 0L;
    }

    /* JADX INFO: renamed from: k */
    public void m136625k() {
        this.f111122f = false;
        this.f111121e = -1L;
    }
}
