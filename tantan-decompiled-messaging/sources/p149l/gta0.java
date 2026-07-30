package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gta0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f104265u;

    /* JADX INFO: renamed from: v */
    public VText f104266v;

    /* JADX INFO: renamed from: w */
    public VText f104267w;

    public gta0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m127923V() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(mo52800O().userId())) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(mo52800O().userId()).m60124fp().profileSmall())) {
            CoreModule.f17545c.f19642f0.m32664Gp(mo52800O().act(), false, mo52800O().userId(), CoreModule.f17545c.f19639e0.m169524oa(mo52800O().userId()).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m127924W() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(mo52800O().userId())) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(mo52800O().userId()).m60124fp().profileSmall())) {
            CoreModule.f17545c.f19642f0.m32664Gp(mo52800O().act(), true, mo52800O().userId(), CoreModule.f17545c.f19639e0.m169524oa(mo52800O().userId()).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m127925X(View view) {
        zvf0.m220396r("e_suggest_user_profile_info_view_share", mo52800O().pageId());
        if (f9k0.m120090c(mo52800O().userId())) {
            lsi0.m151595y("此用户不可被分享");
        } else {
            ark.m98451U0(mo52800O().act(), "share_bottom", new d30() { // from class: l.eta0
                @Override // p149l.d30
                public final void call() {
                    this.f93102a.m127923V();
                }
            }, new d30() { // from class: l.fta0
                @Override // p149l.d30
                public final void call() {
                    this.f99161a.m127924W();
                }
            });
        }
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: U */
    public View m127926U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hta0.m132863b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        String strFrom = mo52800O().from();
        if (TextUtils.isEmpty(strFrom) || TextUtils.equals("home_card", strFrom) || TextUtils.equals("share_profile", strFrom)) {
            return false;
        }
        TextUtils.equals("home_moment_theme_card", strFrom);
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m127926U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (NullChecker.m81303a(mo52800O().mo51069K2()) && !TextUtils.isEmpty(mo52800O().mo51069K2().name)) {
            this.f104266v.setText(mo52800O().mo51069K2().name);
        }
        this.f104267w.setText(String.format("听听朋友们对%s的看法", mo52800O().mo51069K2().isFemale() ? "她" : "他"));
        xdl0.m208329E0(this.f104265u, new View.OnClickListener() { // from class: l.dta0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87828a.m127925X(view);
            }
        });
    }
}
