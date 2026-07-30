package p149l;

import com.immomo.momomediaext.filter.beauty.ByteDanceConfig;
import com.immomo.momomediaext.filter.beauty.ByteDanceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dkw {

    /* JADX INFO: renamed from: a */
    private static final List<String> f86712a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static final HashMap<Integer, String> f86713b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private static ga4 f86714c;

    /* JADX INFO: renamed from: a */
    public static void m112274a(ga4 ga4Var) {
        f86714c = ga4Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m112275b() {
        f86713b.clear();
        f86714c = null;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m112276c() {
        List<String> list = f86712a;
        if (list.size() != 2) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: d */
    public static String m112277d(int i) {
        HashMap<Integer, String> map = f86713b;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "";
    }

    /* JADX INFO: renamed from: e */
    public static void m112278e(String str) {
        eyx.m118802c().m118808g("setByteDanceLicensePath: " + str);
        f86713b.put(13, str);
        ByteDanceHelper.setLicensePath(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m112279f(String str) {
        eyx.m118802c().m118808g("setByteDanceModelPath: " + str);
        f86713b.put(12, str);
        ByteDanceHelper.setModelPath(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m112280g(String str) {
        eyx.m118802c().m118808g("setByteDanceResourcePath: " + str);
        ByteDanceConfig.parseBeautyConfig(str);
        f86713b.put(16, str);
        ByteDanceHelper.setResourceRootPath(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m112281h(String str) {
        eyx.m118802c().m118808g("setEngineResourcePath: " + str);
        f86713b.put(20, str);
        o0f.INSTANCE.m162148c(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m112282i(List<String> list) {
        eyx.m118802c().m118808g("setFaceDetectModelPath: " + list.size());
        List<String> list2 = f86712a;
        list2.clear();
        list2.addAll(list);
        if (f86714c == null || list2.size() != 2) {
            return;
        }
        f86714c.m124892W(list2);
    }

    /* JADX INFO: renamed from: j */
    public static void m112283j(String str) {
        eyx.m118802c().m118808g("setGestureModelPath: " + str);
        f86713b.put(2, str);
    }

    /* JADX INFO: renamed from: k */
    public static void m112284k(String str) {
        eyx.m118802c().m118808g("setStylizeFaceModelPath: " + str);
        f86713b.put(21, str);
    }
}
