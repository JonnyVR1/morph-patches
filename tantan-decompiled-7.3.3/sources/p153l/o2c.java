package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.messages.HomeFeaturedTabFrag;
import com.p051p1.mobile.putong.core.p058ui.MKWebViewFrag;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public class o2c {

    /* JADX INFO: renamed from: l.o2c$a */
    public class C19013a implements y20<Relationship> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f144737a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f144738b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y20 f144739c;

        public C19013a(boolean z, Act act, y20 y20Var) {
            this.f144737a = z;
            this.f144738b = act;
            this.f144739c = y20Var;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Relationship relationship) {
            CoreModule.f18264c.f20297C0.m146425v4();
            if (TEnum.equals(relationship.state, "matched")) {
                int i = 0;
                if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                    i = 13;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                    i = this.f144737a ? 12 : 11;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                    i = 1;
                }
                Act act = this.f144738b;
                act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
            }
            if (NullChecker.m82486a(this.f144739c)) {
                this.f144739c.call(relationship);
            }
        }
    }

    /* JADX INFO: renamed from: l.o2c$b */
    public class C19014b implements y20<Throwable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f144740a;

        public C19014b(x20 x20Var) {
            this.f144740a = x20Var;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            th.printStackTrace();
            CoreModule.f18264c.f20297C0.m146425v4();
            if (NullChecker.m82486a(this.f144740a)) {
                this.f144740a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.o2c$c */
    public class RunnableC19015c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m165703a(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m165705c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m165706d() {
        String str = CoreModule.f18264c.f20419q2.f180587a0.get();
        if (TextUtils.equals(str, "normal")) {
            return "normal";
        }
        if (TextUtils.equals(str, "pending")) {
            return "pending";
        }
        if (TextUtils.equals(str, AIMessageFeedback.good)) {
            return AIMessageFeedback.good;
        }
        CoreModule.f18264c.f20419q2.m197491p3();
        return "unknown_";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m165707e() {
        return TextUtils.equals(m165706d(), "normal");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m165708f() {
        return TextUtils.equals(m165706d(), AIMessageFeedback.good);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m165709g() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        String userInfoForMarryStatus = userM116593na.getUserInfoForMarryStatus();
        return TextUtils.equals(m165706d(), "pending") || (userM116593na.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus));
    }

    /* JADX INFO: renamed from: h */
    public static MKWebViewFrag m165710h(Context context, String str) {
        if (!m165708f()) {
            CoreModule.f18264c.f20419q2.m197491p3();
        }
        StringBuilder sb = new StringBuilder((qv5.f159697a.get().contains("staging") ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/selected-users/index.html?speed=true&_bid=1004673&hideNavigationBar=1&hideNotch=1"));
        sb.append("&topHeight=");
        sb.append(((bnl0.m105511F0() * 1.0f) / qa00.m175858c().density) + 44.0f);
        sb.append("&goodUser=");
        sb.append(m165708f());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&from=");
            sb.append(str);
        }
        sb.append("#/expPage1");
        CoreModule.m30932N().mo61547jk();
        HomeFeaturedTabFrag homeFeaturedTabFrag = new HomeFeaturedTabFrag();
        Bundle bundle = new Bundle();
        bundle.putString("url", sb.toString());
        homeFeaturedTabFrag.setArguments(bundle);
        return homeFeaturedTabFrag;
    }

    /* JADX INFO: renamed from: i */
    public static Intent m165711i(Context context, String str) {
        if (!m165708f()) {
            CoreModule.f18264c.f20419q2.m197491p3();
        }
        StringBuilder sb = new StringBuilder((qv5.f159697a.get().contains("staging") ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/selected-users/index.html?speed=true&_bid=1004673&hideNavigationBar=1&hideNotch=1&transparent_status_bar=1"));
        sb.append("&goodUser=");
        sb.append(m165708f());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&from=");
            sb.append(str);
        }
        sb.append("#/expPage2");
        CoreModule.m30932N().mo61547jk();
        return MkWebViewAct.m81423g2(context, "", sb.toString(), true, true, true, true, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m165712j(final Act act, final User user, final boolean z, final boolean z2, final String str, final y20<Relationship> y20Var, final x20 x20Var) {
        if (!z) {
            m165714l(act, user, z, z2, str, y20Var, x20Var);
        } else if (m165713k(act, z2, new x20() { // from class: l.m2c
            @Override // p153l.x20
            public final void call() {
                o2c.m165714l(act, user, z, z2, str, y20Var, x20Var);
            }
        })) {
            m165714l(act, user, z, z2, str, y20Var, x20Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m165713k(Act act, boolean z, final x20 x20Var) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (counterM32487o3 == null) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            return false;
        }
        if (userM116600p9.isNameFake()) {
            gta.m132210e().m132214d().mo34654A(act);
            return false;
        }
        if (!joa.m146358H3() && ela.m121122r3() <= 0) {
            m165716n(act);
            return false;
        }
        if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8927c.m54687x0(act, "p_picks_view,e_picks_card,click_like", Privilege.vip_unlimited_likes);
            return false;
        }
        if (!z || gta.m132210e().m132214d().mo34919rs() > 0) {
            return (z && CoreModule.m30933P().m143412i().mo180407U5(act, new x20() { // from class: l.n2c
                @Override // p153l.x20
                public final void call() {
                    o2c.m165703a(x20Var);
                }
            })) ? false : true;
        }
        if (joa.m146386f4()) {
            if (!joa.m146358H3() && ela.m121122r3() <= 0) {
                m165716n(act);
            } else if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
                C8927c.m54574F1(act, "p_picks_view,e_picks_card,click_like");
            } else {
                C8927c.m54687x0(act, "p_picks_view,e_picks_card,click_like", Privilege.vip_super_like);
            }
        } else if (joa.m146358H3() || ela.m121122r3() > 0) {
            C8927c.m54574F1(act, abb0.m96736c("p_navigation_ilike,card_button_pull", 1));
        } else {
            m165716n(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m165714l(Act act, User user, boolean z, boolean z2, String str, y20<Relationship> y20Var, x20 x20Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.PICKS.getFrom()).isLike(z).isSuperLiked(z2).user(user.f56859id).pageId(str).build();
        if (gta.m132210e().m132214d().mo34719Lc() && m165709g() && ela.m121122r3() > 0 && ela.m121106B3() - ela.m121122r3() == 0) {
            likeExtraDataNew_.state = RelationshipStatus.get(RelationshipStatus.pendingLiked);
        }
        likeExtraDataNew_.isSelectedUser = true;
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, null, user, likeExtraDataNew_, LikeFrom.get("picks"))).subscribe(psd0.m173597H(new C19013a(z2, act, y20Var), new C19014b(x20Var)));
    }

    /* JADX INFO: renamed from: m */
    public static void m165715m(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        CoreModule.f18264c.f20419q2.m197498x3(jSONArray, str2);
    }

    /* JADX INFO: renamed from: n */
    public static void m165716n(Act act) {
        CoreModule.f18273l.m143405a().mo34369Mc(act, "p_picks_view,e_picks_card,click_like");
        l51.m152888H(act, new RunnableC19015c(), 1000L);
    }
}
