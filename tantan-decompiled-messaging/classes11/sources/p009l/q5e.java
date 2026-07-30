package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.qqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q5e {
    /* JADX INFO: renamed from: a */
    public static boolean m20808a() {
        if (!NullChecker.a(CoreModule.H().userId())) {
            return true;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            return !qqi0.h(mqi0.m18550o(), (long) userP9.createdTime, 1);
        }
        return true;
    }
}
