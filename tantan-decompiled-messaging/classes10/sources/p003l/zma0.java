package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.yma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zma0 {
    /* JADX INFO: renamed from: a */
    public static void m11435a(yma0 yma0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yma0Var.a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yma0Var.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yma0Var.c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11436b(yma0 yma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.J0, viewGroup, false);
        m11435a(yma0Var, viewInflate);
        return viewInflate;
    }
}
