package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class uk5 {
    /* JADX INFO: renamed from: a */
    public static void m196470a(tk5 tk5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tk5Var.f174652h = viewGroup.getChildAt(0);
        tk5Var.f174653i = (LinearLayout) viewGroup.getChildAt(1);
        tk5Var.f174654j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tk5Var.f174655k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tk5Var.f174656l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        tk5Var.f174657m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        tk5Var.f174658n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m196471b(tk5 tk5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125872i, viewGroup, false);
        m196470a(tk5Var, viewInflate);
        return viewInflate;
    }
}
