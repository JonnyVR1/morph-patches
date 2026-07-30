package p149l;

import android.app.Dialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.PoiGuidePopWindow;

/* JADX INFO: loaded from: classes12.dex */
public class r980 {
    /* JADX INFO: renamed from: a */
    public static void m178297a(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, String str, gsl gslVar) {
        frh.C16915b c16915b = new frh.C16915b(act, z ? 1 : 2);
        c16915b.m122871b(gslVar);
        c16915b.m122873d(poiGuidePopWindow);
        cwf0 cwf0VarM133794c = i0e.m133794c(str, Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("poi_pop_type", z ? "poi_lighten_guide" : "poi_lighten_click"), vwb.m200311Y("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit)), vwb.m200311Y("user_segment", poiGuidePopWindow.userPostType));
        c16915b.m122872c(str, cwf0VarM133794c);
        c16915b.m122870a().show();
    }

    /* JADX INFO: renamed from: b */
    public static void m178298b(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, gsl gslVar) {
        if (tih.m189189e()) {
            m178297a(act, poiGuidePopWindow, z, lph.f129206Q, gslVar);
        } else {
            new dph.C16422a().m112899b(act).m112902e(poiGuidePopWindow).m112901d(z).m112900c(gslVar).m112898a().show();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m178299c(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, gsl gslVar) {
        if (tih.m189189e()) {
            m178297a(act, poiGuidePopWindow, z, lph.f129206Q, gslVar);
        } else {
            new lph.C18279a().m150865b(act).m150868e(poiGuidePopWindow).m150867d(z).m150866c(gslVar).m150864a().show();
        }
    }
}
