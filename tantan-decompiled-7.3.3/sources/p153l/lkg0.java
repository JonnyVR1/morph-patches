package p153l;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class lkg0 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final ArrayList f132467a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ trg0 f132468b;

    public lkg0(trg0 trg0Var) {
        this.f132468b = trg0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f132467a.clear();
        try {
            this.f132467a.addAll(this.f132468b.mo192497c());
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (this.f132468b.f175877e * ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
            ArrayList arrayList = this.f132467a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hog0 hog0Var = (hog0) obj;
                if (hog0Var instanceof swg0) {
                    swg0 swg0Var = (swg0) hog0Var;
                    if (swg0Var.f170974l < jCurrentTimeMillis) {
                        swg0Var.m188321e(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
                    } else if (swg0Var.f170966d == 3) {
                        if (swg0Var.f170976n == null) {
                            swg0Var.f170976n = new qmg0();
                        }
                        swg0Var.m188319c(Collections.singletonList(swg0Var.f170976n));
                    }
                }
            }
        } catch (Exception unused) {
        }
        this.f132467a.clear();
    }
}
