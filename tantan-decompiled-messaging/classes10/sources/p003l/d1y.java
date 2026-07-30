package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.b1y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d1y {
    /* JADX INFO: renamed from: a */
    public static void m6035a(b1y b1yVar, View view) {
        b1yVar.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b1yVar.b = viewGroup.getChildAt(0);
        b1yVar.c = viewGroup.getChildAt(1);
        b1yVar.d = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6036b(b1y b1yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5596t0, viewGroup, false);
        m6035a(b1yVar, viewInflate);
        return viewInflate;
    }
}
