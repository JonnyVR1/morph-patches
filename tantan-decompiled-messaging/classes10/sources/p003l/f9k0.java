package p003l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.myf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f9k0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f4426a = {"https://static.tancdn.com/pe-webplatform/GghPdDhRJKFHKa0-3M3meQvh.jpg", "https://static.tancdn.com/pe-webplatform/6HYUBJZbEOZjvhpT7LygqrN_.jpg", "https://static.tancdn.com/pe-webplatform/BF2hKaNz2MFGVQoAHC-Lmkvm.jpg", "https://static.tancdn.com/pe-webplatform/enA_mueXRZC9W9-182d5p_8y.jpg", "https://static.tancdn.com/pe-webplatform/jeuh_MGyxNcUDD19Ojsj1OBa.jpg", "https://static.tancdn.com/pe-webplatform/kOYDyFNGen7JaBfVIVThCG3M.jpg", "https://static.tancdn.com/pe-webplatform/v0GMBILhDJ-kQ2ahn8tAB0e5.jpg", "https://static.tancdn.com/pe-webplatform/IDaiY4KD3F3ncRqPnziA5Ssw.jpg", "https://static.tancdn.com/pe-webplatform/bVvaeP5EU7QDgceHgOBL25_Q.jpg"};

    /* JADX INFO: renamed from: a */
    public static boolean m6460a() {
        return !NullChecker.a(CoreModule.c.e0.p9()) || myf.M(CoreModule.c.e0.p9()) || CoreModule.c.e0.p9().isBanned() || CoreModule.c.e0.p9().isJailed();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6461b(User user) {
        return myf.M(user) || user.isBanned();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6462c(String str) {
        return !NullChecker.a(CoreModule.c.e0.oa(str)) || myf.M(CoreModule.c.e0.oa(str)) || CoreModule.c.e0.oa(str).isBanned() || CoreModule.c.e0.oa(str).isJailed();
    }
}
