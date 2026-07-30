package com.p046p1.mobile.putong.core.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4736e;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.BulkGroupInviteMessages;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p046p1.mobile.putong.core.data.ChatGroupSilence;
import com.p046p1.mobile.putong.core.data.ChatGroupTopic;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupApplyStatus;
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.core.data.GroupInvitation;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.data.GroupSetting;
import com.p046p1.mobile.putong.core.data.GroupTab;
import com.p046p1.mobile.putong.core.data.GroupUpdateData;
import com.p046p1.mobile.putong.core.data.JoinCondition;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageChannel;
import com.p046p1.mobile.putong.core.data.MessageStatus;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationCounter;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.SettingGroupManager;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantan.core.base.R$string;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.bqd0;
import p149l.d30;
import p149l.dg7;
import p149l.e30;
import p149l.e51;
import p149l.evk;
import p149l.fgf0;
import p149l.ggi;
import p149l.hpd0;
import p149l.ia20;
import p149l.jo0;
import p149l.knb0;
import p149l.kpd0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qh7;
import p149l.qib0;
import p149l.qnd;
import p149l.qqi0;
import p149l.roj0;
import p149l.stc0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.wxz;
import p149l.xaj0;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e */
/* JADX INFO: loaded from: classes9.dex */
public class C4736e extends ax6 {

    /* JADX INFO: renamed from: B0 */
    public static int f19764B0 = 500;

    /* JADX INFO: renamed from: C0 */
    public static hpd0 f19765C0;

    /* JADX INFO: renamed from: D0 */
    public static hpd0 f19766D0;

    /* JADX INFO: renamed from: E0 */
    public static hpd0 f19767E0;

    /* JADX INFO: renamed from: F0 */
    public static hpd0 f19768F0;

    /* JADX INFO: renamed from: A0 */
    public final b f19769A0;

    /* JADX INFO: renamed from: R */
    public kpd0 f19770R;

    /* JADX INFO: renamed from: S */
    public kpd0 f19771S;

    /* JADX INFO: renamed from: T */
    public C22392a<roj0> f19772T;

    /* JADX INFO: renamed from: U */
    public C22392a<Pair<Links, List<ChatGroup>>> f19773U;

    /* JADX INFO: renamed from: V */
    public C22392a<GroupApply> f19774V;

    /* JADX INFO: renamed from: W */
    public C22392a<NotificationCounter> f19775W;

    /* JADX INFO: renamed from: X */
    public HashMap<String, GroupApply> f19776X;

    /* JADX INFO: renamed from: Y */
    public C22392a<roj0> f19777Y;

    /* JADX INFO: renamed from: Z */
    public C22392a<roj0> f19778Z;

    /* JADX INFO: renamed from: a0 */
    public C22392a<knb0<List<ChatGroup>, List<ChatGroupMember>, List<GroupApply>, List<User>>> f19779a0;

    /* JADX INFO: renamed from: b0 */
    public C22392a<Pair<String, xaj0<List<ChatGroup>, List<ChatGroupMember>, List<Conversation>>>> f19780b0;

    /* JADX INFO: renamed from: c0 */
    public C22392a<Integer> f19781c0;

    /* JADX INFO: renamed from: d0 */
    public C22392a<xaj0<List<ChatGroup>, List<ChatGroupMember>, List<Conversation>>> f19782d0;

    /* JADX INFO: renamed from: e0 */
    public Set<String> f19783e0;

    /* JADX INFO: renamed from: f0 */
    public C22393b<ChatGroupTopic> f19784f0;

    /* JADX INFO: renamed from: g0 */
    public C22393b<String> f19785g0;

    /* JADX INFO: renamed from: h0 */
    public hpd0 f19786h0;

    /* JADX INFO: renamed from: i0 */
    public C22393b<roj0> f19787i0;

    /* JADX INFO: renamed from: j0 */
    public String f19788j0;

    /* JADX INFO: renamed from: k0 */
    public zpd0 f19789k0;

    /* JADX INFO: renamed from: l0 */
    public C22393b<roj0> f19790l0;

    /* JADX INFO: renamed from: m0 */
    public C22393b<Integer> f19791m0;

    /* JADX INFO: renamed from: n0 */
    public C22393b<roj0> f19792n0;

    /* JADX INFO: renamed from: o0 */
    public C22393b<Pair<String, String>> f19793o0;

    /* JADX INFO: renamed from: p0 */
    public HashMap<String, Integer> f19794p0;

    /* JADX INFO: renamed from: q0 */
    public Map<String, Conversation> f19795q0;

    /* JADX INFO: renamed from: r0 */
    public bqd0<GroupSetting> f19796r0;

    /* JADX INFO: renamed from: s0 */
    public String f19797s0;

    /* JADX INFO: renamed from: t0 */
    public final C22392a<GroupTab> f19798t0;

    /* JADX INFO: renamed from: u0 */
    public C22392a<Pair<Links, List<GroupNotification>>> f19799u0;

    /* JADX INFO: renamed from: v0 */
    public C22393b<knb0<List<Conversation>, CoreData, Links, Integer>> f19800v0;

    /* JADX INFO: renamed from: w0 */
    public C22393b<Pair<String, ArrayList<Media>>> f19801w0;

    /* JADX INFO: renamed from: x0 */
    public C22392a<List<GroupAttribute>> f19802x0;

    /* JADX INFO: renamed from: y0 */
    public final GroupTab f19803y0;

