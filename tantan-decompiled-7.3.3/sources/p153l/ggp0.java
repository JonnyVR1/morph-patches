package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ggp0 {
    /* JADX INFO: renamed from: a */
    public static void m130190a(dgp0 dgp0Var, View view) {
        dgp0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dgp0Var._layout_empty = viewGroup.getChildAt(0);
        dgp0Var._hock = viewGroup.getChildAt(1);
        dgp0Var._bg = viewGroup.getChildAt(2);
        dgp0Var._top_holder = viewGroup.getChildAt(3);
        dgp0Var._close = (VImage) viewGroup.getChildAt(4);
        dgp0Var._icon = (VImage) viewGroup.getChildAt(5);
        dgp0Var._title = (VText) viewGroup.getChildAt(6);
        dgp0Var._content = (VFrame) viewGroup.getChildAt(7);
        dgp0Var._title_content = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        dgp0Var._notice_content = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m130191b(dgp0 dgp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199080fb, viewGroup, false);
        m130190a(dgp0Var, viewInflate);
        return viewInflate;
    }
}
