package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class txw {
    /* JADX INFO: renamed from: a */
    public static void m190988a(sxw sxwVar, View view) {
        sxwVar.f166832c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sxwVar.f166833d = (VText) viewGroup.getChildAt(0);
        sxwVar.f166834e = (VFrame) viewGroup.getChildAt(1);
        sxwVar.f166835f = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sxwVar.f166836g = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m190989b(sxw sxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137317Q, viewGroup, false);
        m190988a(sxwVar, viewInflate);
        return viewInflate;
    }
}
