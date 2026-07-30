package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class p9n0 {
    /* JADX INFO: renamed from: a */
    public static void m171368a(k9n0 k9n0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k9n0Var.f124561a = (ImageView) viewGroup.getChildAt(0);
        k9n0Var.f124562b = (LinearLayout) viewGroup.getChildAt(1);
        k9n0Var.f124563c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        k9n0Var.f124564d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        k9n0Var.f124565e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m171369b(k9n0 k9n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199207p8, viewGroup, false);
        m171368a(k9n0Var, viewInflate);
        return viewInflate;
    }
}
