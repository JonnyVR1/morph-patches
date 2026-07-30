package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.vsn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wsn0 {
    /* JADX INFO: renamed from: a */
    public static void m25472a(vsn0 vsn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vsn0Var.a = viewGroup.getChildAt(0);
        vsn0Var.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vsn0Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vsn0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vsn0Var.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vsn0Var.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m25473b(vsn0 vsn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20102z9, viewGroup, false);
        m25472a(vsn0Var, viewInflate);
        return viewInflate;
    }
}
