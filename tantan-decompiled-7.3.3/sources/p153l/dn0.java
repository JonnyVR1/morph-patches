package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class dn0 {
    /* JADX INFO: renamed from: a */
    public static void m117039a(cn0 cn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cn0Var.f82671k = viewGroup.getChildAt(0);
        cn0Var.f82672l = (LinearLayout) viewGroup.getChildAt(1);
        cn0Var.f82673m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cn0Var.f82674n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        cn0Var.f82675o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        cn0Var.f82676p = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m117040b(cn0 cn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199258t7, viewGroup, false);
        m117039a(cn0Var, viewInflate);
        return viewInflate;
    }
}
