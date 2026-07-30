package com.p000p1.mobile.putong.core.p001ui.messages;

import android.app.Application;
import android.os.Build;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p000p1.mobile.putong.core.p001ui.messages.C0107b;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.ChatGroupSilence;
import com.p1.mobile.putong.core.data.ChatSendMessage;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.JailedGroupChat;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.bt0;
import l.lsi0;
import l.mqi0;
import l.n17;
import l.o6j0;
import l.o96;
import l.qib0;
import l.ura;
import l.vwb;
import l.xaj0;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.tjj;
import p003l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0107b {

    /* JADX INFO: renamed from: a */
    public static long f1650a = 0;

    /* JADX INFO: renamed from: b */
    public static String f1651b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f1652c = true;

    /* JADX INFO: renamed from: d */
    public static String f1653d = "";

    /* JADX INFO: renamed from: e */
    public static Map<View, d> f1654e = new HashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$a */
    public class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1655a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnLongClickListener f1656b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View.OnClickListener f1657c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f1658d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ c f1659e;

        public a(View view, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener, Runnable runnable, c cVar) {
            this.f1655a = view;
            this.f1656b = onLongClickListener;
            this.f1657c = onClickListener;
            this.f1658d = runnable;
            this.f1659e = cVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (NullChecker.a(this.f1658d)) {
                this.f1658d.run();
            }
            C0107b.m2160n(this.f1655a, this.f1659e);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            this.f1655a.setPressed(false);
            if (NullChecker.a(this.f1656b)) {
                this.f1656b.onLongClick(this.f1655a);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            super.onShowPress(motionEvent);
            this.f1655a.setPressed(true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!NullChecker.a(this.f1657c)) {
                return true;
            }
            this.f1657c.onClick(this.f1655a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f1660a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tjj f1661b;

        public b(c cVar, tjj tjjVar) {
            this.f1660a = cVar;
            this.f1661b = tjjVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!this.f1660a.mo1508c()) {
                return false;
            }
            this.f1661b.m7754a(motionEvent);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        String mo1506a();

        /* JADX INFO: renamed from: b */
        String mo1507b();

        /* JADX INFO: renamed from: c */
        boolean mo1508c();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public View f1662a;

        /* JADX INFO: renamed from: b */
        public boolean f1663b = false;

        /* JADX INFO: renamed from: c */
        public long[] f1664c = {0, 300};

        public d(View view) {
            this.f1662a = view;
        }

        /* JADX INFO: renamed from: b */
        public boolean m2168b() {
            return this.f1663b;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m2169c() {
            C0107b.f1654e.remove(this.f1662a);
            this.f1663b = false;
        }

        /* JADX INFO: renamed from: d */
        public void m2170d() {
            this.f1663b = true;
            bt0.f(bt0.p(this.f1662a, "rotation", 0L, 300L, new AccelerateDecelerateInterpolator(), new float[]{0.0f, -15.0f, 0.0f, 15.0f, 0.0f}), new Runnable() { // from class: l.cyz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2872a.m2169c();
                }
            }).start();
            Vibrator vibrator = (Vibrator) this.f1662a.getContext().getSystemService("vibrator");
            if (NullChecker.a(vibrator)) {
                int i = Build.VERSION.SDK_INT;
                long[] jArr = this.f1664c;
                if (i >= 26) {
                    o96.a(vibrator, n17.a(jArr, -1));
                } else {
                    vibrator.vibrate(jArr, -1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m2147a(HashMap map, Message message) {
        if (TEnum.equals(message.messageType, "tickle") && message.isOtherUser()) {
            try {
                if (!TextUtils.isEmpty(message.msgData) && message.msgData.contains(CoreModule.H().userId())) {
                    if (map.containsKey(((DbObject) message).id)) {
                        return Boolean.FALSE;
                    }
                    boolean zEquals = TextUtils.equals(new JSONObject(message.msgData).optString("receiver", ""), CoreModule.H().userId());
                    String str = ((DbObject) message).id;
                    map.put(str, str);
                    return Boolean.valueOf(zEquals);
                }
                return Boolean.FALSE;
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: d */
    public static void m2150d() {
        f1650a = 0L;
        f1651b = null;
        f1653d = "";
    }

    /* JADX INFO: renamed from: e */
    public static void m2151e() {
        f1654e.clear();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2152f(String str) {
        if (mqi0.o() - f1650a < 30000 && TextUtils.equals(str, f1653d)) {
            return false;
        }
        f1650a = mqi0.o();
        f1653d = str;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static String m2153g(User user, ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2, String str) {
        String string;
        if (!NullChecker.a(user) || !NullChecker.a(chatGroupMember) || !NullChecker.a(chatGroupMember2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        User userById = CoreModule.K().getUserById(chatGroupMember.userId);
        User userById2 = CoreModule.K().getUserById(chatGroupMember2.userId);
        if (chatGroupMember.isMe()) {
            if (chatGroupMember2.isMe()) {
                Application application = CoreModule.b;
                string = application.getString(R.string.Y0, application.getString(R.string.a1));
            } else if (NullChecker.a(userById2) && userById2.isBanedOrInactivated()) {
                Application application2 = CoreModule.b;
                string = application2.getString(R.string.Z0, application2.getString(R.string.a1), userById2.publicId);
            } else {
                Application application3 = CoreModule.b;
                string = application3.getString(R.string.Z0, application3.getString(R.string.a1), chatGroupMember2.groupMemberName());
            }
        } else if (chatGroupMember2.isMe()) {
            if (NullChecker.a(userById) && userById.isBanedOrInactivated()) {
                Application application4 = CoreModule.b;
                string = application4.getString(R.string.W0, userById.publicId, application4.getString(R.string.a1));
            } else {
                string = CoreModule.b.getString(R.string.W0, chatGroupMember.groupMemberName(), CoreModule.b.getString(R.string.a1));
            }
        } else if (TextUtils.equals(chatGroupMember.userId, chatGroupMember2.userId)) {
            string = CoreModule.b.getString(user.isFemale() ? R.string.b1 : R.string.X0, chatGroupMember.groupMemberName(), CoreModule.b.getString(R.string.a1));
        } else if (NullChecker.a(userById) && userById.isBanedOrInactivated() && NullChecker.a(userById2) && userById2.isBanedOrInactivated()) {
            string = CoreModule.b.getString(R.string.L0, userById.publicId, userById2.publicId);
        } else if (NullChecker.a(userById) && userById.isBanedOrInactivated()) {
            string = CoreModule.b.getString(R.string.L0, userById.publicId, chatGroupMember2.groupMemberName());
        } else {
            string = (NullChecker.a(userById2) && userById2.isBanedOrInactivated()) ? CoreModule.b.getString(R.string.L0, chatGroupMember.groupMemberName(), userById2.publicId) : CoreModule.b.getString(R.string.L0, chatGroupMember.groupMemberName(), chatGroupMember2.groupMemberName());
        }
        sb.append(string);
        if (!TextUtils.isEmpty(str)) {
            sb.append(" ");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m2154h(Message message) {
        xaj0<String, String, String> xaj0VarM2161o = m2161o(message);
        return NullChecker.a(xaj0VarM2161o) ? m2155i(CoreModule.c.e0.Pa((String) xaj0VarM2161o.a), CoreModule.c.e0.Pa((String) xaj0VarM2161o.b), (String) xaj0VarM2161o.c) : "";
    }

    /* JADX INFO: renamed from: i */
    public static String m2155i(User user, User user2, String str) {
        String string;
        if (!NullChecker.a(user) || !NullChecker.a(user2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (user.isMe()) {
            if (user2.isMe()) {
                Application application = CoreModule.b;
                string = application.getString(R.string.Y0, application.getString(R.string.a1));
            } else {
                Application application2 = CoreModule.b;
                string = application2.getString(R.string.Z0, application2.getString(R.string.a1), m2156j(user2));
            }
        } else if (user2.isMe()) {
            string = CoreModule.b.getString(R.string.W0, m2156j(user), CoreModule.b.getString(R.string.a1));
        } else {
            string = CoreModule.b.getString(user.isFemale() ? R.string.b1 : R.string.X0, m2156j(user), CoreModule.b.getString(R.string.a1));
        }
        sb.append(string);
        if (!TextUtils.isEmpty(str)) {
            sb.append(" ");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m2156j(User user) {
        String str = user.name;
        if (ura.e().d().l()) {
            String strY7 = CoreModule.c.e0.y7(((DbObject) user).id);
            if (!TextUtils.isEmpty(strY7)) {
                return strY7;
            }
            if (CoreModule.P().i().De() && TextUtils.isEmpty(strY7) && (!NullChecker.a(user) || user.inactivated)) {
                return "ta";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static String m2157k(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("actor", str);
            jSONObject.put("receiver", str2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2158l(Conversation conversation, List<Message> list, int i, final HashMap<String, String> map) {
        if (vwb.J(list) || !NullChecker.a(conversation)) {
            return false;
        }
        if (ura.e().d().E() && conversation.read.booleanValue()) {
            return false;
        }
        Message message = (Message) vwb.v(list, new w9j() { // from class: l.byz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return C0107b.m2147a(map, (Message) obj);
            }
        }, i);
        long j = Long.MAX_VALUE;
        long j2 = Long.MIN_VALUE;
        try {
            j = !TextUtils.isEmpty(conversation.readUntil) ? Long.parseLong(conversation.readUntil) : 0L;
            if (NullChecker.a(message)) {
                j2 = Long.parseLong(((DbObject) message).id);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return j < j2;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2159m(Conversation conversation) {
        if (NullChecker.a(conversation)) {
            return TextUtils.equals(conversation.convType, "group");
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m2160n(View view, c cVar) {
        User userPa;
        if (User.isTeamAccount(cVar.mo1507b())) {
            return;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(cVar.mo1507b());
        if (CoreModule.P().i().De()) {
            userPa = CoreModule.c.e0.Pa(conversationXe.otherUser);
            if (!NullChecker.a(userPa) || userPa.inactivated) {
                lsi0.j("对方已注销");
                return;
            } else if (userPa.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                lsi0.j("对方账号异常");
                return;
            }
        } else {
            userPa = null;
        }
        if (conversationXe == null || TEnum.equals(conversationXe.status, "dismissed")) {
            return;
        }
        if (userPa == null) {
            userPa = CoreModule.c.e0.Pa(conversationXe.otherUser);
        }
        if (qib0.b0.d.Kk(userPa) || conversationXe.mutedByFriend()) {
            return;
        }
        if (ura.e().d().E() && m2159m(conversationXe)) {
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(conversationXe.otherUser);
            if (NullChecker.a(chatGroupS6) && NullChecker.a(chatGroupS6.punishment) && NullChecker.a(chatGroupS6.punishment.sendMessage)) {
                ChatSendMessage chatSendMessage = chatGroupS6.punishment.sendMessage;
                if (chatSendMessage.active && mqi0.o() < chatSendMessage.until) {
                    return;
                }
            }
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9.state) && NullChecker.a(userP9.state.jailedBusiness) && NullChecker.a(userP9.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = userP9.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active && jailedGroupChat.expireTime > mqi0.o()) {
                    return;
                }
            }
            ChatGroupMember chatGroupMemberW8 = CoreModule.c.g0.W8(conversationXe.otherUser, CoreModule.H().userId());
            if (NullChecker.a(chatGroupMemberW8) && NullChecker.a(chatGroupMemberW8.silence)) {
                ChatGroupSilence chatGroupSilence = chatGroupMemberW8.silence;
                if (chatGroupSilence.enable && mqi0.o() < chatGroupSilence.until) {
                    return;
                }
            }
        }
        if (!m2159m(conversationXe)) {
            User userPa2 = CoreModule.c.e0.Pa(cVar.mo1507b());
            if (NullChecker.a(userPa2) && userPa2.unilateralBlock()) {
                return;
            }
        }
        o6j0.c("e_tickle", "p_chat_view", new o6j0.a[]{o6j0.a.h("moments_user_id", cVar.mo1506a())});
        m2162p(view);
        if (m2152f(cVar.mo1506a())) {
            CoreModule.c.b1.j3();
            CoreModule.c.f0.Bp(cVar.mo1507b(), CoreModule.H().userId(), cVar.mo1506a());
        }
    }

    /* JADX INFO: renamed from: o */
    public static xaj0<String, String, String> m2161o(Message message) {
        if (!NullChecker.a(message) || !TEnum.equals(message.messageType, "tickle") || TextUtils.isEmpty(message.msgData)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(message.msgData);
            return xaj0.a(message.owner, jSONObject.optString("receiver", ""), jSONObject.optString("receiverSuffix", ""));
        } catch (JSONException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m2162p(View view) {
        d dVar = f1654e.get(view);
        if (!NullChecker.a(dVar)) {
            dVar = new d(view);
            f1654e.put(view, dVar);
        } else if (dVar.m2168b()) {
            return;
        }
        dVar.m2170d();
    }

    /* JADX INFO: renamed from: q */
    public static void m2163q(Message message) {
        if (!NullChecker.a(message) || message.isLocal()) {
            return;
        }
        if (!TextUtils.isEmpty(f1651b) && !TextUtils.equals(f1651b, ((DbObject) message).id)) {
            if (message.isMe() && TEnum.equals(message.messageType, "tickle")) {
                f1650a = mqi0.o();
            } else {
                f1650a = 0L;
            }
        }
        f1651b = ((DbObject) message).id;
    }

    /* JADX INFO: renamed from: r */
    public static void m2164r(View view, c cVar, View.OnClickListener onClickListener) {
        m2166t(view, cVar, onClickListener, null);
    }

    /* JADX INFO: renamed from: s */
    public static void m2165s(View view, c cVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Runnable runnable) {
        a aVar = new a(view, onLongClickListener, onClickListener, runnable, cVar);
        tjj tjjVar = new tjj(view.getContext(), aVar);
        tjjVar.m7756c(aVar);
        tjjVar.m7755b(NullChecker.a(onLongClickListener));
        view.setOnTouchListener(new b(cVar, tjjVar));
    }

    /* JADX INFO: renamed from: t */
    public static void m2166t(View view, c cVar, View.OnClickListener onClickListener, Runnable runnable) {
        m2165s(view, cVar, onClickListener, null, runnable);
    }
}
