package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nz90 {
    /* JADX INFO: renamed from: a */
    public static void m165368a(mz90 mz90Var, View view) {
        mz90Var.f139487u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mz90Var.f139488v = (LinearLayout) viewGroup.getChildAt(0);
        mz90Var.f139489w = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mz90Var.f139490x = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mz90Var.f139491y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        mz90Var.f139492z = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        mz90Var.f139484A = (LinearLayout) viewGroup.getChildAt(1);
        mz90Var.f139485B = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mz90Var.f139486C = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m165369b(mz90 mz90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125602R9, viewGroup, false);
        m165368a(mz90Var, viewInflate);
        return viewInflate;
    }
}
