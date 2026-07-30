package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.c520;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d520 {
    /* JADX INFO: renamed from: a */
    public static void m6058a(c520 c520Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c520Var.a = viewGroup.getChildAt(0);
        c520Var.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c520Var.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c520Var.d = (EditText) view.findViewById(u4c0.J8);
        ViewGroup viewGroup2 = (ViewGroup) view;
        c520Var.e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c520Var.f = (FrameLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        c520Var.g = (EditText) view.findViewById(u4c0.X8);
        c520Var.h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        c520Var.i = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        c520Var.j = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
        c520Var.k = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4)).getChildAt(0);
        c520Var.l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4)).getChildAt(1);
        c520Var.m = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m6059b(c520 c520Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.K7, viewGroup, false);
        m6058a(c520Var, viewInflate);
        return viewInflate;
    }
}
