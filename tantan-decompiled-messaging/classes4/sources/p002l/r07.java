package p002l;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.data.MessageCallToBuy;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.PushMessageIntent;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.core.base.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.bs5;
import l.c4g0;
import l.d30;
import l.ddj0;
import l.e30;
import l.h4g0;
import l.j760;
import l.jo0;
import l.mgh0;
import l.mkd0;
import l.q860;
import l.qib0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xaj0;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r07 {

    /* JADX INFO: renamed from: b */
    public static final HashSet<Integer> f18305b = new HashSet<>();

    /* JADX INFO: renamed from: c */
    public static boolean f18306c = false;

    /* JADX INFO: renamed from: d */
    public static a<Boolean> f18307d = a.c(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public c f18308a;

    public r07(c cVar) {
        this.f18308a = cVar;
    }

    /* JADX INFO: renamed from: A */
    public static void m21662A(PushMessage pushMessage) {
        if (f18306c || pushMessage.silent || App.e() >= 10000) {
            return;
        }
        if (((qib0.H.guessedCurrentServerTime() - pushMessage.createdTime <= 600000.0d || "vivo X20A".equals(Build.MODEL)) && (qib0.H.guessedCurrentServerTime() - pushMessage.createdTime <= 1200000.0d || !"vivo X20A".equals(Build.MODEL))) || SystemClock.elapsedRealtime() <= 1200000 || ((Integer) App.i.get()).intValue() <= 1) {
            return;
        }
        f18306c = true;
        f18307d.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: O */
    public static void m21663O(int i) {
        f18305b.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: P */
    public static void m21664P(int i) {
        f18305b.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21670f() {
        Iterator<Integer> it = CoreModule.m.m14017o().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (m21687w(iIntValue) || m21686v(iIntValue) || 1 == iIntValue || iIntValue == 0) {
                CoreModule.m.m14006b(iIntValue);
            }
        }
        CoreModule.m.m14007c();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m21673i(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m21679o(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static final int m21682r(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str) + 10000;
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final String m21683s(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i - 10000);
        sb.append("");
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static final int m21684t(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return (!CoreModule.o.d().E() || Long.parseLong(str) <= 2147473647) ? -(Integer.parseInt(str) + 10000) : str.hashCode();
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final String m21685u(int i) {
        return (-(i + 10000)) + "";
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m21686v(int i) {
        return i > 7000;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m21687w(int i) {
        return i < -7000;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final CharSequence m21693G(Message message) {
        if (TEnum.equals(message.messageType, "tickle") && !message.isMe()) {
            User userPa = CoreModule.c.e0.Pa(message.owner);
            if (NullChecker.a(userPa)) {
                return CoreModule.b.getString(R.string.i, userPa.name);
            }
        }
        return CoreModule.o.d().Ac(message);
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
    public final void m21689C(HashMap<String, ju40> map, List<Message> list, User user, int i, HashMap<String, String> map2) {
        String str;
        boolean z;
        boolean z2;
        Iterator<Integer> it;
        PushMessage pushMessage;
        Message message;
        User userPa;
        int iIntValue;
        int iIntValue2;
        ju40 ju40Var;
        String strM21707z = m21707z();
        if (CoreModule.o.d().E() && NullChecker.a(strM21707z)) {
            str = map2.get(strM21707z);
            if (!TextUtils.isEmpty(str) && map.containsKey(str)) {
                z = true;
            }
            if ((!NullChecker.a(strM21707z) && map.containsKey(strM21707z)) || z) {
                if (CoreModule.o.d().E()) {
                    ju40Var = map.get(str);
                    if (NullChecker.a(ju40Var) || !ju40Var.m16232e()) {
                        this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
                    } else {
                        this.f18308a.f0.Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
                    }
                } else {
                    this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), ((DbObject) user).id);
                }
                mgh0.s();
            }
            if (map.size() == 0) {
                for (Integer num : CoreModule.m.m14017o()) {
                    iIntValue2 = num.intValue();
                    if (f18305b.contains(num) && (m21687w(iIntValue2) || iIntValue2 == 2)) {
                        CoreModule.m.m14006b(iIntValue2);
                    }
                }
                return;
            }
            if (vwb.r(list, new w9j() { // from class: l.g07
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                }
            }) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (map.size() <= 3 || CoreModule.m.m14016n(0)) {
                it = CoreModule.m.m14017o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m21687w(iIntValue)) {
                        CoreModule.m.m14006b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = "conversation.list";
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.b.getString(R.string.p);
                pushMessage.value = CoreModule.b.getString(R.string.s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.o.d().E() || !message.isGroupMessage()) {
                    userPa = this.f18308a.e0.Pa(message.cid);
                    if (NullChecker.a(userPa)) {
                        m21701Q(pushMessage, userPa);
                    }
                } else {
                    pushMessage.intent = "conversation.group";
                    PushMessageContent pushMessageContent = pushMessage.content;
                    pushMessageContent.type = "conversation";
                    pushMessageContent.id = message.cid;
                    ChatGroup chatGroupS6 = this.f18308a.g0.s6(message.getHostId());
                    if (NullChecker.a(chatGroupS6) && !vwb.J(chatGroupS6.avatars)) {
                        pushMessage.primaryPicture = ((Picture) chatGroupS6.avatars.get(0)).cover().profileSmall().formatted();
                    }
                    if (TextUtils.isEmpty(pushMessage.primaryPicture)) {
                        pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                    }
                }
                m21705x(pushMessage);
            } else {
                Iterator<Integer> it2 = CoreModule.m.m14017o().iterator();
                while (it2.hasNext()) {
                    int iIntValue3 = it2.next().intValue();
                    if (m21687w(iIntValue3) && !map.containsKey(m21685u(iIntValue3))) {
                        CoreModule.m.m14006b(iIntValue3);
                    }
                }
                CoreModule.m.m14006b(2);
                for (Map.Entry<String, ju40> entry : map.entrySet()) {
                    ju40 value = entry.getValue();
                    PushMessage pushMessage2 = new PushMessage();
                    pushMessage2.intent = "conversation.single";
                    PushMessageContent pushMessageContent2 = new PushMessageContent();
                    pushMessage2.content = pushMessageContent2;
                    pushMessageContent2.type = "conversation";
                    pushMessageContent2.id = entry.getKey();
                    pushMessage2.priority = 4;
                    Message messageM16229b = entry.getValue().m16229b(0);
                    if (CoreModule.o.d().E() && value.m16232e()) {
                        pushMessage2.intent = "conversation.group";
                        pushMessage2.stackId = m21684t(value.m16230c());
                        ChatGroup chatGroupS7 = this.f18308a.g0.s6(value.m16230c());
                        pushMessage2.title = chatGroupS7 == null ? CoreModule.b.getString(R.string.p) : chatGroupS7.name;
                        if (NullChecker.a(chatGroupS7) && !vwb.J(chatGroupS7.avatars)) {
                            pushMessage2.primaryPicture = ((Picture) chatGroupS7.avatars.get(0)).cover().profileSmall().formatted();
                        }
                        if (TextUtils.isEmpty(pushMessage2.primaryPicture)) {
                            pushMessage2.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                        }
                    } else {
                        pushMessage2.stackId = m21684t(entry.getKey());
                        User userPa2 = this.f18308a.e0.Pa(messageM16229b.cid);
                        pushMessage2.title = userPa2 == null ? CoreModule.b.getString(R.string.p) : userPa2.name;
                        if (NullChecker.a(userPa2)) {
                            m21701Q(pushMessage2, userPa2);
                        }
                    }
                    int iM16233f = entry.getValue().m16233f();
                    pushMessage2.value = iM16233f == 1 ? CoreModule.b.getString(R.string.u) : CoreModule.b.getString(R.string.t, Integer.valueOf(iM16233f));
                    boolean z3 = vwb.r(entry.getValue().m16231d(), new w9j() { // from class: l.h07
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                        }
                    }) == null;
                    pushMessage2.silentAggregation = z3;
                    pushMessage2.silent = z3;
                    pushMessage2.createdTime = (long) messageM16229b.createdTime;
                    m21705x(pushMessage2);
                }
            }
            if (z2) {
                return;
            }
            this.f18308a.f0.Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
            return;
        }
        str = strM21707z;
        z = false;
        if (!NullChecker.a(strM21707z)) {
            if (map.size() == 0) {
                while (r10.hasNext()) {
                    iIntValue2 = num.intValue();
                    if (f18305b.contains(num)) {
                        CoreModule.m.m14006b(iIntValue2);
                    }
                }
                return;
            }
            if (vwb.r(list, new w9j() { // from class: l.g07
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                }
            }) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (map.size() <= 3) {
                it = CoreModule.m.m14017o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m21687w(iIntValue)) {
                        CoreModule.m.m14006b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = "conversation.list";
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.b.getString(R.string.p);
                pushMessage.value = CoreModule.b.getString(R.string.s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.o.d().E()) {
                    userPa = this.f18308a.e0.Pa(message.cid);
                    if (NullChecker.a(userPa)) {
                        m21701Q(pushMessage, userPa);
                    }
                } else {
                    userPa = this.f18308a.e0.Pa(message.cid);
                    if (NullChecker.a(userPa)) {
                        m21701Q(pushMessage, userPa);
                    }
                }
                m21705x(pushMessage);
            } else {
                it = CoreModule.m.m14017o().iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (m21687w(iIntValue)) {
                        CoreModule.m.m14006b(iIntValue);
                    }
                }
                pushMessage = new PushMessage();
                pushMessage.intent = "conversation.list";
                pushMessage.content = new PushMessageContent();
                pushMessage.priority = 4;
                pushMessage.stackId = 2;
                pushMessage.title = CoreModule.b.getString(R.string.p);
                pushMessage.value = CoreModule.b.getString(R.string.s, Integer.valueOf(i), Integer.valueOf(map.size()));
                pushMessage.silentAggregation = z2;
                pushMessage.silent = z2;
                message = list.get(0);
                pushMessage.createdTime = (long) message.createdTime;
                if (CoreModule.o.d().E()) {
                    userPa = this.f18308a.e0.Pa(message.cid);
                    if (NullChecker.a(userPa)) {
                        m21701Q(pushMessage, userPa);
                    }
                } else {
                    userPa = this.f18308a.e0.Pa(message.cid);
                    if (NullChecker.a(userPa)) {
                        m21701Q(pushMessage, userPa);
                    }
                }
                m21705x(pushMessage);
            }
            if (z2) {
                this.f18308a.f0.Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
                return;
            }
            return;
        }
        if (map.size() == 0) {
            while (r10.hasNext()) {
                iIntValue2 = num.intValue();
                if (f18305b.contains(num)) {
                    CoreModule.m.m14006b(iIntValue2);
                }
            }
            return;
        }
        if (vwb.r(list, new w9j() { // from class: l.g07
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
            }
        }) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (map.size() <= 3) {
            it = CoreModule.m.m14017o().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (m21687w(iIntValue)) {
                    CoreModule.m.m14006b(iIntValue);
                }
            }
            pushMessage = new PushMessage();
            pushMessage.intent = "conversation.list";
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 2;
            pushMessage.title = CoreModule.b.getString(R.string.p);
            pushMessage.value = CoreModule.b.getString(R.string.s, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z2;
            pushMessage.silent = z2;
            message = list.get(0);
            pushMessage.createdTime = (long) message.createdTime;
            if (CoreModule.o.d().E()) {
                userPa = this.f18308a.e0.Pa(message.cid);
                if (NullChecker.a(userPa)) {
                    m21701Q(pushMessage, userPa);
                }
            } else {
                userPa = this.f18308a.e0.Pa(message.cid);
                if (NullChecker.a(userPa)) {
                    m21701Q(pushMessage, userPa);
                }
            }
            m21705x(pushMessage);
        } else {
            it = CoreModule.m.m14017o().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (m21687w(iIntValue)) {
                    CoreModule.m.m14006b(iIntValue);
                }
            }
            pushMessage = new PushMessage();
            pushMessage.intent = "conversation.list";
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 2;
            pushMessage.title = CoreModule.b.getString(R.string.p);
            pushMessage.value = CoreModule.b.getString(R.string.s, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z2;
            pushMessage.silent = z2;
            message = list.get(0);
            pushMessage.createdTime = (long) message.createdTime;
            if (CoreModule.o.d().E()) {
                userPa = this.f18308a.e0.Pa(message.cid);
                if (NullChecker.a(userPa)) {
                    m21701Q(pushMessage, userPa);
                }
            } else {
                userPa = this.f18308a.e0.Pa(message.cid);
                if (NullChecker.a(userPa)) {
                    m21701Q(pushMessage, userPa);
                }
            }
            m21705x(pushMessage);
        }
        if (z2) {
            this.f18308a.f0.Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), false, true);
            return;
        }
        return;
        if (CoreModule.o.d().E()) {
            ju40Var = map.get(str);
            if (NullChecker.a(ju40Var)) {
                this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
            } else {
                this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
            }
        } else {
            this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), ((DbObject) user).id);
        }
        mgh0.s();
    }

    /* JADX INFO: renamed from: D */
    public final void m21690D(HashMap<String, ju40> map, List<Message> list, User user, int i, HashMap<String, String> map2) {
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
            for (Message message : it.next().m16231d()) {
                if (TEnum.equals(message.localNotificationStatus, "pending")) {
                    CoreModule.c.j1.m(message);
                }
            }
        }
        String strM21707z = m21707z();
        boolean z2 = false;
        if (CoreModule.o.d().E() && NullChecker.a(strM21707z)) {
            str2 = map2.get(strM21707z);
            z = !TextUtils.isEmpty(str2) && map.containsKey(str2);
        } else {
            z = false;
            str2 = null;
        }
        if ((NullChecker.a(strM21707z) && map.containsKey(strM21707z)) || z) {
            if (CoreModule.o.d().E()) {
                ju40 ju40Var = map.get(str2);
                if (NullChecker.a(ju40Var) && ju40Var.m16232e()) {
                    this.f18308a.f0.Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
                    return;
                }
                this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
            } else {
                this.f18308a.f0.Vp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), strM21707z);
            }
            if (CoreModule.o.d().D() && i == 1 && TEnum.equals(map.get(strM21707z).m16229b(0).messageType, "tickle")) {
                return;
            }
            mgh0.s();
            return;
        }
        if (map.size() == 0) {
            for (Integer num : CoreModule.m.m14017o()) {
                int iIntValue = num.intValue();
                if (m21686v(iIntValue) || iIntValue == 0) {
                    if (!f18305b.contains(num)) {
                        CoreModule.m.m14006b(iIntValue);
                    }
                }
            }
            return;
        }
        boolean z3 = vwb.r(list, new w9j() { // from class: l.d07
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
            }
        }) == null;
        int i2 = 4;
        if (map.size() > 3 || CoreModule.m.m14016n(0)) {
            str3 = "pending";
            for (Integer num2 : CoreModule.m.m14017o()) {
                int iIntValue2 = num2.intValue();
                if (m21686v(iIntValue2) && !f18305b.contains(num2)) {
                    if (TantanApp.c.N()) {
                        String strM21683s = m21683s(iIntValue2);
                        if ((!map2.containsKey(strM21683s)) & (!map.containsKey(strM21683s))) {
                            CoreModule.m.m14006b(iIntValue2);
                        }
                    } else {
                        CoreModule.m.m14006b(iIntValue2);
                    }
                }
            }
            boolean z4 = user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(((DbObject) list.get(0)).id);
            PushMessage pushMessage = new PushMessage();
            pushMessage.intent = "conversation.list";
            pushMessage.content = new PushMessageContent();
            pushMessage.priority = 4;
            pushMessage.stackId = 0;
            pushMessage.ticker = m21704T(list.get(0), z4);
            pushMessage.title = CoreModule.b.getString(R.string.p);
            pushMessage.value = CoreModule.b.getString(R.string.A, Integer.valueOf(i), Integer.valueOf(map.size()));
            pushMessage.silentAggregation = z3;
            pushMessage.silent = z3;
            Message message2 = list.get(0);
            pushMessage.createdTime = (long) message2.createdTime;
            m21662A(pushMessage);
            if (CoreModule.o.d().E() && message2.isGroupMessage()) {
                pushMessage.intent = "conversation.group";
                PushMessageContent pushMessageContent = pushMessage.content;
                pushMessageContent.type = "conversation";
                pushMessageContent.id = message2.cid;
                ChatGroup chatGroupS6 = this.f18308a.g0.s6(message2.getHostId());
                if (NullChecker.a(chatGroupS6) && !vwb.J(chatGroupS6.avatars)) {
                    pushMessage.primaryPicture = ((Picture) chatGroupS6.avatars.get(0)).cover().profileSmall().formatted();
                }
                if (TextUtils.isEmpty(pushMessage.primaryPicture)) {
                    pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                }
            } else {
                User userPa = this.f18308a.e0.Pa(message2.cid);
                if (NullChecker.a(userPa)) {
                    m21701Q(pushMessage, userPa);
                }
                CoreModule.c.j1.i(message2);
            }
            if (CoreModule.o.d().js()) {
                if (m21691E(PushMessageIntent.get("message.single.update"))) {
                    m21706y(pushMessage, null, z4);
                }
            } else if (!TantanApp.c.N()) {
                m21706y(pushMessage, null, z4);
            }
        } else {
            for (Integer num3 : CoreModule.m.m14017o()) {
                int iIntValue3 = num3.intValue();
                if (m21686v(iIntValue3) && !f18305b.contains(num3)) {
                    String strM21683s2 = m21683s(iIntValue3);
                    if (!map.containsKey(strM21683s2) && !map2.containsKey(strM21683s2)) {
                        CoreModule.m.m14006b(iIntValue3);
                    }
                }
            }
            CoreModule.m.m14006b(0);
            Iterator<Map.Entry<String, ju40>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, ju40> next = it2.next();
                String key = next.getKey();
                ju40 value = next.getValue();
                boolean z5 = (user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(key)) ? true : z2;
                PushMessage pushMessage2 = new PushMessage();
                pushMessage2.intent = "conversation.single";
                PushMessageContent pushMessageContent2 = new PushMessageContent();
                pushMessage2.content = pushMessageContent2;
                pushMessageContent2.type = "conversation";
                Iterator<Map.Entry<String, ju40>> it3 = it2;
                pushMessageContent2.id = next.getKey();
                pushMessage2.priority = i2;
                Message messageM16229b = next.getValue().m16229b(0);
                pushMessage2.ticker = m21704T(messageM16229b, z5);
                int iM16233f = next.getValue().m16233f();
                pushMessage2.counter = iM16233f;
                if (iM16233f == 1) {
                    pushMessage2.counter = 0;
                }
                if (CoreModule.o.d().E() && value.m16232e()) {
                    pushMessage2.intent = "conversation.group";
                    pushMessage2.stackId = m21682r(value.m16230c());
                    ChatGroup chatGroupS7 = this.f18308a.g0.s6(value.m16230c());
                    pushMessage2.title = chatGroupS7 == null ? CoreModule.b.getString(R.string.p) : chatGroupS7.name;
                    if (NullChecker.a(chatGroupS7) && !vwb.J(chatGroupS7.avatars)) {
                        pushMessage2.primaryPicture = ((Picture) chatGroupS7.avatars.get(0)).cover().profileSmall().formatted();
                    }
                    if (TextUtils.isEmpty(pushMessage2.primaryPicture)) {
                        pushMessage2.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
                    }
                } else {
                    pushMessage2.stackId = m21682r(next.getKey());
                    User userPa2 = this.f18308a.e0.Pa(messageM16229b.cid);
                    pushMessage2.title = userPa2 == null ? CoreModule.b.getString(R.string.p) : userPa2.name;
                    if (NullChecker.a(userPa2)) {
                        m21701Q(pushMessage2, userPa2);
                    }
                }
                pushMessage2.value = (user == null || user.settings.previewPushMessage().booleanValue() || User.isTeamAccount(key)) ? ddj0.d(vwb.Q(vwb.k0(next.getValue().m16231d(), 10), new w9j() { // from class: l.e07
                    public final Object call(Object obj) {
                        return this.f9500a.m21693G((Message) obj);
                    }
                }), "\n") : pushMessage2.ticker;
                boolean z6 = vwb.r(next.getValue().m16231d(), new w9j() { // from class: l.f07
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Message) obj).localNotificationStatus, "pending"));
                    }
                }) == null;
                pushMessage2.silentAggregation = z6;
                pushMessage2.silent = z6;
                String str4 = str;
                pushMessage2.createdTime = (long) messageM16229b.createdTime;
                CoreModule.c.j1.i(messageM16229b);
                m21662A(pushMessage2);
                if (CoreModule.o.d().js()) {
                    if (m21691E(PushMessageIntent.get("message.single.update"))) {
                        m21706y(pushMessage2, null, z5);
                    }
                } else if (!TantanApp.c.N()) {
                    m21706y(pushMessage2, null, z5);
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
        this.f18308a.f0.Wp(NotificationStatus.get(str3), NotificationStatus.get("ongoing"), false, true);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m21691E(PushMessageIntent pushMessageIntent) {
        SettingGroups settingGroups = (SettingGroups) CoreModule.c.e0.R.get();
        if (TEnum.equals(pushMessageIntent, "message.single.update")) {
            return settingGroups.push.messagePush.booleanValue();
        }
        if (TEnum.equals(pushMessageIntent, "moment.match.post")) {
            return settingGroups.push.newMatchPush.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m21692F() {
        Act.r rVarForeground_ = Act.foreground_();
        if (rVarForeground_ != null && rVarForeground_.b.a) {
            if (CoreModule.o.d().H6((Activity) rVarForeground_.a.get())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ rx.c m21694H(q860 q860Var) {
        return this.f18308a.f0.Tp();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m21695I(List list) {
        if (list.isEmpty()) {
            CoreModule.m.m14006b(1);
            return;
        }
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "conversation.list";
        pushMessage.content = new PushMessageContent();
        pushMessage.priority = 4;
        pushMessage.stackId = 1;
        pushMessage.ticker = CoreModule.b.getString(list.size() > 1 ? R.string.x : R.string.y, Integer.valueOf(list.size()));
        pushMessage.title = CoreModule.b.getString(R.string.z);
        pushMessage.value = CoreModule.b.getString(list.size() == 1 ? R.string.w : R.string.v, Integer.valueOf(list.size()));
        pushMessage.silentAggregation = true;
        pushMessage.silent = TEnum.equals(((Conversation) list.get(0)).localNotificationStatus, "ongoing");
        User userPa = this.f18308a.e0.Pa(((DbObject) ((Conversation) list.get(0))).id);
        if (NullChecker.a(userPa)) {
            m21701Q(pushMessage, userPa);
        } else {
            CrashHelper.c(new Exception("User database lost user otherId: " + ((DbObject) ((Conversation) list.get(0))).id));
        }
        if (list.size() > 10 || vwb.m(list, new w9j() { // from class: l.c07
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Conversation) obj).localNotificationStatus, "pending"));
            }
        })) {
            this.f18308a.f0.Wp(NotificationStatus.get("pending"), NotificationStatus.get("ongoing"), true, false);
        }
        pushMessage.createdTime = (long) ((Conversation) list.get(0)).createdTime;
        if (CoreModule.o.d().Vq(((DbObject) ((Conversation) list.get(0))).id)) {
            pushMessage.value = CoreModule.b.getString(R.string.r);
        }
        m21662A(pushMessage);
        if (CoreModule.c.z2.o3(((DbObject) ((Conversation) list.get(0))).id)) {
            return;
        }
        if (CoreModule.o.d().js()) {
            if (m21691E(PushMessageIntent.get("moment.match.post"))) {
                m21705x(pushMessage);
            }
        } else {
            if (TantanApp.c.N()) {
                return;
            }
            m21705x(pushMessage);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ rx.c m21696J(q860 q860Var) {
        return this.f18308a.f0.Pn();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ xaj0 m21697K(List list) {
        String strUserId = CoreModule.H().userId();
        return new xaj0(this.f18308a.f0.Up(), Integer.valueOf(this.f18308a.f0.Rn(strUserId)), Integer.valueOf(this.f18308a.f0.Qn(strUserId)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m21698L(j760 j760Var) {
        List list = (List) ((xaj0) j760Var.a).a;
        User user = (User) j760Var.b;
        ArrayList<Message> arrayList = new ArrayList(vwb.k0(list, CoreModule.o.d().E() ? 200 : 1000));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap<String, ju40> map = new HashMap<>();
        HashMap<String, ju40> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        for (Message message : arrayList) {
            if (!TextUtils.isEmpty(message.cid)) {
                if (CoreModule.o.d().g()) {
                    if (!TEnum.equals(message.messageType, "voice_call") || !NullChecker.a(message.additionalData) || !TextUtils.equals("rejected", message.additionalData.status)) {
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
                    map2.get(str4).m16228a(message);
                    arrayList3.add(message);
                } else {
                    map.get(str4).m16228a(message);
                    arrayList2.add(message);
                }
            }
        }
        m21690D(map, arrayList2, user, ((Integer) ((xaj0) j760Var.a).b).intValue(), map3);
        m21689C(map2, arrayList3, user, ((Integer) ((xaj0) j760Var.a).c).intValue(), map3);
    }

    /* JADX INFO: renamed from: M */
    public void m21699M(int i) {
        m21700N(i, false);
    }

    /* JADX INFO: renamed from: N */
    public void m21700N(int i, boolean z) {
        if (i == 1) {
            this.f18308a.f0.Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), true, false);
            return;
        }
        if (i == 0 || i == 2) {
            this.f18308a.f0.Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), false, true);
            return;
        }
        if (m21686v(i)) {
            c cVar = this.f18308a;
            if (z) {
                cVar.f0.Xp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m21683s(i));
            } else {
                cVar.f0.Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m21683s(i));
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m21701Q(PushMessage pushMessage, User user) {
        pushMessage.primaryPicture = CoreModule.o.d().Di(user).profileSmall().formatted();
        if (NullChecker.a(user)) {
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
            if (NullChecker.a(conversationXe) && conversationXe.isAnonymous()) {
                pushMessage.primaryPicture = user.getAnonymousUrl();
            }
        }
        if (CoreModule.o.d().c() && user.onlineMatchLocked()) {
            pushMessage.user = user;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m21702R(float f) {
        PushMessage pushMessage = new PushMessage();
        String string = CoreModule.b.getString(R.string.d, String.format("%.1f", Float.valueOf(f)));
        pushMessage.title = CoreModule.b.getString(R.string.e);
        pushMessage.value = string;
        pushMessage.ticker = string;
        pushMessage.content = new PushMessageContent();
        pushMessage.priority = 4;
        pushMessage.stackId = 3;
        m21705x(pushMessage);
    }

    /* JADX INFO: renamed from: S */
    public bs5 m21703S() {
        return h4g0.c(new c4g0[]{this.f18308a.f0.on().first(new w9j() { // from class: l.a07
            public final Object call(Object obj) {
                return Boolean.valueOf(!((q860) obj).c());
            }
        }).flatMap(new w9j() { // from class: l.j07
            public final Object call(Object obj) {
                return this.f13516a.m21694H((q860) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.k07
            public final void call(Object obj) {
                this.f14156a.m21695I((List) obj);
            }
        }, new e30() { // from class: l.l07
            public final void call(Object obj) {
                r07.m21679o((Throwable) obj);
            }
        })), this.f18308a.f0.on().first(new w9j() { // from class: l.m07
            public final Object call(Object obj) {
                return Boolean.valueOf(!((q860) obj).c());
            }
        }).flatMap(new w9j() { // from class: l.n07
            public final Object call(Object obj) {
                return this.f15765a.m21696J((q860) obj);
            }
        }).onBackpressureLatest().observeOn(Schedulers.io()).map(new w9j() { // from class: l.o07
            public final Object call(Object obj) {
                return this.f16325a.m21697K((List) obj);
            }
        }).observeOn(jo0.a()).withLatestFrom(this.f18308a.e0.o9(), new x9j() { // from class: l.p07
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((xaj0) obj, (User) obj2);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.q07
            public final void call(Object obj) {
                this.f17737a.m21698L((j760) obj);
            }
        }, new e30() { // from class: l.b07
            public final void call(Object obj) {
                r07.m21673i((Throwable) obj);
            }
        })), h4g0.a(new d30() { // from class: l.i07
            public final void call() {
                r07.m21670f();
            }
        })});
    }

    /* JADX INFO: renamed from: T */
    public String m21704T(Message message, boolean z) {
        String string;
        MessageCallToBuy messageCallToBuy;
        Resources resources = CoreModule.b.getResources();
        User userPa = CoreModule.c.e0.Pa(message.cid);
        String str = userPa == null ? "" : userPa.name;
        boolean zIsTeamAccount = userPa == null ? false : userPa.isTeamAccount();
        if (z) {
            string = str + ": " + message.value;
        } else {
            string = resources.getString(R.string.F, str);
        }
        if (NullChecker.a(message.video())) {
            return resources.getString(R.string.I, str);
        }
        if (NullChecker.a(message.audio())) {
            return resources.getString(R.string.B, str);
        }
        if (NullChecker.a(message.picture())) {
            return resources.getString(R.string.D, str);
        }
        if (NullChecker.a(message.location)) {
            return resources.getString(R.string.E, str);
        }
        if (NullChecker.a(message.question) && !zIsTeamAccount) {
            return resources.getString(R.string.G, str);
        }
        if (NullChecker.a(message.sticker)) {
            return resources.getString(R.string.H, str);
        }
        if (NullChecker.a(message.moment)) {
            return resources.getString(R.string.C, str);
        }
        if (TEnum.equals(message.messageType, "call_2_buy")) {
            try {
                messageCallToBuy = (MessageCallToBuy) MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
            } catch (IOException e) {
                CrashHelper.c(e);
                messageCallToBuy = null;
            }
            return NullChecker.a(messageCallToBuy) ? messageCallToBuy.previewText : string;
        }
        if (!TEnum.equals(message.messageType, "hide_for_fake_user")) {
            return string;
        }
        return str + ": 对方发来一条消息";
    }

    /* JADX INFO: renamed from: x */
    public final void m21705x(PushMessage pushMessage) {
        if (pushMessage.messageCustom == null) {
            pushMessage.messageCustom = PushMessageCustom.new_();
        }
        pushMessage.messageCustom.pushChannel = "tantan_default";
        CoreModule.m.m14011i(pushMessage);
    }

    /* JADX INFO: renamed from: y */
    public final void m21706y(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        if (pushMessage.messageCustom == null) {
            pushMessage.messageCustom = PushMessageCustom.new_();
        }
        pushMessage.messageCustom.pushChannel = "tantan_default";
        CoreModule.m.m14013k(pushMessage, pushTrackData, z);
    }

    /* JADX INFO: renamed from: z */
    public String m21707z() {
        Act.r rVarForeground_ = Act.foreground_();
        if (rVarForeground_ == null || !rVarForeground_.b.a) {
            return null;
        }
        return CoreModule.o.d().ac((Activity) rVarForeground_.a.get());
    }
}
