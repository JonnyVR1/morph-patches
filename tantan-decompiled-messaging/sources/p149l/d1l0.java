package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartData;

/* JADX INFO: loaded from: classes13.dex */
public class d1l0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public final String f83273a;

    /* JADX INFO: renamed from: b */
    public final String f83274b;

    public d1l0(String str, String str2) {
        this.f83273a = str;
        this.f83274b = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m109631n(Act act, BLiveVideoChat bLiveVideoChat) {
        m124169e(act);
        act.startActivity(LiveVChatAct.m69166b2(act, new VChatStartData(bLiveVideoChat, this.f83274b)));
        act.overridePendingTransition(wzb0.f188722e, 0);
        dt0.m113504D(act);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(final Act act) {
        super.mo94566a(act);
        iuu.m138461V(this.f83273a, this.f83274b, null).subscribe(ffw.m121194e(new e30() { // from class: l.b1l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72601a.m109631n(act, (BLiveVideoChat) obj);
            }
        }, new e30() { // from class: l.c1l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78285a.m109632o(act, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "sendStartReq";
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void m109632o(Act act, Throwable th) {
        String string;
        dt0.m113504D(act);
        m124167c(th);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 40007) {
                C12505a.m69243m(act, true);
                return;
            } else {
                if (i == 40009) {
                    l9s.m149076g().mo30689Gb(act);
                    return;
                }
                string = coreService.metaMessage;
            }
        } else {
            string = th != null ? act.getString(R$string.f44880R) : "";
        }
        lsi0.m151580j(string);
    }
}
