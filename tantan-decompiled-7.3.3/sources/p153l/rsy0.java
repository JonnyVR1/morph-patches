package p153l;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rsy0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public final vzy0 f164759c;

    public rsy0(vzy0 vzy0Var) {
        super("internal.logger");
        this.f164759c = vzy0Var;
        this.f137946b.put("log", new byy0(this, false, true));
        this.f137946b.put(NotificationCompat.GROUP_KEY_SILENT, new sqy0(this, NotificationCompat.GROUP_KEY_SILENT));
        ((mpr0) this.f137946b.get(NotificationCompat.GROUP_KEY_SILENT)).mo100512a("log", new byy0(this, true, true));
        this.f137946b.put("unmonitored", new lwy0(this, "unmonitored"));
        ((mpr0) this.f137946b.get("unmonitored")).mo100512a("log", new byy0(this, false, false));
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        return ewr0.f96187w0;
    }
}
