package p153l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class mbs {
    /* JADX INFO: renamed from: A */
    public static boolean m157815A(Act act) {
        return m157853g().mo31836w8(act);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m157816B(Act act) {
        return m157853g().isMainPage(act);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m157817C(Activity activity) {
        return m157853g().mo31742Z3(activity);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m157818D(Activity activity) {
        return m157857i().isMomentDetailAct(activity);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m157819E(Activity activity) {
        return m157857i().mo61576u0(activity);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m157820F() {
        return m157853g().isPurchaseDialogShowing();
    }

    /* JADX INFO: renamed from: G */
    public static LiveService m157821G() {
        return uqb0.f180396b0.f170326c;
    }

    /* JADX INFO: renamed from: H */
    public static C22421c<List<BLiveMerchandise>> m157822H(Act act, List<BLiveMerchandise> list) {
        return m157853g().localiseMerchandises(act, list, BLiveMerchandise.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: I */
    public static C22421c<User> m157823I() {
        return m157853g().mo31798me();
    }

    /* JADX INFO: renamed from: J */
    public static User m157824J() {
        return m157853g().me_();
    }

    /* JADX INFO: renamed from: K */
    public static void m157825K(final BLiveEnvelope bLiveEnvelope) {
        jyb.m147537z(bLiveEnvelope.data.users, new y20() { // from class: l.jbs
            @Override // p153l.y20
            public final void call(Object obj) {
                mbs.m157841a((User) obj);
            }
        });
        l9c.m153394o().m153397B(new x20() { // from class: l.kbs
            @Override // p153l.x20
            public final void call() {
                mbs.m157843b(bLiveEnvelope);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static boolean m157826L(Activity activity) {
        return m157857i().isLiveNeedDisableAudio(activity) || m157853g().isLiveNeedDisableAudio(activity);
    }

    /* JADX INFO: renamed from: M */
    public static void m157827M(Act act, PurchasePaymentParam purchasePaymentParam, x20 x20Var, x20 x20Var2, PayMethod payMethod) {
        uqb0.f180396b0.f170325b.onCoinPay(act, purchasePaymentParam, x20Var, x20Var2, payMethod);
    }

    /* JADX INFO: renamed from: N */
    public static C22421c<SettingGroups> m157828N(UserLiveSettings userLiveSettings) {
        return m157853g().patchLiveSettings(userLiveSettings);
    }

    /* JADX INFO: renamed from: O */
    public static C22421c<uxj0> m157829O(SettingGroups settingGroups) {
        return m157853g().patchSettings(settingGroups);
    }

    /* JADX INFO: renamed from: P */
    public static void m157830P() {
        m157853g().pollConversation();
    }

    /* JADX INFO: renamed from: Q */
    public static C22421c<List<BLiveMerchandise>> m157831Q(String str, boolean z) {
        return m157853g().merchandises(str, z, BLiveMerchandise.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: R */
    public static C22421c<uxj0> m157832R(String str) {
        return m157853g().refreshUser(str);
    }

    /* JADX INFO: renamed from: S */
    public static void m157833S(x3m x3mVar) {
        m157853g().registerPurchaseDialogListener(x3mVar);
    }

    /* JADX INFO: renamed from: T */
    public static void m157834T(Act act, Uri uri) {
        nae0.m162083m(act, uri);
    }

    /* JADX INFO: renamed from: U */
    public static void m157835U(boolean z) {
        m157853g().mo31743Zb(TabName.Live, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m157836V(Context context, Intent intent) {
        m157853g().setNewMainActClass(context, intent);
    }

    /* JADX INFO: renamed from: W */
    public static void m157837W(Context context) {
        m157853g().mo31691Fo(context);
    }

    /* JADX INFO: renamed from: X */
    public static void m157838X(Act act, TabName tabName, boolean z) {
        m157853g().setTabDot(act, tabName, z);
    }

    /* JADX INFO: renamed from: Y */
    public static void m157839Y(Act act, TabName tabName, int i) {
        m157853g().setTabNum(act, tabName, i);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m157840Z() {
        return uqb0.f180396b0.f170325b.shouldShowAutoPay();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m157841a(User user) {
        User userQuery;
        if (user.localRelationship != null || (userQuery = uqb0.f180405k0.f184355d.query(user.f56859id)) == null) {
            return;
        }
        user.localRelationship = userQuery.localRelationship;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m157842a0() {
        return uqb0.f180396b0.f170325b.mo31722Q2();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m157843b(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.users)) {
            return;
        }
        Iterator<User> it = bLiveEnvelope.data.users.iterator();
        while (it.hasNext()) {
            uqb0.f180405k0.f184355d.upsert(it.next());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m157844b0(Act act) {
        uqb0.f180396b0.f170325b.showAutoPayHelp(act);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveVerificationCenter m157845c(String str) {
        try {
            return BLiveVerificationCenter.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m157846c0(Act act, x20 x20Var) {
        m157853g().showBindPhoneDialog(act, x20Var);
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<AuthData> m157847d() {
        return m157849e().accessOutterToken();
    }

    /* JADX INFO: renamed from: d0 */
    public static C22421c<Boolean> m157848d0(Act act, @Nullable String str) {
        return m157853g().mo31774i5(act, str);
    }

    /* JADX INFO: renamed from: e */
    public static AccountService m157849e() {
        return uqb0.f180396b0.f170324a;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m157850e0(Act act, String str, x20 x20Var) {
        uqb0.f180396b0.f170325b.mo31814q9(act, str, x20Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m157851f(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        toh0.m192046f(pushMessage, pendingIntent, intent, action, action2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m157852f0(Context context, User user, VImage vImage) {
        m157853g().showUserVerificationLogo(context, user, vImage);
    }

    /* JADX INFO: renamed from: g */
    public static CoreService m157853g() {
        return uqb0.f180396b0.f170325b;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m157854g0(Act act, String str) {
        uqb0.f180396b0.f170325b.showVipPurchaseDialog(act, str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m157855h() {
        return m157853g().mo31695I4();
    }

    /* JADX INFO: renamed from: h0 */
    public static C22421c<Boolean> m157856h0() {
        return m157849e().signedIn();
    }

    /* JADX INFO: renamed from: i */
    public static FeedService m157857i() {
        return uqb0.f180396b0.f170327d;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m157858i0() {
        return m157849e().signedIn_();
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<Followship> m157859j(String str, User user, boolean z, String str2, String str3) {
        return m157857i().following(str, user, z, str2, str3).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j0 */
    public static Intent m157860j0(Context context, String str, boolean z, boolean z2) {
        return m157853g().startMessagesAct(context, str, z, z2);
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<Followship> m157861k(String str, User user, boolean z, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_id", str4);
            jSONObject.put("liveFollowFrom", str5);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return m157857i().followingWithExtra(str, user, z, str2, str3, "pagesource=" + jSONObject.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public static void m157862k0(Context context, String str, String str2, boolean z) {
        m157864l0(context, str, str2, z, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m157863l(Act act, BLiveMerchandise bLiveMerchandise, x20 x20Var, x20 x20Var2) {
        m157853g().doGPPayment(act, bLiveMerchandise.toJson(), x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m157864l0(Context context, String str, String str2, boolean z, String str3) {
        Intent intentMo31721Ps = m157853g().mo31721Ps(context, str, str2, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, mqr.m159588h(), z, str3);
        m157821G().mo68473vf(intentMo31721Ps);
        context.startActivity(intentMo31721Ps);
        if (context instanceof Act) {
            ((Act) context).overridePendingTransition(b8c0.f75418c, 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static tq8 m157865m() {
        return m157853g().mo31745a();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m157866m0(Act act, String str, boolean z) {
        act.startActivity(m157853g().mo31676Ar(act, str, z ? "quick_video_chat_page" : "simple_quick_video_chat_page", true));
    }

    /* JADX INFO: renamed from: n */
    public static String m157867n() {
        return m157853g().getCurrencyProductCategory();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m157868n0(x3m x3mVar) {
        m157853g().unregisterPurchaseDialogListener(x3mVar);
    }

    /* JADX INFO: renamed from: o */
    public static Intent m157869o(Context context, IntentParams intentParams) {
        return uqb0.f180396b0.f170325b.mo31847zp(context, intentParams);
    }

    /* JADX INFO: renamed from: o0 */
    public static String m157870o0() {
        return m157849e().userId();
    }

    /* JADX INFO: renamed from: p */
    public static Intent m157871p(Context context) {
        return uqb0.f180396b0.f170325b.mo31835w7(context);
    }

    /* JADX INFO: renamed from: p0 */
    public static C22421c<User> m157872p0(String str) {
        return m157853g().userObsById(str);
    }

    /* JADX INFO: renamed from: q */
    public static String m157873q() {
        return m157857i().getMoMoVerificationAppId();
    }

    /* JADX INFO: renamed from: q0 */
    public static User m157874q0(String str) {
        return uqb0.f180396b0.f170325b.getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: r */
    public static Intent m157875r(Context context, NavigationIntent navigationIntent) {
        return m157853g().toNewMainAct(context, navigationIntent);
    }

    /* JADX INFO: renamed from: s */
    public static Intent m157876s(Context context, NavigationIntent navigationIntent) {
        return m157853g().getMainWithNav(context, navigationIntent);
    }

    /* JADX INFO: renamed from: t */
    public static C22421c<BLiveVerificationCenter> m157877t() {
        return m157853g().mo31784k2().take(1).map(new qcj() { // from class: l.lbs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mbs.m157845c((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static C22421c<Bundle> m157878u(TabName tabName) {
        return m157853g().getNewMainBundleBs(tabName);
    }

    /* JADX INFO: renamed from: v */
    public static C22421c<Boolean> m157879v() {
        return m157853g().getNewMainLiveTabSelectBs();
    }

    /* JADX INFO: renamed from: w */
    public static SettingGroups m157880w() {
        return m157853g().notificationSettings().get();
    }

    /* JADX INFO: renamed from: x */
    public static C22421c<SettingGroups> m157881x() {
        return m157853g().getUserSettings();
    }

    /* JADX INFO: renamed from: y */
    public static C22421c<Boolean> m157882y() {
        return m157853g().mo31718P3();
    }

    /* JADX INFO: renamed from: z */
    public static C22421c<Boolean> m157883z() {
        return m157853g().mo31735W2();
    }
}
