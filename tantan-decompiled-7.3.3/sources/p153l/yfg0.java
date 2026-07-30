package p153l;

import java.util.ArrayList;
import tech.sud.gip.core.network.detection.INetworkDetectionFuture;

/* JADX INFO: loaded from: classes.dex */
public final class yfg0 implements INetworkDetectionFuture {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ chg0 f199518a;

    public yfg0(chg0 chg0Var) {
        this.f199518a = chg0Var;
    }

    @Override // tech.sud.gip.core.network.detection.INetworkDetectionFuture
    public final void cancel() {
        chg0 chg0Var = this.f199518a;
        if (chg0Var.f81806d) {
            return;
        }
        chg0Var.f81806d = true;
        chg0Var.f81803a = null;
        chg0Var.f81804b = null;
        ArrayList arrayList = chg0Var.f81810h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            neg0 neg0Var = (neg0) obj;
            ry3 ry3Var = neg0Var.f141647a;
            if (ry3Var != null && !ry3Var.isExecuted()) {
                neg0Var.f141647a.cancel();
            }
        }
    }

    @Override // tech.sud.gip.core.network.detection.INetworkDetectionFuture
    public final boolean isCanceled() {
        return this.f199518a.f81806d;
    }
}
