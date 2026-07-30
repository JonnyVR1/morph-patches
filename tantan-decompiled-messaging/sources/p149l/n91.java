package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class n91 {
    /* JADX INFO: renamed from: a */
    public static void m158525a(m91 m91Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        m91Var.f132647a = viewGroup.getChildAt(0);
        m91Var.f132648b = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        m91Var.f132649c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        m91Var.f132650d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        m91Var.f132651e = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        m91Var.f132652f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        m91Var.f132653g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        m91Var.f132654h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        m91Var.f132655i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m158526b(m91 m91Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167983C, viewGroup, false);
        m158525a(m91Var, viewInflate);
        return viewInflate;
    }
}
