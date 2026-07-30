package p153l;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final Context f105726a;

    public gqs0(Context context) {
        this.f105726a = context;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        if (bxy0.m106932p().m185241p(this.f105726a)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        bxy0.m106932p().m185236k(this.f105726a, str2);
                        return;
                    }
                } else if (str.equals("_ac")) {
                    bxy0.m106932p().m185235j(this.f105726a, str2);
                    return;
                }
            } else if (str.equals("_aa")) {
                bxy0.m106932p().m185233h(this.f105726a, str2);
                return;
            }
            dct0.m115295d("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
