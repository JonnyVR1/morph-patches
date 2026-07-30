package p153l;

import android.app.Dialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;

/* JADX INFO: loaded from: classes13.dex */
public class xh80 {
    /* JADX INFO: renamed from: a */
    public static void m211022a(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, String str, uul uulVar) {
        ush.C20657b c20657b = new ush.C20657b(act, z ? 1 : 2);
        c20657b.m197937b(uulVar);
        c20657b.m197939d(poiGuidePopWindow);
        l4g0 l4g0VarM204399c = w1e.m204399c(str, Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("poi_pop_type", z ? "poi_lighten_guide" : "poi_lighten_click"), jyb.m147494Y("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit)), jyb.m147494Y("user_segment", poiGuidePopWindow.userPostType));
        c20657b.m197938c(str, l4g0VarM204399c);
        c20657b.m197936a().show();
    }

    /* JADX INFO: renamed from: b */
    public static void m211023b(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, uul uulVar) {
        if (ikh.m140297e()) {
            m211022a(act, poiGuidePopWindow, z, arh.f72935Q, uulVar);
        } else {
            new sqh.C20134a().m187546b(act).m187549e(poiGuidePopWindow).m187548d(z).m187547c(uulVar).m187545a().show();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m211024c(Act act, PoiGuidePopWindow poiGuidePopWindow, boolean z, uul uulVar) {
        if (ikh.m140297e()) {
            m211022a(act, poiGuidePopWindow, z, arh.f72935Q, uulVar);
        } else {
            new arh.C15805a().m99698b(act).m99701e(poiGuidePopWindow).m99700d(z).m99699c(uulVar).m99697a().show();
        }
    }
}
