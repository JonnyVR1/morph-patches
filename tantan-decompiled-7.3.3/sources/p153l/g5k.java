package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.voice.entry.VoiceConversationEntryAct;

/* JADX INFO: loaded from: classes9.dex */
public class g5k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        String str2 = abe0Var.m96743f().get("tabId");
        String str3 = abe0Var.m96743f().get("from");
        fk3.C16996b c16996b = new fk3.C16996b();
        c16996b.f99480a = str2;
        c16996b.f99481b = str3;
        if (SchemeKey.jumpVoiceSquare.equals(str)) {
            h3g0.m133482a(act, str2);
        } else {
            m129065r(act, str2);
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return SchemeKey.jumpVoiceSquare.equals(str) || SchemeKey.jumpToVoiceFrame.equals(str);
    }

    /* JADX INFO: renamed from: r */
    public final void m129065r(Act act, String str) {
        act.startActivity(mbs.m157853g().toNewMainAct(act, NavigationIntent.get(NavigationIntent.menu)));
        if (!wft.m206159b(3)) {
            act.startActivity(VoiceConversationEntryAct.m72128Y1(act));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("tab_id", str);
        act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "voice_internal_square_page", bundle));
    }
}
