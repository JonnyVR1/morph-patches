package p009l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlILikeUserItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class apn extends sm2<gpn> {

    /* JADX INFO: renamed from: c */
    public final IntlILikeFrag f9616c;

    public apn(IntlILikeFrag intlILikeFrag) {
        super(intlILikeFrag);
        this.f9616c = intlILikeFrag;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m11568Y0(IntlILikeUserItemView intlILikeUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            intlILikeUserItemView.f6782c.setVisibility(0);
        } else {
            intlILikeUserItemView.f6782c.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m11569a1(Bundle bundle) {
        ((gpn) ((jq2) this).viewModel).init();
    }

    /* JADX INFO: renamed from: c1 */
    private void m11570c1() {
        creates(new e30() { // from class: l.xon
            public final void call(Object obj) {
                this.f22684a.m11569a1((Bundle) obj);
            }
        });
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: J0 */
    public void mo11571J0() {
        ((gpn) ((jq2) this).viewModel).m15159n();
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: L0 */
    public void mo11572L0(List<LikeUser> list) {
        ((gpn) ((jq2) this).viewModel).m15158l(list);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: O0 */
    public boolean mo11573O0(LikeUser likeUser) {
        return this.f9616c.m3412P4().m23562Q(likeUser);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: P0 */
    public void mo11574P0(List<LikeUser> list) {
        ((gpn) ((jq2) this).viewModel).m15158l(list);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: Q0 */
    public void mo11575Q0() {
        rtl.m21795b(m11587v());
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: R0 */
    public void mo11576R0(String str) {
        rtl.m21802i(m11587v(), "i_like");
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: S0 */
    public void mo11577S0(LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView) {
        CoreModule.P().a().Xc(this.f9616c, likeUser.userId, intlILikeUserItemView, new e30() { // from class: l.yon
            public final void call(Object obj) {
                apn.m11568Y0(intlILikeUserItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m11578Z() {
        super.Z();
        m22277N0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11579a0() {
        super.a0();
        m11570c1();
        m22279V0();
        m22278U0();
    }

    /* JADX INFO: renamed from: b1 */
    public void m11580b1(boolean z) {
        if (z) {
            CoreModule.c.C0.u4();
            ((gpn) ((jq2) this).viewModel).m15159n();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m11581d1(String str, boolean z) {
        if (z && CoreModule.c.p0.k3()) {
            CoreModule.P().a().r6(this.f9616c.act(), str, Privilege.immediately_match, (e30) null, (d30) null);
        } else {
            CoreModule.P().a().qm(this.f9616c.act(), str, Privilege.liked_user, (e30) null);
        }
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: q0 */
    public Act mo11582q0() {
        return this.f9616c.act();
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: r0 */
    public int mo11583r0() {
        return this.f9616c.m3412P4().m23564S();
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: s0 */
    public String mo11584s0() {
        return "p_intl_meet_view,e_intl_meet_avatar_like_i_sent_click,click";
    }

    @Override // p009l.ntl
    /* JADX INFO: renamed from: t */
    public void mo11585t(User user) {
        rtl.m21796c(m11587v(), "i_like");
        CoreModule.P().a().Me(this.f9616c.act(), user, "p_intl_meet_view,e_intl_meet_like_i_sent_instant_match_click,click", new d30() { // from class: l.zon
            public final void call() {
                this.f23809a.m22277N0();
            }
        });
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: t0 */
    public String mo11586t0() {
        return "p_intl_meet_view,e_intl_meet_like_i_sent_superlike_click,click";
    }

    /* JADX INFO: renamed from: v */
    public String m11587v() {
        return this.f9616c.pageId();
    }
}
