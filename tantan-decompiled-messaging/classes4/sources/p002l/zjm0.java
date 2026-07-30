package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.yjm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zjm0 {
    /* JADX INFO: renamed from: a */
    public static void m27397a(yjm0 yjm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yjm0Var.a = viewGroup.getChildAt(0);
        yjm0Var.b = viewGroup.getChildAt(1);
        yjm0Var.c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m27398b(yjm0 yjm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19607M7, viewGroup, false);
        m27397a(yjm0Var, viewInflate);
        return viewInflate;
    }
}