    /* JADX INFO: renamed from: z0 */
    public final C22392a<List<GroupTab>> f19804z0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e$a */
    public class a extends bqd0<GroupSetting> {
        public a(String str, GroupSetting groupSetting) {
            super(str, groupSetting);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull @NotNull GroupSetting groupSetting, GroupSetting groupSetting2) {
            return groupSetting.equals(groupSetting2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroupSetting copyed(GroupSetting groupSetting, @NonNull @NotNull GroupSetting groupSetting2) {
            return groupSetting2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GroupSetting retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            if (string == null) {
                return (GroupSetting) this.defaultValue;
            }
            try {
                return GroupSetting.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                return (GroupSetting) this.defaultValue;
            }
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(GroupSetting groupSetting) {
            return pref().edit().putString(this.f98687id, groupSetting.toJson());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e$b */
    public class b extends fgf0<List<GroupTab>> {
        public b() {
            super("chat_group_tabs", new ggi(new qnd("chat_group_tabs", "_1", null), -1, GroupTab.PROTOBUF_ADAPTER.ARRAY_ADAPTER()), new v9j() { // from class: l.ml7
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4736e.b.m31948B(c4736e);
                }
            });
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ C22306c m31948B(C4736e c4736e) {
            return c4736e.f19804z0.m221515e() != null ? C22306c.just((List) c4736e.f19804z0.m221515e()) : C22306c.just(new ArrayList());
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        f19765C0 = new hpd0("chat_v3_enable", bool);
        f19766D0 = new hpd0("check_id", bool);
        f19767E0 = new hpd0("show_group_tips", bool);
        f19768F0 = new hpd0("has_in_group", Boolean.FALSE);
    }

    public C4736e(C4732c c4732c) {
        super(c4732c);
        this.f19772T = C22392a.m221512b();
        this.f19773U = C22392a.m221512b();
        this.f19774V = C22392a.m221512b();
        this.f19775W = C22392a.m221512b();
        this.f19776X = new HashMap<>();
        this.f19777Y = C22392a.m221512b();
        this.f19778Z = C22392a.m221512b();
        this.f19779a0 = C22392a.m221512b();
        this.f19780b0 = C22392a.m221512b();
        this.f19781c0 = C22392a.m221512b();
        this.f19782d0 = C22392a.m221512b();
        this.f19783e0 = new HashSet();
        this.f19784f0 = C22393b.m221521b();
        this.f19785g0 = C22393b.m221521b();
        this.f19786h0 = new hpd0("group_topic_roaming_first_experience_" + CoreModule.m29931H().userId(), Boolean.TRUE);
        this.f19787i0 = C22393b.m221521b();
        this.f19788j0 = "";
        this.f19790l0 = C22393b.m221521b();
        this.f19791m0 = C22393b.m221521b();
        this.f19792n0 = C22393b.m221521b();
        this.f19793o0 = C22393b.m221521b();
        this.f19794p0 = new HashMap<>();
        this.f19795q0 = new HashMap();
        this.f19796r0 = new a("local_group_chat_setting", GroupSetting.new_());
        this.f19797s0 = "limit=50&filter=default&with=users";
        this.f19798t0 = C22392a.m221512b();
        this.f19799u0 = C22392a.m221512b();
        this.f19800v0 = C22393b.m221521b();
        this.f19801w0 = C22393b.m221521b();
        this.f19802x0 = C22392a.m221512b();
        this.f19803y0 = GroupTab.new_();
        this.f19804z0 = C22392a.m221512b();
        this.f19769A0 = new b();
        this.f19789k0 = new zpd0("last_group_members_load_time", 0L);
        this.f19770R = new kpd0("last_tab_dot_show_time_" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f19771S = new kpd0("last_tab_dot_click_time_" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        ura.m195053e().m195057d().mo33678E8(this.f19794p0);
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ JSONObject m31627B5(JoinCondition joinCondition) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("joinCondition", joinCondition);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ JSONObject m31647I4(List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        vwb.m200354z(list, new e30() { // from class: l.tf7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4736e.m31684U4(jSONArray, (String) obj);
            }
        });
        jSONObject.put("chatGroupMembers", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: K6 */
    public static char m31655K6() {
        return (char) (((int) (Math.random() * 20902.0d)) + 19968);
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m31660M4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ String m31683U3(String str, List list) {
        BulkGroupInviteMessages bulkGroupInviteMessagesNew_ = BulkGroupInviteMessages.new_();
        bulkGroupInviteMessagesNew_.message.messageType = MessageType.get(MessageType.group_invitation);
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        GroupInvitation groupInvitationNew_ = GroupInvitation.new_();
        Target target = groupInvitationNew_.target;
        target.f20520id = str;
        target.type = "chatGroups";
        messageAdditionalDataNew_.groupInvitation = groupInvitationNew_;
        bulkGroupInviteMessagesNew_.message.additionalData = messageAdditionalDataNew_;
        bulkGroupInviteMessagesNew_.toUserIds = list;
        return bulkGroupInviteMessagesNew_.toJson();
    }

    /* JADX INFO: renamed from: U4 */
    public static /* synthetic */ void m31684U4(JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, ChatGroupMemberStatus.exited);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ stc0 m31691W5(String str, String str2) {
        String strM31331o;
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        if (TextUtils.isEmpty(str)) {
            strM31331o = C4728a.m31331o(str2);
        } else {
            strM31331o = C4728a.m31331o(str2 + "&" + str);
        }
        return c20027aAuth.m185898q(strM31331o).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m31696Y4(Throwable th) {
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ CoreData m31711c5(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ ChatGroup m31726g4(Envelope envelope) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups.get(0);
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m31727g5(Message message, ChatGroupMember chatGroupMember) {
        CoreModule.f17553k.f91940c.upsert(message);
        CoreModule.f17553k.f91952o.upsert(chatGroupMember);
        lsi0.m151580j("插入完成");
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m31733i3(ArrayList arrayList, final String str, DbLinks dbLinks) {
        vwb.m200354z(arrayList, new e30() { // from class: l.pf7
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17553k.f91952o.delete(Filter.AND(ChatGroupMember.GROUPID.mo60175EQ(str), ChatGroupMember.USERID.mo60175EQ(((ChatGroupMember) obj).userId)));
            }
        });
        qib0.f154722k0.f176630c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ roj0 m31745l5(e30 e30Var, Envelope envelope) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ String m31758q3(String str, Action action) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        SettingGroupManager settingGroupManagerNew_ = SettingGroupManager.new_();
        settingGroupManagerNew_.action = action;
        settingGroupManagerNew_.adminUserIds = arrayList;
        return settingGroupManagerNew_.toJson();
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m31769t5(ChatGroup chatGroup, Conversation conversation, List list, List list2) {
        CoreModule.f17553k.f91951n.upsert(chatGroup);
        CoreModule.f17553k.f91950m.upsert(conversation);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoreModule.f17553k.f91940c.upsert((Message) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ChatGroupMember chatGroupMember = (ChatGroupMember) it2.next();
            if (NullChecker.m81303a(chatGroupMember)) {
                CoreModule.f17553k.f91952o.upsert(chatGroupMember);
            }
        }
        lsi0.m151580j("插入完成");
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ JSONObject m31770u3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nickName", str);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m31773v3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m31774v4(Message message) {
        CoreModule.f17553k.f91940c.upsert(message);
        lsi0.m151580j("插入完成");
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m31779x3(Object obj) {
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ JSONObject m31785z3(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("muted", z);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: A6 */
    public C22306c<roj0> m31788A6() {
        return this.f19777Y.asObservable();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ C22306c m31789A7(List list) {
        return C22306c.just(m31885g9());
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ C22306c m31790A8(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.if7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "/members/" + str2 + "?with=users")).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.jf7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117638a.m31943z8((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.kf7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: B6 */
    public HashMap<String, GroupApply> m31791B6() {
        return this.f19776X;
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ roj0 m31793B8(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!vwb.m200296J(coreData.notificationCounters)) {
            this.f19781c0.m132487l(Integer.valueOf(coreData.notificationCounters.get(0).unread));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: C6 */
    public C22306c<GroupApply> m31794C6() {
        return this.f19774V.asObservable();
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ roj0 m31795C7(final String str, int i, Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        final ArrayList arrayList = new ArrayList(coreData.conversations);
        int iM200293G = vwb.m200293G(arrayList, new w9j() { // from class: l.tg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                String str2 = str;
                return Boolean.valueOf(!TextUtils.isEmpty(str2) && TextUtils.equals(((Conversation) obj).f56011id, str2));
            }
        });
        if (iM200293G != -1) {
            ((Conversation) arrayList.get(iM200293G)).unreadMessages = 0;
        }
        coreData.conversations.clear();
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.vg7
            @Override // p149l.d30
            public final void call() {
                this.f181350a.m31792B7(arrayList);
            }
        });
        this.f19800v0.m132487l(vwb.m200312Z(arrayList, coreData, envelope.pagination.links, Integer.valueOf(i)));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ C22306c m31796C8(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.qf7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31215J2("/" + str + "/notification-counters?source=topic")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.rf7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159127a.m31793B8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public C22392a<Pair<Links, List<GroupNotification>>> m31797D6() {
        return this.f19799u0;
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m31798D7(Throwable th) {
        this.f19800v0.m132487l(vwb.m200312Z(null, null, null, null));
    }

    /* JADX INFO: renamed from: D8 */
    public final C22306c<roj0> m31799D8(final String str, final DbLinks dbLinks) {
        return dbLinks.links.next == null ? C22306c.just(roj0.f160388a) : C22306c.fromCallable(new Callable() { // from class: l.lj7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f128287a.m31845T7(str, dbLinks);
            }
        }).doOnNext(new e30() { // from class: l.mj7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134106a.m31848U7(str, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public GroupSetting m31800E6() {
        return this.f19796r0.get();
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ C22306c m31801E7(final String str, final String str2, final int i) {
        return ia20.m135121e(new v9j() { // from class: l.gg7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.hg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107571a.m31795C7(str2, i, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.ig7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113073a.m31798D7((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E8, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22306c<roj0> m31863Z7(final String str, final DbLinks dbLinks) {
        return this.f72126Q.scheduled("group/" + str + "/members/get", 0, new v9j() { // from class: l.cf7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80541a.m31860Y7(dbLinks, str);
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public C22306c<roj0> m31803F6(int i) {
        return m31806G6("", "", i);
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ List m31804F7(Envelope envelope) {
        this.f19802x0.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).groupAttributes);
        return ((CoreData) envelope.getModuleData(CoreData.class)).groupAttributes;
    }

    /* JADX INFO: renamed from: F8 */
    public final C22306c<roj0> m31805F8(final String str, final DbLinks dbLinks) {
        return C22306c.fromCallable(new Callable() { // from class: l.ti7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f170534a.m31866a8(str, dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public C22306c<roj0> m31806G6(String str, final String str2, final int i) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(C4728a.m31215J2("/" + CoreModule.m29931H().userId()));
        sb.append("/conversations?filter=topicGroups&with=chat-groups,messages,members,users");
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "&" + str;
        }
        sb.append(str3);
        final String string = sb.toString();
        return scheduled("/v3/conversations/topicGroups/", 0, new v9j() { // from class: l.el7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92074a.m31801E7(string, str2, i);
            }
        });
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m31807G7(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: G8 */
    public C22306c<roj0> m31808G8(final String str, final boolean z) {
        return scheduled("conversations/" + str + "/muted", -1, new v9j() { // from class: l.xi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192965a.m31875d8(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public C22306c<ChatGroup> m31809H6(final String str) {
        return scheduled("chat-groups/" + str, 0, new v9j() { // from class: l.vk7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.kg7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "?with=members,users")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.lg7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4736e.m31726g4((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C22306c m31810H7(final GroupCreate groupCreate) {
        return ia20.m135121e(new v9j() { // from class: l.ng7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31260W()).m185893l(utc0.create(Network.JSON, groupCreate.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.og7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143824a.m31807G7((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.pg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: H8 */
    public C22306c<NotificationCounter> m31811H8() {
        return this.f19775W.asObservable();
    }

    /* JADX INFO: renamed from: I6 */
    public C22306c<List<ChatGroup>> m31812I6() {
        return CoreModule.f17553k.f91951n.m215996F().m165620m();
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m31813I7(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: I8 */
    public final void m31814I8(List<GroupTab> list) {
        this.f19804z0.m132487l(list);
        boolean zM200296J = vwb.m200296J(list);
        C22392a<GroupTab> c22392a = this.f19798t0;
        if (zM200296J) {
            c22392a.m132487l(this.f19803y0);
            return;
        }
        GroupTab groupTabM221515e = c22392a.m221515e();
        if (groupTabM221515e == null || !list.contains(groupTabM221515e)) {
            m31882f9(list.get(0));
        }
    }

    /* JADX INFO: renamed from: J6 */
    public int m31815J6(String str) {
        if (this.f19794p0.containsKey(str)) {
            return this.f19794p0.get(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ C22306c m31816J7(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.uh7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, str2)).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.vh7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181475a.m31813I7((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.wh7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: J8 */
    public C22306c<roj0> m31817J8(final String str, GroupApplyStatus groupApplyStatus) {
        final String str2 = "{\"status\":\"" + groupApplyStatus.toString() + "\"}";
        return scheduled(C4728a.m31333o1(str), -1, new v9j() { // from class: l.lf7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.qg7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31333o1(str)).m185893l(utc0.create(Network.JSON, str)).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.mf7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133566a.m31878e8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ C22306c m31818K7(final String str, final Action action, final String str2) {
        return C22306c.fromCallable(new Callable() { // from class: l.hh7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4736e.m31758q3(str, action);
            }
        }).flatMap(new w9j() { // from class: l.ih7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f113213a.m31816J7(str2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K8 */
    public C22306c<roj0> m31819K8(final String str, List<Picture> list) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.avatars = list;
        return scheduled("patch/chat-groups/avatars/" + str, -1, new v9j() { // from class: l.bi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f75707a.m31884g8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public C22392a<Pair<Links, List<ChatGroup>>> m31820L6() {
        return this.f19773U;
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m31821L7(String str, boolean z, String str2, ChatGroupMember chatGroupMember) {
        if (!NullChecker.m81303a(chatGroupMember)) {
            if (z) {
                return;
            }
            m31864Z8(str2, str);
        } else if (TextUtils.isEmpty(chatGroupMember.groupMemberName()) || TextUtils.isEmpty(chatGroupMember.avatar)) {
            CoreModule.f17545c.f19639e0.m169454W9(str);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public C22306c<roj0> m31822L8(final String str, String str2) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.description = str2;
        return scheduled("patch/chat-groups/description/" + str, -1, new v9j() { // from class: l.pk7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f149943a.m31890i8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public C22306c<GroupApply> m31823M6(final String str) {
        if (this.f19774V.m221515e() == null || !str.equals(this.f19774V.m221515e().groupId)) {
            this.f19774V.m132487l(null);
        }
        return this.f19774V.asObservable().filter(new w9j() { // from class: l.ai7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                GroupApply groupApply = (GroupApply) obj;
                return Boolean.valueOf(groupApply == null || str.equals(groupApply.groupId));
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ roj0 m31824M7(Envelope envelope) {
        this.f19799u0.m132487l(new Pair<>(envelope.pagination.links, ((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: M8 */
    public C22306c<roj0> m31825M8(final String str, String str2) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.name = str2;
        return scheduled("patch/chat-groups/name/" + str, -1, new v9j() { // from class: l.ij7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113508a.m31898k8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public C22306c<List<GroupAttribute>> m31826N6() {
        return scheduled(C4728a.m31257V(), 0, new v9j() { // from class: l.pi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.hf7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31257V()).m185887f().m185883b();
                    }
                }).compose(C4728a.m31252T2());
            }
        }).map(new w9j() { // from class: l.qi7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154672a.m31804F7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ roj0 m31827N7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications);
        Pair<Links, List<GroupNotification>> pairM221515e = this.f19799u0.m221515e();
        final List arrayList2 = pairM221515e == null ? new ArrayList() : (List) pairM221515e.second;
        arrayList2.addAll(vwb.m200339n(arrayList, new w9j() { // from class: l.uk7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200337m(arrayList2, new w9j() { // from class: l.sf7
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((GroupNotification) obj2).f20406id.equals(groupNotification.f20406id));
                    }
                }));
            }
        }));
        this.f19799u0.m132487l(new Pair<>(envelope.pagination.links, arrayList2));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: N8 */
    public C22306c<roj0> m31828N8(final String str, final String str2, final boolean z) {
        return scheduled("patch/chat-groups/nickname/" + str, -1, new v9j() { // from class: l.di7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86359a.m31913p8(str2, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public C22306c<roj0> m31829O6(final String str, final List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4728a.m31366w2("/" + CoreModule.m29931H().userId()));
        sb.append("/bulk-messages");
        final String string = sb.toString();
        return scheduled(CoreModule.m29931H().userId() + "/bulk-messages", -1, new v9j() { // from class: l.zg7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.ah7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4736e.m31683U3(str, list);
                    }
                }).flatMap(new w9j() { // from class: l.bh7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ia20.m135121e(new v9j() { // from class: l.lh7
                            @Override // p149l.v9j, java.util.concurrent.Callable
                            public final Object call() {
                                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, str)).m185883b();
                            }
                        }).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.mh7
                            @Override // p149l.e30
                            public final void call(Object obj2) {
                                lsi0.m151593w(R$string.f55769f);
                            }
                        }).map(new w9j() { // from class: l.nh7
                            @Override // p149l.w9j
                            public final Object call(Object obj2) {
                                return roj0.f160388a;
                            }
                        });
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ C22306c m31830O7(String str, String str2, String str3, Conversation conversation) {
        return (conversation == null || !TEnum.equals(ConversationStatus.get("default"), conversation.status)) ? m31893j7(str, str2, str3) : C22306c.just(conversation);
    }

    /* JADX INFO: renamed from: O8 */
    public C22306c<roj0> m31831O8(String str, List<String> list) {
        return m31834P8(str, list, null);
    }

    /* JADX INFO: renamed from: P6 */
    public C22306c<roj0> m31832P6(final GroupCreate groupCreate, List<Picture> list) {
        groupCreate.avatars = list;
        return scheduled(C4728a.m31260W(), -1, new v9j() { // from class: l.fk7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98042a.m31810H7(groupCreate);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m31833P7(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: P8 */
    public C22306c<roj0> m31834P8(final String str, final List<String> list, final e30<List<ChatGroupMember>> e30Var) {
        return scheduled("chat-groups/" + str + "/members/remove", -1, new v9j() { // from class: l.fi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f97630a.m31922s8(list, str, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public String m31835Q6() {
        GroupSetting groupSetting = this.f19796r0.get();
        return NullChecker.m81303a(groupSetting) ? groupSetting.groupDescriptionEditTip : "";
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ C22306c m31836Q7(final String str, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.oh7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.ph7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148879a.m31833P7((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.rh7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public C22306c<roj0> m31837Q8(String str) {
        return m31863Z7(str, null);
    }

    /* JADX INFO: renamed from: R6 */
    public C22306c<Integer> m31838R6() {
        return this.f19791m0.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ C22306c m31839R7(final JoinCondition joinCondition, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.ch7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4736e.m31627B5(joinCondition);
            }
        }).flatMap(new w9j() { // from class: l.dh7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86243a.m31836Q7(str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R8 */
    public void m31840R8() {
        m31877e7().subscribe(mkd0.m154956H(new e30() { // from class: l.ll7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128658a.m31925t8((Data) obj);
            }
        }, new e30() { // from class: l.nf7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4736e.m31696Y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S6 */
    public C22306c<roj0> m31841S6(String str, final String str2, final Action action) {
        final String strM31327n = C4728a.m31327n(str + "?method=patch");
        return scheduled("patch/chat-groups/groupManager/" + str, -1, new v9j() { // from class: l.yg7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f198129a.m31818K7(str2, action, strM31327n);
            }
        });
    }

    /* JADX INFO: renamed from: S8 */
    public C22306c<roj0> m31843S8() {
        return this.f19790l0.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: T6 */
    public C22306c<ChatGroupMember> m31844T6(String str, String str2) {
        return m31847U6(str, str2, false);
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ roj0 m31845T7(final String str, final DbLinks dbLinks) throws Exception {
        final String strM31892j6 = m31892j6(str, dbLinks.links.next);
        Envelope envelopeM212771c = ia20.m135117a(new v9j() { // from class: l.lk7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31892j6).m185887f().m185883b();
            }
        }).toBlocking().m212771c(null);
        Links links = dbLinks.links;
        if (links.previous == null) {
            links.previous = envelopeM212771c.pagination.links.previous;
        }
        links.next = envelopeM212771c.pagination.links.next;
        this.f72126Q.m31492w3(envelopeM212771c, new d30() { // from class: l.mk7
            @Override // p149l.d30
            public final void call() {
                qib0.f154722k0.f176630c.upsert(dbLinks);
            }
        });
        this.f19789k0.put(Long.valueOf(mqi0.m155944o()));
        if (NullChecker.m81303a(dbLinks.links.next)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.nk7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139378a.m31842S7(str, dbLinks);
                }
            }, f19764B0);
            int i = f19764B0;
            if (i > 100) {
                f19764B0 = i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
            }
        }
        if (!vwb.m200296J(((CoreData) envelopeM212771c.getModuleData(CoreData.class)).chatGroupMembers)) {
            this.f19790l0.m132487l(roj0.f160388a);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: T8 */
    public void m31846T8(int i) {
        this.f19791m0.m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: U6 */
    public C22306c<ChatGroupMember> m31847U6(final String str, final String str2, final boolean z) {
        return CoreModule.f17553k.f91952o.uiGet(str + str2).doOnNext(new e30() { // from class: l.al7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70412a.m31821L7(str2, z, str, (ChatGroupMember) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m31848U7(String str, roj0 roj0Var) {
        final ChatGroup chatGroupQuery = CoreModule.f17553k.f91951n.query(str);
        if (!NullChecker.m81303a(chatGroupQuery) || chatGroupQuery.localMembersLoaded) {
            return;
        }
        chatGroupQuery.localMembersLoaded = true;
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kl7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91951n.upsert(chatGroupQuery);
            }
        });
    }

    /* JADX INFO: renamed from: U8 */
    public C22306c<roj0> m31849U8() {
        return scheduled(" /v3/users/me/notification-counters", 0, new v9j() { // from class: l.zh7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f203142a.m31931v8();
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public C22306c<roj0> m31850V6() {
        return this.f19792n0.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ DbLinks m31851V7(String str) throws Exception {
        return (DbLinks) qib0.f154722k0.f176630c.query(m31896k6(str));
    }

    /* JADX INFO: renamed from: V8 */
    public List<ChatGroupMember> m31852V8(String str) {
        return CoreModule.f17553k.f91952o.query(Filter.AND(ChatGroupMember.GROUPID.mo60175EQ(str), ChatGroupMember.STATUS.NEQ(ChatGroupMemberStatus.exited)), null, 2000);
    }

    /* JADX INFO: renamed from: W6 */
    public C22306c<List<ChatGroupMember>> m31853W6(String str) {
        return CoreModule.f17553k.f91952o.m210957G(str).m165620m();
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m31854W7(String str) {
        CoreModule.f17553k.f91952o.deleteAll();
        qib0.f154722k0.f176630c.delete(m31896k6(str));
    }

    /* JADX INFO: renamed from: W8 */
    public ChatGroupMember m31855W8(String str, String str2) {
        return CoreModule.f17553k.f91952o.queryCache(str + str2);
    }

    /* JADX INFO: renamed from: X6 */
    public C22306c<roj0> m31856X6() {
        return this.f19772T.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ C22306c m31857X7(final String str, DbLinks dbLinks) {
        if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.previous)) {
            DbLinks dbLinksNew_ = DbLinks.new_();
            dbLinksNew_.f56011id = m31896k6(str);
            dbLinksNew_.links.next = this.f19797s0;
            return m31799D8(str, dbLinksNew_);
        }
        if (NullChecker.m81303a(dbLinks.links.next)) {
            return m31799D8(str, dbLinks);
        }
        if (this.f19789k0.get().longValue() == 0 || !qqi0.m175940h(mqi0.m155944o(), this.f19789k0.get().longValue(), 60)) {
            return m31805F8(str, dbLinks);
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.nj7
            @Override // p149l.d30
            public final void call() {
                this.f139214a.m31854W7(str);
            }
        });
        DbLinks dbLinksNew_2 = DbLinks.new_();
        dbLinksNew_2.f56011id = m31896k6(str);
        dbLinksNew_2.links.next = this.f19797s0;
        return m31799D8(str, dbLinksNew_2);
    }

    /* JADX INFO: renamed from: X8 */
    public C22306c<roj0> m31858X8(String str) {
        return m31861Y8(str, new w9j() { // from class: l.mi7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public C22306c<DbLinks> m31859Y6(String str) {
        return qib0.f154722k0.f176630c.uiGet(m31896k6(str));
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ C22306c m31860Y7(DbLinks dbLinks, final String str) {
        if (dbLinks == null) {
            return C22306c.fromCallable(new Callable() { // from class: l.yf7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f198002a.m31851V7(str);
                }
            }).flatMap(new w9j() { // from class: l.jg7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f117728a.m31857X7(str, (DbLinks) obj);
                }
            }).compose(mkd0.m154951C());
        }
        return NullChecker.m81303a(dbLinks.links.next) ? m31799D8(str, dbLinks).compose(mkd0.m154951C()) : m31805F8(str, dbLinks).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: Y8 */
    public <R> C22306c<R> m31861Y8(final String str, @NonNull final w9j<Envelope, R> w9jVar) {
        return scheduled("chat-groups/" + str, 0, new v9j() { // from class: l.vi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181556a.m31940y8(str, w9jVar);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public String m31862Z6() {
        GroupSetting groupSetting = this.f19796r0.get();
        return NullChecker.m81303a(groupSetting) ? groupSetting.groupNameEditTip : "";
    }

    /* JADX INFO: renamed from: Z8 */
    public C22306c<roj0> m31864Z8(final String str, final String str2) {
        return scheduled("chat-groups/" + str + "/" + str2, 0, new v9j() { // from class: l.wj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f186616a.m31790A8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public C22306c<roj0> m31865a7() {
        return scheduled(C4728a.m31264X(), 0, new v9j() { // from class: l.tj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.uj7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31264X()).m185887f().m185883b();
                    }
                }).doOnNext(new e30() { // from class: l.vj7
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.m31492w3((Envelope) obj, null);
                    }
                }).compose(C4728a.m31252T2());
            }
        }).map(new w9j() { // from class: l.ek7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91938a.m31824M7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ roj0 m31866a8(final String str, final DbLinks dbLinks) throws Exception {
        final String strM31899l6 = m31899l6(str, dbLinks.links.previous);
        Envelope envelopeM212770b = ia20.m135117a(new v9j() { // from class: l.ef7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31899l6).m185887f().m185883b();
            }
        }).toBlocking().m212770b();
        if (!vwb.m200296J(((CoreData) envelopeM212770b.getModuleData(CoreData.class)).chatGroupMembers)) {
            this.f19772T.m132487l(roj0.f160388a);
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).chatGroupMembers.size(); i++) {
                ChatGroupMember chatGroupMember = ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).chatGroupMembers.get(i);
                if (TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
                    arrayList.add(chatGroupMember);
                }
            }
            String str2 = envelopeM212770b.pagination.links.previous;
            if (str2 != null) {
                dbLinks.links.previous = str2;
            }
            ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).chatGroupMembers.removeAll(arrayList);
            this.f72126Q.m31494y3(envelopeM212770b, new d30() { // from class: l.ff7
                @Override // p149l.d30
                public final void call() {
                    C4736e.m31733i3(arrayList, str, dbLinks);
                }
            }, false, false, false);
            this.f19790l0.m132487l(roj0.f160388a);
        }
        this.f19789k0.put(Long.valueOf(mqi0.m155944o()));
        if (!vwb.m200296J(((CoreData) envelopeM212770b.getModuleData(CoreData.class)).chatGroupMembers) && ((CoreData) envelopeM212770b.getModuleData(CoreData.class)).chatGroupMembers.size() >= envelopeM212770b.pagination.limit) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.gf7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102338a.m31863Z7(str, dbLinks);
                }
            }, 100L);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: a9 */
    public C22306c<roj0> m31867a9() {
        final String strUserId = CoreModule.m29931H().userId();
        return scheduled("topic/notification-counters/" + strUserId, 0, new v9j() { // from class: l.ok7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144400a.m31796C8(strUserId);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22306c<roj0> m31868b7(final String str) {
        return scheduled(C4728a.m31264X() + "&" + str, 0, new v9j() { // from class: l.wi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.gk7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31264X() + "&" + str).m185887f().m185883b();
                    }
                }).compose(C4728a.m31252T2());
            }
        }).map(new w9j() { // from class: l.yi7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198448a.m31827N7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m31869b8(String str, boolean z, Envelope envelope) {
        final Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.muted = z;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.uf7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91950m.upsert(conversationQuery);
            }
        });
    }

    /* JADX INFO: renamed from: b9 */
    public C22306c<roj0> m31870b9(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(str2)) {
            arrayList.add(str2);
        }
        return m31831O8(str, arrayList);
    }

    /* JADX INFO: renamed from: c7 */
    public C22306c<Pair<Links, List<GroupNotification>>> m31871c7() {
        return this.f19799u0.asObservable();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ C22306c m31872c8(final String str, final boolean z, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.ik7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/conversations/" + str + "?method=patch&muted=" + z)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.jk7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118340a.m31869b8(str, z, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.kk7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: c9 */
    public C22306c<Pair<Links, Pair<List<ChatGroup>, List<ChatGroup>>>> m31873c9(final String str, final String str2) {
        return scheduled("/v3/chat-groups?keyword=" + str + str2, 0, new v9j() { // from class: l.ui7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.cl7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4736e.m31691W5(str, str);
                    }
                }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.dl7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Envelope envelope = (Envelope) obj;
                        return Pair.create(envelope.pagination.links, Pair.create(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups, ((CoreData) envelope.getModuleData(CoreData.class)).interestedGroups));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: d7 */
    public String m31874d7() {
        GroupSetting groupSetting = this.f19796r0.get();
        return NullChecker.m81303a(groupSetting) ? groupSetting.groupNotificationsURL : "";
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ C22306c m31875d8(final boolean z, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.ri7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4736e.m31785z3(z);
            }
        }).flatMap(new w9j() { // from class: l.si7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164687a.m31872c8(str, z, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public List<ChatGroupMember> m31876d9(String str, String str2) {
        return CoreModule.f17553k.f91952o.query(Filter.AND(ChatGroupMember.SEARCHCATEGORY.CONTAINS(str), ChatGroupMember.GROUPID.mo60175EQ(str2), ChatGroupMember.STATUS.NEQ(ChatGroupMemberStatus.exited)), null, 0);
    }

    /* JADX INFO: renamed from: e7 */
    public final C22306c<Data> m31877e7() {
        return scheduled("v3/group-settings", 0, new v9j() { // from class: l.bj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ck7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31347s()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.dk7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ roj0 m31878e8(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            this.f19774V.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: e9 */
    public C22306c<List<String>> m31879e9() {
        return scheduled("/v3/search-keywords", 0, new v9j() { // from class: l.xh7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.yj7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31335p()).m185887f().m185883b();
                    }
                }).compose(C4728a.m31252T2());
            }
        }).map(new w9j() { // from class: l.yh7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).keywords;
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public C22306c<List<GroupTab>> m31880f7() {
        return this.f19804z0.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m31881f8(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: f9 */
    public void m31882f9(@NonNull GroupTab groupTab) {
        this.f19798t0.m132487l(groupTab);
    }

    /* JADX INFO: renamed from: g7, reason: merged with bridge method [inline-methods] */
    public void m31792B7(List<Conversation> list) {
        for (Conversation conversation : list) {
            if (((DbLinks) CoreModule.f17553k.f91941d.query(conversation.f56011id)) == null) {
                DbLinks dbLinks = new DbLinks();
                dbLinks.f56011id = conversation.f56011id;
                PartialIdList partialIdList = conversation.api_only_messages;
                dbLinks.links = partialIdList == null ? new Links() : partialIdList.links;
                CoreModule.f17553k.f91941d.upsert(dbLinks);
            }
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ C22306c m31884g8(final String str, final GroupUpdateData groupUpdateData) {
        return ia20.m135121e(new v9j() { // from class: l.hj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "?method=patch")).m185893l(utc0.create(Network.JSON, groupUpdateData.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.jj7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118242a.m31881f8((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.kj7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: g9 */
    public final String m31885g9() {
        GroupTab groupTabM31891i9 = m31891i9();
        return (groupTabM31891i9 == null || this.f19803y0.equals(groupTabM31891i9)) ? "" : String.valueOf(groupTabM31891i9.f20407id);
    }

    /* JADX INFO: renamed from: h7 */
    public ChatGroup m31886h7(String str) {
        return CoreModule.f17553k.f91951n.queryCache(str);
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m31887h8(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: h9 */
    public C22306c<GroupTab> m31888h9() {
        return this.f19798t0.asObservable();
    }

    /* JADX INFO: renamed from: i7 */
    public C22306c<Conversation> m31889i7(final String str, final String str2, final String str3) {
        return CoreModule.f17545c.f19642f0.m32616Dg(str).take(1).flatMap(new w9j() { // from class: l.mg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133654a.m31830O7(str, str2, str3, (Conversation) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ C22306c m31890i8(final String str, final GroupUpdateData groupUpdateData) {
        return ia20.m135121e(new v9j() { // from class: l.gi7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "?method=patch")).m185893l(utc0.create(Network.JSON, groupUpdateData.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.hi7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107882a.m31887h8((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ii7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: i9 */
    public GroupTab m31891i9() {
        return this.f19798t0.m221515e();
    }

    /* JADX INFO: renamed from: j6 */
    public final String m31892j6(String str, String str2) {
        if (!str2.endsWith("&with=users")) {
            str2 = str2.concat("&with=users");
        }
        return C4728a.m31327n(str + "/members?" + str2);
    }

    /* JADX INFO: renamed from: j7 */
    public C22306c<Conversation> m31893j7(final String str, String str2, String str3) {
        return CoreModule.f17545c.f19645g0.m31902m6(str, str2, str3).flatMap(new w9j() { // from class: l.wg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32616Dg(str).take(1).doOnNext(new e30() { // from class: l.jh7
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        Conversation conversation = (Conversation) obj2;
                        lsi0.m151595y((NullChecker.m81303a(conversation) && TEnum.equals(ConversationStatus.get("default"), conversation.status)) ? CoreModule.f17544b.getString(R$string.f55771h) : CoreModule.f17544b.getString(R$string.f55770g));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m31894j8(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: j9 */
    public Conversation m31895j9(String str) {
        return this.f19795q0.get(str);
    }

    /* JADX INFO: renamed from: k6 */
    public final String m31896k6(String str) {
        return C4728a.m31327n(str + "/members");
    }

    /* JADX INFO: renamed from: k7 */
    public C22306c<roj0> m31897k7(String str, final JoinCondition joinCondition) {
        final String strM31327n = C4728a.m31327n(str + "?method=patch");
        return scheduled("patch/chat-groups/joinGroupType/" + str, -1, new v9j() { // from class: l.xg7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192741a.m31839R7(joinCondition, strM31327n);
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ C22306c m31898k8(final String str, final GroupUpdateData groupUpdateData) {
        return ia20.m135121e(new v9j() { // from class: l.qj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "?method=patch")).m185893l(utc0.create(Network.JSON, groupUpdateData.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.rj7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159654a.m31894j8((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.sj7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public final String m31899l6(String str, String str2) {
        return m31892j6(str, str2.replace("filter=default", ""));
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ void m31900l7(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ C22306c m31901l8(boolean z, String str, Envelope envelope) {
        if (!z && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers)) {
            ChatGroupMember chatGroupMember = ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers.get(0);
            if (NullChecker.m81303a(chatGroupMember.inModeration) && !TextUtils.isEmpty(chatGroupMember.inModeration.nickName)) {
                lsi0.m151595y("已提交，待审核通过后生效。");
                this.f72126Q.m31492w3(envelope, null);
                return C22306c.just(chatGroupMember);
            }
        }
        return m31844T6(str, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: m6 */
    public C22306c<roj0> m31902m6(final String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "join_group");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(Reason.TYPE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("scene", str3);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return scheduled("chat-groups/" + str + "/group-applies", -1, new v9j() { // from class: l.eh7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f91305a.m31903m7(str, jSONObject);
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.gh7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102637a.m31906n7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ C22306c m31903m7(final String str, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.sh7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "/group-applies")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.th7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170207a.m31900l7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m31904m8(final ChatGroupMember chatGroupMember, String str) {
        chatGroupMember.nickName = str;
        chatGroupMember.nickNamePinyin = evk.m118285c().m118288d(chatGroupMember.nickName).toUpperCase();
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kh7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91952o.upsert(chatGroupMember);
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public C22306c<roj0> m31905n6(final String str, final String str2, final boolean z) {
        return scheduled("/v3/banned-user/" + str + "/" + str2, -1, new v9j() { // from class: l.ei7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f91554a.m31912p7(z, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ roj0 m31906n7(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            GroupApply groupApply = ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies.get(0);
            this.f19774V.m132487l(groupApply);
            this.f19776X.put(groupApply.groupId, groupApply);
            this.f19777Y.m132487l(roj0.f160388a);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m31907n8(boolean z, final String str, final ChatGroupMember chatGroupMember) {
        if (z || !NullChecker.m81303a(chatGroupMember.inModeration) || TextUtils.isEmpty(chatGroupMember.inModeration.nickName)) {
            e51.m114774y(new Runnable() { // from class: l.sg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164372a.m31904m8(chatGroupMember, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o6 */
    public C22306c<ChatGroup> m31908o6(String str) {
        return CoreModule.f17553k.f91951n.uiGet(str).filter(new qh7());
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m31909o7(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ C22306c m31910o8(final String str, final boolean z, final String str2, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.bg7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/chat-groups/" + str + "?method=patch")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).flatMap(new w9j() { // from class: l.cg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80724a.m31901l8(z, str, (Envelope) obj);
            }
        }).filter(new dg7()).take(1).doOnNext(new e30() { // from class: l.eg7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90902a.m31907n8(z, str2, (ChatGroupMember) obj);
            }
        }).map(new w9j() { // from class: l.fg7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: p6 */
    public C22306c<CoreData> m31911p6(final String str) {
        return scheduled("/v3/chat-groups?search=quanzi&with=group-applies&keyword=" + str, 0, new v9j() { // from class: l.xj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.qk7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31207H2("/chat-groups?search=quanzi&with=group-applies,members&keyword=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.rk7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4736e.m31711c5((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ C22306c m31912p7(boolean z, final String str, final String str2) {
        final ChatGroupMember chatGroupMember = new ChatGroupMember();
        ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
        chatGroupSilence.enable = z;
        chatGroupSilence.duration = 600L;
        chatGroupMember.silence = chatGroupSilence;
        return ia20.m135121e(new v9j() { // from class: l.fl7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31351t(str, str2)).m185892k(utc0.create(Network.JSON, chatGroupMember.toJson())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.gl7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103300a.m31909o7((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.hl7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ C22306c m31913p8(final String str, final String str2, final boolean z) {
        return C22306c.fromCallable(new Callable() { // from class: l.xk7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4736e.m31770u3(str);
            }
        }).flatMap(new w9j() { // from class: l.yk7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198729a.m31910o8(str2, z, str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public C22306c<roj0> m31914q6() {
        return m31941z6().flatMap(new w9j() { // from class: l.ug7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176359a.m31915q7((String) obj);
            }
        }).map(new w9j() { // from class: l.fh7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97487a.m31918r7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ C22306c m31915q7(final String str) {
        return scheduled("/v3/chat-groups?search=suggested/" + str, 0, new v9j() { // from class: l.ji7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.il7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31339q(str)).m185887f().m185883b();
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m31916q8(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: r6 */
    public C22306c<roj0> m31917r6(final String str) {
        final String strM31885g9 = m31885g9();
        return scheduled("/v3/chat-groups?search=suggested/" + strM31885g9 + "/&" + str, 0, new v9j() { // from class: l.zk7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.wf7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31339q(str) + "&" + str).m185887f().m185883b();
                    }
                }).compose(C4728a.m31252T2());
            }
        }).map(new w9j() { // from class: l.bl7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76167a.m31921s7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ roj0 m31918r7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups);
        this.f19776X.clear();
        this.f19773U.m132487l(new Pair<>(envelope.pagination.links, arrayList));
        this.f19779a0.m132487l(new knb0<>(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups, ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers, ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies, ((CommonData) envelope.getModuleData(CommonData.class)).users));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ C22306c m31919r8(final String str, final e30 e30Var, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.xf7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "/members?method=patch")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.zf7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202921a.m31916q8((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ag7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4736e.m31745l5(e30Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public ChatGroup m31920s6(String str) {
        return CoreModule.f17553k.f91951n.queryCache(str);
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ roj0 m31921s7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups);
        Pair<Links, List<ChatGroup>> pairM221515e = this.f19773U.m221515e();
        final List arrayList2 = pairM221515e == null ? new ArrayList() : (List) pairM221515e.second;
        arrayList2.addAll(vwb.m200339n(arrayList, new w9j() { // from class: l.of7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200337m(arrayList2, new w9j() { // from class: l.rg7
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((ChatGroup) obj2).f56011id.equals(chatGroup.f56011id));
                    }
                }));
            }
        }));
        this.f19773U.m132487l(new Pair<>(envelope.pagination.links, arrayList2));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ C22306c m31922s8(final List list, final String str, final e30 e30Var) {
        return C22306c.fromCallable(new Callable() { // from class: l.sk7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4736e.m31647I4(list);
            }
        }).flatMap(new w9j() { // from class: l.tk7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170819a.m31919r8(str, e30Var, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public void m31923t6() {
        this.f72126Q.f19642f0.m32963gf().observeOn(Schedulers.m221493io()).first().map(new w9j() { // from class: l.fj7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97761a.m31924t7((List) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.gj7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4736e.m31779x3(obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ Object m31924t7(List list) {
        Conversation conversation = (Conversation) list.get(0);
        String str = System.currentTimeMillis() + "";
        final Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.f56011id = "30909999";
        conversationMo223809clone.convType = "group";
        conversationMo223809clone.otherUser = str;
        final ChatGroup chatGroupNew_ = ChatGroup.new_();
        chatGroupNew_.f56011id = str;
        chatGroupNew_.name = "探探员工大群";
        ArrayList arrayList = new ArrayList();
        User userM169433Q9 = this.f72126Q.f19639e0.m169433Q9(conversation.otherUser);
        Iterator<Media> it = userM169433Q9.pictures.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().cover().profileSmall().formatted());
        }
        chatGroupNew_.ownerUserId = userM169433Q9.f56011id;
        List<Message> listQuery = CoreModule.f17553k.f91940c.query(Filter.TRUE, Message.CREATEDTIME.DESC, 500);
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        if (!vwb.m200296J(listQuery)) {
            for (Message message : listQuery) {
                Message messageMo223809clone = message.mo223809clone();
                messageMo223809clone.f56011id += "1";
                messageMo223809clone.cid = "30909999";
                messageMo223809clone.channel = MessageChannel.get("group");
                messageMo223809clone.status = MessageStatus.get("default");
                arrayList2.add(messageMo223809clone);
                ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
                String str2 = message.owner;
                chatGroupMemberNew_.f56011id = str2;
                chatGroupMemberNew_.groupId = str;
                chatGroupMemberNew_.userId = str2;
                User userM169433Q10 = CoreModule.f17545c.f19639e0.m169433Q9(str2);
                chatGroupMemberNew_.avatar = userM169433Q10.pictures.get(0).cover().profileSmall().formatted();
                chatGroupMemberNew_.nickName = userM169433Q10.name;
                chatGroupMemberNew_.nickNamePinyin = evk.m118285c().m118288d(chatGroupMemberNew_.nickName).toUpperCase();
                chatGroupMemberNew_.searchCategory = chatGroupMemberNew_.nickName + "|" + chatGroupMemberNew_.nickNamePinyin;
                double d = userM169433Q10.createdTime;
                chatGroupMemberNew_.createdTime = d;
                chatGroupMemberNew_.updatedTime = d;
                arrayList3.add(chatGroupMemberNew_);
            }
        }
        this.f72126Q.m31492w3(Envelope.new_(), new d30() { // from class: l.jl7
            @Override // p149l.d30
            public final void call() {
                C4736e.m31769t5(chatGroupNew_, conversationMo223809clone, arrayList2, arrayList3);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m31925t8(Data data) {
        m31814I8(((CoreData) data.getModuleData(CoreData.class)).groupTabs);
        this.f19769A0.m121236q();
        if (vwb.m200296J(((CoreData) data.getModuleData(CoreData.class)).groupSettings)) {
            return;
        }
        this.f19796r0.put(((CoreData) data.getModuleData(CoreData.class)).groupSettings.get(0));
    }

    /* JADX INFO: renamed from: u6 */
    public void m31926u6(final boolean z, final boolean z2) {
        C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.zi7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203298a.m31927u7(z, z2, (roj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.aj7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4736e.m31660M4((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ roj0 m31927u7(boolean z, boolean z2, roj0 roj0Var) {
        wxz wxzVar = CoreModule.f17553k.f91940c;
        Filter filter = Filter.TRUE;
        final Message messageMo223809clone = wxzVar.query(filter, Message.CREATEDTIME.DESC, 1).get(0).mo223809clone();
        List<User> listQuery = qib0.f154722k0.f176631d.query(filter, User._ID.DESC, 30);
        Conversation conversation = CoreModule.f17553k.f91950m.query(Conversation.CONVTYPE.CONTAINS("group"), Conversation._ID.DESC, 1).get(0);
        User userMo223809clone = listQuery.get(0).mo223809clone();
        messageMo223809clone.f56011id = System.currentTimeMillis() + "";
        messageMo223809clone.owner = userMo223809clone.f56011id;
        messageMo223809clone.cid = conversation.f56011id;
        messageMo223809clone.channel = MessageChannel.get("group");
        messageMo223809clone.status = MessageStatus.get("default");
        messageMo223809clone.messageType = MessageType.get("text");
        messageMo223809clone.createdTime = System.currentTimeMillis();
        messageMo223809clone.localCreatedTime = System.currentTimeMillis();
        long jCurrentTimeMillis = (System.currentTimeMillis() % 5) + 35;
        messageMo223809clone.value = "";
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jCurrentTimeMillis; i++) {
            messageMo223809clone.value += m31655K6();
            if (i % 5 == 0) {
                messageMo223809clone.value += "＄";
                arrayList.add(listQuery.get(1).f56011id);
            }
            if (z && i % 11 == 0) {
                messageMo223809clone.value += "＄";
                arrayList.add("0");
            }
            if (z2 && i % 9 == 0) {
                messageMo223809clone.value += "＄";
                arrayList.add(CoreModule.f17545c.f19639e0.m169520na().f56011id);
            }
        }
        messageMo223809clone.notifiedUsers = arrayList;
        final ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
        String str = System.currentTimeMillis() + "";
        chatGroupMemberNew_.f56011id = str.substring(5, str.length());
        chatGroupMemberNew_.groupId = conversation.otherUser;
        chatGroupMemberNew_.userId = userMo223809clone.f56011id;
        chatGroupMemberNew_.avatar = userMo223809clone.pictures.get(0).cover().profileSmall().formatted();
        chatGroupMemberNew_.nickName = userMo223809clone.name;
        chatGroupMemberNew_.nickNamePinyin = evk.m118285c().m118288d(chatGroupMemberNew_.nickName).toUpperCase();
        chatGroupMemberNew_.searchCategory = chatGroupMemberNew_.nickName + "|" + chatGroupMemberNew_.nickNamePinyin;
        double d = userMo223809clone.createdTime;
        chatGroupMemberNew_.createdTime = d;
        chatGroupMemberNew_.updatedTime = d;
        this.f72126Q.m31492w3(Envelope.new_(), new d30() { // from class: l.wk7
            @Override // p149l.d30
            public final void call() {
                C4736e.m31727g5(messageMo223809clone, chatGroupMemberNew_);
            }
        });
        return roj0Var;
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ roj0 m31928u8(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).notificationCounters)) {
            this.f19775W.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).notificationCounters.get(0));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v6 */
    public void m31929v6() {
        C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.oj7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144254a.m31930v7((roj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pj7
            @Override // p149l.e30
            public final void call(Object obj) {
                C4736e.m31773v3((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ roj0 m31930v7(roj0 roj0Var) {
        final Message messageMo223809clone = CoreModule.f17553k.f91940c.query(Filter.TRUE, Message.CREATEDTIME.DESC, 1).get(0).mo223809clone();
        Conversation conversation = CoreModule.f17553k.f91950m.query(Conversation.CONVTYPE.CONTAINS("group"), Conversation._ID.DESC, 1).get(0);
        messageMo223809clone.f56011id = System.currentTimeMillis() + "";
        StringBuilder sb = new StringBuilder("39009");
        sb.append(System.currentTimeMillis() / Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        messageMo223809clone.owner = sb.toString();
        messageMo223809clone.cid = conversation.f56011id;
        messageMo223809clone.channel = MessageChannel.get("group");
        messageMo223809clone.status = MessageStatus.get("default");
        messageMo223809clone.messageType = MessageType.get("text");
        messageMo223809clone.createdTime = System.currentTimeMillis();
        messageMo223809clone.localCreatedTime = System.currentTimeMillis();
        System.currentTimeMillis();
        messageMo223809clone.value = "这个是一个没有用户信息的消息哦";
        this.f72126Q.m31492w3(Envelope.new_(), new d30() { // from class: l.df7
            @Override // p149l.d30
            public final void call() {
                C4736e.m31774v4(messageMo223809clone);
            }
        });
        return roj0Var;
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ C22306c m31931v8() {
        return ia20.m135121e(new v9j() { // from class: l.ni7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31343r()).m185887f().m185883b();
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.oi7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144097a.m31928u8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public C22306c<roj0> m31932w6(String str, String str2) {
        return m31935x6(str, str2, null);
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m31933w7(String str, String str2) {
        CoreModule.f17553k.f91950m.delete(Filter.AND(Conversation.f20372ID.mo60175EQ(str), Conversation.CONVTYPE.mo60175EQ("group"), Conversation.OTHERUSER.mo60175EQ(str2)));
        CoreModule.f17553k.f91951n.delete(str2);
        CoreModule.f17553k.f91952o.delete(ChatGroupMember.GROUPID.mo60175EQ(str2));
        qib0.f154722k0.f176630c.delete(m31896k6(str2));
        CoreModule.f17545c.f19642f0.m32728Mh(str);
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m31934w8(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }

    /* JADX INFO: renamed from: x6 */
    public C22306c<roj0> m31935x6(final String str, final String str2, final d30 d30Var) {
        return scheduled("me/chat-groups/" + str + "/delete", -1, new v9j() { // from class: l.ci7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81040a.m31942z7(str, str2, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ void m31936x7(final String str, final String str2, Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hk7
            @Override // p149l.d30
            public final void call() {
                this.f108161a.m31933w7(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ Object m31937x8(final String str, w9j w9jVar, Envelope envelope) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
                GroupApply groupApplyNew_ = GroupApply.new_();
                groupApplyNew_.groupId = str;
                ChatGroup chatGroup = (ChatGroup) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups, new w9j() { // from class: l.vf7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((ChatGroup) obj).f56011id.equals(str));
                    }
                });
                if (NullChecker.m81303a(chatGroup)) {
                    if (TEnum.equals(chatGroup.groupApply.status, "approved")) {
                        groupApplyNew_.status = GroupApplyStatus.get("approved");
                    } else {
                        groupApplyNew_.status = GroupApplyStatus.get("unknown_");
                    }
                }
                this.f19776X.put(str, groupApplyNew_);
                this.f19777Y.m132487l(roj0.f160388a);
            }
            this.f19774V.m132487l(null);
        } else {
            GroupApply groupApply = ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies.get(0);
            this.f19774V.m132487l(groupApply);
            this.f19776X.put(groupApply.groupId, groupApply);
            this.f19777Y.m132487l(roj0.f160388a);
        }
        return w9jVar.call(envelope);
    }

    /* JADX INFO: renamed from: y6 */
    public C22306c<roj0> m31938y6() {
        return this.f19778Z.asObservable();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ roj0 m31939y7(String str, d30 d30Var, Envelope envelope) {
        GroupApply groupApplyNew_ = GroupApply.new_();
        groupApplyNew_.groupId = str;
        groupApplyNew_.status = GroupApplyStatus.get("unknown_");
        this.f19776X.put(str, groupApplyNew_);
        C22392a<roj0> c22392a = this.f19777Y;
        roj0 roj0Var = roj0.f160388a;
        c22392a.m132487l(roj0Var);
        this.f19778Z.m132487l(roj0Var);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ C22306c m31940y8(final String str, final w9j w9jVar) {
        return ia20.m135121e(new v9j() { // from class: l.zj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31327n(str + "?with=members,users,group-applies")).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.ak7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70251a.m31934w8((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.bk7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75969a.m31937x8(str, w9jVar, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final C22306c<String> m31941z6() {
        return this.f19804z0.m221515e() == null ? this.f19769A0.m121230k().asObservable().take(1).doOnNext(new e30() { // from class: l.ki7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123273a.m31814I8((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.li7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128171a.m31789A7((List) obj);
            }
        }) : C22306c.just(m31885g9());
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ C22306c m31942z7(final String str, final String str2, final d30 d30Var) {
        return ia20.m135121e(new v9j() { // from class: l.cj7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/chat-groups/" + str)).m185885d().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.dj7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86506a.m31936x7(str2, str, (Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ej7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91672a.m31939y7(str, d30Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m31943z8(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
    }
}
