package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.mediator.d;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pab0 {
    /* JADX INFO: renamed from: a */
    public static void m8719a(d dVar, View view) {
        dVar.m = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dVar.n = (FrameLayout) viewGroup.getChildAt(0);
        dVar.o = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dVar.p = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dVar.q = viewGroup.getChildAt(1);
        dVar.r = (LinearLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8720b(d dVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.V1, viewGroup, false);
        m8719a(dVar, viewInflate);
        return viewInflate;
    }
}
