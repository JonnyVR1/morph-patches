package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.sunshine.engine.particle.SceneView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class pnr {
    /* JADX INFO: renamed from: a */
    public static void m173076a(nnr nnrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nnrVar.f142843i = (VNavigationBar) viewGroup.getChildAt(0);
        nnrVar.f142844j = (FrameLayout) viewGroup.getChildAt(1);
        nnrVar.f142845k = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nnrVar.f142846l = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        nnrVar.f142847m = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        nnrVar.f142848n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        nnrVar.f142849o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        nnrVar.f142850p = (PicksHeaderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        nnrVar.f142851q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        nnrVar.f142852r = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        nnrVar.f142853s = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nnrVar.f142854t = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        nnrVar.f142855u = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        nnrVar.f142856v = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        nnrVar.f142857w = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        nnrVar.f142858x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        nnrVar.f142859y = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        nnrVar.f142860z = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        nnrVar.f142821A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        nnrVar.f142822B = (SceneView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        nnrVar.f142823C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        nnrVar.f142824D = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        nnrVar.f142825E = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m173077b(nnr nnrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152024o2, viewGroup, false);
        m173076a(nnrVar, viewInflate);
        return viewInflate;
    }
}
