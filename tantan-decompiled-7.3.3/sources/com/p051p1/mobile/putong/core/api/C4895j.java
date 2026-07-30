package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4895j;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.GreetingCounter;
import com.p051p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p051p1.mobile.putong.core.data.GreetingPermission;
import com.p051p1.mobile.putong.core.data.GreetingResult;
import com.p051p1.mobile.putong.core.data.GreetingSummary;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.byd0;
import p153l.dy6;
import p153l.f2e0;
import p153l.fo0;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.l9c;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.rcj;
import p153l.ti20;
import p153l.trd0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.x1d0;
import p153l.x20;
import p153l.y20;
import p153l.z1d0;
import p153l.z20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.j */
/* JADX INFO: loaded from: classes9.dex */
public class C4895j extends dy6 {

    /* JADX INFO: renamed from: y0 */
    public static f2e0 f20752y0 = Schedulers.from(Executors.newSingleThreadScheduledExecutor());

    /* JADX INFO: renamed from: R */
    public jxd0 f20753R;

    /* JADX INFO: renamed from: S */
    public byd0 f20754S;

    /* JADX INFO: renamed from: T */
    public jxd0 f20755T;

    /* JADX INFO: renamed from: U */
    public jxd0 f20756U;

    /* JADX INFO: renamed from: V */
    public jxd0 f20757V;

    /* JADX INFO: renamed from: W */
    public jxd0 f20758W;

    /* JADX INFO: renamed from: X */
    public jxd0 f20759X;

    /* JADX INFO: renamed from: Y */
    public jxd0 f20760Y;

    /* JADX INFO: renamed from: Z */
    public jxd0 f20761Z;

    /* JADX INFO: renamed from: a0 */
    public jxd0 f20762a0;

    /* JADX INFO: renamed from: b0 */
    public jxd0 f20763b0;

    /* JADX INFO: renamed from: c0 */
    public jxd0 f20764c0;

    /* JADX INFO: renamed from: d0 */
    public C22507a<GreetingSummary> f20765d0;

    /* JADX INFO: renamed from: e0 */
    public C22507a<GreetingSummary> f20766e0;

    /* JADX INFO: renamed from: f0 */
    public C22507a<GreetingCounter> f20767f0;

    /* JADX INFO: renamed from: g0 */
    public C22507a<vg60<Greeting>> f20768g0;

    /* JADX INFO: renamed from: h0 */
    public final C22508b<pf60<String, RelationshipStatus>> f20769h0;

    /* JADX INFO: renamed from: i0 */
    public final C22508b<String> f20770i0;

    /* JADX INFO: renamed from: j0 */
    public final C22508b<String> f20771j0;

    /* JADX INFO: renamed from: k0 */
    public String f20772k0;

    /* JADX INFO: renamed from: l0 */
    public final C22507a<Map<String, List<RecommendMessage>>> f20773l0;

    /* JADX INFO: renamed from: m0 */
    public final C22507a<pf60<String, CoreGiftInfo>> f20774m0;

    /* JADX INFO: renamed from: n0 */
    public C22508b<Greeting> f20775n0;

    /* JADX INFO: renamed from: o0 */
    public C22508b<Greeting> f20776o0;

    /* JADX INFO: renamed from: p0 */
    public C22508b<Greeting> f20777p0;

    /* JADX INFO: renamed from: q0 */
    public C22508b<Boolean> f20778q0;

    /* JADX INFO: renamed from: r0 */
    public C22508b<String> f20779r0;

    /* JADX INFO: renamed from: s0 */
    public C22507a<String> f20780s0;

    /* JADX INFO: renamed from: t0 */
    public Set<String> f20781t0;

    /* JADX INFO: renamed from: u0 */
    public Set<String> f20782u0;

    /* JADX INFO: renamed from: v0 */
    public byd0 f20783v0;

    /* JADX INFO: renamed from: w0 */
    public byd0 f20784w0;

    /* JADX INFO: renamed from: x0 */
    public byd0 f20785x0;

