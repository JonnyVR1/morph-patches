package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.voice.entry.VoiceConversationEntryAct;

/* JADX INFO: loaded from: classes13.dex */
public class o2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        String str2 = w2e0Var.m201098f().get("tabId");
        String str3 = w2e0Var.m201098f().get("from");
        nj3.C18705b c18705b = new nj3.C18705b();
        c18705b.f139207a = str2;
        c18705b.f139208b = str3;
        if (SchemeKey.jumpVoiceSquare.equals(str)) {
            yuf0.m216111a(act, str2);
        } else {
            m162300r(act, str2);
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return SchemeKey.jumpVoiceSquare.equals(str) || SchemeKey.jumpToVoiceFrame.equals(str);
    }

    /* JADX INFO: renamed from: r */
    public final void m162300r(Act act, String str) {
        act.startActivity(l9s.m149076g().toNewMainAct(act, NavigationIntent.get(NavigationIntent.menu)));
        if (!vdt.m198092b(3)) {
            act.startActivity(VoiceConversationEntryAct.m70945X1(act));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("tab_id", str);
        act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "voice_internal_square_page", bundle));
    }
}
