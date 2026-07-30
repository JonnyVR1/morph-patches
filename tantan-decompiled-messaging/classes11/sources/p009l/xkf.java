package p009l;

import android.view.View;
import l.mcr;
import l.mkd0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xkf {

    /* JADX INFO: renamed from: d */
    public static String f22638d = "ExpandedBaseHolder";

    /* JADX INFO: renamed from: a */
    public View f22639a;

    /* JADX INFO: renamed from: b */
    public boolean f22640b = false;

    /* JADX INFO: renamed from: c */
    public b<View> f22641c = b.b();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ c m24914e(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: i */
    public void m24917i(View view) {
        this.f22639a = view;
        mo2127g(view);
        view.setTag(f22638d.hashCode(), this);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo24918j(View view) {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public <V> c<V> m24919k(mcr mcrVar, c<V> cVar) {
        return m24920l(mcrVar, cVar, true);
    }

    /* JADX INFO: renamed from: l */
    public <V> c<V> m24920l(mcr mcrVar, final c<V> cVar, boolean z) {
        final View view = this.f22639a;
        return mkd0.D(new v9j() { // from class: l.wkf
            public final Object call() {
                return xkf.m24914e(cVar);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()).takeUntil(this.f22641c.filter(new w9j() { // from class: l.vkf
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    /* JADX INFO: renamed from: m */
    public View m24921m() {
        return this.f22639a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m24922n() {
        return this.f22640b;
    }

    /* JADX INFO: renamed from: o */
    public void m24923o() {
        View view = this.f22639a;
        if (view != null) {
            this.f22641c.onNext(view);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24926u(boolean z, int i, int i2, int i3) {
        if (this.f22640b != z) {
            this.f22640b = z;
            mo2128q(z);
        }
        if (this.f22640b) {
            m24924p(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
    }

    /* JADX INFO: renamed from: h */
    public void m24916h() {
    }

    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
    }

    /* JADX INFO: renamed from: r */
    public void mo2129r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo12510s() {
    }

    /* JADX INFO: renamed from: t */
    public void m24925t() {
    }

    /* JADX INFO: renamed from: v */
    public void mo24927v() {
    }

    /* JADX INFO: renamed from: p */
    public void m24924p(int i, int i2, int i3) {
    }
}
