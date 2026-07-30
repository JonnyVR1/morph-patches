package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b0d0 extends ogl0 {
    /* JADX INFO: renamed from: c0 */
    public static boolean m12410c0() {
        m12412e0();
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m12411d0() {
        m12412e0();
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m12412e0() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if (NullChecker.b(userM21483na)) {
            return !userM21483na.isFemale();
        }
        return true;
    }
}
