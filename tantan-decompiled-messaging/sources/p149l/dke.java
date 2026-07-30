package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dke {
    /* JADX INFO: renamed from: a */
    public static void m112217a(cke ckeVar, View view) {
        ckeVar.f81326u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ckeVar.f81327v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ckeVar.f81328w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ckeVar.f81329x = (LinearLayout) viewGroup.getChildAt(1);
        ckeVar.f81330y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ckeVar.f81331z = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m112218b(cke ckeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95405Ia, viewGroup, false);
        m112217a(ckeVar, viewInflate);
        return viewInflate;
    }
}
