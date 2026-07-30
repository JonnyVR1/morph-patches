package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverMiddleCardView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p45 {
    /* JADX INFO: renamed from: a */
    public static void m8688a(o45 o45Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o45Var.f6588j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        o45Var.f6589k = (CityCoverMiddleCardView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        o45Var.f6590l = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8689b(o45 o45Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.q1, viewGroup, false);
        m8688a(o45Var, viewInflate);
        return viewInflate;
    }
}
