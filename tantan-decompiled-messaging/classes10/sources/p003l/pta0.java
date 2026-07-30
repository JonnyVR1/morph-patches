package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import l.f6c0;
import l.ota0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pta0 {
    /* JADX INFO: renamed from: a */
    public static void m8794a(ota0 ota0Var, View view) {
        ota0Var.v = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ota0Var.w = viewGroup.getChildAt(0);
        ota0Var.x = viewGroup.getChildAt(1);
        ota0Var.y = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8795b(ota0 ota0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.na, viewGroup, false);
        m8794a(ota0Var, viewInflate);
        return viewInflate;
    }
}
