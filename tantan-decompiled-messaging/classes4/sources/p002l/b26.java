package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b26 {
    /* JADX INFO: renamed from: a */
    public static void m10157a(a26 a26Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        a26Var.f7343a = viewGroup.getChildAt(0);
        a26Var.f7344b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        a26Var.f7345c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        a26Var.f7346d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10158b(a26 a26Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19515F, viewGroup, false);
        m10157a(a26Var, viewInflate);
        return viewInflate;
    }
}
