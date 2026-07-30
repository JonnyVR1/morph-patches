package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ye40 {
    /* JADX INFO: renamed from: a */
    public static String m214333a() {
        return vwb.m200296J(CoreModule.f17545c.f19614V1.f83480S) ? "" : String.format("你身边有%d人刚加入探探，去问个好吧", Integer.valueOf(CoreModule.f17545c.f19614V1.f83480S.size()));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m214334b() {
        if (CoreModule.m29935P().m94658i().mo158232G0() && !CoreModule.m29932K().me_().isFemale() && !vwb.m200296J(CoreModule.f17545c.f19614V1.f83480S) && CoreModule.f17545c.f19614V1.f83480S.size() >= 3) {
            return mqi0.m155944o() > CoreModule.f17545c.f19614V1.f83484W.get().longValue() + TimeUnit.DAYS.toMillis((long) CoreModule.f17554l.m94658i().mo158472y0());
        }
        return false;
    }
}
