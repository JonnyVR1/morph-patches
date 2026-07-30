package com.p046p1.mobile.putong.core.p053ui.messages;

import android.app.Application;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupSilence;
import com.p046p1.mobile.putong.core.data.ChatSendMessage;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.JailedGroupChat;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.bt0;
import p149l.lsi0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.tjj;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8524b {

    /* JADX INFO: renamed from: a */
    public static long f31759a = 0;

    /* JADX INFO: renamed from: b */
    public static String f31760b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f31761c = true;

    /* JADX INFO: renamed from: d */
    public static String f31762d = "";

    /* JADX INFO: renamed from: e */
    public static Map<View, d> f31763e = new HashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$a */
    public class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f31764a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnLongClickListener f31765b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View.OnClickListener f31766c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f31767d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ c f31768e;

        public a(View view, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener, Runnable runnable, c cVar) {
            this.f31764a = view;
            this.f31765b = onLongClickListener;
            this.f31766c = onClickListener;
            this.f31767d = runnable;
            this.f31768e = cVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (NullChecker.m81303a(this.f31767d)) {
                this.f31767d.run();
            }
            C8524b.m49062n(this.f31764a, this.f31768e);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            this.f31764a.setPressed(false);
            if (NullChecker.m81303a(this.f31765b)) {
                this.f31765b.onLongClick(this.f31764a);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            super.onShowPress(motionEvent);
            this.f31764a.setPressed(true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!NullChecker.m81303a(this.f31766c)) {
                return true;
            }
            this.f31766c.onClick(this.f31764a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f31769a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tjj f31770b;

        public b(c cVar, tjj tjjVar) {
            this.f31769a = cVar;
            this.f31770b = tjjVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!this.f31769a.mo48424c()) {
                return false;
            }
            this.f31770b.m189334a(motionEvent);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        String mo48422a();

        /* JADX INFO: renamed from: b */
        String mo48423b();

        /* JADX INFO: renamed from: c */
        boolean mo48424c();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public View f31771a;

        /* JADX INFO: renamed from: b */
        public boolean f31772b = false;

        /* JADX INFO: renamed from: c */
        public long[] f31773c = {0, 300};

        public d(View view) {
            this.f31771a = view;
        }

        /* JADX INFO: renamed from: b */
        public boolean m49070b() {
            return this.f31772b;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m49071c() {
            C8524b.f31763e.remove(this.f31771a);
            this.f31772b = false;
        }

        /* JADX INFO: renamed from: d */
        public void m49072d() {
            this.f31772b = true;
            bt0.m103733f(bt0.m103743p(this.f31771a, BLiveGiftItem.TYPE_ROTATION, 0L, 300L, new AccelerateDecelerateInterpolator(), 0.0f, -15.0f, 0.0f, 15.0f, 0.0f), new Runnable() { // from class: l.cyz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83050a.m49071c();
                }
            }).start();
            Vibrator vibrator = (Vibrator) this.f31771a.getContext().getSystemService("vibrator");
            if (NullChecker.m81303a(vibrator)) {
                int i = Build.VERSION.SDK_INT;
                long[] jArr = this.f31773c;
                if (i >= 26) {
                    vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
                } else {
                    vibrator.vibrate(jArr, -1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m49049a(HashMap map, Message message) {
        if (TEnum.equals(message.messageType, "tickle") && message.isOtherUser()) {
            try {
                if (!TextUtils.isEmpty(message.msgData) && message.msgData.contains(CoreModule.m29931H().userId())) {
                    if (map.containsKey(message.f56011id)) {
                        return Boolean.FALSE;
                    }
                    boolean zEquals = TextUtils.equals(new JSONObject(message.msgData).optString("receiver", ""), CoreModule.m29931H().userId());
                    String str = message.f56011id;
                    map.put(str, str);
                    return Boolean.valueOf(zEquals);
                }
                return Boolean.FALSE;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: d */
    public static void m49052d() {
        f31759a = 0L;
        f31760b = null;
        f31762d = "";
    }

    /* JADX INFO: renamed from: e */
    public static void m49053e() {
        f31763e.clear();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m49054f(String str) {
        if (mqi0.m155944o() - f31759a < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT && TextUtils.equals(str, f31762d)) {
            return false;
        }
        f31759a = mqi0.m155944o();
        f31762d = str;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static String m49055g(User user, ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2, String str) {
        String string;
        if (!NullChecker.m81303a(user) || !NullChecker.m81303a(chatGroupMember) || !NullChecker.m81303a(chatGroupMember2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        User userById = CoreModule.m29932K().getUserById(chatGroupMember.userId);
        User userById2 = CoreModule.m29932K().getUserById(chatGroupMember2.userId);
        if (chatGroupMember.isMe()) {
            if (chatGroupMember2.isMe()) {
                Application application = CoreModule.f17544b;
                string = application.getString(R$string.f20901Y0, application.getString(R$string.f20918a1));
            } else if (NullChecker.m81303a(userById2) && userById2.isBanedOrInactivated()) {
                Application application2 = CoreModule.f17544b;
                string = application2.getString(R$string.f20909Z0, application2.getString(R$string.f20918a1), userById2.publicId);
            } else {
                Application application3 = CoreModule.f17544b;
                string = application3.getString(R$string.f20909Z0, application3.getString(R$string.f20918a1), chatGroupMember2.groupMemberName());
            }
        } else if (chatGroupMember2.isMe()) {
            if (NullChecker.m81303a(userById) && userById.isBanedOrInactivated()) {
                Application application4 = CoreModule.f17544b;
                string = application4.getString(R$string.f20885W0, userById.publicId, application4.getString(R$string.f20918a1));
            } else {
                string = CoreModule.f17544b.getString(R$string.f20885W0, chatGroupMember.groupMemberName(), CoreModule.f17544b.getString(R$string.f20918a1));
            }
        } else if (TextUtils.equals(chatGroupMember.userId, chatGroupMember2.userId)) {
            string = CoreModule.f17544b.getString(user.isFemale() ? R$string.f20927b1 : R$string.f20893X0, chatGroupMember.groupMemberName(), CoreModule.f17544b.getString(R$string.f20918a1));
        } else if (NullChecker.m81303a(userById) && userById.isBanedOrInactivated() && NullChecker.m81303a(userById2) && userById2.isBanedOrInactivated()) {
            string = CoreModule.f17544b.getString(R$string.f20797L0, userById.publicId, userById2.publicId);
        } else if (NullChecker.m81303a(userById) && userById.isBanedOrInactivated()) {
            string = CoreModule.f17544b.getString(R$string.f20797L0, userById.publicId, chatGroupMember2.groupMemberName());
        } else {
            string = (NullChecker.m81303a(userById2) && userById2.isBanedOrInactivated()) ? CoreModule.f17544b.getString(R$string.f20797L0, chatGroupMember.groupMemberName(), userById2.publicId) : CoreModule.f17544b.getString(R$string.f20797L0, chatGroupMember.groupMemberName(), chatGroupMember2.groupMemberName());
        }
        sb.append(string);
        if (!TextUtils.isEmpty(str)) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m49056h(Message message) {
        xaj0<String, String, String> xaj0VarM49063o = m49063o(message);
        return NullChecker.m81303a(xaj0VarM49063o) ? m49057i(CoreModule.f17545c.f19639e0.m169430Pa(xaj0VarM49063o.f191751a), CoreModule.f17545c.f19639e0.m169430Pa(xaj0VarM49063o.f191752b), xaj0VarM49063o.f191753c) : "";
    }

    /* JADX INFO: renamed from: i */
    public static String m49057i(User user, User user2, String str) {
        String string;
        if (!NullChecker.m81303a(user) || !NullChecker.m81303a(user2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (user.isMe()) {
            if (user2.isMe()) {
                Application application = CoreModule.f17544b;
                string = application.getString(R$string.f20901Y0, application.getString(R$string.f20918a1));
            } else {
                Application application2 = CoreModule.f17544b;
                string = application2.getString(R$string.f20909Z0, application2.getString(R$string.f20918a1), m49058j(user2));
            }
        } else if (user2.isMe()) {
            string = CoreModule.f17544b.getString(R$string.f20885W0, m49058j(user), CoreModule.f17544b.getString(R$string.f20918a1));
        } else {
            string = CoreModule.f17544b.getString(user.isFemale() ? R$string.f20927b1 : R$string.f20893X0, m49058j(user), CoreModule.f17544b.getString(R$string.f20918a1));
        }
        sb.append(string);
        if (!TextUtils.isEmpty(str)) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m49058j(User user) {
        String str = user.name;
        if (ura.m195053e().m195057d().mo33875l()) {
            String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
            if (!TextUtils.isEmpty(strM169561y7)) {
                return strM169561y7;
            }
            if (CoreModule.m29935P().m94658i().mo33304De() && TextUtils.isEmpty(strM169561y7) && (!NullChecker.m81303a(user) || user.inactivated)) {
                return "ta";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static String m49059k(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Careers.actor, str);
            jSONObject.put("receiver", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m49060l(Conversation conversation, List<Message> list, int i, final HashMap<String, String> map) {
        if (vwb.m200296J(list) || !NullChecker.m81303a(conversation)) {
            return false;
        }
        if (ura.m195053e().m195057d().mo33676E() && conversation.read.booleanValue()) {
            return false;
        }
        Message message = (Message) vwb.m200350v(list, new w9j() { // from class: l.byz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8524b.m49049a(map, (Message) obj);
            }
        }, i);
        long j = Long.MAX_VALUE;
        long j2 = Long.MIN_VALUE;
        try {
            j = !TextUtils.isEmpty(conversation.readUntil) ? Long.parseLong(conversation.readUntil) : 0L;
            if (NullChecker.m81303a(message)) {
                j2 = Long.parseLong(message.f56011id);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return j < j2;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m49061m(Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            return TextUtils.equals(conversation.convType, "group");
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m49062n(View view, c cVar) {
        User userM169430Pa;
        if (User.isTeamAccount(cVar.mo48423b())) {
            return;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(cVar.mo48423b());
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversationM32856Xe.otherUser);
            if (!NullChecker.m81303a(userM169430Pa) || userM169430Pa.inactivated) {
                lsi0.m151580j("对方已注销");
                return;
            } else if (userM169430Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                lsi0.m151580j("对方账号异常");
                return;
            }
        } else {
            userM169430Pa = null;
        }
        if (conversationM32856Xe == null || TEnum.equals(conversationM32856Xe.status, "dismissed")) {
            return;
        }
        if (userM169430Pa == null) {
            userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversationM32856Xe.otherUser);
        }
        if (qib0.f154713b0.f139233d.mo60288Kk(userM169430Pa) || conversationM32856Xe.mutedByFriend()) {
            return;
        }
        if (ura.m195053e().m195057d().mo33676E() && m49061m(conversationM32856Xe)) {
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(conversationM32856Xe.otherUser);
            if (NullChecker.m81303a(chatGroupM31920s6) && NullChecker.m81303a(chatGroupM31920s6.punishment) && NullChecker.m81303a(chatGroupM31920s6.punishment.sendMessage)) {
                ChatSendMessage chatSendMessage = chatGroupM31920s6.punishment.sendMessage;
                if (chatSendMessage.active && mqi0.m155944o() < chatSendMessage.until) {
                    return;
                }
            }
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9.state) && NullChecker.m81303a(userM169527p9.state.jailedBusiness) && NullChecker.m81303a(userM169527p9.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = userM169527p9.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active && jailedGroupChat.expireTime > mqi0.m155944o()) {
                    return;
                }
            }
            ChatGroupMember chatGroupMemberM31855W8 = CoreModule.f17545c.f19645g0.m31855W8(conversationM32856Xe.otherUser, CoreModule.m29931H().userId());
            if (NullChecker.m81303a(chatGroupMemberM31855W8) && NullChecker.m81303a(chatGroupMemberM31855W8.silence)) {
                ChatGroupSilence chatGroupSilence = chatGroupMemberM31855W8.silence;
                if (chatGroupSilence.enable && mqi0.m155944o() < chatGroupSilence.until) {
                    return;
                }
            }
        }
        if (!m49061m(conversationM32856Xe)) {
            User userM169430Pa2 = CoreModule.f17545c.f19639e0.m169430Pa(cVar.mo48423b());
            if (NullChecker.m81303a(userM169430Pa2) && userM169430Pa2.unilateralBlock()) {
                return;
            }
        }
        o6j0.m162859c("e_tickle", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("moments_user_id", cVar.mo48422a()));
        m49064p(view);
        if (m49054f(cVar.mo48422a())) {
            CoreModule.f17545c.f19631b1.m145040j3();
            CoreModule.f17545c.f19642f0.m32599Bp(cVar.mo48423b(), CoreModule.m29931H().userId(), cVar.mo48422a());
        }
    }

    /* JADX INFO: renamed from: o */
    public static xaj0<String, String, String> m49063o(Message message) {
        if (!NullChecker.m81303a(message) || !TEnum.equals(message.messageType, "tickle") || TextUtils.isEmpty(message.msgData)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(message.msgData);
            return xaj0.m207578a(message.owner, jSONObject.optString("receiver", ""), jSONObject.optString("receiverSuffix", ""));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m49064p(View view) {
        d dVar = f31763e.get(view);
        if (!NullChecker.m81303a(dVar)) {
            dVar = new d(view);
            f31763e.put(view, dVar);
        } else if (dVar.m49070b()) {
            return;
        }
        dVar.m49072d();
    }

    /* JADX INFO: renamed from: q */
    public static void m49065q(Message message) {
        if (!NullChecker.m81303a(message) || message.isLocal()) {
            return;
        }
        if (!TextUtils.isEmpty(f31760b) && !TextUtils.equals(f31760b, message.f56011id)) {
            if (message.isMe() && TEnum.equals(message.messageType, "tickle")) {
                f31759a = mqi0.m155944o();
            } else {
                f31759a = 0L;
            }
        }
        f31760b = message.f56011id;
    }

    /* JADX INFO: renamed from: r */
    public static void m49066r(View view, c cVar, View.OnClickListener onClickListener) {
        m49068t(view, cVar, onClickListener, null);
    }

    /* JADX INFO: renamed from: s */
    public static void m49067s(View view, c cVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Runnable runnable) {
        a aVar = new a(view, onLongClickListener, onClickListener, runnable, cVar);
        tjj tjjVar = new tjj(view.getContext(), aVar);
        tjjVar.m189336c(aVar);
        tjjVar.m189335b(NullChecker.m81303a(onLongClickListener));
        view.setOnTouchListener(new b(cVar, tjjVar));
    }

    /* JADX INFO: renamed from: t */
    public static void m49068t(View view, c cVar, View.OnClickListener onClickListener, Runnable runnable) {
        m49067s(view, cVar, onClickListener, null, runnable);
    }
}
