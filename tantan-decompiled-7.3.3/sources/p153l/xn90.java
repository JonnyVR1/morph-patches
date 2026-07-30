package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class xn90 extends o2n {

    /* JADX INFO: renamed from: h */
    public String f195370h = "";

    /* JADX INFO: renamed from: i */
    public y20 f195371i;

    /* JADX INFO: renamed from: j */
    public int f195372j;

    /* JADX INFO: renamed from: l.xn90$a */
    public class C21389a extends d70 {
        public C21389a() {
        }

        @Override // p153l.d70
        public void onAdClicked() {
            super.onAdClicked();
            sfj0.m185596c("e_clone_profile_info_ads", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        }
    }

    public xn90(int i) {
        this.f195372j = i;
    }

    /* JADX INFO: renamed from: p */
    private C22421c<Boolean> m212127p() {
        if (n70.m161856g().m161857f()) {
            return TextUtils.isEmpty(this.f195370h) ? C22421c.just(Boolean.TRUE) : CoreModule.m30934Q().mo68440ao(this.f195370h).map(new qcj() { // from class: l.wn90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            });
        }
        return C22421c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s */
    private void m212128s(final Act act, final ViewGroup viewGroup) {
        final String str = "ca-app-pub-6567608331519569/7959567831";
        m212127p().flatMap(new qcj() { // from class: l.sn90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169667a.m212130q(act, str, (Boolean) obj);
            }
        }).take(1).filter(new qcj() { // from class: l.tn90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AdView) obj) != null);
            }
        }).compose(psd0.m173607R()).subscribe(psd0.m173597H(new y20() { // from class: l.un90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179709a.m212131r(act, viewGroup, (AdView) obj);
            }
        }, new y20() { // from class: l.vn90
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    private void m212129t(AdView adView, ViewGroup viewGroup) {
        this.f144750b = adView;
        if (NullChecker.m82486a(viewGroup) && NullChecker.m82486a(this.f144750b)) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.f144750b);
            y20 y20Var = this.f195371i;
            if (y20Var != null) {
                y20Var.call(Boolean.TRUE);
            }
            if (this.f195372j == 10) {
                this.f144750b.setAdListener(new C21389a());
            }
        }
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: b */
    public boolean mo109583b() {
        return true;
    }

    @Override // p153l.o2n
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        super.mo125406h(act, viewGroup);
        if (this.f144755g.get("profileUserId") instanceof String) {
            this.f195370h = (String) this.f144755g.get("profileUserId");
        }
        m212128s(act, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C22421c m212130q(Act act, String str, Boolean bool) {
        return bool.booleanValue() ? sd2.INSTANCE.m185428f(act, this.f195372j, str) : C22421c.just(null);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m212131r(Act act, ViewGroup viewGroup, AdView adView) {
        Objects.toString(adView);
        if (adView == null || act == null || act.isDestroyed() || act.isFinishing()) {
            return;
        }
        m212129t(adView, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m212132u(y20 y20Var) {
        this.f195371i = y20Var;
    }
}
