package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class zm20 {
    /* JADX INFO: renamed from: a */
    public static void m220347a(ym20 ym20Var, View view) {
        ym20Var.f200624a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ym20Var.f200625b = (VNavigationBar) viewGroup.getChildAt(0);
        ym20Var.f200626c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ym20Var.f200627d = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ym20Var.f200628e = (VLinear) viewGroup.getChildAt(2);
        ym20Var.f200629f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ym20Var.f200630g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m220348b(ym20 ym20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167577l0, viewGroup, false);
        m220347a(ym20Var, viewInflate);
        return viewInflate;
    }
}
