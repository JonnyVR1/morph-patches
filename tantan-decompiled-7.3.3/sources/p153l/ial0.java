package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartData;

/* JADX INFO: loaded from: classes9.dex */
public class ial0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public final String f113604a;

    /* JADX INFO: renamed from: b */
    public final String f113605b;

    public ial0(String str, String str2) {
        this.f113604a = str;
        this.f113605b = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m139199n(Act act, BLiveVideoChat bLiveVideoChat) {
        m153583e(act);
        act.startActivity(LiveVChatAct.m70349c2(act, new VChatStartData(bLiveVideoChat, this.f113605b)));
        act.overridePendingTransition(q7c0.f155956e, 0);
        it0.m142010D(act);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(final Act act) {
        super.mo96996a(act);
        jwu.m147247V(this.f113604a, this.f113605b, null).subscribe(dhw.m115826e(new y20() { // from class: l.gal0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103011a.m139199n(act, (BLiveVideoChat) obj);
            }
        }, new y20() { // from class: l.hal0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108507a.m139200o(act, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "sendStartReq";
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void m139200o(Act act, Throwable th) {
        String string;
        it0.m142010D(act);
        m153581c(th);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 40007) {
                C12668a.m70426m(act, true);
                return;
            } else {
                if (i == 40009) {
                    mbs.m157853g().mo31692Gb(act);
                    return;
                }
                string = coreService.metaMessage;
            }
        } else {
            string = th != null ? act.getString(R$string.f45728R) : "";
        }
        o1j0.m165636j(string);
    }
}
