package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class awj0 extends ouj0<bwj0> {
    public awj0(dum<? extends rwn0> dumVar, VFrame vFrame, jvj0 jvj0Var) {
        super(dumVar);
        this.f149172i = jvj0Var;
        mo52715C(new bwj0(vFrame));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m100670R3(BLiveUndercoverGame bLiveUndercoverGame) {
        m169312J3().m147077x4(bLiveUndercoverGame);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m100671S3(Throwable th) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((bwj0) v2).m113404p();
        }
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165621C(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m100672T3() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((bwj0) v2).m113404p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public void m100673U3(String str) {
        duringCreated(nuj0.m164809n(((rwn0) m213810E2()).m202191k(), str, "restart")).subscribe(dhw.m115827f(new y20() { // from class: l.xvj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196407a.m100670R3((BLiveUndercoverGame) obj);
            }
        }, new y20() { // from class: l.yvj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201727a.m100671S3((Throwable) obj);
            }
        }, new x20() { // from class: l.zvj0
            @Override // p153l.x20
            public final void call() {
                this.f206223a.m100672T3();
            }
        }));
    }
}
