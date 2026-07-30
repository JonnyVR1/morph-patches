package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupNotificationAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Anonymity;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
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
public class tbk {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f169267a = new g7c("yyyy年MM月dd日", Locale.getDefault()).m124687a();

    /* JADX INFO: renamed from: b */
    public static Map<String, Long> f169268b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static Set<String> f169269c = new HashSet();

    /* JADX INFO: renamed from: d */
    public static String f169270d = "local_group_topic_id_";

    /* JADX INFO: renamed from: l.tbk$a */
    public static class C20140a implements Comparator<ChatGroupMember> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2) {
            String upperCase = evk.m118285c().m118288d(!TextUtils.isEmpty(chatGroupMember.nickName) ? chatGroupMember.nickName : chatGroupMember.userName).toUpperCase();
            String upperCase2 = evk.m118285c().m118288d(!TextUtils.isEmpty(chatGroupMember2.nickName) ? chatGroupMember2.nickName : chatGroupMember2.userName).toUpperCase();
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
    public interface InterfaceC20141b {
        /* JADX INFO: renamed from: a */
        void mo96977a(ChatGroupMember chatGroupMember, List<ChatGroupMember> list, List<ChatGroupMember> list2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m187854a(Act act, Conversation conversation) {
        if (conversation == null || !TEnum.equals(ConversationStatus.get("default"), conversation.status)) {
            return;
        }
        act.startActivity(MessagesAct.m48943i2(act, conversation.f56011id, false, false));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m187857d(Throwable th) {
        if (!NullChecker.m81303a(th) || !(th instanceof TantanException.Client.TantanForbidden)) {
            lsi0.m151593w(R$string.f20719B2);
            return;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.code != 40399) {
            lsi0.m151593w(R$string.f20719B2);
            return;
        }
        String str = tantanForbidden.message;
        if (tantanForbidden.hasHandle || TextUtils.isEmpty(str)) {
            return;
        }
        lsi0.m151595y(str);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m187858e(Context context, String str, String str2) {
        return m187859f(context, str, str2, RelationshipStatus.get("unknown_"), 273);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m187859f(Context context, String str, String str2, RelationshipStatus relationshipStatus, int i) {
        return CoreModule.m29932K().startProfileAct(context, str, str2, false, false, false, relationshipStatus, i, false, true, false);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m187860g(Context context) {
        if (y19.m212152L()) {
            String strM149930j = lip0.m149927i().m149930j(context, "Group_groupNotify");
            if (!TextUtils.isEmpty(strM149930j)) {
                return WebViewAct.m80165a2(context, "", strM149930j, true);
            }
        }
        return (NullChecker.m81303a(CoreModule.f17545c) && NullChecker.m81303a(CoreModule.f17545c.f19645g0) && !TextUtils.isEmpty(CoreModule.f17545c.f19645g0.m31874d7())) ? WebViewAct.m80164Z1(context, "", CoreModule.f17545c.f19645g0.m31874d7()) : new Intent(context, (Class<?>) GroupNotificationAct.class);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m187861h(Act act) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isBanned()) {
            lsi0.m151593w(R$string.f20765H0);
            return false;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isIdCardVerified()) {
            return true;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard)) {
            if (TEnum.equals(verificationCenterM31612k4.idCard.status, "pending")) {
                lsi0.m151593w(R$string.f20983h3);
                return false;
            }
            if (TEnum.equals(verificationCenterM31612k4.idCard.status, "invalid")) {
                return true;
            }
        }
        m187874u(act);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m187862i(ChatGroup chatGroup) {
        if (NullChecker.m81303a(chatGroup)) {
            return chatGroup.punishment.sendRedPacket.active;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m187863j(ChatGroupMember chatGroupMember) {
        return TEnum.equals(chatGroupMember.gender, "unknown_") ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png" : m187865l(chatGroupMember.userId, TEnum.equals(chatGroupMember.gender, "female"));
    }

    /* JADX INFO: renamed from: k */
    public static String m187864k(User user) {
        return m187865l(user.f56011id, TEnum.equals(user.gender, "female"));
    }

    /* JADX INFO: renamed from: l */
    public static String m187865l(String str, boolean z) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            j = 0;
        }
        List<Anonymity> listM200508x = CoreModule.f17546d.m200508x(z);
        if (vwb.m200296J(listM200508x)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
        }
        List<String> list = listM200508x.get((int) (j % ((long) listM200508x.size()))).identifier;
        if (vwb.m200296J(list)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
        }
        String str2 = list.get(0);
        return TextUtils.isEmpty(str2) ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png" : ys0.m215875a(str2);
    }

    /* JADX INFO: renamed from: m */
    public static String m187866m() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ != null && c4299rForeground_.f15344b.f15555a) {
            Activity activity = c4299rForeground_.f15343a.get();
            if (activity instanceof MessagesAct) {
                return ((MessagesAct) activity).mo48974l().mo120828r3();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static String m187867n() {
        return "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2VkhKT1NSSUQ2SFo0TkZENU9ISUdaVUJDMzVMNzA2IiwidyI6MTAwMCwiaCI6MTAwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE1MzcyMjg4MTg3ODYxMTE4NzQyfQ.png";
    }

    /* JADX INFO: renamed from: o */
    public static String m187868o(String str) {
        return (!TextUtils.isEmpty(str) && str.length() > 8) ? str.substring(0, 8).concat("…") : str;
    }

    /* JADX INFO: renamed from: p */
    public static String m187869p() {
        return mu5.m156379d() + "://m." + mu5.m156378c() + ".com/commerce/grouph5/mygroup.html";
    }

    /* JADX INFO: renamed from: q */
    public static String m187870q(String str) {
        return mu5.m156379d() + "://m." + mu5.m156378c() + ".com/middle-platform/groupchat_report/" + str;
    }

    /* JADX INFO: renamed from: r */
    public static String m187871r(String str) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return mu5.m156379d() + "://m." + mu5.m156378c() + ".com/commerce/group/share/" + str + "/" + (NullChecker.m81303a(userM169527p9) ? userM169527p9.publicId : "");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m187872s(ChatGroup chatGroup) {
        if (NullChecker.m81303a(chatGroup)) {
            return TEnum.equals(chatGroup.groupType, "anonymous");
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static void m187873t(final Act act, String str, String str2, String str3) {
        act.duringCreated(CoreModule.f17545c.f19645g0.m31889i7(str, str2, str3)).subscribe(mkd0.m154956H(new e30() { // from class: l.rbk
            @Override // p149l.e30
            public final void call(Object obj) {
                tbk.m187854a(act, (Conversation) obj);
            }
        }, new e30() { // from class: l.sbk
            @Override // p149l.e30
            public final void call(Object obj) {
                tbk.m187857d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static void m187874u(final Act act) {
        final cwf0 cwf0Var = new cwf0("p_real_name_authentication", Dialog.class.getName());
        i0e.m133797f(cwf0Var);
        new dd80.C16336a(act).m110964S(c3c0.f78621R0).m110995x0(R$string.f20965f3, new Object[0]).m110990s0(R$string.f21117x0, new Object[0]).m110972a0(R$string.f21029m4, new Runnable() { // from class: l.pbk
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(CoreModule.m29935P().m94658i().mo158457v3(act2, "group_create"));
            }
        }).m110967V(R$string.f20715A6, new Object[0]).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.qbk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: v */
    public static void m187875v(ChatGroup chatGroup, List<ChatGroupMember> list, InterfaceC20141b interfaceC20141b) {
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
        if (NullChecker.m81303a(interfaceC20141b)) {
            interfaceC20141b.mo96977a(chatGroupMember, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m187876w(String str) {
        return str.replaceAll("\\n", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replaceAll("\\s+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }
}
