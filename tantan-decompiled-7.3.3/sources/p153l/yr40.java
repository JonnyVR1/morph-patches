package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class yr40 extends ar2<fs40> {

    /* JADX INFO: renamed from: a */
    public final String f201279a;

    public yr40(ner nerVar, String str) {
        super(nerVar);
        this.f201279a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m217161h0(Bundle bundle) {
        ((fs40) this.viewModel).m127030A3(this.f201279a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.vr40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185433a.m217161h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m217162i0(User user, Relationship relationship) {
        CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act().startActivityWithCustomTransition(MatchAct.m48746g2(act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        }
        o1j0.m165649w(R$string.f18483Gb);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: j0 */
    public void m217163j0(final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(true).isFromButton(true).isSuperLiked(false).user(user.f56859id).pageId(act().pageId()).build();
        duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(true, false, null, user, null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, null)).subscribe(psd0.m173597H(new y20() { // from class: l.wr40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190471a.m217162i0(user, (Relationship) obj);
            }
        }, new y20() { // from class: l.xr40
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f18625Kt);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
