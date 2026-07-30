package p153l;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class fsw extends o2n {

    /* JADX INFO: renamed from: h */
    public y20<String> f100690h;

    /* JADX INFO: renamed from: i */
    public y20<String> f100691i;

    /* JADX INFO: renamed from: j */
    public y20<String> f100692j;

    /* JADX INFO: renamed from: l.fsw$a */
    public class C17068a extends d70 {

        /* JADX INFO: renamed from: a */
        public boolean f100693a = false;

        public C17068a() {
        }

        @Override // p153l.d70
        /* JADX INFO: renamed from: B */
        public void mo30986B() {
            super.mo30986B();
            this.f100693a = true;
        }

        @Override // p153l.d70
        /* JADX INFO: renamed from: u */
        public void mo96611u() {
            super.mo96611u();
            if (!this.f100693a && fsw.this.f100691i != null) {
                fsw.this.f100691i.call("adview");
            }
            this.f100693a = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C22421c m127265m(Act act, Boolean bool) {
        return bool.booleanValue() ? sd2.INSTANCE.m185428f(act, 11, "ca-app-pub-6567608331519569/1242795139") : C22421c.just(null);
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: b */
    public boolean mo109583b() {
        return true;
    }

    @Override // p153l.o2n
    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        super.mo125406h(act, viewGroup);
        m127270r(act, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final C22421c<Boolean> m127267o() {
        return !n70.m161856g().m161857f() ? C22421c.just(Boolean.FALSE) : C22421c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m127268p(Act act, ViewGroup viewGroup, AdView adView) {
        Objects.toString(adView);
        if (adView != null && act != null && !act.isDestroyed() && !act.isFinishing()) {
            if (NullChecker.m82486a(this.f144750b)) {
                this.f144750b.m12272a();
            }
            m127271s(adView, viewGroup);
        } else {
            y20<String> y20Var = this.f100692j;
            if (y20Var != null) {
                y20Var.call("ad error");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m127269q(Throwable th) {
        y20<String> y20Var = this.f100692j;
        if (y20Var != null) {
            y20Var.call("rx error");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m127270r(final Act act, final ViewGroup viewGroup) {
        m127267o().flatMap(new qcj() { // from class: l.csw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fsw.m127265m(act, (Boolean) obj);
            }
        }).take(1).compose(psd0.m173607R()).subscribe(psd0.m173597H(new y20() { // from class: l.dsw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90524a.m127268p(act, viewGroup, (AdView) obj);
            }
        }, new y20() { // from class: l.esw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95660a.m127269q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final void m127271s(AdView adView, ViewGroup viewGroup) {
        this.f144750b = adView;
        if (NullChecker.m82486a(viewGroup) && NullChecker.m82486a(this.f144750b)) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.f144750b);
            y20<String> y20Var = this.f100690h;
            if (y20Var != null) {
                y20Var.call("finish");
            }
            this.f144750b.setAdListener(new C17068a());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m127272t(y20<String> y20Var, y20<String> y20Var2, y20<String> y20Var3) {
        this.f100690h = y20Var;
        this.f100691i = y20Var2;
        this.f100692j = y20Var3;
    }
}
