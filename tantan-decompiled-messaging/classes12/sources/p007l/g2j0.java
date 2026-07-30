package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g2j0 {
    /* JADX INFO: renamed from: a */
    public static void m10364a(f2j0 f2j0Var, View view) {
        f2j0Var.f7526a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        f2j0Var.f7527b = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        f2j0Var.f7528c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        f2j0Var.f7529d = viewGroup.getChildAt(1);
        f2j0Var.f7530e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        f2j0Var.f7531f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        f2j0Var.f7532g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        f2j0Var.f7533h = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m10365b(f2j0 f2j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11067I3, viewGroup, false);
        m10364a(f2j0Var, viewInflate);
        return viewInflate;
    }
}
