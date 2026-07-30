package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class zcf0 {
    /* JADX INFO: renamed from: a */
    public static void m218021a(ycf0 ycf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ycf0Var._toolbar_icon = (VImage) viewGroup.getChildAt(0);
        ycf0Var._skip = (VText) viewGroup.getChildAt(1);
        ycf0Var._title = (VText) viewGroup.getChildAt(2);
        ycf0Var._sub_title = (VText) viewGroup.getChildAt(3);
        ycf0Var._recycler_info = (VRecyclerView) viewGroup.getChildAt(4);
        ycf0Var._continue_ = (VButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m218022b(ycf0 ycf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79528z, viewGroup, false);
        m218021a(ycf0Var, viewInflate);
        return viewInflate;
    }
}
