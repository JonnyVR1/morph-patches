package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupSilence;
import com.p051p1.mobile.putong.core.data.ChatSendMessage;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.JailedGroupChat;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bkj0;
import p153l.gt0;
import p153l.gta;
import p153l.jyb;
import p153l.mmj;
import p153l.o1j0;
import p153l.pzi0;
import p153l.qcj;
import p153l.sfj0;
import p153l.uqb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8687b {

    /* JADX INFO: renamed from: a */
    public static long f32607a = 0;

    /* JADX INFO: renamed from: b */
    public static String f32608b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f32609c = true;

    /* JADX INFO: renamed from: d */
    public static String f32610d = "";

    /* JADX INFO: renamed from: e */
    public static Map<View, d> f32611e = new HashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$a */
    public class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f32612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnLongClickListener f32613b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View.OnClickListener f32614c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f32615d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ c f32616e;

        public a(View view, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener, Runnable runnable, c cVar) {
            this.f32612a = view;
            this.f32613b = onLongClickListener;
            this.f32614c = onClickListener;
            this.f32615d = runnable;
            this.f32616e = cVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (NullChecker.m82486a(this.f32615d)) {
                this.f32615d.run();
            }
            C8687b.m50245n(this.f32612a, this.f32616e);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            this.f32612a.setPressed(false);
            if (NullChecker.m82486a(this.f32613b)) {
                this.f32613b.onLongClick(this.f32612a);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            super.onShowPress(motionEvent);
            this.f32612a.setPressed(true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!NullChecker.m82486a(this.f32614c)) {
                return true;
            }
            this.f32614c.onClick(this.f32612a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f32617a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mmj f32618b;

        public b(c cVar, mmj mmjVar) {
            this.f32617a = cVar;
            this.f32618b = mmjVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!this.f32617a.mo49607c()) {
                return false;
            }
            this.f32618b.m159061a(motionEvent);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        String mo49605a();

        /* JADX INFO: renamed from: b */
        String mo49606b();

        /* JADX INFO: renamed from: c */
        boolean mo49607c();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public View f32619a;

        /* JADX INFO: renamed from: b */
        public boolean f32620b = false;

        /* JADX INFO: renamed from: c */
        public long[] f32621c = {0, 300};

        public d(View view) {
            this.f32619a = view;
        }

        /* JADX INFO: renamed from: b */
        public boolean m50253b() {
            return this.f32620b;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m50254c() {
            C8687b.f32611e.remove(this.f32619a);
            this.f32620b = false;
        }

        /* JADX INFO: renamed from: d */
        public void m50255d() {
            this.f32620b = true;
            gt0.m132160f(gt0.m132170p(this.f32619a, BLiveGiftItem.TYPE_ROTATION, 0L, 300L, new AccelerateDecelerateInterpolator(), 0.0f, -15.0f, 0.0f, 15.0f, 0.0f), new Runnable() { // from class: l.z600
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203098a.m50254c();
                }
            }).start();
            Vibrator vibrator = (Vibrator) this.f32619a.getContext().getSystemService("vibrator");
            if (NullChecker.m82486a(vibrator)) {
                int i = Build.VERSION.SDK_INT;
                long[] jArr = this.f32621c;
                if (i >= 26) {
                    vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
                } else {
                    vibrator.vibrate(jArr, -1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m50232a(HashMap map, Message message) {
        if (TEnum.equals(message.messageType, "tickle") && message.isOtherUser()) {
            try {
                if (!TextUtils.isEmpty(message.msgData) && message.msgData.contains(CoreModule.m30929H().userId())) {
                    if (map.containsKey(message.f56859id)) {
                        return Boolean.FALSE;
                    }
                    boolean zEquals = TextUtils.equals(new JSONObject(message.msgData).optString("receiver", ""), CoreModule.m30929H().userId());
                    String str = message.f56859id;
                    map.put(str, str);
                    return Boolean.valueOf(zEquals);
                }
                return Boolean.FALSE;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: d */
    public static void m50235d() {
        f32607a = 0L;
        f32608b = null;
        f32610d = "";
    }

    /* JADX INFO: renamed from: e */
    public static void m50236e() {
        f32611e.clear();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m50237f(String str) {
        if (pzi0.m174454o() - f32607a < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT && TextUtils.equals(str, f32610d)) {
            return false;
        }
        f32607a = pzi0.m174454o();
        f32610d = str;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static String m50238g(User user, ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2, String str) {
        String string;
        if (!NullChecker.m82486a(user) || !NullChecker.m82486a(chatGroupMember) || !NullChecker.m82486a(chatGroupMember2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        User userById = CoreModule.m30930K().getUserById(chatGroupMember.userId);
        User userById2 = CoreModule.m30930K().getUserById(chatGroupMember2.userId);
        if (chatGroupMember.isMe()) {
            if (chatGroupMember2.isMe()) {
                Application application = CoreModule.f18263b;
                string = application.getString(R$string.f21643Y0, application.getString(R$string.f21660a1));
            } else if (NullChecker.m82486a(userById2) && userById2.isBanedOrInactivated()) {
                Application application2 = CoreModule.f18263b;
                string = application2.getString(R$string.f21651Z0, application2.getString(R$string.f21660a1), userById2.publicId);
            } else {
                Application application3 = CoreModule.f18263b;
                string = application3.getString(R$string.f21651Z0, application3.getString(R$string.f21660a1), chatGroupMember2.groupMemberName());
            }
        } else if (chatGroupMember2.isMe()) {
            if (NullChecker.m82486a(userById) && userById.isBanedOrInactivated()) {
                Application application4 = CoreModule.f18263b;
                string = application4.getString(R$string.f21627W0, userById.publicId, application4.getString(R$string.f21660a1));
            } else {
                string = CoreModule.f18263b.getString(R$string.f21627W0, chatGroupMember.groupMemberName(), CoreModule.f18263b.getString(R$string.f21660a1));
            }
        } else if (TextUtils.equals(chatGroupMember.userId, chatGroupMember2.userId)) {
            string = CoreModule.f18263b.getString(user.isFemale() ? R$string.f21669b1 : R$string.f21635X0, chatGroupMember.groupMemberName(), CoreModule.f18263b.getString(R$string.f21660a1));
        } else if (NullChecker.m82486a(userById) && userById.isBanedOrInactivated() && NullChecker.m82486a(userById2) && userById2.isBanedOrInactivated()) {
            string = CoreModule.f18263b.getString(R$string.f21539L0, userById.publicId, userById2.publicId);
        } else if (NullChecker.m82486a(userById) && userById.isBanedOrInactivated()) {
            string = CoreModule.f18263b.getString(R$string.f21539L0, userById.publicId, chatGroupMember2.groupMemberName());
        } else {
            string = (NullChecker.m82486a(userById2) && userById2.isBanedOrInactivated()) ? CoreModule.f18263b.getString(R$string.f21539L0, chatGroupMember.groupMemberName(), userById2.publicId) : CoreModule.f18263b.getString(R$string.f21539L0, chatGroupMember.groupMemberName(), chatGroupMember2.groupMemberName());
        }
        sb.append(string);
        if (!TextUtils.isEmpty(str)) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m50239h(Message message) {
        bkj0<String, String, String> bkj0VarM50246o = m50246o(message);
        return NullChecker.m82486a(bkj0VarM50246o) ? m50240i(CoreModule.f18264c.f20381e0.m116503Pa(bkj0VarM50246o.f77081a), CoreModule.f18264c.f20381e0.m116503Pa(bkj0VarM50246o.f77082b), bkj0VarM50246o.f77083c) : "";
    }

    /* JADX INFO: renamed from: i */
    public static String m50240i(User user, User user2, String str) {
        String string;
        if (!NullChecker.m82486a(user) || !NullChecker.m82486a(user2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (user.isMe()) {
            if (user2.isMe()) {
                Application application = CoreModule.f18263b;
                string = application.getString(R$string.f21643Y0, application.getString(R$string.f21660a1));
            } else {
                Application application2 = CoreModule.f18263b;
                string = application2.getString(R$string.f21651Z0, application2.getString(R$string.f21660a1), m50241j(user2));
            }
        } else if (user2.isMe()) {
            string = CoreModule.f18263b.getString(R$string.f21627W0, m50241j(user), CoreModule.f18263b.getString(R$string.f21660a1));
        } else {
            string = CoreModule.f18263b.getString(user.isFemale() ? R$string.f21669b1 : R$string.f21635X0, m50241j(user), CoreModule.f18263b.getString(R$string.f21660a1));
        }
        sb.append(string);
        if (!TextUtils.isEmpty(str)) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m50241j(User user) {
        String str = user.name;
        if (gta.m132210e().m132214d().mo34878l()) {
            String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
            if (!TextUtils.isEmpty(strM116634y7)) {
                return strM116634y7;
            }
            if (CoreModule.m30933P().m143412i().mo34307De() && TextUtils.isEmpty(strM116634y7) && (!NullChecker.m82486a(user) || user.inactivated)) {
                return "ta";
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static String m50242k(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Careers.actor, str);
            jSONObject.put("receiver", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m50243l(Conversation conversation, List<Message> list, int i, final HashMap<String, String> map) {
        if (jyb.m147479J(list) || !NullChecker.m82486a(conversation)) {
            return false;
        }
        if (gta.m132210e().m132214d().mo34679E() && conversation.read.booleanValue()) {
            return false;
        }
        Message message = (Message) jyb.m147533v(list, new qcj() { // from class: l.y600
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8687b.m50232a(map, (Message) obj);
            }
        }, i);
        long j = Long.MAX_VALUE;
        long j2 = Long.MIN_VALUE;
        try {
            j = !TextUtils.isEmpty(conversation.readUntil) ? Long.parseLong(conversation.readUntil) : 0L;
            if (NullChecker.m82486a(message)) {
                j2 = Long.parseLong(message.f56859id);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return j < j2;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m50244m(Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            return TextUtils.equals(conversation.convType, "group");
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m50245n(View view, c cVar) {
        User userM116503Pa;
        if (User.isTeamAccount(cVar.mo49606b())) {
            return;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(cVar.mo49606b());
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversationM33859Xe.otherUser);
            if (!NullChecker.m82486a(userM116503Pa) || userM116503Pa.inactivated) {
                o1j0.m165636j("对方已注销");
                return;
            } else if (userM116503Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                o1j0.m165636j("对方账号异常");
                return;
            }
        } else {
            userM116503Pa = null;
        }
        if (conversationM33859Xe == null || TEnum.equals(conversationM33859Xe.status, "dismissed")) {
            return;
        }
        if (userM116503Pa == null) {
            userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversationM33859Xe.otherUser);
        }
        if (uqb0.f180396b0.f170327d.mo61472Kk(userM116503Pa) || conversationM33859Xe.mutedByFriend()) {
            return;
        }
        if (gta.m132210e().m132214d().mo34679E() && m50244m(conversationM33859Xe)) {
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(conversationM33859Xe.otherUser);
            if (NullChecker.m82486a(chatGroupM32923s6) && NullChecker.m82486a(chatGroupM32923s6.punishment) && NullChecker.m82486a(chatGroupM32923s6.punishment.sendMessage)) {
                ChatSendMessage chatSendMessage = chatGroupM32923s6.punishment.sendMessage;
                if (chatSendMessage.active && pzi0.m174454o() < chatSendMessage.until) {
                    return;
                }
            }
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9.state) && NullChecker.m82486a(userM116600p9.state.jailedBusiness) && NullChecker.m82486a(userM116600p9.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = userM116600p9.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active && jailedGroupChat.expireTime > pzi0.m174454o()) {
                    return;
                }
            }
            ChatGroupMember chatGroupMemberM32858W8 = CoreModule.f18264c.f20387g0.m32858W8(conversationM33859Xe.otherUser, CoreModule.m30929H().userId());
            if (NullChecker.m82486a(chatGroupMemberM32858W8) && NullChecker.m82486a(chatGroupMemberM32858W8.silence)) {
                ChatGroupSilence chatGroupSilence = chatGroupMemberM32858W8.silence;
                if (chatGroupSilence.enable && pzi0.m174454o() < chatGroupSilence.until) {
                    return;
                }
            }
        }
        if (!m50244m(conversationM33859Xe)) {
            User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(cVar.mo49606b());
            if (NullChecker.m82486a(userM116503Pa2) && userM116503Pa2.unilateralBlock()) {
                return;
            }
        }
        sfj0.m185596c("e_tickle", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("moments_user_id", cVar.mo49605a()));
        m50247p(view);
        if (m50237f(cVar.mo49605a())) {
            CoreModule.f18264c.f20373b1.m209843j3();
            CoreModule.f18264c.f20384f0.m33602Bp(cVar.mo49606b(), CoreModule.m30929H().userId(), cVar.mo49605a());
        }
    }

    /* JADX INFO: renamed from: o */
    public static bkj0<String, String, String> m50246o(Message message) {
        if (!NullChecker.m82486a(message) || !TEnum.equals(message.messageType, "tickle") || TextUtils.isEmpty(message.msgData)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(message.msgData);
            return bkj0.m104818a(message.owner, jSONObject.optString("receiver", ""), jSONObject.optString("receiverSuffix", ""));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m50247p(View view) {
        d dVar = f32611e.get(view);
        if (!NullChecker.m82486a(dVar)) {
            dVar = new d(view);
            f32611e.put(view, dVar);
        } else if (dVar.m50253b()) {
            return;
        }
        dVar.m50255d();
    }

    /* JADX INFO: renamed from: q */
    public static void m50248q(Message message) {
        if (!NullChecker.m82486a(message) || message.isLocal()) {
            return;
        }
        if (!TextUtils.isEmpty(f32608b) && !TextUtils.equals(f32608b, message.f56859id)) {
            if (message.isMe() && TEnum.equals(message.messageType, "tickle")) {
                f32607a = pzi0.m174454o();
            } else {
                f32607a = 0L;
            }
        }
        f32608b = message.f56859id;
    }

    /* JADX INFO: renamed from: r */
    public static void m50249r(View view, c cVar, View.OnClickListener onClickListener) {
        m50251t(view, cVar, onClickListener, null);
    }

    /* JADX INFO: renamed from: s */
    public static void m50250s(View view, c cVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Runnable runnable) {
        a aVar = new a(view, onLongClickListener, onClickListener, runnable, cVar);
        mmj mmjVar = new mmj(view.getContext(), aVar);
        mmjVar.m159063c(aVar);
        mmjVar.m159062b(NullChecker.m82486a(onLongClickListener));
        view.setOnTouchListener(new b(cVar, mmjVar));
    }

    /* JADX INFO: renamed from: t */
    public static void m50251t(View view, c cVar, View.OnClickListener onClickListener, Runnable runnable) {
        m50250s(view, cVar, onClickListener, null, runnable);
    }
}
