package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xoy {
    /* JADX INFO: renamed from: b */
    public static List<uoy> m210447b(final String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        new zoy(MessageBarActionItemType.SHI_PAI, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78571L4 : c3c0.f78562K4, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78589N4 : c3c0.f78580M4).m219603l(m210449d()).m219604m(-1);
        new yoy(MessageBarActionItemType.PIC, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78553J4 : c3c0.f78544I4).mo103098l(m210449d()).mo103100n(m210450e());
        voy voyVarMo103100n = new voy(MessageBarActionItemType.EMOJI, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78472A4 : c3c0.f78922z4, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78508E4 : c3c0.f78499D4).mo103098l(m210449d()).mo103100n(m210450e());
        uoy uoyVarM194577h = new cpy(MessageBarActionItemType.AUDIO, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78913y4 : c3c0.f78904x4).mo103098l(m210449d()).mo103100n(m210450e()).m194577h();
        arrayList.add(voyVarMo103100n);
        arrayList.add(uoyVarM194577h);
        if (!TextUtils.equals(CoreModule.f17545c.f19642f0.f19868J0.get(), str)) {
            arrayList.add(new cpy(MessageBarActionItemType.GIFT, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78490C4 : c3c0.f78481B4).mo103098l(m210449d()).mo103100n(m210450e()).m194580k(false));
        }
        if (ura.m195053e().m195057d().mo33699I4()) {
            arrayList.add(new dpy(MessageBarActionItemType.MORE, c3c0.f78526G4, c3c0.f78535H4).mo103098l(m210449d()).mo103100n(m210450e()));
            return arrayList;
        }
        arrayList.add(new dpy(MessageBarActionItemType.MORE, c3c0.f78517F4).mo103098l(m210449d()).mo103100n(m210450e()));
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static MessageBarActionItemView m210448c(uoy uoyVar, Context context, int i, int i2) {
        MessageBarActionItemView messageBarActionItemView = (MessageBarActionItemView) o7r.m163037a(context).inflate(l6c0.f126328K2, (ViewGroup) null);
        uoyVar.mo98197c(messageBarActionItemView, i, i2);
        return messageBarActionItemView;
    }

    /* JADX INFO: renamed from: d */
    public static int m210449d() {
        return ura.m195053e().m195057d().mo33699I4() ? 1711276032 : 1275068416;
    }

    /* JADX INFO: renamed from: e */
    public static int m210450e() {
        return ura.m195053e().m195057d().mo33699I4() ? -36854 : -98787;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m210451f(String str, boolean z) {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        return !(User.isTeamAccount(str) || !y19.m212159S() || z || conversationM33216zp == null || conversationM33216zp.isHeartbeatConv() || conversationM33216zp.isSeeUpgradedConv());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m210452g(String str, boolean z, User user) {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
        return (User.isTeamAccount(str) || !y19.m212154N() || z || conversationM33216zp == null || CoreModule.f17545c.f19639e0.m169370Aa(user) || user.isBannedNew() || user.isAccountCancellation() || loveLetterEntryInfoM221515e == null || !loveLetterEntryInfoM221515e.display || loveLetterEntryInfoM221515e.endTime <= ((double) mqi0.m155944o()) || !TextUtils.equals(conversationM33216zp.convType, "default")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m210453h(String str, boolean z, User user) {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        return (!y19.m212158R() || conversationM33216zp == null || user == null || !TEnum.equals(conversationM33216zp.status, "default") || !TextUtils.equals(conversationM33216zp.convType, "default") || user.isTeamAccount() || user.isBannedNew() || user.isAccountCancellation()) ? false : true;
    }
}
