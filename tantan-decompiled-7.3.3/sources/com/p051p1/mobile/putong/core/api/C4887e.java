package com.p051p1.mobile.putong.core.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4887e;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.BulkGroupInviteMessages;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p051p1.mobile.putong.core.data.ChatGroupSilence;
import com.p051p1.mobile.putong.core.data.ChatGroupTopic;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupApplyStatus;
import com.p051p1.mobile.putong.core.data.GroupAttribute;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.core.data.GroupInvitation;
import com.p051p1.mobile.putong.core.data.GroupNotification;
import com.p051p1.mobile.putong.core.data.GroupSetting;
import com.p051p1.mobile.putong.core.data.GroupTab;
import com.p051p1.mobile.putong.core.data.GroupUpdateData;
import com.p051p1.mobile.putong.core.data.JoinCondition;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageChannel;
import com.p051p1.mobile.putong.core.data.MessageStatus;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationCounter;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.SettingGroupManager;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.bkj0;
import p153l.byd0;
import p153l.dji;
import p153l.dy6;
import p153l.dyd0;
import p153l.fo0;
import p153l.gta;
import p153l.hh7;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.mof0;
import p153l.mxd0;
import p153l.o1j0;
import p153l.ovb0;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.t600;
import p153l.tzi0;
import p153l.ui7;
import p153l.uqb0;
import p153l.uxj0;
import p153l.uxk;
import p153l.vod;
import p153l.x1d0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e */
/* JADX INFO: loaded from: classes9.dex */
public class C4887e extends dy6 {

    /* JADX INFO: renamed from: B0 */
    public static int f20506B0 = 500;

    /* JADX INFO: renamed from: C0 */
    public static jxd0 f20507C0;

    /* JADX INFO: renamed from: D0 */
    public static jxd0 f20508D0;

    /* JADX INFO: renamed from: E0 */
    public static jxd0 f20509E0;

    /* JADX INFO: renamed from: F0 */
    public static jxd0 f20510F0;

    /* JADX INFO: renamed from: A0 */
    public final b f20511A0;

    /* JADX INFO: renamed from: R */
    public mxd0 f20512R;

    /* JADX INFO: renamed from: S */
    public mxd0 f20513S;

    /* JADX INFO: renamed from: T */
    public C22507a<uxj0> f20514T;

    /* JADX INFO: renamed from: U */
    public C22507a<Pair<Links, List<ChatGroup>>> f20515U;

    /* JADX INFO: renamed from: V */
    public C22507a<GroupApply> f20516V;

    /* JADX INFO: renamed from: W */
    public C22507a<NotificationCounter> f20517W;

    /* JADX INFO: renamed from: X */
    public HashMap<String, GroupApply> f20518X;

    /* JADX INFO: renamed from: Y */
    public C22507a<uxj0> f20519Y;

    /* JADX INFO: renamed from: Z */
    public C22507a<uxj0> f20520Z;

    /* JADX INFO: renamed from: a0 */
    public C22507a<ovb0<List<ChatGroup>, List<ChatGroupMember>, List<GroupApply>, List<User>>> f20521a0;

    /* JADX INFO: renamed from: b0 */
    public C22507a<Pair<String, bkj0<List<ChatGroup>, List<ChatGroupMember>, List<Conversation>>>> f20522b0;

    /* JADX INFO: renamed from: c0 */
    public C22507a<Integer> f20523c0;

    /* JADX INFO: renamed from: d0 */
    public C22507a<bkj0<List<ChatGroup>, List<ChatGroupMember>, List<Conversation>>> f20524d0;

    /* JADX INFO: renamed from: e0 */
    public Set<String> f20525e0;

    /* JADX INFO: renamed from: f0 */
    public C22508b<ChatGroupTopic> f20526f0;

    /* JADX INFO: renamed from: g0 */
    public C22508b<String> f20527g0;

    /* JADX INFO: renamed from: h0 */
    public jxd0 f20528h0;

    /* JADX INFO: renamed from: i0 */
    public C22508b<uxj0> f20529i0;

    /* JADX INFO: renamed from: j0 */
    public String f20530j0;

    /* JADX INFO: renamed from: k0 */
    public byd0 f20531k0;

    /* JADX INFO: renamed from: l0 */
    public C22508b<uxj0> f20532l0;

    /* JADX INFO: renamed from: m0 */
    public C22508b<Integer> f20533m0;

    /* JADX INFO: renamed from: n0 */
    public C22508b<uxj0> f20534n0;

    /* JADX INFO: renamed from: o0 */
    public C22508b<Pair<String, String>> f20535o0;

    /* JADX INFO: renamed from: p0 */
    public HashMap<String, Integer> f20536p0;

    /* JADX INFO: renamed from: q0 */
    public Map<String, Conversation> f20537q0;

    /* JADX INFO: renamed from: r0 */
    public dyd0<GroupSetting> f20538r0;

    /* JADX INFO: renamed from: s0 */
    public String f20539s0;

    /* JADX INFO: renamed from: t0 */
    public final C22507a<GroupTab> f20540t0;

    /* JADX INFO: renamed from: u0 */
    public C22507a<Pair<Links, List<GroupNotification>>> f20541u0;

    /* JADX INFO: renamed from: v0 */
    public C22508b<ovb0<List<Conversation>, CoreData, Links, Integer>> f20542v0;

    /* JADX INFO: renamed from: w0 */
    public C22508b<Pair<String, ArrayList<Media>>> f20543w0;

    /* JADX INFO: renamed from: x0 */
    public C22507a<List<GroupAttribute>> f20544x0;

    /* JADX INFO: renamed from: y0 */
    public final GroupTab f20545y0;

