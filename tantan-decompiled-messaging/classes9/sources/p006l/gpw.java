package p006l;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.e30;
import l.h70;
import l.mkd0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gpw extends o0n {

    /* JADX INFO: renamed from: h */
    public e30<String> f13430h;

    /* JADX INFO: renamed from: i */
    public e30<String> f13431i;

    /* JADX INFO: renamed from: j */
    public e30<String> f13432j;

    /* JADX INFO: renamed from: l.gpw$a */
    public class C0776a extends h70 {

        /* JADX INFO: renamed from: a */
        public boolean f13433a = false;

        public C0776a() {
        }

        /* JADX INFO: renamed from: B */
        public void m15917B() {
            super.B();
            this.f13433a = true;
        }

        /* JADX INFO: renamed from: u */
        public void m15918u() {
            super.u();
            if (!this.f13433a && gpw.this.f13431i != null) {
                gpw.this.f13431i.call("adview");
            }
            this.f13433a = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ c m15908m(Act act, Boolean bool) {
        return bool.booleanValue() ? ld2.INSTANCE.m18655f(act, 11, "ca-app-pub-6567608331519569/1242795139") : c.just((Object) null);
    }

    /* JADX INFO: renamed from: b */
    public boolean m15910b() {
        return true;
    }

    @Override // p006l.o0n
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
        m15914r(act, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final c<Boolean> m15911o() {
        return !r70.m22713g().m22714f() ? c.just(Boolean.FALSE) : c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m15912p(Act act, ViewGroup viewGroup, AdView adView) {
        Objects.toString(adView);
        if (adView != null && act != null && !act.isDestroyed() && !act.isFinishing()) {
            if (NullChecker.a(this.f17965b)) {
                this.f17965b.a();
            }
            m15915s(adView, viewGroup);
        } else {
            e30<String> e30Var = this.f13432j;
            if (e30Var != null) {
                e30Var.call("ad error");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m15913q(Throwable th) {
        e30<String> e30Var = this.f13432j;
        if (e30Var != null) {
            e30Var.call("rx error");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15914r(final Act act, final ViewGroup viewGroup) {
        m15911o().flatMap(new w9j() { // from class: l.dpw
            public final Object call(Object obj) {
                return gpw.m15908m(act, (Boolean) obj);
            }
        }).take(1).compose(mkd0.R()).subscribe(mkd0.H(new e30() { // from class: l.epw
            public final void call(Object obj) {
                this.f11391a.m15912p(act, viewGroup, (AdView) obj);
            }
        }, new e30() { // from class: l.fpw
            public final void call(Object obj) {
                this.f12849a.m15913q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final void m15915s(AdView adView, ViewGroup viewGroup) {
        this.f17965b = adView;
        if (NullChecker.a(viewGroup) && NullChecker.a(this.f17965b)) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.f17965b);
            e30<String> e30Var = this.f13430h;
            if (e30Var != null) {
                e30Var.call("finish");
            }
            this.f17965b.setAdListener(new C0776a());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m15916t(e30<String> e30Var, e30<String> e30Var2, e30<String> e30Var3) {
        this.f13430h = e30Var;
        this.f13431i = e30Var2;
        this.f13432j = e30Var3;
    }
}
