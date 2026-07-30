package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class kj40 extends jq2<rj40> {

    /* JADX INFO: renamed from: a */
    public final String f123430a;

    public kj40(mcr mcrVar, String str) {
        super(mcrVar);
        this.f123430a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m146175h0(Bundle bundle) {
        ((rj40) this.viewModel).m179558A3(this.f123430a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.hj40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108030a.m146175h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m146176i0(User user, Relationship relationship) {
        CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act().startActivityWithCustomTransition(MatchAct.m47563e2(act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        }
        lsi0.m151593w(R$string.f18880rb);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: j0 */
    public void m146177j0(final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(true).isFromButton(true).isSuperLiked(false).user(user.f56011id).pageId(act().pageId()).build();
        duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(true, false, null, user, null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.ij40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113497a.m146176i0(user, (Relationship) obj);
            }
        }, new e30() { // from class: l.jj40
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f18807ot);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
