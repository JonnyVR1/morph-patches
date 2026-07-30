package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes12.dex */
public class dx60 {
    /* JADX INFO: renamed from: a */
    public static void m113992a(bx60 bx60Var, View view) {
        bx60Var.f77766y = (LinearLayout) view;
        bx60Var.f77767z = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m113993b(bx60 bx60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142249n5, viewGroup, false);
        m113992a(bx60Var, viewInflate);
        return viewInflate;
    }
}
