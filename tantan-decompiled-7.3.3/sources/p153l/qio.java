package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.newui.view.RadarRipple;
import com.sunshine.engine.particle.SceneView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class qio {
    /* JADX INFO: renamed from: a */
    public static void m176754a(pio pioVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pioVar.f152560c = (VNavigationBar) viewGroup.getChildAt(0);
        pioVar.f152561d = (FrameLayout) viewGroup.getChildAt(1);
        pioVar.f152562e = (CoordinatorLayout) viewGroup.getChildAt(2);
        pioVar.f152563f = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pioVar.f152564g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        pioVar.f152565h = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pioVar.f152566i = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        pioVar.f152567j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        pioVar.f152568k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        pioVar.f152569l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        pioVar.f152570m = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        pioVar.f152571n = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        pioVar.f152572o = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        pioVar.f152573p = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        pioVar.f152574q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        pioVar.f152575r = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(2);
        pioVar.f152576s = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        pioVar.f152577t = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        pioVar.f152578u = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        pioVar.f152579v = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        pioVar.f152580w = (SceneView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m176755b(pio pioVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151887A, viewGroup, false);
        m176754a(pioVar, viewInflate);
        return viewInflate;
    }
}
