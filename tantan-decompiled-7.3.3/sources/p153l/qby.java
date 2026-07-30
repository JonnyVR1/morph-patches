package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PickInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class qby implements fzl {

    /* JADX INFO: renamed from: a */
    public final Act f156522a;

    public qby(Act act) {
        this.f156522a = act;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m176090d(String str, Act act, boolean z, User user, boolean z2, Relationship relationship) {
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
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            cey.m109477l(user.f56859id, RelationshipStatus.get("lettered"));
        } else if (z) {
            cey.m109477l(user.f56859id, RelationshipStatus.get("superliked"));
        } else if (z2) {
            cey.m109477l(user.f56859id, RelationshipStatus.get("liked"));
        }
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: a */
    public void mo128193a() {
        C8927c.m54687x0(this.f156522a, from(), Privilege.liked_user);
    }

    @Override // p153l.fzl
    /* JADX INFO: renamed from: b */
    public boolean mo128194b(boolean z, boolean z2, boolean z3, String str, PickInfo pickInfo) {
        if (!joa.m146386f4()) {
            return false;
        }
        mo128193a();
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
        act.duringCreated(CoreModule.f18264c.f20405m0.m32068W7(z, z2, map, user, str, LikeFrom.get("mymeet"), true, likeExtraDataNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.pby
            @Override // p153l.y20
            public final void call(Object obj) {
                qby.m176090d(str, act, z2, user, z, (Relationship) obj);
            }
        }, new fjf0()));
    }

    @Override // p153l.fzl
    public String from() {
        return "p_meet_view,e_whoiliked_card,sayhi_superlike";
    }
}
