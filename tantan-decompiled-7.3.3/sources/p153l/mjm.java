package p153l;

import androidx.annotation.VisibleForTesting;
import com.facebook.fresco.p028ui.common.ImageLoadStatus;
import com.facebook.fresco.p028ui.common.VisibilityState;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class mjm extends ki2<qim> implements Closeable, xem0 {

    /* JADX INFO: renamed from: b */
    public final l610 f137104b;

    /* JADX INFO: renamed from: c */
    public final ljm f137105c;

    /* JADX INFO: renamed from: d */
    public final jjm f137106d;

    /* JADX INFO: renamed from: e */
    public jjm f137107e;

    /* JADX INFO: renamed from: f */
    public final boolean f137108f;

    public mjm(l610 l610Var, ljm ljmVar, jjm jjmVar, boolean z) {
        this.f137107e = null;
        this.f137104b = l610Var;
        this.f137105c = ljmVar;
        this.f137106d = jjmVar;
        this.f137108f = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m158592t();
    }

    @Override // p153l.ki2, p153l.u36
    /* JADX INFO: renamed from: d */
    public void mo149843d(String str, Throwable th, u36.C20477a c20477a) {
        long jNow = this.f137104b.now();
        ljm ljmVar = this.f137105c;
        ljmVar.m154533F(c20477a);
        ljmVar.m154550z(jNow);
        ljmVar.m154529B(str);
        ljmVar.m154532E(th);
        m158593u(ljmVar, ImageLoadStatus.ERROR);
        m158590n(ljmVar, jNow);
    }

    @Override // p153l.xem0
    /* JADX INFO: renamed from: g */
    public void mo158587g(boolean z) {
        ljm ljmVar = this.f137105c;
        if (z) {
            m158591q(ljmVar, this.f137104b.now());
        } else {
            m158590n(ljmVar, this.f137104b.now());
        }
    }

    @Override // p153l.ki2, p153l.u36
    /* JADX INFO: renamed from: i */
    public void mo149846i(String str, Object obj, u36.C20477a c20477a) {
        long jNow = this.f137104b.now();
        ljm ljmVar = this.f137105c;
        ljmVar.m154548x();
        ljmVar.m154531D(jNow);
        ljmVar.m154529B(str);
        ljmVar.m154549y(obj);
        ljmVar.m154533F(c20477a);
        m158593u(ljmVar, ImageLoadStatus.REQUESTED);
        if (this.f137108f) {
            m158591q(ljmVar, jNow);
        }
    }

    @Override // p153l.ki2, p153l.u36
    /* JADX INFO: renamed from: j */
    public void mo149847j(String str, u36.C20477a c20477a) {
        long jNow = this.f137104b.now();
        ljm ljmVar = this.f137105c;
        ljmVar.m154533F(c20477a);
        ljmVar.m154529B(str);
        m158593u(ljmVar, ImageLoadStatus.RELEASED);
        if (this.f137108f) {
            m158590n(ljmVar, jNow);
        }
    }

    @Override // p153l.ki2, p153l.u36
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo149845h(String str, qim qimVar, u36.C20477a c20477a) {
        long jNow = this.f137104b.now();
        ljm ljmVar = this.f137105c;
        ljmVar.m154533F(c20477a);
        ljmVar.m154528A(jNow);
        ljmVar.m154537J(jNow);
        ljmVar.m154529B(str);
        ljmVar.m154534G(qimVar);
        m158593u(ljmVar, ImageLoadStatus.SUCCESS);
    }

    @Override // p153l.ki2, p153l.u36
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo149842b(String str, qim qimVar) {
        long jNow = this.f137104b.now();
        ljm ljmVar = this.f137105c;
        ljmVar.m154530C(jNow);
        ljmVar.m154529B(str);
        ljmVar.m154534G(qimVar);
        m158593u(ljmVar, ImageLoadStatus.INTERMEDIATE_AVAILABLE);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public final void m158590n(ljm ljmVar, long j) {
        ljmVar.m154545R(false);
        ljmVar.m154539L(j);
        m158594v(ljmVar, VisibilityState.INVISIBLE);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public void m158591q(ljm ljmVar, long j) {
        ljmVar.m154545R(true);
        ljmVar.m154544Q(j);
        m158594v(ljmVar, VisibilityState.VISIBLE);
    }

    /* JADX INFO: renamed from: t */
    public void m158592t() {
        this.f137105c.m154547w();
    }

    /* JADX INFO: renamed from: u */
    public final void m158593u(ljm ljmVar, ImageLoadStatus imageLoadStatus) {
        ljmVar.m154535H(imageLoadStatus);
        this.f137106d.mo140212a(ljmVar, imageLoadStatus);
        jjm jjmVar = this.f137107e;
        if (jjmVar != null) {
            jjmVar.mo140212a(ljmVar, imageLoadStatus);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m158594v(ljm ljmVar, VisibilityState visibilityState) {
        this.f137106d.mo140213b(ljmVar, visibilityState);
        jjm jjmVar = this.f137107e;
        if (jjmVar != null) {
            jjmVar.mo140213b(ljmVar, visibilityState);
        }
    }

    public mjm(l610 l610Var, ljm ljmVar, jjm jjmVar) {
        this(l610Var, ljmVar, jjmVar, true);
    }

    @Override // p153l.xem0
    public void onDraw() {
    }
}
