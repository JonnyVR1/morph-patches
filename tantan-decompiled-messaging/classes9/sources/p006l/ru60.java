package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ru60 {
    /* JADX INFO: renamed from: a */
    public static void m22949a(qu60 qu60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qu60Var.f20062c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qu60Var.f20063d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qu60Var.f20064e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qu60Var.f20065f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        qu60Var.f20066g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        qu60Var.f20067h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        qu60Var.f20068i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        qu60Var.f20069j = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m22950b(qu60 qu60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9406P, viewGroup, false);
        m22949a(qu60Var, viewInflate);
        return viewInflate;
    }
}
