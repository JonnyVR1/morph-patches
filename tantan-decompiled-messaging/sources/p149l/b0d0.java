package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class b0d0 extends ogl0 {
    /* JADX INFO: renamed from: c0 */
    public static boolean m99748c0() {
        m99750e0();
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m99749d0() {
        m99750e0();
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m99750e0() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (NullChecker.m81304b(userM169520na)) {
            return !userM169520na.isFemale();
        }
        return true;
    }
}
