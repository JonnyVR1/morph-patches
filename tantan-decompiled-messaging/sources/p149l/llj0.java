package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.List;
import p149l.mlj0;

/* JADX INFO: loaded from: classes5.dex */
public class llj0<T extends mlj0> extends h4t<nnn0, T> {

    /* JADX INFO: renamed from: i */
    public gmj0 f128714i;

    public llj0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public gmj0 m150494J3() {
        return this.f128714i;
    }

    /* JADX INFO: renamed from: K3 */
    public void m150495K3() {
        ((mlj0) this.viewModel).m155163f();
    }

    /* JADX INFO: renamed from: L3 */
    public void m150496L3() {
        ((mlj0) this.viewModel).destroy();
        ((mlj0) this.viewModel).m155164i();
    }

    /* JADX INFO: renamed from: M3 */
    public void m150497M3(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        ((mlj0) this.viewModel).mo112640j(bLiveUndercoverGame, i, list);
    }
}
