package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class lik0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f132232a = {"https://static.tancdn.com/pe-webplatform/GghPdDhRJKFHKa0-3M3meQvh.jpg", "https://static.tancdn.com/pe-webplatform/6HYUBJZbEOZjvhpT7LygqrN_.jpg", "https://static.tancdn.com/pe-webplatform/BF2hKaNz2MFGVQoAHC-Lmkvm.jpg", "https://static.tancdn.com/pe-webplatform/enA_mueXRZC9W9-182d5p_8y.jpg", "https://static.tancdn.com/pe-webplatform/jeuh_MGyxNcUDD19Ojsj1OBa.jpg", "https://static.tancdn.com/pe-webplatform/kOYDyFNGen7JaBfVIVThCG3M.jpg", "https://static.tancdn.com/pe-webplatform/v0GMBILhDJ-kQ2ahn8tAB0e5.jpg", "https://static.tancdn.com/pe-webplatform/IDaiY4KD3F3ncRqPnziA5Ssw.jpg", "https://static.tancdn.com/pe-webplatform/bVvaeP5EU7QDgceHgOBL25_Q.jpg"};

    /* JADX INFO: renamed from: a */
    public static boolean m154375a() {
        return !NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) || a0g.m95357M(CoreModule.f18264c.f20381e0.m116600p9()) || CoreModule.f18264c.f20381e0.m116600p9().isBanned() || CoreModule.f18264c.f20381e0.m116600p9().isJailed();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m154376b(User user) {
        return a0g.m95357M(user) || user.isBanned();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m154377c(String str) {
        return !NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(str)) || a0g.m95357M(CoreModule.f18264c.f20381e0.m116597oa(str)) || CoreModule.f18264c.f20381e0.m116597oa(str).isBanned() || CoreModule.f18264c.f20381e0.m116597oa(str).isJailed();
    }
}
