package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lxm0 {
    /* JADX INFO: renamed from: a */
    public static void m152073a(kxm0 kxm0Var, View view) {
        kxm0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kxm0Var._container = (ConstraintLayout) viewGroup.getChildAt(0);
        kxm0Var._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kxm0Var._info = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kxm0Var._create_btn = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        kxm0Var._close_btn = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m152074b(kxm0 kxm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168410k8, viewGroup, false);
        m152073a(kxm0Var, viewInflate);
        return viewInflate;
    }
}
