package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.qap0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xap0 {
    /* JADX INFO: renamed from: a */
    public static void m25817a(qap0 qap0Var, View view) {
        qap0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qap0Var.b = viewGroup.getChildAt(0);
        qap0Var.c = viewGroup.getChildAt(1);
        qap0Var.d = (RelativeLayout) viewGroup.getChildAt(2);
        qap0Var.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qap0Var.f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        qap0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        qap0Var.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        qap0Var.i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qap0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        qap0Var.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m25818b(qap0 qap0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19857gb, viewGroup, false);
        m25817a(qap0Var, viewInflate);
        return viewInflate;
    }
}