    /* JADX INFO: renamed from: z0 */
    public final C22507a<List<GroupTab>> f20546z0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e$a */
    public class a extends dyd0<GroupSetting> {
        public a(String str, GroupSetting groupSetting) {
            super(str, groupSetting);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull @NotNull GroupSetting groupSetting, GroupSetting groupSetting2) {
            return groupSetting.equals(groupSetting2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroupSetting copyed(GroupSetting groupSetting, @NonNull @NotNull GroupSetting groupSetting2) {
            return groupSetting2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GroupSetting retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            if (string == null) {
                return (GroupSetting) this.defaultValue;
            }
            try {
                return GroupSetting.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                return (GroupSetting) this.defaultValue;
            }
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(GroupSetting groupSetting) {
            return pref().edit().putString(this.f111993id, groupSetting.toJson());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e$b */
    public class b extends mof0<List<GroupTab>> {
        public b() {
            super("chat_group_tabs", new dji(new vod("chat_group_tabs", "_1", null), -1, GroupTab.PROTOBUF_ADAPTER.ARRAY_ADAPTER()), new pcj() { // from class: l.qm7
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4887e.b.m32951B(c4887e);
                }
            });
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ C22421c m32951B(C4887e c4887e) {
            return c4887e.f20546z0.m222761e() != null ? C22421c.just((List) c4887e.f20546z0.m222761e()) : C22421c.just(new ArrayList());
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        f20507C0 = new jxd0("chat_v3_enable", bool);
        f20508D0 = new jxd0("check_id", bool);
        f20509E0 = new jxd0("show_group_tips", bool);
        f20510F0 = new jxd0("has_in_group", Boolean.FALSE);
    }

    public C4887e(C4883c c4883c) {
        super(c4883c);
        this.f20514T = C22507a.m222758b();
        this.f20515U = C22507a.m222758b();
        this.f20516V = C22507a.m222758b();
        this.f20517W = C22507a.m222758b();
        this.f20518X = new HashMap<>();
        this.f20519Y = C22507a.m222758b();
        this.f20520Z = C22507a.m222758b();
        this.f20521a0 = C22507a.m222758b();
        this.f20522b0 = C22507a.m222758b();
        this.f20523c0 = C22507a.m222758b();
        this.f20524d0 = C22507a.m222758b();
        this.f20525e0 = new HashSet();
        this.f20526f0 = C22508b.m222767b();
        this.f20527g0 = C22508b.m222767b();
        this.f20528h0 = new jxd0("group_topic_roaming_first_experience_" + CoreModule.m30929H().userId(), Boolean.TRUE);
        this.f20529i0 = C22508b.m222767b();
        this.f20530j0 = "";
        this.f20532l0 = C22508b.m222767b();
        this.f20533m0 = C22508b.m222767b();
        this.f20534n0 = C22508b.m222767b();
        this.f20535o0 = C22508b.m222767b();
        this.f20536p0 = new HashMap<>();
        this.f20537q0 = new HashMap();
        this.f20538r0 = new a("local_group_chat_setting", GroupSetting.new_());
        this.f20539s0 = "limit=50&filter=default&with=users";
        this.f20540t0 = C22507a.m222758b();
        this.f20541u0 = C22507a.m222758b();
        this.f20542v0 = C22508b.m222767b();
        this.f20543w0 = C22508b.m222767b();
        this.f20544x0 = C22507a.m222758b();
        this.f20545y0 = GroupTab.new_();
        this.f20546z0 = C22507a.m222758b();
        this.f20511A0 = new b();
        this.f20531k0 = new byd0("last_group_members_load_time", 0L);
        this.f20512R = new mxd0("last_tab_dot_show_time_" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f20513S = new mxd0("last_tab_dot_click_time_" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        gta.m132210e().m132214d().mo34681E8(this.f20536p0);
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ JSONObject m32630B5(JoinCondition joinCondition) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("joinCondition", joinCondition);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ JSONObject m32650I4(List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        jyb.m147537z(list, new y20() { // from class: l.xg7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4887e.m32687U4(jSONArray, (String) obj);
            }
        });
        jSONObject.put("chatGroupMembers", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: K6 */
    public static char m32658K6() {
        return (char) (((int) (Math.random() * 20902.0d)) + 19968);
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m32663M4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ String m32686U3(String str, List list) {
        BulkGroupInviteMessages bulkGroupInviteMessagesNew_ = BulkGroupInviteMessages.new_();
        bulkGroupInviteMessagesNew_.message.messageType = MessageType.get(MessageType.group_invitation);
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        GroupInvitation groupInvitationNew_ = GroupInvitation.new_();
        Target target = groupInvitationNew_.target;
        target.f21262id = str;
        target.type = "chatGroups";
        messageAdditionalDataNew_.groupInvitation = groupInvitationNew_;
        bulkGroupInviteMessagesNew_.message.additionalData = messageAdditionalDataNew_;
        bulkGroupInviteMessagesNew_.toUserIds = list;
        return bulkGroupInviteMessagesNew_.toJson();
    }

    /* JADX INFO: renamed from: U4 */
    public static /* synthetic */ void m32687U4(JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, ChatGroupMemberStatus.exited);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ x1d0 m32694W5(String str, String str2) {
        String strM32334o;
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        if (TextUtils.isEmpty(str)) {
            strM32334o = C4879a.m32334o(str2);
        } else {
            strM32334o = C4879a.m32334o(str2 + "&" + str);
        }
        return c21228aAuth.m209043q(strM32334o).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m32699Y4(Throwable th) {
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ CoreData m32714c5(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ ChatGroup m32729g4(Envelope envelope) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).chatGroups.get(0);
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m32730g5(Message message, ChatGroupMember chatGroupMember) {
        CoreModule.f18272k.f115535c.upsert(message);
        CoreModule.f18272k.f115547o.upsert(chatGroupMember);
        o1j0.m165636j("插入完成");
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m32736i3(ArrayList arrayList, final String str, DbLinks dbLinks) {
        jyb.m147537z(arrayList, new y20() { // from class: l.tg7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18272k.f115547o.delete(Filter.AND(ChatGroupMember.GROUPID.mo61359EQ(str), ChatGroupMember.USERID.mo61359EQ(((ChatGroupMember) obj).userId)));
            }
        });
        uqb0.f180405k0.f184354c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ uxj0 m32748l5(y20 y20Var, Envelope envelope) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ String m32761q3(String str, Action action) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        SettingGroupManager settingGroupManagerNew_ = SettingGroupManager.new_();
        settingGroupManagerNew_.action = action;
        settingGroupManagerNew_.adminUserIds = arrayList;
        return settingGroupManagerNew_.toJson();
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m32772t5(ChatGroup chatGroup, Conversation conversation, List list, List list2) {
        CoreModule.f18272k.f115546n.upsert(chatGroup);
        CoreModule.f18272k.f115545m.upsert(conversation);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoreModule.f18272k.f115535c.upsert((Message) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ChatGroupMember chatGroupMember = (ChatGroupMember) it2.next();
            if (NullChecker.m82486a(chatGroupMember)) {
                CoreModule.f18272k.f115547o.upsert(chatGroupMember);
            }
        }
        o1j0.m165636j("插入完成");
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ JSONObject m32773u3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nickName", str);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m32776v3(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m32777v4(Message message) {
        CoreModule.f18272k.f115535c.upsert(message);
        o1j0.m165636j("插入完成");
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m32782x3(Object obj) {
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ JSONObject m32788z3(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("muted", z);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: A6 */
    public C22421c<uxj0> m32791A6() {
        return this.f20519Y.asObservable();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ C22421c m32792A7(List list) {
        return C22421c.just(m32888g9());
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ C22421c m32793A8(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.mg7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "/members/" + str2 + "?with=users")).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.ng7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141796a.m32946z8((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.og7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: B6 */
    public HashMap<String, GroupApply> m32794B6() {
        return this.f20518X;
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ uxj0 m32796B8(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!jyb.m147479J(coreData.notificationCounters)) {
            this.f20523c0.m137019l(Integer.valueOf(coreData.notificationCounters.get(0).unread));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: C6 */
    public C22421c<GroupApply> m32797C6() {
        return this.f20516V.asObservable();
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ uxj0 m32798C7(final String str, int i, Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        final ArrayList arrayList = new ArrayList(coreData.conversations);
        int iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.xh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                String str2 = str;
                return Boolean.valueOf(!TextUtils.isEmpty(str2) && TextUtils.equals(((Conversation) obj).f56859id, str2));
            }
        });
        if (iM147476G != -1) {
            ((Conversation) arrayList.get(iM147476G)).unreadMessages = 0;
        }
        coreData.conversations.clear();
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.zh7
            @Override // p153l.x20
            public final void call() {
                this.f204386a.m32795B7(arrayList);
            }
        });
        this.f20542v0.m137019l(jyb.m147495Z(arrayList, coreData, envelope.pagination.links, Integer.valueOf(i)));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ C22421c m32799C8(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.ug7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32218J2("/" + str + "/notification-counters?source=topic")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.vg7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184003a.m32796B8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public C22507a<Pair<Links, List<GroupNotification>>> m32800D6() {
        return this.f20541u0;
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m32801D7(Throwable th) {
        this.f20542v0.m137019l(jyb.m147495Z(null, null, null, null));
    }

    /* JADX INFO: renamed from: D8 */
    public final C22421c<uxj0> m32802D8(final String str, final DbLinks dbLinks) {
        return dbLinks.links.next == null ? C22421c.just(uxj0.f181467a) : C22421c.fromCallable(new Callable() { // from class: l.pk7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f152800a.m32848T7(str, dbLinks);
            }
        }).doOnNext(new y20() { // from class: l.qk7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158101a.m32851U7(str, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public GroupSetting m32803E6() {
        return this.f20538r0.get();
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ C22421c m32804E7(final String str, final String str2, final int i) {
        return qi20.m176658e(new pcj() { // from class: l.kh7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.lh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132074a.m32798C7(str2, i, (Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.mh7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136830a.m32801D7((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E8, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22421c<uxj0> m32866Z7(final String str, final DbLinks dbLinks) {
        return this.f91137Q.scheduled("group/" + str + "/members/get", 0, new pcj() { // from class: l.gg7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103993a.m32863Y7(dbLinks, str);
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public C22421c<uxj0> m32806F6(int i) {
        return m32809G6("", "", i);
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ List m32807F7(Envelope envelope) {
        this.f20544x0.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).groupAttributes);
        return ((CoreData) envelope.getModuleData(CoreData.class)).groupAttributes;
    }

    /* JADX INFO: renamed from: F8 */
    public final C22421c<uxj0> m32808F8(final String str, final DbLinks dbLinks) {
        return C22421c.fromCallable(new Callable() { // from class: l.xj7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f194538a.m32869a8(str, dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public C22421c<uxj0> m32809G6(String str, final String str2, final int i) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(C4879a.m32218J2("/" + CoreModule.m30929H().userId()));
        sb.append("/conversations?filter=topicGroups&with=chat-groups,messages,members,users");
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "&" + str;
        }
        sb.append(str3);
        final String string = sb.toString();
        return scheduled("/v3/conversations/topicGroups/", 0, new pcj() { // from class: l.im7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f115704a.m32804E7(string, str2, i);
            }
        });
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m32810G7(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: G8 */
    public C22421c<uxj0> m32811G8(final String str, final boolean z) {
        return scheduled("conversations/" + str + "/muted", -1, new pcj() { // from class: l.bk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f77048a.m32878d8(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public C22421c<ChatGroup> m32812H6(final String str) {
        return scheduled("chat-groups/" + str, 0, new pcj() { // from class: l.zl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.oh7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "?with=members,users")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ph7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4887e.m32729g4((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C22421c m32813H7(final GroupCreate groupCreate) {
        return qi20.m176658e(new pcj() { // from class: l.rh7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32263W()).m209038l(z1d0.create(Network.JSON, groupCreate.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.sh7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168600a.m32810G7((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.th7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: H8 */
    public C22421c<NotificationCounter> m32814H8() {
        return this.f20517W.asObservable();
    }

    /* JADX INFO: renamed from: I6 */
    public C22421c<List<ChatGroup>> m32815I6() {
        return CoreModule.f18272k.f115546n.m213119F().m208677m();
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m32816I7(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: I8 */
    public final void m32817I8(List<GroupTab> list) {
        this.f20546z0.m137019l(list);
        boolean zM147479J = jyb.m147479J(list);
        C22507a<GroupTab> c22507a = this.f20540t0;
        if (zM147479J) {
            c22507a.m137019l(this.f20545y0);
            return;
        }
        GroupTab groupTabM222761e = c22507a.m222761e();
        if (groupTabM222761e == null || !list.contains(groupTabM222761e)) {
            m32885f9(list.get(0));
        }
    }

    /* JADX INFO: renamed from: J6 */
    public int m32818J6(String str) {
        if (this.f20536p0.containsKey(str)) {
            return this.f20536p0.get(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ C22421c m32819J7(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.yi7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, str2)).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.zi7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204495a.m32816I7((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.aj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: J8 */
    public C22421c<uxj0> m32820J8(final String str, GroupApplyStatus groupApplyStatus) {
        final String str2 = "{\"status\":\"" + groupApplyStatus.toString() + "\"}";
        return scheduled(C4879a.m32336o1(str), -1, new pcj() { // from class: l.pg7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.uh7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32336o1(str)).m209038l(z1d0.create(Network.JSON, str)).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.qg7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157383a.m32881e8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ C22421c m32821K7(final String str, final Action action, final String str2) {
        return C22421c.fromCallable(new Callable() { // from class: l.li7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4887e.m32761q3(str, action);
            }
        }).flatMap(new qcj() { // from class: l.mi7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136931a.m32819J7(str2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K8 */
    public C22421c<uxj0> m32822K8(final String str, List<Picture> list) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.avatars = list;
        return scheduled("patch/chat-groups/avatars/" + str, -1, new pcj() { // from class: l.fj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f99303a.m32887g8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public C22507a<Pair<Links, List<ChatGroup>>> m32823L6() {
        return this.f20515U;
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m32824L7(String str, boolean z, String str2, ChatGroupMember chatGroupMember) {
        if (!NullChecker.m82486a(chatGroupMember)) {
            if (z) {
                return;
            }
            m32867Z8(str2, str);
        } else if (TextUtils.isEmpty(chatGroupMember.groupMemberName()) || TextUtils.isEmpty(chatGroupMember.avatar)) {
            CoreModule.f18264c.f20381e0.m116527W9(str);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public C22421c<uxj0> m32825L8(final String str, String str2) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.description = str2;
        return scheduled("patch/chat-groups/description/" + str, -1, new pcj() { // from class: l.tl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f174790a.m32893i8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public C22421c<GroupApply> m32826M6(final String str) {
        if (this.f20516V.m222761e() == null || !str.equals(this.f20516V.m222761e().groupId)) {
            this.f20516V.m137019l(null);
        }
        return this.f20516V.asObservable().filter(new qcj() { // from class: l.ej7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                GroupApply groupApply = (GroupApply) obj;
                return Boolean.valueOf(groupApply == null || str.equals(groupApply.groupId));
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ uxj0 m32827M7(Envelope envelope) {
        this.f20541u0.m137019l(new Pair<>(envelope.pagination.links, ((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: M8 */
    public C22421c<uxj0> m32828M8(final String str, String str2) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.name = str2;
        return scheduled("patch/chat-groups/name/" + str, -1, new pcj() { // from class: l.mk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137246a.m32901k8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public C22421c<List<GroupAttribute>> m32829N6() {
        return scheduled(C4879a.m32260V(), 0, new pcj() { // from class: l.tj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.lg7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32260V()).m209032f().m209028b();
                    }
                }).compose(C4879a.m32255T2());
            }
        }).map(new qcj() { // from class: l.uj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179183a.m32807F7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ uxj0 m32830N7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(((CoreData) envelope.getModuleData(CoreData.class)).groupNotifications);
        Pair<Links, List<GroupNotification>> pairM222761e = this.f20541u0.m222761e();
        final List arrayList2 = pairM222761e == null ? new ArrayList() : (List) pairM222761e.second;
        arrayList2.addAll(jyb.m147522n(arrayList, new qcj() { // from class: l.yl7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147520m(arrayList2, new qcj() { // from class: l.wg7
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((GroupNotification) obj2).f21148id.equals(groupNotification.f21148id));
                    }
                }));
            }
        }));
        this.f20541u0.m137019l(new Pair<>(envelope.pagination.links, arrayList2));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: N8 */
    public C22421c<uxj0> m32831N8(final String str, final String str2, final boolean z) {
        return scheduled("patch/chat-groups/nickname/" + str, -1, new pcj() { // from class: l.hj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f110162a.m32916p8(str2, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public C22421c<uxj0> m32832O6(final String str, final List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4879a.m32369w2("/" + CoreModule.m30929H().userId()));
        sb.append("/bulk-messages");
        final String string = sb.toString();
        return scheduled(CoreModule.m30929H().userId() + "/bulk-messages", -1, new pcj() { // from class: l.di7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.ei7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4887e.m32686U3(str, list);
                    }
                }).flatMap(new qcj() { // from class: l.fi7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return qi20.m176658e(new pcj() { // from class: l.pi7
                            @Override // p153l.pcj, java.util.concurrent.Callable
                            public final Object call() {
                                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, str)).m209028b();
                            }
                        }).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.qi7
                            @Override // p153l.y20
                            public final void call(Object obj2) {
                                o1j0.m165649w(R$string.f56617f);
                            }
                        }).map(new qcj() { // from class: l.ri7
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return uxj0.f181467a;
                            }
                        });
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ C22421c m32833O7(String str, String str2, String str3, Conversation conversation) {
        return (conversation == null || !TEnum.equals(ConversationStatus.get("default"), conversation.status)) ? m32896j7(str, str2, str3) : C22421c.just(conversation);
    }

    /* JADX INFO: renamed from: O8 */
    public C22421c<uxj0> m32834O8(String str, List<String> list) {
        return m32837P8(str, list, null);
    }

    /* JADX INFO: renamed from: P6 */
    public C22421c<uxj0> m32835P6(final GroupCreate groupCreate, List<Picture> list) {
        groupCreate.avatars = list;
        return scheduled(C4879a.m32263W(), -1, new pcj() { // from class: l.jl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121479a.m32813H7(groupCreate);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m32836P7(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: P8 */
    public C22421c<uxj0> m32837P8(final String str, final List<String> list, final y20<List<ChatGroupMember>> y20Var) {
        return scheduled("chat-groups/" + str + "/members/remove", -1, new pcj() { // from class: l.jj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121146a.m32925s8(list, str, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public String m32838Q6() {
        GroupSetting groupSetting = this.f20538r0.get();
        return NullChecker.m82486a(groupSetting) ? groupSetting.groupDescriptionEditTip : "";
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ C22421c m32839Q7(final String str, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.si7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.ti7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174448a.m32836P7((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.vi7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public C22421c<uxj0> m32840Q8(String str) {
        return m32866Z7(str, null);
    }

    /* JADX INFO: renamed from: R6 */
    public C22421c<Integer> m32841R6() {
        return this.f20533m0.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ C22421c m32842R7(final JoinCondition joinCondition, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.gi7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4887e.m32630B5(joinCondition);
            }
        }).flatMap(new qcj() { // from class: l.hi7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109990a.m32839Q7(str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R8 */
    public void m32843R8() {
        m32880e7().subscribe(psd0.m173597H(new y20() { // from class: l.pm7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153121a.m32928t8((Data) obj);
            }
        }, new y20() { // from class: l.rg7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4887e.m32699Y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S6 */
    public C22421c<uxj0> m32844S6(String str, final String str2, final Action action) {
        final String strM32330n = C4879a.m32330n(str + "?method=patch");
        return scheduled("patch/chat-groups/groupManager/" + str, -1, new pcj() { // from class: l.ci7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f81899a.m32821K7(str2, action, strM32330n);
            }
        });
    }

    /* JADX INFO: renamed from: S8 */
    public C22421c<uxj0> m32846S8() {
        return this.f20532l0.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: T6 */
    public C22421c<ChatGroupMember> m32847T6(String str, String str2) {
        return m32850U6(str, str2, false);
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ uxj0 m32848T7(final String str, final DbLinks dbLinks) throws Exception {
        final String strM32895j6 = m32895j6(str, dbLinks.links.next);
        Envelope envelopeM165964c = qi20.m176654a(new pcj() { // from class: l.pl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32895j6).m209032f().m209028b();
            }
        }).toBlocking().m165964c(null);
        Links links = dbLinks.links;
        if (links.previous == null) {
            links.previous = envelopeM165964c.pagination.links.previous;
        }
        links.next = envelopeM165964c.pagination.links.next;
        this.f91137Q.m32495w3(envelopeM165964c, new x20() { // from class: l.ql7
            @Override // p153l.x20
            public final void call() {
                uqb0.f180405k0.f184354c.upsert(dbLinks);
            }
        });
        this.f20531k0.put(Long.valueOf(pzi0.m174454o()));
        if (NullChecker.m82486a(dbLinks.links.next)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.rl7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163690a.m32845S7(str, dbLinks);
                }
            }, f20506B0);
            int i = f20506B0;
            if (i > 100) {
                f20506B0 = i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
            }
        }
        if (!jyb.m147479J(((CoreData) envelopeM165964c.getModuleData(CoreData.class)).chatGroupMembers)) {
            this.f20532l0.m137019l(uxj0.f181467a);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T8 */
    public void m32849T8(int i) {
        this.f20533m0.m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: U6 */
    public C22421c<ChatGroupMember> m32850U6(final String str, final String str2, final boolean z) {
        return CoreModule.f18272k.f115547o.uiGet(str + str2).doOnNext(new y20() { // from class: l.em7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94622a.m32824L7(str2, z, str, (ChatGroupMember) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m32851U7(String str, uxj0 uxj0Var) {
        final ChatGroup chatGroupQuery = CoreModule.f18272k.f115546n.query(str);
        if (!NullChecker.m82486a(chatGroupQuery) || chatGroupQuery.localMembersLoaded) {
            return;
        }
        chatGroupQuery.localMembersLoaded = true;
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.om7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115546n.upsert(chatGroupQuery);
            }
        });
    }

    /* JADX INFO: renamed from: U8 */
    public C22421c<uxj0> m32852U8() {
        return scheduled(" /v3/users/me/notification-counters", 0, new pcj() { // from class: l.dj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f88790a.m32934v8();
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public C22421c<uxj0> m32853V6() {
        return this.f20534n0.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ DbLinks m32854V7(String str) throws Exception {
        return (DbLinks) uqb0.f180405k0.f184354c.query(m32899k6(str));
    }

    /* JADX INFO: renamed from: V8 */
    public List<ChatGroupMember> m32855V8(String str) {
        return CoreModule.f18272k.f115547o.query(Filter.AND(ChatGroupMember.GROUPID.mo61359EQ(str), ChatGroupMember.STATUS.NEQ(ChatGroupMemberStatus.exited)), null, 2000);
    }

    /* JADX INFO: renamed from: W6 */
    public C22421c<List<ChatGroupMember>> m32856W6(String str) {
        return CoreModule.f18272k.f115547o.m207919G(str).m208677m();
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m32857W7(String str) {
        CoreModule.f18272k.f115547o.deleteAll();
        uqb0.f180405k0.f184354c.delete(m32899k6(str));
    }

    /* JADX INFO: renamed from: W8 */
    public ChatGroupMember m32858W8(String str, String str2) {
        return CoreModule.f18272k.f115547o.queryCache(str + str2);
    }

    /* JADX INFO: renamed from: X6 */
    public C22421c<uxj0> m32859X6() {
        return this.f20514T.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ C22421c m32860X7(final String str, DbLinks dbLinks) {
        if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.previous)) {
            DbLinks dbLinksNew_ = DbLinks.new_();
            dbLinksNew_.f56859id = m32899k6(str);
            dbLinksNew_.links.next = this.f20539s0;
            return m32802D8(str, dbLinksNew_);
        }
        if (NullChecker.m82486a(dbLinks.links.next)) {
            return m32802D8(str, dbLinks);
        }
        if (this.f20531k0.get().longValue() == 0 || !tzi0.m193670h(pzi0.m174454o(), this.f20531k0.get().longValue(), 60)) {
            return m32808F8(str, dbLinks);
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.rk7
            @Override // p153l.x20
            public final void call() {
                this.f163544a.m32857W7(str);
            }
        });
        DbLinks dbLinksNew_2 = DbLinks.new_();
        dbLinksNew_2.f56859id = m32899k6(str);
        dbLinksNew_2.links.next = this.f20539s0;
        return m32802D8(str, dbLinksNew_2);
    }

    /* JADX INFO: renamed from: X8 */
    public C22421c<uxj0> m32861X8(String str) {
        return m32864Y8(str, new qcj() { // from class: l.qj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public C22421c<DbLinks> m32862Y6(String str) {
        return uqb0.f180405k0.f184354c.uiGet(m32899k6(str));
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ C22421c m32863Y7(DbLinks dbLinks, final String str) {
        if (dbLinks == null) {
            return C22421c.fromCallable(new Callable() { // from class: l.ch7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f81768a.m32854V7(str);
                }
            }).flatMap(new qcj() { // from class: l.nh7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f141943a.m32860X7(str, (DbLinks) obj);
                }
            }).compose(psd0.m173592C());
        }
        return NullChecker.m82486a(dbLinks.links.next) ? m32802D8(str, dbLinks).compose(psd0.m173592C()) : m32808F8(str, dbLinks).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: Y8 */
    public <R> C22421c<R> m32864Y8(final String str, @NonNull final qcj<Envelope, R> qcjVar) {
        return scheduled("chat-groups/" + str, 0, new pcj() { // from class: l.zj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f204643a.m32943y8(str, qcjVar);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public String m32865Z6() {
        GroupSetting groupSetting = this.f20538r0.get();
        return NullChecker.m82486a(groupSetting) ? groupSetting.groupNameEditTip : "";
    }

    /* JADX INFO: renamed from: Z8 */
    public C22421c<uxj0> m32867Z8(final String str, final String str2) {
        return scheduled("chat-groups/" + str + "/" + str2, 0, new pcj() { // from class: l.al7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f72076a.m32793A8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public C22421c<uxj0> m32868a7() {
        return scheduled(C4879a.m32267X(), 0, new pcj() { // from class: l.xk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.yk7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32267X()).m209032f().m209028b();
                    }
                }).doOnNext(new y20() { // from class: l.zk7
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.m32495w3((Envelope) obj, null);
                    }
                }).compose(C4879a.m32255T2());
            }
        }).map(new qcj() { // from class: l.il7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115531a.m32827M7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ uxj0 m32869a8(final String str, final DbLinks dbLinks) throws Exception {
        final String strM32902l6 = m32902l6(str, dbLinks.links.previous);
        Envelope envelopeM165963b = qi20.m176654a(new pcj() { // from class: l.ig7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32902l6).m209032f().m209028b();
            }
        }).toBlocking().m165963b();
        if (!jyb.m147479J(((CoreData) envelopeM165963b.getModuleData(CoreData.class)).chatGroupMembers)) {
            this.f20514T.m137019l(uxj0.f181467a);
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).chatGroupMembers.size(); i++) {
                ChatGroupMember chatGroupMember = ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).chatGroupMembers.get(i);
                if (TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
                    arrayList.add(chatGroupMember);
                }
            }
            String str2 = envelopeM165963b.pagination.links.previous;
            if (str2 != null) {
                dbLinks.links.previous = str2;
            }
            ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).chatGroupMembers.removeAll(arrayList);
            this.f91137Q.m32497y3(envelopeM165963b, new x20() { // from class: l.jg7
                @Override // p153l.x20
                public final void call() {
                    C4887e.m32736i3(arrayList, str, dbLinks);
                }
            }, false, false, false);
            this.f20532l0.m137019l(uxj0.f181467a);
        }
        this.f20531k0.put(Long.valueOf(pzi0.m174454o()));
        if (!jyb.m147479J(((CoreData) envelopeM165963b.getModuleData(CoreData.class)).chatGroupMembers) && ((CoreData) envelopeM165963b.getModuleData(CoreData.class)).chatGroupMembers.size() >= envelopeM165963b.pagination.limit) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.kg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126581a.m32866Z7(str, dbLinks);
                }
            }, 100L);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: a9 */
    public C22421c<uxj0> m32870a9() {
        final String strUserId = CoreModule.m30929H().userId();
        return scheduled("topic/notification-counters/" + strUserId, 0, new pcj() { // from class: l.sl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f169353a.m32799C8(strUserId);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22421c<uxj0> m32871b7(final String str) {
        return scheduled(C4879a.m32267X() + "&" + str, 0, new pcj() { // from class: l.ak7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.kl7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32267X() + "&" + str).m209032f().m209028b();
                    }
                }).compose(C4879a.m32255T2());
            }
        }).map(new qcj() { // from class: l.ck7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82266a.m32830N7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m32872b8(String str, boolean z, Envelope envelope) {
        final Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.muted = z;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.yg7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115545m.upsert(conversationQuery);
            }
        });
    }

    /* JADX INFO: renamed from: b9 */
    public C22421c<uxj0> m32873b9(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(str2)) {
            arrayList.add(str2);
        }
        return m32834O8(str, arrayList);
    }

    /* JADX INFO: renamed from: c7 */
    public C22421c<Pair<Links, List<GroupNotification>>> m32874c7() {
        return this.f20541u0.asObservable();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ C22421c m32875c8(final String str, final boolean z, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.ml7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/conversations/" + str + "?method=patch&muted=" + z)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.nl7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142511a.m32872b8(str, z, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.ol7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: c9 */
    public C22421c<Pair<Links, Pair<List<ChatGroup>, List<ChatGroup>>>> m32876c9(final String str, final String str2) {
        return scheduled("/v3/chat-groups?keyword=" + str + str2, 0, new pcj() { // from class: l.yj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.gm7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4887e.m32694W5(str, str);
                    }
                }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.hm7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Envelope envelope = (Envelope) obj;
                        return Pair.create(envelope.pagination.links, Pair.create(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups, ((CoreData) envelope.getModuleData(CoreData.class)).interestedGroups));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: d7 */
    public String m32877d7() {
        GroupSetting groupSetting = this.f20538r0.get();
        return NullChecker.m82486a(groupSetting) ? groupSetting.groupNotificationsURL : "";
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ C22421c m32878d8(final boolean z, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.vj7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4887e.m32788z3(z);
            }
        }).flatMap(new qcj() { // from class: l.wj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189418a.m32875c8(str, z, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public List<ChatGroupMember> m32879d9(String str, String str2) {
        return CoreModule.f18272k.f115547o.query(Filter.AND(ChatGroupMember.SEARCHCATEGORY.CONTAINS(str), ChatGroupMember.GROUPID.mo61359EQ(str2), ChatGroupMember.STATUS.NEQ(ChatGroupMemberStatus.exited)), null, 0);
    }

    /* JADX INFO: renamed from: e7 */
    public final C22421c<Data> m32880e7() {
        return scheduled("v3/group-settings", 0, new pcj() { // from class: l.fk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.gl7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32350s()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.hl7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ uxj0 m32881e8(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            this.f20516V.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: e9 */
    public C22421c<List<String>> m32882e9() {
        return scheduled("/v3/search-keywords", 0, new pcj() { // from class: l.bj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.cl7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32338p()).m209032f().m209028b();
                    }
                }).compose(C4879a.m32255T2());
            }
        }).map(new qcj() { // from class: l.cj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).keywords;
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public C22421c<List<GroupTab>> m32883f7() {
        return this.f20546z0.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m32884f8(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: f9 */
    public void m32885f9(@NonNull GroupTab groupTab) {
        this.f20540t0.m137019l(groupTab);
    }

    /* JADX INFO: renamed from: g7, reason: merged with bridge method [inline-methods] */
    public void m32795B7(List<Conversation> list) {
        for (Conversation conversation : list) {
            if (((DbLinks) CoreModule.f18272k.f115536d.query(conversation.f56859id)) == null) {
                DbLinks dbLinks = new DbLinks();
                dbLinks.f56859id = conversation.f56859id;
                PartialIdList partialIdList = conversation.api_only_messages;
                dbLinks.links = partialIdList == null ? new Links() : partialIdList.links;
                CoreModule.f18272k.f115536d.upsert(dbLinks);
            }
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ C22421c m32887g8(final String str, final GroupUpdateData groupUpdateData) {
        return qi20.m176658e(new pcj() { // from class: l.lk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "?method=patch")).m209038l(z1d0.create(Network.JSON, groupUpdateData.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.nk7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142436a.m32884f8((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.ok7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: g9 */
    public final String m32888g9() {
        GroupTab groupTabM32894i9 = m32894i9();
        return (groupTabM32894i9 == null || this.f20545y0.equals(groupTabM32894i9)) ? "" : String.valueOf(groupTabM32894i9.f21149id);
    }

    /* JADX INFO: renamed from: h7 */
    public ChatGroup m32889h7(String str) {
        return CoreModule.f18272k.f115546n.queryCache(str);
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m32890h8(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: h9 */
    public C22421c<GroupTab> m32891h9() {
        return this.f20540t0.asObservable();
    }

    /* JADX INFO: renamed from: i7 */
    public C22421c<Conversation> m32892i7(final String str, final String str2, final String str3) {
        return CoreModule.f18264c.f20384f0.m33619Dg(str).take(1).flatMap(new qcj() { // from class: l.qh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157508a.m32833O7(str, str2, str3, (Conversation) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ C22421c m32893i8(final String str, final GroupUpdateData groupUpdateData) {
        return qi20.m176658e(new pcj() { // from class: l.kj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "?method=patch")).m209038l(z1d0.create(Network.JSON, groupUpdateData.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.lj7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132311a.m32890h8((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.mj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: i9 */
    public GroupTab m32894i9() {
        return this.f20540t0.m222761e();
    }

    /* JADX INFO: renamed from: j6 */
    public final String m32895j6(String str, String str2) {
        if (!str2.endsWith("&with=users")) {
            str2 = str2.concat("&with=users");
        }
        return C4879a.m32330n(str + "/members?" + str2);
    }

    /* JADX INFO: renamed from: j7 */
    public C22421c<Conversation> m32896j7(final String str, String str2, String str3) {
        return CoreModule.f18264c.f20387g0.m32905m6(str, str2, str3).flatMap(new qcj() { // from class: l.ai7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33619Dg(str).take(1).doOnNext(new y20() { // from class: l.ni7
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        Conversation conversation = (Conversation) obj2;
                        o1j0.m165651y((NullChecker.m82486a(conversation) && TEnum.equals(ConversationStatus.get("default"), conversation.status)) ? CoreModule.f18263b.getString(R$string.f56619h) : CoreModule.f18263b.getString(R$string.f56618g));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m32897j8(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: j9 */
    public Conversation m32898j9(String str) {
        return this.f20537q0.get(str);
    }

    /* JADX INFO: renamed from: k6 */
    public final String m32899k6(String str) {
        return C4879a.m32330n(str + "/members");
    }

    /* JADX INFO: renamed from: k7 */
    public C22421c<uxj0> m32900k7(String str, final JoinCondition joinCondition) {
        final String strM32330n = C4879a.m32330n(str + "?method=patch");
        return scheduled("patch/chat-groups/joinGroupType/" + str, -1, new pcj() { // from class: l.bi7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f76844a.m32842R7(joinCondition, strM32330n);
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ C22421c m32901k8(final String str, final GroupUpdateData groupUpdateData) {
        return qi20.m176658e(new pcj() { // from class: l.uk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "?method=patch")).m209038l(z1d0.create(Network.JSON, groupUpdateData.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.vk7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184462a.m32897j8((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.wk7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public final String m32902l6(String str, String str2) {
        return m32895j6(str, str2.replace("filter=default", ""));
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ void m32903l7(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ C22421c m32904l8(boolean z, String str, Envelope envelope) {
        if (!z && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers)) {
            ChatGroupMember chatGroupMember = ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers.get(0);
            if (NullChecker.m82486a(chatGroupMember.inModeration) && !TextUtils.isEmpty(chatGroupMember.inModeration.nickName)) {
                o1j0.m165651y("已提交，待审核通过后生效。");
                this.f91137Q.m32495w3(envelope, null);
                return C22421c.just(chatGroupMember);
            }
        }
        return m32847T6(str, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: m6 */
    public C22421c<uxj0> m32905m6(final String str, String str2, String str3) {
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
            CrashHelper.m82479c(e);
        }
        return scheduled("chat-groups/" + str + "/group-applies", -1, new pcj() { // from class: l.ii7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f115055a.m32906m7(str, jSONObject);
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.ki7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126971a.m32909n7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ C22421c m32906m7(final String str, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.wi7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "/group-applies")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.xi7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194437a.m32903l7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m32907m8(final ChatGroupMember chatGroupMember, String str) {
        chatGroupMember.nickName = str;
        chatGroupMember.nickNamePinyin = uxk.m198498c().m198501d(chatGroupMember.nickName).toUpperCase();
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.oi7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115547o.upsert(chatGroupMember);
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public C22421c<uxj0> m32908n6(final String str, final String str2, final boolean z) {
        return scheduled("/v3/banned-user/" + str + "/" + str2, -1, new pcj() { // from class: l.ij7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f115192a.m32915p7(z, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ uxj0 m32909n7(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            GroupApply groupApply = ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies.get(0);
            this.f20516V.m137019l(groupApply);
            this.f20518X.put(groupApply.groupId, groupApply);
            this.f20519Y.m137019l(uxj0.f181467a);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m32910n8(boolean z, final String str, final ChatGroupMember chatGroupMember) {
        if (z || !NullChecker.m82486a(chatGroupMember.inModeration) || TextUtils.isEmpty(chatGroupMember.inModeration.nickName)) {
            l51.m152919y(new Runnable() { // from class: l.wh7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189088a.m32907m8(chatGroupMember, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o6 */
    public C22421c<ChatGroup> m32911o6(String str) {
        return CoreModule.f18272k.f115546n.uiGet(str).filter(new ui7());
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m32912o7(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ C22421c m32913o8(final String str, final boolean z, final String str2, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.fh7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/chat-groups/" + str + "?method=patch")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).flatMap(new qcj() { // from class: l.gh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104072a.m32904l8(z, str, (Envelope) obj);
            }
        }).filter(new hh7()).take(1).doOnNext(new y20() { // from class: l.ih7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114873a.m32910n8(z, str2, (ChatGroupMember) obj);
            }
        }).map(new qcj() { // from class: l.jh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: p6 */
    public C22421c<CoreData> m32914p6(final String str) {
        return scheduled("/v3/chat-groups?search=quanzi&with=group-applies&keyword=" + str, 0, new pcj() { // from class: l.bl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ul7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32210H2("/chat-groups?search=quanzi&with=group-applies,members&keyword=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.vl7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4887e.m32714c5((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ C22421c m32915p7(boolean z, final String str, final String str2) {
        final ChatGroupMember chatGroupMember = new ChatGroupMember();
        ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
        chatGroupSilence.enable = z;
        chatGroupSilence.duration = 600L;
        chatGroupMember.silence = chatGroupSilence;
        return qi20.m176658e(new pcj() { // from class: l.jm7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32354t(str, str2)).m209037k(z1d0.create(Network.JSON, chatGroupMember.toJson())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.km7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127441a.m32912o7((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.lm7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ C22421c m32916p8(final String str, final String str2, final boolean z) {
        return C22421c.fromCallable(new Callable() { // from class: l.bm7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4887e.m32773u3(str);
            }
        }).flatMap(new qcj() { // from class: l.cm7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82519a.m32913o8(str2, z, str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public C22421c<uxj0> m32917q6() {
        return m32944z6().flatMap(new qcj() { // from class: l.yh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f199909a.m32918q7((String) obj);
            }
        }).map(new qcj() { // from class: l.ji7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121047a.m32921r7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ C22421c m32918q7(final String str) {
        return scheduled("/v3/chat-groups?search=suggested/" + str, 0, new pcj() { // from class: l.nj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.mm7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32342q(str)).m209032f().m209028b();
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m32919q8(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: r6 */
    public C22421c<uxj0> m32920r6(final String str) {
        final String strM32888g9 = m32888g9();
        return scheduled("/v3/chat-groups?search=suggested/" + strM32888g9 + "/&" + str, 0, new pcj() { // from class: l.dm7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ah7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32342q(str) + "&" + str).m209032f().m209028b();
                    }
                }).compose(C4879a.m32255T2());
            }
        }).map(new qcj() { // from class: l.fm7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99732a.m32924s7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ uxj0 m32921r7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups);
        this.f20518X.clear();
        this.f20515U.m137019l(new Pair<>(envelope.pagination.links, arrayList));
        this.f20521a0.m137019l(new ovb0<>(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups, ((CoreData) envelope.getModuleData(CoreData.class)).chatGroupMembers, ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies, ((CommonData) envelope.getModuleData(CommonData.class)).users));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ C22421c m32922r8(final String str, final y20 y20Var, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.bh7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "/members?method=patch")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.dh7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88423a.m32919q8((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.eh7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4887e.m32748l5(y20Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public ChatGroup m32923s6(String str) {
        return CoreModule.f18272k.f115546n.queryCache(str);
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ uxj0 m32924s7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups);
        Pair<Links, List<ChatGroup>> pairM222761e = this.f20515U.m222761e();
        final List arrayList2 = pairM222761e == null ? new ArrayList() : (List) pairM222761e.second;
        arrayList2.addAll(jyb.m147522n(arrayList, new qcj() { // from class: l.sg7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147520m(arrayList2, new qcj() { // from class: l.vh7
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((ChatGroup) obj2).f56859id.equals(chatGroup.f56859id));
                    }
                }));
            }
        }));
        this.f20515U.m137019l(new Pair<>(envelope.pagination.links, arrayList2));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ C22421c m32925s8(final List list, final String str, final y20 y20Var) {
        return C22421c.fromCallable(new Callable() { // from class: l.wl7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4887e.m32650I4(list);
            }
        }).flatMap(new qcj() { // from class: l.xl7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194869a.m32922r8(str, y20Var, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public void m32926t6() {
        this.f91137Q.f20384f0.m33966gf().observeOn(Schedulers.m222739io()).first().map(new qcj() { // from class: l.jk7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121279a.m32927t7((List) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.kk7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4887e.m32782x3(obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ Object m32927t7(List list) {
        Conversation conversation = (Conversation) list.get(0);
        String str = System.currentTimeMillis() + "";
        final Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.f56859id = "30909999";
        conversationMo225055clone.convType = "group";
        conversationMo225055clone.otherUser = str;
        final ChatGroup chatGroupNew_ = ChatGroup.new_();
        chatGroupNew_.f56859id = str;
        chatGroupNew_.name = "探探员工大群";
        ArrayList arrayList = new ArrayList();
        User userM116506Q9 = this.f91137Q.f20381e0.m116506Q9(conversation.otherUser);
        Iterator<Media> it = userM116506Q9.pictures.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().cover().profileSmall().formatted());
        }
        chatGroupNew_.ownerUserId = userM116506Q9.f56859id;
        List<Message> listQuery = CoreModule.f18272k.f115535c.query(Filter.TRUE, Message.CREATEDTIME.DESC, 500);
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        if (!jyb.m147479J(listQuery)) {
            for (Message message : listQuery) {
                Message messageMo225055clone = message.mo225055clone();
                messageMo225055clone.f56859id += "1";
                messageMo225055clone.cid = "30909999";
                messageMo225055clone.channel = MessageChannel.get("group");
                messageMo225055clone.status = MessageStatus.get("default");
                arrayList2.add(messageMo225055clone);
                ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
                String str2 = message.owner;
                chatGroupMemberNew_.f56859id = str2;
                chatGroupMemberNew_.groupId = str;
                chatGroupMemberNew_.userId = str2;
                User userM116506Q10 = CoreModule.f18264c.f20381e0.m116506Q9(str2);
                chatGroupMemberNew_.avatar = userM116506Q10.pictures.get(0).cover().profileSmall().formatted();
                chatGroupMemberNew_.nickName = userM116506Q10.name;
                chatGroupMemberNew_.nickNamePinyin = uxk.m198498c().m198501d(chatGroupMemberNew_.nickName).toUpperCase();
                chatGroupMemberNew_.searchCategory = chatGroupMemberNew_.nickName + "|" + chatGroupMemberNew_.nickNamePinyin;
                double d = userM116506Q10.createdTime;
                chatGroupMemberNew_.createdTime = d;
                chatGroupMemberNew_.updatedTime = d;
                arrayList3.add(chatGroupMemberNew_);
            }
        }
        this.f91137Q.m32495w3(Envelope.new_(), new x20() { // from class: l.nm7
            @Override // p153l.x20
            public final void call() {
                C4887e.m32772t5(chatGroupNew_, conversationMo225055clone, arrayList2, arrayList3);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m32928t8(Data data) {
        m32817I8(((CoreData) data.getModuleData(CoreData.class)).groupTabs);
        this.f20511A0.m159280q();
        if (jyb.m147479J(((CoreData) data.getModuleData(CoreData.class)).groupSettings)) {
            return;
        }
        this.f20538r0.put(((CoreData) data.getModuleData(CoreData.class)).groupSettings.get(0));
    }

    /* JADX INFO: renamed from: u6 */
    public void m32929u6(final boolean z, final boolean z2) {
        C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.dk7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88980a.m32930u7(z, z2, (uxj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ek7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4887e.m32663M4((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ uxj0 m32930u7(boolean z, boolean z2, uxj0 uxj0Var) {
        t600 t600Var = CoreModule.f18272k.f115535c;
        Filter filter = Filter.TRUE;
        final Message messageMo225055clone = t600Var.query(filter, Message.CREATEDTIME.DESC, 1).get(0).mo225055clone();
        List<User> listQuery = uqb0.f180405k0.f184355d.query(filter, User._ID.DESC, 30);
        Conversation conversation = CoreModule.f18272k.f115545m.query(Conversation.CONVTYPE.CONTAINS("group"), Conversation._ID.DESC, 1).get(0);
        User userMo225055clone = listQuery.get(0).mo225055clone();
        messageMo225055clone.f56859id = System.currentTimeMillis() + "";
        messageMo225055clone.owner = userMo225055clone.f56859id;
        messageMo225055clone.cid = conversation.f56859id;
        messageMo225055clone.channel = MessageChannel.get("group");
        messageMo225055clone.status = MessageStatus.get("default");
        messageMo225055clone.messageType = MessageType.get("text");
        messageMo225055clone.createdTime = System.currentTimeMillis();
        messageMo225055clone.localCreatedTime = System.currentTimeMillis();
        long jCurrentTimeMillis = (System.currentTimeMillis() % 5) + 35;
        messageMo225055clone.value = "";
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jCurrentTimeMillis; i++) {
            messageMo225055clone.value += m32658K6();
            if (i % 5 == 0) {
                messageMo225055clone.value += "＄";
                arrayList.add(listQuery.get(1).f56859id);
            }
            if (z && i % 11 == 0) {
                messageMo225055clone.value += "＄";
                arrayList.add("0");
            }
            if (z2 && i % 9 == 0) {
                messageMo225055clone.value += "＄";
                arrayList.add(CoreModule.f18264c.f20381e0.m116593na().f56859id);
            }
        }
        messageMo225055clone.notifiedUsers = arrayList;
        final ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
        String str = System.currentTimeMillis() + "";
        chatGroupMemberNew_.f56859id = str.substring(5, str.length());
        chatGroupMemberNew_.groupId = conversation.otherUser;
        chatGroupMemberNew_.userId = userMo225055clone.f56859id;
        chatGroupMemberNew_.avatar = userMo225055clone.pictures.get(0).cover().profileSmall().formatted();
        chatGroupMemberNew_.nickName = userMo225055clone.name;
        chatGroupMemberNew_.nickNamePinyin = uxk.m198498c().m198501d(chatGroupMemberNew_.nickName).toUpperCase();
        chatGroupMemberNew_.searchCategory = chatGroupMemberNew_.nickName + "|" + chatGroupMemberNew_.nickNamePinyin;
        double d = userMo225055clone.createdTime;
        chatGroupMemberNew_.createdTime = d;
        chatGroupMemberNew_.updatedTime = d;
        this.f91137Q.m32495w3(Envelope.new_(), new x20() { // from class: l.am7
            @Override // p153l.x20
            public final void call() {
                C4887e.m32730g5(messageMo225055clone, chatGroupMemberNew_);
            }
        });
        return uxj0Var;
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ uxj0 m32931u8(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).notificationCounters)) {
            this.f20517W.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).notificationCounters.get(0));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v6 */
    public void m32932v6() {
        C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.sk7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169234a.m32933v7((uxj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tk7
            @Override // p153l.y20
            public final void call(Object obj) {
                C4887e.m32776v3((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ uxj0 m32933v7(uxj0 uxj0Var) {
        final Message messageMo225055clone = CoreModule.f18272k.f115535c.query(Filter.TRUE, Message.CREATEDTIME.DESC, 1).get(0).mo225055clone();
        Conversation conversation = CoreModule.f18272k.f115545m.query(Conversation.CONVTYPE.CONTAINS("group"), Conversation._ID.DESC, 1).get(0);
        messageMo225055clone.f56859id = System.currentTimeMillis() + "";
        StringBuilder sb = new StringBuilder("39009");
        sb.append(System.currentTimeMillis() / Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        messageMo225055clone.owner = sb.toString();
        messageMo225055clone.cid = conversation.f56859id;
        messageMo225055clone.channel = MessageChannel.get("group");
        messageMo225055clone.status = MessageStatus.get("default");
        messageMo225055clone.messageType = MessageType.get("text");
        messageMo225055clone.createdTime = System.currentTimeMillis();
        messageMo225055clone.localCreatedTime = System.currentTimeMillis();
        System.currentTimeMillis();
        messageMo225055clone.value = "这个是一个没有用户信息的消息哦";
        this.f91137Q.m32495w3(Envelope.new_(), new x20() { // from class: l.hg7
            @Override // p153l.x20
            public final void call() {
                C4887e.m32777v4(messageMo225055clone);
            }
        });
        return uxj0Var;
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ C22421c m32934v8() {
        return qi20.m176658e(new pcj() { // from class: l.rj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32346r()).m209032f().m209028b();
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.sj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f168952a.m32931u8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public C22421c<uxj0> m32935w6(String str, String str2) {
        return m32938x6(str, str2, null);
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m32936w7(String str, String str2) {
        CoreModule.f18272k.f115545m.delete(Filter.AND(Conversation.f21114ID.mo61359EQ(str), Conversation.CONVTYPE.mo61359EQ("group"), Conversation.OTHERUSER.mo61359EQ(str2)));
        CoreModule.f18272k.f115546n.delete(str2);
        CoreModule.f18272k.f115547o.delete(ChatGroupMember.GROUPID.mo61359EQ(str2));
        uqb0.f180405k0.f184354c.delete(m32899k6(str2));
        CoreModule.f18264c.f20384f0.m33731Mh(str);
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m32937w8(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }

    /* JADX INFO: renamed from: x6 */
    public C22421c<uxj0> m32938x6(final String str, final String str2, final x20 x20Var) {
        return scheduled("me/chat-groups/" + str + "/delete", -1, new pcj() { // from class: l.gj7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104604a.m32945z7(str, str2, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ void m32939x7(final String str, final String str2, Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ll7
            @Override // p153l.x20
            public final void call() {
                this.f132528a.m32936w7(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ Object m32940x8(final String str, qcj qcjVar, Envelope envelope) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).groupApplies)) {
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups)) {
                GroupApply groupApplyNew_ = GroupApply.new_();
                groupApplyNew_.groupId = str;
                ChatGroup chatGroup = (ChatGroup) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).chatGroups, new qcj() { // from class: l.zg7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((ChatGroup) obj).f56859id.equals(str));
                    }
                });
                if (NullChecker.m82486a(chatGroup)) {
                    if (TEnum.equals(chatGroup.groupApply.status, "approved")) {
                        groupApplyNew_.status = GroupApplyStatus.get("approved");
                    } else {
                        groupApplyNew_.status = GroupApplyStatus.get("unknown_");
                    }
                }
                this.f20518X.put(str, groupApplyNew_);
                this.f20519Y.m137019l(uxj0.f181467a);
            }
            this.f20516V.m137019l(null);
        } else {
            GroupApply groupApply = ((CoreData) envelope.getModuleData(CoreData.class)).groupApplies.get(0);
            this.f20516V.m137019l(groupApply);
            this.f20518X.put(groupApply.groupId, groupApply);
            this.f20519Y.m137019l(uxj0.f181467a);
        }
        return qcjVar.call(envelope);
    }

    /* JADX INFO: renamed from: y6 */
    public C22421c<uxj0> m32941y6() {
        return this.f20520Z.asObservable();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ uxj0 m32942y7(String str, x20 x20Var, Envelope envelope) {
        GroupApply groupApplyNew_ = GroupApply.new_();
        groupApplyNew_.groupId = str;
        groupApplyNew_.status = GroupApplyStatus.get("unknown_");
        this.f20518X.put(str, groupApplyNew_);
        C22507a<uxj0> c22507a = this.f20519Y;
        uxj0 uxj0Var = uxj0.f181467a;
        c22507a.m137019l(uxj0Var);
        this.f20520Z.m137019l(uxj0Var);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        return uxj0Var;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ C22421c m32943y8(final String str, final qcj qcjVar) {
        return qi20.m176658e(new pcj() { // from class: l.dl7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32330n(str + "?with=members,users,group-applies")).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.el7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94483a.m32937w8((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.fl7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99624a.m32940x8(str, qcjVar, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final C22421c<String> m32944z6() {
        return this.f20546z0.m222761e() == null ? this.f20511A0.m159274k().asObservable().take(1).doOnNext(new y20() { // from class: l.oj7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147638a.m32817I8((List) obj);
            }
        }).flatMap(new qcj() { // from class: l.pj7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152671a.m32792A7((List) obj);
            }
        }) : C22421c.just(m32888g9());
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ C22421c m32945z7(final String str, final String str2, final x20 x20Var) {
        return qi20.m176658e(new pcj() { // from class: l.gk7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/chat-groups/" + str)).m209030d().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.hk7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110383a.m32939x7(str2, str, (Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.ik7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115338a.m32942y7(str, x20Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m32946z8(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
    }
}
