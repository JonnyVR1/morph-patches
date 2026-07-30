package p149l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class l9s {
    /* JADX INFO: renamed from: A */
    public static boolean m149038A(Act act) {
        return m149076g().mo30833w8(act);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m149039B(Act act) {
        return m149076g().isMainPage(act);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m149040C(Activity activity) {
        return m149076g().mo30739Z3(activity);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m149041D(Activity activity) {
        return m149080i().isMomentDetailAct(activity);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m149042E(Activity activity) {
        return m149080i().mo60392u0(activity);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m149043F() {
        return m149076g().isPurchaseDialogShowing();
    }

    /* JADX INFO: renamed from: G */
    public static LiveService m149044G() {
        return qib0.f154713b0.f139232c;
    }

    /* JADX INFO: renamed from: H */
    public static C22306c<List<BLiveMerchandise>> m149045H(Act act, List<BLiveMerchandise> list) {
        return m149076g().localiseMerchandises(act, list, BLiveMerchandise.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: I */
    public static C22306c<User> m149046I() {
        return m149076g().mo30795me();
    }

    /* JADX INFO: renamed from: J */
    public static User m149047J() {
        return m149076g().me_();
    }

    /* JADX INFO: renamed from: K */
    public static void m149048K(final BLiveEnvelope bLiveEnvelope) {
        vwb.m200354z(bLiveEnvelope.data.users, new e30() { // from class: l.i9s
            @Override // p149l.e30
            public final void call(Object obj) {
                l9s.m149064a((User) obj);
            }
        });
        f8c.m119878o().m119881B(new d30() { // from class: l.j9s
            @Override // p149l.d30
            public final void call() {
                l9s.m149066b(bLiveEnvelope);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static boolean m149049L(Activity activity) {
        return m149080i().isLiveNeedDisableAudio(activity) || m149076g().isLiveNeedDisableAudio(activity);
    }

    /* JADX INFO: renamed from: M */
    public static void m149050M(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod) {
        qib0.f154713b0.f139231b.onCoinPay(act, purchasePaymentParam, d30Var, d30Var2, payMethod);
    }

    /* JADX INFO: renamed from: N */
    public static C22306c<SettingGroups> m149051N(UserLiveSettings userLiveSettings) {
        return m149076g().patchLiveSettings(userLiveSettings);
    }

    /* JADX INFO: renamed from: O */
    public static C22306c<roj0> m149052O(SettingGroups settingGroups) {
        return m149076g().patchSettings(settingGroups);
    }

    /* JADX INFO: renamed from: P */
    public static void m149053P() {
        m149076g().pollConversation();
    }

    /* JADX INFO: renamed from: Q */
    public static C22306c<List<BLiveMerchandise>> m149054Q(String str, boolean z) {
        return m149076g().merchandises(str, z, BLiveMerchandise.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: R */
    public static C22306c<roj0> m149055R(String str) {
        return m149076g().refreshUser(str);
    }

    /* JADX INFO: renamed from: S */
    public static void m149056S(e1m e1mVar) {
        m149076g().registerPurchaseDialogListener(e1mVar);
    }

    /* JADX INFO: renamed from: T */
    public static void m149057T(Act act, Uri uri) {
        j2e0.m139446m(act, uri);
    }

    /* JADX INFO: renamed from: U */
    public static void m149058U(boolean z) {
        m149076g().mo30740Zb(TabName.Live, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m149059V(Context context, Intent intent) {
        m149076g().setNewMainActClass(context, intent);
    }

    /* JADX INFO: renamed from: W */
    public static void m149060W(Context context) {
        m149076g().mo30688Fo(context);
    }

    /* JADX INFO: renamed from: X */
    public static void m149061X(Act act, TabName tabName, boolean z) {
        m149076g().setTabDot(act, tabName, z);
    }

    /* JADX INFO: renamed from: Y */
    public static void m149062Y(Act act, TabName tabName, int i) {
        m149076g().setTabNum(act, tabName, i);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m149063Z() {
        return qib0.f154713b0.f139231b.shouldShowAutoPay();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m149064a(User user) {
        User userQuery;
        if (user.localRelationship != null || (userQuery = qib0.f154722k0.f176631d.query(user.f56011id)) == null) {
            return;
        }
        user.localRelationship = userQuery.localRelationship;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m149065a0() {
        return qib0.f154713b0.f139231b.mo30719Q2();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m149066b(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.users)) {
            return;
        }
        Iterator<User> it = bLiveEnvelope.data.users.iterator();
        while (it.hasNext()) {
            qib0.f154722k0.f176631d.upsert(it.next());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m149067b0(Act act) {
        qib0.f154713b0.f139231b.showAutoPayHelp(act);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveVerificationCenter m149068c(String str) {
        try {
            return BLiveVerificationCenter.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m149069c0(Act act, d30 d30Var) {
        m149076g().showBindPhoneDialog(act, d30Var);
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<AuthData> m149070d() {
        return m149072e().accessOutterToken();
    }

    /* JADX INFO: renamed from: d0 */
    public static C22306c<Boolean> m149071d0(Act act, @Nullable String str) {
        return m149076g().mo30771i5(act, str);
    }

    /* JADX INFO: renamed from: e */
    public static AccountService m149072e() {
        return qib0.f154713b0.f139230a;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m149073e0(Act act, String str, d30 d30Var) {
        qib0.f154713b0.f139231b.mo30811q9(act, str, d30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m149074f(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        mgh0.m154550f(pushMessage, pendingIntent, intent, action, action2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m149075f0(Context context, User user, VImage vImage) {
        m149076g().showUserVerificationLogo(context, user, vImage);
    }

    /* JADX INFO: renamed from: g */
    public static CoreService m149076g() {
        return qib0.f154713b0.f139231b;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m149077g0(Act act, String str) {
        qib0.f154713b0.f139231b.showVipPurchaseDialog(act, str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m149078h() {
        return m149076g().mo30692I4();
    }

    /* JADX INFO: renamed from: h0 */
    public static C22306c<Boolean> m149079h0() {
        return m149072e().signedIn();
    }

    /* JADX INFO: renamed from: i */
    public static FeedService m149080i() {
        return qib0.f154713b0.f139233d;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m149081i0() {
        return m149072e().signedIn_();
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<Followship> m149082j(String str, User user, boolean z, String str2, String str3) {
        return m149080i().following(str, user, z, str2, str3).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j0 */
    public static Intent m149083j0(Context context, String str, boolean z, boolean z2) {
        return m149076g().startMessagesAct(context, str, z, z2);
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<Followship> m149084k(String str, User user, boolean z, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_id", str4);
            jSONObject.put("liveFollowFrom", str5);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return m149080i().followingWithExtra(str, user, z, str2, str3, "pagesource=" + jSONObject.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public static void m149085k0(Context context, String str, String str2, boolean z) {
        m149087l0(context, str, str2, z, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m149086l(Act act, BLiveMerchandise bLiveMerchandise, d30 d30Var, d30 d30Var2) {
        m149076g().doGPPayment(act, bLiveMerchandise.toJson(), d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m149087l0(Context context, String str, String str2, boolean z, String str3) {
        Intent intentMo30718Ps = m149076g().mo30718Ps(context, str, str2, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, lor.m150803h(), z, str3);
        m149044G().mo67290vf(intentMo30718Ps);
        context.startActivity(intentMo30718Ps);
        if (context instanceof Act) {
            ((Act) context).overridePendingTransition(vzb0.f183609c, 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static op8 m149088m() {
        return m149076g().mo30742a();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m149089m0(Act act, String str, boolean z) {
        act.startActivity(m149076g().mo30673Ar(act, str, z ? "quick_video_chat_page" : "simple_quick_video_chat_page", true));
    }

    /* JADX INFO: renamed from: n */
    public static String m149090n() {
        return m149076g().getCurrencyProductCategory();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m149091n0(e1m e1mVar) {
        m149076g().unregisterPurchaseDialogListener(e1mVar);
    }

    /* JADX INFO: renamed from: o */
    public static Intent m149092o(Context context, IntentParams intentParams) {
        return qib0.f154713b0.f139231b.mo30844zp(context, intentParams);
    }

    /* JADX INFO: renamed from: o0 */
    public static String m149093o0() {
        return m149072e().userId();
    }

    /* JADX INFO: renamed from: p */
    public static Intent m149094p(Context context) {
        return qib0.f154713b0.f139231b.mo30832w7(context);
    }

    /* JADX INFO: renamed from: p0 */
    public static C22306c<User> m149095p0(String str) {
        return m149076g().userObsById(str);
    }

    /* JADX INFO: renamed from: q */
    public static String m149096q() {
        return m149080i().getMoMoVerificationAppId();
    }

    /* JADX INFO: renamed from: q0 */
    public static User m149097q0(String str) {
        return qib0.f154713b0.f139231b.getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: r */
    public static Intent m149098r(Context context, NavigationIntent navigationIntent) {
        return m149076g().toNewMainAct(context, navigationIntent);
    }

    /* JADX INFO: renamed from: s */
    public static Intent m149099s(Context context, NavigationIntent navigationIntent) {
        return m149076g().getMainWithNav(context, navigationIntent);
    }

    /* JADX INFO: renamed from: t */
    public static C22306c<BLiveVerificationCenter> m149100t() {
        return m149076g().mo30781k2().take(1).map(new w9j() { // from class: l.k9s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l9s.m149068c((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C22306c<Bundle> m149101u(TabName tabName) {
        return m149076g().getNewMainBundleBs(tabName);
    }

    /* JADX INFO: renamed from: v */
    public static C22306c<Boolean> m149102v() {
        return m149076g().getNewMainLiveTabSelectBs();
    }

    /* JADX INFO: renamed from: w */
    public static SettingGroups m149103w() {
        return m149076g().notificationSettings().get();
    }

    /* JADX INFO: renamed from: x */
    public static C22306c<SettingGroups> m149104x() {
        return m149076g().getUserSettings();
    }

    /* JADX INFO: renamed from: y */
    public static C22306c<Boolean> m149105y() {
        return m149076g().mo30715P3();
    }

    /* JADX INFO: renamed from: z */
    public static C22306c<Boolean> m149106z() {
        return m149076g().mo30732W2();
    }
}
