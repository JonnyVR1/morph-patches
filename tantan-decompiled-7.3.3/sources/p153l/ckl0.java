package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartData;

/* JADX INFO: loaded from: classes9.dex */
public class ckl0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public final String f82298a;

    public ckl0(String str) {
        this.f82298a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m110348o(Act act, Throwable th) {
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

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(final Act act) {
        super.mo96996a(act);
        jwu.m147246U(this.f82298a).subscribe(dhw.m115826e(new y20() { // from class: l.akl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72019a.m110349n(act, (BLiveVideoChatRandomMatch) obj);
            }
        }, new y20() { // from class: l.bkl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77087a.m110348o(act, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "sendRandomMatchReq";
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m110349n(Act act, BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch) {
        m153583e(act);
        act.startActivity(LiveVChatAct.m70349c2(act, new VChatStartData(bLiveVideoChatRandomMatch, this.f82298a)));
        act.overridePendingTransition(q7c0.f155956e, 0);
        it0.m142010D(act);
    }
}
