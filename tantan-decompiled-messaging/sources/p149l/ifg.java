package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ifg {
    /* JADX INFO: renamed from: a */
    public static void m135921a(hfg hfgVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hfgVar.f107474k = (VText) viewGroup.getChildAt(0);
        hfgVar.f107475l = (VText) viewGroup.getChildAt(1);
        hfgVar.f107476m = (VLinear) viewGroup.getChildAt(4);
        hfgVar.f107477n = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        hfgVar.f107478o = (VText) viewGroup.getChildAt(5);
    }
}
