package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class otn0 {
    /* JADX INFO: renamed from: a */
    public static void m165949a(ntn0 ntn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ntn0Var._empty = viewGroup.getChildAt(0);
        ntn0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ntn0Var._content = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ntn0Var._iknowBtn = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m165950b(ntn0 ntn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168593y9, viewGroup, false);
        m165949a(ntn0Var, viewInflate);
        return viewInflate;
    }
}
