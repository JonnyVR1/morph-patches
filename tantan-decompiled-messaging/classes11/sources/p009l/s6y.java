package p009l;

import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.PickInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.e30;
import l.mkd0;
import l.n3b0;
import l.osi0;
import l.roj0;
import l.rxg0;
import l.vwb;
import l.yaf0;
import l.zar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s6y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f20123a;

    public s6y(Act act) {
        this.f20123a = act;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22002f(boolean z, User user, Act act, roj0 roj0Var) {
        if (z) {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("superliked"));
        } else {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("liked"));
        }
        act.startActivity(MessagesAct.i2(act, ((DbObject) user).id, false, false));
        act.finishWithoutCustomAnimation();
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: a */
    public void mo11827a() {
        CoreModule.P().a().pr(this.f20123a, from(), Privilege.see_who_likes_me);
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: b */
    public boolean mo11828b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (!n3b0.q()) {
            return false;
        }
        mo11827a();
        return true;
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: c */
    public void mo11829c(final Act act, final User user, boolean z, final boolean z2, boolean z3, C0158d c0158d, final String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        c0158d.m2448e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c0158d.m2449f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(((DbObject) user).id).pageId(c0158d.m2451h()).build();
        act.duringCreated(CoreModule.c.m0.U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("mymeet"))).subscribe(mkd0.H(new e30() { // from class: l.p6y
            public final void call(Object obj) {
                this.f18411a.m22003g(user, act, z2, str, (Relationship) obj);
            }
        }, new yaf0()));
    }

    @Override // p009l.nwl
    public String from() {
        return "p_meet_view,e_meet_see_card_highpopsee,like_swipe";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m22003g(final User user, final Act act, final boolean z, String str, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            f5y.m14277k(((DbObject) user).id);
            m22004h(((DbObject) user).id);
            return;
        }
        if (!vwb.J(relationship.status) && relationship.status.contains(MatchFrom.get("seeUpgraded"))) {
            act.duringCreated(CoreModule.c.f0.ap(((DbObject) user).id)).subscribe(mkd0.H(new e30() { // from class: l.q6y
                public final void call(Object obj) {
                    s6y.m22002f(z, user, act, (roj0) obj);
                }
            }, new e30() { // from class: l.r6y
                public final void call(Object obj) {
                    yij0.m25382D((Throwable) obj);
                }
            }));
            return;
        }
        if (!vwb.L(str)) {
            zar.i(act);
        } else if (z) {
            rxg0.L(act);
        } else {
            osi0.a(R.string.t4);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22004h(String str) {
        Act act = this.f20123a;
        act.startActivity(MessagesAct.k2(act, str, false, false, 2));
        this.f20123a.finishWithoutCustomAnimation();
    }
}
