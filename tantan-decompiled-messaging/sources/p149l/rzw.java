package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class rzw {
    /* JADX INFO: renamed from: a */
    public static void m181799a(qzw qzwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qzwVar.f157103a = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qzwVar.f157104b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        qzwVar.f157105c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        qzwVar.f157106d = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        qzwVar.f157107e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qzwVar.f157108f = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        qzwVar.f157109g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        qzwVar.f157110h = (VButton) viewGroup.getChildAt(2);
        qzwVar.f157111i = (VNavigationBar) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m181800b(qzw qzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95481N6, viewGroup, false);
        m181799a(qzwVar, viewInflate);
        return viewInflate;
    }
}
