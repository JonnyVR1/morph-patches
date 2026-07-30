package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class qd00 {
    /* JADX INFO: renamed from: a */
    public static void m176125a(pd00 pd00Var, View view) {
        pd00Var.f151649a = (VLinear) view.findViewById(ycc0.f198435R);
        ViewGroup viewGroup = (ViewGroup) view;
        pd00Var.f151650b = (VNavigationBar) viewGroup.getChildAt(0);
        pd00Var.f151651c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m176126b(pd00 pd00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120436E, viewGroup, false);
        m176125a(pd00Var, viewInflate);
        return viewInflate;
    }
}
