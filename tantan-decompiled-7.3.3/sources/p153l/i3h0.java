package p153l;

import android.os.Bundle;
import androidx.recyclerview.widget.C0607k;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ActionPageFormat;
import com.p051p1.mobile.putong.core.data.CardPattern;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class i3h0 extends ar2<j3h0> {

    /* JADX INFO: renamed from: a */
    public z2h0 f112727a;

    /* JADX INFO: renamed from: b */
    public ActionPageFormat f112728b;

    /* JADX INFO: renamed from: c */
    public User f112729c;

    /* JADX INFO: renamed from: d */
    public CardPattern f112730d;

    public i3h0(ner nerVar) {
        super(nerVar);
        this.f112729c = null;
        this.f112730d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m138290m0(Bundle bundle) {
        ((j3h0) this.viewModel).m143357e(this.f112728b);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f112728b = (ActionPageFormat) act().getIntent().getExtras().get(SuggestersAct.f27659e);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.f3h0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96992a.m138290m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m138291h0(boolean z, final boolean z2, boolean z3, final C8145d c8145d) {
        HashMap map = new HashMap();
        map.put("sourcepage", b240.f74485S0);
        map.put("actiontype", z3 ? "click" : "swipe");
        c8145d.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(this.f112729c).pageId(c8145d.m39476h()).build();
        duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, map, this.f112729c, likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(psd0.m173597H(new y20() { // from class: l.g3h0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101988a.m138295l0(c8145d, z2, (Relationship) obj);
            }
        }, new y20() { // from class: l.h3h0
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public ActionPageFormat m138292i0() {
        return this.f112728b;
    }

    /* JADX INFO: renamed from: j0 */
    public C0607k.e m138293j0() {
        if (this.f112727a == null) {
            this.f112727a = new z2h0(this);
        }
        return this.f112727a;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m138294k0(boolean z, boolean z2, boolean z3, int i, String str) {
        m138291h0(z, z2, z3, HomeStatisticsHelper.m37703f("p_suggest_users_home_view", z3, z, z2, this.f112729c).m39494z(i).m39464B(str));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m138295l0(C8145d c8145d, boolean z, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            act().startActivityWithCustomTransition(MatchAct.m48746g2(act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m138296n0(boolean z) {
        m138294k0(z, false, false, 0, this.f112729c.pictures.get(0).url);
    }

    /* JADX INFO: renamed from: o0 */
    public void m138297o0(CardPattern cardPattern) {
        ((j3h0) this.viewModel).m143355c(cardPattern);
    }

    /* JADX INFO: renamed from: p0 */
    public void m138298p0() {
        ((j3h0) this.viewModel).m143356d(this.f112730d);
        CoreModule.f18264c.f20405m0.m31997E8(this.f112730d.userId);
    }

    /* JADX INFO: renamed from: q0 */
    public void m138299q0(CardPattern cardPattern, User user) {
        this.f112730d = cardPattern;
        this.f112729c = user;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
