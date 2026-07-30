package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class kjb0 {
    /* JADX INFO: renamed from: A */
    public static void m146178A(Act act, boolean z) {
        FeedModule.m60222H().setMomentTabDot(act, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m146179B(Act act, int i) {
        FeedModule.m60222H().setMomentTabNum(act, i);
    }

    /* JADX INFO: renamed from: C */
    public static void m146180C(Act act, ViewGroup viewGroup, Banners banners) {
        FeedModule.m60222H().showBanner(act, viewGroup, banners);
    }

    /* JADX INFO: renamed from: D */
    public static void m146181D(Act act, String str, e30<String> e30Var, d30 d30Var, d30 d30Var2, String str2) {
        FeedModule.m60222H().confirmThenUnmatch(act, str, e30Var, d30Var, d30Var2, str2);
    }

    /* JADX INFO: renamed from: E */
    public static void m146182E(Act act, d30 d30Var, String str) {
        FeedModule.m60222H().showSeeDialog(act, d30Var, str);
    }

    /* JADX INFO: renamed from: F */
    public static void m146183F(Act act, boolean z) {
        FeedModule.m60223M().mo67217F8(act, z, true, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m146184G(Context context, Live live, String str, String str2) {
        FeedModule.m60223M().startAudienceLive(context, new IntentParams.C13054a().m78775c(live).m78781i(str).m78774b(str2).m78773a());
    }

    /* JADX INFO: renamed from: H */
    public static void m146185H(Context context, String str, String str2, @Nullable String str3) {
        FeedModule.m60223M().startAudienceLive(context, str, str2, str3);
    }

    /* JADX INFO: renamed from: I */
    public static void m146186I() {
        FeedModule.m60222H().startJailedDialogLikeAct();
    }

    /* JADX INFO: renamed from: J */
    public static void m146187J(Context context, Intent intent) {
        FeedModule.m60221F().startSignInAct(context, intent);
    }

    /* JADX INFO: renamed from: K */
    public static void m146188K(Banners banners) {
        FeedModule.m60222H().trackBannerMV(banners);
    }

    /* JADX INFO: renamed from: L */
    public static void m146189L(DbLinks dbLinks) {
        FeedModule.f38860i.f77916f.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m146190a(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2) {
        return FeedModule.m60222H().mo30776ii(context, str, z, resultReceiver, str2);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m146191b(Context context, String str) {
        return FeedModule.m60222H().startLikersAct(context, str);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m146192c(Context context, String str, boolean z, boolean z2) {
        return m146194e(context, str, z, z2, false, false, null, -1);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m146193d(Context context, String str, boolean z, boolean z2, int i) {
        return m146194e(context, str, z, z2, false, false, null, i);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m146194e(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return FeedModule.m60222H().startMessagesAct(context, str, z, z2, z3, z4, intent, i);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m146195f(Context context, String str) {
        return MkWebViewAct.m80238c2(context, "", str, true, true, null);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m146196g(Context context, NavigationIntent navigationIntent) {
        return FeedModule.m60222H().toNewMainAct(context, navigationIntent);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m146197h(Context context, String str, String str2, boolean z) {
        return m146198i(context, str, str2, z, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m146198i(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        return FeedModule.m60222H().mo30793ma(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, false, z6);
    }

    /* JADX INFO: renamed from: j */
    public static Intent m146199j(Context context, String str, String str2) {
        return FeedModule.m60222H().userStoryAct(context, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m146200k(PushMessage pushMessage, PendingIntent pendingIntent, Intent intent, NotificationCompat.Action action, NotificationCompat.Action action2) {
        mgh0.m154550f(pushMessage, pendingIntent, intent, action, action2);
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<Banners> m146201l(BannerLoc bannerLoc) {
        return FeedModule.m60222H().getBannersObs(bannerLoc);
    }

    /* JADX INFO: renamed from: m */
    public static String m146202m(Live live, String str) {
        return m146203n(live.source, str);
    }

    /* JADX INFO: renamed from: n */
    public static String m146203n(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if ("from_nearby_focus".equals(str2)) {
            return "moment-follow";
        }
        return "from_nearby_falls_feed".equals(str2) ? "moment-nearby" : "moment-personal";
    }

    /* JADX INFO: renamed from: o */
    public static Intent m146204o(Context context, PushMessage pushMessage) {
        return FeedModule.m60222H().toMessagesActFromPush(context, pushMessage.content.f38804id, pushMessage.intent);
    }

    /* JADX INFO: renamed from: p */
    public static C22306c<Boolean> m146205p() {
        return FeedModule.m60222H().getNewMainMomentTabSelectBs();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m146206q(Act act) {
        return FeedModule.m60222H().isCurrentTabMomentFrag(act);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m146207r(Moment moment) {
        if (moment.isLive) {
            return FeedModule.m60223M().liveShowMomentLikesAndComments() && !moment.live.anchor.f38803id.equals(FeedModule.m60221F().userId());
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m146208s() {
        return FeedModule.m60223M().isLiving();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m146209t(Activity activity) {
        return FeedModule.m60222H().isNewMainActContext(activity);
    }

    /* JADX INFO: renamed from: u */
    public static void m146210u(Act act, MomentMessage momentMessage) {
        FeedModule.m60222H().resendDialog(act, momentMessage);
    }

    /* JADX INFO: renamed from: v */
    public static Intent m146211v(Context context, boolean z) {
        return FeedModule.m60222H().newMainActClearStack(context, z);
    }

    /* JADX INFO: renamed from: w */
    public static j760<Integer, Integer> m146212w(int i) {
        return FeedModule.m60222H().onlineMatchCaculaterBlur(i);
    }

    /* JADX INFO: renamed from: x */
    public static Intent m146213x(Context context, String str, String str2) {
        return FeedModule.m60222H().toNewMainActFromPush(context, str, str2);
    }

    /* JADX INFO: renamed from: y */
    public static void m146214y(Act act, User user, ImageView imageView, boolean z, boolean z2) {
        FeedModule.m60222H().renderVipBadge(act, user, imageView, z, z2);
    }

    /* JADX INFO: renamed from: z */
    public static void m146215z(Act act, boolean z) {
        FeedModule.m60222H().setIfShowTabBarInNewUI(act, z);
    }
}
