package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0170j;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.GreetingCounter;
import com.p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p1.mobile.putong.core.data.GreetingPermission;
import com.p1.mobile.putong.core.data.GreetingResult;
import com.p1.mobile.putong.core.data.GreetingSummary;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import l.bud0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.f8c;
import l.hpd0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qjd0;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.la20;
import p006l.qib0;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.j */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0170j extends ax6 {

    /* JADX INFO: renamed from: y0 */
    public static bud0 f3999y0 = Schedulers.from(Executors.newSingleThreadScheduledExecutor());

    /* JADX INFO: renamed from: R */
    public hpd0 f4000R;

    /* JADX INFO: renamed from: S */
    public zpd0 f4001S;

    /* JADX INFO: renamed from: T */
    public hpd0 f4002T;

    /* JADX INFO: renamed from: U */
    public hpd0 f4003U;

    /* JADX INFO: renamed from: V */
    public hpd0 f4004V;

    /* JADX INFO: renamed from: W */
    public hpd0 f4005W;

    /* JADX INFO: renamed from: X */
    public hpd0 f4006X;

    /* JADX INFO: renamed from: Y */
    public hpd0 f4007Y;

    /* JADX INFO: renamed from: Z */
    public hpd0 f4008Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f4009a0;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f4010b0;

    /* JADX INFO: renamed from: c0 */
    public hpd0 f4011c0;

    /* JADX INFO: renamed from: d0 */
    public a<GreetingSummary> f4012d0;

    /* JADX INFO: renamed from: e0 */
    public a<GreetingSummary> f4013e0;

    /* JADX INFO: renamed from: f0 */
    public a<GreetingCounter> f4014f0;

    /* JADX INFO: renamed from: g0 */
    public a<q860<Greeting>> f4015g0;

    /* JADX INFO: renamed from: h0 */
    public final b<j760<String, RelationshipStatus>> f4016h0;

    /* JADX INFO: renamed from: i0 */
    public final b<String> f4017i0;

    /* JADX INFO: renamed from: j0 */
    public final b<String> f4018j0;

    /* JADX INFO: renamed from: k0 */
    public String f4019k0;

    /* JADX INFO: renamed from: l0 */
    public final a<Map<String, List<RecommendMessage>>> f4020l0;

    /* JADX INFO: renamed from: m0 */
    public final a<j760<String, CoreGiftInfo>> f4021m0;

    /* JADX INFO: renamed from: n0 */
    public b<Greeting> f4022n0;

    /* JADX INFO: renamed from: o0 */
    public b<Greeting> f4023o0;

    /* JADX INFO: renamed from: p0 */
    public b<Greeting> f4024p0;

    /* JADX INFO: renamed from: q0 */
    public b<Boolean> f4025q0;

    /* JADX INFO: renamed from: r0 */
    public b<String> f4026r0;

    /* JADX INFO: renamed from: s0 */
    public a<String> f4027s0;

    /* JADX INFO: renamed from: t0 */
    public Set<String> f4028t0;

    /* JADX INFO: renamed from: u0 */
    public Set<String> f4029u0;

    /* JADX INFO: renamed from: v0 */
    public zpd0 f4030v0;

    /* JADX INFO: renamed from: w0 */
    public zpd0 f4031w0;

    /* JADX INFO: renamed from: x0 */
    public zpd0 f4032x0;

    public C0170j(C0158c c0158c) {
        super(c0158c);
        String str = "has_show_dynamic_greet_guide_bubble_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f4000R = new hpd0(str, bool);
        this.f4001S = new zpd0("last_timestamp_show_greeting_counter_remaining_" + CoreModule.m1850H().userId(), 0L);
        this.f4002T = new hpd0("has_show_kankan_card_greet_guide_bubble_" + CoreModule.m1850H().userId(), bool);
        this.f4003U = new hpd0("HASSHOWSTATECARDGREETGUIDEBUBBLE" + CoreModule.m1850H().userId(), bool);
        this.f4004V = new hpd0("has_show_immersion_video_avatar_guide_bubble_" + CoreModule.m1850H().userId(), bool);
        this.f4005W = new hpd0("has_show_immersion_video_greeting_guide_bubble_" + CoreModule.m1850H().userId(), bool);
        this.f4006X = new hpd0("has_immersion_video_posted_" + CoreModule.m1850H().userId(), bool);
        this.f4007Y = new hpd0("has_show_immersion_video_scroll_guide_bubble_" + CoreModule.m1850H().userId(), bool);
        this.f4008Z = new hpd0("has_show_immersion_video_scroll_guide_bubble_follow_" + CoreModule.m1850H().userId(), bool);
        this.f4009a0 = new hpd0("has_show_immersion_video_scroll_guide_bubble_flow" + CoreModule.m1850H().userId(), bool);
        this.f4010b0 = new hpd0("has_show_immersion_video_greet_hello_guide_" + CoreModule.m1850H().userId(), bool);
        this.f4011c0 = new hpd0("show_greet_first_guide_" + CoreModule.m1850H().userId(), bool);
        this.f4012d0 = a.b();
        this.f4013e0 = a.b();
        this.f4014f0 = a.b();
        this.f4015g0 = a.b();
        this.f4016h0 = b.b();
        this.f4017i0 = b.b();
        this.f4018j0 = b.b();
        this.f4019k0 = "";
        this.f4020l0 = a.c(new HashMap());
        this.f4021m0 = a.b();
        this.f4022n0 = b.b();
        this.f4023o0 = b.b();
        this.f4024p0 = b.b();
        this.f4025q0 = b.b();
        this.f4026r0 = b.b();
        this.f4027s0 = a.b();
        this.f4028t0 = new HashSet(3);
        this.f4029u0 = new HashSet(3);
        this.f4030v0 = new zpd0("say_hi_button_style1_anim_time_" + CoreModule.m1850H().userId(), 0L);
        this.f4031w0 = new zpd0("say_hi_button_style2_anim_time_" + CoreModule.m1850H().userId(), 0L);
        this.f4032x0 = new zpd0("say_hi_button_in_profile_anim_time_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ stc0 m5902A4(String str, boolean z) {
        stc0.a aVarAuth = C0154a.f3483P.auth();
        StringBuilder sb = new StringBuilder("/greeting-permissions/");
        sb.append(str);
        sb.append(z ? "?source=moment" : "");
        return aVarAuth.q(C0154a.m3143J0(sb.toString())).f().b();
    }

    /* JADX INFO: renamed from: B3 */
    public static /* synthetic */ Greeting m5903B3(Envelope envelope) {
        return (Greeting) envelope.getModuleData(CoreData.class).greetings.get(0);
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ GreetingPermission m5905C3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).greetingPermissions;
        if (vwb.J(list)) {
            return null;
        }
        return (GreetingPermission) list.get(0);
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m5906C4(Message message, AtomicBoolean atomicBoolean) {
        if (((DbObject) message)._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ void m5913G3(String str) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.additional.kankan.greetingSummaryDetail.unseen = 0;
            CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ c m5914G4() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readTime", Converter.dateToApiTimeString(qib0.f19784H.guessedCurrentServerTime()));
            jSONObject.put("source", "anonymous");
        } catch (Exception unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return new la20(new v9j() { // from class: l.yu8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greeting-summary")).k(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.zu8
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m5920J4(Message message) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m5921K3(Message message) {
        message.localCreatedSession = ((Integer) App.i.get()).intValue();
        message.localCreatedTime = System.nanoTime();
        CoreModule.f1542k.f11195c.insert(message);
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m5922K4(Message message) {
        long j = ((DbObject) message)._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f1542k.f11195c.query(j);
            messageQuery.localCreatedSession = -((Integer) App.i.get()).intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            CoreModule.f1542k.f11195c.updateBy_id(messageQuery);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ Message m5929O3(j760 j760Var) {
        CoreModule.f1534c.m3403E3(((Envelope) j760Var.a).counters);
        return (Message) j760Var.b;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m5933Q3() {
        if (CoreModule.f1542k.f11205m.query("fake_conversation_greeting") == null) {
            Conversation conversationNew_ = Conversation.new_();
            ((DbObject) conversationNew_).id = "fake_conversation_greeting";
            conversationNew_.latestTime = mqi0.o();
            conversationNew_.createdTime = mqi0.o();
            conversationNew_.localEverHasMessage = true;
            conversationNew_.read = Boolean.TRUE;
            conversationNew_.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            conversationNew_.additional.kankan.greetingSummaryDetail = GreetingSummary.new_();
            CoreModule.f1534c.f3631f0.m4980mq(conversationNew_);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m5937S3() {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_greeting");
        if (NullChecker.a(conversationQuery) && NullChecker.a(conversationQuery.additional) && NullChecker.a(conversationQuery.additional.kankan) && NullChecker.a(conversationQuery.additional.kankan.greetingSummaryDetail) && TextUtils.isEmpty(conversationQuery.additional.kankan.greetingSummaryDetail.latestUserId) && TextUtils.isEmpty(conversationQuery.additional.kankan.greetingSummaryDetail.latestMessageId)) {
            CoreModule.f1534c.f3631f0.m4658Mh("fake_conversation_greeting");
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ Integer m5941U3(Envelope envelope) {
        GreetingCounter greetingCounter = envelope.getModuleData(CoreData.class).greetingCounter;
        if (NullChecker.a(greetingCounter)) {
            return Integer.valueOf(greetingCounter.replyThanksRemain);
        }
        return 20;
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ c m5954a4(final String str, final JSONObject jSONObject) {
        return NullChecker.a(jSONObject) ? new la20(new v9j() { // from class: l.qt8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str)).k(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.rt8
            public final Object call(Object obj) {
                return C0170j.m5975i4((Envelope) obj);
            }
        }) : c.empty();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ stc0 m5959c3(String str, boolean z, String str2) {
        String str3;
        stc0.a aVarAuth = C0154a.f3483P.auth();
        StringBuilder sb = new StringBuilder("/greeting-hotlevel/");
        sb.append(str);
        if (z) {
            str3 = "?source=anonymous";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "?source=" + str2;
        }
        sb.append(str3);
        return aVarAuth.q(C0154a.m3143J0(sb.toString())).f().b();
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ c m5962d3() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readTime", Converter.dateToApiTimeString(qib0.f19784H.guessedCurrentServerTime()));
        } catch (Exception unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return new la20(new v9j() { // from class: l.su8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greeting-summary")).k(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.tu8
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ c m5963d4(Boolean bool) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("doNotDisturb", bool);
        } catch (JSONException unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return ia20.m16567a(new v9j() { // from class: l.ax8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greeting-setting")).k(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.bx8
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ JSONArray m5964d5(List list, List list2) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int iMin = Math.min(list.size(), list2.size());
        for (int i = 0; i < iMin; i++) {
            String str = (String) list.get(i);
            String str2 = (String) list2.get(i);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject2.put("type", "user");
            jSONObject.put("otherUser", jSONObject2);
            jSONObject.put("readUntil", str2);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ stc0 m5971g4(DbLinks dbLinks, String str, String str2) {
        String strM3130G;
        stc0.a aVarAuth = C0154a.f3483P.auth();
        if (!NullChecker.a(dbLinks) || TextUtils.isEmpty(dbLinks.links.previous)) {
            strM3130G = C0154a.m3130G("/users/me/greetings?since=" + str + "&with=users,messages,kankans,moments" + str2);
        } else {
            strM3130G = C0154a.m3130G("/users/me/greetings?" + dbLinks.links.previous + "&with=users,messages,kankans,moments" + str2);
        }
        return aVarAuth.q(strM3130G).f().b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m5974i3(Message message, AtomicBoolean atomicBoolean) {
        if (((DbObject) message)._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ Greeting m5975i4(Envelope envelope) {
        return (Greeting) envelope.getModuleData(CoreData.class).greetings.get(0);
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m5977j4(String str, GreetingSummary greetingSummary) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (conversationQuery == null && TextUtils.equals(str, "fake_conversation_anonymous_greeting") && greetingSummary.latestTime <= 0.0d) {
            return;
        }
        if (NullChecker.a(conversationQuery)) {
            if (greetingSummary.latestTime <= 0.0d) {
                double d = conversationQuery.latestTime;
                if (d > 0.0d) {
                    greetingSummary.latestTime = d;
                }
            }
            double d2 = greetingSummary.latestTime;
            if (d2 > 0.0d) {
                conversationQuery.latestTime = d2;
            }
            conversationQuery.additional.kankan.greetingSummaryDetail = greetingSummary;
            CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
            return;
        }
        Conversation conversationNew_ = Conversation.new_();
        ((DbObject) conversationNew_).id = str;
        double d3 = greetingSummary.latestTime;
        conversationNew_.latestTime = d3;
        conversationNew_.createdTime = d3;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
        conversationNew_.additional.kankan.greetingSummaryDetail = greetingSummary;
        CoreModule.f1534c.f3631f0.m4980mq(conversationNew_);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ c m5980l3(final String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "matched");
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.qw8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str)).k(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.rw8
            public final Object call(Object obj) {
                return C0170j.m5903B3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ stc0 m5981l4(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "hidden");
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{}";
        }
        return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str + "?source=anonymous")).k(utc0.create(Network.JSON, string)).b();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ c m5985n4(final JSONArray jSONArray) {
        return NullChecker.a(jSONArray) ? new la20(new v9j() { // from class: l.zt8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings")).k(utc0.create(Network.JSON, jSONArray.toString())).b();
            }
        }).map(new w9j() { // from class: l.bu8
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).greetings;
            }
        }) : c.empty();
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ stc0 m5990q3(String str, String str2, Message message) {
        stc0.a aVarAuth = C0154a.f3483P.auth();
        StringBuilder sb = new StringBuilder("/greetings/");
        sb.append(str);
        sb.append("/messages");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return aVarAuth.q(C0154a.m3143J0(sb.toString())).l(utc0.create(Network.JSON, message.toJson())).b();
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m5992r3(Message message, AtomicBoolean atomicBoolean) {
        if (((DbObject) message)._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f1542k.f11195c.delete(((DbObject) message)._id);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ stc0 m5995s4(DbLinks dbLinks, String str, String str2) {
        String strM3130G;
        stc0.a aVarAuth = C0154a.f3483P.auth();
        if (NullChecker.a(dbLinks) && NullChecker.a(dbLinks.links.next)) {
            strM3130G = C0154a.m3130G("/users/me/greetings?" + dbLinks.links.next + "&with=users,messages,kankans,moments&sort=lastMessageTime" + str2);
        } else {
            strM3130G = C0154a.m3130G("/users/me/greetings?until=" + str + "&with=users,messages,kankans,moments&sort=lastMessageTime" + str2);
        }
        return aVarAuth.q(strM3130G).f().b();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m5996t3(Message message) {
        message.localCreatedSession = ((Integer) App.i.get()).intValue();
        message.localCreatedTime = System.nanoTime();
        CoreModule.f1542k.f11195c.insert(message);
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m6001v4(Message message, Message message2, Envelope envelope, GreetingResult greetingResult, String str) {
        message.createdTime = message2.createdTime;
        CoreModule.f1542k.f11195c.updateBy_id(message);
        envelope.getModuleData(CoreData.class).messages.clear();
        if (TextUtils.equals(greetingResult.caseValue, "newConversation") && !vwb.J(envelope.getModuleData(CoreData.class).conversations) && TextUtils.equals(((DbObject) ((Conversation) envelope.getModuleData(CoreData.class).conversations.get(0))).id, str)) {
            DbLinks dbLinks = new DbLinks();
            ((DbObject) dbLinks).id = str;
            dbLinks.links = new Links();
            CoreModule.f1542k.f11196d.upsert(dbLinks);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ JSONObject m6002w3(String str, String str2) {
        Message message = (Message) vwb.r(CoreModule.f1542k.f11195c.m26890Q(str).j(), new w9j() { // from class: l.sx8
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        if (!NullChecker.a(message) || TextUtils.equals(str2, ((DbObject) message).id)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readUntil", ((DbObject) message).id);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m6008z3(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public c<q860<Message>> m6010A5(final String str, double d, long j, boolean z, final boolean z2) {
        return mkd0.r(CoreModule.f1542k.f11195c.m26889P(str, d, j, z).m(), CoreModule.f1542k.f11196d.uiGet(m6093y5(str)), new x9j() { // from class: l.ou8
            public final Object call(Object obj, Object obj2) {
                return new q860((List) obj, (DbLinks) obj2);
            }
        }).doOnNext(new e30() { // from class: l.pu8
            public final void call(Object obj) {
                this.f19339a.m6040Q5(z2, str, (q860) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A6 */
    public c<Greeting> m6011A6(final String str, final String str2) {
        return this.f8580Q.scheduled("patch/greetings/" + str, -1, new v9j() { // from class: l.xv8
            public final Object call() {
                String str3 = str;
                return c.fromCallable(new Callable() { // from class: l.cx8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0170j.m6002w3(str3, str);
                    }
                }).flatMap(new w9j() { // from class: l.dx8
                    public final Object call(Object obj) {
                        return C0170j.m5954a4(str3, (JSONObject) obj);
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public c<Map<String, List<RecommendMessage>>> m6012B5() {
        return this.f4020l0.asObservable();
    }

    /* JADX INFO: renamed from: B6 */
    public c<roj0> m6013B6(final String str, String str2) {
        return scheduled("hide_greeting/" + str2, -1, new v9j() { // from class: l.nx8
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.yt8
                    public final Object call() {
                        return C0170j.m5981l4(str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.ox8
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: C5 */
    public c<GreetingPermission> m6014C5(String str) {
        return m6016D5(str, false);
    }

    /* JADX INFO: renamed from: C6 */
    public c<roj0> m6015C6() {
        return this.f8580Q.scheduled("patchGreetingRead", -1, new v9j() { // from class: l.sv8
            public final Object call() {
                return C0170j.m5962d3();
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public c<GreetingPermission> m6016D5(final String str, final boolean z) {
        return scheduled("greeting-permissions/" + str, 0, new v9j() { // from class: l.cv8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lw8
                    public final Object call() {
                        return C0170j.m5902A4(str, z);
                    }
                }).map(new w9j() { // from class: l.mw8
                    public final Object call(Object obj) {
                        return C0170j.m5905C3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public c<roj0> m6017D6(final Boolean bool) {
        return this.f8580Q.scheduled("patchGreetingStatus", -1, new v9j() { // from class: l.nv8
            public final Object call() {
                return C0170j.m5963d4(bool);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public final void m6018E5(final String str) {
        e51.y(new Runnable() { // from class: l.dw8
            @Override // java.lang.Runnable
            public final void run() {
                this.f10618a.m6041R5(str);
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public c<roj0> m6019E6(String str) {
        return m6021F6(str, false, false);
    }

    /* JADX INFO: renamed from: F5 */
    public void m6020F5(final GreetingSummary greetingSummary, final String str) {
        e51.y(new Runnable() { // from class: l.hu8
            @Override // java.lang.Runnable
            public final void run() {
                this.f14083a.m6042S5(str, greetingSummary);
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public c<roj0> m6021F6(final String str, final boolean z, final boolean z2) {
        return this.f8580Q.scheduled("poll/greetings/" + str + "/messages", 0, new v9j() { // from class: l.xu8
            public final Object call() {
                return this.f27722a.m6064j6(str, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public c<roj0> m6022G5(final String str, final MessageType messageType) {
        return this.f8580Q.now(c.fromCallable(new Callable() { // from class: l.gv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13522a.m6043T5(messageType, str);
            }
        }).compose(mkd0.C()));
    }

    /* JADX INFO: renamed from: G6 */
    public c<roj0> m6023G6(String str, boolean z) {
        return m6021F6(str, false, z);
    }

    /* JADX INFO: renamed from: H5 */
    public void m6024H5() {
        e51.y(new Runnable() { // from class: l.gu8
            @Override // java.lang.Runnable
            public final void run() {
                this.f13510a.m6044U5();
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public final c<roj0> m6025H6(final String str) {
        return this.f8580Q.scheduled("greetings/" + str + "/recommend-messages", 0, new v9j() { // from class: l.tv8
            public final Object call() {
                return this.f22291a.m6068l6(str);
            }
        });
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m6026I5() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.bw8
            public final void call() {
                CoreModule.f1534c.f3631f0.m4658Mh("fake_conversation_greeting");
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public c<Greeting> m6027I6(final String str) {
        return this.f8580Q.scheduled("greetings/" + str, 0, new v9j() { // from class: l.qu8
            public final Object call() {
                return this.f20075a.m6072n6(str);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m6028J5() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ru8
            public final void call() {
                C0170j.m5937S3();
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public c<roj0> m6029J6() {
        return m6031K6(false);
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ j760 m6030K5(DbLinks dbLinks, Envelope envelope) {
        DbLinks dbLinksNew_ = dbLinks == null ? DbLinks.new_() : dbLinks.clone();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(moduleData.messages)) {
            arrayList.addAll(moduleData.messages);
        }
        m6080r6(envelope);
        m6067l5(moduleData.greetings, moduleData.moments);
        List list = moduleData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.J(list)) {
            arrayList2.addAll(list);
        }
        q860 q860Var = new q860(arrayList2, dbLinksNew_);
        this.f4015g0.onNext(q860Var);
        return j760.a(q860Var, arrayList);
    }

    /* JADX INFO: renamed from: K6 */
    public c<roj0> m6031K6(final boolean z) {
        return this.f8580Q.scheduled("refreshGreetingSummary", 0, new v9j() { // from class: l.wu8
            public final Object call() {
                return this.f25412a.m6076p6(z);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ c m6032L5(final DbLinks dbLinks, final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.nw8
            public final Object call() {
                return C0170j.m5995s4(dbLinks, str, str2);
            }
        }).map(new w9j() { // from class: l.pw8
            public final Object call(Object obj) {
                return this.f19391a.m6030K5(dbLinks, (Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: L6 */
    public c<GreetingSummary> m6033L6() {
        return this.f4013e0;
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ j760 m6034M5(DbLinks dbLinks, Envelope envelope) {
        DbLinks dbLinksNew_ = dbLinks == null ? DbLinks.new_() : dbLinks.clone();
        if (!TextUtils.isEmpty(envelope.pagination.links.previous)) {
            dbLinksNew_.links.previous = envelope.pagination.links.previous;
        }
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(moduleData.messages)) {
            arrayList.addAll(moduleData.messages);
        }
        m6080r6(envelope);
        List list = moduleData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.J(list)) {
            arrayList2.addAll(list);
        }
        q860 q860Var = new q860(arrayList2, dbLinksNew_);
        this.f4015g0.onNext(q860Var);
        return j760.a(q860Var, arrayList);
    }

    /* JADX INFO: renamed from: M6 */
    public c<GreetingSummary> m6035M6() {
        return this.f4012d0;
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ c m6036N5(final DbLinks dbLinks, final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.qv8
            public final Object call() {
                return C0170j.m5971g4(dbLinks, str, str2);
            }
        }).map(new w9j() { // from class: l.rv8
            public final Object call(Object obj) {
                return this.f20807a.m6034M5(dbLinks, (Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: N6 */
    public c<roj0> m6037N6(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f8580Q.now(c.fromCallable(new Callable() { // from class: l.hv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14094a.m6078q6(notificationStatus, notificationStatus2, str);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ j760 m6038O5(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        m6080r6(envelope);
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(moduleData.messages)) {
            arrayList.addAll(moduleData.messages);
        }
        List list = moduleData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.J(list)) {
            arrayList2.addAll(list);
        }
        return j760.a(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ c m6039P5(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.ov8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/users/me/greetings?until=" + str + "&with=users,messages,kankans,moments&sort=lastMessageTime&source=instant-chat")).f().b();
            }
        }).map(new w9j() { // from class: l.pv8
            public final Object call(Object obj) {
                return this.f19374a.m6038O5((Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m6040Q5(boolean z, String str, q860 q860Var) {
        if (vwb.J(q860Var.a) && z) {
            m6019E6(str);
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m6041R5(final String str) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.fv8
            public final void call() {
                C0170j.m5913G3(str);
            }
        });
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m6042S5(final String str, final GreetingSummary greetingSummary) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.iw8
            public final void call() {
                C0170j.m5977j4(str, greetingSummary);
            }
        });
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ roj0 m6043T5(MessageType messageType, String str) throws Exception {
        final Message messageNew_ = Message.new_();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        messageNew_.messageType = messageType;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localNotificationStatus = NotificationStatus.get("removed");
        if (TEnum.equals(messageType, "local_chat_greeting_tip") || TEnum.equals(messageType, "local_greeting_match_success")) {
            messageNew_.cid = str;
            messageNew_.localInConversation = true;
            List listJ = CoreModule.f1542k.f11195c.m26911l0(str).j();
            if (vwb.J(listJ)) {
                messageNew_.createdTime = C0154a.m3193W2();
            } else {
                messageNew_.createdTime = C0154a.m3197X2(((Message) listJ.get(0)).createdTime);
            }
        } else {
            messageNew_.localGreetingId = str;
            List listJ2 = CoreModule.f1542k.f11195c.m26890Q(str).j();
            if (vwb.J(listJ2) || !TEnum.equals(((Message) listJ2.get(0)).messageType, "text")) {
                messageNew_.createdTime = C0154a.m3193W2();
            } else {
                messageNew_.createdTime = C0154a.m3197X2(((Message) listJ2.get(0)).createdTime);
            }
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kv8
            public final void call() {
                C0170j.m5996t3(messageNew_);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m6044U5() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.yv8
            public final void call() {
                C0170j.m5933Q3();
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m6045V5(Map map, Message message, boolean z, Message message2, Message message3) {
        if (message2.isOtherUser()) {
            Greeting greetingM6091x5 = m6091x5(message2.owner);
            if (NullChecker.a(greetingM6091x5)) {
                Message message4 = (Message) map.get(greetingM6091x5.readUntil);
                if (NullChecker.a(message4) && message4.createdTime >= message2.createdTime) {
                    message2.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        }
        if (NullChecker.a(message3)) {
            message2.localGreetingId = message3.localGreetingId;
            message2.createdTime = message3.createdTime;
            message2.localCreatedSession = message3.localCreatedSession;
            long j = message2.localCreatedTime;
            long j2 = message3.localCreatedTime;
            if (j > j2) {
                message2.localCreatedTime = j2;
            }
            message2.localInConversation = message3.localInConversation;
            message2.localNotificationStatus = message3.localNotificationStatus;
        } else {
            if (!message2.isOtherUser() || !TEnum.equals(message2.localNotificationStatus, "unknown_")) {
                message2.localNotificationStatus = NotificationStatus.get("removed");
            }
            message2.localGreetingId = message.isOtherUser() ? message.owner : message.hostId;
        }
        if (z) {
            message2.localNotificationStatus = NotificationStatus.get("removed");
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m6046W5(List list, final boolean z) {
        final HashMap map = new HashMap(list.size());
        vwb.z(list, new e30() { // from class: l.jx8
            public final void call(Object obj) {
                Message message = (Message) obj;
                map.put(((DbObject) message).id, message);
            }
        });
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Message message = (Message) it.next();
            CoreModule.f1542k.f11195c.upsert(message, new f30() { // from class: l.lx8
                public final void call(Object obj, Object obj2) {
                    this.f16697a.m6045V5(map, message, z, (Message) obj, (Message) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ roj0 m6047X5(final long j) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.wt8
            public final void call() {
                CoreModule.f1542k.f11195c.delete(j);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Message m6048Y5(final Message message, String str) throws Exception {
        if (((DbObject) message)._id != 0) {
            final Message messageClone = message.clone();
            messageClone.localCreatedSession = ((Integer) App.i.get()).intValue();
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hx8
                public final void call() {
                    CoreModule.f1542k.f11195c.updateBy_id(messageClone);
                }
            });
            return messageClone;
        }
        List listJ = CoreModule.f1542k.f11195c.m26887N(str).j();
        message.createdTime = !listJ.isEmpty() ? C0154a.m3197X2(((Message) listJ.get(0)).createdTime) : C0154a.m3193W2();
        message.owner = CoreModule.m1850H().userId();
        message.recalled = Boolean.FALSE;
        message.localNotificationStatus = NotificationStatus.get("removed");
        message.localGreetingId = str;
        ((DbObject) message).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        if (TextUtils.isEmpty(message.value)) {
            message.value = "";
        }
        if (vwb.J(message.media)) {
            message.media = new ArrayList();
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.gx8
            public final void call() {
                C0170j.m5921K3(message);
            }
        });
        return message;
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ c m6049Z5(final Message message, final String str) {
        return c.fromCallable(new Callable() { // from class: l.wv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25420a.m6048Y5(message, str);
            }
        }).compose(qjd0.e(f3999y0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    public final /* synthetic */ void m6050a6(final Message message, Channel channel, Throwable th) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40041 || i == 40044 || i == 40045 || i == 40046) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ew8
                    public final void call() {
                        C0170j.m5974i3(message, atomicBoolean);
                    }
                });
                return;
            }
        } else if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isIdCardAuthing() || tantanForbidden.isOtherNotVerify()) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.fw8
                    public final void call() {
                        C0170j.m5992r3(message, atomicBoolean);
                    }
                });
                return;
            }
            int i2 = tantanForbidden.code;
            if ((i2 == 40337 || i2 == 40046 || i2 == 40399) && (TEnum.equals(channel, "reply_thanks") || TEnum.equals(channel, "red_flower"))) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.gw8
                    public final void call() {
                        C0170j.m5906C4(message, atomicBoolean);
                    }
                });
                return;
            }
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hw8
            public final void call() {
                C0170j.m5922K4(message);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ j760 m6051b6(final Message message, final String str, d30 d30Var, final Envelope envelope) {
        final GreetingResult greetingResult = envelope.getModuleData(CoreData.class).greetingResult;
        final Message message2 = (Message) envelope.getModuleData(CoreData.class).messages.get(0);
        message2.localCreatedTime = message.localCreatedTime;
        ((DbObject) message2)._id = ((DbObject) message)._id;
        message2.localGreetingId = str;
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.rx8
            public final void call() {
                C0170j.m6001v4(message2, message, envelope, greetingResult, str);
            }
        });
        if (TextUtils.equals(greetingResult.caseValue, "newConversation") && NullChecker.a(d30Var)) {
            d30Var.call();
        }
        return vwb.Y(envelope, message2);
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ c m6052c6(final String str, final String str2, final Message message, final d30 d30Var, e30 e30Var) {
        return ia20.m16571e(new v9j() { // from class: l.ww8
            public final Object call() {
                return C0170j.m5990q3(str, str2, message);
            }
        }).map(new w9j() { // from class: l.xw8
            public final Object call(Object obj) {
                return this.f27747a.m6051b6(message, str, d30Var, (Envelope) obj);
            }
        }).doOnError(e30Var).compose(mkd0.C()).map(new w9j() { // from class: l.yw8
            public final Object call(Object obj) {
                return C0170j.m5929O3((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ c m6053d6(final String str, final String str2, final d30 d30Var, final e30 e30Var, boolean z, final Message message) {
        return scheduled("greetings/" + str + "/messages", -1, new v9j() { // from class: l.uv8
            public final Object call() {
                return this.f23761a.m6052c6(str, str2, message, d30Var, e30Var);
            }
        }, z);
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ String m6054e6(String str, boolean z) throws Exception {
        DbLinks dbLinksQuery = CoreModule.f1542k.f11196d.query(m6093y5(str));
        if (!NullChecker.a(dbLinksQuery) || TextUtils.isEmpty(dbLinksQuery.links.previous) || z) {
            return C0154a.m3143J0("/greetings/" + str + "/messages?with=moments");
        }
        String str2 = dbLinksQuery.links.previous;
        return C0154a.m3143J0("/greetings/" + str + "/messages?" + dbLinksQuery.links.previous + "&with=moments");
    }

    /* JADX INFO: renamed from: f5 */
    public c<Greeting> m6055f5(final String str) {
        return this.f8580Q.scheduled("patch/greetings/" + str + "/match/agree", -1, new v9j() { // from class: l.vv8
            public final Object call() {
                return C0170j.m5980l3(str);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ void m6056f6(String str, Map map, boolean z, Message message, Message message2) {
        if (message.isOtherUser()) {
            Greeting greetingM6091x5 = m6091x5(str);
            if (NullChecker.a(greetingM6091x5)) {
                Message message3 = (Message) map.get(greetingM6091x5.readUntil);
                if (NullChecker.a(message3) && message3.createdTime >= message.createdTime) {
                    message.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        }
        if (NullChecker.a(message2)) {
            message.createdTime = message2.createdTime;
            message.localCreatedSession = message2.localCreatedSession;
            long j = message.localCreatedTime;
            long j2 = message2.localCreatedTime;
            if (j > j2) {
                message.localCreatedTime = j2;
            }
            message.localInConversation = message2.localInConversation;
            message.localNotificationStatus = message2.localNotificationStatus;
        } else if (message.isOtherUser() && TEnum.equals(message.localNotificationStatus, "unknown_")) {
            message.localNotificationStatus = NotificationStatus.get("pending");
        } else {
            message.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (z) {
            message.localNotificationStatus = NotificationStatus.get("removed");
        }
    }

    /* JADX INFO: renamed from: g5 */
    public c<List<Greeting>> m6057g5(final List<String> list, final List<String> list2) {
        return this.f8580Q.scheduled("patch/greetings/batchPatchGreetingUnread", -1, new v9j() { // from class: l.mx8
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.st8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0170j.m5964d5(list, list);
                    }
                }).flatMap(new w9j() { // from class: l.tt8
                    public final Object call(Object obj) {
                        return C0170j.m5985n4((JSONArray) obj);
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ void m6058g6(Envelope envelope, final String str, final boolean z) {
        if (!TextUtils.isEmpty(envelope.pagination.links.previous)) {
            DbLinks dbLinksQuery = CoreModule.f1542k.f11196d.query(m6093y5(str));
            if (dbLinksQuery == null) {
                dbLinksQuery = DbLinks.new_();
                ((DbObject) dbLinksQuery).id = m6093y5(str);
            }
            dbLinksQuery.links.previous = envelope.pagination.links.previous;
            CoreModule.f1542k.f11196d.upsert(dbLinksQuery);
        }
        List<Message> list = envelope.getModuleData(CoreData.class).messages;
        if (vwb.J(list)) {
            return;
        }
        final HashMap map = new HashMap(list.size());
        vwb.z(list, new e30() { // from class: l.ut8
            public final void call(Object obj) {
                Message message = (Message) obj;
                map.put(((DbObject) message).id, message);
            }
        });
        for (Message message : list) {
            message.localGreetingId = str;
            CoreModule.f1542k.f11195c.upsert(message, new f30() { // from class: l.vt8
                public final void call(Object obj, Object obj2) {
                    this.f24451a.m6056f6(str, map, z, (Message) obj, (Message) obj2);
                }
            });
        }
        list.clear();
    }

    /* JADX INFO: renamed from: h5 */
    public void m6059h5() {
        m6018E5("fake_conversation_anonymous_greeting");
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m6060h6(final String str, final boolean z, final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ux8
            public final void call() {
                this.f23790a.m6058g6(envelope, str, z);
            }
        });
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: i5 */
    public void m6061i5() {
        m6018E5("fake_conversation_greeting");
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ c m6062i6(final String str, final boolean z, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.sw8
            public final Object call() {
                return C0154a.f3483P.auth().q(str2).f().b();
            }
        }).doOnNext(new e30() { // from class: l.tw8
            public final void call(Object obj) {
                this.f22304a.m6060h6(str, z, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.uw8
            public final void call(Object obj) {
                C0170j.m6008z3((Throwable) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.vw8
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public c<roj0> m6063j5(final String str, String str2) {
        return scheduled("delete_greeting/" + str2, -1, new v9j() { // from class: l.px8
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.xt8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str)).d().b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.qx8
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ c m6064j6(final String str, final boolean z, final boolean z2) {
        return c.fromCallable(new Callable() { // from class: l.lv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16669a.m6054e6(str, z);
            }
        }).flatMap(new w9j() { // from class: l.mv8
            public final Object call(Object obj) {
                return this.f17305a.m6062i6(str, z2, (String) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: k5 */
    public void m6065k5() {
        e51.y(new Runnable() { // from class: l.bv8
            @Override // java.lang.Runnable
            public final void run() {
                this.f9099a.m6026I5();
            }
        });
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ roj0 m6066k6(String str, Envelope envelope) {
        m6094y6(str, envelope.getModuleData(CoreData.class).recommendMessages);
        m6092x6(str, envelope.getModuleData(CoreData.class).giftInfos);
        return roj0.a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l5 */
    public final void m6067l5(List<Greeting> list, List<CoreMomentInfo> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list2)) {
            Iterator<CoreMomentInfo> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CopyObject) it.next()).id);
            }
        }
        if (vwb.J(list)) {
            return;
        }
        for (final Greeting greeting : list) {
            if (!arrayList.contains(greeting.id)) {
                f8c.o().B(new d30() { // from class: l.ix8
                    public final void call() {
                        CoreModule.m1853N().u9(greeting.id);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public final /* synthetic */ c m6068l6(final String str) {
        return ia20.m16567a(new v9j() { // from class: l.ex8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str + "/recommend-messages?with=gifts")).f().b();
            }
        }).map(new w9j() { // from class: l.fx8
            public final Object call(Object obj) {
                return this.f12954a.m6066k6(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public void m6069m5() {
        e51.y(new Runnable() { // from class: l.pt8
            @Override // java.lang.Runnable
            public final void run() {
                this.f19301a.m6028J5();
            }
        });
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ Greeting m6070m6(Envelope envelope) {
        List<Greeting> list = envelope.getModuleData(CoreData.class).greetings;
        if (vwb.J(list)) {
            return null;
        }
        m6080r6(envelope);
        m6067l5(list, envelope.getModuleData(CoreData.class).moments);
        this.f4024p0.onNext(list.get(0));
        return list.get(0);
    }

    /* JADX INFO: renamed from: n5 */
    public c<Boolean> m6071n5() {
        return scheduled("/users/me/greeting-setting/", 0, new v9j() { // from class: l.lu8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.iv8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/greeting-setting")).f().b();
                    }
                }).map(new w9j() { // from class: l.jv8
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).getModuleData(CoreData.class).greetingSetting.doNotDisturb);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ c m6072n6(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.jw8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str + "?with=kankans,moments,users")).f().b();
            }
        }).map(new w9j() { // from class: l.kw8
            public final Object call(Object obj) {
                return this.f16015a.m6070m6((Envelope) obj);
            }
        }).compose(mkd0.y());
    }

    /* JADX INFO: renamed from: o5 */
    public c<Greeting> m6073o5(String str) {
        Greeting greetingM6091x5 = m6091x5(str);
        return NullChecker.a(greetingM6091x5) ? c.just(greetingM6091x5) : m6027I6(str);
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ roj0 m6074o6(boolean z, Envelope envelope) {
        this.f4012d0.onNext(envelope.getModuleData(CoreData.class).greetingSummary);
        GreetingSummary greetingSummaryNew_ = envelope.getModuleData(CoreData.class).anonymousSummary;
        if (greetingSummaryNew_ == null) {
            greetingSummaryNew_ = GreetingSummary.new_();
        }
        this.f4013e0.onNext(greetingSummaryNew_);
        m6082s6(envelope, z);
        return roj0.a;
    }

    /* JADX INFO: renamed from: p5 */
    public c<GreetingHotLevelInfo> m6075p5(String str, boolean z) {
        return m6077q5(str, z, "");
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ c m6076p6(final boolean z) {
        return new la20(new v9j() { // from class: l.uu8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/greeting-summary?source=anonymous&with=users,messages")).b();
            }
        }).map(new w9j() { // from class: l.vu8
            public final Object call(Object obj) {
                return this.f24464a.m6074o6(z, (Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: q5 */
    public c<GreetingHotLevelInfo> m6077q5(final String str, final boolean z, final String str2) {
        return scheduled("getGreetingHotLevelInfo/" + str, 0, new v9j() { // from class: l.kx8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.dv8
                    public final Object call() {
                        return C0170j.m5959c3(str, z, str);
                    }
                }).map(new w9j() { // from class: l.ev8
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).greetingHotLevelInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ roj0 m6078q6(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.nu8
            public final void call() {
                CoreModule.f1542k.f11195c.m26920u0(notificationStatus, notificationStatus2, str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: r5 */
    public c<j760<q860<Greeting>, List<Message>>> m6079r5(final String str, final DbLinks dbLinks, final String str2) {
        return scheduled("kankan/reply/greeting/" + str2, 0, new v9j() { // from class: l.av8
            public final Object call() {
                return this.f8547a.m6032L5(dbLinks, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public final void m6080r6(Envelope envelope) {
        m6082s6(envelope, false);
    }

    /* JADX INFO: renamed from: s5 */
    public c<List<RecommendMessage>> m6081s5(final String str) {
        return scheduled("greeting-ecommend-messages/" + str, 0, new v9j() { // from class: l.ow8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.ju8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/greetings/" + str + "/recommend-messages?with=gifts")).f().b();
                    }
                }).map(new w9j() { // from class: l.ku8
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).recommendMessages;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final void m6082s6(Envelope envelope, final boolean z) {
        List list = envelope.getModuleData(CoreData.class).messages;
        if (vwb.J(list)) {
            this.f8580Q.m3422w3(envelope, null);
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.cw8
            public final void call() {
                this.f9880a.m6046W5(arrayList, z);
            }
        });
        list.clear();
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: t5 */
    public c<j760<q860<Greeting>, List<Message>>> m6083t5(final String str, final DbLinks dbLinks, final String str2) {
        return scheduled("kankan/reply/greeting/push", 0, new v9j() { // from class: l.mu8
            public final Object call() {
                return this.f17279a.m6036N5(dbLinks, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public c<roj0> m6084t6(final long j) {
        return this.f8580Q.now(c.fromCallable(new Callable() { // from class: l.tx8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22318a.m6047X5(j);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: u5 */
    public c<j760<List<Greeting>, List<Message>>> m6085u5(final String str) {
        return scheduled("kankan/reply/greeting/instant-chat", 0, new v9j() { // from class: l.iu8
            public final Object call() {
                return this.f14787a.m6039P5(str);
            }
        });
    }

    /* JADX INFO: renamed from: u6 */
    public c<Message> m6086u6(String str, Channel channel, Message message, String str2, d30 d30Var) {
        return m6088v6(str, channel, message, str2, d30Var, true);
    }

    /* JADX INFO: renamed from: v5 */
    public c<j760<String, RelationshipStatus>> m6087v5() {
        return this.f4016h0.asObservable();
    }

    /* JADX INFO: renamed from: v6 */
    public c<Message> m6088v6(final String str, final Channel channel, final Message message, String str2, final d30 d30Var, final boolean z) {
        String str3;
        Channel channel2 = (channel == null || TEnum.equals(channel, Channel.get("unknown_"))) ? Channel.get("moment") : channel;
        if (TextUtils.isEmpty(str2)) {
            str3 = "?channel=" + channel2.toString();
        } else {
            str3 = str2 + "&channel=" + channel2.toString();
        }
        String strM23854t3 = this.f8580Q.f3647k1.m23854t3(str);
        if (!TextUtils.isEmpty(strM23854t3)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "?picksTracker=" + strM23854t3;
            } else {
                str3 = str3 + "&picksTracker=" + strM23854t3;
            }
        }
        final String str4 = str3;
        v9j v9jVar = new v9j() { // from class: l.vx8
            public final Object call() {
                return this.f24514a.m6049Z5(message, str);
            }
        };
        final e30 e30Var = new e30() { // from class: l.au8
            public final void call(Object obj) {
                this.f8528a.m6050a6(message, channel, (Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.cu8
            public final Object call(Object obj) {
                return this.f9849a.m6053d6(str, str4, d30Var, e30Var, z, (Message) obj);
            }
        };
        return this.f8580Q.now((String) null, ((c) v9jVar.call()).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.du8
            public final Object call(Object obj) {
                return (c) w9jVar.call((Message) obj);
            }
        }).doOnNext(new e30() { // from class: l.eu8
            public final void call(Object obj) {
                C0170j.m5920J4((Message) obj);
            }
        }), z);
    }

    /* JADX INFO: renamed from: w5 */
    public c<Integer> m6089w5() {
        return scheduled("me/greeting-counter", 0, new v9j() { // from class: l.fu8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.zv8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/greeting-counter?query=replyThanks")).f().b();
                    }
                }).map(new w9j() { // from class: l.aw8
                    public final Object call(Object obj) {
                        return C0170j.m5941U3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public c<List<Message>> m6090w6(String str) {
        return CoreModule.f1542k.f11195c.m26885L(str).m();
    }

    /* JADX INFO: renamed from: x5 */
    public Greeting m6091x5(String str) {
        q860 q860Var = (q860) this.f4015g0.e();
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.a)) {
            return null;
        }
        for (Greeting greeting : q860Var.a) {
            if (TextUtils.equals(str, greeting.id)) {
                return greeting;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m6092x6(String str, List<CoreGiftInfo> list) {
        boolean zJ = vwb.J(list);
        a<j760<String, CoreGiftInfo>> aVar = this.f4021m0;
        if (zJ) {
            aVar.onNext((Object) null);
        } else {
            aVar.onNext(j760.a(str, list.get(0)));
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final String m6093y5(String str) {
        return "greeting/v3/" + str + "/messages";
    }

    /* JADX INFO: renamed from: y6 */
    public final void m6094y6(String str, List<RecommendMessage> list) {
        Map map = (Map) this.f4020l0.e();
        if (vwb.J(list)) {
            map.remove(str);
        } else {
            map.put(str, list);
        }
        this.f4020l0.onNext(map);
    }

    /* JADX INFO: renamed from: z5 */
    public c<q860<Message>> m6095z5(String str, double d, long j, boolean z) {
        return m6010A5(str, d, j, z, true);
    }

    /* JADX INFO: renamed from: z6 */
    public c<roj0> m6096z6() {
        return this.f8580Q.scheduled("patchAnonymousGreetingRead", -1, new v9j() { // from class: l.zw8
            public final Object call() {
                return C0170j.m5914G4();
            }
        });
    }
}