    public C4895j(C4883c c4883c) {
        super(c4883c);
        String str = "has_show_dynamic_greet_guide_bubble_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20753R = new jxd0(str, bool);
        this.f20754S = new byd0("last_timestamp_show_greeting_counter_remaining_" + CoreModule.m30929H().userId(), 0L);
        this.f20755T = new jxd0("has_show_kankan_card_greet_guide_bubble_" + CoreModule.m30929H().userId(), bool);
        this.f20756U = new jxd0("HASSHOWSTATECARDGREETGUIDEBUBBLE" + CoreModule.m30929H().userId(), bool);
        this.f20757V = new jxd0("has_show_immersion_video_avatar_guide_bubble_" + CoreModule.m30929H().userId(), bool);
        this.f20758W = new jxd0("has_show_immersion_video_greeting_guide_bubble_" + CoreModule.m30929H().userId(), bool);
        this.f20759X = new jxd0("has_immersion_video_posted_" + CoreModule.m30929H().userId(), bool);
        this.f20760Y = new jxd0("has_show_immersion_video_scroll_guide_bubble_" + CoreModule.m30929H().userId(), bool);
        this.f20761Z = new jxd0("has_show_immersion_video_scroll_guide_bubble_follow_" + CoreModule.m30929H().userId(), bool);
        this.f20762a0 = new jxd0("has_show_immersion_video_scroll_guide_bubble_flow" + CoreModule.m30929H().userId(), bool);
        this.f20763b0 = new jxd0("has_show_immersion_video_greet_hello_guide_" + CoreModule.m30929H().userId(), bool);
        this.f20764c0 = new jxd0("show_greet_first_guide_" + CoreModule.m30929H().userId(), bool);
        this.f20765d0 = C22507a.m222758b();
        this.f20766e0 = C22507a.m222758b();
        this.f20767f0 = C22507a.m222758b();
        this.f20768g0 = C22507a.m222758b();
        this.f20769h0 = C22508b.m222767b();
        this.f20770i0 = C22508b.m222767b();
        this.f20771j0 = C22508b.m222767b();
        this.f20772k0 = "";
        this.f20773l0 = C22507a.m222759c(new HashMap());
        this.f20774m0 = C22507a.m222758b();
        this.f20775n0 = C22508b.m222767b();
        this.f20776o0 = C22508b.m222767b();
        this.f20777p0 = C22508b.m222767b();
        this.f20778q0 = C22508b.m222767b();
        this.f20779r0 = C22508b.m222767b();
        this.f20780s0 = C22507a.m222758b();
        this.f20781t0 = new HashSet(3);
        this.f20782u0 = new HashSet(3);
        this.f20783v0 = new byd0("say_hi_button_style1_anim_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20784w0 = new byd0("say_hi_button_style2_anim_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20785x0 = new byd0("say_hi_button_in_profile_anim_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ x1d0 m34968A4(String str, boolean z) {
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        StringBuilder sb = new StringBuilder("/greeting-permissions/");
        sb.append(str);
        sb.append(z ? "?source=moment" : "");
        return c21228aAuth.m209043q(C4879a.m32216J0(sb.toString())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ GreetingPermission m34971C3(Envelope envelope) {
        List<GreetingPermission> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetingPermissions;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m34972C4(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f18272k.f115535c.delete(message._id);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ void m34979G3(String str) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.additional.kankan.greetingSummaryDetail.unseen = 0;
            CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ C22421c m34980G4() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readTime", Converter.dateToApiTimeString(uqb0.f180376H.guessedCurrentServerTime()));
            jSONObject.put("source", "anonymous");
        } catch (Exception unused) {
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, jSONObject.toString());
        return new ti20(new pcj() { // from class: l.gw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greeting-summary")).m209037k(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.hw8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m34986J4(Message message) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m34987K3(Message message) {
        message.localCreatedSession = App.f16092i.get().intValue();
        message.localCreatedTime = System.nanoTime();
        CoreModule.f18272k.f115535c.insert(message);
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m34988K4(Message message) {
        long j = message._id;
        if (j != 0) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(j);
            messageQuery.localCreatedSession = -App.f16092i.get().intValue();
            messageQuery.localNotificationStatus = NotificationStatus.get("pending");
            CoreModule.f18272k.f115535c.updateBy_id(messageQuery);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ Message m34995O3(pf60 pf60Var) {
        CoreModule.f18264c.m32476E3(((Envelope) pf60Var.f152156a).counters);
        return (Message) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m34999Q3() {
        if (CoreModule.f18272k.f115545m.query("fake_conversation_greeting") == null) {
            Conversation conversationNew_ = Conversation.new_();
            conversationNew_.f56859id = "fake_conversation_greeting";
            conversationNew_.latestTime = pzi0.m174454o();
            conversationNew_.createdTime = pzi0.m174454o();
            conversationNew_.localEverHasMessage = true;
            conversationNew_.read = Boolean.TRUE;
            conversationNew_.convType = "default";
            conversationNew_.additional.kankan.greetingSummaryDetail = GreetingSummary.new_();
            CoreModule.f18264c.f20384f0.m34053mq(conversationNew_);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m35003S3() {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_greeting");
        if (NullChecker.m82486a(conversationQuery) && NullChecker.m82486a(conversationQuery.additional) && NullChecker.m82486a(conversationQuery.additional.kankan) && NullChecker.m82486a(conversationQuery.additional.kankan.greetingSummaryDetail) && TextUtils.isEmpty(conversationQuery.additional.kankan.greetingSummaryDetail.latestUserId) && TextUtils.isEmpty(conversationQuery.additional.kankan.greetingSummaryDetail.latestMessageId)) {
            CoreModule.f18264c.f20384f0.m33731Mh("fake_conversation_greeting");
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ Integer m35007U3(Envelope envelope) {
        GreetingCounter greetingCounter = ((CoreData) envelope.getModuleData(CoreData.class)).greetingCounter;
        if (NullChecker.m82486a(greetingCounter)) {
            return Integer.valueOf(greetingCounter.replyThanksRemain);
        }
        return 20;
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ C22421c m35020a4(final String str, final JSONObject jSONObject) {
        return NullChecker.m82486a(jSONObject) ? new ti20(new pcj() { // from class: l.yu8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str)).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.zu8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetings.get(0);
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ x1d0 m35025c3(String str, boolean z, String str2) {
        String str3;
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
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
        return c21228aAuth.m209043q(C4879a.m32216J0(sb.toString())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22421c m35028d3() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readTime", Converter.dateToApiTimeString(uqb0.f180376H.guessedCurrentServerTime()));
        } catch (Exception unused) {
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, jSONObject.toString());
        return new ti20(new pcj() { // from class: l.aw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greeting-summary")).m209037k(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.bw8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ C22421c m35029d4(Boolean bool) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("doNotDisturb", bool);
        } catch (JSONException unused) {
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, jSONObject.toString());
        return qi20.m176654a(new pcj() { // from class: l.iy8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greeting-setting")).m209037k(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.jy8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ JSONArray m35030d5(List list, List list2) throws JSONException {
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
    public static /* synthetic */ x1d0 m35037g4(DbLinks dbLinks, String str, String str2) {
        String strM32203G;
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        if (!NullChecker.m82486a(dbLinks) || TextUtils.isEmpty(dbLinks.links.previous)) {
            strM32203G = C4879a.m32203G("/users/me/greetings?since=" + str + "&with=users,messages,kankans,moments" + str2);
        } else {
            strM32203G = C4879a.m32203G("/users/me/greetings?" + dbLinks.links.previous + "&with=users,messages,kankans,moments" + str2);
        }
        return c21228aAuth.m209043q(strM32203G).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m35040i3(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f18272k.f115535c.delete(message._id);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m35043j4(String str, GreetingSummary greetingSummary) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (conversationQuery == null && TextUtils.equals(str, "fake_conversation_anonymous_greeting") && greetingSummary.latestTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        if (NullChecker.m82486a(conversationQuery)) {
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
            CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
            return;
        }
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56859id = str;
        double d3 = greetingSummary.latestTime;
        conversationNew_.latestTime = d3;
        conversationNew_.createdTime = d3;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.convType = "default";
        conversationNew_.additional.kankan.greetingSummaryDetail = greetingSummary;
        CoreModule.f18264c.f20384f0.m34053mq(conversationNew_);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ C22421c m35046l3(final String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "matched");
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.yx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str)).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.zx8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetings.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ x1d0 m35047l4(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "hidden");
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = WeJson.EMPTY_MAP;
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str + "?source=anonymous")).m209037k(z1d0.create(Network.JSON, string)).m209028b();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ C22421c m35051n4(final JSONArray jSONArray) {
        return NullChecker.m82486a(jSONArray) ? new ti20(new pcj() { // from class: l.hv8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings")).m209037k(z1d0.create(Network.JSON, jSONArray.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.jv8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetings;
            }
        }) : C22421c.empty();
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ x1d0 m35056q3(String str, String str2, Message message) {
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        StringBuilder sb = new StringBuilder("/greetings/");
        sb.append(str);
        sb.append("/messages");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return c21228aAuth.m209043q(C4879a.m32216J0(sb.toString())).m209038l(z1d0.create(Network.JSON, message.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m35058r3(Message message, AtomicBoolean atomicBoolean) {
        if (message._id != 0) {
            atomicBoolean.set(true);
            CoreModule.f18272k.f115535c.delete(message._id);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ x1d0 m35061s4(DbLinks dbLinks, String str, String str2) {
        String strM32203G;
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        if (NullChecker.m82486a(dbLinks) && NullChecker.m82486a(dbLinks.links.next)) {
            strM32203G = C4879a.m32203G("/users/me/greetings?" + dbLinks.links.next + "&with=users,messages,kankans,moments&sort=lastMessageTime" + str2);
        } else {
            strM32203G = C4879a.m32203G("/users/me/greetings?until=" + str + "&with=users,messages,kankans,moments&sort=lastMessageTime" + str2);
        }
        return c21228aAuth.m209043q(strM32203G).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m35062t3(Message message) {
        message.localCreatedSession = App.f16092i.get().intValue();
        message.localCreatedTime = System.nanoTime();
        CoreModule.f18272k.f115535c.insert(message);
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m35067v4(Message message, Message message2, Envelope envelope, GreetingResult greetingResult, String str) {
        message.createdTime = message2.createdTime;
        CoreModule.f18272k.f115535c.updateBy_id(message);
        ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
        if (TextUtils.equals(greetingResult.caseValue, GreetingResult.RESULT_CREATE_CONVERSATION) && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations) && TextUtils.equals(((CoreData) envelope.getModuleData(CoreData.class)).conversations.get(0).f56859id, str)) {
            DbLinks dbLinks = new DbLinks();
            dbLinks.f56859id = str;
            dbLinks.links = new Links();
            CoreModule.f18272k.f115536d.upsert(dbLinks);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ JSONObject m35068w3(String str, String str2) {
        Message message = (Message) jyb.m147529r(CoreModule.f18272k.f115535c.m189455Q(str).m208674j(), new qcj() { // from class: l.az8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).status(), "normal"));
            }
        });
        if (!NullChecker.m82486a(message) || TextUtils.equals(str2, message.f56859id)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("readUntil", message.f56859id);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m35074z3(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public C22421c<vg60<Message>> m35076A5(final String str, double d, long j, boolean z, final boolean z2) {
        return psd0.m173625r(CoreModule.f18272k.f115535c.m189454P(str, d, j, z).m208677m(), CoreModule.f18272k.f115536d.uiGet(m35159y5(str)), new rcj() { // from class: l.wv8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new vg60((List) obj, (DbLinks) obj2);
            }
        }).doOnNext(new y20() { // from class: l.xv8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196357a.m35106Q5(z2, str, (vg60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A6 */
    public C22421c<Greeting> m35077A6(final String str, final String str2) {
        return this.f91137Q.scheduled("patch/greetings/" + str, -1, new pcj() { // from class: l.fx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str3 = str;
                return C22421c.fromCallable(new Callable() { // from class: l.ky8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4895j.m35068w3(str3, str);
                    }
                }).flatMap(new qcj() { // from class: l.ly8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4895j.m35020a4(str3, (JSONObject) obj);
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public C22421c<Map<String, List<RecommendMessage>>> m35078B5() {
        return this.f20773l0.asObservable();
    }

    /* JADX INFO: renamed from: B6 */
    public C22421c<uxj0> m35079B6(final String str, String str2) {
        return scheduled("hide_greeting/" + str2, -1, new pcj() { // from class: l.vy8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.gv8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4895j.m35047l4(str);
                    }
                });
            }
        }).map(new qcj() { // from class: l.wy8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: C5 */
    public C22421c<GreetingPermission> m35080C5(String str) {
        return m35082D5(str, false);
    }

    /* JADX INFO: renamed from: C6 */
    public C22421c<uxj0> m35081C6() {
        return this.f91137Q.scheduled("patchGreetingRead", -1, new pcj() { // from class: l.ax8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m35028d3();
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public C22421c<GreetingPermission> m35082D5(final String str, final boolean z) {
        return scheduled("greeting-permissions/" + str, 0, new pcj() { // from class: l.kw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.tx8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4895j.m34968A4(str, z);
                    }
                }).map(new qcj() { // from class: l.ux8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4895j.m34971C3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public C22421c<uxj0> m35083D6(final Boolean bool) {
        return this.f91137Q.scheduled("patchGreetingStatus", -1, new pcj() { // from class: l.vw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m35029d4(bool);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public final void m35084E5(final String str) {
        l51.m152919y(new Runnable() { // from class: l.lx8
            @Override // java.lang.Runnable
            public final void run() {
                this.f133910a.m35107R5(str);
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public C22421c<uxj0> m35085E6(String str) {
        return m35087F6(str, false, false);
    }

    /* JADX INFO: renamed from: F5 */
    public void m35086F5(final GreetingSummary greetingSummary, final String str) {
        l51.m152919y(new Runnable() { // from class: l.pv8
            @Override // java.lang.Runnable
            public final void run() {
                this.f154276a.m35108S5(str, greetingSummary);
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public C22421c<uxj0> m35087F6(final String str, final boolean z, final boolean z2) {
        return this.f91137Q.scheduled("poll/greetings/" + str + "/messages", 0, new pcj() { // from class: l.fw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f101134a.m35130j6(str, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public C22421c<uxj0> m35088G5(final String str, final MessageType messageType) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.ow8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f149459a.m35109T5(messageType, str);
            }
        }).compose(psd0.m173592C()));
    }

    /* JADX INFO: renamed from: G6 */
    public C22421c<uxj0> m35089G6(String str, boolean z) {
        return m35087F6(str, false, z);
    }

    /* JADX INFO: renamed from: H5 */
    public void m35090H5() {
        l51.m152919y(new Runnable() { // from class: l.ov8
            @Override // java.lang.Runnable
            public final void run() {
                this.f149238a.m35110U5();
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public final C22421c<uxj0> m35091H6(final String str) {
        return this.f91137Q.scheduled("greetings/" + str + "/recommend-messages", 0, new pcj() { // from class: l.bx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78848a.m35134l6(str);
            }
        });
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m35092I5() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.jx8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33731Mh("fake_conversation_greeting");
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public C22421c<Greeting> m35093I6(final String str) {
        return this.f91137Q.scheduled("greetings/" + str, 0, new pcj() { // from class: l.yv8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201684a.m35138n6(str);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m35094J5() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.zv8
            @Override // p153l.x20
            public final void call() {
                C4895j.m35003S3();
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public C22421c<uxj0> m35095J6() {
        return m35097K6(false);
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ pf60 m35096K5(DbLinks dbLinks, Envelope envelope) {
        DbLinks dbLinksNew_ = dbLinks == null ? DbLinks.new_() : dbLinks.mo225055clone();
        if (!TextUtils.isEmpty(envelope.pagination.links.next)) {
            dbLinksNew_.links.next = envelope.pagination.links.next;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(coreData.messages)) {
            arrayList.addAll(coreData.messages);
        }
        m35146r6(envelope);
        m35133l5(coreData.greetings, coreData.moments);
        List<Greeting> list = coreData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!jyb.m147479J(list)) {
            arrayList2.addAll(list);
        }
        vg60<Greeting> vg60Var = new vg60<>(arrayList2, dbLinksNew_);
        this.f20768g0.m137019l(vg60Var);
        return pf60.m172085a(vg60Var, arrayList);
    }

    /* JADX INFO: renamed from: K6 */
    public C22421c<uxj0> m35097K6(final boolean z) {
        return this.f91137Q.scheduled("refreshGreetingSummary", 0, new pcj() { // from class: l.ew8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96095a.m35142p6(z);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ C22421c m35098L5(final DbLinks dbLinks, final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.vx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m35061s4(dbLinks, str, str2);
            }
        }).map(new qcj() { // from class: l.xx8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196615a.m35096K5(dbLinks, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: L6 */
    public C22421c<GreetingSummary> m35099L6() {
        return this.f20766e0;
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ pf60 m35100M5(DbLinks dbLinks, Envelope envelope) {
        DbLinks dbLinksNew_ = dbLinks == null ? DbLinks.new_() : dbLinks.mo225055clone();
        if (!TextUtils.isEmpty(envelope.pagination.links.previous)) {
            dbLinksNew_.links.previous = envelope.pagination.links.previous;
        }
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(coreData.messages)) {
            arrayList.addAll(coreData.messages);
        }
        m35146r6(envelope);
        List<Greeting> list = coreData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!jyb.m147479J(list)) {
            arrayList2.addAll(list);
        }
        vg60<Greeting> vg60Var = new vg60<>(arrayList2, dbLinksNew_);
        this.f20768g0.m137019l(vg60Var);
        return pf60.m172085a(vg60Var, arrayList);
    }

    /* JADX INFO: renamed from: M6 */
    public C22421c<GreetingSummary> m35101M6() {
        return this.f20765d0;
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C22421c m35102N5(final DbLinks dbLinks, final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.yw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m35037g4(dbLinks, str, str2);
            }
        }).map(new qcj() { // from class: l.zw8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206325a.m35100M5(dbLinks, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: N6 */
    public C22421c<uxj0> m35103N6(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.pw8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f154380a.m35144q6(notificationStatus, notificationStatus2, str);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ pf60 m35104O5(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        m35146r6(envelope);
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(coreData.messages)) {
            arrayList.addAll(coreData.messages);
        }
        List<Greeting> list = coreData.greetings;
        ArrayList arrayList2 = new ArrayList();
        if (!jyb.m147479J(list)) {
            arrayList2.addAll(list);
        }
        return pf60.m172085a(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ C22421c m35105P5(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.ww8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/users/me/greetings?until=" + str + "&with=users,messages,kankans,moments&sort=lastMessageTime&source=instant-chat")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.xw8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196472a.m35104O5((Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m35106Q5(boolean z, String str, vg60 vg60Var) {
        if (jyb.m147479J(vg60Var.f184001a) && z) {
            m35085E6(str);
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m35107R5(final String str) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.nw8
            @Override // p153l.x20
            public final void call() {
                C4895j.m34979G3(str);
            }
        });
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m35108S5(final String str, final GreetingSummary greetingSummary) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.qx8
            @Override // p153l.x20
            public final void call() {
                C4895j.m35043j4(str, greetingSummary);
            }
        });
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ uxj0 m35109T5(MessageType messageType, String str) throws Exception {
        final Message messageNew_ = Message.new_();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        messageNew_.messageType = messageType;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localNotificationStatus = NotificationStatus.get("removed");
        if (TEnum.equals(messageType, MessageType.local_chat_greeting_tip) || TEnum.equals(messageType, MessageType.local_greeting_match_success)) {
            messageNew_.cid = str;
            messageNew_.localInConversation = true;
            List<T> listM208674j = CoreModule.f18272k.f115535c.m189476l0(str).m208674j();
            if (jyb.m147479J(listM208674j)) {
                messageNew_.createdTime = C4879a.m32266W2();
            } else {
                messageNew_.createdTime = C4879a.m32270X2(((Message) listM208674j.get(0)).createdTime);
            }
        } else {
            messageNew_.localGreetingId = str;
            List<T> listM208674j2 = CoreModule.f18272k.f115535c.m189455Q(str).m208674j();
            if (jyb.m147479J(listM208674j2) || !TEnum.equals(((Message) listM208674j2.get(0)).messageType, "text")) {
                messageNew_.createdTime = C4879a.m32266W2();
            } else {
                messageNew_.createdTime = C4879a.m32270X2(((Message) listM208674j2.get(0)).createdTime);
            }
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.sw8
            @Override // p153l.x20
            public final void call() {
                C4895j.m35062t3(messageNew_);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m35110U5() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.gx8
            @Override // p153l.x20
            public final void call() {
                C4895j.m34999Q3();
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m35111V5(Map map, Message message, boolean z, Message message2, Message message3) {
        if (message2.isOtherUser()) {
            Greeting greetingM35157x5 = m35157x5(message2.owner);
            if (NullChecker.m82486a(greetingM35157x5)) {
                Message message4 = (Message) map.get(greetingM35157x5.readUntil);
                if (NullChecker.m82486a(message4) && message4.createdTime >= message2.createdTime) {
                    message2.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        }
        if (NullChecker.m82486a(message3)) {
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
    public final /* synthetic */ void m35112W5(List list, final boolean z) {
        final HashMap map = new HashMap(list.size());
        jyb.m147537z(list, new y20() { // from class: l.ry8
            @Override // p153l.y20
            public final void call(Object obj) {
                Message message = (Message) obj;
                map.put(message.f56859id, message);
            }
        });
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Message message = (Message) it.next();
            CoreModule.f18272k.f115535c.upsert(message, new z20() { // from class: l.ty8
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f176642a.m35111V5(map, message, z, (Message) obj, (Message) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ uxj0 m35113X5(final long j) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ev8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(j);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Message m35114Y5(final Message message, String str) throws Exception {
        if (message._id != 0) {
            final Message messageMo225055clone = message.mo225055clone();
            messageMo225055clone.localCreatedSession = App.f16092i.get().intValue();
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.py8
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18272k.f115535c.updateBy_id(messageMo225055clone);
                }
            });
            return messageMo225055clone;
        }
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189452N(str).m208674j();
        message.createdTime = !listM208674j.isEmpty() ? C4879a.m32270X2(((Message) listM208674j.get(0)).createdTime) : C4879a.m32266W2();
        message.owner = CoreModule.m30929H().userId();
        message.recalled = Boolean.FALSE;
        message.localNotificationStatus = NotificationStatus.get("removed");
        message.localGreetingId = str;
        message.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        if (TextUtils.isEmpty(message.value)) {
            message.value = "";
        }
        if (jyb.m147479J(message.media)) {
            message.media = new ArrayList();
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.oy8
            @Override // p153l.x20
            public final void call() {
                C4895j.m34987K3(message);
            }
        });
        return message;
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ C22421c m35115Z5(final Message message, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.ex8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f96256a.m35114Y5(message, str);
            }
        }).compose(trd0.m192475e(f20752y0));
    }

    /* JADX INFO: renamed from: a6 */
    public final /* synthetic */ void m35116a6(final Message message, Channel channel, Throwable th) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40041 || i == 40044 || i == 40045 || i == 40046) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.mx8
                    @Override // p153l.x20
                    public final void call() {
                        C4895j.m35040i3(message, atomicBoolean);
                    }
                });
                return;
            }
        } else if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isIdCardAuthing() || tantanForbidden.isOtherNotVerify()) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.nx8
                    @Override // p153l.x20
                    public final void call() {
                        C4895j.m35058r3(message, atomicBoolean);
                    }
                });
                return;
            }
            int i2 = tantanForbidden.code;
            if ((i2 == 40337 || i2 == 40046 || i2 == 40399) && (TEnum.equals(channel, Channel.reply_thanks) || TEnum.equals(channel, Channel.red_flower))) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ox8
                    @Override // p153l.x20
                    public final void call() {
                        C4895j.m34972C4(message, atomicBoolean);
                    }
                });
                return;
            }
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.px8
            @Override // p153l.x20
            public final void call() {
                C4895j.m34988K4(message);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ pf60 m35117b6(final Message message, final String str, x20 x20Var, final Envelope envelope) {
        final GreetingResult greetingResult = ((CoreData) envelope.getModuleData(CoreData.class)).greetingResult;
        final Message message2 = ((CoreData) envelope.getModuleData(CoreData.class)).messages.get(0);
        message2.localCreatedTime = message.localCreatedTime;
        message2._id = message._id;
        message2.localGreetingId = str;
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.zy8
            @Override // p153l.x20
            public final void call() {
                C4895j.m35067v4(message2, message, envelope, greetingResult, str);
            }
        });
        if (TextUtils.equals(greetingResult.caseValue, GreetingResult.RESULT_CREATE_CONVERSATION) && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        return jyb.m147494Y(envelope, message2);
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ C22421c m35118c6(final String str, final String str2, final Message message, final x20 x20Var, y20 y20Var) {
        return qi20.m176658e(new pcj() { // from class: l.ey8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m35056q3(str, str2, message);
            }
        }).map(new qcj() { // from class: l.fy8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101346a.m35117b6(message, str, x20Var, (Envelope) obj);
            }
        }).doOnError(y20Var).compose(psd0.m173592C()).map(new qcj() { // from class: l.gy8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4895j.m34995O3((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ C22421c m35119d6(final String str, final String str2, final x20 x20Var, final y20 y20Var, boolean z, final Message message) {
        return scheduled("greetings/" + str + "/messages", -1, new pcj() { // from class: l.cx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84182a.m35118c6(str, str2, message, x20Var, y20Var);
            }
        }, z);
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ String m35120e6(String str, boolean z) throws Exception {
        DbLinks dbLinks = (DbLinks) CoreModule.f18272k.f115536d.query(m35159y5(str));
        if (!NullChecker.m82486a(dbLinks) || TextUtils.isEmpty(dbLinks.links.previous) || z) {
            return C4879a.m32216J0("/greetings/" + str + "/messages?with=moments");
        }
        String str2 = dbLinks.links.previous;
        return C4879a.m32216J0("/greetings/" + str + "/messages?" + dbLinks.links.previous + "&with=moments");
    }

    /* JADX INFO: renamed from: f5 */
    public C22421c<Greeting> m35121f5(final String str) {
        return this.f91137Q.scheduled("patch/greetings/" + str + "/match/agree", -1, new pcj() { // from class: l.dx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m35046l3(str);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ void m35122f6(String str, Map map, boolean z, Message message, Message message2) {
        if (message.isOtherUser()) {
            Greeting greetingM35157x5 = m35157x5(str);
            if (NullChecker.m82486a(greetingM35157x5)) {
                Message message3 = (Message) map.get(greetingM35157x5.readUntil);
                if (NullChecker.m82486a(message3) && message3.createdTime >= message.createdTime) {
                    message.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        }
        if (NullChecker.m82486a(message2)) {
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
    public C22421c<List<Greeting>> m35123g5(final List<String> list, final List<String> list2) {
        return this.f91137Q.scheduled("patch/greetings/batchPatchGreetingUnread", -1, new pcj() { // from class: l.uy8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.av8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4895j.m35030d5(list, list);
                    }
                }).flatMap(new qcj() { // from class: l.bv8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4895j.m35051n4((JSONArray) obj);
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ void m35124g6(Envelope envelope, final String str, final boolean z) {
        if (!TextUtils.isEmpty(envelope.pagination.links.previous)) {
            DbLinks dbLinksNew_ = (DbLinks) CoreModule.f18272k.f115536d.query(m35159y5(str));
            if (dbLinksNew_ == null) {
                dbLinksNew_ = DbLinks.new_();
                dbLinksNew_.f56859id = m35159y5(str);
            }
            dbLinksNew_.links.previous = envelope.pagination.links.previous;
            CoreModule.f18272k.f115536d.upsert(dbLinksNew_);
        }
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (jyb.m147479J(list)) {
            return;
        }
        final HashMap map = new HashMap(list.size());
        jyb.m147537z(list, new y20() { // from class: l.cv8
            @Override // p153l.y20
            public final void call(Object obj) {
                Message message = (Message) obj;
                map.put(message.f56859id, message);
            }
        });
        for (Message message : list) {
            message.localGreetingId = str;
            CoreModule.f18272k.f115535c.upsert(message, new z20() { // from class: l.dv8
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f90915a.m35122f6(str, map, z, (Message) obj, (Message) obj2);
                }
            });
        }
        list.clear();
    }

    /* JADX INFO: renamed from: h5 */
    public void m35125h5() {
        m35084E5("fake_conversation_anonymous_greeting");
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m35126h6(final String str, final boolean z, final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.cz8
            @Override // p153l.x20
            public final void call() {
                this.f84434a.m35124g6(envelope, str, z);
            }
        });
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: i5 */
    public void m35127i5() {
        m35084E5("fake_conversation_greeting");
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ C22421c m35128i6(final String str, final boolean z, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.ay8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str2).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.by8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78992a.m35126h6(str, z, (Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.cy8
            @Override // p153l.y20
            public final void call(Object obj) {
                C4895j.m35074z3((Throwable) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.dy8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public C22421c<uxj0> m35129j5(final String str, String str2) {
        return scheduled("delete_greeting/" + str2, -1, new pcj() { // from class: l.xy8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.fv8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str)).m209030d().m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.yy8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ C22421c m35130j6(final String str, final boolean z, final boolean z2) {
        return C22421c.fromCallable(new Callable() { // from class: l.tw8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f176383a.m35120e6(str, z);
            }
        }).flatMap(new qcj() { // from class: l.uw8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181245a.m35128i6(str, z2, (String) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: k5 */
    public void m35131k5() {
        l51.m152919y(new Runnable() { // from class: l.jw8
            @Override // java.lang.Runnable
            public final void run() {
                this.f122897a.m35092I5();
            }
        });
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ uxj0 m35132k6(String str, Envelope envelope) {
        m35160y6(str, ((CoreData) envelope.getModuleData(CoreData.class)).recommendMessages);
        m35158x6(str, ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos);
        return uxj0.f181467a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l5 */
    public final void m35133l5(List<Greeting> list, List<CoreMomentInfo> list2) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list2)) {
            Iterator<CoreMomentInfo> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f56856id);
            }
        }
        if (jyb.m147479J(list)) {
            return;
        }
        for (final Greeting greeting : list) {
            if (!arrayList.contains(greeting.f21143id)) {
                l9c.m153394o().m153397B(new x20() { // from class: l.qy8
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.m30932N().mo61578u9(greeting.f21143id);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public final /* synthetic */ C22421c m35134l6(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.my8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str + "/recommend-messages?with=gifts")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.ny8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144294a.m35132k6(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public void m35135m5() {
        l51.m152919y(new Runnable() { // from class: l.xu8
            @Override // java.lang.Runnable
            public final void run() {
                this.f196266a.m35094J5();
            }
        });
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ Greeting m35136m6(Envelope envelope) {
        List<Greeting> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetings;
        if (jyb.m147479J(list)) {
            return null;
        }
        m35146r6(envelope);
        m35133l5(list, ((CoreData) envelope.getModuleData(CoreData.class)).moments);
        this.f20777p0.m137019l(list.get(0));
        return list.get(0);
    }

    /* JADX INFO: renamed from: n5 */
    public C22421c<Boolean> m35137n5() {
        return scheduled("/users/me/greeting-setting/", 0, new pcj() { // from class: l.tv8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.qw8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greeting-setting")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.rw8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetingSetting.doNotDisturb);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ C22421c m35138n6(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.rx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str + "?with=kankans,moments,users")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.sx8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f171094a.m35136m6((Envelope) obj);
            }
        }).compose(psd0.m173632y());
    }

    /* JADX INFO: renamed from: o5 */
    public C22421c<Greeting> m35139o5(String str) {
        Greeting greetingM35157x5 = m35157x5(str);
        return NullChecker.m82486a(greetingM35157x5) ? C22421c.just(greetingM35157x5) : m35093I6(str);
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ uxj0 m35140o6(boolean z, Envelope envelope) {
        this.f20765d0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).greetingSummary);
        GreetingSummary greetingSummaryNew_ = ((CoreData) envelope.getModuleData(CoreData.class)).anonymousSummary;
        if (greetingSummaryNew_ == null) {
            greetingSummaryNew_ = GreetingSummary.new_();
        }
        this.f20766e0.m137019l(greetingSummaryNew_);
        m35148s6(envelope, z);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: p5 */
    public C22421c<GreetingHotLevelInfo> m35141p5(String str, boolean z) {
        return m35143q5(str, z, "");
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ C22421c m35142p6(final boolean z) {
        return new ti20(new pcj() { // from class: l.cw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greeting-summary?source=anonymous&with=users,messages")).m209028b();
            }
        }).map(new qcj() { // from class: l.dw8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f91003a.m35140o6(z, (Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: q5 */
    public C22421c<GreetingHotLevelInfo> m35143q5(final String str, final boolean z, final String str2) {
        return scheduled("getGreetingHotLevelInfo/" + str, 0, new pcj() { // from class: l.sy8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.lw8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4895j.m35025c3(str, z, str);
                    }
                }).map(new qcj() { // from class: l.mw8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).greetingHotLevelInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ uxj0 m35144q6(final NotificationStatus notificationStatus, final NotificationStatus notificationStatus2, final String str) throws Exception {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.vv8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.m189485u0(notificationStatus, notificationStatus2, str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: r5 */
    public C22421c<pf60<vg60<Greeting>, List<Message>>> m35145r5(final String str, final DbLinks dbLinks, final String str2) {
        return scheduled("kankan/reply/greeting/" + str2, 0, new pcj() { // from class: l.iw8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f117251a.m35098L5(dbLinks, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public final void m35146r6(Envelope envelope) {
        m35148s6(envelope, false);
    }

    /* JADX INFO: renamed from: s5 */
    public C22421c<List<RecommendMessage>> m35147s5(final String str) {
        return scheduled("greeting-ecommend-messages/" + str, 0, new pcj() { // from class: l.wx8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.rv8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greetings/" + str + "/recommend-messages?with=gifts")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.sv8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).recommendMessages;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final void m35148s6(Envelope envelope, final boolean z) {
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (jyb.m147479J(list)) {
            this.f91137Q.m32495w3(envelope, null);
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.kx8
            @Override // p153l.x20
            public final void call() {
                this.f129173a.m35112W5(arrayList, z);
            }
        });
        list.clear();
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: t5 */
    public C22421c<pf60<vg60<Greeting>, List<Message>>> m35149t5(final String str, final DbLinks dbLinks, final String str2) {
        return scheduled("kankan/reply/greeting/push", 0, new pcj() { // from class: l.uv8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181126a.m35102N5(dbLinks, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public C22421c<uxj0> m35150t6(final long j) {
        return this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.bz8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f79114a.m35113X5(j);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: u5 */
    public C22421c<pf60<List<Greeting>, List<Message>>> m35151u5(final String str) {
        return scheduled("kankan/reply/greeting/instant-chat", 0, new pcj() { // from class: l.qv8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159724a.m35105P5(str);
            }
        });
    }

    /* JADX INFO: renamed from: u6 */
    public C22421c<Message> m35152u6(String str, Channel channel, Message message, String str2, x20 x20Var) {
        return m35154v6(str, channel, message, str2, x20Var, true);
    }

    /* JADX INFO: renamed from: v5 */
    public C22421c<pf60<String, RelationshipStatus>> m35153v5() {
        return this.f20769h0.asObservable();
    }

    /* JADX INFO: renamed from: v6 */
    public C22421c<Message> m35154v6(final String str, final Channel channel, final Message message, String str2, final x20 x20Var, final boolean z) {
        String str3;
        Channel channel2 = (channel == null || TEnum.equals(channel, Channel.get("unknown_"))) ? Channel.get("moment") : channel;
        if (TextUtils.isEmpty(str2)) {
            str3 = "?channel=" + channel2.toString();
        } else {
            str3 = str2 + "&channel=" + channel2.toString();
        }
        String strM121135t3 = this.f91137Q.f20400k1.m121135t3(str);
        if (!TextUtils.isEmpty(strM121135t3)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "?picksTracker=" + strM121135t3;
            } else {
                str3 = str3 + "&picksTracker=" + strM121135t3;
            }
        }
        final String str4 = str3;
        pcj pcjVar = new pcj() { // from class: l.dz8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f91329a.m35115Z5(message, str);
            }
        };
        final y20 y20Var = new y20() { // from class: l.iv8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117024a.m35116a6(message, channel, (Throwable) obj);
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.kv8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f128948a.m35119d6(str, str4, x20Var, y20Var, z, (Message) obj);
            }
        };
        return this.f91137Q.now(null, ((C22421c) pcjVar.call()).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.lv8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return (C22421c) qcjVar.call((Message) obj);
            }
        }).doOnNext(new y20() { // from class: l.mv8
            @Override // p153l.y20
            public final void call(Object obj) {
                C4895j.m34986J4((Message) obj);
            }
        }), z);
    }

    /* JADX INFO: renamed from: w5 */
    public C22421c<Integer> m35155w5() {
        return scheduled("me/greeting-counter", 0, new pcj() { // from class: l.nv8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.hx8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/greeting-counter?query=replyThanks")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ix8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4895j.m35007U3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public C22421c<List<Message>> m35156w6(String str) {
        return CoreModule.f18272k.f115535c.m189450L(str).m208677m();
    }

    /* JADX INFO: renamed from: x5 */
    public Greeting m35157x5(String str) {
        vg60<Greeting> vg60VarM222761e = this.f20768g0.m222761e();
        if (!NullChecker.m82486a(vg60VarM222761e) || jyb.m147479J(vg60VarM222761e.f184001a)) {
            return null;
        }
        for (Greeting greeting : vg60VarM222761e.f184001a) {
            if (TextUtils.equals(str, greeting.f21143id)) {
                return greeting;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m35158x6(String str, List<CoreGiftInfo> list) {
        boolean zM147479J = jyb.m147479J(list);
        C22507a<pf60<String, CoreGiftInfo>> c22507a = this.f20774m0;
        if (zM147479J) {
            c22507a.m137019l(null);
        } else {
            c22507a.m137019l(pf60.m172085a(str, list.get(0)));
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final String m35159y5(String str) {
        return "greeting/v3/" + str + "/messages";
    }

    /* JADX INFO: renamed from: y6 */
    public final void m35160y6(String str, List<RecommendMessage> list) {
        Map<String, List<RecommendMessage>> mapM222761e = this.f20773l0.m222761e();
        if (jyb.m147479J(list)) {
            mapM222761e.remove(str);
        } else {
            mapM222761e.put(str, list);
        }
        this.f20773l0.m137019l(mapM222761e);
    }

    /* JADX INFO: renamed from: z5 */
    public C22421c<vg60<Message>> m35161z5(String str, double d, long j, boolean z) {
        return m35076A5(str, d, j, z, true);
    }

    /* JADX INFO: renamed from: z6 */
    public C22421c<uxj0> m35162z6() {
        return this.f91137Q.scheduled("patchAnonymousGreetingRead", -1, new pcj() { // from class: l.hy8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4895j.m34980G4();
            }
        });
    }
}
