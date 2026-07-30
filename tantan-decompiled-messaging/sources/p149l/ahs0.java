package p149l;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ahs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final Context f69700a;

    public ahs0(Context context) {
        this.f69700a = context;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        if (vny0.m199078p().m152537p(this.f69700a)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        vny0.m199078p().m152532k(this.f69700a, str2);
                        return;
                    }
                } else if (str.equals("_ac")) {
                    vny0.m199078p().m152531j(this.f69700a, str2);
                    return;
                }
            } else if (str.equals("_aa")) {
                vny0.m199078p().m152529h(this.f69700a, str2);
                return;
            }
            x2t0.m206866d("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
