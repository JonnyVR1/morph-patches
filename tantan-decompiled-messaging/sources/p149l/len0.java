package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class len0 {
    /* JADX INFO: renamed from: a */
    public static void m149592a(ken0 ken0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ken0Var.f122724a = (VNavigationBar) viewGroup.getChildAt(0);
        ken0Var.f122725b = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ken0Var.f122726c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ken0Var.f122727d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ken0Var.f122728e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149593b(ken0 ken0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162752g0, viewGroup, false);
        m149592a(ken0Var, viewInflate);
        return viewInflate;
    }
}
