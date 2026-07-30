package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlLikedUsersAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zqn extends sm2<crn> implements hfr.InterfaceC17301a {

    /* JADX INFO: renamed from: c */
    public final IntlLikedUsersAct f204403c;

    public zqn(IntlLikedUsersAct intlLikedUsersAct) {
        super(intlLikedUsersAct);
        this.f204403c = intlLikedUsersAct;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m219865b1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public /* synthetic */ void m219866c1(C4319c c4319c) {
        ((crn) this.viewModel).m108432k();
    }

    /* JADX INFO: renamed from: f1 */
    private void m219867f1() {
        creates(new e30() { // from class: l.xqn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194021a.m219868d1((Bundle) obj);
            }
        });
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: J0 */
    public void mo98148J0() {
        ((crn) this.viewModel).m108438v();
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: L0 */
    public void mo98149L0(List<LikeUser> list) {
        ((crn) this.viewModel).m108433m(list);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: O0 */
    public boolean mo98150O0(LikeUser likeUser) {
        return this.f204403c.m46241Y1().m160647R(likeUser);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: P0 */
    public void mo98151P0(List<LikeUser> list) {
        ((crn) this.viewModel).m108433m(list);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: Q0 */
    public void mo98152Q0() {
        rtl.m180793f(m219871v());
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: R0 */
    public void mo98153R0(String str) {
        rtl.m180795h(m219871v());
    }

    @Override // p149l.hfr.InterfaceC17301a
    /* JADX INFO: renamed from: T */
    public void mo130779T(LikeUser likeUser, boolean z) {
        if (NullChecker.m81303a(likeUser)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(likeUser.userId);
            if (!NullChecker.m81303a(userM169430Pa) || !z) {
                this.f204403c.m46241Y1().notifyDataSetChanged();
            } else {
                if (m219869e1(likeUser, userM169430Pa)) {
                    return;
                }
                this.f204403c.m46241Y1().notifyDataSetChanged();
            }
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m219867f1();
        m184922V0();
        m184921U0();
        duringCreated(lifecycle().filter(new w9j() { // from class: l.tqn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.uqn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177758a.m219866c1((C4319c) obj);
            }
        }, new e30() { // from class: l.vqn
            @Override // p149l.e30
            public final void call(Object obj) {
                zqn.m219865b1((Throwable) obj);
            }
        }));
    }

    @Override // p149l.hfr.InterfaceC17301a
    /* JADX INFO: renamed from: c */
    public void mo130780c(boolean z) {
        this.f204403c.m46241Y1().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m219868d1(Bundle bundle) {
        ((crn) this.viewModel).init();
        m184920N0();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m219869e1(LikeUser likeUser, User user) {
        if (vwb.m200296J(user.pictures)) {
            return false;
        }
        rtl.m180795h(m219871v());
        return CoreMemberModule.m36001F().m132651b().mo35976Qd(this.f204403c, true, true, 0, user.picture(0).cover().url, null, user, likeUser, "p_intl_like_i_sent,e_intl_i_like_photo,swipe_like", new e30() { // from class: l.wqn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187709a.mo161389K((LikeUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public void m219870g1(String str) {
        CoreModule.m29935P().m94656g().mo35089zr(this.f204403c, str);
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: q0 */
    public Act mo98157q0() {
        return this.f204403c;
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: r0 */
    public int mo98158r0() {
        return this.f204403c.m46241Y1().m160649T();
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: s0 */
    public String mo98159s0() {
        return "p_intl_like_i_sent,e_intl_i_like_photo,click";
    }

    @Override // p149l.ntl
    /* JADX INFO: renamed from: t */
    public void mo98160t(User user) {
        rtl.m180792e(m219871v());
        CoreModule.m29935P().m94651a().mo33367Me(this.f204403c, user, "p_intl_like_i_sent,e_intl_instantmatch_btn,click", new d30() { // from class: l.yqn
            @Override // p149l.d30
            public final void call() {
                this.f199606a.m184920N0();
            }
        });
    }

    @Override // p149l.sm2
    /* JADX INFO: renamed from: t0 */
    public String mo98161t0() {
        return "p_intl_like_i_sent,e_intl_i_like_superlike,click";
    }

    /* JADX INFO: renamed from: v */
    public String m219871v() {
        return this.f204403c.pageId();
    }
}
