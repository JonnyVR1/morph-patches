package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupNotificationAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Anonymity;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class jek {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f120505a = new m8c("yyyy年MM月dd日", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: b */
    public static Map<String, Long> f120506b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static Set<String> f120507c = new HashSet();

    /* JADX INFO: renamed from: d */
    public static String f120508d = "local_group_topic_id_";

    /* JADX INFO: renamed from: l.jek$a */
    public static class C17933a implements Comparator<ChatGroupMember> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2) {
            String upperCase = uxk.m198498c().m198501d(!TextUtils.isEmpty(chatGroupMember.nickName) ? chatGroupMember.nickName : chatGroupMember.userName).toUpperCase();
            String upperCase2 = uxk.m198498c().m198501d(!TextUtils.isEmpty(chatGroupMember2.nickName) ? chatGroupMember2.nickName : chatGroupMember2.userName).toUpperCase();
            if (upperCase.equals("@") || upperCase2.equals("#")) {
                return -1;
            }
            if (upperCase.equals("#") || upperCase2.equals("@")) {
                return 1;
            }
            return upperCase.compareTo(upperCase2);
        }
    }

    /* JADX INFO: renamed from: l.jek$b */
    public interface InterfaceC17934b {
        /* JADX INFO: renamed from: a */
        void mo104349a(ChatGroupMember chatGroupMember, List<ChatGroupMember> list, List<ChatGroupMember> list2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m144569a(Act act, Conversation conversation) {
        if (conversation == null || !TEnum.equals(ConversationStatus.get("default"), conversation.status)) {
            return;
        }
        act.startActivity(MessagesAct.m50126k2(act, conversation.f56859id, false, false));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m144572d(Throwable th) {
        if (!NullChecker.m82486a(th) || !(th instanceof TantanException.Client.TantanForbidden)) {
            o1j0.m165649w(R$string.f21461B2);
            return;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.code != 40399) {
            o1j0.m165649w(R$string.f21461B2);
            return;
        }
        String str = tantanForbidden.message;
        if (tantanForbidden.hasHandle || TextUtils.isEmpty(str)) {
            return;
        }
        o1j0.m165651y(str);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m144573e(Context context, String str, String str2) {
        return m144574f(context, str, str2, RelationshipStatus.get("unknown_"), 273);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m144574f(Context context, String str, String str2, RelationshipStatus relationshipStatus, int i) {
        return CoreModule.m30930K().startProfileAct(context, str, str2, false, false, false, relationshipStatus, i, false, true, false);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m144575g(Context context) {
        if (h39.m133423L()) {
            String strM173531j = prp0.m173528i().m173531j(context, "Group_groupNotify");
            if (!TextUtils.isEmpty(strM173531j)) {
                return WebViewAct.m81348b2(context, "", strM173531j, true);
            }
        }
        return (NullChecker.m82486a(CoreModule.f18264c) && NullChecker.m82486a(CoreModule.f18264c.f20387g0) && !TextUtils.isEmpty(CoreModule.f18264c.f20387g0.m32877d7())) ? WebViewAct.m81347a2(context, "", CoreModule.f18264c.f20387g0.m32877d7()) : new Intent(context, (Class<?>) GroupNotificationAct.class);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m144576h(Act act) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isBanned()) {
            o1j0.m165649w(R$string.f21507H0);
            return false;
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isIdCardVerified()) {
            return true;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard)) {
            if (TEnum.equals(verificationCenterM32615k4.idCard.status, "pending")) {
                o1j0.m165649w(R$string.f21725h3);
                return false;
            }
            if (TEnum.equals(verificationCenterM32615k4.idCard.status, "invalid")) {
                return true;
            }
        }
        m144589u(act);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m144577i(ChatGroup chatGroup) {
        if (NullChecker.m82486a(chatGroup)) {
            return chatGroup.punishment.sendRedPacket.active;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m144578j(ChatGroupMember chatGroupMember) {
        return TEnum.equals(chatGroupMember.gender, "unknown_") ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png" : m144580l(chatGroupMember.userId, TEnum.equals(chatGroupMember.gender, "female"));
    }

    /* JADX INFO: renamed from: k */
    public static String m144579k(User user) {
        return m144580l(user.f56859id, TEnum.equals(user.gender, "female"));
    }

    /* JADX INFO: renamed from: l */
    public static String m144580l(String str, boolean z) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            j = 0;
        }
        List<Anonymity> listM217954x = CoreModule.f18265d.m217954x(z);
        if (jyb.m147479J(listM217954x)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
        }
        List<String> list = listM217954x.get((int) (j % ((long) listM217954x.size()))).identifier;
        if (jyb.m147479J(list)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
        }
        String str2 = list.get(0);
        return TextUtils.isEmpty(str2) ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png" : dt0.m117786a(str2);
    }

    /* JADX INFO: renamed from: m */
    public static String m144581m() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ != null && c4450rForeground_.f16063b.f16274a) {
            Activity activity = c4450rForeground_.f16062a.get();
            if (activity instanceof MessagesAct) {
                return ((MessagesAct) activity).mo50158l().mo111034r3();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static String m144582n() {
        return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
    }

    /* JADX INFO: renamed from: o */
    public static String m144583o(String str) {
        return (!TextUtils.isEmpty(str) && str.length() > 8) ? str.substring(0, 8).concat("…") : str;
    }

    /* JADX INFO: renamed from: p */
    public static String m144584p() {
        return qv5.m178250d() + "://m." + qv5.m178249c() + ".com/commerce/grouph5/mygroup.html";
    }

    /* JADX INFO: renamed from: q */
    public static String m144585q(String str) {
        return qv5.m178250d() + "://m." + qv5.m178249c() + ".com/middle-platform/groupchat_report/" + str;
    }

    /* JADX INFO: renamed from: r */
    public static String m144586r(String str) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return qv5.m178250d() + "://m." + qv5.m178249c() + ".com/commerce/group/share/" + str + "/" + (NullChecker.m82486a(userM116600p9) ? userM116600p9.publicId : "");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m144587s(ChatGroup chatGroup) {
        if (NullChecker.m82486a(chatGroup)) {
            return TEnum.equals(chatGroup.groupType, "anonymous");
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static void m144588t(final Act act, String str, String str2, String str3) {
        act.duringCreated(CoreModule.f18264c.f20387g0.m32892i7(str, str2, str3)).subscribe(psd0.m173597H(new y20() { // from class: l.hek
            @Override // p153l.y20
            public final void call(Object obj) {
                jek.m144569a(act, (Conversation) obj);
            }
        }, new y20() { // from class: l.iek
            @Override // p153l.y20
            public final void call(Object obj) {
                jek.m144572d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static void m144589u(final Act act) {
        final l4g0 l4g0Var = new l4g0("p_real_name_authentication", Dialog.class.getName());
        w1e.m204402f(l4g0Var);
        new jl80.C17971a(act).m146024S(ibc0.f113896R0).m146055x0(R$string.f21707f3, new Object[0]).m146050s0(R$string.f21859x0, new Object[0]).m146032a0(R$string.f21771m4, new Runnable() { // from class: l.fek
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(CoreModule.m30933P().m143412i().mo180549v3(act2, "group_create"));
            }
        }).m146027V(R$string.f21457A6, new Object[0]).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.gek
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: v */
    public static void m144590v(ChatGroup chatGroup, List<ChatGroupMember> list, InterfaceC17934b interfaceC17934b) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ChatGroupMember chatGroupMember = null;
        for (ChatGroupMember chatGroupMember2 : list) {
            if (TextUtils.equals(chatGroup.ownerUserId, chatGroupMember2.userId)) {
                chatGroupMember = chatGroupMember2;
            } else if (chatGroup.adminUserIds.contains(chatGroupMember2.userId)) {
                arrayList.add(chatGroupMember2);
            } else {
                arrayList2.add(chatGroupMember2);
            }
        }
        if (NullChecker.m82486a(interfaceC17934b)) {
            interfaceC17934b.mo104349a(chatGroupMember, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m144591w(String str) {
        return str.replaceAll("\\n", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("\\s+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }
}
