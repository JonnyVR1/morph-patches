package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import com.p051p1.mobile.putong.core.p058ui.main.LocationPermissionView;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Squared;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zfl {
    /* JADX INFO: renamed from: a */
    public static void m219542a(yfl yflVar, View view) {
        yflVar.f199585a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yflVar.f199586b = (LocationPermissionView) viewGroup.getChildAt(0);
        yflVar.f199587c = (HomeTitleLayout) viewGroup.getChildAt(1);
        yflVar.f199588d = (VFrame) viewGroup.getChildAt(2);
        yflVar.f199589e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yflVar.f199590f = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        yflVar.f199591g = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        yflVar.f199592h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        yflVar.f199593i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        yflVar.f199594j = (Space) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        yflVar.f199595k = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        yflVar.f199597l = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        yflVar.f199598m = (HomeThemeSlideEmptyCardView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        yflVar.f199599n = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        yflVar.f199600o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        yflVar.f199601p = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        yflVar.f199603q = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        yflVar.f199604r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        yflVar.f199605s = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        yflVar.f199606t = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        yflVar.f199607u = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        yflVar.f199608v = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        yflVar.f199609w = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        yflVar.f199610x = (CardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        yflVar.f199611y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        yflVar.f199612z = (SceneView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        yflVar.f199539A = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        yflVar.f199540B = (SceneView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        yflVar.f199541C = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        yflVar.f199542D = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        yflVar.f199543E = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        yflVar.f199545F = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        yflVar.f199547G = (ConstraintLayout) viewGroup.getChildAt(3);
        yflVar.f199549H = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        yflVar.f199551I = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        yflVar.f199553J = (VLinear) viewGroup.getChildAt(4);
        yflVar.f199555K = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        yflVar.f199557L = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        yflVar.f199559M = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        yflVar.f199561N = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        yflVar.f199563O = (HomeThemeSlideErrorNetView) viewGroup.getChildAt(5);
        yflVar.f199565P = (SuperLikeComboAnimView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m219543b(yfl yflVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126056se, viewGroup, false);
        m219542a(yflVar, viewInflate);
        return viewInflate;
    }
}
