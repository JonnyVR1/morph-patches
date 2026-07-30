package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PickInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class s6y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f162864a;

    public s6y(Act act) {
        this.f162864a = act;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m182473f(boolean z, User user, Act act, roj0 roj0Var) {
        if (z) {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("superliked"));
        } else {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("liked"));
        }
        act.startActivity(MessagesAct.m48943i2(act, user.f56011id, false, false));
        act.finishWithoutCustomAnimation();
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: a */
    public void mo100120a() {
        CoreModule.m29935P().m94651a().mo33565pr(this.f162864a, from(), Privilege.see_who_likes_me);
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: b */
    public boolean mo100121b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (!n3b0.m157742q()) {
            return false;
        }
        mo100120a();
        return true;
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: c */
    public void mo100122c(final Act act, final User user, boolean z, final boolean z2, boolean z3, C7994d c7994d, final String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        c7994d.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user.f56011id).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("mymeet"))).subscribe(mkd0.m154956H(new e30() { // from class: l.p6y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147458a.m182474g(user, act, z2, str, (Relationship) obj);
            }
        }, new yaf0()));
    }

    @Override // p149l.nwl
    public String from() {
        return "p_meet_view,e_meet_see_card_highpopsee,like_swipe";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m182474g(final User user, final Act act, final boolean z, String str, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            f5y.m119546k(user.f56011id);
            m182475h(user.f56011id);
            return;
        }
        if (!vwb.m200296J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.seeUpgraded))) {
            act.duringCreated(CoreModule.f17545c.f19642f0.m32902ap(user.f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.q6y
                @Override // p149l.e30
                public final void call(Object obj) {
                    s6y.m182473f(z, user, act, (roj0) obj);
                }
            }, new e30() { // from class: l.r6y
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
            return;
        }
        if (!vwb.m200298L(str)) {
            zar.m217750i(act);
        } else if (z) {
            rxg0.m181562L(act);
        } else {
            osi0.m165777a(R$string.f18933t4);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m182475h(String str) {
        Act act = this.f162864a;
        act.startActivity(MessagesAct.m48944k2(act, str, false, false, 2));
        this.f162864a.finishWithoutCustomAnimation();
    }
}
