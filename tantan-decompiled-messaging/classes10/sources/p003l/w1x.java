package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.n6c0;
import l.v1x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w1x {
    /* JADX INFO: renamed from: a */
    public static void m10430a(v1x v1xVar, View view) {
        v1xVar.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v1xVar.b = viewGroup.getChildAt(0);
        v1xVar.c = viewGroup.getChildAt(2);
        v1xVar.d = viewGroup.getChildAt(3);
        v1xVar.e = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10431b(v1x v1xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.X, viewGroup, false);
        m10430a(v1xVar, viewInflate);
        return viewInflate;
    }
}
