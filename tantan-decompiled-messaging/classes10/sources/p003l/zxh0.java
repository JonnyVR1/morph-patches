package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import l.m6c0;
import l.yxh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zxh0 {
    /* JADX INFO: renamed from: a */
    public static void m11460a(yxh0 yxh0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yxh0Var.a = viewGroup.getChildAt(0);
        yxh0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yxh0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yxh0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yxh0Var.e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yxh0Var.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        yxh0Var.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        yxh0Var.h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m11461b(yxh0 yxh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.n2, viewGroup, false);
        m11460a(yxh0Var, viewInflate);
        return viewInflate;
    }
}
