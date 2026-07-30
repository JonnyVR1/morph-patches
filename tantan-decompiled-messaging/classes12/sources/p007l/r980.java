package p007l;

import android.app.Dialog;
import com.p000p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p1.mobile.android.app.Act;
import l.cwf0;
import l.i0e;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r980 {
    /* JADX INFO: renamed from: a */
    public static void m13886a(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, String str, gsl gslVar) {
        frh.C2386b c2386b = new frh.C2386b(act, z ? 1 : 2);
        c2386b.m10315b(gslVar);
        c2386b.m10317d(poiGuidePopWindow);
        cwf0 cwf0VarC = i0e.c(str, Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("poi_pop_type", z ? "poi_lighten_guide" : "poi_lighten_click"), vwb.Y("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit)), vwb.Y("user_segment", poiGuidePopWindow.userPostType)});
        c2386b.m10316c(str, cwf0VarC);
        c2386b.m10314a().show();
    }

    /* JADX INFO: renamed from: b */
    public static void m13887b(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, gsl gslVar) {
        if (tih.m14556e()) {
            m13886a(act, poiGuidePopWindow, z, lph.f10090Q, gslVar);
        } else {
            new dph.C2363a().m9547b(act).m9550e(poiGuidePopWindow).m9549d(z).m9548c(gslVar).m9546a().show();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m13888c(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, gsl gslVar) {
        if (tih.m14556e()) {
            m13886a(act, poiGuidePopWindow, z, lph.f10090Q, gslVar);
        } else {
            new lph.C2419a().m11692b(act).m11695e(poiGuidePopWindow).m11694d(z).m11693c(gslVar).m11691a().show();
        }
    }
}
