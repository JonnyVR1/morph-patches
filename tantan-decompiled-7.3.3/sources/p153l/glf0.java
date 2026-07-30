package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class glf0 {
    /* JADX INFO: renamed from: a */
    public static void m130651a(flf0 flf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        flf0Var._toolbar_icon = (VImage) viewGroup.getChildAt(0);
        flf0Var._skip = (VText) viewGroup.getChildAt(1);
        flf0Var._title = (VText) viewGroup.getChildAt(2);
        flf0Var._sub_title = (VText) viewGroup.getChildAt(3);
        flf0Var._recycler_info = (VRecyclerView) viewGroup.getChildAt(4);
        flf0Var._continue_ = (VButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m130652b(flf0 flf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109140z, viewGroup, false);
        m130651a(flf0Var, viewInflate);
        return viewInflate;
    }
}
