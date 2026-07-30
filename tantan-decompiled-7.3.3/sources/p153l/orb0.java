package p153l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class orb0 {
    /* JADX INFO: renamed from: A */
    public static void m168872A(Act act, boolean z) {
        FeedModule.m61406H().setMomentTabDot(act, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m168873B(Act act, int i) {
        FeedModule.m61406H().setMomentTabNum(act, i);
    }

    /* JADX INFO: renamed from: C */
    public static void m168874C(Act act, ViewGroup viewGroup, Banners banners) {
        FeedModule.m61406H().showBanner(act, viewGroup, banners);
    }

    /* JADX INFO: renamed from: D */
    public static void m168875D(Act act, String str, y20<String> y20Var, x20 x20Var, x20 x20Var2, String str2) {
        FeedModule.m61406H().confirmThenUnmatch(act, str, y20Var, x20Var, x20Var2, str2);
    }

    /* JADX INFO: renamed from: E */
    public static void m168876E(Act act, x20 x20Var, String str) {
        FeedModule.m61406H().showSeeDialog(act, x20Var, str);
    }

    /* JADX INFO: renamed from: F */
    public static void m168877F(Act act, boolean z) {
        FeedModule.m61407M().mo68400F8(act, z, true, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m168878G(Context context, Live live, String str, String str2) {
        FeedModule.m61407M().startAudienceLive(context, new IntentParams.C13217a().m79958c(live).m79964i(str).m79957b(str2).m79956a());
    }

    /* JADX INFO: renamed from: H */
    public static void m168879H(Context context, String str, String str2, @Nullable String str3) {
        FeedModule.m61407M().startAudienceLive(context, str, str2, str3);
    }

    /* JADX INFO: renamed from: I */
    public static void m168880I() {
        FeedModule.m61406H().startJailedDialogLikeAct();
    }

    /* JADX INFO: renamed from: J */
    public static void m168881J(Context context, Intent intent) {
        FeedModule.m61405F().startSignInAct(context, intent);
    }

    /* JADX INFO: renamed from: K */
    public static void m168882K(Banners banners) {
        FeedModule.m61406H().trackBannerMV(banners);
    }

    /* JADX INFO: renamed from: L */
    public static void m168883L(DbLinks dbLinks) {
        FeedModule.f39708i.f160260f.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m168884a(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2) {
        return FeedModule.m61406H().mo31779ii(context, str, z, resultReceiver, str2);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m168885b(Context context, String str) {
        return FeedModule.m61406H().startLikersAct(context, str);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m168886c(Context context, String str, boolean z, boolean z2) {
        return m168888e(context, str, z, z2, false, false, null, -1);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m168887d(Context context, String str, boolean z, boolean z2, int i) {
        return m168888e(context, str, z, z2, false, false, null, i);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m168888e(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return FeedModule.m61406H().startMessagesAct(context, str, z, z2, z3, z4, intent, i);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m168889f(Context context, String str) {
        return MkWebViewAct.m81421d2(context, "", str, true, true, null);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m168890g(Context context, NavigationIntent navigationIntent) {
        return FeedModule.m61406H().toNewMainAct(context, navigationIntent);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m168891h(Context context, String str, String str2, boolean z) {
        return m168892i(context, str, str2, z, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m168892i(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        return FeedModule.m61406H().mo31796ma(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, false, z6);
    }

    /* JADX INFO: renamed from: j */
    public static Intent m168893j(Context context, String str, String str2) {
        return FeedModule.m61406H().userStoryAct(context, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m168894k(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        toh0.m192046f(pushMessage, pendingIntent, intent, action, action2);
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<Banners> m168895l(BannerLoc bannerLoc) {
        return FeedModule.m61406H().getBannersObs(bannerLoc);
    }

    /* JADX INFO: renamed from: m */
    public static String m168896m(Live live, String str) {
        return m168897n(live.source, str);
    }

    /* JADX INFO: renamed from: n */
    public static String m168897n(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if ("from_nearby_focus".equals(str2)) {
            return "moment-follow";
        }
        return "from_nearby_falls_feed".equals(str2) ? "moment-nearby" : "moment-personal";
    }

    /* JADX INFO: renamed from: o */
    public static Intent m168898o(Context context, PushMessage pushMessage) {
        return FeedModule.m61406H().toMessagesActFromPush(context, pushMessage.content.f39652id, pushMessage.intent);
    }

    /* JADX INFO: renamed from: p */
    public static C22421c<Boolean> m168899p() {
        return FeedModule.m61406H().getNewMainMomentTabSelectBs();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m168900q(Act act) {
        return FeedModule.m61406H().isCurrentTabMomentFrag(act);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m168901r(Moment moment) {
        if (moment.isLive) {
            return FeedModule.m61407M().liveShowMomentLikesAndComments() && !moment.live.anchor.f39651id.equals(FeedModule.m61405F().userId());
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m168902s() {
        return FeedModule.m61407M().isLiving();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m168903t(Activity activity) {
        return FeedModule.m61406H().isNewMainActContext(activity);
    }

    /* JADX INFO: renamed from: u */
    public static void m168904u(Act act, MomentMessage momentMessage) {
        FeedModule.m61406H().resendDialog(act, momentMessage);
    }

    /* JADX INFO: renamed from: v */
    public static Intent m168905v(Context context, boolean z) {
        return FeedModule.m61406H().newMainActClearStack(context, z);
    }

    /* JADX INFO: renamed from: w */
    public static pf60<Integer, Integer> m168906w(int i) {
        return FeedModule.m61406H().onlineMatchCaculaterBlur(i);
    }

    /* JADX INFO: renamed from: x */
    public static Intent m168907x(Context context, String str, String str2) {
        return FeedModule.m61406H().toNewMainActFromPush(context, str, str2);
    }

    /* JADX INFO: renamed from: y */
    public static void m168908y(Act act, User user, ImageView imageView, boolean z, boolean z2) {
        FeedModule.m61406H().renderVipBadge(act, user, imageView, z, z2);
    }

    /* JADX INFO: renamed from: z */
    public static void m168909z(Act act, boolean z) {
        FeedModule.m61406H().setIfShowTabBarInNewUI(act, z);
    }
}
