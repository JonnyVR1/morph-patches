package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class f9k0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f96492a = {"https://static.tancdn.com/pe-webplatform/GghPdDhRJKFHKa0-3M3meQvh.jpg", "https://static.tancdn.com/pe-webplatform/6HYUBJZbEOZjvhpT7LygqrN_.jpg", "https://static.tancdn.com/pe-webplatform/BF2hKaNz2MFGVQoAHC-Lmkvm.jpg", "https://static.tancdn.com/pe-webplatform/enA_mueXRZC9W9-182d5p_8y.jpg", "https://static.tancdn.com/pe-webplatform/jeuh_MGyxNcUDD19Ojsj1OBa.jpg", "https://static.tancdn.com/pe-webplatform/kOYDyFNGen7JaBfVIVThCG3M.jpg", "https://static.tancdn.com/pe-webplatform/v0GMBILhDJ-kQ2ahn8tAB0e5.jpg", "https://static.tancdn.com/pe-webplatform/IDaiY4KD3F3ncRqPnziA5Ssw.jpg", "https://static.tancdn.com/pe-webplatform/bVvaeP5EU7QDgceHgOBL25_Q.jpg"};

    /* JADX INFO: renamed from: a */
    public static boolean m120088a() {
        return !NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) || myf.m157033M(CoreModule.f17545c.f19639e0.m169527p9()) || CoreModule.f17545c.f19639e0.m169527p9().isBanned() || CoreModule.f17545c.f19639e0.m169527p9().isJailed();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m120089b(User user) {
        return myf.m157033M(user) || user.isBanned();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m120090c(String str) {
        return !NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(str)) || myf.m157033M(CoreModule.f17545c.f19639e0.m169524oa(str)) || CoreModule.f17545c.f19639e0.m169524oa(str).isBanned() || CoreModule.f17545c.f19639e0.m169524oa(str).isJailed();
    }
}
