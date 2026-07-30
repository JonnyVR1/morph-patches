package p149l;

import androidx.annotation.VisibleForTesting;
import com.facebook.fresco.p027ui.common.ImageLoadStatus;
import com.facebook.fresco.p027ui.common.VisibilityState;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class jhm extends di2<ngm> implements Closeable, t5m0 {

    /* JADX INFO: renamed from: b */
    public final by00 f117956b;

    /* JADX INFO: renamed from: c */
    public final ihm f117957c;

    /* JADX INFO: renamed from: d */
    public final ghm f117958d;

    /* JADX INFO: renamed from: e */
    public ghm f117959e;

    /* JADX INFO: renamed from: f */
    public final boolean f117960f;

    public jhm(by00 by00Var, ihm ihmVar, ghm ghmVar, boolean z) {
        this.f117959e = null;
        this.f117956b = by00Var;
        this.f117957c = ihmVar;
        this.f117958d = ghmVar;
        this.f117960f = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m141537t();
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: d */
    public void mo111858d(String str, Throwable th, p26.C19111a c19111a) {
        long jNow = this.f117956b.now();
        ihm ihmVar = this.f117957c;
        ihmVar.m136248F(c19111a);
        ihmVar.m136265z(jNow);
        ihmVar.m136244B(str);
        ihmVar.m136247E(th);
        m141538u(ihmVar, ImageLoadStatus.ERROR);
        m141535n(ihmVar, jNow);
    }

    @Override // p149l.t5m0
    /* JADX INFO: renamed from: g */
    public void mo140884g(boolean z) {
        ihm ihmVar = this.f117957c;
        if (z) {
            m141536q(ihmVar, this.f117956b.now());
        } else {
            m141535n(ihmVar, this.f117956b.now());
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: i */
    public void mo111861i(String str, Object obj, p26.C19111a c19111a) {
        long jNow = this.f117956b.now();
        ihm ihmVar = this.f117957c;
        ihmVar.m136263x();
        ihmVar.m136246D(jNow);
        ihmVar.m136244B(str);
        ihmVar.m136264y(obj);
        ihmVar.m136248F(c19111a);
        m141538u(ihmVar, ImageLoadStatus.REQUESTED);
        if (this.f117960f) {
            m141536q(ihmVar, jNow);
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: j */
    public void mo111862j(String str, p26.C19111a c19111a) {
        long jNow = this.f117956b.now();
        ihm ihmVar = this.f117957c;
        ihmVar.m136248F(c19111a);
        ihmVar.m136244B(str);
        m141538u(ihmVar, ImageLoadStatus.RELEASED);
        if (this.f117960f) {
            m141535n(ihmVar, jNow);
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo111860h(String str, ngm ngmVar, p26.C19111a c19111a) {
        long jNow = this.f117956b.now();
        ihm ihmVar = this.f117957c;
        ihmVar.m136248F(c19111a);
        ihmVar.m136243A(jNow);
        ihmVar.m136252J(jNow);
        ihmVar.m136244B(str);
        ihmVar.m136249G(ngmVar);
        m141538u(ihmVar, ImageLoadStatus.SUCCESS);
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo111857b(String str, ngm ngmVar) {
        long jNow = this.f117956b.now();
        ihm ihmVar = this.f117957c;
        ihmVar.m136245C(jNow);
        ihmVar.m136244B(str);
        ihmVar.m136249G(ngmVar);
        m141538u(ihmVar, ImageLoadStatus.INTERMEDIATE_AVAILABLE);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public final void m141535n(ihm ihmVar, long j) {
        ihmVar.m136260R(false);
        ihmVar.m136254L(j);
        m141539v(ihmVar, VisibilityState.INVISIBLE);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public void m141536q(ihm ihmVar, long j) {
        ihmVar.m136260R(true);
        ihmVar.m136259Q(j);
        m141539v(ihmVar, VisibilityState.VISIBLE);
    }

    /* JADX INFO: renamed from: t */
    public void m141537t() {
        this.f117957c.m136262w();
    }

    /* JADX INFO: renamed from: u */
    public final void m141538u(ihm ihmVar, ImageLoadStatus imageLoadStatus) {
        ihmVar.m136250H(imageLoadStatus);
        this.f117958d.mo121360a(ihmVar, imageLoadStatus);
        ghm ghmVar = this.f117959e;
        if (ghmVar != null) {
            ghmVar.mo121360a(ihmVar, imageLoadStatus);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m141539v(ihm ihmVar, VisibilityState visibilityState) {
        this.f117958d.mo121361b(ihmVar, visibilityState);
        ghm ghmVar = this.f117959e;
        if (ghmVar != null) {
            ghmVar.mo121361b(ihmVar, visibilityState);
        }
    }

    public jhm(by00 by00Var, ihm ihmVar, ghm ghmVar) {
        this(by00Var, ihmVar, ghmVar, true);
    }

    @Override // p149l.t5m0
    public void onDraw() {
    }
}
