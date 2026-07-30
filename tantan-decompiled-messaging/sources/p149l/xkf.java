package p149l;

import android.view.View;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class xkf {

    /* JADX INFO: renamed from: d */
    public static String f193286d = "ExpandedBaseHolder";

    /* JADX INFO: renamed from: a */
    public View f193287a;

    /* JADX INFO: renamed from: b */
    public boolean f193288b = false;

    /* JADX INFO: renamed from: c */
    public C22393b<View> f193289c = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m209776e(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: i */
    public void m209779i(View view) {
        this.f193287a = view;
        mo38153g(view);
        view.setTag(f193286d.hashCode(), this);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo209780j(View view) {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public <V> C22306c<V> m209781k(mcr mcrVar, C22306c<V> c22306c) {
        return m209782l(mcrVar, c22306c, true);
    }

    /* JADX INFO: renamed from: l */
    public <V> C22306c<V> m209782l(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f193287a;
        return mkd0.m154952D(new v9j() { // from class: l.wkf
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xkf.m209776e(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f193289c.filter(new w9j() { // from class: l.vkf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    /* JADX INFO: renamed from: m */
    public View m209783m() {
        return this.f193287a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m209784n() {
        return this.f193288b;
    }

    /* JADX INFO: renamed from: o */
    public void m209785o() {
        View view = this.f193287a;
        if (view != null) {
            this.f193289c.onNext(view);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m209788u(boolean z, int i, int i2, int i3) {
        if (this.f193288b != z) {
            this.f193288b = z;
            mo38154q(z);
        }
        if (this.f193288b) {
            m209786p(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
    }

    /* JADX INFO: renamed from: h */
    public void m209778h() {
    }

    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
    }

    /* JADX INFO: renamed from: r */
    public void mo38155r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo106149s() {
    }

    /* JADX INFO: renamed from: t */
    public void m209787t() {
    }

    /* JADX INFO: renamed from: v */
    public void mo209789v() {
    }

    /* JADX INFO: renamed from: p */
    public void m209786p(int i, int i2, int i3) {
    }
}
