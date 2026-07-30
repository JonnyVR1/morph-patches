package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class tf90 extends o0n {

    /* JADX INFO: renamed from: h */
    public String f169951h = "";

    /* JADX INFO: renamed from: i */
    public e30 f169952i;

    /* JADX INFO: renamed from: j */
    public int f169953j;

    /* JADX INFO: renamed from: l.tf90$a */
    public class C20165a extends h70 {
        public C20165a() {
        }

        @Override // p149l.h70
        public void onAdClicked() {
            super.onAdClicked();
            o6j0.m162859c("e_clone_profile_info_ads", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        }
    }

    public tf90(int i) {
        this.f169953j = i;
    }

    /* JADX INFO: renamed from: p */
    private C22306c<Boolean> m188667p() {
        if (r70.m178118g().m178119f()) {
            return TextUtils.isEmpty(this.f169951h) ? C22306c.just(Boolean.TRUE) : CoreModule.m29936Q().mo67257ao(this.f169951h).map(new w9j() { // from class: l.sf90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            });
        }
        return C22306c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s */
    private void m188668s(final Act act, final ViewGroup viewGroup) {
        final String str = "ca-app-pub-6567608331519569/7959567831";
        m188667p().flatMap(new w9j() { // from class: l.of90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143634a.m188670q(act, str, (Boolean) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.pf90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AdView) obj) != null);
            }
        }).compose(mkd0.m154966R()).subscribe(mkd0.m154956H(new e30() { // from class: l.qf90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154093a.m188671r(act, viewGroup, (AdView) obj);
            }
        }, new e30() { // from class: l.rf90
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    private void m188669t(AdView adView, ViewGroup viewGroup) {
        this.f141344b = adView;
        if (NullChecker.m81303a(viewGroup) && NullChecker.m81303a(this.f141344b)) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.f141344b);
            e30 e30Var = this.f169952i;
            if (e30Var != null) {
                e30Var.call(Boolean.TRUE);
            }
            if (this.f169953j == 10) {
                this.f141344b.setAdListener(new C20165a());
            }
        }
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: b */
    public boolean mo100436b() {
        return true;
    }

    @Override // p149l.o0n
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        super.mo100438h(act, viewGroup);
        if (this.f141349g.get("profileUserId") instanceof String) {
            this.f169951h = (String) this.f141349g.get("profileUserId");
        }
        m188668s(act, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C22306c m188670q(Act act, String str, Boolean bool) {
        return bool.booleanValue() ? ld2.INSTANCE.m149388f(act, this.f169953j, str) : C22306c.just(null);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m188671r(Act act, ViewGroup viewGroup, AdView adView) {
        Objects.toString(adView);
        if (adView == null || act == null || act.isDestroyed() || act.isFinishing()) {
            return;
        }
        m188669t(adView, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m188672u(e30 e30Var) {
        this.f169952i = e30Var;
    }
}
