package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class rhi0 {
    /* JADX INFO: renamed from: a */
    public static void m179383a(qhi0 qhi0Var, View view) {
        qhi0Var.f154469a = (FrameLayout) view;
        qhi0Var.f154470b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m179384b(qhi0 qhi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(j6c0.f116439a, viewGroup, false);
        m179383a(qhi0Var, viewInflate);
        return viewInflate;
    }
}
