package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import l.e6c0;
import l.olp0;
import l.s4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class plp0 {
    /* JADX INFO: renamed from: a */
    public static void m13073a(olp0 olp0Var, View view) {
        olp0Var.a = view.findViewById(s4c0.R);
        ViewGroup viewGroup = (ViewGroup) view;
        olp0Var.b = viewGroup.getChildAt(0);
        olp0Var.c = (FrameLayout) viewGroup.getChildAt(1);
        olp0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        olp0Var.e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        olp0Var.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        olp0Var.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        olp0Var.h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m13074b(olp0 olp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.U, viewGroup, false);
        m13073a(olp0Var, viewInflate);
        return viewInflate;
    }
}
