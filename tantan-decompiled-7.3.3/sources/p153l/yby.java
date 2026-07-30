package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PickInfo;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class yby implements fzl {

    /* JADX INFO: renamed from: a */
    public final Act f198369a;

    public yby(Act act) {
        this.f198369a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m215116d(C8145d c8145d, final Act act, final User user, boolean z, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            act.startActivity(MessagesAct.m50127l2(act, user.f56859id, false, false, 2));
            return;
        }
        if (z) {
            if (jyb.m147479J(relationship.status) || !relationship.status.contains(MatchFrom.get(MatchFrom.seeUpgraded))) {
                o1j0.m165634h(R$string.f19729v4);
            } else {
                act.duringCreated(CoreModule.f18264c.f20384f0.m33905ap(user.f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.xby
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        Act act2 = act;
                        act2.startActivity(MessagesAct.m50126k2(act2, user.f56859id, false, false));
                    }
                }, new fjf0()));
            }
        }
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: a */
    public void mo128193a() {
        C8927c.m54559A1(this.f198369a, from());
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
    public void mo128195c(final Act act, final User user, final boolean z, boolean z2, boolean z3, final C8145d c8145d, String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", z3 ? "click" : "swipe");
        c8145d.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(psd0.m173596G(new y20() { // from class: l.wby
            @Override // p153l.y20
            public final void call(Object obj) {
                yby.m215116d(c8145d, act, user, z, (Relationship) obj);
            }
        }));
        CoreModule.f18264c.f20406m1.m35693H5(user.f56859id);
    }

    @Override // p153l.fzl
    public String from() {
        return "p_meet_view,e_meet_see_card,like_swipe";
    }
}
