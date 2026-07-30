package p006l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.e30;
import l.h70;
import l.mkd0;
import l.o6j0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tf90 extends o0n {

    /* JADX INFO: renamed from: h */
    public String f22082h = "";

    /* JADX INFO: renamed from: i */
    public e30 f22083i;

    /* JADX INFO: renamed from: j */
    public int f22084j;

    /* JADX INFO: renamed from: l.tf90$a */
    public class C1306a extends h70 {
        public C1306a() {
        }

        public void onAdClicked() {
            super.onAdClicked();
            o6j0.c("e_clone_profile_info_ads", "p_suggest_users_home_view", new o6j0.a[0]);
        }
    }

    public tf90(int i) {
        this.f22084j = i;
    }

    /* JADX INFO: renamed from: p */
    private c<Boolean> m24670p() {
        if (r70.m22713g().m22714f()) {
            return TextUtils.isEmpty(this.f22082h) ? c.just(Boolean.TRUE) : CoreModule.m1855Q().ao(this.f22082h).map(new w9j() { // from class: l.sf90
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            });
        }
        return c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s */
    private void m24671s(final Act act, final ViewGroup viewGroup) {
        final String str = "ca-app-pub-6567608331519569/7959567831";
        m24670p().flatMap(new w9j() { // from class: l.of90
            public final Object call(Object obj) {
                return this.f18218a.m24674q(act, str, (Boolean) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.pf90
            public final Object call(Object obj) {
                return Boolean.valueOf(((AdView) obj) != null);
            }
        }).compose(mkd0.R()).subscribe(mkd0.H(new e30() { // from class: l.qf90
            public final void call(Object obj) {
                this.f19729a.m24675r(act, viewGroup, (AdView) obj);
            }
        }, new e30() { // from class: l.rf90
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    private void m24672t(AdView adView, ViewGroup viewGroup) {
        this.f17965b = adView;
        if (NullChecker.a(viewGroup) && NullChecker.a(this.f17965b)) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.f17965b);
            e30 e30Var = this.f22083i;
            if (e30Var != null) {
                e30Var.call(Boolean.TRUE);
            }
            if (this.f22084j == 10) {
                this.f17965b.setAdListener(new C1306a());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m24673b() {
        return true;
    }

    @Override // p006l.o0n
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
        if (this.f17970g.get("profileUserId") instanceof String) {
            this.f22082h = (String) this.f17970g.get("profileUserId");
        }
        m24671s(act, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ c m24674q(Act act, String str, Boolean bool) {
        return bool.booleanValue() ? ld2.INSTANCE.m18655f(act, this.f22084j, str) : c.just((Object) null);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m24675r(Act act, ViewGroup viewGroup, AdView adView) {
        Objects.toString(adView);
        if (adView == null || act == null || act.isDestroyed() || act.isFinishing()) {
            return;
        }
        m24672t(adView, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m24676u(e30 e30Var) {
        this.f22083i = e30Var;
    }
}
