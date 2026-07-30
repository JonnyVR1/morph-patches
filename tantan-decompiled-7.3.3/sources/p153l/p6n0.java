package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p6n0 {
    /* JADX INFO: renamed from: a */
    public static void m170915a(o6n0 o6n0Var, View view) {
        o6n0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        o6n0Var._container = (ConstraintLayout) viewGroup.getChildAt(0);
        o6n0Var._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        o6n0Var._info = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        o6n0Var._create_btn = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        o6n0Var._close_btn = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m170916b(o6n0 o6n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199142k8, viewGroup, false);
        m170915a(o6n0Var, viewInflate);
        return viewInflate;
    }
}
