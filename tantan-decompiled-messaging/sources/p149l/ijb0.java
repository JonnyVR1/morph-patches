package p149l;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class ijb0 {
    /* JADX INFO: renamed from: A */
    public static C22306c<roj0> m136537A(Links links, long j, int i) {
        return FeedModule.m60222H().loadLikers(links, j, i);
    }

    /* JADX INFO: renamed from: B */
    public static C22306c<User> m136538B() {
        return FeedModule.m60222H().mo30795me();
    }

    /* JADX INFO: renamed from: C */
    public static User m136539C() {
        return FeedModule.m60222H().me_();
    }

    /* JADX INFO: renamed from: D */
    public static C22306c<MomentMessage> m136540D(String str, MomentMessage momentMessage, boolean z) {
        return FeedModule.m60222H().mo30775ie(MomentMessage.JSON_ADAPTER, str, momentMessage.toJson(), z);
    }

    /* JADX INFO: renamed from: E */
    public static C22306c<List<MomentActivity>> m136541E() {
        return FeedModule.f38860i.f77914d.f74189m.m165620m();
    }

    /* JADX INFO: renamed from: F */
    public static C22306c<q860<User>> m136542F() {
        return FeedModule.m60222H().momentSeeAbLikers();
    }

    /* JADX INFO: renamed from: G */
    public static C22306c<List<Moment>> m136543G() {
        return FeedModule.f38860i.f77913c.f170346m.m165620m();
    }

    /* JADX INFO: renamed from: H */
    public static C22306c<List<Moment>> m136544H(String str) {
        return FeedModule.f38860i.f77913c.m189030M(str).m165620m();
    }

    /* JADX INFO: renamed from: I */
    public static C22306c<roj0> m136545I() {
        return FeedModule.m60222H().pollConversation();
    }

    /* JADX INFO: renamed from: J */
    public static C22306c<Envelope> m136546J(String str, MomentMessage momentMessage) {
        return FeedModule.m60222H().raw_messagePost(str, momentMessage.toJson(), momentMessage.momentShowFromType, momentMessage.isCommentFromKanKan);
    }

    /* JADX INFO: renamed from: K */
    public static C22306c<List<Media>> m136547K(List<Media> list, String str, String str2) {
        return ya5.m213794J(list, str, str2);
    }

    /* JADX INFO: renamed from: L */
    public static C22306c<List<Media>> m136548L(List<Media> list, String str, String str2, UploadSource uploadSource) {
        return ya5.m213795K(list, str, str2, uploadSource);
    }

    /* JADX INFO: renamed from: M */
    public static C22306c<roj0> m136549M(String str) {
        return FeedModule.m60222H().refreshUser(str, false);
    }

    /* JADX INFO: renamed from: N */
    public static C22306c<roj0> m136550N(String str, boolean z) {
        return FeedModule.m60222H().refreshUser(str, z);
    }

    /* JADX INFO: renamed from: O */
    public static C22306c<roj0> m136551O(String str, String str2, Report report) {
        return FeedModule.m60222H().report(str, str2, report);
    }

    /* JADX INFO: renamed from: P */
    public static void m136552P(Act act, boolean z) {
        FeedModule.m60222H().setIfShowTabBarInNewUI(act, z);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m136553Q() {
        return FeedModule.m60222H().showMomentBanner();
    }

    /* JADX INFO: renamed from: R */
    public static void m136554R(Counter counter) {
        FeedModule.m60222H().triggerCounterFromMemoryCache(counter);
    }

    /* JADX INFO: renamed from: S */
    public static void m136555S(Envelope envelope) {
        FeedModule.m60222H().triggerCounterFromMemoryCache(envelope.counters);
    }

    /* JADX INFO: renamed from: T */
    public static int m136556T(String str) {
        return FeedModule.f38860i.f77914d.m100799J(str);
    }

    /* JADX INFO: renamed from: U */
    public static void m136557U(User user, boolean z) {
        FeedModule.m60223M().updateLiveMemberUser(user, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m136558V(int i) {
        FeedModule.m60222H().updateUnreadActivitiesByMoment(i);
    }

    /* JADX INFO: renamed from: W */
    public static C22306c<User> m136559W(String str) {
        return FeedModule.m60222H().userObsById(str);
    }

    /* JADX INFO: renamed from: X */
    public static User m136560X(String str) {
        return FeedModule.m60222H().getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: a */
    public static C22306c<roj0> m136561a(String str) {
        return FeedModule.m60222H().blocks(str);
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<List<Moment>> m136562b(String str, int i) {
        return FeedModule.f38860i.f77913c.m189024G(str).m165620m();
    }

    /* JADX INFO: renamed from: c */
    public static void m136563c() {
        FeedModule.m60222H().clearCounterUnread();
    }

    /* JADX INFO: renamed from: d */
    public static void m136564d() {
        FeedModule.m60222H().clearRequests("activity/poll", 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m136565e() {
        FeedModule.m60222H().clearUnReadLikes();
    }

    /* JADX INFO: renamed from: f */
    public static void m136566f() {
        FeedModule.m60222H().clearUnreadFans();
    }

    /* JADX INFO: renamed from: g */
    public static void m136567g() {
        FeedModule.m60222H().mo30828ut();
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<List<MomentMessage>> m136568h(String str) {
        return FeedModule.m60222H().mo30802od(str, MomentMessage.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<roj0> m136569i(String str, String str2, String str3, d30 d30Var) {
        return FeedModule.m60222H().mo30789ks(str, str2, str3, d30Var);
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<Counter> m136570j() {
        return FeedModule.m60222H().counter();
    }

    /* JADX INFO: renamed from: k */
    public static Counter m136571k() {
        return FeedModule.m60222H().counter_();
    }

    /* JADX INFO: renamed from: l */
    public static void m136572l(User user) {
        FeedModule.m60222H().deleteConversationAndRelated(user.f56011id);
    }

    /* JADX INFO: renamed from: m */
    public static User m136573m(String str) {
        return FeedModule.m60223M().getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: n */
    public static RelativeLayout m136574n(Act act, ViewGroup viewGroup) {
        return FeedModule.m60222H().getMomentBannersView(act, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public static List<Moment> m136575o() {
        return FeedModule.f38860i.f77913c.f170346m.m165617j();
    }

    /* JADX INFO: renamed from: p */
    public static long m136576p() {
        return FeedModule.m60222H().getSeeLastReadTime();
    }

    /* JADX INFO: renamed from: q */
    public static Integer m136577q() {
        return FeedModule.m60222H().getSessionChangedProfile();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m136578r(String str) {
        return FeedModule.m60222H().mo30819sg(str);
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<Boolean> m136579s(String str) {
        return FeedModule.m60222H().mo30707M9(str);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m136580t(String str) {
        return FeedModule.f38860i.f77913c.m189024G(str).m165612e() > 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m136581u(User user) {
        return FeedModule.m60222H().hideActiveTime(user);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m136582v(User user) {
        return FeedModule.m60222H().hideAge(user);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m136583w(User user) {
        return FeedModule.m60222H().hideLocation(user);
    }

    /* JADX INFO: renamed from: x */
    public static void m136584x(Act act) {
        FeedModule.m60222H().hideTabBarWhenNewUIMomentIsCurrentTab(act);
    }

    /* JADX INFO: renamed from: y */
    public static C22306c<Boolean> m136585y(String str) {
        return FeedModule.m60222H().isMatched(str);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m136586z(String str) {
        return FeedModule.m60222H().isMatchedSync(str);
    }
}
