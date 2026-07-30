package p002l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Map;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kj40 extends jq2<rj40> {

    /* JADX INFO: renamed from: a */
    public final String f14354a;

    public kj40(mcr mcrVar, String str) {
        super(mcrVar);
        this.f14354a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m16642h0(Bundle bundle) {
        ((rj40) ((jq2) this).viewModel).m22015A3(this.f14354a);
    }

    /* JADX INFO: renamed from: Z */
    public void m16643Z() {
        super.Z();
        creates(new e30() { // from class: l.hj40
            public final void call(Object obj) {
                this.f12060a.m16642h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m16644i0(User user, Relationship relationship) {
        CoreModule.c.m0.E8(((DbObject) user).id);
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act().startActivityWithCustomTransition(MatchAct.e2(act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        }
        lsi0.w(R.string.rb);
        act().finish();
    }

    /* JADX INFO: renamed from: j0 */
    public void m16645j0(final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(true).isFromButton(true).isSuperLiked(false).user(((DbObject) user).id).pageId(act().pageId()).build();
        duringCreated(CoreModule.c.m0.Y7(true, false, (Map) null, user, (String) null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, (String) null)).subscribe(mkd0.H(new e30() { // from class: l.ij40
            public final void call(Object obj) {
                this.f13267a.m16644i0(user, (Relationship) obj);
            }
        }, new e30() { // from class: l.jj40
            public final void call(Object obj) {
                lsi0.w(R.string.ot);
            }
        }));
    }

    public void destroy() {
    }
}
