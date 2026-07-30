package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d4h0 {
    /* JADX INFO: renamed from: a */
    public static void m6056a(y3h0 y3h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y3h0Var.f8630f = viewGroup.getChildAt(0);
        y3h0Var.f8631g = (LinearLayout) viewGroup.getChildAt(1);
        y3h0Var.f8632h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        y3h0Var.f8633i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6057b(y3h0 y3h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.lc, viewGroup, false);
        m6056a(y3h0Var, viewInflate);
        return viewInflate;
    }
}
