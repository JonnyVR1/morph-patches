package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlLikedUsersAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zsn extends an2<ctn> implements ihr.InterfaceC17720a {

    /* JADX INFO: renamed from: c */
    public final IntlLikedUsersAct f205884c;

    public zsn(IntlLikedUsersAct intlLikedUsersAct) {
        super(intlLikedUsersAct);
        this.f205884c = intlLikedUsersAct;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m221355b1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public /* synthetic */ void m221356c1(C4470c c4470c) {
        ((ctn) this.viewModel).m112529k();
    }

    /* JADX INFO: renamed from: f1 */
    private void m221357f1() {
        creates(new y20() { // from class: l.xsn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196116a.m221358d1((Bundle) obj);
            }
        });
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: J0 */
    public void mo98902J0() {
        ((ctn) this.viewModel).m112535v();
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: L0 */
    public void mo98904L0(List<LikeUser> list) {
        ((ctn) this.viewModel).m112530m(list);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: O0 */
    public boolean mo98907O0(LikeUser likeUser) {
        return this.f205884c.m47424Z1().m164624R(likeUser);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: P0 */
    public void mo98908P0(List<LikeUser> list) {
        ((ctn) this.viewModel).m112530m(list);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: Q0 */
    public void mo98909Q0() {
        fwl.m127800f(m221361v());
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: R0 */
    public void mo98910R0(String str) {
        fwl.m127802h(m221361v());
    }

    @Override // p153l.ihr.InterfaceC17720a
    /* JADX INFO: renamed from: T */
    public void mo140019T(LikeUser likeUser, boolean z) {
        if (NullChecker.m82486a(likeUser)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(likeUser.userId);
            if (!NullChecker.m82486a(userM116503Pa) || !z) {
                this.f205884c.m47424Z1().notifyDataSetChanged();
            } else {
                if (m221359e1(likeUser, userM116503Pa)) {
                    return;
                }
                this.f205884c.m47424Z1().notifyDataSetChanged();
            }
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m221357f1();
        m98913V0();
        m98912U0();
        duringCreated(lifecycle().filter(new qcj() { // from class: l.tsn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.usn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180836a.m221356c1((C4470c) obj);
            }
        }, new y20() { // from class: l.vsn
            @Override // p153l.y20
            public final void call(Object obj) {
                zsn.m221355b1((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ihr.InterfaceC17720a
    /* JADX INFO: renamed from: c */
    public void mo140020c(boolean z) {
        this.f205884c.m47424Z1().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m221358d1(Bundle bundle) {
        ((ctn) this.viewModel).init();
        m98906N0();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m221359e1(LikeUser likeUser, User user) {
        if (jyb.m147479J(user.pictures)) {
            return false;
        }
        fwl.m127802h(m221361v());
        return CoreMemberModule.m37004F().m187693b().mo36979Qd(this.f205884c, true, true, 0, user.picture(0).cover().url, null, user, likeUser, "p_intl_like_i_sent,e_intl_i_like_photo,swipe_like", new y20() { // from class: l.wsn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190660a.mo98903K((LikeUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public void m221360g1(String str) {
        CoreModule.m30933P().m143410g().mo36092zr(this.f205884c, str);
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: q0 */
    public Act mo98919q0() {
        return this.f205884c;
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: r0 */
    public int mo98920r0() {
        return this.f205884c.m47424Z1().m164626T();
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: s0 */
    public String mo98921s0() {
        return "p_intl_like_i_sent,e_intl_i_like_photo,click";
    }

    @Override // p153l.bwl
    /* JADX INFO: renamed from: t */
    public void mo99759t(User user) {
        fwl.m127799e(m221361v());
        CoreModule.m30933P().m143405a().mo34370Me(this.f205884c, user, "p_intl_like_i_sent,e_intl_instantmatch_btn,click", new x20() { // from class: l.ysn
            @Override // p153l.x20
            public final void call() {
                this.f201422a.m98906N0();
            }
        });
    }

    @Override // p153l.an2
    /* JADX INFO: renamed from: t0 */
    public String mo98922t0() {
        return "p_intl_like_i_sent,e_intl_i_like_superlike,click";
    }

    /* JADX INFO: renamed from: v */
    public String m221361v() {
        return this.f205884c.pageId();
    }
}
