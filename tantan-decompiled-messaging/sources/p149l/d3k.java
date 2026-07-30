package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes13.dex */
public class d3k extends ytl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        this.f199994a.toJson();
        ((nj3) s9s.m182763m(gld0.f103312b)).m159614L();
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        PushMessage pushMessage;
        return PushMessageIntent.conversation_single.equals(str) && (pushMessage = this.f199994a) != null && User.ID_TEAM_ACCOUNT.equals(pushMessage.content.f38804id);
    }
}
