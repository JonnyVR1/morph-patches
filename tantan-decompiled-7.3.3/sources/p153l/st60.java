package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class st60 {
    /* JADX INFO: renamed from: a */
    public static void m187846a(rt60 rt60Var, View view) {
        rt60Var.f164773a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rt60Var.f164774b = (VNavigationBar) viewGroup.getChildAt(0);
        rt60Var.f164775c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rt60Var.f164776d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rt60Var.f164777e = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        rt60Var.f164778f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        rt60Var.f164779g = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        rt60Var.f164780h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        rt60Var.f164781i = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        rt60Var.f164782j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        rt60Var.f164783k = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        rt60Var.f164784l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        rt60Var.f164785m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        rt60Var.f164786n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        rt60Var.f164787o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m187847b(rt60 rt60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125719Ye, viewGroup, false);
        m187846a(rt60Var, viewInflate);
        return viewInflate;
    }
}
