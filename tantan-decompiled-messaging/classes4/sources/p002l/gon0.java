package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import l.fon0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gon0 {
    /* JADX INFO: renamed from: a */
    public static void m13993a(fon0 fon0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fon0Var.a = viewGroup.getChildAt(0);
        fon0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fon0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fon0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fon0Var.e = viewGroup.getChildAt(1);
        fon0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fon0Var.g = (ImageView) viewGroup.getChildAt(2);
        fon0Var.h = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m13994b(fon0 fon0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19464A8, viewGroup, false);
        m13993a(fon0Var, viewInflate);
        return viewInflate;
    }
}
