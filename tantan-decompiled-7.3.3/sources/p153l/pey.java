package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PickInfo;
import com.p051p1.mobile.putong.core.data.PicksTagType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class pey implements fzl {

    /* JADX INFO: renamed from: a */
    public final Act f152133a;

    public pey(Act act) {
        this.f152133a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m172063d(Throwable th) {
        bsj0.m106246D(th);
        if (joa.m146358H3() || ela.m121122r3() <= 0) {
            return;
        }
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m172064e(String str, Act act, boolean z, User user, boolean z2, Relationship relationship) {
        if (!jyb.m147481L(str)) {
            bdr.m103631i(act);
        } else if (z) {
            z5h0.m218665L(act);
        }
        if (TEnum.equals(relationship.state, "matched")) {
            cey.m109476k(user.f56859id);
            return;
        }
        if (!z2) {
            cey.m109476k(user.f56859id);
        } else if (!TextUtils.isEmpty(str)) {
            cey.m109477l(user.f56859id, RelationshipStatus.get("lettered"));
        } else if (z) {
            cey.m109477l(user.f56859id, RelationshipStatus.get("superliked"));
        } else {
            cey.m109477l(user.f56859id, RelationshipStatus.get("liked"));
        }
        if (joa.m146358H3() || ela.m121122r3() <= 0) {
            return;
        }
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: a */
    public void mo128193a() {
        C8927c.m54671r1(this.f152133a, from());
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: b */
    public boolean mo128194b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (TEnum.equals(pickInfo.picksTagType, PicksTagType.masking)) {
            mo128193a();
            return true;
        }
        if (!z && !joa.m146358H3()) {
            return true;
        }
        if (!joa.m146358H3() && ela.m121122r3() <= 0) {
            mo128193a();
            return true;
        }
        CounterLikeLimit counterLikeLimit = CoreModule.f18264c.m32487o3().likeLimit;
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8927c.m54685w0(this.f152133a, "e_picks_card_superlike");
            return true;
        }
        if (!z2 || a5i0.m96181x0() > 0) {
            return false;
        }
        if (joa.m146386f4()) {
            if (!joa.m146358H3() && ela.m121122r3() <= 0) {
                mo128193a();
            } else if (joa.m146386f4()) {
                CoreModule.m30933P().m143405a().mo34568pr(this.f152133a, "e_picks_card_superlike", Privilege.vip_super_like);
            } else {
                C8927c.m54574F1(this.f152133a, from());
            }
        } else if (joa.m146358H3() || ela.m121122r3() > 0) {
            C8927c.m54574F1(this.f152133a, from());
        } else {
            mo128193a();
        }
        return true;
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: c */
    public void mo128195c(final Act act, final User user, final boolean z, final boolean z2, boolean z3, C8145d c8145d, final String str, PickInfo pickInfo) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        c8145d.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user.f56859id).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(z, z2, map, user, str, LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, pickInfo.picksTracker)).subscribe(psd0.m173597H(new y20() { // from class: l.ney
            @Override // p153l.y20
            public final void call(Object obj) {
                pey.m172064e(str, act, z2, user, z, (Relationship) obj);
            }
        }, new y20() { // from class: l.oey
            @Override // p153l.y20
            public final void call(Object obj) {
                pey.m172063d((Throwable) obj);
            }
        }));
    }

    @Override // p153l.fzl
    public String from() {
        return "p_meet_view,e_picks_feed_card,like_swipe";
    }
}
