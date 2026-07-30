package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PickInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.CounterLikeLimit;
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
import l.mb90;
import l.mkd0;
import l.rxg0;
import l.sja;
import l.swh0;
import l.vwb;
import l.xma;
import l.zar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s5y implements nwl {

    /* JADX INFO: renamed from: a */
    public final Act f20098a;

    public s5y(Act act) {
        this.f20098a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21984d(Throwable th) {
        yij0.m25382D(th);
        if (xma.G3() || sja.r3() <= 0) {
            return;
        }
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21985e(String str, Act act, boolean z, User user, boolean z2, Relationship relationship) {
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
        } else if (!TextUtils.isEmpty(str)) {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("lettered"));
        } else if (z) {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("superliked"));
        } else {
            f5y.m14278l(((DbObject) user).id, RelationshipStatus.get("liked"));
        }
        if (xma.G3() || sja.r3() <= 0) {
            return;
        }
        CoreModule.c.C0.u4();
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: a */
    public void mo11827a() {
        c.r1(this.f20098a, from());
    }

    @Override // p009l.nwl
    /* JADX INFO: renamed from: b */
    public boolean mo11828b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (TEnum.equals(pickInfo.picksTagType, "masking")) {
            mo11827a();
            return true;
        }
        if (!z && !xma.G3()) {
            return true;
        }
        if (!xma.G3() && sja.r3() <= 0) {
            mo11827a();
            return true;
        }
        CounterLikeLimit counterLikeLimit = CoreModule.c.o3().likeLimit;
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            c.w0(this.f20098a, "e_picks_card_superlike");
            return true;
        }
        if (!z2 || swh0.x0() > 0) {
            return false;
        }
        if (xma.e4()) {
            if (!xma.G3() && sja.r3() <= 0) {
                mo11827a();
            } else if (xma.e4()) {
                CoreModule.P().a().pr(this.f20098a, "e_picks_card_superlike", Privilege.vip_super_like);
            } else {
                c.F1(this.f20098a, from());
            }
        } else if (xma.G3() || sja.r3() > 0) {
            c.F1(this.f20098a, from());
        } else {
            mo11827a();
        }
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
        act.duringCreated(CoreModule.c.m0.Y7(z, z2, map, user, str, LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, pickInfo.picksTracker)).subscribe(mkd0.H(new e30() { // from class: l.q5y
            public final void call(Object obj) {
                s5y.m21985e(str, act, z2, user, z, (Relationship) obj);
            }
        }, new e30() { // from class: l.r5y
            public final void call(Object obj) {
                s5y.m21984d((Throwable) obj);
            }
        }));
    }

    @Override // p009l.nwl
    public String from() {
        return "p_meet_view,e_picks_feed_card,like_swipe";
    }
}
