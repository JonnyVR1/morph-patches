package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class k1b0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f123470u;

    /* JADX INFO: renamed from: v */
    public VText f123471v;

    /* JADX INFO: renamed from: w */
    public VText f123472w;

    public k1b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m147850V() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(mo53983O().userId())) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(mo53983O().userId()).m61308fp().profileSmall())) {
            CoreModule.f18264c.f20384f0.m33667Gp(mo53983O().act(), false, mo53983O().userId(), CoreModule.f18264c.f20381e0.m116597oa(mo53983O().userId()).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m147851W() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(mo53983O().userId())) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(mo53983O().userId()).m61308fp().profileSmall())) {
            CoreModule.f18264c.f20384f0.m33667Gp(mo53983O().act(), true, mo53983O().userId(), CoreModule.f18264c.f20381e0.m116597oa(mo53983O().userId()).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m147852X(View view) {
        i4g0.m138520r("e_suggest_user_profile_info_view_share", mo53983O().pageId());
        if (lik0.m154377c(mo53983O().userId())) {
            o1j0.m165651y("此用户不可被分享");
        } else {
            qtk.m178001U0(mo53983O().act(), "share_bottom", new x20() { // from class: l.i1b0
                @Override // p153l.x20
                public final void call() {
                    this.f112505a.m147850V();
                }
            }, new x20() { // from class: l.j1b0
                @Override // p153l.x20
                public final void call() {
                    this.f117946a.m147851W();
                }
            });
        }
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: U */
    public View m147853U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l1b0.m152468b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        String strFrom = mo53983O().from();
        if (TextUtils.isEmpty(strFrom) || TextUtils.equals("home_card", strFrom) || TextUtils.equals("share_profile", strFrom)) {
            return false;
        }
        TextUtils.equals("home_moment_theme_card", strFrom);
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m147853U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (NullChecker.m82486a(mo53983O().mo52252K2()) && !TextUtils.isEmpty(mo53983O().mo52252K2().name)) {
            this.f123471v.setText(mo53983O().mo52252K2().name);
        }
        this.f123472w.setText(String.format("听听朋友们对%s的看法", mo53983O().mo52252K2().isFemale() ? "她" : "他"));
        bnl0.m105509E0(this.f123470u, new View.OnClickListener() { // from class: l.h1b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107425a.m147852X(view);
            }
        });
    }
}
