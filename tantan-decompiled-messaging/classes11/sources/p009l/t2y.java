package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PickInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.e30;
import l.mkd0;
import l.rxg0;
import l.vwb;
import l.xma;
import l.yaf0;
import l.zar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class t2y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f20545a;

    public t2y(Act act) {
        this.f20545a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22463d(String str, Act act, boolean z, User user, boolean z2, Relationship relationship) {
        if (!vwb.L(str)) {
            zar.i(act);
        } else if (z) {
            rxg0.L(act);
        }
        if (TEnum.equals(relationship.state, "matched")) {
            f5y.m14277k(((DbObject) user).id);
            return;
        }
        if (!z2) {
            f5y.m14277k(((DbObject) user).id);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("lettered"));
        } else if (z) {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("superliked"));
        } else if (z2) {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("liked"));
        }
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: a */
    public void mo11827a() {
        c.x0(this.f20545a, from(), Privilege.liked_user);
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: b */
    public boolean mo11828b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (!xma.e4()) {
            return false;
        }
        mo11827a();
        return true;
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: c */
    public void mo11829c(final Act act, final User user, final boolean z, final boolean z2, boolean z3, C0158d c0158d, final String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        c0158d.m2448e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c0158d.m2449f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(((DbObject) user).id).pageId(c0158d.m2451h()).build();
        act.duringCreated(CoreModule.c.m0.W7(z, z2, map, user, str, LikeFrom.get("mymeet"), true, likeExtraDataNew_)).subscribe(mkd0.H(new e30() { // from class: l.s2y
            public final void call(Object obj) {
                t2y.m22463d(str, act, z2, user, z, (Relationship) obj);
            }
        }, new yaf0()));
    }

    @Override // p009l.nwl
    public String from() {
        return "p_meet_view,e_whoiliked_card,sayhi_superlike";
    }
}
