package p149l;

import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes13.dex */
public class vdt {
    /* JADX INFO: renamed from: a */
    public static boolean m198091a() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m198092b(int i) {
        if (i == 3 ? uvr.m196090g().m195866j7() : uvr.m196087d().m162683O0()) {
            return m198091a() || m198094d();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m198093c() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m198094d() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.oversea_chinese);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m198095e() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan);
    }
}
