package p153l;

import com.immomo.momomediaext.filter.beauty.ByteDanceConfig;
import com.immomo.momomediaext.filter.beauty.ByteDanceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class cnw {

    /* JADX INFO: renamed from: a */
    private static final List<String> f82791a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static final HashMap<Integer, String> f82792b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private static fb4 f82793c;

    /* JADX INFO: renamed from: a */
    public static void m111542a(fb4 fb4Var) {
        f82793c = fb4Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m111543b() {
        f82792b.clear();
        f82793c = null;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m111544c() {
        List<String> list = f82791a;
        if (list.size() != 2) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: d */
    public static String m111545d(int i) {
        HashMap<Integer, String> map = f82792b;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "";
    }

    /* JADX INFO: renamed from: e */
    public static void m111546e(String str) {
        b7y.m102882c().m102888g("setByteDanceLicensePath: " + str);
        f82792b.put(13, str);
        ByteDanceHelper.setLicensePath(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m111547f(String str) {
        b7y.m102882c().m102888g("setByteDanceModelPath: " + str);
        f82792b.put(12, str);
        ByteDanceHelper.setModelPath(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m111548g(String str) {
        b7y.m102882c().m102888g("setByteDanceResourcePath: " + str);
        ByteDanceConfig.parseBeautyConfig(str);
        f82792b.put(16, str);
        ByteDanceHelper.setResourceRootPath(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m111549h(String str) {
        b7y.m102882c().m102888g("setEngineResourcePath: " + str);
        f82792b.put(20, str);
        s1f.INSTANCE.m184045c(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m111550i(List<String> list) {
        b7y.m102882c().m102888g("setFaceDetectModelPath: " + list.size());
        List<String> list2 = f82791a;
        list2.clear();
        list2.addAll(list);
        if (f82793c == null || list2.size() != 2) {
            return;
        }
        f82793c.m124845W(list2);
    }

    /* JADX INFO: renamed from: j */
    public static void m111551j(String str) {
        b7y.m102882c().m102888g("setGestureModelPath: " + str);
        f82792b.put(2, str);
    }

    /* JADX INFO: renamed from: k */
    public static void m111552k(String str) {
        b7y.m102882c().m102888g("setStylizeFaceModelPath: " + str);
        f82792b.put(21, str);
    }
}
