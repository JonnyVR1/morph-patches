package p007l;

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
import com.p000p1.mobile.putong.data.BannerLoc;
import com.p000p1.mobile.putong.data.Banners;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.PushMessage;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.d30;
import l.e30;
import l.j760;
import l.mgh0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kjb0 {
    /* JADX INFO: renamed from: A */
    public static void m11437A(Act act, boolean z) {
        FeedModule.m1140H().setMomentTabDot(act, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m11438B(Act act, int i) {
        FeedModule.m1140H().setMomentTabNum(act, i);
    }

    /* JADX INFO: renamed from: C */
    public static void m11439C(Act act, ViewGroup viewGroup, Banners banners) {
        FeedModule.m1140H().showBanner(act, viewGroup, banners);
    }

    /* JADX INFO: renamed from: D */
    public static void m11440D(Act act, String str, e30<String> e30Var, d30 d30Var, d30 d30Var2, String str2) {
        FeedModule.m1140H().confirmThenUnmatch(act, str, e30Var, d30Var, d30Var2, str2);
    }

    /* JADX INFO: renamed from: E */
    public static void m11441E(Act act, d30 d30Var, String str) {
        FeedModule.m1140H().showSeeDialog(act, d30Var, str);
    }

    /* JADX INFO: renamed from: F */
    public static void m11442F(Act act, boolean z) {
        FeedModule.m1141M().F8(act, z, true, (String) null);
    }

    /* JADX INFO: renamed from: G */
    public static void m11443G(Context context, Live live, String str, String str2) {
        FeedModule.m1141M().startAudienceLive(context, new IntentParams.a().c(live).i(str).b(str2).a());
    }

    /* JADX INFO: renamed from: H */
    public static void m11444H(Context context, String str, String str2, @Nullable String str3) {
        FeedModule.m1141M().startAudienceLive(context, str, str2, str3);
    }

    /* JADX INFO: renamed from: I */
    public static void m11445I() {
        FeedModule.m1140H().startJailedDialogLikeAct();
    }

    /* JADX INFO: renamed from: J */
    public static void m11446J(Context context, Intent intent) {
        FeedModule.m1139F().startSignInAct(context, intent);
    }

    /* JADX INFO: renamed from: K */
    public static void m11447K(Banners banners) {
        FeedModule.m1140H().trackBannerMV(banners);
    }

    /* JADX INFO: renamed from: L */
    public static void m11448L(DbLinks dbLinks) {
        FeedModule.f321i.f6467f.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m11449a(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2) {
        return FeedModule.m1140H().ii(context, str, z, resultReceiver, str2);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m11450b(Context context, String str) {
        return FeedModule.m1140H().startLikersAct(context, str);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m11451c(Context context, String str, boolean z, boolean z2) {
        return m11453e(context, str, z, z2, false, false, null, -1);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m11452d(Context context, String str, boolean z, boolean z2, int i) {
        return m11453e(context, str, z, z2, false, false, null, i);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m11453e(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return FeedModule.m1140H().startMessagesAct(context, str, z, z2, z3, z4, intent, i);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m11454f(Context context, String str) {
        return MkWebViewAct.c2(context, "", str, true, true, (ResultReceiver) null);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m11455g(Context context, NavigationIntent navigationIntent) {
        return FeedModule.m1140H().toNewMainAct(context, navigationIntent);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m11456h(Context context, String str, String str2, boolean z) {
        return m11457i(context, str, str2, z, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m11457i(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        return FeedModule.m1140H().ma(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, false, z6);
    }

    /* JADX INFO: renamed from: j */
    public static Intent m11458j(Context context, String str, String str2) {
        return FeedModule.m1140H().userStoryAct(context, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m11459k(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        mgh0.f(pushMessage, pendingIntent, intent, action, action2);
    }

    /* JADX INFO: renamed from: l */
    public static c<Banners> m11460l(BannerLoc bannerLoc) {
        return FeedModule.m1140H().getBannersObs(bannerLoc);
    }

    /* JADX INFO: renamed from: m */
    public static String m11461m(Live live, String str) {
        return m11462n(live.source, str);
    }

    /* JADX INFO: renamed from: n */
    public static String m11462n(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if ("from_nearby_focus".equals(str2)) {
            return "moment-follow";
        }
        return "from_nearby_falls_feed".equals(str2) ? "moment-nearby" : "moment-personal";
    }

    /* JADX INFO: renamed from: o */
    public static Intent m11463o(Context context, PushMessage pushMessage) {
        return FeedModule.m1140H().toMessagesActFromPush(context, pushMessage.content.f265id, pushMessage.intent);
    }

    /* JADX INFO: renamed from: p */
    public static c<Boolean> m11464p() {
        return FeedModule.m1140H().getNewMainMomentTabSelectBs();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11465q(Act act) {
        return FeedModule.m1140H().isCurrentTabMomentFrag(act);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m11466r(Moment moment) {
        if (moment.isLive) {
            return FeedModule.m1141M().liveShowMomentLikesAndComments() && !moment.live.anchor.f264id.equals(FeedModule.m1139F().userId());
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m11467s() {
        return FeedModule.m1141M().isLiving();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m11468t(Activity activity) {
        return FeedModule.m1140H().isNewMainActContext(activity);
    }

    /* JADX INFO: renamed from: u */
    public static void m11469u(Act act, MomentMessage momentMessage) {
        FeedModule.m1140H().resendDialog(act, momentMessage);
    }

    /* JADX INFO: renamed from: v */
    public static Intent m11470v(Context context, boolean z) {
        return FeedModule.m1140H().newMainActClearStack(context, z);
    }

    /* JADX INFO: renamed from: w */
    public static j760<Integer, Integer> m11471w(int i) {
        return FeedModule.m1140H().onlineMatchCaculaterBlur(i);
    }

    /* JADX INFO: renamed from: x */
    public static Intent m11472x(Context context, String str, String str2) {
        return FeedModule.m1140H().toNewMainActFromPush(context, str, str2);
    }

    /* JADX INFO: renamed from: y */
    public static void m11473y(Act act, User user, ImageView imageView, boolean z, boolean z2) {
        FeedModule.m1140H().renderVipBadge(act, user, imageView, z, z2);
    }

    /* JADX INFO: renamed from: z */
    public static void m11474z(Act act, boolean z) {
        FeedModule.m1140H().setIfShowTabBarInNewUI(act, z);
    }
}
