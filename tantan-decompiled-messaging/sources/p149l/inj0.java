package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class inj0 extends llj0<jnj0> {
    public inj0(bsm<? extends nnn0> bsmVar, VFrame vFrame, gmj0 gmj0Var) {
        super(bsmVar);
        this.f128714i = gmj0Var;
        mo51532C(new jnj0(vFrame));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m137143N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m137145P3(String str, BLiveUndercoverGame bLiveUndercoverGame) {
        if (act() != null) {
            lsi0.m151595y(String.format(act().getString(R$string.f46811Lc), str));
            m150494J3().m127023x4(bLiveUndercoverGame);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m137146R3(String str, String str2, final String str3) {
        duringCreated(klj0.m146413k(str, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.gnj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103604a.m137145P3(str3, (BLiveUndercoverGame) obj);
            }
        }, new e30() { // from class: l.hnj0
            @Override // p149l.e30
            public final void call(Object obj) {
                inj0.m137143N3((Throwable) obj);
            }
        }));
    }
}
