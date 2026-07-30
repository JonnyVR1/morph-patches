package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes9.dex */
public class v5k extends mwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        this.f139111a.toJson();
        ((fk3) tbs.m190077m(itd0.f116820b)).m125945L();
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        PushMessage pushMessage;
        return PushMessageIntent.conversation_single.equals(str) && (pushMessage = this.f139111a) != null && User.ID_TEAM_ACCOUNT.equals(pushMessage.content.f39652id);
    }
}
