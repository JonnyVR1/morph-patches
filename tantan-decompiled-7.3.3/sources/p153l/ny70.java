package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ny70 {
    /* JADX INFO: renamed from: a */
    public static void m165313a(my70 my70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        my70Var.f139319i = viewGroup.getChildAt(0);
        my70Var.f139320j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        my70Var.f139321k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        my70Var.f139322l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        my70Var.f139323m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        my70Var.f139324n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        my70Var.f139325o = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        my70Var.f139326p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        my70Var.f139327q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        my70Var.f139328r = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        my70Var.f139329s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        my70Var.f139330t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(0);
        my70Var.f139331u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m165314b(my70 my70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198972X4, viewGroup, false);
        m165313a(my70Var, viewInflate);
        return viewInflate;
    }
}
