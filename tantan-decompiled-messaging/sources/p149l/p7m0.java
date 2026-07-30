package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class p7m0 {
    /* JADX INFO: renamed from: a */
    public static void m167761a(o7m0 o7m0Var, View view) {
        o7m0Var._visitors = (VPullUpRecyclerView) view.findViewById(x4c0.f190988W);
        ViewGroup viewGroup = (ViewGroup) view;
        o7m0Var._empty = (NestedScrollView) viewGroup.getChildAt(1);
        o7m0Var._empty_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        o7m0Var._get_privilege = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m167762b(o7m0 o7m0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121353Y1, viewGroup, false);
        m167761a(o7m0Var, viewInflate);
        return viewInflate;
    }
}
