package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartData;

/* JADX INFO: loaded from: classes13.dex */
public class yal0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public final String f197222a;

    public yal0(String str) {
        this.f197222a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m213859o(Act act, Throwable th) {
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

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(final Act act) {
        super.mo94566a(act);
        iuu.m138460U(this.f197222a).subscribe(ffw.m121194e(new e30() { // from class: l.wal0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185481a.m213860n(act, (BLiveVideoChatRandomMatch) obj);
            }
        }, new e30() { // from class: l.xal0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191755a.m213859o(act, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "sendRandomMatchReq";
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m213860n(Act act, BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch) {
        m124169e(act);
        act.startActivity(LiveVChatAct.m69166b2(act, new VChatStartData(bLiveVideoChatRandomMatch, this.f197222a)));
        act.overridePendingTransition(wzb0.f188722e, 0);
        dt0.m113504D(act);
    }
}
