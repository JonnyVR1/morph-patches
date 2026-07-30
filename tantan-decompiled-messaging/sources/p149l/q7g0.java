package p149l;

import java.util.ArrayList;
import tech.sud.gip.core.network.detection.INetworkDetectionFuture;

/* JADX INFO: loaded from: classes.dex */
public final class q7g0 implements INetworkDetectionFuture {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u8g0 f153045a;

    public q7g0(u8g0 u8g0Var) {
        this.f153045a = u8g0Var;
    }

    @Override // tech.sud.gip.core.network.detection.INetworkDetectionFuture
    public final void cancel() {
        u8g0 u8g0Var = this.f153045a;
        if (u8g0Var.f175130d) {
            return;
        }
        u8g0Var.f175130d = true;
        u8g0Var.f175127a = null;
        u8g0Var.f175128b = null;
        ArrayList arrayList = u8g0Var.f175134h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f6g0 f6g0Var = (f6g0) obj;
            sx3 sx3Var = f6g0Var.f96123a;
            if (sx3Var != null && !sx3Var.isExecuted()) {
                f6g0Var.f96123a.cancel();
            }
        }
    }

    @Override // tech.sud.gip.core.network.detection.INetworkDetectionFuture
    public final boolean isCanceled() {
        return this.f153045a.f175130d;
    }
}
