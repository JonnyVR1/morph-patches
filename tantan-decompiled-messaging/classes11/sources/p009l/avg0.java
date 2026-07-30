package p009l;

import android.os.Bundle;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ActionPageFormat;
import com.p1.mobile.putong.core.data.CardPattern;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.HashMap;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class avg0 extends jq2<bvg0> {

    /* JADX INFO: renamed from: a */
    public rug0 f9707a;

    /* JADX INFO: renamed from: b */
    public ActionPageFormat f9708b;

    /* JADX INFO: renamed from: c */
    public User f9709c;

    /* JADX INFO: renamed from: d */
    public CardPattern f9710d;

    public avg0(mcr mcrVar) {
        super(mcrVar);
        this.f9709c = null;
        this.f9710d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m11660m0(Bundle bundle) {
        ((bvg0) ((jq2) this).viewModel).m12286e(this.f9708b);
    }

    /* JADX INFO: renamed from: Z */
    public void m11661Z() {
        super.Z();
        this.f9708b = (ActionPageFormat) act().getIntent().getExtras().get(SuggestersAct.f5589e);
    }

    /* JADX INFO: renamed from: a0 */
    public void m11662a0() {
        creates(new e30() { // from class: l.xug0
            public final void call(Object obj) {
                this.f22732a.m11660m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11663h0(boolean z, final boolean z2, boolean z3, final C0158d c0158d) {
        HashMap map = new HashMap();
        map.put("sourcepage", nt30.f17643S0);
        map.put("actiontype", z3 ? "click" : "swipe");
        c0158d.m2448e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c0158d.m2449f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(this.f9709c).pageId(c0158d.m2451h()).build();
        duringCreated(CoreModule.c.m0.U7(z, z2, map, this.f9709c, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.H(new e30() { // from class: l.yug0
            public final void call(Object obj) {
                this.f23234a.m11667l0(c0158d, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.zug0
            public final void call(Object obj) {
                HomeStatisticsHelper.m636A(c0158d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public ActionPageFormat m11664i0() {
        return this.f9708b;
    }

    /* JADX INFO: renamed from: j0 */
    public k.e m11665j0() {
        if (this.f9707a == null) {
            this.f9707a = new rug0(this);
        }
        return this.f9707a;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m11666k0(boolean z, boolean z2, boolean z3, int i, String str) {
        m11663h0(z, z2, z3, HomeStatisticsHelper.m649f("p_suggest_users_home_view", z3, z, z2, this.f9709c).m2469z(i).m2439B(str));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m11667l0(C0158d c0158d, boolean z, Relationship relationship) {
        HomeStatisticsHelper.m637B(c0158d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            act().startActivityWithCustomTransition(MatchAct.e2(act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11668n0(boolean z) {
        m11666k0(z, false, false, 0, ((Media) this.f9709c.pictures.get(0)).url);
    }

    /* JADX INFO: renamed from: o0 */
    public void m11669o0(CardPattern cardPattern) {
        ((bvg0) ((jq2) this).viewModel).m12284c(cardPattern);
    }

    /* JADX INFO: renamed from: p0 */
    public void m11670p0() {
        ((bvg0) ((jq2) this).viewModel).m12285d(this.f9710d);
        CoreModule.c.m0.E8(this.f9710d.userId);
    }

    /* JADX INFO: renamed from: q0 */
    public void m11671q0(CardPattern cardPattern, User user) {
        this.f9710d = cardPattern;
        this.f9709c = user;
    }

    public void destroy() {
    }
}
