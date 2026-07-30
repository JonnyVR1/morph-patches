package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VIcon;

/* JADX INFO: loaded from: classes10.dex */
public class quf0 {
    /* JADX INFO: renamed from: a */
    public static void m176597a(puf0 puf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        puf0Var.f151271j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        puf0Var.f151272k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        puf0Var.f151273l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        puf0Var.f151274m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        puf0Var.f151275n = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        puf0Var.f151276o = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        puf0Var.f151277p = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        puf0Var.f151278q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        puf0Var.f151279r = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        puf0Var.f151280s = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        puf0Var.f151281t = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m176598b(puf0 puf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95898mc, viewGroup, false);
        m176597a(puf0Var, viewInflate);
        return viewInflate;
    }
}
