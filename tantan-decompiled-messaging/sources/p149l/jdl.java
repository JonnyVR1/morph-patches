package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import com.p046p1.mobile.putong.core.p053ui.main.LocationPermissionView;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Squared;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jdl {
    /* JADX INFO: renamed from: a */
    public static void m141036a(idl idlVar, View view) {
        idlVar.f112615a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        idlVar.f112616b = (LocationPermissionView) viewGroup.getChildAt(0);
        idlVar.f112617c = (HomeTitleLayout) viewGroup.getChildAt(1);
        idlVar.f112618d = (VFrame) viewGroup.getChildAt(2);
        idlVar.f112619e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        idlVar.f112620f = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        idlVar.f112621g = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        idlVar.f112622h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        idlVar.f112623i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        idlVar.f112624j = (Space) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        idlVar.f112625k = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        idlVar.f112627l = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        idlVar.f112628m = (HomeThemeSlideEmptyCardView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        idlVar.f112629n = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        idlVar.f112630o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        idlVar.f112631p = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        idlVar.f112633q = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        idlVar.f112634r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        idlVar.f112635s = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        idlVar.f112636t = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        idlVar.f112637u = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        idlVar.f112638v = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        idlVar.f112639w = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        idlVar.f112640x = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        idlVar.f112641y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        idlVar.f112642z = (SceneView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        idlVar.f112569A = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        idlVar.f112570B = (SceneView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        idlVar.f112571C = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        idlVar.f112572D = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        idlVar.f112573E = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        idlVar.f112575F = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        idlVar.f112577G = (ConstraintLayout) viewGroup.getChildAt(3);
        idlVar.f112579H = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        idlVar.f112581I = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        idlVar.f112583J = (VLinear) viewGroup.getChildAt(4);
        idlVar.f112585K = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        idlVar.f112587L = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        idlVar.f112589M = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        idlVar.f112591N = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        idlVar.f112593O = (HomeThemeSlideErrorNetView) viewGroup.getChildAt(5);
        idlVar.f112595P = (SuperLikeComboAnimView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m141037b(idl idlVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95883le, viewGroup, false);
        m141036a(idlVar, viewInflate);
        return viewInflate;
    }
}
