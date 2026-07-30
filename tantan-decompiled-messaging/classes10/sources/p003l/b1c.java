package p003l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.AIMessageFeedback;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.StickStatus;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.messages.HomeFeaturedTabFrag;
import com.p1.mobile.putong.core.ui.MKWebViewFrag;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.d30;
import l.e30;
import l.e51;
import l.mkd0;
import l.mu5;
import l.sja;
import l.t100;
import l.ura;
import l.vwb;
import l.w2b0;
import l.xdl0;
import l.xma;
import org.json.JSONArray;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b1c {

    /* JADX INFO: renamed from: l.b1c$a */
    public class C3297a implements e30<Relationship> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f2914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f2915b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f2916c;

        public C3297a(boolean z, Act act, e30 e30Var) {
            this.f2914a = z;
            this.f2915b = act;
            this.f2916c = e30Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Relationship relationship) {
            CoreModule.c.C0.u4();
            if (TEnum.equals(relationship.state, "matched")) {
                int i = 0;
                if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
                    i = 13;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
                    i = this.f2914a ? 12 : 11;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                    i = 1;
                }
                Act act = this.f2915b;
                act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
            }
            if (NullChecker.a(this.f2916c)) {
                this.f2916c.call(relationship);
            }
        }
    }

    /* JADX INFO: renamed from: l.b1c$b */
    public class C3298b implements e30<Throwable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f2917a;

        public C3298b(d30 d30Var) {
            this.f2917a = d30Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            th.printStackTrace();
            CoreModule.c.C0.u4();
            if (NullChecker.a(this.f2917a)) {
                this.f2917a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.b1c$c */
    public class RunnableC3299c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.C0.u4();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5659a(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m5661c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m5662d() {
        String str = (String) CoreModule.c.q2.a0.get();
        if (TextUtils.equals(str, StickStatus.normal)) {
            return StickStatus.normal;
        }
        if (TextUtils.equals(str, "pending")) {
            return "pending";
        }
        if (TextUtils.equals(str, AIMessageFeedback.good)) {
            return AIMessageFeedback.good;
        }
        CoreModule.c.q2.p3();
        return "unknown_";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m5663e() {
        return TextUtils.equals(m5662d(), StickStatus.normal);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5664f() {
        return TextUtils.equals(m5662d(), AIMessageFeedback.good);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5665g() {
        User userNa = CoreModule.c.e0.na();
        String userInfoForMarryStatus = userNa.getUserInfoForMarryStatus();
        return TextUtils.equals(m5662d(), "pending") || (userNa.isAudit() || TextUtils.equals("audit_ignore", userInfoForMarryStatus) || TextUtils.equals("auditing_ignore", userInfoForMarryStatus));
    }

    /* JADX INFO: renamed from: h */
    public static MKWebViewFrag m5666h(Context context, String str) {
        if (!m5664f()) {
            CoreModule.c.q2.p3();
        }
        StringBuilder sb = new StringBuilder((((String) mu5.a.get()).contains("staging") ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/selected-users/index.html?speed=true&_bid=1004673&hideNavigationBar=1&hideNotch=1"));
        sb.append("&topHeight=");
        sb.append(((xdl0.F0() * 1.0f) / t100.c().density) + 44.0f);
        sb.append("&goodUser=");
        sb.append(m5664f());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&from=");
            sb.append(str);
        }
        sb.append("#/expPage1");
        CoreModule.N().jk();
        HomeFeaturedTabFrag homeFeaturedTabFrag = new HomeFeaturedTabFrag();
        Bundle bundle = new Bundle();
        bundle.putString("url", sb.toString());
        homeFeaturedTabFrag.setArguments(bundle);
        return homeFeaturedTabFrag;
    }

    /* JADX INFO: renamed from: i */
    public static Intent m5667i(Context context, String str) {
        if (!m5664f()) {
            CoreModule.c.q2.p3();
        }
        StringBuilder sb = new StringBuilder((((String) mu5.a.get()).contains("staging") ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/selected-users/index.html?speed=true&_bid=1004673&hideNavigationBar=1&hideNotch=1&transparent_status_bar=1"));
        sb.append("&goodUser=");
        sb.append(m5664f());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&from=");
            sb.append(str);
        }
        sb.append("#/expPage2");
        CoreModule.N().jk();
        return MkWebViewAct.e2(context, "", sb.toString(), true, true, true, true, (ResultReceiver) null);
    }

    /* JADX INFO: renamed from: j */
    public static void m5668j(final Act act, final User user, final boolean z, final boolean z2, final String str, final e30<Relationship> e30Var, final d30 d30Var) {
        if (!z) {
            m5670l(act, user, z, z2, str, e30Var, d30Var);
        } else if (m5669k(act, z2, new d30() { // from class: l.z0c
            public final void call() {
                b1c.m5670l(act, user, z, z2, str, e30Var, d30Var);
            }
        })) {
            m5670l(act, user, z, z2, str, e30Var, d30Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m5669k(Act act, boolean z, final d30 d30Var) {
        Counter counterO3 = CoreModule.c.o3();
        User userP9 = CoreModule.c.e0.p9();
        if (counterO3 == null) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            return false;
        }
        if (userP9.isNameFake()) {
            ura.e().d().A(act);
            return false;
        }
        if (!xma.G3() && sja.r3() <= 0) {
            m5672n(act);
            return false;
        }
        if (counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8138c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            c.x0(act, "p_picks_view,e_picks_card,click_like", Privilege.vip_unlimited_likes);
            return false;
        }
        if (!z || ura.e().d().rs() > 0) {
            return (z && CoreModule.P().i().U5(act, new d30() { // from class: l.a1c
                public final void call() {
                    b1c.m5659a(d30Var);
                }
            })) ? false : true;
        }
        if (xma.e4()) {
            if (!xma.G3() && sja.r3() <= 0) {
                m5672n(act);
            } else if (mb90.m8138c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
                c.F1(act, "p_picks_view,e_picks_card,click_like");
            } else {
                c.x0(act, "p_picks_view,e_picks_card,click_like", Privilege.vip_super_like);
            }
        } else if (xma.G3() || sja.r3() > 0) {
            c.F1(act, w2b0.c("p_navigation_ilike,card_button_pull", 1));
        } else {
            m5672n(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static void m5670l(Act act, User user, boolean z, boolean z2, String str, e30<Relationship> e30Var, d30 d30Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.PICKS.getFrom()).isLike(z).isSuperLiked(z2).user(((DbObject) user).id).pageId(str).build();
        if (ura.e().d().Lc() && m5665g() && sja.r3() > 0 && sja.B3() - sja.r3() == 0) {
            likeExtraDataNew_.state = RelationshipStatus.get("pendingLiked");
        }
        likeExtraDataNew_.isSelectedUser = true;
        act.duringCreated(CoreModule.c.m0.U7(z, z2, (Map) null, user, likeExtraDataNew_, LikeFrom.get("picks"))).subscribe(mkd0.H(new C3297a(z2, act, e30Var), new C3298b(d30Var)));
    }

    /* JADX INFO: renamed from: m */
    public static void m5671m(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        CoreModule.c.q2.x3(jSONArray, str2);
    }

    /* JADX INFO: renamed from: n */
    public static void m5672n(Act act) {
        CoreModule.l.a().Mc(act, "p_picks_view,e_picks_card,click_like");
        e51.H(act, new RunnableC3299c(), 1000L);
    }
}
