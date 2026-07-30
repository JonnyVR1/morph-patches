package p149l;

import android.os.Bundle;
import androidx.recyclerview.widget.C0605k;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ActionPageFormat;
import com.p046p1.mobile.putong.core.data.CardPattern;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class avg0 extends jq2<bvg0> {

    /* JADX INFO: renamed from: a */
    public rug0 f71935a;

    /* JADX INFO: renamed from: b */
    public ActionPageFormat f71936b;

    /* JADX INFO: renamed from: c */
    public User f71937c;

    /* JADX INFO: renamed from: d */
    public CardPattern f71938d;

    public avg0(mcr mcrVar) {
        super(mcrVar);
        this.f71937c = null;
        this.f71938d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m99181m0(Bundle bundle) {
        ((bvg0) this.viewModel).m104039e(this.f71936b);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f71936b = (ActionPageFormat) act().getIntent().getExtras().get(SuggestersAct.f26811e);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.xug0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194497a.m99181m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m99182h0(boolean z, final boolean z2, boolean z3, final C7994d c7994d) {
        HashMap map = new HashMap();
        map.put("sourcepage", nt30.f140333S0);
        map.put("actiontype", z3 ? "click" : "swipe");
        c7994d.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(this.f71937c).pageId(c7994d.m38473h()).build();
        duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, map, this.f71937c, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.m154956H(new e30() { // from class: l.yug0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200078a.m99186l0(c7994d, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.zug0
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public ActionPageFormat m99183i0() {
        return this.f71936b;
    }

    /* JADX INFO: renamed from: j0 */
    public C0605k.e m99184j0() {
        if (this.f71935a == null) {
            this.f71935a = new rug0(this);
        }
        return this.f71935a;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m99185k0(boolean z, boolean z2, boolean z3, int i, String str) {
        m99182h0(z, z2, z3, HomeStatisticsHelper.m36700f("p_suggest_users_home_view", z3, z, z2, this.f71937c).m38491z(i).m38461B(str));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m99186l0(C7994d c7994d, boolean z, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            act().startActivityWithCustomTransition(MatchAct.m47563e2(act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m99187n0(boolean z) {
        m99185k0(z, false, false, 0, this.f71937c.pictures.get(0).url);
    }

    /* JADX INFO: renamed from: o0 */
    public void m99188o0(CardPattern cardPattern) {
        ((bvg0) this.viewModel).m104037c(cardPattern);
    }

    /* JADX INFO: renamed from: p0 */
    public void m99189p0() {
        ((bvg0) this.viewModel).m104038d(this.f71938d);
        CoreModule.f17545c.f19663m0.m30994E8(this.f71938d.userId);
    }

    /* JADX INFO: renamed from: q0 */
    public void m99190q0(CardPattern cardPattern, User user) {
        this.f71938d = cardPattern;
        this.f71937c = user;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
