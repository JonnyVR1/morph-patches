package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class lwj0 extends ouj0<mwj0> {
    public lwj0(dum<? extends rwn0> dumVar, VFrame vFrame, jvj0 jvj0Var) {
        super(dumVar);
        this.f149172i = jvj0Var;
        mo52715C(new mwj0(vFrame));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m156053N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m156055P3(String str, BLiveUndercoverGame bLiveUndercoverGame) {
        if (act() != null) {
            o1j0.m165651y(String.format(act().getString(R$string.f47659Lc), str));
            m169312J3().m147077x4(bLiveUndercoverGame);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m156056R3(String str, String str2, final String str3) {
        duringCreated(nuj0.m164806k(str, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.jwj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122938a.m156055P3(str3, (BLiveUndercoverGame) obj);
            }
        }, new y20() { // from class: l.kwj0
            @Override // p153l.y20
            public final void call(Object obj) {
                lwj0.m156053N3((Throwable) obj);
            }
        }));
    }
}
