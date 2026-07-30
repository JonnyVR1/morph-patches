package p009l;

import com.p1.mobile.putong.core.CoreModule;
import java.util.concurrent.TimeUnit;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ye40 {
    /* JADX INFO: renamed from: a */
    public static String m25300a() {
        return vwb.J(CoreModule.c.V1.S) ? "" : String.format("你身边有%d人刚加入探探，去问个好吧", Integer.valueOf(CoreModule.c.V1.S.size()));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25301b() {
        if (CoreModule.P().i().G0() && !CoreModule.K().me_().isFemale() && !vwb.J(CoreModule.c.V1.S) && CoreModule.c.V1.S.size() >= 3) {
            return mqi0.m18550o() > ((Long) CoreModule.c.V1.W.get()).longValue() + TimeUnit.DAYS.toMillis((long) CoreModule.l.i().y0());
        }
        return false;
    }
}
