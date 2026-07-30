package p149l;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.data.MessageCallToBuy;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class r07 {

    /* JADX INFO: renamed from: b */
    public static final HashSet<Integer> f157142b = new HashSet<>();

    /* JADX INFO: renamed from: c */
    public static boolean f157143c = false;

    /* JADX INFO: renamed from: d */
    public static C22392a<Boolean> f157144d = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public C4732c f157145a;

    public r07(C4732c c4732c) {
        this.f157145a = c4732c;
    }

    /* JADX INFO: renamed from: A */
    public static void m177333A(PushMessage pushMessage) {
        if (f157143c || pushMessage.silent || App.m20426e() >= 10000) {
            return;
        }
        if (((qib0.f154693H.guessedCurrentServerTime() - pushMessage.createdTime <= 600000.0d || "vivo X20A".equals(Build.MODEL)) && (qib0.f154693H.guessedCurrentServerTime() - pushMessage.createdTime <= 1200000.0d || !"vivo X20A".equals(Build.MODEL))) || SystemClock.elapsedRealtime() <= 1200000 || App.f15373i.get().intValue() <= 1) {
            return;
        }
        f157143c = true;
        f157144d.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: O */
    public static void m177334O(int i) {
        f157142b.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: P */
    public static void m177335P(int i) {
        f157142b.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m177341f() {
        Iterator<Integer> it = CoreModule.f17555m.m127660o().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (m177358w(iIntValue) || m177357v(iIntValue) || 1 == iIntValue || iIntValue == 0) {
                CoreModule.f17555m.m127649b(iIntValue);
            }
        }
        CoreModule.f17555m.m127650c();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m177344i(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m177350o(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static final int m177353r(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str) + 10000;
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final String m177354s(int i) {
        return (i + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL) + "";
    }

    /* JADX INFO: renamed from: t */
    public static final int m177355t(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return (!CoreModule.f17557o.m195057d().mo33676E() || Long.parseLong(str) <= 2147473647) ? -(Integer.parseInt(str) + 10000) : str.hashCode();
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final String m177356u(int i) {
        return (-(i + 10000)) + "";
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m177357v(int i) {
        return i > 7000;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m177358w(int i) {
        return i < -7000;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final CharSequence m177364G(Message message) {
        if (TEnum.equals(message.messageType, "tickle") && !message.isMe()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.owner);
            if (NullChecker.m81303a(userM169430Pa)) {
                return CoreModule.f17544b.getString(R$string.f55772i, userM169430Pa.name);
            }
        }
        return CoreModule.f17557o.m195057d().mo33654Ac(message);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x0311  */
    /* JADX WARN: Code duplicated, block: B:113:0x0321  */
    /* JADX WARN: Code duplicated, block: B:116:0x0329  */
    /* JADX WARN: Code duplicated, block: B:119:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00a6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x025c  */
    /* JADX INFO: renamed from: C */
    public final void m177360C(HashMap<String, ju40> map, List<Message> list, User user, int i, HashMap<String, String> map2) {
        String str;
        boolean z;
        boolean z2;
        Iterator<Integer> it;
        PushMessage pushMessage;
        Message message;
        User userM169430Pa;
        int iIntValue;
        int iIntValue2;
        ju40 ju40Var;
        String strM177378z = m177378z();
        if (CoreModule.f17557o.m195057d().mo33676E() && NullChecker.m81303a(strM177378z)) {
            str = map2.get(strM177378z);
            if (!TextUtils.isEmpty(str) && map.containsKey(str)) {
                z = true;
            }
            if ((!NullChecker.m81303a(strM177378z) && map.containsKey(strM177378z)) || z) {
                if (CoreModule.f17557o.m195057d().mo33676E()) {
                    ju40Var = map.get(str);
                    if (NullChecker.m81303a(ju40Var) || !ju40Var.m143223e()) {
                        this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
                    } else {
                        this.f157145a.f19642f0.m32867Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
                    }
                } else {
                    this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), user.f56011id);
                }
                mgh0.m154563s();
            }
            if (map.size() == 0) {
                for (Integer num : CoreModule.f17555m.m127660o()) {
                    iIntValue2 = num.intValue();
                    if (f157142b.contains(num) && (m177358w(iIntValue2) || iIntValue2 == 2)) {
                        CoreModule.f17555m.m127649b(iIntValue2);
                    }
                }
                return;
            }
            if (vwb.m200346r(list, new w9j() { // from class: l.g07
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                }
            }) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (map.size() <= 3 || CoreModule.f17555m.m127659n(0)) {
                it = CoreModule.f17555m.m127660o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m177358w(iIntValue)) {
                        CoreModule.f17555m.m127649b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = PushMessageIntent.conversation_list;
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.f17544b.getString(R$string.f55779p);
                pushMessage.value = CoreModule.f17544b.getString(R$string.f55782s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.f17557o.m195057d().mo33676E() || !message.isGroupMessage()) {
                    userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                    if (NullChecker.m81303a(userM169430Pa)) {
                        m177372Q(pushMessage, userM169430Pa);
                    }
                } else {
                    pushMessage.intent = PushMessageIntent.conversation_group;
                    PushMessageContent pushMessageContent = pushMessage.content;
                    pushMessageContent.type = "conversation";
                    pushMessageContent.f38804id = message.cid;
                    ChatGroup chatGroupM31920s6 = this.f157145a.f19645g0.m31920s6(message.getHostId());
                    if (NullChecker.m81303a(chatGroupM31920s6) && !vwb.m200296J(chatGroupM31920s6.avatars)) {
                        pushMessage.primaryPicture = chatGroupM31920s6.avatars.get(0).cover().profileSmall().formatted();
                    }
                    if (TextUtils.isEmpty(pushMessage.primaryPicture)) {
                        pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                    }
                }
                m177376x(pushMessage);
            } else {
                Iterator<Integer> it2 = CoreModule.f17555m.m127660o().iterator();
                while (it2.hasNext()) {
                    int iIntValue3 = it2.next().intValue();
                    if (m177358w(iIntValue3) && !map.containsKey(m177356u(iIntValue3))) {
                        CoreModule.f17555m.m127649b(iIntValue3);
                    }
                }
                CoreModule.f17555m.m127649b(2);
                for (Map.Entry<String, ju40> entry : map.entrySet()) {
                    ju40 value = entry.getValue();
                    PushMessage pushMessage2 = new PushMessage();
                    pushMessage2.intent = PushMessageIntent.conversation_single;
                    PushMessageContent pushMessageContent2 = new PushMessageContent();
                    pushMessage2.content = pushMessageContent2;
                    pushMessageContent2.type = "conversation";
                    pushMessageContent2.f38804id = entry.getKey();
                    pushMessage2.priority = 4;
                    Message messageM143220b = entry.getValue().m143220b(0);
                    if (CoreModule.f17557o.m195057d().mo33676E() && value.m143223e()) {
                        pushMessage2.intent = PushMessageIntent.conversation_group;
                        pushMessage2.stackId = m177355t(value.m143221c());
                        ChatGroup chatGroupM31920s7 = this.f157145a.f19645g0.m31920s6(value.m143221c());
                        pushMessage2.title = chatGroupM31920s7 == null ? CoreModule.f17544b.getString(R$string.f55779p) : chatGroupM31920s7.name;
                        if (NullChecker.m81303a(chatGroupM31920s7) && !vwb.m200296J(chatGroupM31920s7.avatars)) {
                            pushMessage2.primaryPicture = chatGroupM31920s7.avatars.get(0).cover().profileSmall().formatted();
                        }
                        if (TextUtils.isEmpty(pushMessage2.primaryPicture)) {
                            pushMessage2.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                        }
                    } else {
                        pushMessage2.stackId = m177355t(entry.getKey());
                        User userM169430Pa2 = this.f157145a.f19639e0.m169430Pa(messageM143220b.cid);
                        pushMessage2.title = userM169430Pa2 == null ? CoreModule.f17544b.getString(R$string.f55779p) : userM169430Pa2.name;
                        if (NullChecker.m81303a(userM169430Pa2)) {
                            m177372Q(pushMessage2, userM169430Pa2);
                        }
                    }
                    int iM143224f = entry.getValue().m143224f();
                    pushMessage2.value = iM143224f == 1 ? CoreModule.f17544b.getString(R$string.f55784u) : CoreModule.f17544b.getString(R$string.f55783t, Integer.valueOf(iM143224f));
                    boolean z3 = vwb.m200346r(entry.getValue().m143222d(), new w9j() { // from class: l.h07
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                        }
                    }) == null;
                    pushMessage2.silentAggregation = z3;
                    pushMessage2.silent = z3;
                    pushMessage2.createdTime = (long) messageM143220b.createdTime;
                    m177376x(pushMessage2);
                }
            }
            if (z2) {
                return;
            }
            this.f157145a.f19642f0.m32855Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
            return;
        }
        str = strM177378z;
        z = false;
        if (!NullChecker.m81303a(strM177378z)) {
            if (map.size() == 0) {
                while (r10.hasNext()) {
                    iIntValue2 = num.intValue();
                    if (f157142b.contains(num)) {
                        CoreModule.f17555m.m127649b(iIntValue2);
                    }
                }
                return;
            }
            if (vwb.m200346r(list, new w9j() { // from class: l.g07
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                }
            }) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (map.size() <= 3) {
                it = CoreModule.f17555m.m127660o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m177358w(iIntValue)) {
                        CoreModule.f17555m.m127649b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = PushMessageIntent.conversation_list;
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.f17544b.getString(R$string.f55779p);
                pushMessage.value = CoreModule.f17544b.getString(R$string.f55782s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.f17557o.m195057d().mo33676E()) {
                    userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                    if (NullChecker.m81303a(userM169430Pa)) {
                        m177372Q(pushMessage, userM169430Pa);
                    }
                } else {
                    userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                    if (NullChecker.m81303a(userM169430Pa)) {
                        m177372Q(pushMessage, userM169430Pa);
                    }
                }
                m177376x(pushMessage);
            } else {
                it = CoreModule.f17555m.m127660o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m177358w(iIntValue)) {
                        CoreModule.f17555m.m127649b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = PushMessageIntent.conversation_list;
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.f17544b.getString(R$string.f55779p);
                pushMessage.value = CoreModule.f17544b.getString(R$string.f55782s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.f17557o.m195057d().mo33676E()) {
                    userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                    if (NullChecker.m81303a(userM169430Pa)) {
                        m177372Q(pushMessage, userM169430Pa);
                    }
                } else {
                    userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                    if (NullChecker.m81303a(userM169430Pa)) {
                        m177372Q(pushMessage, userM169430Pa);
                    }
                }
                m177376x(pushMessage);
            }
            if (z2) {
                this.f157145a.f19642f0.m32855Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
                return;
            }
            return;
        }
        if (map.size() == 0) {
            while (r10.hasNext()) {
                iIntValue2 = num.intValue();
                if (f157142b.contains(num)) {
                    CoreModule.f17555m.m127649b(iIntValue2);
                }
            }
            return;
        }
        if (vwb.m200346r(list, new w9j() { // from class: l.g07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
            }
        }) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (map.size() <= 3) {
            it = CoreModule.f17555m.m127660o().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (m177358w(iIntValue)) {
                    CoreModule.f17555m.m127649b(iIntValue);
                }
            }
            pushMessage = new PushMessage();
            pushMessage.intent = PushMessageIntent.conversation_list;
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 2;
            pushMessage.title = CoreModule.f17544b.getString(R$string.f55779p);
            pushMessage.value = CoreModule.f17544b.getString(R$string.f55782s, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z2;
            pushMessage.silent = z2;
            message = list.get(0);
            pushMessage.createdTime = (long) message.createdTime;
            if (CoreModule.f17557o.m195057d().mo33676E()) {
                userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                if (NullChecker.m81303a(userM169430Pa)) {
                    m177372Q(pushMessage, userM169430Pa);
                }
            } else {
                userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                if (NullChecker.m81303a(userM169430Pa)) {
                    m177372Q(pushMessage, userM169430Pa);
                }
            }
            m177376x(pushMessage);
        } else {
            it = CoreModule.f17555m.m127660o().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (m177358w(iIntValue)) {
                    CoreModule.f17555m.m127649b(iIntValue);
                }
            }
            pushMessage = new PushMessage();
            pushMessage.intent = PushMessageIntent.conversation_list;
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 2;
            pushMessage.title = CoreModule.f17544b.getString(R$string.f55779p);
            pushMessage.value = CoreModule.f17544b.getString(R$string.f55782s, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z2;
            pushMessage.silent = z2;
            message = list.get(0);
            pushMessage.createdTime = (long) message.createdTime;
            if (CoreModule.f17557o.m195057d().mo33676E()) {
                userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                if (NullChecker.m81303a(userM169430Pa)) {
                    m177372Q(pushMessage, userM169430Pa);
                }
            } else {
                userM169430Pa = this.f157145a.f19639e0.m169430Pa(message.cid);
                if (NullChecker.m81303a(userM169430Pa)) {
                    m177372Q(pushMessage, userM169430Pa);
                }
            }
            m177376x(pushMessage);
        }
        if (z2) {
            this.f157145a.f19642f0.m32855Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
            return;
        }
        return;
        if (CoreModule.f17557o.m195057d().mo33676E()) {
            ju40Var = map.get(str);
            if (NullChecker.m81303a(ju40Var)) {
                this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
            } else {
                this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
            }
        } else {
            this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), user.f56011id);
        }
        mgh0.m154563s();
    }

    /* JADX INFO: renamed from: D */
    public final void m177361D(HashMap<String, ju40> map, List<Message> list, User user, int i, HashMap<String, String> map2) {
        String str;
        boolean z;
        String str2;
        String str3;
        Iterator<ju40> it = map.values().iterator();
        while (true) {
            str = "pending";
            if (!it.hasNext()) {
                break;
            }
            for (Message message : it.next().m143222d()) {
                if (TEnum.equals(message.localNotificationStatus, "pending")) {
                    CoreModule.f17545c.f19655j1.m30136m(message);
                }
            }
        }
        String strM177378z = m177378z();
        boolean z2 = false;
        if (CoreModule.f17557o.m195057d().mo33676E() && NullChecker.m81303a(strM177378z)) {
            str2 = map2.get(strM177378z);
            z = !TextUtils.isEmpty(str2) && map.containsKey(str2);
        } else {
            z = false;
            str2 = null;
        }
        if ((NullChecker.m81303a(strM177378z) && map.containsKey(strM177378z)) || z) {
            if (CoreModule.f17557o.m195057d().mo33676E()) {
                ju40 ju40Var = map.get(str2);
                if (NullChecker.m81303a(ju40Var) && ju40Var.m143223e()) {
                    this.f157145a.f19642f0.m32867Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
                    return;
                }
                this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
            } else {
                this.f157145a.f19642f0.m32843Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM177378z);
            }
            if (CoreModule.f17557o.m195057d().mo33670D() && i == 1 && TEnum.equals(map.get(strM177378z).m143220b(0).messageType, "tickle")) {
                return;
            }
            mgh0.m154563s();
            return;
        }
        if (map.size() == 0) {
            for (Integer num : CoreModule.f17555m.m127660o()) {
                int iIntValue = num.intValue();
                if (m177357v(iIntValue) || iIntValue == 0) {
                    if (!f157142b.contains(num)) {
                        CoreModule.f17555m.m127649b(iIntValue);
                    }
                }
            }
            return;
        }
        boolean z3 = vwb.m200346r(list, new w9j() { // from class: l.d07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
            }
        }) == null;
        int i2 = 4;
        if (map.size() > 3 || CoreModule.f17555m.m127659n(0)) {
            str3 = "pending";
            for (Integer num2 : CoreModule.f17555m.m127660o()) {
                int iIntValue2 = num2.intValue();
                if (m177357v(iIntValue2) && !f157142b.contains(num2)) {
                    if (TantanApp.f17180c.m214249N()) {
                        String strM177354s = m177354s(iIntValue2);
                        if ((!map2.containsKey(strM177354s)) & (!map.containsKey(strM177354s))) {
                            CoreModule.f17555m.m127649b(iIntValue2);
                        }
                    } else {
                        CoreModule.f17555m.m127649b(iIntValue2);
                    }
                }
            }
            boolean z4 = user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(list.get(0).f56011id);
            PushMessage pushMessage = new PushMessage();
            pushMessage.intent = PushMessageIntent.conversation_list;
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 0;
            pushMessage.ticker = m177375T(list.get(0), z4);
            pushMessage.title = CoreModule.f17544b.getString(R$string.f55779p);
            pushMessage.value = CoreModule.f17544b.getString(R$string.f55749A, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z3;
            pushMessage.silent = z3;
            Message message2 = list.get(0);
            pushMessage.createdTime = (long) message2.createdTime;
            m177333A(pushMessage);
            if (CoreModule.f17557o.m195057d().mo33676E() && message2.isGroupMessage()) {
                pushMessage.intent = PushMessageIntent.conversation_group;
                PushMessageContent pushMessageContent = pushMessage.content;
                pushMessageContent.type = "conversation";
                pushMessageContent.f38804id = message2.cid;
                ChatGroup chatGroupM31920s6 = this.f157145a.f19645g0.m31920s6(message2.getHostId());
                if (NullChecker.m81303a(chatGroupM31920s6) && !vwb.m200296J(chatGroupM31920s6.avatars)) {
                    pushMessage.primaryPicture = chatGroupM31920s6.avatars.get(0).cover().profileSmall().formatted();
                }
                if (TextUtils.isEmpty(pushMessage.primaryPicture)) {
                    pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                }
            } else {
                User userM169430Pa = this.f157145a.f19639e0.m169430Pa(message2.cid);
                if (NullChecker.m81303a(userM169430Pa)) {
                    m177372Q(pushMessage, userM169430Pa);
                }
                CoreModule.f17545c.f19655j1.m30132i(message2);
            }
            if (CoreModule.f17557o.m195057d().mo33864js()) {
                if (m177362E(PushMessageIntent.get(PushMessageIntent.message_single_update))) {
                    m177377y(pushMessage, null, z4);
                }
            } else if (!TantanApp.f17180c.m214249N()) {
                m177377y(pushMessage, null, z4);
            }
        } else {
            for (Integer num3 : CoreModule.f17555m.m127660o()) {
                int iIntValue3 = num3.intValue();
                if (m177357v(iIntValue3) && !f157142b.contains(num3)) {
                    String strM177354s2 = m177354s(iIntValue3);
                    if (!map.containsKey(strM177354s2) && !map2.containsKey(strM177354s2)) {
                        CoreModule.f17555m.m127649b(iIntValue3);
                    }
                }
            }
            CoreModule.f17555m.m127649b(0);
            Iterator<Map.Entry<String, ju40>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, ju40> next = it2.next();
                String key = next.getKey();
                ju40 value = next.getValue();
                boolean z5 = (user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(key)) ? true : z2;
                PushMessage pushMessage2 = new PushMessage();
                pushMessage2.intent = PushMessageIntent.conversation_single;
                PushMessageContent pushMessageContent2 = new PushMessageContent();
                pushMessage2.content = pushMessageContent2;
                pushMessageContent2.type = "conversation";
                Iterator<Map.Entry<String, ju40>> it3 = it2;
                pushMessageContent2.f38804id = next.getKey();
                pushMessage2.priority = i2;
                Message messageM143220b = next.getValue().m143220b(0);
                pushMessage2.ticker = m177375T(messageM143220b, z5);
                int iM143224f = next.getValue().m143224f();
                pushMessage2.counter = iM143224f;
                if (iM143224f == 1) {
                    pushMessage2.counter = 0;
                }
                if (CoreModule.f17557o.m195057d().mo33676E() && value.m143223e()) {
                    pushMessage2.intent = PushMessageIntent.conversation_group;
                    pushMessage2.stackId = m177353r(value.m143221c());
                    ChatGroup chatGroupM31920s7 = this.f157145a.f19645g0.m31920s6(value.m143221c());
                    pushMessage2.title = chatGroupM31920s7 == null ? CoreModule.f17544b.getString(R$string.f55779p) : chatGroupM31920s7.name;
                    if (NullChecker.m81303a(chatGroupM31920s7) && !vwb.m200296J(chatGroupM31920s7.avatars)) {
                        pushMessage2.primaryPicture = chatGroupM31920s7.avatars.get(0).cover().profileSmall().formatted();
                    }
                    if (TextUtils.isEmpty(pushMessage2.primaryPicture)) {
                        pushMessage2.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                    }
                } else {
                    pushMessage2.stackId = m177353r(next.getKey());
                    User userM169430Pa2 = this.f157145a.f19639e0.m169430Pa(messageM143220b.cid);
                    pushMessage2.title = userM169430Pa2 == null ? CoreModule.f17544b.getString(R$string.f55779p) : userM169430Pa2.name;
                    if (NullChecker.m81303a(userM169430Pa2)) {
                        m177372Q(pushMessage2, userM169430Pa2);
                    }
                }
                pushMessage2.value = (user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(key)) ? ddj0.m111023d(vwb.m200303Q(vwb.m200334k0(next.getValue().m143222d(), 10), new w9j() { // from class: l.e07
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f88549a.m177364G((Message) obj);
                    }
                }), SignParameters.NEW_LINE) : pushMessage2.ticker;
                boolean z6 = vwb.m200346r(next.getValue().m143222d(), new w9j() { // from class: l.f07
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                    }
                }) == null;
                pushMessage2.silentAggregation = z6;
                pushMessage2.silent = z6;
                String str4 = str;
                pushMessage2.createdTime = (long) messageM143220b.createdTime;
                CoreModule.f17545c.f19655j1.m30132i(messageM143220b);
                m177333A(pushMessage2);
                if (CoreModule.f17557o.m195057d().mo33864js()) {
                    if (m177362E(PushMessageIntent.get(PushMessageIntent.message_single_update))) {
                        m177377y(pushMessage2, null, z5);
                    }
                } else if (!TantanApp.f17180c.m214249N()) {
                    m177377y(pushMessage2, null, z5);
                }
                it2 = it3;
                str = str4;
                i2 = 4;
                z2 = false;
            }
            str3 = str;
        }
        if (z3) {
            return;
        }
        this.f157145a.f19642f0.m32855Wp(NotificationStatus.get(str3), NotificationStatus.get("ongoing"), false, true);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m177362E(PushMessageIntent pushMessageIntent) {
        SettingGroups settingGroups = CoreModule.f17545c.f19639e0.f149253R.get();
        if (TEnum.equals(pushMessageIntent, PushMessageIntent.message_single_update)) {
            return settingGroups.push.messagePush.booleanValue();
        }
        if (TEnum.equals(pushMessageIntent, PushMessageIntent.moment_match_post)) {
            return settingGroups.push.newMatchPush.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m177363F() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ != null && c4299rForeground_.f15344b.f15555a) {
            if (CoreModule.f17557o.m195057d().mo33694H6(c4299rForeground_.f15343a.get())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C22306c m177365H(q860 q860Var) {
        return this.f157145a.f19642f0.m32819Tp();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m177366I(List list) {
        if (list.isEmpty()) {
            CoreModule.f17555m.m127649b(1);
            return;
        }
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = PushMessageIntent.conversation_list;
        pushMessage.content = new PushMessageContent();
        pushMessage.priority = 4;
        pushMessage.stackId = 1;
        pushMessage.ticker = CoreModule.f17544b.getString(list.size() > 1 ? R$string.f55787x : R$string.f55788y, Integer.valueOf(list.size()));
        pushMessage.title = CoreModule.f17544b.getString(R$string.f55789z);
        pushMessage.value = CoreModule.f17544b.getString(list.size() == 1 ? R$string.f55786w : R$string.f55785v, Integer.valueOf(list.size()));
        pushMessage.silentAggregation = true;
        pushMessage.silent = TEnum.equals(((Conversation) list.get(0)).localNotificationStatus, "ongoing");
        User userM169430Pa = this.f157145a.f19639e0.m169430Pa(((Conversation) list.get(0)).f56011id);
        if (NullChecker.m81303a(userM169430Pa)) {
            m177372Q(pushMessage, userM169430Pa);
        } else {
            CrashHelper.m81296c(new Exception("User database lost user otherId: " + ((Conversation) list.get(0)).f56011id));
        }
        if (list.size() > 10 || vwb.m200337m(list, new w9j() { // from class: l.c07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Conversation) obj).localNotificationStatus, "pending"));
            }
        })) {
            this.f157145a.f19642f0.m32855Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), true, false);
        }
        pushMessage.createdTime = (long) ((Conversation) list.get(0)).createdTime;
        if (CoreModule.f17557o.m195057d().mo33771Vq(((Conversation) list.get(0)).f56011id)) {
            pushMessage.value = CoreModule.f17544b.getString(R$string.f55781r);
        }
        m177333A(pushMessage);
        if (CoreModule.f17545c.f19704z2.m30252o3(((Conversation) list.get(0)).f56011id)) {
            return;
        }
        if (CoreModule.f17557o.m195057d().mo33864js()) {
            if (m177362E(PushMessageIntent.get(PushMessageIntent.moment_match_post))) {
                m177376x(pushMessage);
            }
        } else {
            if (TantanApp.f17180c.m214249N()) {
                return;
            }
            m177376x(pushMessage);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C22306c m177367J(q860 q860Var) {
        return this.f157145a.f19642f0.m32770Pn();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ xaj0 m177368K(List list) {
        String strUserId = CoreModule.m29931H().userId();
        return new xaj0(this.f157145a.f19642f0.m32831Up(), Integer.valueOf(this.f157145a.f19642f0.m32794Rn(strUserId)), Integer.valueOf(this.f157145a.f19642f0.m32782Qn(strUserId)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m177369L(j760 j760Var) {
        List list = (List) ((xaj0) j760Var.f116564a).f191751a;
        User user = (User) j760Var.f116565b;
        ArrayList<Message> arrayList = new ArrayList(vwb.m200334k0(list, CoreModule.f17557o.m195057d().mo33676E() ? 200 : 1000));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap<String, ju40> map = new HashMap<>();
        HashMap<String, ju40> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        for (Message message : arrayList) {
            if (!TextUtils.isEmpty(message.cid)) {
                if (CoreModule.f17557o.m195057d().mo33828g()) {
                    if (!TEnum.equals(message.messageType, "voice_call") || !NullChecker.m81303a(message.additionalData) || !TextUtils.equals("rejected", message.additionalData.status)) {
                        if (TEnum.equals(message.messageType, "voice_call_invitation")) {
                        }
                    }
                }
                boolean zIsMe = message.isMe();
                String str = message.cid;
                if (zIsMe) {
                    if (map2.get(str) == null) {
                        String str2 = message.cid;
                        map2.put(str2, new ju40(str2, message.getHostId(), message.isGroupMessage()));
                    }
                } else if (map.get(str) == null) {
                    String str3 = message.cid;
                    map.put(str3, new ju40(str3, message.getHostId(), message.isGroupMessage()));
                }
                map3.put(message.getHostId(), message.cid);
                boolean zIsMe2 = message.isMe();
                String str4 = message.cid;
                if (zIsMe2) {
                    map2.get(str4).m143219a(message);
                    arrayList3.add(message);
                } else {
                    map.get(str4).m143219a(message);
                    arrayList2.add(message);
                }
            }
        }
        m177361D(map, arrayList2, user, ((Integer) ((xaj0) j760Var.f116564a).f191752b).intValue(), map3);
        m177360C(map2, arrayList3, user, ((Integer) ((xaj0) j760Var.f116564a).f191753c).intValue(), map3);
    }

    /* JADX INFO: renamed from: M */
    public void m177370M(int i) {
        m177371N(i, false);
    }

    /* JADX INFO: renamed from: N */
    public void m177371N(int i, boolean z) {
        if (i == 1) {
            this.f157145a.f19642f0.m32855Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), true, false);
            return;
        }
        if (i == 0 || i == 2) {
            this.f157145a.f19642f0.m32855Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), false, true);
            return;
        }
        if (m177357v(i)) {
            C4732c c4732c = this.f157145a;
            if (z) {
                c4732c.f19642f0.m32867Xp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m177354s(i));
            } else {
                c4732c.f19642f0.m32843Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m177354s(i));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m177372Q(PushMessage pushMessage, User user) {
        pushMessage.primaryPicture = CoreModule.f17557o.m195057d().mo33674Di(user).profileSmall().formatted();
        if (NullChecker.m81303a(user)) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
            if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isAnonymous()) {
                pushMessage.primaryPicture = user.getAnonymousUrl();
            }
        }
        if (CoreModule.f17557o.m195057d().mo33808c() && user.onlineMatchLocked()) {
            pushMessage.user = user;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m177373R(float f) {
        PushMessage pushMessage = new PushMessage();
        String string = CoreModule.f17544b.getString(R$string.f55767d, String.format("%.1f", Float.valueOf(f)));
        pushMessage.title = CoreModule.f17544b.getString(R$string.f55768e);
        pushMessage.value = string;
        pushMessage.ticker = string;
        pushMessage.content = new PushMessageContent();
        pushMessage.priority = 4;
        pushMessage.stackId = 3;
        m177376x(pushMessage);
    }

    /* JADX INFO: renamed from: S */
    public bs5 m177374S() {
        return h4g0.m129242c(this.f157145a.f19642f0.m33073on().first(new w9j() { // from class: l.a07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((q860) obj).m173343c());
            }
        }).flatMap(new w9j() { // from class: l.j07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f115640a.m177365H((q860) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.k07
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120455a.m177366I((List) obj);
            }
        }, new e30() { // from class: l.l07
            @Override // p149l.e30
            public final void call(Object obj) {
                r07.m177350o((Throwable) obj);
            }
        })), this.f157145a.f19642f0.m33073on().first(new w9j() { // from class: l.m07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((q860) obj).m173343c());
            }
        }).flatMap(new w9j() { // from class: l.n07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136474a.m177367J((q860) obj);
            }
        }).onBackpressureLatest().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.o07
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141295a.m177368K((List) obj);
            }
        }).observeOn(jo0.m142408a()).withLatestFrom(this.f157145a.f19639e0.m169523o9(), new x9j() { // from class: l.p07
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((xaj0) obj, (User) obj2);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.q07
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152016a.m177369L((j760) obj);
            }
        }, new e30() { // from class: l.b07
            @Override // p149l.e30
            public final void call(Object obj) {
                r07.m177344i((Throwable) obj);
            }
        })), h4g0.m129240a(new d30() { // from class: l.i07
            @Override // p149l.d30
            public final void call() {
                r07.m177341f();
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public String m177375T(Message message, boolean z) {
        String string;
        MessageCallToBuy messageCallToBuy;
        Resources resources = CoreModule.f17544b.getResources();
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.cid);
        String str = userM169430Pa == null ? "" : userM169430Pa.name;
        boolean zIsTeamAccount = userM169430Pa == null ? false : userM169430Pa.isTeamAccount();
        if (z) {
            string = str + ": " + message.value;
        } else {
            string = resources.getString(R$string.f55754F, str);
        }
        if (NullChecker.m81303a(message.video())) {
            return resources.getString(R$string.f55757I, str);
        }
        if (NullChecker.m81303a(message.audio())) {
            return resources.getString(R$string.f55750B, str);
        }
        if (NullChecker.m81303a(message.picture())) {
            return resources.getString(R$string.f55752D, str);
        }
        if (NullChecker.m81303a(message.location)) {
            return resources.getString(R$string.f55753E, str);
        }
        if (NullChecker.m81303a(message.question) && !zIsTeamAccount) {
            return resources.getString(R$string.f55755G, str);
        }
        if (NullChecker.m81303a(message.sticker)) {
            return resources.getString(R$string.f55756H, str);
        }
        if (NullChecker.m81303a(message.moment)) {
            return resources.getString(R$string.f55751C, str);
        }
        if (TEnum.equals(message.messageType, "call_2_buy")) {
            try {
                messageCallToBuy = MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                messageCallToBuy = null;
            }
            return NullChecker.m81303a(messageCallToBuy) ? messageCallToBuy.previewText : string;
        }
        if (!TEnum.equals(message.messageType, MessageType.hide_for_fake_user)) {
            return string;
        }
        return str + ": 对方发来一条消息";
    }

    /* JADX INFO: renamed from: x */
    public final void m177376x(PushMessage pushMessage) {
        if (pushMessage.messageCustom == null) {
            pushMessage.messageCustom = PushMessageCustom.new_();
        }
        pushMessage.messageCustom.pushChannel = "tantan_default";
        CoreModule.f17555m.m127654i(pushMessage);
    }

    /* JADX INFO: renamed from: y */
    public final void m177377y(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        if (pushMessage.messageCustom == null) {
            pushMessage.messageCustom = PushMessageCustom.new_();
        }
        pushMessage.messageCustom.pushChannel = "tantan_default";
        CoreModule.f17555m.m127656k(pushMessage, pushTrackData, z);
    }

    /* JADX INFO: renamed from: z */
    public String m177378z() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ == null || !c4299rForeground_.f15344b.f15555a) {
            return null;
        }
        return CoreModule.f17557o.m195057d().mo33795ac(c4299rForeground_.f15343a.get());
    }
}
