package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class h9h {
    /* JADX INFO: renamed from: a */
    public static void m134058a(g9h g9hVar, View view) {
        g9hVar.f102847a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g9hVar.f102848b = (VNavigationBar) viewGroup.getChildAt(0);
        g9hVar.f102849c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134059b(g9h g9hVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173544N0, viewGroup, false);
        m134058a(g9hVar, viewInflate);
        return viewInflate;
    }
}
