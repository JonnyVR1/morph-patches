package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4744j;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingCounter;
import com.p046p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p046p1.mobile.putong.core.data.GreetingPermission;
import com.p046p1.mobile.putong.core.data.GreetingResult;
import com.p046p1.mobile.putong.core.data.GreetingSummary;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.bud0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.f8c;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.jo0;
import p149l.la20;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q860;
import p149l.qib0;
import p149l.qjd0;
import p149l.roj0;
import p149l.stc0;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.j */
/* JADX INFO: loaded from: classes9.dex */
public class C4744j extends ax6 {

    /* JADX INFO: renamed from: y0 */
    public static bud0 f20010y0 = Schedulers.from(Executors.newSingleThreadScheduledExecutor());

    /* JADX INFO: renamed from: R */
    public hpd0 f20011R;

    /* JADX INFO: renamed from: S */
    public zpd0 f20012S;

    /* JADX INFO: renamed from: T */
    public hpd0 f20013T;

    /* JADX INFO: renamed from: U */
    public hpd0 f20014U;

    /* JADX INFO: renamed from: V */
    public hpd0 f20015V;

    /* JADX INFO: renamed from: W */
    public hpd0 f20016W;

    /* JADX INFO: renamed from: X */
    public hpd0 f20017X;

    /* JADX INFO: renamed from: Y */
    public hpd0 f20018Y;

    /* JADX INFO: renamed from: Z */
    public hpd0 f20019Z;

    /* JADX INFO: renamed from: a0 */
    public hpd0 f20020a0;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f20021b0;

    /* JADX INFO: renamed from: c0 */
    public hpd0 f20022c0;

    /* JADX INFO: renamed from: d0 */
    public C22392a<GreetingSummary> f20023d0;

    /* JADX INFO: renamed from: e0 */
    public C22392a<GreetingSummary> f20024e0;

    /* JADX INFO: renamed from: f0 */
    public C22392a<GreetingCounter> f20025f0;

    /* JADX INFO: renamed from: g0 */
    public C22392a<q860<Greeting>> f20026g0;

    /* JADX INFO: renamed from: h0 */
    public final C22393b<j760<String, RelationshipStatus>> f20027h0;

    /* JADX INFO: renamed from: i0 */
    public final C22393b<String> f20028i0;

    /* JADX INFO: renamed from: j0 */
    public final C22393b<String> f20029j0;

    /* JADX INFO: renamed from: k0 */
    public String f20030k0;

    /* JADX INFO: renamed from: l0 */
    public final C22392a<Map<String, List<RecommendMessage>>> f20031l0;

    /* JADX INFO: renamed from: m0 */
    public final C22392a<j760<String, CoreGiftInfo>> f20032m0;

    /* JADX INFO: renamed from: n0 */
    public C22393b<Greeting> f20033n0;

    /* JADX INFO: renamed from: o0 */
    public C22393b<Greeting> f20034o0;

    /* JADX INFO: renamed from: p0 */
    public C22393b<Greeting> f20035p0;

    /* JADX INFO: renamed from: q0 */
    public C22393b<Boolean> f20036q0;

    /* JADX INFO: renamed from: r0 */
    public C22393b<String> f20037r0;

    /* JADX INFO: renamed from: s0 */
    public C22392a<String> f20038s0;

    /* JADX INFO: renamed from: t0 */
    public Set<String> f20039t0;

    /* JADX INFO: renamed from: u0 */
    public Set<String> f20040u0;

    /* JADX INFO: renamed from: v0 */
    public zpd0 f20041v0;

    /* JADX INFO: renamed from: w0 */
    public zpd0 f20042w0;

    /* JADX INFO: renamed from: x0 */
    public zpd0 f20043x0;

