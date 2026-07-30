package p009l;

import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.PickInfo;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.n3b0;
import l.vwb;
import l.yaf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b3y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f9892a;

    public b3y(Act act) {
        this.f9892a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11825d(C0158d c0158d, final Act act, final User user, boolean z, Relationship relationship) {
        HomeStatisticsHelper.m637B(c0158d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            act.startActivity(MessagesAct.k2(act, ((DbObject) user).id, false, false, 2));
            return;
        }
        if (z) {
            if (vwb.J(relationship.status) || !relationship.status.contains(MatchFrom.get("seeUpgraded"))) {
                lsi0.h(R.string.t4);
            } else {
                act.duringCreated(CoreModule.c.f0.ap(((DbObject) user).id)).subscribe(mkd0.H(new e30() { // from class: l.a3y
                    public final void call(Object obj) {
                        Act act2 = act;
                        act2.startActivity(MessagesAct.i2(act2, ((DbObject) user).id, false, false));
                    }
                }, new yaf0()));
            }
        }
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: a */
    public void mo11827a() {
        c.A1(this.f9892a, from());
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
    public void mo11829c(final Act act, final User user, final boolean z, boolean z2, boolean z3, final C0158d c0158d, String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", z3 ? "click" : "swipe");
        c0158d.m2448e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c0158d.m2449f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c0158d.m2451h()).build();
        act.duringCreated(CoreModule.c.m0.U7(z, z2, map, user, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.G(new e30() { // from class: l.z2y
            public final void call(Object obj) {
                b3y.m11825d(c0158d, act, user, z, (Relationship) obj);
            }
        }));
        CoreModule.c.m1.H5(((DbObject) user).id);
    }

    @Override // p009l.nwl
    public String from() {
        return "p_meet_view,e_meet_see_card,like_swipe";
    }
}
