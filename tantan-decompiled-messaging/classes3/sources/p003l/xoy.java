package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.l6c0;
import l.mqi0;
import l.o7r;
import l.ura;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xoy {
    /* JADX INFO: renamed from: b */
    public static List<uoy> m8731b(final String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        new zoy(MessageBarActionItemType.SHI_PAI, ura.e().d().I4() ? c3c0.L4 : c3c0.K4, ura.e().d().I4() ? c3c0.N4 : c3c0.M4).m9459l(m8733d()).m9460m(-1);
        new yoy(MessageBarActionItemType.PIC, ura.e().d().I4() ? c3c0.J4 : c3c0.I4).mo2978l(m8733d()).mo2980n(m8734e());
        voy voyVarMo2980n = new voy(MessageBarActionItemType.EMOJI, ura.e().d().I4() ? c3c0.A4 : c3c0.z4, ura.e().d().I4() ? c3c0.E4 : c3c0.D4).mo2978l(m8733d()).mo2980n(m8734e());
        uoy uoyVarM8190h = new cpy(MessageBarActionItemType.AUDIO, ura.e().d().I4() ? c3c0.y4 : c3c0.x4).mo2978l(m8733d()).mo2980n(m8734e()).m8190h();
        arrayList.add(voyVarMo2980n);
        arrayList.add(uoyVarM8190h);
        if (!TextUtils.equals((CharSequence) CoreModule.c.f0.J0.get(), str)) {
            arrayList.add(new cpy(MessageBarActionItemType.GIFT, ura.e().d().I4() ? c3c0.C4 : c3c0.B4).mo2978l(m8733d()).mo2980n(m8734e()).m8193k(false));
        }
        if (ura.e().d().I4()) {
            arrayList.add(new dpy(MessageBarActionItemType.MORE, c3c0.G4, c3c0.H4).mo2978l(m8733d()).mo2980n(m8734e()));
            return arrayList;
        }
        arrayList.add(new dpy(MessageBarActionItemType.MORE, c3c0.F4).mo2978l(m8733d()).mo2980n(m8734e()));
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static MessageBarActionItemView m8732c(uoy uoyVar, Context context, int i, int i2) {
        MessageBarActionItemView messageBarActionItemView = (MessageBarActionItemView) o7r.a(context).inflate(l6c0.K2, (ViewGroup) null);
        uoyVar.mo2907c(messageBarActionItemView, i, i2);
        return messageBarActionItemView;
    }

    /* JADX INFO: renamed from: d */
    public static int m8733d() {
        return ura.e().d().I4() ? 1711276032 : 1275068416;
    }

    /* JADX INFO: renamed from: e */
    public static int m8734e() {
        return ura.e().d().I4() ? -36854 : -98787;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8735f(String str, boolean z) {
        Conversation conversationZp = CoreModule.c.f0.zp(str);
        return !(User.isTeamAccount(str) || !y19.S() || z || conversationZp == null || conversationZp.isHeartbeatConv() || conversationZp.isSeeUpgradedConv());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8736g(String str, boolean z, User user) {
        Conversation conversationZp = CoreModule.c.f0.zp(str);
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.m9972e();
        return (User.isTeamAccount(str) || !y19.N() || z || conversationZp == null || CoreModule.c.e0.Aa(user) || user.isBannedNew() || user.isAccountCancellation() || loveLetterEntryInfo == null || !loveLetterEntryInfo.display || loveLetterEntryInfo.endTime <= ((double) mqi0.o()) || !TextUtils.equals(conversationZp.convType, ServletHandler.__DEFAULT_SERVLET)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8737h(String str, boolean z, User user) {
        Conversation conversationZp = CoreModule.c.f0.zp(str);
        return (!y19.R() || conversationZp == null || user == null || !TEnum.equals(conversationZp.status, ServletHandler.__DEFAULT_SERVLET) || !TextUtils.equals(conversationZp.convType, ServletHandler.__DEFAULT_SERVLET) || user.isTeamAccount() || user.isBannedNew() || user.isAccountCancellation()) ? false : true;
    }
}
