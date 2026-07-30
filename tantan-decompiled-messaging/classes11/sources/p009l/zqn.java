package p009l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlLikedUsersAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.hfr;
import l.jq2;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zqn extends sm2<crn> implements hfr.a {

    /* JADX INFO: renamed from: c */
    public final IntlLikedUsersAct f23835c;

    public zqn(IntlLikedUsersAct intlLikedUsersAct) {
        super(intlLikedUsersAct);
        this.f23835c = intlLikedUsersAct;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m25925b1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public /* synthetic */ void m25926c1(c cVar) {
        ((crn) ((jq2) this).viewModel).m12777k();
    }

    /* JADX INFO: renamed from: f1 */
    private void m25927f1() {
        creates(new e30() { // from class: l.xqn
            public final void call(Object obj) {
                this.f22694a.m25931d1((Bundle) obj);
            }
        });
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: J0 */
    public void mo11571J0() {
        ((crn) ((jq2) this).viewModel).m12783v();
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: L0 */
    public void mo11572L0(List<LikeUser> list) {
        ((crn) ((jq2) this).viewModel).m12778m(list);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: O0 */
    public boolean mo11573O0(LikeUser likeUser) {
        return this.f23835c.m8329Y1().m19027R(likeUser);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: P0 */
    public void mo11574P0(List<LikeUser> list) {
        ((crn) ((jq2) this).viewModel).m12778m(list);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: Q0 */
    public void mo11575Q0() {
        rtl.m21799f(m25934v());
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: R0 */
    public void mo11576R0(String str) {
        rtl.m21801h(m25934v());
    }

    /* JADX INFO: renamed from: T */
    public void m25928T(LikeUser likeUser, boolean z) {
        if (NullChecker.a(likeUser)) {
            User userPa = CoreModule.c.e0.Pa(likeUser.userId);
            if (!NullChecker.a(userPa) || !z) {
                this.f23835c.m8329Y1().notifyDataSetChanged();
            } else {
                if (m25932e1(likeUser, userPa)) {
                    return;
                }
                this.f23835c.m8329Y1().notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m25929a0() {
        super.a0();
        m25927f1();
        m22279V0();
        m22278U0();
        duringCreated(lifecycle().filter(new w9j() { // from class: l.tqn
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.uqn
            public final void call(Object obj) {
                this.f21313a.m25926c1((c) obj);
            }
        }, new e30() { // from class: l.vqn
            public final void call(Object obj) {
                zqn.m25925b1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public void m25930c(boolean z) {
        this.f23835c.m8329Y1().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m25931d1(Bundle bundle) {
        ((crn) ((jq2) this).viewModel).init();
        m22277N0();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m25932e1(LikeUser likeUser, User user) {
        if (vwb.J(user.pictures)) {
            return false;
        }
        rtl.m21801h(m25934v());
        return CoreMemberModule.F().b().Qd(this.f23835c, true, true, 0, ((Media) user.picture(0).cover()).url, (String) null, user, likeUser, "p_intl_like_i_sent,e_intl_i_like_photo,swipe_like", new e30() { // from class: l.wqn
            public final void call(Object obj) {
                this.f22282a.mo19517K((LikeUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public void m25933g1(String str) {
        CoreModule.P().g().zr(this.f23835c, str);
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: q0 */
    public Act mo11582q0() {
        return this.f23835c;
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: r0 */
    public int mo11583r0() {
        return this.f23835c.m8329Y1().m19029T();
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: s0 */
    public String mo11584s0() {
        return "p_intl_like_i_sent,e_intl_i_like_photo,click";
    }

    @Override // p009l.ntl
    /* JADX INFO: renamed from: t */
    public void mo11585t(User user) {
        rtl.m21798e(m25934v());
        CoreModule.P().a().Me(this.f23835c, user, "p_intl_like_i_sent,e_intl_instantmatch_btn,click", new d30() { // from class: l.yqn
            public final void call() {
                this.f23209a.m22277N0();
            }
        });
    }

    @Override // p009l.sm2
    /* JADX INFO: renamed from: t0 */
    public String mo11586t0() {
        return "p_intl_like_i_sent,e_intl_i_like_superlike,click";
    }

    /* JADX INFO: renamed from: v */
    public String m25934v() {
        return this.f23835c.pageId();
    }
}