    public C4744j(C4732c c4732c) {
        super(c4732c);
        String str = "has_show_dynamic_greet_guide_bubble_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20011R = new hpd0(str, bool);
        this.f20012S = new zpd0("last_timestamp_show_greeting_counter_remaining_" + CoreModule.m29931H().userId(), 0L);
        this.f20013T = new hpd0("has_show_kankan_card_greet_guide_bubble_" + CoreModule.m29931H().userId(), bool);
        this.f20014U = new hpd0("HASSHOWSTATECARDGREETGUIDEBUBBLE" + CoreModule.m29931H().userId(), bool);
        this.f20015V = new hpd0("has_show_immersion_video_avatar_guide_bubble_" + CoreModule.m29931H().userId(), bool);
        this.f20016W = new hpd0("has_show_immersion_video_greeting_guide_bubble_" + CoreModule.m29931H().userId(), bool);
        this.f20017X = new hpd0("has_immersion_video_posted_" + CoreModule.m29931H().userId(), bool);
        this.f20018Y = new hpd0("has_show_immersion_video_scroll_guide_bubble_" + CoreModule.m29931H().userId(), bool);
        this.f20019Z = new hpd0("has_show_immersion_video_scroll_guide_bubble_follow_" + CoreModule.m29931H().userId(), bool);
        this.f20020a0 = new hpd0("has_show_immersion_video_scroll_guide_bubble_flow" + CoreModule.m29931H().userId(), bool);
        this.f20021b0 = new hpd0("has_show_immersion_video_greet_hello_guide_" + CoreModule.m29931H().userId(), bool);
        this.f20022c0 = new hpd0("show_greet_first_guide_" + CoreModule.m29931H().userId(), bool);
        this.f20023d0 = C22392a.m221512b();
        this.f20024e0 = C22392a.m221512b();
        this.f20025f0 = C22392a.m221512b();
        this.f20026g0 = C22392a.m221512b();
        this.f20027h0 = C22393b.m221521b();
        this.f20028i0 = C22393b.m221521b();
        this.f20029j0 = C22393b.m221521b();
        this.f20030k0 = "";
        this.f20031l0 = C22392a.m221513c(new HashMap());
        this.f20032m0 = C22392a.m221512b();
        this.f20033n0 = C22393b.m221521b();
        this.f20034o0 = C22393b.m221521b();
        this.f20035p0 = C22393b.m221521b();
        this.f20036q0 = C22393b.m221521b();
        this.f20037r0 = C22393b.m221521b();
        this.f20038s0 = C22392a.m221512b();
        this.f20039t0 = new HashSet(3);
        this.f20040u0 = new HashSet(3);
        this.f20041v0 = new zpd0("say_hi_button_style1_anim_time_" + CoreModule.m29931H().userId(), 0L);
        this.f20042w0 = new zpd0("say_hi_button_style2_anim_time_" + CoreModule.m29931H().userId(), 0L);
        this.f20043x0 = new zpd0("say_hi_button_in_profile_anim_time_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ stc0 m33965A4(String str, boolean z) {
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        StringBuilder sb = new StringBuilder("/greeting-permissions/");
        sb.append(str);
        sb.append(z ? "?source=moment" : "");
        return c20027aAuth.m185898q(C4728a.m31213J0(sb.toString())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ GreetingPermission m33968C3(Envelope envelope) {
        List<GreetingPermission> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetingPermissions;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m33969C4(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f17553k.f91940c.delete(message._id);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ void m33976G3(String str) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.additional.kankan.greetingSummaryDetail.unseen = 0;
            CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ C22306c m33977G4() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readTime", Converter.dateToApiTimeString(qib0.f154693H.guessedCurrentServerTime()));
            jSONObject.put("source", "anonymous");
        } catch (Exception unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return new la20(new v9j() { // from class: l.yu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greeting-summary")).m185892k(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.zu8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m33983J4(Message message) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m33984K3(Message message) {
        message.localCreatedSession = App.f15373i.get().intValue();
        message.localCreatedTime = System.nanoTime();
        CoreModule.f17553k.f91940c.insert(message);
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m33985K4(Message message) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(j);
            messageQuery.localCreatedSession = -App.f15373i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            CoreModule.f17553k.f91940c.updateBy_id(messageQuery);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ Message m33992O3(j760 j760Var) {
        CoreModule.f17545c.m31473E3(((Envelope) j760Var.f116564a).counters);
        return (Message) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m33996Q3() {
        if (CoreModule.f17553k.f91950m.query("fake_conversation_greeting") == null) {
            Conversation conversationNew_ = Conversation.new_();
            conversationNew_.f56011id = "fake_conversation_greeting";
            conversationNew_.latestTime = mqi0.m155944o();
            conversationNew_.createdTime = mqi0.m155944o();
            conversationNew_.localEverHasMessage = true;
            conversationNew_.read = Boolean.TRUE;
            conversationNew_.convType = "default";
            conversationNew_.additional.kankan.greetingSummaryDetail = GreetingSummary.new_();
            CoreModule.f17545c.f19642f0.m33050mq(conversationNew_);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m34000S3() {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_greeting");
        if (NullChecker.m81303a(conversationQuery) && NullChecker.m81303a(conversationQuery.additional) && NullChecker.m81303a(conversationQuery.additional.kankan) && NullChecker.m81303a(conversationQuery.additional.kankan.greetingSummaryDetail) && TextUtils.isEmpty(conversationQuery.additional.kankan.greetingSummaryDetail.latestUserId) && TextUtils.isEmpty(conversationQuery.additional.kankan.greetingSummaryDetail.latestMessageId)) {
            CoreModule.f17545c.f19642f0.m32728Mh("fake_conversation_greeting");
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ Integer m34004U3(Envelope envelope) {
        GreetingCounter greetingCounter = ((CoreData) envelope.getModuleData(CoreData.class)).greetingCounter;
        if (NullChecker.m81303a(greetingCounter)) {
            return Integer.valueOf(greetingCounter.replyThanksRemain);
        }
        return 20;
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ C22306c m34017a4(final String str, final JSONObject jSONObject) {
        return NullChecker.m81303a(jSONObject) ? new la20(new v9j() { // from class: l.qt8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str)).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.rt8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetings.get(0);
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ stc0 m34022c3(String str, boolean z, String str2) {
        String str3;
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
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
        return c20027aAuth.m185898q(C4728a.m31213J0(sb.toString())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22306c m34025d3() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readTime", Converter.dateToApiTimeString(qib0.f154693H.guessedCurrentServerTime()));
        } catch (Exception unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return new la20(new v9j() { // from class: l.su8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greeting-summary")).m185892k(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.tu8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ C22306c m34026d4(Boolean bool) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("doNotDisturb", bool);
        } catch (JSONException unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return ia20.m135117a(new v9j() { // from class: l.ax8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greeting-setting")).m185892k(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.bx8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ JSONArray m34027d5(List list, List list2) throws JSONException {
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
    public static /* synthetic */ stc0 m34034g4(DbLinks dbLinks, String str, String str2) {
        String strM31200G;
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        if (!NullChecker.m81303a(dbLinks) || TextUtils.isEmpty(dbLinks.links.previous)) {
            strM31200G = C4728a.m31200G("/users/me/greetings?since=" + str + "&with=users,messages,kankans,moments" + str2);
        } else {
            strM31200G = C4728a.m31200G("/users/me/greetings?" + dbLinks.links.previous + "&with=users,messages,kankans,moments" + str2);
        }
        return c20027aAuth.m185898q(strM31200G).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m34037i3(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f17553k.f91940c.delete(message._id);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m34040j4(String str, GreetingSummary greetingSummary) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (conversationQuery == null && TextUtils.equals(str, "fake_conversation_anonymous_greeting") && greetingSummary.latestTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        if (NullChecker.m81303a(conversationQuery)) {
            if (greetingSummary.latestTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double d = conversationQuery.latestTime;
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    greetingSummary.latestTime = d;
                }
            }
            double d2 = greetingSummary.latestTime;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                conversationQuery.latestTime = d2;
            }
            conversationQuery.additional.kankan.greetingSummaryDetail = greetingSummary;
            CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
            return;
        }
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56011id = str;
        double d3 = greetingSummary.latestTime;
        conversationNew_.latestTime = d3;
        conversationNew_.createdTime = d3;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.convType = "default";
        conversationNew_.additional.kankan.greetingSummaryDetail = greetingSummary;
        CoreModule.f17545c.f19642f0.m33050mq(conversationNew_);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ C22306c m34043l3(final String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "matched");
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.qw8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str)).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.rw8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetings.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ stc0 m34044l4(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str + "?source=anonymous")).m185892k(utc0.create(Network.JSON, string)).m185883b();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ C22306c m34048n4(final JSONArray jSONArray) {
        return NullChecker.m81303a(jSONArray) ? new la20(new v9j() { // from class: l.zt8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings")).m185892k(utc0.create(Network.JSON, jSONArray.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.bu8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetings;
            }
        }) : C22306c.empty();
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ stc0 m34053q3(String str, String str2, Message message) {
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        StringBuilder sb = new StringBuilder("/greetings/");
        sb.append(str);
        sb.append("/messages");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return c20027aAuth.m185898q(C4728a.m31213J0(sb.toString())).m185893l(utc0.create(Network.JSON, message.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m34055r3(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f17553k.f91940c.delete(message._id);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ stc0 m34058s4(DbLinks dbLinks, String str, String str2) {
        String strM31200G;
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        if (NullChecker.m81303a(dbLinks) && NullChecker.m81303a(dbLinks.links.next)) {
            strM31200G = C4728a.m31200G("/users/me/greetings?" + dbLinks.links.next + "&with=users,messages,kankans,moments&sort=lastMessageTime" + str2);
        } else {
            strM31200G = C4728a.m31200G("/users/me/greetings?until=" + str + "&with=users,messages,kankans,moments&sort=lastMessageTime" + str2);
        }
        return c20027aAuth.m185898q(strM31200G).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m34059t3(Message message) {
        message.localCreatedSession = App.f15373i.get().intValue();
        message.localCreatedTime = System.nanoTime();
        CoreModule.f17553k.f91940c.insert(message);
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m34064v4(Message message, Message message2, Envelope envelope, GreetingResult greetingResult, String str) {
        message.createdTime = message2.createdTime;
        CoreModule.f17553k.f91940c.updateBy_id(message);
        ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
        if (TextUtils.equals(greetingResult.caseValue, GreetingResult.RESULT_CREATE_CONVERSATION) && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).conversations.get(0).f56011id, str)) {
            DbLinks dbLinks = new DbLinks();
            dbLinks.f56011id = str;
            dbLinks.links = new Links();
            CoreModule.f17553k.f91941d.upsert(dbLinks);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ JSONObject m34065w3(String str, String str2) {
        Message message = (Message) vwb.m200346r(CoreModule.f17553k.f91940c.m206059Q(str).m165617j(), new w9j() { // from class: l.sx8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        if (!NullChecker.m81303a(message) || TextUtils.equals(str2, message.f56011id)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readUntil", message.f56011id);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m34071z3(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public C22306c<q860<Message>> m34073A5(final String str, double d, long j, boolean z, final boolean z2) {
        return mkd0.m154984r(CoreModule.f17553k.f91940c.m206058P(str, d, j, z).m165620m(), CoreModule.f17553k.f91941d.uiGet(m34156y5(str)), new x9j() { // from class: l.ou8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new q860((List) obj, (DbLinks) obj2);
            }
        }).doOnNext(new e30() { // from class: l.pu8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151256a.m34103Q5(z2, str, (q860) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A6 */
    public C22306c<Greeting> m34074A6(final String str, final String str2) {
        return this.f72126Q.scheduled("patch/greetings/" + str, -1, new v9j() { // from class: l.xv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str3 = str;
                return C22306c.fromCallable(new Callable() { // from class: l.cx8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4744j.m34065w3(str3, str);
                    }
                }).flatMap(new w9j() { // from class: l.dx8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4744j.m34017a4(str3, (JSONObject) obj);
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public C22306c<Map<String, List<RecommendMessage>>> m34075B5() {
        return this.f20031l0.asObservable();
    }

    /* JADX INFO: renamed from: B6 */
    public C22306c<roj0> m34076B6(final String str, String str2) {
        return scheduled("hide_greeting/" + str2, -1, new v9j() { // from class: l.nx8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.yt8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4744j.m34044l4(str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.ox8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: C5 */
    public C22306c<GreetingPermission> m34077C5(String str) {
        return m34079D5(str, false);
    }

    /* JADX INFO: renamed from: C6 */
    public C22306c<roj0> m34078C6() {
        return this.f72126Q.scheduled("patchGreetingRead", -1, new v9j() { // from class: l.sv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m34025d3();
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public C22306c<GreetingPermission> m34079D5(final String str, final boolean z) {
        return scheduled("greeting-permissions/" + str, 0, new v9j() { // from class: l.cv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lw8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4744j.m33965A4(str, z);
                    }
                }).map(new w9j() { // from class: l.mw8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4744j.m33968C3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public C22306c<roj0> m34080D6(final Boolean bool) {
        return this.f72126Q.scheduled("patchGreetingStatus", -1, new v9j() { // from class: l.nv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m34026d4(bool);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public final void m34081E5(final String str) {
        e51.m114774y(new Runnable() { // from class: l.dw8
            @Override // java.lang.Runnable
            public final void run() {
                this.f88154a.m34104R5(str);
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public C22306c<roj0> m34082E6(String str) {
        return m34084F6(str, false, false);
    }

    /* JADX INFO: renamed from: F5 */
    public void m34083F5(final GreetingSummary greetingSummary, final String str) {
        e51.m114774y(new Runnable() { // from class: l.hu8
            @Override // java.lang.Runnable
            public final void run() {
                this.f109548a.m34105S5(str, greetingSummary);
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public C22306c<roj0> m34084F6(final String str, final boolean z, final boolean z2) {
        return this.f72126Q.scheduled("poll/greetings/" + str + "/messages", 0, new v9j() { // from class: l.xu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194478a.m34127j6(str, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public C22306c<roj0> m34085G5(final String str, final MessageType messageType) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.gv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f104541a.m34106T5(messageType, str);
            }
        }).compose(mkd0.m154951C()));
    }

    /* JADX INFO: renamed from: G6 */
    public C22306c<roj0> m34086G6(String str, boolean z) {
        return m34084F6(str, false, z);
    }

    /* JADX INFO: renamed from: H5 */
    public void m34087H5() {
        e51.m114774y(new Runnable() { // from class: l.gu8
            @Override // java.lang.Runnable
            public final void run() {
                this.f104381a.m34107U5();
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public final C22306c<roj0> m34088H6(final String str) {
        return this.f72126Q.scheduled("greetings/" + str + "/recommend-messages", 0, new v9j() { // from class: l.tv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f172270a.m34131l6(str);
            }
        });
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m34089I5() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.bw8
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32728Mh("fake_conversation_greeting");
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public C22306c<Greeting> m34090I6(final String str) {
        return this.f72126Q.scheduled("greetings/" + str, 0, new v9j() { // from class: l.qu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156453a.m34135n6(str);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m34091J5() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ru8
            @Override // p149l.d30
            public final void call() {
                C4744j.m34000S3();
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public C22306c<roj0> m34092J6() {
        return m34094K6(false);
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ j760 m34093K5(DbLinks dbLinks, Envelope envelope) {
        DbLinks dbLinksNew_ = dbLinks == null ? DbLinks.new_() : dbLinks.mo223809clone();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(coreData.messages)) {
            arrayList.addAll(coreData.messages);
        }
        m34143r6(envelope);
        m34130l5(coreData.greetings, coreData.moments);
        List<Greeting> list = coreData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.m200296J(list)) {
            arrayList2.addAll(list);
        }
        q860<Greeting> q860Var = new q860<>(arrayList2, dbLinksNew_);
        this.f20026g0.m132487l(q860Var);
        return j760.m140076a(q860Var, arrayList);
    }

    /* JADX INFO: renamed from: K6 */
    public C22306c<roj0> m34094K6(final boolean z) {
        return this.f72126Q.scheduled("refreshGreetingSummary", 0, new v9j() { // from class: l.wu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f188095a.m34139p6(z);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ C22306c m34095L5(final DbLinks dbLinks, final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.nw8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m34058s4(dbLinks, str, str2);
            }
        }).map(new w9j() { // from class: l.pw8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151551a.m34093K5(dbLinks, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: L6 */
    public C22306c<GreetingSummary> m34096L6() {
        return this.f20024e0;
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ j760 m34097M5(DbLinks dbLinks, Envelope envelope) {
        DbLinks dbLinksNew_ = dbLinks == null ? DbLinks.new_() : dbLinks.mo223809clone();
        if (!TextUtils.isEmpty(envelope.pagination.links.previous)) {
            dbLinksNew_.links.previous = envelope.pagination.links.previous;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(coreData.messages)) {
            arrayList.addAll(coreData.messages);
        }
        m34143r6(envelope);
        List<Greeting> list = coreData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.m200296J(list)) {
            arrayList2.addAll(list);
        }
        q860<Greeting> q860Var = new q860<>(arrayList2, dbLinksNew_);
        this.f20026g0.m132487l(q860Var);
        return j760.m140076a(q860Var, arrayList);
    }

    /* JADX INFO: renamed from: M6 */
    public C22306c<GreetingSummary> m34098M6() {
        return this.f20023d0;
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C22306c m34099N5(final DbLinks dbLinks, final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.qv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m34034g4(dbLinks, str, str2);
            }
        }).map(new w9j() { // from class: l.rv8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161178a.m34097M5(dbLinks, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: N6 */
    public C22306c<roj0> m34100N6(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.hv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f109628a.m34141q6(notificationStatus, notificationStatus2, str);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ j760 m34101O5(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        m34143r6(envelope);
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(coreData.messages)) {
            arrayList.addAll(coreData.messages);
        }
        List<Greeting> list = coreData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.m200296J(list)) {
            arrayList2.addAll(list);
        }
        return j760.m140076a(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ C22306c m34102P5(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.ov8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/users/me/greetings?until=" + str + "&with=users,messages,kankans,moments&sort=lastMessageTime&source=instant-chat")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.pv8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151427a.m34101O5((Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m34103Q5(boolean z, String str, q860 q860Var) {
        if (vwb.m200296J(q860Var.f153135a) && z) {
            m34082E6(str);
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m34104R5(final String str) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.fv8
            @Override // p149l.d30
            public final void call() {
                C4744j.m33976G3(str);
            }
        });
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m34105S5(final String str, final GreetingSummary greetingSummary) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.iw8
            @Override // p149l.d30
            public final void call() {
                C4744j.m34040j4(str, greetingSummary);
            }
        });
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ roj0 m34106T5(MessageType messageType, String str) throws Exception {
        final Message messageNew_ = Message.new_();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        messageNew_.messageType = messageType;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localNotificationStatus = NotificationStatus.get("removed");
        if (TEnum.equals(messageType, MessageType.local_chat_greeting_tip) || TEnum.equals(messageType, MessageType.local_greeting_match_success)) {
            messageNew_.cid = str;
            messageNew_.localInConversation = true;
            List<T> listM165617j = CoreModule.f17553k.f91940c.m206080l0(str).m165617j();
            if (vwb.m200296J(listM165617j)) {
                messageNew_.createdTime = C4728a.m31263W2();
            } else {
                messageNew_.createdTime = C4728a.m31267X2(((Message) listM165617j.get(0)).createdTime);
            }
        } else {
            messageNew_.localGreetingId = str;
            List<T> listM165617j2 = CoreModule.f17553k.f91940c.m206059Q(str).m165617j();
            if (vwb.m200296J(listM165617j2) || !TEnum.equals(((Message) listM165617j2.get(0)).messageType, "text")) {
                messageNew_.createdTime = C4728a.m31263W2();
            } else {
                messageNew_.createdTime = C4728a.m31267X2(((Message) listM165617j2.get(0)).createdTime);
            }
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kv8
            @Override // p149l.d30
            public final void call() {
                C4744j.m34059t3(messageNew_);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m34107U5() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.yv8
            @Override // p149l.d30
            public final void call() {
                C4744j.m33996Q3();
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m34108V5(Map map, Message message, boolean z, Message message2, Message message3) {
        if (message2.isOtherUser()) {
            Greeting greetingM34154x5 = m34154x5(message2.owner);
            if (NullChecker.m81303a(greetingM34154x5)) {
                Message message4 = (Message) map.get(greetingM34154x5.readUntil);
                if (NullChecker.m81303a(message4) && message4.createdTime >= message2.createdTime) {
                    message2.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        }
        if (NullChecker.m81303a(message3)) {
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
    public final /* synthetic */ void m34109W5(List list, final boolean z) {
        final HashMap map = new HashMap(list.size());
        vwb.m200354z(list, new e30() { // from class: l.jx8
            @Override // p149l.e30
            public final void call(Object obj) {
                Message message = (Message) obj;
                map.put(message.f56011id, message);
            }
        });
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Message message = (Message) it.next();
            CoreModule.f17553k.f91940c.upsert(message, new f30() { // from class: l.lx8
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f130393a.m34108V5(map, message, z, (Message) obj, (Message) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ roj0 m34110X5(final long j) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.wt8
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(j);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Message m34111Y5(final Message message, String str) throws Exception {
        if (message._id != 0) {
            final Message messageMo223809clone = message.mo223809clone();
            messageMo223809clone.localCreatedSession = App.f15373i.get().intValue();
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hx8
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17553k.f91940c.updateBy_id(messageMo223809clone);
                }
            });
            return messageMo223809clone;
        }
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206056N(str).m165617j();
        message.createdTime = !listM165617j.isEmpty() ? C4728a.m31267X2(((Message) listM165617j.get(0)).createdTime) : C4728a.m31263W2();
        message.owner = CoreModule.m29931H().userId();
        message.recalled = Boolean.FALSE;
        message.localNotificationStatus = NotificationStatus.get("removed");
        message.localGreetingId = str;
        message.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        if (TextUtils.isEmpty(message.value)) {
            message.value = "";
        }
        if (vwb.m200296J(message.media)) {
            message.media = new ArrayList();
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.gx8
            @Override // p149l.d30
            public final void call() {
                C4744j.m33984K3(message);
            }
        });
        return message;
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ C22306c m34112Z5(final Message message, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.wv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f188221a.m34111Y5(message, str);
            }
        }).compose(qjd0.m174993e(f20010y0));
    }

    /* JADX INFO: renamed from: a6 */
    public final /* synthetic */ void m34113a6(final Message message, Channel channel, Throwable th) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40041 || i == 40044 || i == 40045 || i == 40046) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ew8
                    @Override // p149l.d30
                    public final void call() {
                        C4744j.m34037i3(message, atomicBoolean);
                    }
                });
                return;
            }
        } else if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isIdCardAuthing() || tantanForbidden.isOtherNotVerify()) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.fw8
                    @Override // p149l.d30
                    public final void call() {
                        C4744j.m34055r3(message, atomicBoolean);
                    }
                });
                return;
            }
            int i2 = tantanForbidden.code;
            if ((i2 == 40337 || i2 == 40046 || i2 == 40399) && (TEnum.equals(channel, Channel.reply_thanks) || TEnum.equals(channel, Channel.red_flower))) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.gw8
                    @Override // p149l.d30
                    public final void call() {
                        C4744j.m33969C4(message, atomicBoolean);
                    }
                });
                return;
            }
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hw8
            @Override // p149l.d30
            public final void call() {
                C4744j.m33985K4(message);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ j760 m34114b6(final Message message, final String str, d30 d30Var, final Envelope envelope) {
        final GreetingResult greetingResult = ((CoreData) envelope.getModuleData(CoreData.class)).greetingResult;
        final Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        message2.localCreatedTime = message.localCreatedTime;
        message2._id = message._id;
        message2.localGreetingId = str;
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.rx8
            @Override // p149l.d30
            public final void call() {
                C4744j.m34064v4(message2, message, envelope, greetingResult, str);
            }
        });
        if (TextUtils.equals(greetingResult.caseValue, GreetingResult.RESULT_CREATE_CONVERSATION) && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        return vwb.m200311Y(envelope, message2);
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ C22306c m34115c6(final String str, final String str2, final Message message, final d30 d30Var, e30 e30Var) {
        return ia20.m135121e(new v9j() { // from class: l.ww8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m34053q3(str, str2, message);
            }
        }).map(new w9j() { // from class: l.xw8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194709a.m34114b6(message, str, d30Var, (Envelope) obj);
            }
        }).doOnError(e30Var).compose(mkd0.m154951C()).map(new w9j() { // from class: l.yw8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4744j.m33992O3((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ C22306c m34116d6(final String str, final String str2, final d30 d30Var, final e30 e30Var, boolean z, final Message message) {
        return scheduled("greetings/" + str + "/messages", -1, new v9j() { // from class: l.uv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f178510a.m34115c6(str, str2, message, d30Var, e30Var);
            }
        }, z);
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ String m34117e6(String str, boolean z) throws Exception {
        DbLinks dbLinks = (DbLinks) CoreModule.f17553k.f91941d.query(m34156y5(str));
        if (!NullChecker.m81303a(dbLinks) || TextUtils.isEmpty(dbLinks.links.previous) || z) {
            return C4728a.m31213J0("/greetings/" + str + "/messages?with=moments");
        }
        String str2 = dbLinks.links.previous;
        return C4728a.m31213J0("/greetings/" + str + "/messages?" + dbLinks.links.previous + "&with=moments");
    }

    /* JADX INFO: renamed from: f5 */
    public C22306c<Greeting> m34118f5(final String str) {
        return this.f72126Q.scheduled("patch/greetings/" + str + "/match/agree", -1, new v9j() { // from class: l.vv8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m34043l3(str);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ void m34119f6(String str, Map map, boolean z, Message message, Message message2) {
        if (message.isOtherUser()) {
            Greeting greetingM34154x5 = m34154x5(str);
            if (NullChecker.m81303a(greetingM34154x5)) {
                Message message3 = (Message) map.get(greetingM34154x5.readUntil);
                if (NullChecker.m81303a(message3) && message3.createdTime >= message.createdTime) {
                    message.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        }
        if (NullChecker.m81303a(message2)) {
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
    public C22306c<List<Greeting>> m34120g5(final List<String> list, final List<String> list2) {
        return this.f72126Q.scheduled("patch/greetings/batchPatchGreetingUnread", -1, new v9j() { // from class: l.mx8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.st8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4744j.m34027d5(list, list);
                    }
                }).flatMap(new w9j() { // from class: l.tt8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4744j.m34048n4((JSONArray) obj);
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ void m34121g6(Envelope envelope, final String str, final boolean z) {
        if (!TextUtils.isEmpty(envelope.pagination.links.previous)) {
            DbLinks dbLinksNew_ = (DbLinks) CoreModule.f17553k.f91941d.query(m34156y5(str));
            if (dbLinksNew_ == null) {
                dbLinksNew_ = DbLinks.new_();
                dbLinksNew_.f56011id = m34156y5(str);
            }
            dbLinksNew_.links.previous = envelope.pagination.links.previous;
            CoreModule.f17553k.f91941d.upsert(dbLinksNew_);
        }
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (vwb.m200296J(list)) {
            return;
        }
        final HashMap map = new HashMap(list.size());
        vwb.m200354z(list, new e30() { // from class: l.ut8
            @Override // p149l.e30
            public final void call(Object obj) {
                Message message = (Message) obj;
                map.put(message.f56011id, message);
            }
        });
        for (Message message : list) {
            message.localGreetingId = str;
            CoreModule.f17553k.f91940c.upsert(message, new f30() { // from class: l.vt8
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f182908a.m34119f6(str, map, z, (Message) obj, (Message) obj2);
                }
            });
        }
        list.clear();
    }

    /* JADX INFO: renamed from: h5 */
    public void m34122h5() {
        m34081E5("fake_conversation_anonymous_greeting");
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m34123h6(final String str, final boolean z, final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ux8
            @Override // p149l.d30
            public final void call() {
                this.f178710a.m34121g6(envelope, str, z);
            }
        });
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: i5 */
    public void m34124i5() {
        m34081E5("fake_conversation_greeting");
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ C22306c m34125i6(final String str, final boolean z, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.sw8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str2).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.tw8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172376a.m34123h6(str, z, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.uw8
            @Override // p149l.e30
            public final void call(Object obj) {
                C4744j.m34071z3((Throwable) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.vw8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public C22306c<roj0> m34126j5(final String str, String str2) {
        return scheduled("delete_greeting/" + str2, -1, new v9j() { // from class: l.px8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.xt8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str)).m185885d().m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.qx8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ C22306c m34127j6(final String str, final boolean z, final boolean z2) {
        return C22306c.fromCallable(new Callable() { // from class: l.lv8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f130144a.m34117e6(str, z);
            }
        }).flatMap(new w9j() { // from class: l.mv8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f135886a.m34125i6(str, z2, (String) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: k5 */
    public void m34128k5() {
        e51.m114774y(new Runnable() { // from class: l.bv8
            @Override // java.lang.Runnable
            public final void run() {
                this.f77409a.m34089I5();
            }
        });
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ roj0 m34129k6(String str, Envelope envelope) {
        m34157y6(str, ((CoreData) envelope.getModuleData(CoreData.class)).recommendMessages);
        m34155x6(str, ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos);
        return roj0.f160388a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l5 */
    public final void m34130l5(List<Greeting> list, List<CoreMomentInfo> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list2)) {
            Iterator<CoreMomentInfo> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f56008id);
            }
        }
        if (vwb.m200296J(list)) {
            return;
        }
        for (final Greeting greeting : list) {
            if (!arrayList.contains(greeting.f20401id)) {
                f8c.m119878o().m119881B(new d30() { // from class: l.ix8
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.m29934N().mo60394u9(greeting.f20401id);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public final /* synthetic */ C22306c m34131l6(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.ex8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str + "/recommend-messages?with=gifts")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.fx8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99738a.m34129k6(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public void m34132m5() {
        e51.m114774y(new Runnable() { // from class: l.pt8
            @Override // java.lang.Runnable
            public final void run() {
                this.f151124a.m34091J5();
            }
        });
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ Greeting m34133m6(Envelope envelope) {
        List<Greeting> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetings;
        if (vwb.m200296J(list)) {
            return null;
        }
        m34143r6(envelope);
        m34130l5(list, ((CoreData) envelope.getModuleData(CoreData.class)).moments);
        this.f20035p0.m132487l(list.get(0));
        return list.get(0);
    }

    /* JADX INFO: renamed from: n5 */
    public C22306c<Boolean> m34134n5() {
        return scheduled("/users/me/greeting-setting/", 0, new v9j() { // from class: l.lu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.iv8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greeting-setting")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.jv8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetingSetting.doNotDisturb);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ C22306c m34135n6(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.jw8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str + "?with=kankans,moments,users")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.kw8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124940a.m34133m6((Envelope) obj);
            }
        }).compose(mkd0.m154991y());
    }

    /* JADX INFO: renamed from: o5 */
    public C22306c<Greeting> m34136o5(String str) {
        Greeting greetingM34154x5 = m34154x5(str);
        return NullChecker.m81303a(greetingM34154x5) ? C22306c.just(greetingM34154x5) : m34090I6(str);
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ roj0 m34137o6(boolean z, Envelope envelope) {
        this.f20023d0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).greetingSummary);
        GreetingSummary greetingSummaryNew_ = ((CoreData) envelope.getModuleData(CoreData.class)).anonymousSummary;
        if (greetingSummaryNew_ == null) {
            greetingSummaryNew_ = GreetingSummary.new_();
        }
        this.f20024e0.m132487l(greetingSummaryNew_);
        m34145s6(envelope, z);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: p5 */
    public C22306c<GreetingHotLevelInfo> m34138p5(String str, boolean z) {
        return m34140q5(str, z, "");
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ C22306c m34139p6(final boolean z) {
        return new la20(new v9j() { // from class: l.uu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greeting-summary?source=anonymous&with=users,messages")).m185883b();
            }
        }).map(new w9j() { // from class: l.vu8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183038a.m34137o6(z, (Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: q5 */
    public C22306c<GreetingHotLevelInfo> m34140q5(final String str, final boolean z, final String str2) {
        return scheduled("getGreetingHotLevelInfo/" + str, 0, new v9j() { // from class: l.kx8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.dv8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4744j.m34022c3(str, z, str);
                    }
                }).map(new w9j() { // from class: l.ev8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetingHotLevelInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ roj0 m34141q6(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.nu8
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.m206089u0(notificationStatus, notificationStatus2, str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: r5 */
    public C22306c<j760<q860<Greeting>, List<Message>>> m34142r5(final String str, final DbLinks dbLinks, final String str2) {
        return scheduled("kankan/reply/greeting/" + str2, 0, new v9j() { // from class: l.av8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71918a.m34095L5(dbLinks, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public final void m34143r6(Envelope envelope) {
        m34145s6(envelope, false);
    }

    /* JADX INFO: renamed from: s5 */
    public C22306c<List<RecommendMessage>> m34144s5(final String str) {
        return scheduled("greeting-ecommend-messages/" + str, 0, new v9j() { // from class: l.ow8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.ju8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greetings/" + str + "/recommend-messages?with=gifts")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.ku8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).recommendMessages;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final void m34145s6(Envelope envelope, final boolean z) {
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (vwb.m200296J(list)) {
            this.f72126Q.m31492w3(envelope, null);
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.cw8
            @Override // p149l.d30
            public final void call() {
                this.f82757a.m34109W5(arrayList, z);
            }
        });
        list.clear();
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: t5 */
    public C22306c<j760<q860<Greeting>, List<Message>>> m34146t5(final String str, final DbLinks dbLinks, final String str2) {
        return scheduled("kankan/reply/greeting/push", 0, new v9j() { // from class: l.mu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135760a.m34099N5(dbLinks, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public C22306c<roj0> m34147t6(final long j) {
        return this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.tx8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f172490a.m34110X5(j);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: u5 */
    public C22306c<j760<List<Greeting>, List<Message>>> m34148u5(final String str) {
        return scheduled("kankan/reply/greeting/instant-chat", 0, new v9j() { // from class: l.iu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114978a.m34102P5(str);
            }
        });
    }

    /* JADX INFO: renamed from: u6 */
    public C22306c<Message> m34149u6(String str, Channel channel, Message message, String str2, d30 d30Var) {
        return m34151v6(str, channel, message, str2, d30Var, true);
    }

    /* JADX INFO: renamed from: v5 */
    public C22306c<j760<String, RelationshipStatus>> m34150v5() {
        return this.f20027h0.asObservable();
    }

    /* JADX INFO: renamed from: v6 */
    public C22306c<Message> m34151v6(final String str, final Channel channel, final Message message, String str2, final d30 d30Var, final boolean z) {
        String str3;
        Channel channel2 = (channel == null || TEnum.equals(channel, Channel.get("unknown_"))) ? Channel.get("moment") : channel;
        if (TextUtils.isEmpty(str2)) {
            str3 = "?channel=" + channel2.toString();
        } else {
            str3 = str2 + "&channel=" + channel2.toString();
        }
        String strM184474t3 = this.f72126Q.f19658k1.m184474t3(str);
        if (!TextUtils.isEmpty(strM184474t3)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "?picksTracker=" + strM184474t3;
            } else {
                str3 = str3 + "&picksTracker=" + strM184474t3;
            }
        }
        final String str4 = str3;
        v9j v9jVar = new v9j() { // from class: l.vx8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f183429a.m34112Z5(message, str);
            }
        };
        final e30 e30Var = new e30() { // from class: l.au8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71732a.m34113a6(message, channel, (Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.cu8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82533a.m34116d6(str, str4, d30Var, e30Var, z, (Message) obj);
            }
        };
        return this.f72126Q.now(null, ((C22306c) v9jVar.call()).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.du8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return (C22306c) w9jVar.call((Message) obj);
            }
        }).doOnNext(new e30() { // from class: l.eu8
            @Override // p149l.e30
            public final void call(Object obj) {
                C4744j.m33983J4((Message) obj);
            }
        }), z);
    }

    /* JADX INFO: renamed from: w5 */
    public C22306c<Integer> m34152w5() {
        return scheduled("me/greeting-counter", 0, new v9j() { // from class: l.fu8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.zv8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/greeting-counter?query=replyThanks")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.aw8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4744j.m34004U3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public C22306c<List<Message>> m34153w6(String str) {
        return CoreModule.f17553k.f91940c.m206054L(str).m165620m();
    }

    /* JADX INFO: renamed from: x5 */
    public Greeting m34154x5(String str) {
        q860<Greeting> q860VarM221515e = this.f20026g0.m221515e();
        if (!NullChecker.m81303a(q860VarM221515e) || vwb.m200296J(q860VarM221515e.f153135a)) {
            return null;
        }
        for (Greeting greeting : q860VarM221515e.f153135a) {
            if (TextUtils.equals(str, greeting.f20401id)) {
                return greeting;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m34155x6(String str, List<CoreGiftInfo> list) {
        boolean zM200296J = vwb.m200296J(list);
        C22392a<j760<String, CoreGiftInfo>> c22392a = this.f20032m0;
        if (zM200296J) {
            c22392a.m132487l(null);
        } else {
            c22392a.m132487l(j760.m140076a(str, list.get(0)));
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final String m34156y5(String str) {
        return "greeting/v3/" + str + "/messages";
    }

    /* JADX INFO: renamed from: y6 */
    public final void m34157y6(String str, List<RecommendMessage> list) {
        Map<String, List<RecommendMessage>> mapM221515e = this.f20031l0.m221515e();
        if (vwb.m200296J(list)) {
            mapM221515e.remove(str);
        } else {
            mapM221515e.put(str, list);
        }
        this.f20031l0.m132487l(mapM221515e);
    }

    /* JADX INFO: renamed from: z5 */
    public C22306c<q860<Message>> m34158z5(String str, double d, long j, boolean z) {
        return m34073A5(str, d, j, z, true);
    }

    /* JADX INFO: renamed from: z6 */
    public C22306c<roj0> m34159z6() {
        return this.f72126Q.scheduled("patchAnonymousGreetingRead", -1, new v9j() { // from class: l.zw8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4744j.m33977G4();
            }
        });
    }
}
