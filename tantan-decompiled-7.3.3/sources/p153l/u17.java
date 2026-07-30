package p153l;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.data.MessageCallToBuy;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class u17 {

    /* JADX INFO: renamed from: b */
    public static final HashSet<Integer> f176974b = new HashSet<>();

    /* JADX INFO: renamed from: c */
    public static boolean f176975c = false;

    /* JADX INFO: renamed from: d */
    public static C22507a<Boolean> f176976d = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public C4883c f176977a;

    public u17(C4883c c4883c) {
        this.f176977a = c4883c;
    }

    /* JADX INFO: renamed from: A */
    public static void m193902A(PushMessage pushMessage) {
        if (f176975c || pushMessage.silent || App.m21425e() >= 10000) {
            return;
        }
        if (((uqb0.f180376H.guessedCurrentServerTime() - pushMessage.createdTime <= 600000.0d || "vivo X20A".equals(Build.MODEL)) && (uqb0.f180376H.guessedCurrentServerTime() - pushMessage.createdTime <= 1200000.0d || !"vivo X20A".equals(Build.MODEL))) || SystemClock.elapsedRealtime() <= 1200000 || App.f16092i.get().intValue() <= 1) {
            return;
        }
        f176975c = true;
        f176976d.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: O */
    public static void m193903O(int i) {
        f176974b.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: P */
    public static void m193904P(int i) {
        f176974b.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m193910f() {
        Iterator<Integer> it = CoreModule.f18274m.m207541o().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (m193927w(iIntValue) || m193926v(iIntValue) || 1 == iIntValue || iIntValue == 0) {
                CoreModule.f18274m.m207530b(iIntValue);
            }
        }
        CoreModule.f18274m.m207531c();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m193913i(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m193919o(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static final int m193922r(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str) + 10000;
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final String m193923s(int i) {
        return (i + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL) + "";
    }

    /* JADX INFO: renamed from: t */
    public static final int m193924t(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return (!CoreModule.f18276o.m132214d().mo34679E() || Long.parseLong(str) <= 2147473647) ? -(Integer.parseInt(str) + 10000) : str.hashCode();
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final String m193925u(int i) {
        return (-(i + 10000)) + "";
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m193926v(int i) {
        return i > 7000;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m193927w(int i) {
        return i < -7000;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final CharSequence m193933G(Message message) {
        if (TEnum.equals(message.messageType, "tickle") && !message.isMe()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.owner);
            if (NullChecker.m82486a(userM116503Pa)) {
                return CoreModule.f18263b.getString(R$string.f56620i, userM116503Pa.name);
            }
        }
        return CoreModule.f18276o.m132214d().mo34657Ac(message);
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
    public final void m193929C(HashMap<String, y250> map, List<Message> list, User user, int i, HashMap<String, String> map2) {
        String str;
        boolean z;
        boolean z2;
        Iterator<Integer> it;
        PushMessage pushMessage;
        Message message;
        User userM116503Pa;
        int iIntValue;
        int iIntValue2;
        y250 y250Var;
        String strM193947z = m193947z();
        if (CoreModule.f18276o.m132214d().mo34679E() && NullChecker.m82486a(strM193947z)) {
            str = map2.get(strM193947z);
            if (!TextUtils.isEmpty(str) && map.containsKey(str)) {
                z = true;
            }
            if ((!NullChecker.m82486a(strM193947z) && map.containsKey(strM193947z)) || z) {
                if (CoreModule.f18276o.m132214d().mo34679E()) {
                    y250Var = map.get(str);
                    if (NullChecker.m82486a(y250Var) || !y250Var.m214042e()) {
                        this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
                    } else {
                        this.f176977a.f20384f0.m33870Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
                    }
                } else {
                    this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), user.f56859id);
                }
                toh0.m192059s();
            }
            if (map.size() == 0) {
                for (Integer num : CoreModule.f18274m.m207541o()) {
                    iIntValue2 = num.intValue();
                    if (f176974b.contains(num) && (m193927w(iIntValue2) || iIntValue2 == 2)) {
                        CoreModule.f18274m.m207530b(iIntValue2);
                    }
                }
                return;
            }
            if (jyb.m147529r(list, new qcj() { // from class: l.j17
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                }
            }) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (map.size() <= 3 || CoreModule.f18274m.m207540n(0)) {
                it = CoreModule.f18274m.m207541o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m193927w(iIntValue)) {
                        CoreModule.f18274m.m207530b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = PushMessageIntent.conversation_list;
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.f18263b.getString(R$string.f56627p);
                pushMessage.value = CoreModule.f18263b.getString(R$string.f56630s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.f18276o.m132214d().mo34679E() || !message.isGroupMessage()) {
                    userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                    if (NullChecker.m82486a(userM116503Pa)) {
                        m193941Q(pushMessage, userM116503Pa);
                    }
                } else {
                    pushMessage.intent = PushMessageIntent.conversation_group;
                    PushMessageContent pushMessageContent = pushMessage.content;
                    pushMessageContent.type = "conversation";
                    pushMessageContent.f39652id = message.cid;
                    ChatGroup chatGroupM32923s6 = this.f176977a.f20387g0.m32923s6(message.getHostId());
                    if (NullChecker.m82486a(chatGroupM32923s6) && !jyb.m147479J(chatGroupM32923s6.avatars)) {
                        pushMessage.primaryPicture = chatGroupM32923s6.avatars.get(0).cover().profileSmall().formatted();
                    }
                    if (TextUtils.isEmpty(pushMessage.primaryPicture)) {
                        pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                    }
                }
                m193945x(pushMessage);
            } else {
                Iterator<Integer> it2 = CoreModule.f18274m.m207541o().iterator();
                while (it2.hasNext()) {
                    int iIntValue3 = it2.next().intValue();
                    if (m193927w(iIntValue3) && !map.containsKey(m193925u(iIntValue3))) {
                        CoreModule.f18274m.m207530b(iIntValue3);
                    }
                }
                CoreModule.f18274m.m207530b(2);
                for (Map.Entry<String, y250> entry : map.entrySet()) {
                    y250 value = entry.getValue();
                    PushMessage pushMessage2 = new PushMessage();
                    pushMessage2.intent = PushMessageIntent.conversation_single;
                    PushMessageContent pushMessageContent2 = new PushMessageContent();
                    pushMessage2.content = pushMessageContent2;
                    pushMessageContent2.type = "conversation";
                    pushMessageContent2.f39652id = entry.getKey();
                    pushMessage2.priority = 4;
                    Message messageM214039b = entry.getValue().m214039b(0);
                    if (CoreModule.f18276o.m132214d().mo34679E() && value.m214042e()) {
                        pushMessage2.intent = PushMessageIntent.conversation_group;
                        pushMessage2.stackId = m193924t(value.m214040c());
                        ChatGroup chatGroupM32923s7 = this.f176977a.f20387g0.m32923s6(value.m214040c());
                        pushMessage2.title = chatGroupM32923s7 == null ? CoreModule.f18263b.getString(R$string.f56627p) : chatGroupM32923s7.name;
                        if (NullChecker.m82486a(chatGroupM32923s7) && !jyb.m147479J(chatGroupM32923s7.avatars)) {
                            pushMessage2.primaryPicture = chatGroupM32923s7.avatars.get(0).cover().profileSmall().formatted();
                        }
                        if (TextUtils.isEmpty(pushMessage2.primaryPicture)) {
                            pushMessage2.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                        }
                    } else {
                        pushMessage2.stackId = m193924t(entry.getKey());
                        User userM116503Pa2 = this.f176977a.f20381e0.m116503Pa(messageM214039b.cid);
                        pushMessage2.title = userM116503Pa2 == null ? CoreModule.f18263b.getString(R$string.f56627p) : userM116503Pa2.name;
                        if (NullChecker.m82486a(userM116503Pa2)) {
                            m193941Q(pushMessage2, userM116503Pa2);
                        }
                    }
                    int iM214043f = entry.getValue().m214043f();
                    pushMessage2.value = iM214043f == 1 ? CoreModule.f18263b.getString(R$string.f56632u) : CoreModule.f18263b.getString(R$string.f56631t, Integer.valueOf(iM214043f));
                    boolean z3 = jyb.m147529r(entry.getValue().m214041d(), new qcj() { // from class: l.k17
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                        }
                    }) == null;
                    pushMessage2.silentAggregation = z3;
                    pushMessage2.silent = z3;
                    pushMessage2.createdTime = (long) messageM214039b.createdTime;
                    m193945x(pushMessage2);
                }
            }
            if (z2) {
                return;
            }
            this.f176977a.f20384f0.m33858Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
            return;
        }
        str = strM193947z;
        z = false;
        if (!NullChecker.m82486a(strM193947z)) {
            if (map.size() == 0) {
                while (r10.hasNext()) {
                    iIntValue2 = num.intValue();
                    if (f176974b.contains(num)) {
                        CoreModule.f18274m.m207530b(iIntValue2);
                    }
                }
                return;
            }
            if (jyb.m147529r(list, new qcj() { // from class: l.j17
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                }
            }) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (map.size() <= 3) {
                it = CoreModule.f18274m.m207541o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m193927w(iIntValue)) {
                        CoreModule.f18274m.m207530b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = PushMessageIntent.conversation_list;
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.f18263b.getString(R$string.f56627p);
                pushMessage.value = CoreModule.f18263b.getString(R$string.f56630s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.f18276o.m132214d().mo34679E()) {
                    userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                    if (NullChecker.m82486a(userM116503Pa)) {
                        m193941Q(pushMessage, userM116503Pa);
                    }
                } else {
                    userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                    if (NullChecker.m82486a(userM116503Pa)) {
                        m193941Q(pushMessage, userM116503Pa);
                    }
                }
                m193945x(pushMessage);
            } else {
                it = CoreModule.f18274m.m207541o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m193927w(iIntValue)) {
                        CoreModule.f18274m.m207530b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = PushMessageIntent.conversation_list;
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.f18263b.getString(R$string.f56627p);
                pushMessage.value = CoreModule.f18263b.getString(R$string.f56630s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.f18276o.m132214d().mo34679E()) {
                    userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                    if (NullChecker.m82486a(userM116503Pa)) {
                        m193941Q(pushMessage, userM116503Pa);
                    }
                } else {
                    userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                    if (NullChecker.m82486a(userM116503Pa)) {
                        m193941Q(pushMessage, userM116503Pa);
                    }
                }
                m193945x(pushMessage);
            }
            if (z2) {
                this.f176977a.f20384f0.m33858Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
                return;
            }
            return;
        }
        if (map.size() == 0) {
            while (r10.hasNext()) {
                iIntValue2 = num.intValue();
                if (f176974b.contains(num)) {
                    CoreModule.f18274m.m207530b(iIntValue2);
                }
            }
            return;
        }
        if (jyb.m147529r(list, new qcj() { // from class: l.j17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
            }
        }) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (map.size() <= 3) {
            it = CoreModule.f18274m.m207541o().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (m193927w(iIntValue)) {
                    CoreModule.f18274m.m207530b(iIntValue);
                }
            }
            pushMessage = new PushMessage();
            pushMessage.intent = PushMessageIntent.conversation_list;
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 2;
            pushMessage.title = CoreModule.f18263b.getString(R$string.f56627p);
            pushMessage.value = CoreModule.f18263b.getString(R$string.f56630s, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z2;
            pushMessage.silent = z2;
            message = list.get(0);
            pushMessage.createdTime = (long) message.createdTime;
            if (CoreModule.f18276o.m132214d().mo34679E()) {
                userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                if (NullChecker.m82486a(userM116503Pa)) {
                    m193941Q(pushMessage, userM116503Pa);
                }
            } else {
                userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                if (NullChecker.m82486a(userM116503Pa)) {
                    m193941Q(pushMessage, userM116503Pa);
                }
            }
            m193945x(pushMessage);
        } else {
            it = CoreModule.f18274m.m207541o().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (m193927w(iIntValue)) {
                    CoreModule.f18274m.m207530b(iIntValue);
                }
            }
            pushMessage = new PushMessage();
            pushMessage.intent = PushMessageIntent.conversation_list;
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 2;
            pushMessage.title = CoreModule.f18263b.getString(R$string.f56627p);
            pushMessage.value = CoreModule.f18263b.getString(R$string.f56630s, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z2;
            pushMessage.silent = z2;
            message = list.get(0);
            pushMessage.createdTime = (long) message.createdTime;
            if (CoreModule.f18276o.m132214d().mo34679E()) {
                userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                if (NullChecker.m82486a(userM116503Pa)) {
                    m193941Q(pushMessage, userM116503Pa);
                }
            } else {
                userM116503Pa = this.f176977a.f20381e0.m116503Pa(message.cid);
                if (NullChecker.m82486a(userM116503Pa)) {
                    m193941Q(pushMessage, userM116503Pa);
                }
            }
            m193945x(pushMessage);
        }
        if (z2) {
            this.f176977a.f20384f0.m33858Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
            return;
        }
        return;
        if (CoreModule.f18276o.m132214d().mo34679E()) {
            y250Var = map.get(str);
            if (NullChecker.m82486a(y250Var)) {
                this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
            } else {
                this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
            }
        } else {
            this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), user.f56859id);
        }
        toh0.m192059s();
    }

    /* JADX INFO: renamed from: D */
    public final void m193930D(HashMap<String, y250> map, List<Message> list, User user, int i, HashMap<String, String> map2) {
        String str;
        boolean z;
        String str2;
        String str3;
        Iterator<y250> it = map.values().iterator();
        while (true) {
            str = "pending";
            if (!it.hasNext()) {
                break;
            }
            for (Message message : it.next().m214041d()) {
                if (TEnum.equals(message.localNotificationStatus, "pending")) {
                    CoreModule.f18264c.f20397j1.m31134m(message);
                }
            }
        }
        String strM193947z = m193947z();
        boolean z2 = false;
        if (CoreModule.f18276o.m132214d().mo34679E() && NullChecker.m82486a(strM193947z)) {
            str2 = map2.get(strM193947z);
            z = !TextUtils.isEmpty(str2) && map.containsKey(str2);
        } else {
            z = false;
            str2 = null;
        }
        if ((NullChecker.m82486a(strM193947z) && map.containsKey(strM193947z)) || z) {
            if (CoreModule.f18276o.m132214d().mo34679E()) {
                y250 y250Var = map.get(str2);
                if (NullChecker.m82486a(y250Var) && y250Var.m214042e()) {
                    this.f176977a.f20384f0.m33870Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
                    return;
                }
                this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
            } else {
                this.f176977a.f20384f0.m33846Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM193947z);
            }
            if (CoreModule.f18276o.m132214d().mo34673D() && i == 1 && TEnum.equals(map.get(strM193947z).m214039b(0).messageType, "tickle")) {
                return;
            }
            toh0.m192059s();
            return;
        }
        if (map.size() == 0) {
            for (Integer num : CoreModule.f18274m.m207541o()) {
                int iIntValue = num.intValue();
                if (m193926v(iIntValue) || iIntValue == 0) {
                    if (!f176974b.contains(num)) {
                        CoreModule.f18274m.m207530b(iIntValue);
                    }
                }
            }
            return;
        }
        boolean z3 = jyb.m147529r(list, new qcj() { // from class: l.g17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
            }
        }) == null;
        int i2 = 4;
        if (map.size() > 3 || CoreModule.f18274m.m207540n(0)) {
            str3 = "pending";
            for (Integer num2 : CoreModule.f18274m.m207541o()) {
                int iIntValue2 = num2.intValue();
                if (m193926v(iIntValue2) && !f176974b.contains(num2)) {
                    if (TantanApp.f17899c.m111127N()) {
                        String strM193923s = m193923s(iIntValue2);
                        if ((!map2.containsKey(strM193923s)) & (!map.containsKey(strM193923s))) {
                            CoreModule.f18274m.m207530b(iIntValue2);
                        }
                    } else {
                        CoreModule.f18274m.m207530b(iIntValue2);
                    }
                }
            }
            boolean z4 = user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(list.get(0).f56859id);
            PushMessage pushMessage = new PushMessage();
            pushMessage.intent = PushMessageIntent.conversation_list;
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 0;
            pushMessage.ticker = m193944T(list.get(0), z4);
            pushMessage.title = CoreModule.f18263b.getString(R$string.f56627p);
            pushMessage.value = CoreModule.f18263b.getString(R$string.f56597A, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z3;
            pushMessage.silent = z3;
            Message message2 = list.get(0);
            pushMessage.createdTime = (long) message2.createdTime;
            m193902A(pushMessage);
            if (CoreModule.f18276o.m132214d().mo34679E() && message2.isGroupMessage()) {
                pushMessage.intent = PushMessageIntent.conversation_group;
                PushMessageContent pushMessageContent = pushMessage.content;
                pushMessageContent.type = "conversation";
                pushMessageContent.f39652id = message2.cid;
                ChatGroup chatGroupM32923s6 = this.f176977a.f20387g0.m32923s6(message2.getHostId());
                if (NullChecker.m82486a(chatGroupM32923s6) && !jyb.m147479J(chatGroupM32923s6.avatars)) {
                    pushMessage.primaryPicture = chatGroupM32923s6.avatars.get(0).cover().profileSmall().formatted();
                }
                if (TextUtils.isEmpty(pushMessage.primaryPicture)) {
                    pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                }
            } else {
                User userM116503Pa = this.f176977a.f20381e0.m116503Pa(message2.cid);
                if (NullChecker.m82486a(userM116503Pa)) {
                    m193941Q(pushMessage, userM116503Pa);
                }
                CoreModule.f18264c.f20397j1.m31130i(message2);
            }
            if (CoreModule.f18276o.m132214d().mo34867js()) {
                if (m193931E(PushMessageIntent.get(PushMessageIntent.message_single_update))) {
                    m193946y(pushMessage, null, z4);
                }
            } else if (!TantanApp.f17899c.m111127N()) {
                m193946y(pushMessage, null, z4);
            }
        } else {
            for (Integer num3 : CoreModule.f18274m.m207541o()) {
                int iIntValue3 = num3.intValue();
                if (m193926v(iIntValue3) && !f176974b.contains(num3)) {
                    String strM193923s2 = m193923s(iIntValue3);
                    if (!map.containsKey(strM193923s2) && !map2.containsKey(strM193923s2)) {
                        CoreModule.f18274m.m207530b(iIntValue3);
                    }
                }
            }
            CoreModule.f18274m.m207530b(0);
            Iterator<Map.Entry<String, y250>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, y250> next = it2.next();
                String key = next.getKey();
                y250 value = next.getValue();
                boolean z5 = (user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(key)) ? true : z2;
                PushMessage pushMessage2 = new PushMessage();
                pushMessage2.intent = PushMessageIntent.conversation_single;
                PushMessageContent pushMessageContent2 = new PushMessageContent();
                pushMessage2.content = pushMessageContent2;
                pushMessageContent2.type = "conversation";
                Iterator<Map.Entry<String, y250>> it3 = it2;
                pushMessageContent2.f39652id = next.getKey();
                pushMessage2.priority = i2;
                Message messageM214039b = next.getValue().m214039b(0);
                pushMessage2.ticker = m193944T(messageM214039b, z5);
                int iM214043f = next.getValue().m214043f();
                pushMessage2.counter = iM214043f;
                if (iM214043f == 1) {
                    pushMessage2.counter = 0;
                }
                if (CoreModule.f18276o.m132214d().mo34679E() && value.m214042e()) {
                    pushMessage2.intent = PushMessageIntent.conversation_group;
                    pushMessage2.stackId = m193922r(value.m214040c());
                    ChatGroup chatGroupM32923s7 = this.f176977a.f20387g0.m32923s6(value.m214040c());
                    pushMessage2.title = chatGroupM32923s7 == null ? CoreModule.f18263b.getString(R$string.f56627p) : chatGroupM32923s7.name;
                    if (NullChecker.m82486a(chatGroupM32923s7) && !jyb.m147479J(chatGroupM32923s7.avatars)) {
                        pushMessage2.primaryPicture = chatGroupM32923s7.avatars.get(0).cover().profileSmall().formatted();
                    }
                    if (TextUtils.isEmpty(pushMessage2.primaryPicture)) {
                        pushMessage2.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                    }
                } else {
                    pushMessage2.stackId = m193922r(next.getKey());
                    User userM116503Pa2 = this.f176977a.f20381e0.m116503Pa(messageM214039b.cid);
                    pushMessage2.title = userM116503Pa2 == null ? CoreModule.f18263b.getString(R$string.f56627p) : userM116503Pa2.name;
                    if (NullChecker.m82486a(userM116503Pa2)) {
                        m193941Q(pushMessage2, userM116503Pa2);
                    }
                }
                pushMessage2.value = (user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(key)) ? hmj0.m135868d(jyb.m147486Q(jyb.m147517k0(next.getValue().m214041d(), 10), new qcj() { // from class: l.h17
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f107411a.m193933G((Message) obj);
                    }
                }), SignParameters.NEW_LINE) : pushMessage2.ticker;
                boolean z6 = jyb.m147529r(next.getValue().m214041d(), new qcj() { // from class: l.i17
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                    }
                }) == null;
                pushMessage2.silentAggregation = z6;
                pushMessage2.silent = z6;
                String str4 = str;
                pushMessage2.createdTime = (long) messageM214039b.createdTime;
                CoreModule.f18264c.f20397j1.m31130i(messageM214039b);
                m193902A(pushMessage2);
                if (CoreModule.f18276o.m132214d().mo34867js()) {
                    if (m193931E(PushMessageIntent.get(PushMessageIntent.message_single_update))) {
                        m193946y(pushMessage2, null, z5);
                    }
                } else if (!TantanApp.f17899c.m111127N()) {
                    m193946y(pushMessage2, null, z5);
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
        this.f176977a.f20384f0.m33858Wp(NotificationStatus.get(str3), NotificationStatus.get("ongoing"), false, true);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m193931E(PushMessageIntent pushMessageIntent) {
        SettingGroups settingGroups = CoreModule.f18264c.f20381e0.f89110R.get();
        if (TEnum.equals(pushMessageIntent, PushMessageIntent.message_single_update)) {
            return settingGroups.push.messagePush.booleanValue();
        }
        if (TEnum.equals(pushMessageIntent, PushMessageIntent.moment_match_post)) {
            return settingGroups.push.newMatchPush.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m193932F() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ != null && c4450rForeground_.f16063b.f16274a) {
            if (CoreModule.f18276o.m132214d().mo34697H6(c4450rForeground_.f16062a.get())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C22421c m193934H(vg60 vg60Var) {
        return this.f176977a.f20384f0.m33822Tp();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m193935I(List list) {
        if (list.isEmpty()) {
            CoreModule.f18274m.m207530b(1);
            return;
        }
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = PushMessageIntent.conversation_list;
        pushMessage.content = new PushMessageContent();
        pushMessage.priority = 4;
        pushMessage.stackId = 1;
        pushMessage.ticker = CoreModule.f18263b.getString(list.size() > 1 ? R$string.f56635x : R$string.f56636y, Integer.valueOf(list.size()));
        pushMessage.title = CoreModule.f18263b.getString(R$string.f56637z);
        pushMessage.value = CoreModule.f18263b.getString(list.size() == 1 ? R$string.f56634w : R$string.f56633v, Integer.valueOf(list.size()));
        pushMessage.silentAggregation = true;
        pushMessage.silent = TEnum.equals(((Conversation) list.get(0)).localNotificationStatus, "ongoing");
        User userM116503Pa = this.f176977a.f20381e0.m116503Pa(((Conversation) list.get(0)).f56859id);
        if (NullChecker.m82486a(userM116503Pa)) {
            m193941Q(pushMessage, userM116503Pa);
        } else {
            CrashHelper.m82479c(new Exception("User database lost user otherId: " + ((Conversation) list.get(0)).f56859id));
        }
        if (list.size() > 10 || jyb.m147520m(list, new qcj() { // from class: l.f17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Conversation) obj).localNotificationStatus, "pending"));
            }
        })) {
            this.f176977a.f20384f0.m33858Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), true, false);
        }
        pushMessage.createdTime = (long) ((Conversation) list.get(0)).createdTime;
        if (CoreModule.f18276o.m132214d().mo34774Vq(((Conversation) list.get(0)).f56859id)) {
            pushMessage.value = CoreModule.f18263b.getString(R$string.f56629r);
        }
        m193902A(pushMessage);
        if (CoreModule.f18264c.f20446z2.m31250o3(((Conversation) list.get(0)).f56859id)) {
            return;
        }
        if (CoreModule.f18276o.m132214d().mo34867js()) {
            if (m193931E(PushMessageIntent.get(PushMessageIntent.moment_match_post))) {
                m193945x(pushMessage);
            }
        } else {
            if (TantanApp.f17899c.m111127N()) {
                return;
            }
            m193945x(pushMessage);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C22421c m193936J(vg60 vg60Var) {
        return this.f176977a.f20384f0.m33773Pn();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ bkj0 m193937K(List list) {
        String strUserId = CoreModule.m30929H().userId();
        return new bkj0(this.f176977a.f20384f0.m33834Up(), Integer.valueOf(this.f176977a.f20384f0.m33797Rn(strUserId)), Integer.valueOf(this.f176977a.f20384f0.m33785Qn(strUserId)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m193938L(pf60 pf60Var) {
        List list = (List) ((bkj0) pf60Var.f152156a).f77081a;
        User user = (User) pf60Var.f152157b;
        ArrayList<Message> arrayList = new ArrayList(jyb.m147517k0(list, CoreModule.f18276o.m132214d().mo34679E() ? 200 : 1000));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap<String, y250> map = new HashMap<>();
        HashMap<String, y250> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        for (Message message : arrayList) {
            if (!TextUtils.isEmpty(message.cid)) {
                if (CoreModule.f18276o.m132214d().mo34831g()) {
                    if (!TEnum.equals(message.messageType, "voice_call") || !NullChecker.m82486a(message.additionalData) || !TextUtils.equals("rejected", message.additionalData.status)) {
                        if (TEnum.equals(message.messageType, "voice_call_invitation")) {
                        }
                    }
                }
                boolean zIsMe = message.isMe();
                String str = message.cid;
                if (zIsMe) {
                    if (map2.get(str) == null) {
                        String str2 = message.cid;
                        map2.put(str2, new y250(str2, message.getHostId(), message.isGroupMessage()));
                    }
                } else if (map.get(str) == null) {
                    String str3 = message.cid;
                    map.put(str3, new y250(str3, message.getHostId(), message.isGroupMessage()));
                }
                map3.put(message.getHostId(), message.cid);
                boolean zIsMe2 = message.isMe();
                String str4 = message.cid;
                if (zIsMe2) {
                    map2.get(str4).m214038a(message);
                    arrayList3.add(message);
                } else {
                    map.get(str4).m214038a(message);
                    arrayList2.add(message);
                }
            }
        }
        m193930D(map, arrayList2, user, ((Integer) ((bkj0) pf60Var.f152156a).f77082b).intValue(), map3);
        m193929C(map2, arrayList3, user, ((Integer) ((bkj0) pf60Var.f152156a).f77083c).intValue(), map3);
    }

    /* JADX INFO: renamed from: M */
    public void m193939M(int i) {
        m193940N(i, false);
    }

    /* JADX INFO: renamed from: N */
    public void m193940N(int i, boolean z) {
        if (i == 1) {
            this.f176977a.f20384f0.m33858Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), true, false);
            return;
        }
        if (i == 0 || i == 2) {
            this.f176977a.f20384f0.m33858Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), false, true);
            return;
        }
        if (m193926v(i)) {
            C4883c c4883c = this.f176977a;
            if (z) {
                c4883c.f20384f0.m33870Xp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m193923s(i));
            } else {
                c4883c.f20384f0.m33846Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m193923s(i));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m193941Q(PushMessage pushMessage, User user) {
        pushMessage.primaryPicture = CoreModule.f18276o.m132214d().mo34677Di(user).profileSmall().formatted();
        if (NullChecker.m82486a(user)) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
            if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
                pushMessage.primaryPicture = user.getAnonymousUrl();
            }
        }
        if (CoreModule.f18276o.m132214d().mo34811c() && user.onlineMatchLocked()) {
            pushMessage.user = user;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m193942R(float f) {
        PushMessage pushMessage = new PushMessage();
        String string = CoreModule.f18263b.getString(R$string.f56615d, String.format("%.1f", Float.valueOf(f)));
        pushMessage.title = CoreModule.f18263b.getString(R$string.f56616e);
        pushMessage.value = string;
        pushMessage.ticker = string;
        pushMessage.content = new PushMessageContent();
        pushMessage.priority = 4;
        pushMessage.stackId = 3;
        m193945x(pushMessage);
    }

    /* JADX INFO: renamed from: S */
    public ft5 m193943S() {
        return pcg0.m171650c(this.f176977a.f20384f0.m34076on().first(new qcj() { // from class: l.d17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((vg60) obj).m201221c());
            }
        }).flatMap(new qcj() { // from class: l.m17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134390a.m193934H((vg60) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.n17
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139724a.m193935I((List) obj);
            }
        }, new y20() { // from class: l.o17
            @Override // p153l.y20
            public final void call(Object obj) {
                u17.m193919o((Throwable) obj);
            }
        })), this.f176977a.f20384f0.m34076on().first(new qcj() { // from class: l.p17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((vg60) obj).m201221c());
            }
        }).flatMap(new qcj() { // from class: l.q17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155156a.m193936J((vg60) obj);
            }
        }).onBackpressureLatest().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.r17
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160779a.m193937K((List) obj);
            }
        }).observeOn(fo0.m126432a()).withLatestFrom(this.f176977a.f20381e0.m116596o9(), new rcj() { // from class: l.s17
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((bkj0) obj, (User) obj2);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.t17
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171605a.m193938L((pf60) obj);
            }
        }, new y20() { // from class: l.e17
            @Override // p153l.y20
            public final void call(Object obj) {
                u17.m193913i((Throwable) obj);
            }
        })), pcg0.m171648a(new x20() { // from class: l.l17
            @Override // p153l.x20
            public final void call() {
                u17.m193910f();
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public String m193944T(Message message, boolean z) {
        String string;
        MessageCallToBuy messageCallToBuy;
        Resources resources = CoreModule.f18263b.getResources();
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.cid);
        String str = userM116503Pa == null ? "" : userM116503Pa.name;
        boolean zIsTeamAccount = userM116503Pa == null ? false : userM116503Pa.isTeamAccount();
        if (z) {
            string = str + ": " + message.value;
        } else {
            string = resources.getString(R$string.f56602F, str);
        }
        if (NullChecker.m82486a(message.video())) {
            return resources.getString(R$string.f56605I, str);
        }
        if (NullChecker.m82486a(message.audio())) {
            return resources.getString(R$string.f56598B, str);
        }
        if (NullChecker.m82486a(message.picture())) {
            return resources.getString(R$string.f56600D, str);
        }
        if (NullChecker.m82486a(message.location)) {
            return resources.getString(R$string.f56601E, str);
        }
        if (NullChecker.m82486a(message.question) && !zIsTeamAccount) {
            return resources.getString(R$string.f56603G, str);
        }
        if (NullChecker.m82486a(message.sticker)) {
            return resources.getString(R$string.f56604H, str);
        }
        if (NullChecker.m82486a(message.moment)) {
            return resources.getString(R$string.f56599C, str);
        }
        if (TEnum.equals(message.messageType, "call_2_buy")) {
            try {
                messageCallToBuy = MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                messageCallToBuy = null;
            }
            return NullChecker.m82486a(messageCallToBuy) ? messageCallToBuy.previewText : string;
        }
        if (!TEnum.equals(message.messageType, MessageType.hide_for_fake_user)) {
            return string;
        }
        return str + ": 对方发来一条消息";
    }

    /* JADX INFO: renamed from: x */
    public final void m193945x(PushMessage pushMessage) {
        if (pushMessage.messageCustom == null) {
            pushMessage.messageCustom = PushMessageCustom.new_();
        }
        pushMessage.messageCustom.pushChannel = "tantan_default";
        CoreModule.f18274m.m207535i(pushMessage);
    }

    /* JADX INFO: renamed from: y */
    public final void m193946y(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        if (pushMessage.messageCustom == null) {
            pushMessage.messageCustom = PushMessageCustom.new_();
        }
        pushMessage.messageCustom.pushChannel = "tantan_default";
        CoreModule.f18274m.m207537k(pushMessage, pushTrackData, z);
    }

    /* JADX INFO: renamed from: z */
    public String m193947z() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ == null || !c4450rForeground_.f16063b.f16274a) {
            return null;
        }
        return CoreModule.f18276o.m132214d().mo34798ac(c4450rForeground_.f16062a.get());
    }
}
