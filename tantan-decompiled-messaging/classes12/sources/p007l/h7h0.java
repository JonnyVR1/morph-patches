package p007l;

import android.text.TextUtils;
import l.qib0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h7h0 {

    /* JADX INFO: renamed from: a */
    public static uqd0 f8614a = new uqd0("appVersionName", "");

    /* JADX INFO: renamed from: a */
    public static boolean m10553a() {
        if (TextUtils.equals((CharSequence) f8614a.get(), qib0.s)) {
            return false;
        }
        sti.f13082h.put("");
        sti.f13081g.put("");
        f8614a.put(qib0.s);
        return false;
    }
}
