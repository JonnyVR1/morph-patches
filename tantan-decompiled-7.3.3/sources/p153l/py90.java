package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class py90 {
    /* JADX INFO: renamed from: a */
    public static void m174272a(oy90 oy90Var, View view) {
        oy90Var.f149759a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oy90Var.f149760b = (VText) viewGroup.getChildAt(0);
        oy90Var.f149761c = (VLinear) viewGroup.getChildAt(1);
        oy90Var.f149762d = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oy90Var.f149763e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oy90Var.f149764f = (VLinear) viewGroup.getChildAt(2);
        oy90Var.f149765g = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        oy90Var.f149766h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        oy90Var.f149767i = (VLinear) viewGroup.getChildAt(3);
        oy90Var.f149768j = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        oy90Var.f149769k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        oy90Var.f149770l = (VLinear) viewGroup.getChildAt(4);
        oy90Var.f149771m = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        oy90Var.f149772n = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        oy90Var.f149773o = (VLinear) viewGroup.getChildAt(5);
        oy90Var.f149774p = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        oy90Var.f149775q = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        oy90Var.f149776r = (VLinear) viewGroup.getChildAt(6);
        oy90Var.f149777s = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        oy90Var.f149778t = (ImageView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        oy90Var.f149779u = (LinearLayout) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m174273b(oy90 oy90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125459Ia, viewGroup, false);
        m174272a(oy90Var, viewInflate);
        return viewInflate;
    }
}
