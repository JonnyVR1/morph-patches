package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class e8d0 extends spl0 {
    /* JADX INFO: renamed from: c0 */
    public static boolean m119812c0() {
        m119814e0();
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m119813d0() {
        m119814e0();
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m119814e0() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (NullChecker.m82487b(userM116593na)) {
            return !userM116593na.isFemale();
        }
        return true;
    }
}
