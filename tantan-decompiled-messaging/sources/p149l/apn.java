package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlILikeUserItemView;
import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class apn extends sm2<gpn> {

    /* JADX INFO: renamed from: c */
    public final IntlILikeFrag f71064c;

    public apn(IntlILikeFrag intlILikeFrag) {
        super(intlILikeFrag);
        this.f71064c = intlILikeFrag;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m98145Y0(IntlILikeUserItemView intlILikeUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            intlILikeUserItemView.f29831c.setVisibility(0);
        } else {
            intlILikeUserItemView.f29831c.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m98146a1(Bundle bundle) {
        ((gpn) this.viewModel).init();
    }

    /* JADX INFO: renamed from: c1 */
    private void m98147c1() {
        creates(new e30() { // from class: l.xon
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193862a.m98146a1((Bundle) obj);
            }
        });
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: J0 */
    public void mo98148J0() {
        ((gpn) this.viewModel).m127417n();
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: L0 */
    public void mo98149L0(List<LikeUser> list) {
        ((gpn) this.viewModel).m127416l(list);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: O0 */
    public boolean mo98150O0(LikeUser likeUser) {
        return this.f71064c.m39372P4().m199187Q(likeUser);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: P0 */
    public void mo98151P0(List<LikeUser> list) {
        ((gpn) this.viewModel).m127416l(list);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: Q0 */
    public void mo98152Q0() {
        rtl.m180789b(m98162v());
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: R0 */
    public void mo98153R0(String str) {
        rtl.m180796i(m98162v(), "i_like");
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: S0 */
    public void mo98154S0(LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView) {
        CoreModule.m29935P().m94651a().mo33441Xc(this.f71064c, likeUser.userId, intlILikeUserItemView, new e30() { // from class: l.yon
            @Override // p149l.e30
            public final void call(Object obj) {
                apn.m98145Y0(intlILikeUserItemView, (Boolean) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m184920N0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m98147c1();
        m184922V0();
        m184921U0();
    }

    /* JADX INFO: renamed from: b1 */
    public void m98155b1(boolean z) {
        if (z) {
            CoreModule.f17545c.f19555C0.m210112u4();
            ((gpn) this.viewModel).m127417n();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m98156d1(String str, boolean z) {
        if (z && CoreModule.f17545c.f19672p0.m173363k3()) {
            CoreModule.m29935P().m94651a().mo33574r6(this.f71064c.act(), str, Privilege.immediately_match, null, null);
        } else {
            CoreModule.m29935P().m94651a().mo33572qm(this.f71064c.act(), str, Privilege.liked_user, null);
        }
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: q0 */
    public Act mo98157q0() {
        return this.f71064c.act();
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: r0 */
    public int mo98158r0() {
        return this.f71064c.m39372P4().m199189S();
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: s0 */
    public String mo98159s0() {
        return "p_intl_meet_view,e_intl_meet_avatar_like_i_sent_click,click";
    }

    @Override // p149l.ntl
    /* JADX INFO: renamed from: t */
    public void mo98160t(User user) {
        rtl.m180790c(m98162v(), "i_like");
        CoreModule.m29935P().m94651a().mo33367Me(this.f71064c.act(), user, "p_intl_meet_view,e_intl_meet_like_i_sent_instant_match_click,click", new d30() { // from class: l.zon
            @Override // p149l.d30
            public final void call() {
                this.f204135a.m184920N0();
            }
        });
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: t0 */
    public String mo98161t0() {
        return "p_intl_meet_view,e_intl_meet_like_i_sent_superlike_click,click";
    }

    /* JADX INFO: renamed from: v */
    public String m98162v() {
        return this.f71064c.pageId();
    }
}
