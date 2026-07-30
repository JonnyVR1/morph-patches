package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.f6c0;
import l.x020;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y020 {
    /* JADX INFO: renamed from: a */
    public static void m11073a(x020 x020Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        x020Var.b = viewGroup.getChildAt(0);
        x020Var.c = (FrameLayout) viewGroup.getChildAt(1);
        x020Var.d = viewGroup.getChildAt(2);
        x020Var.e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        x020Var.f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        x020Var.g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11074b(x020 x020Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.I7, viewGroup, false);
        m11073a(x020Var, viewInflate);
        return viewInflate;
    }
}
