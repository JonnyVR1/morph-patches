package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes13.dex */
public class c2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        String str2 = w2e0Var.m201098f().get("tabId");
        String str3 = w2e0Var.m201098f().get("from");
        nj3.C18705b c18705b = new nj3.C18705b();
        c18705b.f139207a = str2;
        c18705b.f139208b = str3;
        ((nj3) s9s.m182763m(gld0.f103312b)).m159619Q(c18705b);
        if (l9s.m149076g().mo30742a().mo165308h()) {
            x4u.m207037w(act);
        } else {
            act.startActivity(l9s.m149076g().toNewMainAct(act, NavigationIntent.get("live")));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return mo99015a(SchemeKey.liveSquare).equals(str);
    }
}
