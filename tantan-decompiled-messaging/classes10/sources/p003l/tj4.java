package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.i6c0;
import l.sj4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tj4 {
    /* JADX INFO: renamed from: a */
    public static void m9579a(sj4 sj4Var, View view) {
        sj4Var.a = (FrameLayout) view;
        sj4Var.b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9580b(sj4 sj4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(i6c0.v, viewGroup, false);
        m9579a(sj4Var, viewInflate);
        return viewInflate;
    }
}
