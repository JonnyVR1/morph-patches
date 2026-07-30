package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PickInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class t2y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f167556a;

    public t2y(Act act) {
        this.f167556a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m187060d(String str, Act act, boolean z, User user, boolean z2, Relationship relationship) {
        if (!vwb.m200298L(str)) {
            zar.m217750i(act);
        } else if (z) {
            rxg0.m181562L(act);
        }
        if (TEnum.equals(relationship.state, "matched")) {
            f5y.m119546k(user.f56011id);
            return;
        }
        if (!z2) {
            f5y.m119546k(user.f56011id);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("lettered"));
        } else if (z) {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("superliked"));
        } else if (z2) {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("liked"));
        }
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: a */
    public void mo100120a() {
        C8764c.m53504x0(this.f167556a, from(), Privilege.liked_user);
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: b */
    public boolean mo100121b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (!xma.m210071e4()) {
            return false;
        }
        mo100120a();
        return true;
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: c */
    public void mo100122c(final Act act, final User user, final boolean z, final boolean z2, boolean z3, C7994d c7994d, final String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        c7994d.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user.f56011id).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31065W7(z, z2, map, user, str, LikeFrom.get("mymeet"), true, likeExtraDataNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.s2y
            @Override // p149l.e30
            public final void call(Object obj) {
                t2y.m187060d(str, act, z2, user, z, (Relationship) obj);
            }
        }, new yaf0()));
    }

    @Override // p149l.nwl
    public String from() {
        return "p_meet_view,e_whoiliked_card,sayhi_superlike";
    }
}
