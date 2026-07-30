package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PickInfo;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class b3y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f73266a;

    public b3y(Act act) {
        this.f73266a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m100118d(C7994d c7994d, final Act act, final User user, boolean z, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            act.startActivity(MessagesAct.m48944k2(act, user.f56011id, false, false, 2));
            return;
        }
        if (z) {
            if (vwb.m200296J(relationship.status) || !relationship.status.contains(MatchFrom.get(MatchFrom.seeUpgraded))) {
                lsi0.m151578h(R$string.f18933t4);
            } else {
                act.duringCreated(CoreModule.f17545c.f19642f0.m32902ap(user.f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.a3y
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        Act act2 = act;
                        act2.startActivity(MessagesAct.m48943i2(act2, user.f56011id, false, false));
                    }
                }, new yaf0()));
            }
        }
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: a */
    public void mo100120a() {
        C8764c.m53376A1(this.f73266a, from());
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
    public void mo100122c(final Act act, final User user, final boolean z, boolean z2, boolean z3, final C7994d c7994d, String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", z3 ? "click" : "swipe");
        c7994d.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.m154955G(new e30() { // from class: l.z2y
            @Override // p149l.e30
            public final void call(Object obj) {
                b3y.m100118d(c7994d, act, user, z, (Relationship) obj);
            }
        }));
        CoreModule.f17545c.f19664m1.m34690H5(user.f56011id);
    }

    @Override // p149l.nwl
    public String from() {
        return "p_meet_view,e_meet_see_card,like_swipe";
    }
}
