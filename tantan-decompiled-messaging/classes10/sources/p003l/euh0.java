package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import l.duh0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class euh0 {
    /* JADX INFO: renamed from: a */
    public static void m6318a(duh0 duh0Var, View view) {
        duh0Var.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        duh0Var.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        duh0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        duh0Var.d = (FrameLayout) viewGroup.getChildAt(1);
        duh0Var.e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6319b(duh0 duh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.xc, viewGroup, false);
        m6318a(duh0Var, viewInflate);
        return viewInflate;
    }
}
