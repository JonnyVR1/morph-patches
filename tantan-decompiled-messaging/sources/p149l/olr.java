package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.sunshine.engine.particle.SceneView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class olr {
    /* JADX INFO: renamed from: a */
    public static void m164988a(mlr mlrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mlrVar.f134494i = (VNavigationBar) viewGroup.getChildAt(0);
        mlrVar.f134495j = (FrameLayout) viewGroup.getChildAt(1);
        mlrVar.f134496k = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mlrVar.f134497l = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        mlrVar.f134498m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mlrVar.f134499n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mlrVar.f134500o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mlrVar.f134501p = (PicksHeaderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        mlrVar.f134502q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        mlrVar.f134503r = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        mlrVar.f134504s = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mlrVar.f134505t = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        mlrVar.f134506u = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        mlrVar.f134507v = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        mlrVar.f134508w = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        mlrVar.f134509x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        mlrVar.f134510y = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        mlrVar.f134511z = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        mlrVar.f134472A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        mlrVar.f134473B = (SceneView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        mlrVar.f134474C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        mlrVar.f134475D = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        mlrVar.f134476E = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m164989b(mlr mlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121416o2, viewGroup, false);
        m164988a(mlrVar, viewInflate);
        return viewInflate;
    }
}
