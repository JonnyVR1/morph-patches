package p149l;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ljy0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public final pqy0 f128427c;

    public ljy0(pqy0 pqy0Var) {
        super("internal.logger");
        this.f128427c = pqy0Var;
        this.f102531b.put("log", new voy0(this, false, true));
        this.f102531b.put(NotificationCompat.GROUP_KEY_SILENT, new mhy0(this, NotificationCompat.GROUP_KEY_SILENT));
        ((ggr0) this.f102531b.get(NotificationCompat.GROUP_KEY_SILENT)).mo126000a("log", new voy0(this, true, true));
        this.f102531b.put("unmonitored", new fny0(this, "unmonitored"));
        ((ggr0) this.f102531b.get("unmonitored")).mo126000a("log", new voy0(this, false, false));
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        return ymr0.f199051w0;
    }
}
