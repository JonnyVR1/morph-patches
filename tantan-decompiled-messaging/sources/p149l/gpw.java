package p149l;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class gpw extends o0n {

    /* JADX INFO: renamed from: h */
    public e30<String> f103841h;

    /* JADX INFO: renamed from: i */
    public e30<String> f103842i;

    /* JADX INFO: renamed from: j */
    public e30<String> f103843j;

    /* JADX INFO: renamed from: l.gpw$a */
    public class C17137a extends h70 {

        /* JADX INFO: renamed from: a */
        public boolean f103844a = false;

        public C17137a() {
        }

        @Override // p149l.h70
        /* JADX INFO: renamed from: B */
        public void mo29988B() {
            super.mo29988B();
            this.f103844a = true;
        }

        @Override // p149l.h70
        /* JADX INFO: renamed from: u */
        public void mo108701u() {
            super.mo108701u();
            if (!this.f103844a && gpw.this.f103842i != null) {
                gpw.this.f103842i.call("adview");
            }
            this.f103844a = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C22306c m127487m(Act act, Boolean bool) {
        return bool.booleanValue() ? ld2.INSTANCE.m149388f(act, 11, "ca-app-pub-6567608331519569/1242795139") : C22306c.just(null);
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: b */
    public boolean mo100436b() {
        return true;
    }

    @Override // p149l.o0n
    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        super.mo100438h(act, viewGroup);
        m127492r(act, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final C22306c<Boolean> m127489o() {
        return !r70.m178118g().m178119f() ? C22306c.just(Boolean.FALSE) : C22306c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m127490p(Act act, ViewGroup viewGroup, AdView adView) {
        Objects.toString(adView);
        if (adView != null && act != null && !act.isDestroyed() && !act.isFinishing()) {
            if (NullChecker.m81303a(this.f141344b)) {
                this.f141344b.m12218a();
            }
            m127493s(adView, viewGroup);
        } else {
            e30<String> e30Var = this.f103843j;
            if (e30Var != null) {
                e30Var.call("ad error");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m127491q(Throwable th) {
        e30<String> e30Var = this.f103843j;
        if (e30Var != null) {
            e30Var.call("rx error");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m127492r(final Act act, final ViewGroup viewGroup) {
        m127489o().flatMap(new w9j() { // from class: l.dpw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gpw.m127487m(act, (Boolean) obj);
            }
        }).take(1).compose(mkd0.m154966R()).subscribe(mkd0.m154956H(new e30() { // from class: l.epw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92719a.m127490p(act, viewGroup, (AdView) obj);
            }
        }, new e30() { // from class: l.fpw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98744a.m127491q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final void m127493s(AdView adView, ViewGroup viewGroup) {
        this.f141344b = adView;
        if (NullChecker.m81303a(viewGroup) && NullChecker.m81303a(this.f141344b)) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.f141344b);
            e30<String> e30Var = this.f103841h;
            if (e30Var != null) {
                e30Var.call("finish");
            }
            this.f141344b.setAdListener(new C17137a());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m127494t(e30<String> e30Var, e30<String> e30Var2, e30<String> e30Var3) {
        this.f103841h = e30Var;
        this.f103842i = e30Var2;
        this.f103843j = e30Var3;
    }
}
