package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.ark;
import l.d30;
import l.f9k0;
import l.hta0;
import l.lsi0;
import l.mcr;
import l.xdl0;
import l.zvf0;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gta0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f11624u;

    /* JADX INFO: renamed from: v */
    public VText f11625v;

    /* JADX INFO: renamed from: w */
    public VText f11626w;

    public gta0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m14042V() {
        if (NullChecker.a(CoreModule.c.e0.oa(mo3351O().userId())) && NullChecker.a(CoreModule.c.e0.oa(mo3351O().userId()).fp().profileSmall())) {
            CoreModule.c.f0.Gp(mo3351O().act(), false, mo3351O().userId(), CoreModule.c.e0.oa(mo3351O().userId()).fp().profileSmall());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m14043W() {
        if (NullChecker.a(CoreModule.c.e0.oa(mo3351O().userId())) && NullChecker.a(CoreModule.c.e0.oa(mo3351O().userId()).fp().profileSmall())) {
            CoreModule.c.f0.Gp(mo3351O().act(), true, mo3351O().userId(), CoreModule.c.e0.oa(mo3351O().userId()).fp().profileSmall());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m14044X(View view) {
        zvf0.r("e_suggest_user_profile_info_view_share", mo3351O().pageId());
        if (f9k0.c(mo3351O().userId())) {
            lsi0.y("此用户不可被分享");
        } else {
            ark.U0(mo3351O().act(), "share_bottom", new d30() { // from class: l.eta0
                public final void call() {
                    this.f9960a.m14042V();
                }
            }, new d30() { // from class: l.fta0
                public final void call() {
                    this.f10630a.m14043W();
                }
            });
        }
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: U */
    public View m14045U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hta0.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        String strFrom = mo3351O().from();
        if (TextUtils.isEmpty(strFrom) || TextUtils.equals("home_card", strFrom) || TextUtils.equals("share_profile", strFrom)) {
            return false;
        }
        TextUtils.equals("home_moment_theme_card", strFrom);
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m14045U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (NullChecker.a(mo3351O().mo1517K2()) && !TextUtils.isEmpty(mo3351O().mo1517K2().name)) {
            this.f11625v.setText(mo3351O().mo1517K2().name);
        }
        this.f11626w.setText(String.format("听听朋友们对%s的看法", mo3351O().mo1517K2().isFemale() ? "她" : "他"));
        xdl0.E0(this.f11624u, new View.OnClickListener() { // from class: l.dta0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9419a.m14044X(view);
            }
        });
    }
}
