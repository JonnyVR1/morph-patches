package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zcf0 {
    /* JADX INFO: renamed from: a */
    public static void m28686a(ycf0 ycf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ycf0Var._toolbar_icon = viewGroup.getChildAt(0);
        ycf0Var._skip = viewGroup.getChildAt(1);
        ycf0Var._title = viewGroup.getChildAt(2);
        ycf0Var._sub_title = viewGroup.getChildAt(3);
        ycf0Var._recycler_info = viewGroup.getChildAt(4);
        ycf0Var._continue_ = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m28687b(ycf0 ycf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9458z, viewGroup, false);
        m28686a(ycf0Var, viewInflate);
        return viewInflate;
    }
}
