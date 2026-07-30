package p007l;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Report;
import com.p000p1.mobile.putong.data.UploadSource;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.d30;
import l.q860;
import l.roj0;
import l.ya5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ijb0 {
    /* JADX INFO: renamed from: A */
    public static c<roj0> m10890A(Links links, long j, int i) {
        return FeedModule.m1140H().loadLikers(links, j, i);
    }

    /* JADX INFO: renamed from: B */
    public static c<User> m10891B() {
        return FeedModule.m1140H().me();
    }

    /* JADX INFO: renamed from: C */
    public static User m10892C() {
        return FeedModule.m1140H().me_();
    }

    /* JADX INFO: renamed from: D */
    public static c<MomentMessage> m10893D(String str, MomentMessage momentMessage, boolean z) {
        return FeedModule.m1140H().ie(MomentMessage.JSON_ADAPTER, str, momentMessage.toJson(), z);
    }

    /* JADX INFO: renamed from: E */
    public static c<List<MomentActivity>> m10894E() {
        return FeedModule.f321i.f6465d.f6183m.m12797m();
    }

    /* JADX INFO: renamed from: F */
    public static c<q860<User>> m10895F() {
        return FeedModule.m1140H().momentSeeAbLikers();
    }

    /* JADX INFO: renamed from: G */
    public static c<List<Moment>> m10896G() {
        return FeedModule.f321i.f6464c.f13305m.m12797m();
    }

    /* JADX INFO: renamed from: H */
    public static c<List<Moment>> m10897H(String str) {
        return FeedModule.f321i.f6464c.m14541M(str).m12797m();
    }

    /* JADX INFO: renamed from: I */
    public static c<roj0> m10898I() {
        return FeedModule.m1140H().pollConversation();
    }

    /* JADX INFO: renamed from: J */
    public static c<Envelope> m10899J(String str, MomentMessage momentMessage) {
        return FeedModule.m1140H().raw_messagePost(str, momentMessage.toJson(), momentMessage.momentShowFromType, momentMessage.isCommentFromKanKan);
    }

    /* JADX INFO: renamed from: K */
    public static c<List<Media>> m10900K(List<Media> list, String str, String str2) {
        return ya5.J(list, str, str2);
    }

    /* JADX INFO: renamed from: L */
    public static c<List<Media>> m10901L(List<Media> list, String str, String str2, UploadSource uploadSource) {
        return ya5.K(list, str, str2, uploadSource);
    }

    /* JADX INFO: renamed from: M */
    public static c<roj0> m10902M(String str) {
        return FeedModule.m1140H().refreshUser(str, false);
    }

    /* JADX INFO: renamed from: N */
    public static c<roj0> m10903N(String str, boolean z) {
        return FeedModule.m1140H().refreshUser(str, z);
    }

    /* JADX INFO: renamed from: O */
    public static c<roj0> m10904O(String str, String str2, Report report) {
        return FeedModule.m1140H().report(str, str2, report);
    }

    /* JADX INFO: renamed from: P */
    public static void m10905P(Act act, boolean z) {
        FeedModule.m1140H().setIfShowTabBarInNewUI(act, z);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m10906Q() {
        return FeedModule.m1140H().showMomentBanner();
    }

    /* JADX INFO: renamed from: R */
    public static void m10907R(Counter counter) {
        FeedModule.m1140H().triggerCounterFromMemoryCache(counter);
    }

    /* JADX INFO: renamed from: S */
    public static void m10908S(Envelope envelope) {
        FeedModule.m1140H().triggerCounterFromMemoryCache(envelope.counters);
    }

    /* JADX INFO: renamed from: T */
    public static int m10909T(String str) {
        return FeedModule.f321i.f6465d.m8765J(str);
    }

    /* JADX INFO: renamed from: U */
    public static void m10910U(User user, boolean z) {
        FeedModule.m1141M().updateLiveMemberUser(user, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m10911V(int i) {
        FeedModule.m1140H().updateUnreadActivitiesByMoment(i);
    }

    /* JADX INFO: renamed from: W */
    public static c<User> m10912W(String str) {
        return FeedModule.m1140H().userObsById(str);
    }

    /* JADX INFO: renamed from: X */
    public static User m10913X(String str) {
        return FeedModule.m1140H().getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: a */
    public static c<roj0> m10914a(String str) {
        return FeedModule.m1140H().blocks(str);
    }

    /* JADX INFO: renamed from: b */
    public static c<List<Moment>> m10915b(String str, int i) {
        return FeedModule.f321i.f6464c.m14535G(str).m12797m();
    }

    /* JADX INFO: renamed from: c */
    public static void m10916c() {
        FeedModule.m1140H().clearCounterUnread();
    }

    /* JADX INFO: renamed from: d */
    public static void m10917d() {
        FeedModule.m1140H().clearRequests("activity/poll", 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m10918e() {
        FeedModule.m1140H().clearUnReadLikes();
    }

    /* JADX INFO: renamed from: f */
    public static void m10919f() {
        FeedModule.m1140H().clearUnreadFans();
    }

    /* JADX INFO: renamed from: g */
    public static void m10920g() {
        FeedModule.m1140H().ut();
    }

    /* JADX INFO: renamed from: h */
    public static c<List<MomentMessage>> m10921h(String str) {
        return FeedModule.m1140H().od(str, MomentMessage.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: i */
    public static c<roj0> m10922i(String str, String str2, String str3, d30 d30Var) {
        return FeedModule.m1140H().ks(str, str2, str3, d30Var);
    }

    /* JADX INFO: renamed from: j */
    public static c<Counter> m10923j() {
        return FeedModule.m1140H().counter();
    }

    /* JADX INFO: renamed from: k */
    public static Counter m10924k() {
        return FeedModule.m1140H().counter_();
    }

    /* JADX INFO: renamed from: l */
    public static void m10925l(User user) {
        FeedModule.m1140H().deleteConversationAndRelated(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: m */
    public static User m10926m(String str) {
        return FeedModule.m1141M().getUserByIdInModule(str);
    }

    /* JADX INFO: renamed from: n */
    public static RelativeLayout m10927n(Act act, ViewGroup viewGroup) {
        return FeedModule.m1140H().getMomentBannersView(act, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public static List<Moment> m10928o() {
        return FeedModule.f321i.f6464c.f13305m.m12794j();
    }

    /* JADX INFO: renamed from: p */
    public static long m10929p() {
        return FeedModule.m1140H().getSeeLastReadTime();
    }

    /* JADX INFO: renamed from: q */
    public static Integer m10930q() {
        return FeedModule.m1140H().getSessionChangedProfile();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m10931r(String str) {
        return FeedModule.m1140H().sg(str);
    }

    /* JADX INFO: renamed from: s */
    public static c<Boolean> m10932s(String str) {
        return FeedModule.m1140H().M9(str);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m10933t(String str) {
        return FeedModule.f321i.f6464c.m14535G(str).m12789e() > 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10934u(User user) {
        return FeedModule.m1140H().hideActiveTime(user);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m10935v(User user) {
        return FeedModule.m1140H().hideAge(user);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m10936w(User user) {
        return FeedModule.m1140H().hideLocation(user);
    }

    /* JADX INFO: renamed from: x */
    public static void m10937x(Act act) {
        FeedModule.m1140H().hideTabBarWhenNewUIMomentIsCurrentTab(act);
    }

    /* JADX INFO: renamed from: y */
    public static c<Boolean> m10938y(String str) {
        return FeedModule.m1140H().isMatched(str);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10939z(String str) {
        return FeedModule.m1140H().isMatchedSync(str);
    }
}
