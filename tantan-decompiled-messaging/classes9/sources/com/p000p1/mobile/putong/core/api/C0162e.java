package com.p000p1.mobile.putong.core.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0162e;
import com.p1.mobile.putong.core.data.Action;
import com.p1.mobile.putong.core.data.BulkGroupInviteMessages;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.ChatGroupSilence;
import com.p1.mobile.putong.core.data.ChatGroupTopic;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupApplyStatus;
import com.p1.mobile.putong.core.data.GroupAttribute;
import com.p1.mobile.putong.core.data.GroupCreate;
import com.p1.mobile.putong.core.data.GroupInvitation;
import com.p1.mobile.putong.core.data.GroupNotification;
import com.p1.mobile.putong.core.data.GroupSetting;
import com.p1.mobile.putong.core.data.GroupTab;
import com.p1.mobile.putong.core.data.GroupUpdateData;
import com.p1.mobile.putong.core.data.JoinCondition;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageChannel;
import com.p1.mobile.putong.core.data.MessageStatus;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.NotificationCounter;
import com.p1.mobile.putong.core.data.SettingGroupManager;
import com.p1.mobile.putong.core.data.Target;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Data;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PartialIdList;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.core.base.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.data.orm.OrderedColumn;
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
import l.bqd0;
import l.d30;
import l.e30;
import l.e51;
import l.evk;
import l.fgf0;
import l.fpd0;
import l.ggi;
import l.hpd0;
import l.jo0;
import l.knb0;
import l.kpd0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.qh7;
import p006l.qib0;
import p006l.qnd;
import p006l.ura;
import p006l.wxz;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0162e extends ax6 {

    /* JADX INFO: renamed from: B0 */
    public static int f3753B0 = 500;

    /* JADX INFO: renamed from: C0 */
    public static hpd0 f3754C0;

    /* JADX INFO: renamed from: D0 */
    public static hpd0 f3755D0;

    /* JADX INFO: renamed from: E0 */
    public static hpd0 f3756E0;

    /* JADX INFO: renamed from: F0 */
    public static hpd0 f3757F0;

    /* JADX INFO: renamed from: A0 */
    public final b f3758A0;

    /* JADX INFO: renamed from: R */
    public kpd0 f3759R;

    /* JADX INFO: renamed from: S */
    public kpd0 f3760S;

    /* JADX INFO: renamed from: T */
    public rx.subjects.a<roj0> f3761T;

    /* JADX INFO: renamed from: U */
    public rx.subjects.a<Pair<Links, List<ChatGroup>>> f3762U;

    /* JADX INFO: renamed from: V */
    public rx.subjects.a<GroupApply> f3763V;

    /* JADX INFO: renamed from: W */
    public rx.subjects.a<NotificationCounter> f3764W;

    /* JADX INFO: renamed from: X */
    public HashMap<String, GroupApply> f3765X;

    /* JADX INFO: renamed from: Y */
    public rx.subjects.a<roj0> f3766Y;

    /* JADX INFO: renamed from: Z */
    public rx.subjects.a<roj0> f3767Z;

    /* JADX INFO: renamed from: a0 */
    public rx.subjects.a<knb0<List<ChatGroup>, List<ChatGroupMember>, List<GroupApply>, List<User>>> f3768a0;

    /* JADX INFO: renamed from: b0 */
    public rx.subjects.a<Pair<String, xaj0<List<ChatGroup>, List<ChatGroupMember>, List<Conversation>>>> f3769b0;

    /* JADX INFO: renamed from: c0 */
    public rx.subjects.a<Integer> f3770c0;

    /* JADX INFO: renamed from: d0 */
    public rx.subjects.a<xaj0<List<ChatGroup>, List<ChatGroupMember>, List<Conversation>>> f3771d0;

    /* JADX INFO: renamed from: e0 */
    public Set<String> f3772e0;

    /* JADX INFO: renamed from: f0 */
    public rx.subjects.b<ChatGroupTopic> f3773f0;

    /* JADX INFO: renamed from: g0 */
    public rx.subjects.b<String> f3774g0;

    /* JADX INFO: renamed from: h0 */
    public hpd0 f3775h0;

    /* JADX INFO: renamed from: i0 */
    public rx.subjects.b<roj0> f3776i0;

    /* JADX INFO: renamed from: j0 */
    public String f3777j0;

    /* JADX INFO: renamed from: k0 */
    public zpd0 f3778k0;

    /* JADX INFO: renamed from: l0 */
    public rx.subjects.b<roj0> f3779l0;

    /* JADX INFO: renamed from: m0 */
    public rx.subjects.b<Integer> f3780m0;

    /* JADX INFO: renamed from: n0 */
    public rx.subjects.b<roj0> f3781n0;

    /* JADX INFO: renamed from: o0 */
    public rx.subjects.b<Pair<String, String>> f3782o0;

    /* JADX INFO: renamed from: p0 */
    public HashMap<String, Integer> f3783p0;

    /* JADX INFO: renamed from: q0 */
    public Map<String, Conversation> f3784q0;

    /* JADX INFO: renamed from: r0 */
    public bqd0<GroupSetting> f3785r0;

    /* JADX INFO: renamed from: s0 */
    public String f3786s0;

    /* JADX INFO: renamed from: t0 */
    public final rx.subjects.a<GroupTab> f3787t0;

    /* JADX INFO: renamed from: u0 */
    public rx.subjects.a<Pair<Links, List<GroupNotification>>> f3788u0;

    /* JADX INFO: renamed from: v0 */
    public rx.subjects.b<knb0<List<Conversation>, CoreData, Links, Integer>> f3789v0;

    /* JADX INFO: renamed from: w0 */
    public rx.subjects.b<Pair<String, ArrayList<Media>>> f3790w0;

    /* JADX INFO: renamed from: x0 */
    public rx.subjects.a<List<GroupAttribute>> f3791x0;

    /* JADX INFO: renamed from: y0 */
    public final GroupTab f3792y0;

    /* JADX INFO: renamed from: z0 */
    public final rx.subjects.a<List<GroupTab>> f3793z0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e$a */
    public class a extends bqd0<GroupSetting> {
        public a(String str, GroupSetting groupSetting) {
            super(str, groupSetting);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull @NotNull GroupSetting groupSetting, GroupSetting groupSetting2) {
            return groupSetting.equals(groupSetting2);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GroupSetting copyed(GroupSetting groupSetting, @NonNull @NotNull GroupSetting groupSetting2) {
            return groupSetting2.clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GroupSetting retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            if (string == null) {
                return (GroupSetting) ((fpd0) this).defaultValue;
            }
            try {
                return (GroupSetting) GroupSetting.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.c(e);
                return (GroupSetting) ((fpd0) this).defaultValue;
            }
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(GroupSetting groupSetting) {
            return pref().edit().putString(((fpd0) this).id, groupSetting.toJson());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e$b */
    public class b extends fgf0<List<GroupTab>> {
        public b() {
            super("chat_group_tabs", new ggi(new qnd("chat_group_tabs", "_1", null), -1, GroupTab.PROTOBUF_ADAPTER.ARRAY_ADAPTER()), new v9j() { // from class: l.ml7
                public final Object call() {
                    return C0162e.b.m3878B(c0162e);
                }
            });
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ c m3878B(C0162e c0162e) {
            return c0162e.f3793z0.e() != null ? c.just((List) c0162e.f3793z0.e()) : c.just(new ArrayList());
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        f3754C0 = new hpd0("chat_v3_enable", bool);
        f3755D0 = new hpd0("check_id", bool);
        f3756E0 = new hpd0("show_group_tips", bool);
        f3757F0 = new hpd0("has_in_group", Boolean.FALSE);
    }

    public C0162e(C0158c c0158c) {
        super(c0158c);
        this.f3761T = rx.subjects.a.b();
        this.f3762U = rx.subjects.a.b();
        this.f3763V = rx.subjects.a.b();
        this.f3764W = rx.subjects.a.b();
        this.f3765X = new HashMap<>();
        this.f3766Y = rx.subjects.a.b();
        this.f3767Z = rx.subjects.a.b();
        this.f3768a0 = rx.subjects.a.b();
        this.f3769b0 = rx.subjects.a.b();
        this.f3770c0 = rx.subjects.a.b();
        this.f3771d0 = rx.subjects.a.b();
        this.f3772e0 = new HashSet();
        this.f3773f0 = rx.subjects.b.b();
        this.f3774g0 = rx.subjects.b.b();
        this.f3775h0 = new hpd0("group_topic_roaming_first_experience_" + CoreModule.m1850H().userId(), Boolean.TRUE);
        this.f3776i0 = rx.subjects.b.b();
        this.f3777j0 = "";
        this.f3779l0 = rx.subjects.b.b();
        this.f3780m0 = rx.subjects.b.b();
        this.f3781n0 = rx.subjects.b.b();
        this.f3782o0 = rx.subjects.b.b();
        this.f3783p0 = new HashMap<>();
        this.f3784q0 = new HashMap();
        this.f3785r0 = new a("local_group_chat_setting", GroupSetting.new_());
        this.f3786s0 = "limit=50&filter=default&with=users";
        this.f3787t0 = rx.subjects.a.b();
        this.f3788u0 = rx.subjects.a.b();
        this.f3789v0 = rx.subjects.b.b();
        this.f3790w0 = rx.subjects.b.b();
        this.f3791x0 = rx.subjects.a.b();
        this.f3792y0 = GroupTab.new_();
        this.f3793z0 = rx.subjects.a.b();
        this.f3758A0 = new b();
        this.f3778k0 = new zpd0("last_group_members_load_time", 0L);
        this.f3759R = new kpd0("last_tab_dot_show_time_" + CoreModule.m1850H().userId(), 0.0d);
        this.f3760S = new kpd0("last_tab_dot_click_time_" + CoreModule.m1850H().userId(), 0.0d);
        ura.m25555e().m25559d().m5615E8(this.f3783p0);
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ JSONObject m3557B5(JoinCondition joinCondition) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("joinCondition", joinCondition);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ JSONObject m3577I4(List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        vwb.z(list, new e30() { // from class: l.tf7
            public final void call(Object obj) {
                C0162e.m3614U4(jSONArray, (String) obj);
            }
        });
        jSONObject.put("chatGroupMembers", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: K6 */
    public static char m3585K6() {
        return (char) (((int) (Math.random() * 20902.0d)) + 19968);
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m3590M4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ String m3613U3(String str, List list) {
        BulkGroupInviteMessages bulkGroupInviteMessagesNew_ = BulkGroupInviteMessages.new_();
        bulkGroupInviteMessagesNew_.message.messageType = MessageType.get("group_invitation");
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        GroupInvitation groupInvitationNew_ = GroupInvitation.new_();
        Target target = groupInvitationNew_.target;
        target.id = str;
        target.type = "chatGroups";
        messageAdditionalDataNew_.groupInvitation = groupInvitationNew_;
        bulkGroupInviteMessagesNew_.message.additionalData = messageAdditionalDataNew_;
        bulkGroupInviteMessagesNew_.toUserIds = list;
        return bulkGroupInviteMessagesNew_.toJson();
    }

    /* JADX INFO: renamed from: U4 */
    public static /* synthetic */ void m3614U4(JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("status", "exited");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: W5 */
    public static /* synthetic */ stc0 m3621W5(String str, String str2) {
        String strM3261o;
        stc0.a aVarAuth = C0154a.f3483P.auth();
        if (TextUtils.isEmpty(str)) {
            strM3261o = C0154a.m3261o(str2);
        } else {
            strM3261o = C0154a.m3261o(str2 + "&" + str);
        }
        return aVarAuth.q(strM3261o).f().b();
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m3626Y4(Throwable th) {
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ ChatGroup m3656g4(Envelope envelope) {
        if (vwb.J(envelope.getModuleData(CoreData.class).chatGroups)) {
            return null;
        }
        return (ChatGroup) envelope.getModuleData(CoreData.class).chatGroups.get(0);
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m3657g5(Message message, ChatGroupMember chatGroupMember) {
        CoreModule.f1542k.f11195c.upsert(message);
        CoreModule.f1542k.f11207o.upsert(chatGroupMember);
        lsi0.j("插入完成");
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m3663i3(ArrayList arrayList, final String str, DbLinks dbLinks) {
        vwb.z(arrayList, new e30() { // from class: l.pf7
            public final void call(Object obj) {
                CoreModule.f1542k.f11207o.delete(Filter.AND(new Filter[]{ChatGroupMember.GROUPID.EQ(str), ChatGroupMember.USERID.EQ(((ChatGroupMember) obj).userId)}));
            }
        });
        qib0.f19813k0.f23550c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ roj0 m3675l5(e30 e30Var, Envelope envelope) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(envelope.getModuleData(CoreData.class).chatGroupMembers);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ String m3688q3(String str, Action action) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        SettingGroupManager settingGroupManagerNew_ = SettingGroupManager.new_();
        settingGroupManagerNew_.action = action;
        settingGroupManagerNew_.adminUserIds = arrayList;
        return settingGroupManagerNew_.toJson();
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m3699t5(ChatGroup chatGroup, Conversation conversation, List list, List list2) {
        CoreModule.f1542k.f11206n.upsert(chatGroup);
        CoreModule.f1542k.f11205m.upsert(conversation);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CoreModule.f1542k.f11195c.upsert((Message) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ChatGroupMember chatGroupMember = (ChatGroupMember) it2.next();
            if (NullChecker.a(chatGroupMember)) {
                CoreModule.f1542k.f11207o.upsert(chatGroupMember);
            }
        }
        lsi0.j("插入完成");
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ JSONObject m3700u3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nickName", str);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m3703v3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m3704v4(Message message) {
        CoreModule.f1542k.f11195c.upsert(message);
        lsi0.j("插入完成");
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m3709x3(Object obj) {
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ JSONObject m3715z3(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("muted", z);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: A6 */
    public c<roj0> m3718A6() {
        return this.f3766Y.asObservable();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ c m3719A7(List list) {
        return c.just(m3815g9());
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ c m3720A8(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.if7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "/members/" + str2 + "?with=users")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.jf7
            public final void call(Object obj) {
                this.f15135a.m3873z8((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.kf7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: B6 */
    public HashMap<String, GroupApply> m3721B6() {
        return this.f3765X;
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ roj0 m3723B8(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (!vwb.J(moduleData.notificationCounters)) {
            this.f3770c0.onNext(Integer.valueOf(((NotificationCounter) moduleData.notificationCounters.get(0)).unread));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: C6 */
    public c<GroupApply> m3724C6() {
        return this.f3763V.asObservable();
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ roj0 m3725C7(final String str, int i, Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        final ArrayList arrayList = new ArrayList(moduleData.conversations);
        int iG = vwb.G(arrayList, new w9j() { // from class: l.tg7
            public final Object call(Object obj) {
                String str2 = str;
                return Boolean.valueOf(!TextUtils.isEmpty(str2) && TextUtils.equals(((DbObject) ((Conversation) obj)).id, str2));
            }
        });
        if (iG != -1) {
            ((Conversation) arrayList.get(iG)).unreadMessages = 0;
        }
        moduleData.conversations.clear();
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.vg7
            public final void call() {
                this.f24310a.m3722B7(arrayList);
            }
        });
        this.f3789v0.onNext(vwb.Z(arrayList, moduleData, envelope.pagination.links, Integer.valueOf(i)));
        return roj0.a;
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ c m3726C8(final String str) {
        return ia20.m16567a(new v9j() { // from class: l.qf7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3145J2("/" + str + "/notification-counters?source=topic")).f().b();
            }
        }).map(new w9j() { // from class: l.rf7
            public final Object call(Object obj) {
                return this.f20535a.m3723B8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public rx.subjects.a<Pair<Links, List<GroupNotification>>> m3727D6() {
        return this.f3788u0;
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m3728D7(Throwable th) {
        this.f3789v0.onNext(vwb.Z((Object) null, (Object) null, (Object) null, (Object) null));
    }

    /* JADX INFO: renamed from: D8 */
    public final c<roj0> m3729D8(final String str, final DbLinks dbLinks) {
        return dbLinks.links.next == null ? c.just(roj0.a) : c.fromCallable(new Callable() { // from class: l.lj7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16440a.m3775T7(str, dbLinks);
            }
        }).doOnNext(new e30() { // from class: l.mj7
            public final void call(Object obj) {
                this.f16994a.m3778U7(str, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public GroupSetting m3730E6() {
        return (GroupSetting) this.f3785r0.get();
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ c m3731E7(final String str, final String str2, final int i) {
        return ia20.m16571e(new v9j() { // from class: l.gg7
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.hg7
            public final Object call(Object obj) {
                return this.f13871a.m3725C7(str2, i, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.ig7
            public final void call(Object obj) {
                this.f14432a.m3728D7((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E8, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final c<roj0> m3793Z7(final String str, final DbLinks dbLinks) {
        return this.f8580Q.scheduled("group/" + str + "/members/get", 0, new v9j() { // from class: l.cf7
            public final Object call() {
                return this.f9634a.m3790Y7(dbLinks, str);
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public c<roj0> m3733F6(int i) {
        return m3736G6("", "", i);
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ List m3734F7(Envelope envelope) {
        this.f3791x0.onNext(envelope.getModuleData(CoreData.class).groupAttributes);
        return envelope.getModuleData(CoreData.class).groupAttributes;
    }

    /* JADX INFO: renamed from: F8 */
    public final c<roj0> m3735F8(final String str, final DbLinks dbLinks) {
        return c.fromCallable(new Callable() { // from class: l.ti7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22127a.m3796a8(str, dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public c<roj0> m3736G6(String str, final String str2, final int i) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(C0154a.m3145J2("/" + CoreModule.m1850H().userId()));
        sb.append("/conversations?filter=topicGroups&with=chat-groups,messages,members,users");
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = "&" + str;
        }
        sb.append(str3);
        final String string = sb.toString();
        return scheduled("/v3/conversations/topicGroups/", 0, new v9j() { // from class: l.el7
            public final Object call() {
                return this.f11230a.m3731E7(string, str2, i);
            }
        });
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m3737G7(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: G8 */
    public c<roj0> m3738G8(final String str, final boolean z) {
        return scheduled("conversations/" + str + "/muted", -1, new v9j() { // from class: l.xi7
            public final Object call() {
                return this.f27522a.m3805d8(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public c<ChatGroup> m3739H6(final String str) {
        return scheduled("chat-groups/" + str, 0, new v9j() { // from class: l.vk7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.kg7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3257n(str + "?with=members,users")).f().b();
                    }
                }).map(new w9j() { // from class: l.lg7
                    public final Object call(Object obj) {
                        return C0162e.m3656g4((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ c m3740H7(final GroupCreate groupCreate) {
        return ia20.m16571e(new v9j() { // from class: l.ng7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3190W()).l(utc0.create(Network.JSON, groupCreate.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.og7
            public final void call(Object obj) {
                this.f18226a.m3737G7((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.pg7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: H8 */
    public c<NotificationCounter> m3741H8() {
        return this.f3764W.asObservable();
    }

    /* JADX INFO: renamed from: I6 */
    public c<List<ChatGroup>> m3742I6() {
        return CoreModule.f1542k.f11206n.m28390F().m();
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m3743I7(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: I8 */
    public final void m3744I8(List<GroupTab> list) {
        this.f3793z0.onNext(list);
        boolean zJ = vwb.J(list);
        rx.subjects.a<GroupTab> aVar = this.f3787t0;
        if (zJ) {
            aVar.onNext(this.f3792y0);
            return;
        }
        GroupTab groupTab = (GroupTab) aVar.e();
        if (groupTab == null || !list.contains(groupTab)) {
            m3812f9(list.get(0));
        }
    }

    /* JADX INFO: renamed from: J6 */
    public int m3745J6(String str) {
        if (this.f3783p0.containsKey(str)) {
            return this.f3783p0.get(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ c m3746J7(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.uh7
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, str2)).b();
            }
        }).doOnNext(new e30() { // from class: l.vh7
            public final void call(Object obj) {
                this.f24321a.m3743I7((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.wh7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: J8 */
    public c<roj0> m3747J8(final String str, GroupApplyStatus groupApplyStatus) {
        final String str2 = "{\"status\":\"" + groupApplyStatus.toString() + "\"}";
        return scheduled(C0154a.m3263o1(str), -1, new v9j() { // from class: l.lf7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.qg7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3263o1(str)).l(utc0.create(Network.JSON, str)).b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.mf7
            public final Object call(Object obj) {
                return this.f16953a.m3808e8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ c m3748K7(final String str, final Action action, final String str2) {
        return c.fromCallable(new Callable() { // from class: l.hh7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0162e.m3688q3(str, action);
            }
        }).flatMap(new w9j() { // from class: l.ih7
            public final Object call(Object obj) {
                return this.f14443a.m3746J7(str2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K8 */
    public c<roj0> m3749K8(final String str, List<Picture> list) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.avatars = list;
        return scheduled("patch/chat-groups/avatars/" + str, -1, new v9j() { // from class: l.bi7
            public final Object call() {
                return this.f8917a.m3814g8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public rx.subjects.a<Pair<Links, List<ChatGroup>>> m3750L6() {
        return this.f3762U;
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m3751L7(String str, boolean z, String str2, ChatGroupMember chatGroupMember) {
        if (!NullChecker.a(chatGroupMember)) {
            if (z) {
                return;
            }
            m3794Z8(str2, str);
        } else if (TextUtils.isEmpty(chatGroupMember.groupMemberName()) || TextUtils.isEmpty(chatGroupMember.avatar)) {
            CoreModule.f1534c.f3628e0.m21417W9(str);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public c<roj0> m3752L8(final String str, String str2) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.description = str2;
        return scheduled("patch/chat-groups/description/" + str, -1, new v9j() { // from class: l.pk7
            public final Object call() {
                return this.f19165a.m3820i8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public c<GroupApply> m3753M6(final String str) {
        if (this.f3763V.e() == null || !str.equals(((GroupApply) this.f3763V.e()).groupId)) {
            this.f3763V.onNext((Object) null);
        }
        return this.f3763V.asObservable().filter(new w9j() { // from class: l.ai7
            public final Object call(Object obj) {
                GroupApply groupApply = (GroupApply) obj;
                return Boolean.valueOf(groupApply == null || str.equals(groupApply.groupId));
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ roj0 m3754M7(Envelope envelope) {
        this.f3788u0.onNext(new Pair(envelope.pagination.links, envelope.getModuleData(CoreData.class).groupNotifications));
        return roj0.a;
    }

    /* JADX INFO: renamed from: M8 */
    public c<roj0> m3755M8(final String str, String str2) {
        final GroupUpdateData groupUpdateDataNew_ = GroupUpdateData.new_();
        groupUpdateDataNew_.name = str2;
        return scheduled("patch/chat-groups/name/" + str, -1, new v9j() { // from class: l.ij7
            public final Object call() {
                return this.f14499a.m3828k8(str, groupUpdateDataNew_);
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public c<List<GroupAttribute>> m3756N6() {
        return scheduled(C0154a.m3187V(), 0, new v9j() { // from class: l.pi7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.hf7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3187V()).f().b();
                    }
                }).compose(C0154a.m3182T2());
            }
        }).map(new w9j() { // from class: l.qi7
            public final Object call(Object obj) {
                return this.f19769a.m3734F7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ roj0 m3757N7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(envelope.getModuleData(CoreData.class).groupNotifications);
        Pair pair = (Pair) this.f3788u0.e();
        final List arrayList2 = pair == null ? new ArrayList() : (List) pair.second;
        arrayList2.addAll(vwb.n(arrayList, new w9j() { // from class: l.uk7
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m(arrayList2, new w9j() { // from class: l.sf7
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((GroupNotification) obj2).id.equals(groupNotification.id));
                    }
                }));
            }
        }));
        this.f3788u0.onNext(new Pair(envelope.pagination.links, arrayList2));
        return roj0.a;
    }

    /* JADX INFO: renamed from: N8 */
    public c<roj0> m3758N8(final String str, final String str2, final boolean z) {
        return scheduled("patch/chat-groups/nickname/" + str, -1, new v9j() { // from class: l.di7
            public final Object call() {
                return this.f10406a.m3843p8(str2, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public c<roj0> m3759O6(final String str, final List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0154a.m3296w2("/" + CoreModule.m1850H().userId()));
        sb.append("/bulk-messages");
        final String string = sb.toString();
        return scheduled(CoreModule.m1850H().userId() + "/bulk-messages", -1, new v9j() { // from class: l.zg7
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.ah7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0162e.m3613U3(str, list);
                    }
                }).flatMap(new w9j() { // from class: l.bh7
                    public final Object call(Object obj) {
                        return ia20.m16571e(new v9j() { // from class: l.lh7
                            public final Object call() {
                                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, str)).b();
                            }
                        }).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.mh7
                            public final void call(Object obj2) {
                                lsi0.w(R.string.f);
                            }
                        }).map(new w9j() { // from class: l.nh7
                            public final Object call(Object obj2) {
                                return roj0.a;
                            }
                        });
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ c m3760O7(String str, String str2, String str3, Conversation conversation) {
        return (conversation == null || !TEnum.equals(ConversationStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER), conversation.status)) ? m3823j7(str, str2, str3) : c.just(conversation);
    }

    /* JADX INFO: renamed from: O8 */
    public c<roj0> m3761O8(String str, List<String> list) {
        return m3764P8(str, list, null);
    }

    /* JADX INFO: renamed from: P6 */
    public c<roj0> m3762P6(final GroupCreate groupCreate, List<Picture> list) {
        groupCreate.avatars = list;
        return scheduled(C0154a.m3190W(), -1, new v9j() { // from class: l.fk7
            public final Object call() {
                return this.f12742a.m3740H7(groupCreate);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m3763P7(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: P8 */
    public c<roj0> m3764P8(final String str, final List<String> list, final e30<List<ChatGroupMember>> e30Var) {
        return scheduled("chat-groups/" + str + "/members/remove", -1, new v9j() { // from class: l.fi7
            public final Object call() {
                return this.f12725a.m3852s8(list, str, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public String m3765Q6() {
        GroupSetting groupSetting = (GroupSetting) this.f3785r0.get();
        return NullChecker.a(groupSetting) ? groupSetting.groupDescriptionEditTip : "";
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ c m3766Q7(final String str, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.oh7
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.ph7
            public final void call(Object obj) {
                this.f18731a.m3763P7((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.rh7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public c<roj0> m3767Q8(String str) {
        return m3793Z7(str, null);
    }

    /* JADX INFO: renamed from: R6 */
    public c<Integer> m3768R6() {
        return this.f3780m0.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ c m3769R7(final JoinCondition joinCondition, final String str) {
        return c.fromCallable(new Callable() { // from class: l.ch7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0162e.m3557B5(joinCondition);
            }
        }).flatMap(new w9j() { // from class: l.dh7
            public final Object call(Object obj) {
                return this.f10395a.m3766Q7(str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R8 */
    public void m3770R8() {
        m3807e7().subscribe(mkd0.H(new e30() { // from class: l.ll7
            public final void call(Object obj) {
                this.f16507a.m3855t8((Data) obj);
            }
        }, new e30() { // from class: l.nf7
            public final void call(Object obj) {
                C0162e.m3626Y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S6 */
    public c<roj0> m3771S6(String str, final String str2, final Action action) {
        final String strM3257n = C0154a.m3257n(str + "?method=patch");
        return scheduled("patch/chat-groups/groupManager/" + str, -1, new v9j() { // from class: l.yg7
            public final Object call() {
                return this.f28199a.m3748K7(str2, action, strM3257n);
            }
        });
    }

    /* JADX INFO: renamed from: S8 */
    public c<roj0> m3773S8() {
        return this.f3779l0.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: T6 */
    public c<ChatGroupMember> m3774T6(String str, String str2) {
        return m3777U6(str, str2, false);
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ roj0 m3775T7(final String str, final DbLinks dbLinks) throws Exception {
        final String strM3822j6 = m3822j6(str, dbLinks.links.next);
        Envelope envelope = (Envelope) ia20.m16567a(new v9j() { // from class: l.lk7
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3822j6).f().b();
            }
        }).toBlocking().c((Object) null);
        Links links = dbLinks.links;
        if (links.previous == null) {
            links.previous = envelope.pagination.links.previous;
        }
        links.next = envelope.pagination.links.next;
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.mk7
            public final void call() {
                qib0.f19813k0.f23550c.upsert(dbLinks);
            }
        });
        this.f3778k0.put(Long.valueOf(mqi0.o()));
        if (NullChecker.a(dbLinks.links.next)) {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.nk7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17716a.m3772S7(str, dbLinks);
                }
            }, f3753B0);
            int i = f3753B0;
            if (i > 100) {
                f3753B0 = i - 200;
            }
        }
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroupMembers)) {
            this.f3779l0.onNext(roj0.a);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: T8 */
    public void m3776T8(int i) {
        this.f3780m0.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: U6 */
    public c<ChatGroupMember> m3777U6(final String str, final String str2, final boolean z) {
        return CoreModule.f1542k.f11207o.uiGet(str + str2).doOnNext(new e30() { // from class: l.al7
            public final void call(Object obj) {
                this.f8312a.m3751L7(str2, z, str, (ChatGroupMember) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m3778U7(String str, roj0 roj0Var) {
        final ChatGroup chatGroupQuery = CoreModule.f1542k.f11206n.query(str);
        if (!NullChecker.a(chatGroupQuery) || chatGroupQuery.localMembersLoaded) {
            return;
        }
        chatGroupQuery.localMembersLoaded = true;
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kl7
            public final void call() {
                CoreModule.f1542k.f11206n.upsert(chatGroupQuery);
            }
        });
    }

    /* JADX INFO: renamed from: U8 */
    public c<roj0> m3779U8() {
        return scheduled(" /v3/users/me/notification-counters", 0, new v9j() { // from class: l.zh7
            public final Object call() {
                return this.f28758a.m3861v8();
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public c<roj0> m3780V6() {
        return this.f3781n0.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ DbLinks m3781V7(String str) throws Exception {
        return qib0.f19813k0.f23550c.query(m3826k6(str));
    }

    /* JADX INFO: renamed from: V8 */
    public List<ChatGroupMember> m3782V8(String str) {
        return CoreModule.f1542k.f11207o.query(Filter.AND(new Filter[]{ChatGroupMember.GROUPID.EQ(str), ChatGroupMember.STATUS.NEQ("exited")}), (Order) null, 2000);
    }

    /* JADX INFO: renamed from: W6 */
    public c<List<ChatGroupMember>> m3783W6(String str) {
        return CoreModule.f1542k.f11207o.m27605G(str).m();
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m3784W7(String str) {
        CoreModule.f1542k.f11207o.deleteAll();
        qib0.f19813k0.f23550c.delete(m3826k6(str));
    }

    /* JADX INFO: renamed from: W8 */
    public ChatGroupMember m3785W8(String str, String str2) {
        return CoreModule.f1542k.f11207o.queryCache(str + str2);
    }

    /* JADX INFO: renamed from: X6 */
    public c<roj0> m3786X6() {
        return this.f3761T.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ c m3787X7(final String str, DbLinks dbLinks) {
        if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.previous)) {
            DbLinks dbLinksNew_ = DbLinks.new_();
            ((DbObject) dbLinksNew_).id = m3826k6(str);
            dbLinksNew_.links.next = this.f3786s0;
            return m3729D8(str, dbLinksNew_);
        }
        if (NullChecker.a(dbLinks.links.next)) {
            return m3729D8(str, dbLinks);
        }
        if (((Long) this.f3778k0.get()).longValue() == 0 || !qqi0.h(mqi0.o(), ((Long) this.f3778k0.get()).longValue(), 60)) {
            return m3735F8(str, dbLinks);
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.nj7
            public final void call() {
                this.f17700a.m3784W7(str);
            }
        });
        DbLinks dbLinksNew_2 = DbLinks.new_();
        ((DbObject) dbLinksNew_2).id = m3826k6(str);
        dbLinksNew_2.links.next = this.f3786s0;
        return m3729D8(str, dbLinksNew_2);
    }

    /* JADX INFO: renamed from: X8 */
    public c<roj0> m3788X8(String str) {
        return m3791Y8(str, new w9j() { // from class: l.mi7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public c<DbLinks> m3789Y6(String str) {
        return qib0.f19813k0.f23550c.uiGet(m3826k6(str));
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ c m3790Y7(DbLinks dbLinks, final String str) {
        if (dbLinks == null) {
            return c.fromCallable(new Callable() { // from class: l.yf7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f28186a.m3781V7(str);
                }
            }).flatMap(new w9j() { // from class: l.jg7
                public final Object call(Object obj) {
                    return this.f15143a.m3787X7(str, (DbLinks) obj);
                }
            }).compose(mkd0.C());
        }
        return NullChecker.a(dbLinks.links.next) ? m3729D8(str, dbLinks).compose(mkd0.C()) : m3735F8(str, dbLinks).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: Y8 */
    public <R> c<R> m3791Y8(final String str, @NonNull final w9j<Envelope, R> w9jVar) {
        return scheduled("chat-groups/" + str, 0, new v9j() { // from class: l.vi7
            public final Object call() {
                return this.f24332a.m3870y8(str, w9jVar);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public String m3792Z6() {
        GroupSetting groupSetting = (GroupSetting) this.f3785r0.get();
        return NullChecker.a(groupSetting) ? groupSetting.groupNameEditTip : "";
    }

    /* JADX INFO: renamed from: Z8 */
    public c<roj0> m3794Z8(final String str, final String str2) {
        return scheduled("chat-groups/" + str + "/" + str2, 0, new v9j() { // from class: l.wj7
            public final Object call() {
                return this.f25177a.m3720A8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public c<roj0> m3795a7() {
        return scheduled(C0154a.m3194X(), 0, new v9j() { // from class: l.tj7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.uj7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3194X()).f().b();
                    }
                }).doOnNext(new e30() { // from class: l.vj7
                    public final void call(Object obj) {
                        CoreModule.f1534c.m3422w3((Envelope) obj, null);
                    }
                }).compose(C0154a.m3182T2());
            }
        }).map(new w9j() { // from class: l.ek7
            public final Object call(Object obj) {
                return this.f11193a.m3754M7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ roj0 m3796a8(final String str, final DbLinks dbLinks) throws Exception {
        final String strM3829l6 = m3829l6(str, dbLinks.links.previous);
        Envelope envelope = (Envelope) ia20.m16567a(new v9j() { // from class: l.ef7
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3829l6).f().b();
            }
        }).toBlocking().b();
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroupMembers)) {
            this.f3761T.onNext(roj0.a);
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < envelope.getModuleData(CoreData.class).chatGroupMembers.size(); i++) {
                ChatGroupMember chatGroupMember = (ChatGroupMember) envelope.getModuleData(CoreData.class).chatGroupMembers.get(i);
                if (TEnum.equals(chatGroupMember.status, "exited")) {
                    arrayList.add(chatGroupMember);
                }
            }
            String str2 = envelope.pagination.links.previous;
            if (str2 != null) {
                dbLinks.links.previous = str2;
            }
            envelope.getModuleData(CoreData.class).chatGroupMembers.removeAll(arrayList);
            this.f8580Q.m3424y3(envelope, new d30() { // from class: l.ff7
                public final void call() {
                    C0162e.m3663i3(arrayList, str, dbLinks);
                }
            }, false, false, false);
            this.f3779l0.onNext(roj0.a);
        }
        this.f3778k0.put(Long.valueOf(mqi0.o()));
        if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroupMembers) && envelope.getModuleData(CoreData.class).chatGroupMembers.size() >= envelope.pagination.limit) {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.gf7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13292a.m3793Z7(str, dbLinks);
                }
            }, 100L);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: a9 */
    public c<roj0> m3797a9() {
        final String strUserId = CoreModule.m1850H().userId();
        return scheduled("topic/notification-counters/" + strUserId, 0, new v9j() { // from class: l.ok7
            public final Object call() {
                return this.f18262a.m3726C8(strUserId);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public c<roj0> m3798b7(final String str) {
        return scheduled(C0154a.m3194X() + "&" + str, 0, new v9j() { // from class: l.wi7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.gk7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3194X() + "&" + str).f().b();
                    }
                }).compose(C0154a.m3182T2());
            }
        }).map(new w9j() { // from class: l.yi7
            public final Object call(Object obj) {
                return this.f28217a.m3757N7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m3799b8(String str, boolean z, Envelope envelope) {
        final Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.muted = z;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.uf7
            public final void call() {
                CoreModule.f1542k.f11205m.upsert(conversationQuery);
            }
        });
    }

    /* JADX INFO: renamed from: b9 */
    public c<roj0> m3800b9(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(str2)) {
            arrayList.add(str2);
        }
        return m3761O8(str, arrayList);
    }

    /* JADX INFO: renamed from: c7 */
    public c<Pair<Links, List<GroupNotification>>> m3801c7() {
        return this.f3788u0.asObservable();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ c m3802c8(final String str, final boolean z, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.ik7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/conversations/" + str + "?method=patch&muted=" + z)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.jk7
            public final void call(Object obj) {
                this.f15187a.m3799b8(str, z, (Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.kk7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: c9 */
    public c<Pair<Links, Pair<List<ChatGroup>, List<ChatGroup>>>> m3803c9(final String str, final String str2) {
        return scheduled("/v3/chat-groups?keyword=" + str + str2, 0, new v9j() { // from class: l.ui7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.cl7
                    public final Object call() {
                        return C0162e.m3621W5(str, str);
                    }
                }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.dl7
                    public final Object call(Object obj) {
                        Envelope envelope = (Envelope) obj;
                        return Pair.create(envelope.pagination.links, Pair.create(envelope.getModuleData(CoreData.class).chatGroups, envelope.getModuleData(CoreData.class).interestedGroups));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: d7 */
    public String m3804d7() {
        GroupSetting groupSetting = (GroupSetting) this.f3785r0.get();
        return NullChecker.a(groupSetting) ? groupSetting.groupNotificationsURL : "";
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ c m3805d8(final boolean z, final String str) {
        return c.fromCallable(new Callable() { // from class: l.ri7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0162e.m3715z3(z);
            }
        }).flatMap(new w9j() { // from class: l.si7
            public final Object call(Object obj) {
                return this.f21325a.m3802c8(str, z, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public List<ChatGroupMember> m3806d9(String str, String str2) {
        return CoreModule.f1542k.f11207o.query(Filter.AND(new Filter[]{ChatGroupMember.SEARCHCATEGORY.CONTAINS(str), ChatGroupMember.GROUPID.EQ(str2), ChatGroupMember.STATUS.NEQ("exited")}), (Order) null, 0);
    }

    /* JADX INFO: renamed from: e7 */
    public final c<Data> m3807e7() {
        return scheduled("v3/group-settings", 0, new v9j() { // from class: l.bj7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.ck7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3277s()).f().b();
                    }
                }).map(new w9j() { // from class: l.dk7
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ roj0 m3808e8(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).groupApplies)) {
            this.f3763V.onNext((GroupApply) envelope.getModuleData(CoreData.class).groupApplies.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: e9 */
    public c<List<String>> m3809e9() {
        return scheduled("/v3/search-keywords", 0, new v9j() { // from class: l.xh7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.yj7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3265p()).f().b();
                    }
                }).compose(C0154a.m3182T2());
            }
        }).map(new w9j() { // from class: l.yh7
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).keywords;
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public c<List<GroupTab>> m3810f7() {
        return this.f3793z0.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m3811f8(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: f9 */
    public void m3812f9(@NonNull GroupTab groupTab) {
        this.f3787t0.onNext(groupTab);
    }

    /* JADX INFO: renamed from: g7, reason: merged with bridge method [inline-methods] */
    public void m3722B7(List<Conversation> list) {
        for (Conversation conversation : list) {
            if (CoreModule.f1542k.f11196d.query(((DbObject) conversation).id) == null) {
                DbLinks dbLinks = new DbLinks();
                ((DbObject) dbLinks).id = ((DbObject) conversation).id;
                PartialIdList partialIdList = conversation.api_only_messages;
                dbLinks.links = partialIdList == null ? new Links() : partialIdList.links;
                CoreModule.f1542k.f11196d.upsert(dbLinks);
            }
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ c m3814g8(final String str, final GroupUpdateData groupUpdateData) {
        return ia20.m16571e(new v9j() { // from class: l.hj7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "?method=patch")).l(utc0.create(Network.JSON, groupUpdateData.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.jj7
            public final void call(Object obj) {
                this.f15173a.m3811f8((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.kj7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: g9 */
    public final String m3815g9() {
        GroupTab groupTabM3821i9 = m3821i9();
        return (groupTabM3821i9 == null || this.f3792y0.equals(groupTabM3821i9)) ? "" : String.valueOf(groupTabM3821i9.id);
    }

    /* JADX INFO: renamed from: h7 */
    public ChatGroup m3816h7(String str) {
        return CoreModule.f1542k.f11206n.queryCache(str);
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m3817h8(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: h9 */
    public c<GroupTab> m3818h9() {
        return this.f3787t0.asObservable();
    }

    /* JADX INFO: renamed from: i7 */
    public c<Conversation> m3819i7(final String str, final String str2, final String str3) {
        return CoreModule.f1534c.f3631f0.m4546Dg(str).take(1).flatMap(new w9j() { // from class: l.mg7
            public final Object call(Object obj) {
                return this.f16965a.m3760O7(str, str2, str3, (Conversation) obj);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ c m3820i8(final String str, final GroupUpdateData groupUpdateData) {
        return ia20.m16571e(new v9j() { // from class: l.gi7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "?method=patch")).l(utc0.create(Network.JSON, groupUpdateData.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.hi7
            public final void call(Object obj) {
                this.f13895a.m3817h8((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.ii7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: i9 */
    public GroupTab m3821i9() {
        return (GroupTab) this.f3787t0.e();
    }

    /* JADX INFO: renamed from: j6 */
    public final String m3822j6(String str, String str2) {
        if (!str2.endsWith("&with=users")) {
            str2 = str2.concat("&with=users");
        }
        return C0154a.m3257n(str + "/members?" + str2);
    }

    /* JADX INFO: renamed from: j7 */
    public c<Conversation> m3823j7(final String str, String str2, String str3) {
        return CoreModule.f1534c.f3634g0.m3832m6(str, str2, str3).flatMap(new w9j() { // from class: l.wg7
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3631f0.m4546Dg(str).take(1).doOnNext(new e30() { // from class: l.jh7
                    public final void call(Object obj2) {
                        Conversation conversation = (Conversation) obj2;
                        lsi0.y((NullChecker.a(conversation) && TEnum.equals(ConversationStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER), conversation.status)) ? CoreModule.f1533b.getString(R.string.h) : CoreModule.f1533b.getString(R.string.g));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m3824j8(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: j9 */
    public Conversation m3825j9(String str) {
        return this.f3784q0.get(str);
    }

    /* JADX INFO: renamed from: k6 */
    public final String m3826k6(String str) {
        return C0154a.m3257n(str + "/members");
    }

    /* JADX INFO: renamed from: k7 */
    public c<roj0> m3827k7(String str, final JoinCondition joinCondition) {
        final String strM3257n = C0154a.m3257n(str + "?method=patch");
        return scheduled("patch/chat-groups/joinGroupType/" + str, -1, new v9j() { // from class: l.xg7
            public final Object call() {
                return this.f27504a.m3769R7(joinCondition, strM3257n);
            }
        });
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ c m3828k8(final String str, final GroupUpdateData groupUpdateData) {
        return ia20.m16571e(new v9j() { // from class: l.qj7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "?method=patch")).l(utc0.create(Network.JSON, groupUpdateData.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.rj7
            public final void call(Object obj) {
                this.f20573a.m3824j8((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.sj7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public final String m3829l6(String str, String str2) {
        return m3822j6(str, str2.replace("filter=default", ""));
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ void m3830l7(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ c m3831l8(boolean z, String str, Envelope envelope) {
        if (!z && !vwb.J(envelope.getModuleData(CoreData.class).chatGroupMembers)) {
            ChatGroupMember chatGroupMember = (ChatGroupMember) envelope.getModuleData(CoreData.class).chatGroupMembers.get(0);
            if (NullChecker.a(chatGroupMember.inModeration) && !TextUtils.isEmpty(chatGroupMember.inModeration.nickName)) {
                lsi0.y("已提交，待审核通过后生效。");
                this.f8580Q.m3422w3(envelope, null);
                return c.just(chatGroupMember);
            }
        }
        return m3774T6(str, CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: m6 */
    public c<roj0> m3832m6(final String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "join_group");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("reason", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("scene", str3);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return scheduled("chat-groups/" + str + "/group-applies", -1, new v9j() { // from class: l.eh7
            public final Object call() {
                return this.f11142a.m3833m7(str, jSONObject);
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.gh7
            public final Object call(Object obj) {
                return this.f13315a.m3836n7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ c m3833m7(final String str, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.sh7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "/group-applies")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.th7
            public final void call(Object obj) {
                this.f22111a.m3830l7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m3834m8(final ChatGroupMember chatGroupMember, String str) {
        chatGroupMember.nickName = str;
        chatGroupMember.nickNamePinyin = evk.c().d(chatGroupMember.nickName).toUpperCase();
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kh7
            public final void call() {
                CoreModule.f1542k.f11207o.upsert(chatGroupMember);
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public c<roj0> m3835n6(final String str, final String str2, final boolean z) {
        return scheduled("/v3/banned-user/" + str + "/" + str2, -1, new v9j() { // from class: l.ei7
            public final Object call() {
                return this.f11164a.m3842p7(z, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ roj0 m3836n7(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).groupApplies)) {
            GroupApply groupApply = (GroupApply) envelope.getModuleData(CoreData.class).groupApplies.get(0);
            this.f3763V.onNext(groupApply);
            this.f3765X.put(groupApply.groupId, groupApply);
            this.f3766Y.onNext(roj0.a);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m3837n8(boolean z, final String str, final ChatGroupMember chatGroupMember) {
        if (z || !NullChecker.a(chatGroupMember.inModeration) || TextUtils.isEmpty(chatGroupMember.inModeration.nickName)) {
            e51.y(new Runnable() { // from class: l.sg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21295a.m3834m8(chatGroupMember, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o6 */
    public c<ChatGroup> m3838o6(String str) {
        return CoreModule.f1542k.f11206n.uiGet(str).filter(new qh7());
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m3839o7(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ c m3840o8(final String str, final boolean z, final String str2, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.bg7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/chat-groups/" + str + "?method=patch")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).flatMap(new w9j() { // from class: l.cg7
            public final Object call(Object obj) {
                return this.f9647a.m3831l8(z, str, (Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.dg7
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((ChatGroupMember) obj));
            }
        }).take(1).doOnNext(new e30() { // from class: l.eg7
            public final void call(Object obj) {
                this.f11132a.m3837n8(z, str2, (ChatGroupMember) obj);
            }
        }).map(new w9j() { // from class: l.fg7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: p6 */
    public c<CoreData> m3841p6(final String str) {
        return scheduled("/v3/chat-groups?search=quanzi&with=group-applies&keyword=" + str, 0, new v9j() { // from class: l.xj7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.qk7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3137H2("/chat-groups?search=quanzi&with=group-applies,members&keyword=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.rk7
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ c m3842p7(boolean z, final String str, final String str2) {
        final ChatGroupMember chatGroupMember = new ChatGroupMember();
        ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
        chatGroupSilence.enable = z;
        chatGroupSilence.duration = 600L;
        chatGroupMember.silence = chatGroupSilence;
        return ia20.m16571e(new v9j() { // from class: l.fl7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3281t(str, str2)).k(utc0.create(Network.JSON, chatGroupMember.toJson())).b();
            }
        }).doOnNext(new e30() { // from class: l.gl7
            public final void call(Object obj) {
                this.f13356a.m3839o7((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.hl7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ c m3843p8(final String str, final String str2, final boolean z) {
        return c.fromCallable(new Callable() { // from class: l.xk7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0162e.m3700u3(str);
            }
        }).flatMap(new w9j() { // from class: l.yk7
            public final Object call(Object obj) {
                return this.f28257a.m3840o8(str2, z, str, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public c<roj0> m3844q6() {
        return m3871z6().flatMap(new w9j() { // from class: l.ug7
            public final Object call(Object obj) {
                return this.f23527a.m3845q7((String) obj);
            }
        }).map(new w9j() { // from class: l.fh7
            public final Object call(Object obj) {
                return this.f12713a.m3848r7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ c m3845q7(final String str) {
        return scheduled("/v3/chat-groups?search=suggested/" + str, 0, new v9j() { // from class: l.ji7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.il7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3269q(str)).f().b();
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m3846q8(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: r6 */
    public c<roj0> m3847r6(final String str) {
        final String strM3815g9 = m3815g9();
        return scheduled("/v3/chat-groups?search=suggested/" + strM3815g9 + "/&" + str, 0, new v9j() { // from class: l.zk7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.wf7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3269q(str) + "&" + str).f().b();
                    }
                }).compose(C0154a.m3182T2());
            }
        }).map(new w9j() { // from class: l.bl7
            public final Object call(Object obj) {
                return this.f8967a.m3851s7((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ roj0 m3848r7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(envelope.getModuleData(CoreData.class).chatGroups);
        this.f3765X.clear();
        this.f3762U.onNext(new Pair(envelope.pagination.links, arrayList));
        this.f3768a0.onNext(new knb0(envelope.getModuleData(CoreData.class).chatGroups, envelope.getModuleData(CoreData.class).chatGroupMembers, envelope.getModuleData(CoreData.class).groupApplies, envelope.getModuleData(CommonData.class).users));
        return roj0.a;
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ c m3849r8(final String str, final e30 e30Var, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.xf7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "/members?method=patch")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.zf7
            public final void call(Object obj) {
                this.f28733a.m3846q8((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.ag7
            public final Object call(Object obj) {
                return C0162e.m3675l5(e30Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public ChatGroup m3850s6(String str) {
        return CoreModule.f1542k.f11206n.queryCache(str);
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ roj0 m3851s7(Envelope envelope) {
        ArrayList arrayList = new ArrayList(envelope.getModuleData(CoreData.class).chatGroups);
        Pair pair = (Pair) this.f3762U.e();
        final List arrayList2 = pair == null ? new ArrayList() : (List) pair.second;
        arrayList2.addAll(vwb.n(arrayList, new w9j() { // from class: l.of7
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m(arrayList2, new w9j() { // from class: l.rg7
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((DbObject) ((ChatGroup) obj2)).id.equals(((DbObject) chatGroup).id));
                    }
                }));
            }
        }));
        this.f3762U.onNext(new Pair(envelope.pagination.links, arrayList2));
        return roj0.a;
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ c m3852s8(final List list, final String str, final e30 e30Var) {
        return c.fromCallable(new Callable() { // from class: l.sk7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0162e.m3577I4(list);
            }
        }).flatMap(new w9j() { // from class: l.tk7
            public final Object call(Object obj) {
                return this.f22148a.m3849r8(str, e30Var, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public void m3853t6() {
        this.f8580Q.f3631f0.m4893gf().observeOn(Schedulers.io()).first().map(new w9j() { // from class: l.fj7
            public final Object call(Object obj) {
                return this.f12736a.m3854t7((List) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.gj7
            public final void call(Object obj) {
                C0162e.m3709x3(obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ Object m3854t7(List list) {
        Conversation conversation = (Conversation) list.get(0);
        String str = System.currentTimeMillis() + "";
        final Conversation conversationClone = conversation.clone();
        ((DbObject) conversationClone).id = "30909999";
        conversationClone.convType = "group";
        conversationClone.otherUser = str;
        final ChatGroup chatGroupNew_ = ChatGroup.new_();
        ((DbObject) chatGroupNew_).id = str;
        chatGroupNew_.name = "探探员工大群";
        ArrayList arrayList = new ArrayList();
        User userM21396Q9 = this.f8580Q.f3628e0.m21396Q9(conversation.otherUser);
        Iterator it = userM21396Q9.pictures.iterator();
        while (it.hasNext()) {
            arrayList.add(((Media) it.next()).cover().profileSmall().formatted());
        }
        chatGroupNew_.ownerUserId = ((DbObject) userM21396Q9).id;
        List<Message> listQuery = CoreModule.f1542k.f11195c.query(Filter.TRUE, ((OrderedColumn) Message.CREATEDTIME).DESC, 500);
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        if (!vwb.J(listQuery)) {
            for (Message message : listQuery) {
                Message messageClone = message.clone();
                ((DbObject) messageClone).id += "1";
                messageClone.cid = "30909999";
                messageClone.channel = MessageChannel.get("group");
                messageClone.status = MessageStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
                arrayList2.add(messageClone);
                ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
                String str2 = message.owner;
                ((DbObject) chatGroupMemberNew_).id = str2;
                chatGroupMemberNew_.groupId = str;
                chatGroupMemberNew_.userId = str2;
                User userM21396Q10 = CoreModule.f1534c.f3628e0.m21396Q9(str2);
                chatGroupMemberNew_.avatar = ((Media) userM21396Q10.pictures.get(0)).cover().profileSmall().formatted();
                chatGroupMemberNew_.nickName = userM21396Q10.name;
                chatGroupMemberNew_.nickNamePinyin = evk.c().d(chatGroupMemberNew_.nickName).toUpperCase();
                chatGroupMemberNew_.searchCategory = chatGroupMemberNew_.nickName + "|" + chatGroupMemberNew_.nickNamePinyin;
                double d = userM21396Q10.createdTime;
                chatGroupMemberNew_.createdTime = d;
                chatGroupMemberNew_.updatedTime = d;
                arrayList3.add(chatGroupMemberNew_);
            }
        }
        this.f8580Q.m3422w3(Envelope.new_(), new d30() { // from class: l.jl7
            public final void call() {
                C0162e.m3699t5(chatGroupNew_, conversationClone, arrayList2, arrayList3);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m3855t8(Data data) {
        m3744I8(data.getModuleData(CoreData.class).groupTabs);
        this.f3758A0.z();
        if (vwb.J(data.getModuleData(CoreData.class).groupSettings)) {
            return;
        }
        this.f3785r0.put((GroupSetting) data.getModuleData(CoreData.class).groupSettings.get(0));
    }

    /* JADX INFO: renamed from: u6 */
    public void m3856u6(final boolean z, final boolean z2) {
        c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.zi7
            public final Object call(Object obj) {
                return this.f28760a.m3857u7(z, z2, (roj0) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.aj7
            public final void call(Object obj) {
                C0162e.m3590M4((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ roj0 m3857u7(boolean z, boolean z2, roj0 roj0Var) {
        wxz wxzVar = CoreModule.f1542k.f11195c;
        Filter filter = Filter.TRUE;
        final Message messageClone = ((Message) wxzVar.query(filter, ((OrderedColumn) Message.CREATEDTIME).DESC, 1).get(0)).clone();
        List listQuery = qib0.f19813k0.f23551d.query(filter, ((OrderedColumn) User._ID).DESC, 30);
        Conversation conversation = (Conversation) CoreModule.f1542k.f11205m.query(Conversation.CONVTYPE.CONTAINS("group"), ((OrderedColumn) Conversation._ID).DESC, 1).get(0);
        User userClone = ((User) listQuery.get(0)).clone();
        ((DbObject) messageClone).id = System.currentTimeMillis() + "";
        messageClone.owner = ((DbObject) userClone).id;
        messageClone.cid = ((DbObject) conversation).id;
        messageClone.channel = MessageChannel.get("group");
        messageClone.status = MessageStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        messageClone.messageType = MessageType.get("text");
        messageClone.createdTime = System.currentTimeMillis();
        messageClone.localCreatedTime = System.currentTimeMillis();
        long jCurrentTimeMillis = (System.currentTimeMillis() % 5) + 35;
        messageClone.value = "";
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jCurrentTimeMillis; i++) {
            messageClone.value += m3585K6();
            if (i % 5 == 0) {
                messageClone.value += "＄";
                arrayList.add(((DbObject) ((User) listQuery.get(1))).id);
            }
            if (z && i % 11 == 0) {
                messageClone.value += "＄";
                arrayList.add("0");
            }
            if (z2 && i % 9 == 0) {
                messageClone.value += "＄";
                arrayList.add(((DbObject) CoreModule.f1534c.f3628e0.m21483na()).id);
            }
        }
        messageClone.notifiedUsers = arrayList;
        final ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
        String str = System.currentTimeMillis() + "";
        ((DbObject) chatGroupMemberNew_).id = str.substring(5, str.length());
        chatGroupMemberNew_.groupId = conversation.otherUser;
        chatGroupMemberNew_.userId = ((DbObject) userClone).id;
        chatGroupMemberNew_.avatar = ((Media) userClone.pictures.get(0)).cover().profileSmall().formatted();
        chatGroupMemberNew_.nickName = userClone.name;
        chatGroupMemberNew_.nickNamePinyin = evk.c().d(chatGroupMemberNew_.nickName).toUpperCase();
        chatGroupMemberNew_.searchCategory = chatGroupMemberNew_.nickName + "|" + chatGroupMemberNew_.nickNamePinyin;
        double d = userClone.createdTime;
        chatGroupMemberNew_.createdTime = d;
        chatGroupMemberNew_.updatedTime = d;
        this.f8580Q.m3422w3(Envelope.new_(), new d30() { // from class: l.wk7
            public final void call() {
                C0162e.m3657g5(messageClone, chatGroupMemberNew_);
            }
        });
        return roj0Var;
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ roj0 m3858u8(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).notificationCounters)) {
            this.f3764W.onNext((NotificationCounter) envelope.getModuleData(CoreData.class).notificationCounters.get(0));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: v6 */
    public void m3859v6() {
        c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.oj7
            public final Object call(Object obj) {
                return this.f18254a.m3860v7((roj0) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pj7
            public final void call(Object obj) {
                C0162e.m3703v3((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ roj0 m3860v7(roj0 roj0Var) {
        final Message messageClone = ((Message) CoreModule.f1542k.f11195c.query(Filter.TRUE, ((OrderedColumn) Message.CREATEDTIME).DESC, 1).get(0)).clone();
        Conversation conversation = (Conversation) CoreModule.f1542k.f11205m.query(Conversation.CONVTYPE.CONTAINS("group"), ((OrderedColumn) Conversation._ID).DESC, 1).get(0);
        ((DbObject) messageClone).id = System.currentTimeMillis() + "";
        StringBuilder sb = new StringBuilder("39009");
        sb.append(System.currentTimeMillis() / 5000);
        messageClone.owner = sb.toString();
        messageClone.cid = ((DbObject) conversation).id;
        messageClone.channel = MessageChannel.get("group");
        messageClone.status = MessageStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        messageClone.messageType = MessageType.get("text");
        messageClone.createdTime = System.currentTimeMillis();
        messageClone.localCreatedTime = System.currentTimeMillis();
        System.currentTimeMillis();
        messageClone.value = "这个是一个没有用户信息的消息哦";
        this.f8580Q.m3422w3(Envelope.new_(), new d30() { // from class: l.df7
            public final void call() {
                C0162e.m3704v4(messageClone);
            }
        });
        return roj0Var;
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ c m3861v8() {
        return ia20.m16571e(new v9j() { // from class: l.ni7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3273r()).f().b();
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.oi7
            public final Object call(Object obj) {
                return this.f18250a.m3858u8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public c<roj0> m3862w6(String str, String str2) {
        return m3865x6(str, str2, null);
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m3863w7(String str, String str2) {
        CoreModule.f1542k.f11205m.delete(Filter.AND(new Filter[]{Conversation.ID.EQ(str), Conversation.CONVTYPE.EQ("group"), Conversation.OTHERUSER.EQ(str2)}));
        CoreModule.f1542k.f11206n.delete(str2);
        CoreModule.f1542k.f11207o.delete(ChatGroupMember.GROUPID.EQ(str2));
        qib0.f19813k0.f23550c.delete(m3826k6(str2));
        CoreModule.f1534c.f3631f0.m4658Mh(str);
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m3864w8(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }

    /* JADX INFO: renamed from: x6 */
    public c<roj0> m3865x6(final String str, final String str2, final d30 d30Var) {
        return scheduled("me/chat-groups/" + str + "/delete", -1, new v9j() { // from class: l.ci7
            public final Object call() {
                return this.f9666a.m3872z7(str, str2, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ void m3866x7(final String str, final String str2, Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hk7
            public final void call() {
                this.f13917a.m3863w7(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ Object m3867x8(final String str, w9j w9jVar, Envelope envelope) {
        if (vwb.J(envelope.getModuleData(CoreData.class).groupApplies)) {
            if (!vwb.J(envelope.getModuleData(CoreData.class).chatGroups)) {
                GroupApply groupApplyNew_ = GroupApply.new_();
                groupApplyNew_.groupId = str;
                ChatGroup chatGroup = (ChatGroup) vwb.r(envelope.getModuleData(CoreData.class).chatGroups, new w9j() { // from class: l.vf7
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((DbObject) ((ChatGroup) obj)).id.equals(str));
                    }
                });
                if (NullChecker.a(chatGroup)) {
                    if (TEnum.equals(chatGroup.groupApply.status, "approved")) {
                        groupApplyNew_.status = GroupApplyStatus.get("approved");
                    } else {
                        groupApplyNew_.status = GroupApplyStatus.get("unknown_");
                    }
                }
                this.f3765X.put(str, groupApplyNew_);
                this.f3766Y.onNext(roj0.a);
            }
            this.f3763V.onNext((Object) null);
        } else {
            GroupApply groupApply = (GroupApply) envelope.getModuleData(CoreData.class).groupApplies.get(0);
            this.f3763V.onNext(groupApply);
            this.f3765X.put(groupApply.groupId, groupApply);
            this.f3766Y.onNext(roj0.a);
        }
        return w9jVar.call(envelope);
    }

    /* JADX INFO: renamed from: y6 */
    public c<roj0> m3868y6() {
        return this.f3767Z.asObservable();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ roj0 m3869y7(String str, d30 d30Var, Envelope envelope) {
        GroupApply groupApplyNew_ = GroupApply.new_();
        groupApplyNew_.groupId = str;
        groupApplyNew_.status = GroupApplyStatus.get("unknown_");
        this.f3765X.put(str, groupApplyNew_);
        rx.subjects.a<roj0> aVar = this.f3766Y;
        roj0 roj0Var = roj0.a;
        aVar.onNext(roj0Var);
        this.f3767Z.onNext(roj0Var);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        return roj0Var;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ c m3870y8(final String str, final w9j w9jVar) {
        return ia20.m16571e(new v9j() { // from class: l.zj7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3257n(str + "?with=members,users,group-applies")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.ak7
            public final void call(Object obj) {
                this.f8293a.m3864w8((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.bk7
            public final Object call(Object obj) {
                return this.f8933a.m3867x8(str, w9jVar, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final c<String> m3871z6() {
        return this.f3793z0.e() == null ? this.f3758A0.k().asObservable().take(1).doOnNext(new e30() { // from class: l.ki7
            public final void call(Object obj) {
                this.f15839a.m3744I8((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.li7
            public final Object call(Object obj) {
                return this.f16425a.m3719A7((List) obj);
            }
        }) : c.just(m3815g9());
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ c m3872z7(final String str, final String str2, final d30 d30Var) {
        return ia20.m16571e(new v9j() { // from class: l.cj7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/chat-groups/" + str)).d().b();
            }
        }).doOnNext(new e30() { // from class: l.dj7
            public final void call(Object obj) {
                this.f10420a.m3866x7(str2, str, (Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.ej7
            public final Object call(Object obj) {
                return this.f11177a.m3869y7(str, d30Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m3873z8(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
    }
}
