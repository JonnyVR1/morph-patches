package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import p147v.VImage;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class vml0 {
    /* JADX INFO: renamed from: a */
    public static void m198952a(uml0 uml0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uml0Var.f177265a = (VNavigationBar) viewGroup.getChildAt(0);
        uml0Var.f177266b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        uml0Var.f177267c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        uml0Var.f177268d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        uml0Var.f177269e = (VipLocationItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        uml0Var.f177270f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        uml0Var.f177271g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        uml0Var.f177272h = (VList) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        uml0Var.f177273i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198953b(uml0 uml0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95519Pc, viewGroup, false);
        m198952a(uml0Var, viewInflate);
        return viewInflate;
    }
}
