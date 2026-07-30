package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uke {
    /* JADX INFO: renamed from: a */
    public static void m194151a(tke tkeVar, View view) {
        tkeVar.f170857u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tkeVar.f170858v = (VText) viewGroup.getChildAt(0);
        tkeVar.f170859w = (LinearLayout) viewGroup.getChildAt(1);
        tkeVar.f170860x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        tkeVar.f170861y = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194152b(tke tkeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96082x9, viewGroup, false);
        m194151a(tkeVar, viewInflate);
        return viewInflate;
    }
}
