package p153l;

import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes13.dex */
public class wft {
    /* JADX INFO: renamed from: a */
    public static boolean m206158a() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m206159b(int i) {
        if (i == 3 ? vxr.m203879g().m203653j7() : vxr.m203876d().m170990O0()) {
            return m206158a() || m206161d();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m206160c() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m206161d() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.oversea_chinese);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m206162e() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan);
    }
}
