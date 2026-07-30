package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class yje {
    /* JADX INFO: renamed from: a */
    public static void m215063a(xje xjeVar, View view) {
        xjeVar.f193207u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xjeVar.f193208v = (VLinear) viewGroup.getChildAt(0);
        xjeVar.f193209w = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xjeVar.f193210x = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xjeVar.f193211y = (VRecyclerView) viewGroup.getChildAt(1);
        xjeVar.f193212z = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m215064b(xje xjeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95956q2, viewGroup, false);
        m215063a(xjeVar, viewInflate);
        return viewInflate;
    }
}
