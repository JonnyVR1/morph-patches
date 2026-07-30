package p153l;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class mrb0 {
    /* JADX INFO: renamed from: A */
    public static C22421c<uxj0> m159623A(Links links, long j, int i) {
        return FeedModule.m61406H().loadLikers(links, j, i);
    }

    /* JADX INFO: renamed from: B */
    public static C22421c<User> m159624B() {
        return FeedModule.m61406H().mo31798me();
    }

    /* JADX INFO: renamed from: C */
    public static User m159625C() {
        return FeedModule.m61406H().me_();
    }

    /* JADX INFO: renamed from: D */
    public static C22421c<MomentMessage> m159626D(String str, MomentMessage momentMessage, boolean z) {
        return FeedModule.m61406H().mo31778ie(MomentMessage.JSON_ADAPTER, str, momentMessage.toJson(), z);
    }

    /* JADX INFO: renamed from: E */
    public static C22421c<List<MomentActivity>> m159627E() {
        return FeedModule.f39708i.f160258d.f126682m.m208677m();
    }

    /* JADX INFO: renamed from: F */
    public static C22421c<vg60<User>> m159628F() {
        return FeedModule.m61406H().momentSeeAbLikers();
    }

    /* JADX INFO: renamed from: G */
    public static C22421c<List<Moment>> m159629G() {
        return FeedModule.f39708i.f160257c.f83267m.m208677m();
    }

    /* JADX INFO: renamed from: H */
    public static C22421c<List<Moment>> m159630H(String str) {
        return FeedModule.f39708i.f160257c.m112017M(str).m208677m();
    }

    /* JADX INFO: renamed from: I */
    public static C22421c<uxj0> m159631I() {
        return FeedModule.m61406H().pollConversation();
    }

    /* JADX INFO: renamed from: J */
    public static C22421c<Envelope> m159632J(String str, MomentMessage momentMessage) {
        return FeedModule.m61406H().raw_messagePost(str, momentMessage.toJson(), momentMessage.momentShowFromType, momentMessage.isCommentFromKanKan);
    }

    /* JADX INFO: renamed from: K */
    public static C22421c<List<Media>> m159633K(List<Media> list, String str, String str2) {
        return yb5.m214981J(list, str, str2);
    }

    /* JADX INFO: renamed from: L */
    public static C22421c<List<Media>> m159634L(List<Media> list, String str, String str2, UploadSource uploadSource) {
        return yb5.m214982K(list, str, str2, uploadSource);
    }

    /* JADX INFO: renamed from: M */
    public static C22421c<uxj0> m159635M(String str) {
        return FeedModule.m61406H().refreshUser(str, false);
    }

    /* JADX INFO: renamed from: N */
    public static C22421c<uxj0> m159636N(String str, boolean z) {
        return FeedModule.m61406H().refreshUser(str, z);
    }

    /* JADX INFO: renamed from: O */
    public static C22421c<uxj0> m159637O(String str, String str2, Report report) {
        return FeedModule.m61406H().report(str, str2, report);
    }

    /* JADX INFO: renamed from: P */
    public static void m159638P(Act act, boolean z) {
        FeedModule.m61406H().setIfShowTabBarInNewUI(act, z);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m159639Q() {
        return FeedModule.m61406H().showMomentBanner();
    }

    /* JADX INFO: renamed from: R */
    public static void m159640R(Counter counter) {
        FeedModule.m61406H().triggerCounterFromMemoryCache(counter);
    }

    /* JADX INFO: renamed from: S */
    public static void m159641S(Envelope envelope) {
        FeedModule.m61406H().triggerCounterFromMemoryCache(envelope.counters);
    }

    /* JADX INFO: renamed from: T */
    public static int m159642T(String str) {
        return FeedModule.f39708i.f160258d.m149787J(str);
    }

    /* JADX INFO: renamed from: U */
    public static void m159643U(User user, boolean z) {
        FeedModule.m61407M().updateLiveMemberUser(user, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m159644V(int i) {
        FeedModule.m61406H().updateUnreadActivitiesByMoment(i);
    }

    /* JADX INFO: renamed from: W */
    public static C22421c<User> m159645W(String str) {
        return FeedModule.m61406H().userObsById(str);
    }

    /* JADX INFO: renamed from: X */
    public static User m159646X(String str) {
        return FeedModule.m61406H().getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: a */
    public static C22421c<uxj0> m159647a(String str) {
        return FeedModule.m61406H().blocks(str);
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<List<Moment>> m159648b(String str, int i) {
        return FeedModule.f39708i.f160257c.m112011G(str).m208677m();
    }

    /* JADX INFO: renamed from: c */
    public static void m159649c() {
        FeedModule.m61406H().clearCounterUnread();
    }

    /* JADX INFO: renamed from: d */
    public static void m159650d() {
        FeedModule.m61406H().clearRequests("activity/poll", 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m159651e() {
        FeedModule.m61406H().clearUnReadLikes();
    }

    /* JADX INFO: renamed from: f */
    public static void m159652f() {
        FeedModule.m61406H().clearUnreadFans();
    }

    /* JADX INFO: renamed from: g */
    public static void m159653g() {
        FeedModule.m61406H().mo31831ut();
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<List<MomentMessage>> m159654h(String str) {
        return FeedModule.m61406H().mo31805od(str, MomentMessage.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<uxj0> m159655i(String str, String str2, String str3, x20 x20Var) {
        return FeedModule.m61406H().mo31792ks(str, str2, str3, x20Var);
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<Counter> m159656j() {
        return FeedModule.m61406H().counter();
    }

    /* JADX INFO: renamed from: k */
    public static Counter m159657k() {
        return FeedModule.m61406H().counter_();
    }

    /* JADX INFO: renamed from: l */
    public static void m159658l(User user) {
        FeedModule.m61406H().deleteConversationAndRelated(user.f56859id);
    }

    /* JADX INFO: renamed from: m */
    public static User m159659m(String str) {
        return FeedModule.m61407M().getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: n */
    public static RelativeLayout m159660n(Act act, ViewGroup viewGroup) {
        return FeedModule.m61406H().getMomentBannersView(act, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public static List<Moment> m159661o() {
        return FeedModule.f39708i.f160257c.f83267m.m208674j();
    }

    /* JADX INFO: renamed from: p */
    public static long m159662p() {
        return FeedModule.m61406H().getSeeLastReadTime();
    }

    /* JADX INFO: renamed from: q */
    public static Integer m159663q() {
        return FeedModule.m61406H().getSessionChangedProfile();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m159664r(String str) {
        return FeedModule.m61406H().mo31822sg(str);
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<Boolean> m159665s(String str) {
        return FeedModule.m61406H().mo31710M9(str);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m159666t(String str) {
        return FeedModule.f39708i.f160257c.m112011G(str).m208669e() > 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m159667u(User user) {
        return FeedModule.m61406H().hideActiveTime(user);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m159668v(User user) {
        return FeedModule.m61406H().hideAge(user);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m159669w(User user) {
        return FeedModule.m61406H().hideLocation(user);
    }

    /* JADX INFO: renamed from: x */
    public static void m159670x(Act act) {
        FeedModule.m61406H().hideTabBarWhenNewUIMomentIsCurrentTab(act);
    }

    /* JADX INFO: renamed from: y */
    public static C22421c<Boolean> m159671y(String str) {
        return FeedModule.m61406H().isMatched(str);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m159672z(String str) {
        return FeedModule.m61406H().isMatchedSync(str);
    }
}
