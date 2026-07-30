package p149l;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class dcg0 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final ArrayList f85401a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ljg0 f85402b;

    public dcg0(ljg0 ljg0Var) {
        this.f85402b = ljg0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f85401a.clear();
        try {
            this.f85401a.addAll(this.f85402b.mo149977c());
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (this.f85402b.f128327e * ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
            ArrayList arrayList = this.f85401a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zfg0 zfg0Var = (zfg0) obj;
                if (zfg0Var instanceof kog0) {
                    kog0 kog0Var = (kog0) zfg0Var;
                    if (kog0Var.f124012l < jCurrentTimeMillis) {
                        kog0Var.m146711e(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
                    } else if (kog0Var.f124004d == 3) {
                        if (kog0Var.f124014n == null) {
                            kog0Var.f124014n = new ieg0();
                        }
                        kog0Var.m146709c(Collections.singletonList(kog0Var.f124014n));
                    }
                }
            }
        } catch (Exception unused) {
        }
        this.f85401a.clear();
    }
}
