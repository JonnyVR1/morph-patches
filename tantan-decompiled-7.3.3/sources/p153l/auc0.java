package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class auc0 {
    /* JADX INFO: renamed from: a */
    public static void m100369a(ztc0 ztc0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ztc0Var.f205966a = (RelativeLayout) viewGroup.getChildAt(0);
        ztc0Var.f205967b = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ztc0Var.f205968c = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ztc0Var.f205969d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ztc0Var.f205970e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ztc0Var.f205971f = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ztc0Var.f205972g = (RelativeLayout) viewGroup.getChildAt(1);
        ztc0Var.f205973h = (RelativeLayout) viewGroup.getChildAt(2);
        ztc0Var.f205974i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ztc0Var.f205975j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ztc0Var.f205976k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ztc0Var.f205977l = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        ztc0Var.f205978m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        ztc0Var.f205979n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        ztc0Var.f205980o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        ztc0Var.f205981p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        ztc0Var.f205982q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        ztc0Var.f205983r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        ztc0Var.f205984s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(4);
        ztc0Var.f205985t = (RelativeLayout) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m100370b(ztc0 ztc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157090o4, viewGroup, false);
        m100369a(ztc0Var, viewInflate);
        return viewInflate;
    }
}
