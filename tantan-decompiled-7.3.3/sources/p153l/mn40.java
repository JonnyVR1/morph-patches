package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class mn40 {
    /* JADX INFO: renamed from: a */
    public static String m159113a() {
        return jyb.m147479J(CoreModule.f18264c.f20356V1.f150516S) ? "" : String.format("你身边有%d人刚加入探探，去问个好吧", Integer.valueOf(CoreModule.f18264c.f20356V1.f150516S.size()));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m159114b() {
        if (CoreModule.m30933P().m143412i().mo180324G0() && !CoreModule.m30930K().me_().isFemale() && !jyb.m147479J(CoreModule.f18264c.f20356V1.f150516S) && CoreModule.f18264c.f20356V1.f150516S.size() >= 3) {
            return pzi0.m174454o() > CoreModule.f18264c.f20356V1.f150520W.get().longValue() + TimeUnit.DAYS.toMillis((long) CoreModule.f18273l.m143412i().mo180564y0());
        }
        return false;
    }
}
