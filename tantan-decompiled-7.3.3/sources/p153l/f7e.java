package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class f7e {
    /* JADX INFO: renamed from: a */
    public static boolean m124437a() {
        if (!NullChecker.m82486a(CoreModule.m30929H().userId())) {
            return true;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            return !tzi0.m193670h(pzi0.m174454o(), (long) userM116600p9.createdTime, 1);
        }
        return true;
    }
}
