package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.messages.HomeFeaturedTabFrag;
import com.p046p1.mobile.putong.core.p053ui.MKWebViewFrag;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public class b1c {

    /* JADX INFO: renamed from: l.b1c$a */
    public class C15771a implements e30<Relationship> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f72507a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f72508b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f72509c;

        public C15771a(boolean z, Act act, e30 e30Var) {
            this.f72507a = z;
            this.f72508b = act;
            this.f72509c = e30Var;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Relationship relationship) {
            CoreModule.f17545c.f19555C0.m210112u4();
            if (TEnum.equals(relationship.state, "matched")) {
                int i = 0;
                if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                    i = 13;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                    i = this.f72507a ? 12 : 11;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                    i = 1;
                }
                Act act = this.f72508b;
                act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
            }
            if (NullChecker.m81303a(this.f72509c)) {
                this.f72509c.call(relationship);
            }
        }
    }

    /* JADX INFO: renamed from: l.b1c$b */
    public class C15772b implements e30<Throwable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f72510a;

        public C15772b(d30 d30Var) {
            this.f72510a = d30Var;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            th.printStackTrace();
            CoreModule.f17545c.f19555C0.m210112u4();
            if (NullChecker.m81303a(this.f72510a)) {
                this.f72510a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.b1c$c */
    public class RunnableC15773c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m99812a(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m99814c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m99815d() {
        String str = CoreModule.f17545c.f19677q2.f114446a0.get();
        if (TextUtils.equals(str, "normal")) {
            return "normal";
        }
        if (TextUtils.equals(str, "pending")) {
            return "pending";
        }
        if (TextUtils.equals(str, AIMessageFeedback.good)) {
            return AIMessageFeedback.good;
        }
        CoreModule.f17545c.f19677q2.m137710p3();
        return "unknown_";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m99816e() {
        return TextUtils.equals(m99815d(), "normal");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m99817f() {
        return TextUtils.equals(m99815d(), AIMessageFeedback.good);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m99818g() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        String userInfoForMarryStatus = userM169520na.getUserInfoForMarryStatus();
        return TextUtils.equals(m99815d(), "pending") || (userM169520na.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus));
    }

    /* JADX INFO: renamed from: h */
    public static MKWebViewFrag m99819h(Context context, String str) {
        if (!m99817f()) {
            CoreModule.f17545c.f19677q2.m137710p3();
        }
        StringBuilder sb = new StringBuilder((mu5.f135733a.get().contains("staging") ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/selected-users/index.html?speed=true&_bid=1004673&hideNavigationBar=1&hideNotch=1"));
        sb.append("&topHeight=");
        sb.append(((xdl0.m208331F0() * 1.0f) / t100.m186889c().density) + 44.0f);
        sb.append("&goodUser=");
        sb.append(m99817f());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&from=");
            sb.append(str);
        }
        sb.append("#/expPage1");
        CoreModule.m29934N().mo60363jk();
        HomeFeaturedTabFrag homeFeaturedTabFrag = new HomeFeaturedTabFrag();
        Bundle bundle = new Bundle();
        bundle.putString("url", sb.toString());
        homeFeaturedTabFrag.setArguments(bundle);
        return homeFeaturedTabFrag;
    }

    /* JADX INFO: renamed from: i */
    public static Intent m99820i(Context context, String str) {
        if (!m99817f()) {
            CoreModule.f17545c.f19677q2.m137710p3();
        }
        StringBuilder sb = new StringBuilder((mu5.f135733a.get().contains("staging") ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/selected-users/index.html?speed=true&_bid=1004673&hideNavigationBar=1&hideNotch=1&transparent_status_bar=1"));
        sb.append("&goodUser=");
        sb.append(m99817f());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&from=");
            sb.append(str);
        }
        sb.append("#/expPage2");
        CoreModule.m29934N().mo60363jk();
        return MkWebViewAct.m80240e2(context, "", sb.toString(), true, true, true, true, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m99821j(final Act act, final User user, final boolean z, final boolean z2, final String str, final e30<Relationship> e30Var, final d30 d30Var) {
        if (!z) {
            m99823l(act, user, z, z2, str, e30Var, d30Var);
        } else if (m99822k(act, z2, new d30() { // from class: l.z0c
            @Override // p149l.d30
            public final void call() {
                b1c.m99823l(act, user, z, z2, str, e30Var, d30Var);
            }
        })) {
            m99823l(act, user, z, z2, str, e30Var, d30Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m99822k(Act act, boolean z, final d30 d30Var) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (counterM31484o3 == null) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            return false;
        }
        if (userM169527p9.isNameFake()) {
            ura.m195053e().m195057d().mo33651A(act);
            return false;
        }
        if (!xma.m210044G3() && sja.m184461r3() <= 0) {
            m99825n(act);
            return false;
        }
        if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8764c.m53504x0(act, "p_picks_view,e_picks_card,click_like", Privilege.vip_unlimited_likes);
            return false;
        }
        if (!z || ura.m195053e().m195057d().mo33916rs() > 0) {
            return (z && CoreModule.m29935P().m94658i().mo158315U5(act, new d30() { // from class: l.a1c
                @Override // p149l.d30
                public final void call() {
                    b1c.m99812a(d30Var);
                }
            })) ? false : true;
        }
        if (xma.m210071e4()) {
            if (!xma.m210044G3() && sja.m184461r3() <= 0) {
                m99825n(act);
            } else if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
                C8764c.m53391F1(act, "p_picks_view,e_picks_card,click_like");
            } else {
                C8764c.m53504x0(act, "p_picks_view,e_picks_card,click_like", Privilege.vip_super_like);
            }
        } else if (xma.m210044G3() || sja.m184461r3() > 0) {
            C8764c.m53391F1(act, w2b0.m201089c("p_navigation_ilike,card_button_pull", 1));
        } else {
            m99825n(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m99823l(Act act, User user, boolean z, boolean z2, String str, e30<Relationship> e30Var, d30 d30Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.PICKS.getFrom()).isLike(z).isSuperLiked(z2).user(user.f56011id).pageId(str).build();
        if (ura.m195053e().m195057d().mo33716Lc() && m99818g() && sja.m184461r3() > 0 && sja.m184445B3() - sja.m184461r3() == 0) {
            likeExtraDataNew_.state = RelationshipStatus.get(RelationshipStatus.pendingLiked);
        }
        likeExtraDataNew_.isSelectedUser = true;
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, null, user, likeExtraDataNew_, LikeFrom.get("picks"))).subscribe(mkd0.m154956H(new C15771a(z2, act, e30Var), new C15772b(d30Var)));
    }

    /* JADX INFO: renamed from: m */
    public static void m99824m(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        CoreModule.f17545c.f19677q2.m137717x3(jSONArray, str2);
    }

    /* JADX INFO: renamed from: n */
    public static void m99825n(Act act) {
        CoreModule.f17554l.m94651a().mo33366Mc(act, "p_picks_view,e_picks_card,click_like");
        e51.m114743H(act, new RunnableC15773c(), 1000L);
    }
}
