package p153l;

import android.view.View;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class dmf {

    /* JADX INFO: renamed from: d */
    public static String f89620d = "ExpandedBaseHolder";

    /* JADX INFO: renamed from: a */
    public View f89621a;

    /* JADX INFO: renamed from: b */
    public boolean f89622b = false;

    /* JADX INFO: renamed from: c */
    public C22508b<View> f89623c = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22421c m116945e(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: i */
    public void m116948i(View view) {
        this.f89621a = view;
        mo39156g(view);
        view.setTag(f89620d.hashCode(), this);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo116949j(View view) {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public <V> C22421c<V> m116950k(ner nerVar, C22421c<V> c22421c) {
        return m116951l(nerVar, c22421c, true);
    }

    /* JADX INFO: renamed from: l */
    public <V> C22421c<V> m116951l(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f89621a;
        return psd0.m173593D(new pcj() { // from class: l.cmf
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dmf.m116945e(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f89623c.filter(new qcj() { // from class: l.bmf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    /* JADX INFO: renamed from: m */
    public View m116952m() {
        return this.f89621a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m116953n() {
        return this.f89622b;
    }

    /* JADX INFO: renamed from: o */
    public void m116954o() {
        View view = this.f89621a;
        if (view != null) {
            this.f89623c.onNext(view);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m116957u(boolean z, int i, int i2, int i3) {
        if (this.f89622b != z) {
            this.f89622b = z;
            mo39157q(z);
        }
        if (this.f89622b) {
            m116955p(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m116947h() {
    }

    /* JADX INFO: renamed from: r */
    public void mo39158r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo115468s() {
    }

    /* JADX INFO: renamed from: t */
    public void m116956t() {
    }

    /* JADX INFO: renamed from: v */
    public void mo116958v() {
    }

    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
    }

    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
    }

    /* JADX INFO: renamed from: p */
    public void m116955p(int i, int i2, int i3) {
    }
}
