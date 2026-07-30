package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class uxy {
    /* JADX INFO: renamed from: b */
    public static List<rxy> m198551b(final String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        new wxy(MessageBarActionItemType.SHI_PAI, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113846L4 : ibc0.f113837K4, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113864N4 : ibc0.f113855M4).m208460l(m198553d()).m208461m(-1);
        new vxy(MessageBarActionItemType.PIC, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113828J4 : ibc0.f113819I4).mo188528l(m198553d()).mo188529n(m198554e());
        sxy sxyVarMo188529n = new sxy(MessageBarActionItemType.EMOJI, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113747A4 : ibc0.f114197z4, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113783E4 : ibc0.f113774D4).mo188528l(m198553d()).mo188529n(m198554e());
        rxy rxyVarM183577h = new zxy(MessageBarActionItemType.AUDIO, gta.m132210e().m132214d().mo34702I4() ? ibc0.f114188y4 : ibc0.f114179x4).mo188528l(m198553d()).mo188529n(m198554e()).m183577h();
        arrayList.add(sxyVarMo188529n);
        arrayList.add(rxyVarM183577h);
        if (!TextUtils.equals(CoreModule.f18264c.f20384f0.f20610J0.get(), str)) {
            arrayList.add(new zxy(MessageBarActionItemType.GIFT, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113765C4 : ibc0.f113756B4).mo188528l(m198553d()).mo188529n(m198554e()).m183580k(false));
        }
        if (gta.m132210e().m132214d().mo34702I4()) {
            arrayList.add(new ayy(MessageBarActionItemType.MORE, ibc0.f113801G4, ibc0.f113810H4).mo188528l(m198553d()).mo188529n(m198554e()));
            return arrayList;
        }
        arrayList.add(new ayy(MessageBarActionItemType.MORE, ibc0.f113792F4).mo188528l(m198553d()).mo188529n(m198554e()));
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static MessageBarActionItemView m198552c(rxy rxyVar, Context context, int i, int i2) {
        MessageBarActionItemView messageBarActionItemView = (MessageBarActionItemView) p9r.m171370a(context).inflate(qec0.f156884K2, (ViewGroup) null);
        rxyVar.mo100971c(messageBarActionItemView, i, i2);
        return messageBarActionItemView;
    }

    /* JADX INFO: renamed from: d */
    public static int m198553d() {
        return gta.m132210e().m132214d().mo34702I4() ? 1711276032 : 1275068416;
    }

    /* JADX INFO: renamed from: e */
    public static int m198554e() {
        return gta.m132210e().m132214d().mo34702I4() ? -36854 : -98787;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m198555f(String str, boolean z) {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        return !(User.isTeamAccount(str) || !h39.m133430S() || z || conversationM34219zp == null || conversationM34219zp.isHeartbeatConv() || conversationM34219zp.isSeeUpgradedConv());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m198556g(String str, boolean z, User user) {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
        return (User.isTeamAccount(str) || !h39.m133425N() || z || conversationM34219zp == null || CoreModule.f18264c.f20381e0.m116443Aa(user) || user.isBannedNew() || user.isAccountCancellation() || loveLetterEntryInfoM222761e == null || !loveLetterEntryInfoM222761e.display || loveLetterEntryInfoM222761e.endTime <= ((double) pzi0.m174454o()) || !TextUtils.equals(conversationM34219zp.convType, "default")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m198557h(String str, boolean z, User user) {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        return (!h39.m133429R() || conversationM34219zp == null || user == null || !TEnum.equals(conversationM34219zp.status, "default") || !TextUtils.equals(conversationM34219zp.convType, "default") || user.isTeamAccount() || user.isBannedNew() || user.isAccountCancellation()) ? false : true;
    }
}
