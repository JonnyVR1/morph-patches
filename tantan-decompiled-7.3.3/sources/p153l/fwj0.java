package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class fwj0 extends ouj0<gwj0> {
    public fwj0(dum<? extends rwn0> dumVar, VFrame vFrame, jvj0 jvj0Var) {
        super(dumVar);
        this.f149172i = jvj0Var;
        mo52715C(new gwj0(vFrame));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m127768N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m127770P3(String str) {
        duringCreated(nuj0.m164809n(((rwn0) m213810E2()).m202191k(), str, "stopSpeak")).subscribe(dhw.m115826e(new y20() { // from class: l.dwj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91026a.m127771R3((BLiveUndercoverGame) obj);
            }
        }, new y20() { // from class: l.ewj0
            @Override // p153l.y20
            public final void call(Object obj) {
                fwj0.m127768N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m127771R3(BLiveUndercoverGame bLiveUndercoverGame) {
        m169312J3().m147077x4(bLiveUndercoverGame);
    }
}
