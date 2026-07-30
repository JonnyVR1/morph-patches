package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.th30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uh30 {
    /* JADX INFO: renamed from: a */
    public static void m9724a(th30 th30Var, View view) {
        th30Var.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        th30Var.b = viewGroup.getChildAt(0);
        th30Var.c = viewGroup.getChildAt(1);
        th30Var.d = (TextView) viewGroup.getChildAt(2);
        th30Var.e = viewGroup.getChildAt(3);
        th30Var.f = viewGroup.getChildAt(4);
        th30Var.g = viewGroup.getChildAt(5);
        th30Var.h = (LinearLayout) viewGroup.getChildAt(6);
        th30Var.i = (TextView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9725b(th30 th30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5585q0, viewGroup, false);
        m9724a(th30Var, viewInflate);
        return viewInflate;
    }
}
