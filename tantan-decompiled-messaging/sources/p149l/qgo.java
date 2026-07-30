package p149l;

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
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.newui.view.RadarRipple;
import com.sunshine.engine.particle.SceneView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class qgo {
    /* JADX INFO: renamed from: a */
    public static void m174444a(pgo pgoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pgoVar.f148764c = (VNavigationBar) viewGroup.getChildAt(0);
        pgoVar.f148765d = (FrameLayout) viewGroup.getChildAt(1);
        pgoVar.f148766e = (CoordinatorLayout) viewGroup.getChildAt(2);
        pgoVar.f148767f = (AppBarLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pgoVar.f148768g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        pgoVar.f148769h = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pgoVar.f148770i = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        pgoVar.f148771j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        pgoVar.f148772k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        pgoVar.f148773l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        pgoVar.f148774m = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        pgoVar.f148775n = (Guideline) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        pgoVar.f148776o = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        pgoVar.f148777p = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        pgoVar.f148778q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        pgoVar.f148779r = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(2);
        pgoVar.f148780s = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        pgoVar.f148781t = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        pgoVar.f148782u = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        pgoVar.f148783v = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        pgoVar.f148784w = (SceneView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m174445b(pgo pgoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121279A, viewGroup, false);
        m174444a(pgoVar, viewInflate);
        return viewInflate;
    }
}
