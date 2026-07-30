package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PickInfo;
import com.p046p1.mobile.putong.core.data.PicksTagType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class s5y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f162603a;

    public s5y(Act act) {
        this.f162603a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m182384d(Throwable th) {
        yij0.m214926D(th);
        if (xma.m210044G3() || sja.m184461r3() <= 0) {
            return;
        }
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m182385e(String str, Act act, boolean z, User user, boolean z2, Relationship relationship) {
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
        } else if (!TextUtils.isEmpty(str)) {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("lettered"));
        } else if (z) {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("superliked"));
        } else {
            f5y.m119547l(user.f56011id, RelationshipStatus.get("liked"));
        }
        if (xma.m210044G3() || sja.m184461r3() <= 0) {
            return;
        }
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: a */
    public void mo100120a() {
        C8764c.m53488r1(this.f162603a, from());
    }

    @Override // p149l.nwl
    /* JADX INFO: renamed from: b */
    public boolean mo100121b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (TEnum.equals(pickInfo.picksTagType, PicksTagType.masking)) {
            mo100120a();
            return true;
        }
        if (!z && !xma.m210044G3()) {
            return true;
        }
        if (!xma.m210044G3() && sja.m184461r3() <= 0) {
            mo100120a();
            return true;
        }
        CounterLikeLimit counterLikeLimit = CoreModule.f17545c.m31484o3().likeLimit;
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8764c.m53502w0(this.f162603a, "e_picks_card_superlike");
            return true;
        }
        if (!z2 || swh0.m186276x0() > 0) {
            return false;
        }
        if (xma.m210071e4()) {
            if (!xma.m210044G3() && sja.m184461r3() <= 0) {
                mo100120a();
            } else if (xma.m210071e4()) {
                CoreModule.m29935P().m94651a().mo33565pr(this.f162603a, "e_picks_card_superlike", Privilege.vip_super_like);
            } else {
                C8764c.m53391F1(this.f162603a, from());
            }
        } else if (xma.m210044G3() || sja.m184461r3() > 0) {
            C8764c.m53391F1(this.f162603a, from());
        } else {
            mo100120a();
        }
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
        act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(z, z2, map, user, str, LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, pickInfo.picksTracker)).subscribe(mkd0.m154956H(new e30() { // from class: l.q5y
            @Override // p149l.e30
            public final void call(Object obj) {
                s5y.m182385e(str, act, z2, user, z, (Relationship) obj);
            }
        }, new e30() { // from class: l.r5y
            @Override // p149l.e30
            public final void call(Object obj) {
                s5y.m182384d((Throwable) obj);
            }
        }));
    }

    @Override // p149l.nwl
    public String from() {
        return "p_meet_view,e_picks_feed_card,like_swipe";
    }
}
