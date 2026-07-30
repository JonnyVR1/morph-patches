package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PickInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class pfy implements fzl {

    /* JADX INFO: renamed from: a */
    public final Act f152216a;

    public pfy(Act act) {
        this.f152216a = act;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m172165f(boolean z, User user, Act act, uxj0 uxj0Var) {
        if (z) {
            cey.m109477l(user.f56859id, RelationshipStatus.get("superliked"));
        } else {
            cey.m109477l(user.f56859id, RelationshipStatus.get("liked"));
        }
        act.startActivity(MessagesAct.m50126k2(act, user.f56859id, false, false));
        act.finishWithoutCustomAnimation();
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: a */
    public void mo128193a() {
        CoreModule.m30933P().m143405a().mo34568pr(this.f152216a, from(), Privilege.see_who_likes_me);
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: b */
    public boolean mo128194b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (!rbb0.m180744q()) {
            return false;
        }
        mo128193a();
        return true;
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: c */
    public void mo128195c(final Act act, final User user, boolean z, final boolean z2, boolean z3, C8145d c8145d, final String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        c8145d.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user.f56859id).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("mymeet"))).subscribe(psd0.m173597H(new y20() { // from class: l.mfy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136680a.m172166g(user, act, z2, str, (Relationship) obj);
            }
        }, new fjf0()));
    }

    @Override // p153l.fzl
    public String from() {
        return "p_meet_view,e_meet_see_card_highpopsee,like_swipe";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m172166g(final User user, final Act act, final boolean z, String str, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            cey.m109476k(user.f56859id);
            m172167h(user.f56859id);
            return;
        }
        if (!jyb.m147479J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.seeUpgraded))) {
            act.duringCreated(CoreModule.f18264c.f20384f0.m33905ap(user.f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.nfy
                @Override // p153l.y20
                public final void call(Object obj) {
                    pfy.m172165f(z, user, act, (uxj0) obj);
                }
            }, new y20() { // from class: l.ofy
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
            return;
        }
        if (!jyb.m147481L(str)) {
            bdr.m103631i(act);
        } else if (z) {
            z5h0.m218665L(act);
        } else {
            r1j0.m179414a(R$string.f19729v4);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m172167h(String str) {
        Act act = this.f152216a;
        act.startActivity(MessagesAct.m50127l2(act, str, false, false, 2));
        this.f152216a.finishWithoutCustomAnimation();
    }
}
