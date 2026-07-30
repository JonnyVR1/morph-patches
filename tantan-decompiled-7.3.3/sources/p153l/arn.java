package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlILikeUserItemView;
import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class arn extends an2<grn> {

    /* JADX INFO: renamed from: c */
    public final IntlILikeFrag f72972c;

    public arn(IntlILikeFrag intlILikeFrag) {
        super(intlILikeFrag);
        this.f72972c = intlILikeFrag;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m99754Y0(IntlILikeUserItemView intlILikeUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            intlILikeUserItemView.f30679c.setVisibility(0);
        } else {
            intlILikeUserItemView.f30679c.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m99755a1(Bundle bundle) {
        ((grn) this.viewModel).init();
    }

    /* JADX INFO: renamed from: c1 */
    private void m99756c1() {
        creates(new y20() { // from class: l.xqn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195821a.m99755a1((Bundle) obj);
            }
        });
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: J0 */
    public void mo98902J0() {
        ((grn) this.viewModel).m131833n();
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: L0 */
    public void mo98904L0(List<LikeUser> list) {
        ((grn) this.viewModel).m131832l(list);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: O0 */
    public boolean mo98907O0(LikeUser likeUser) {
        return this.f72972c.m40375P4().m202421Q(likeUser);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: P0 */
    public void mo98908P0(List<LikeUser> list) {
        ((grn) this.viewModel).m131832l(list);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: Q0 */
    public void mo98909Q0() {
        fwl.m127796b(m99760v());
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: R0 */
    public void mo98910R0(String str) {
        fwl.m127803i(m99760v(), "i_like");
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: S0 */
    public void mo98911S0(LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView) {
        CoreModule.m30933P().m143405a().mo34444Xc(this.f72972c, likeUser.userId, intlILikeUserItemView, new y20() { // from class: l.yqn
            @Override // p153l.y20
            public final void call(Object obj) {
                arn.m99754Y0(intlILikeUserItemView, (Boolean) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m98906N0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m99756c1();
        m98913V0();
        m98912U0();
    }

    /* JADX INFO: renamed from: b1 */
    public void m99757b1(boolean z) {
        if (z) {
            CoreModule.f18264c.f20297C0.m146425v4();
            ((grn) this.viewModel).m131833n();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m99758d1(String str, boolean z) {
        if (z && CoreModule.f18264c.f20414p0.m219066k3()) {
            CoreModule.m30933P().m143405a().mo34577r6(this.f72972c.act(), str, Privilege.immediately_match, null, null);
        } else {
            CoreModule.m30933P().m143405a().mo34575qm(this.f72972c.act(), str, Privilege.liked_user, null);
        }
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: q0 */
    public Act mo98919q0() {
        return this.f72972c.act();
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: r0 */
    public int mo98920r0() {
        return this.f72972c.m40375P4().m202423S();
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: s0 */
    public String mo98921s0() {
        return "p_intl_meet_view,e_intl_meet_avatar_like_i_sent_click,click";
    }

    @Override // p153l.bwl
    /* JADX INFO: renamed from: t */
    public void mo99759t(User user) {
        fwl.m127797c(m99760v(), "i_like");
        CoreModule.m30933P().m143405a().mo34370Me(this.f72972c.act(), user, "p_intl_meet_view,e_intl_meet_like_i_sent_instant_match_click,click", new x20() { // from class: l.zqn
            @Override // p153l.x20
            public final void call() {
                this.f205634a.m98906N0();
            }
        });
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: t0 */
    public String mo98922t0() {
        return "p_intl_meet_view,e_intl_meet_like_i_sent_superlike_click,click";
    }

    /* JADX INFO: renamed from: v */
    public String m99760v() {
        return this.f72972c.pageId();
    }
}
