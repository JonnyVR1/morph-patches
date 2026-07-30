package p003l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.group.GroupNotificationAct;
import com.p1.mobile.putong.data.Anonymity;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.data.DbObject;
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
import l.c3c0;
import l.cwf0;
import l.dd80;
import l.evk;
import l.g7c;
import l.i0e;
import l.lip0;
import l.lsi0;
import l.mkd0;
import l.mu5;
import l.vwb;
import l.y19;
import l.ys0;
import org.eclipse.jetty.servlet.ServletHandler;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tbk {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f7429a = new g7c("yyyy年MM月dd日", Locale.getDefault()).a();

    /* JADX INFO: renamed from: b */
    public static Map<String, Long> f7430b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static Set<String> f7431c = new HashSet();

    /* JADX INFO: renamed from: d */
    public static String f7432d = "local_group_topic_id_";

    /* JADX INFO: renamed from: l.tbk$a */
    public static class C0546a implements Comparator<ChatGroupMember> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2) {
            String upperCase = evk.c().d(!TextUtils.isEmpty(chatGroupMember.nickName) ? chatGroupMember.nickName : chatGroupMember.userName).toUpperCase();
            String upperCase2 = evk.c().d(!TextUtils.isEmpty(chatGroupMember2.nickName) ? chatGroupMember2.nickName : chatGroupMember2.userName).toUpperCase();
            if (upperCase.equals("@") || upperCase2.equals("#")) {
                return -1;
            }
            if (upperCase.equals("#") || upperCase2.equals("@")) {
                return 1;
            }
            return upperCase.compareTo(upperCase2);
        }
    }

    /* JADX INFO: renamed from: l.tbk$b */
    public interface InterfaceC0547b {
        /* JADX INFO: renamed from: a */
        void mo2885a(ChatGroupMember chatGroupMember, List<ChatGroupMember> list, List<ChatGroupMember> list2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7707a(Act act, Conversation conversation) {
        if (conversation == null || !TEnum.equals(ConversationStatus.get(ServletHandler.__DEFAULT_SERVLET), conversation.status)) {
            return;
        }
        act.startActivity(MessagesAct.m2035i2(act, ((DbObject) conversation).id, false, false));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7710d(Throwable th) {
        if (!NullChecker.a(th) || !(th instanceof TantanException.Client.TantanForbidden)) {
            lsi0.w(R.string.B2);
            return;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.code != 40399) {
            lsi0.w(R.string.B2);
            return;
        }
        String str = tantanForbidden.message;
        if (tantanForbidden.hasHandle || TextUtils.isEmpty(str)) {
            return;
        }
        lsi0.y(str);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m7711e(Context context, String str, String str2) {
        return m7712f(context, str, str2, RelationshipStatus.get("unknown_"), 273);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m7712f(Context context, String str, String str2, RelationshipStatus relationshipStatus, int i) {
        return CoreModule.K().startProfileAct(context, str, str2, false, false, false, relationshipStatus, i, false, true, false);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m7713g(Context context) {
        if (y19.L()) {
            String strJ = lip0.i().j(context, "Group_groupNotify");
            if (!TextUtils.isEmpty(strJ)) {
                return WebViewAct.a2(context, "", strJ, true);
            }
        }
        return (NullChecker.a(CoreModule.c) && NullChecker.a(CoreModule.c.g0) && !TextUtils.isEmpty(CoreModule.c.g0.d7())) ? WebViewAct.Z1(context, "", CoreModule.c.g0.d7()) : new Intent(context, (Class<?>) GroupNotificationAct.class);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7714h(Act act) {
        if (CoreModule.c.e0.p9().isBanned()) {
            lsi0.w(R.string.H0);
            return false;
        }
        if (CoreModule.c.e0.p9().isIdCardVerified()) {
            return true;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.idCard)) {
            if (TEnum.equals(verificationCenterK4.idCard.status, "pending")) {
                lsi0.w(R.string.h3);
                return false;
            }
            if (TEnum.equals(verificationCenterK4.idCard.status, "invalid")) {
                return true;
            }
        }
        m7727u(act);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7715i(ChatGroup chatGroup) {
        if (NullChecker.a(chatGroup)) {
            return chatGroup.punishment.sendRedPacket.active;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m7716j(ChatGroupMember chatGroupMember) {
        return TEnum.equals(chatGroupMember.gender, "unknown_") ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png" : m7718l(chatGroupMember.userId, TEnum.equals(chatGroupMember.gender, "female"));
    }

    /* JADX INFO: renamed from: k */
    public static String m7717k(User user) {
        return m7718l(((DbObject) user).id, TEnum.equals(user.gender, "female"));
    }

    /* JADX INFO: renamed from: l */
    public static String m7718l(String str, boolean z) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            j = 0;
        }
        List listX = CoreModule.d.x(z);
        if (vwb.J(listX)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
        }
        List list = ((Anonymity) listX.get((int) (j % ((long) listX.size())))).identifier;
        if (vwb.J(list)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
        }
        String str2 = (String) list.get(0);
        return TextUtils.isEmpty(str2) ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png" : ys0.a(str2);
    }

    /* JADX INFO: renamed from: m */
    public static String m7719m() {
        Act.r rVarForeground_ = Act.foreground_();
        if (rVarForeground_ != null && rVarForeground_.b.a) {
            Object obj = (Activity) rVarForeground_.a.get();
            if (obj instanceof MessagesAct) {
                return ((MessagesAct) obj).mo2066l().m4295r3();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static String m7720n() {
        return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
    }

    /* JADX INFO: renamed from: o */
    public static String m7721o(String str) {
        return (!TextUtils.isEmpty(str) && str.length() > 8) ? str.substring(0, 8).concat("…") : str;
    }

    /* JADX INFO: renamed from: p */
    public static String m7722p() {
        return mu5.d() + "://m." + mu5.c() + ".com/commerce/grouph5/mygroup.html";
    }

    /* JADX INFO: renamed from: q */
    public static String m7723q(String str) {
        return mu5.d() + "://m." + mu5.c() + ".com/middle-platform/groupchat_report/" + str;
    }

    /* JADX INFO: renamed from: r */
    public static String m7724r(String str) {
        User userP9 = CoreModule.c.e0.p9();
        return mu5.d() + "://m." + mu5.c() + ".com/commerce/group/share/" + str + "/" + (NullChecker.a(userP9) ? userP9.publicId : "");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7725s(ChatGroup chatGroup) {
        if (NullChecker.a(chatGroup)) {
            return TEnum.equals(chatGroup.groupType, "anonymous");
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static void m7726t(final Act act, String str, String str2, String str3) {
        act.duringCreated(CoreModule.c.g0.i7(str, str2, str3)).subscribe((m250) mkd0.H(new e30() { // from class: l.rbk
            @Override // p003l.e30
            public final void call(Object obj) {
                tbk.m7707a(act, (Conversation) obj);
            }
        }, new e30() { // from class: l.sbk
            @Override // p003l.e30
            public final void call(Object obj) {
                tbk.m7710d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static void m7727u(final Act act) {
        final cwf0 cwf0Var = new cwf0("p_real_name_authentication", Dialog.class.getName());
        i0e.f(cwf0Var);
        new dd80.a(act).S(c3c0.R0).x0(R.string.f3, new Object[0]).s0(R.string.x0, new Object[0]).a0(R.string.m4, new Runnable() { // from class: l.pbk
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(CoreModule.P().i().v3(act2, "group_create"));
            }
        }).V(R.string.A6, new Object[0]).n0(new DialogInterface.OnDismissListener() { // from class: l.qbk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: v */
    public static void m7728v(ChatGroup chatGroup, List<ChatGroupMember> list, InterfaceC0547b interfaceC0547b) {
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
        if (NullChecker.a(interfaceC0547b)) {
            interfaceC0547b.mo2885a(chatGroupMember, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m7729w(String str) {
        return str.replaceAll("\\n", " ").replaceAll("\\s+", " ");
    }
}
