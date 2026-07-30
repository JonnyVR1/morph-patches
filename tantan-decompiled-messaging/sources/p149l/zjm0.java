package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zjm0 {
    /* JADX INFO: renamed from: a */
    public static void m219125a(yjm0 yjm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yjm0Var.f198644a = (VDraweeView) viewGroup.getChildAt(0);
        yjm0Var.f198645b = (VText) viewGroup.getChildAt(1);
        yjm0Var.f198646c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m219126b(yjm0 yjm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168111M7, viewGroup, false);
        m219125a(yjm0Var, viewInflate);
        return viewInflate;
    }
}
