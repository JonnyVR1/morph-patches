package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class q5e {
    /* JADX INFO: renamed from: a */
    public static boolean m173001a() {
        if (!NullChecker.m81303a(CoreModule.m29931H().userId())) {
            return true;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            return !qqi0.m175940h(mqi0.m155944o(), (long) userM169527p9.createdTime, 1);
        }
        return true;
    }
}
