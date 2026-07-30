package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import com.p046p1.mobile.putong.core.p053ui.main.LocationPermissionView;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qip {
    /* JADX INFO: renamed from: a */
    public static void m174902a(pip pipVar, View view) {
        pipVar.f149635a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pipVar.f149636b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pipVar.f149637c = (IntlTribeSlideEmptyCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pipVar.f149638d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pipVar.f149639e = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        pipVar.f149640f = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        pipVar.f149641g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        pipVar.f149642h = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        pipVar.f149643i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        pipVar.f149644j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        pipVar.f149645k = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        pipVar.f149647l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        pipVar.f149648m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        pipVar.f149649n = (LocationPermissionView) viewGroup.getChildAt(1);
        pipVar.f149650o = (VFrame) viewGroup.getChildAt(2);
        pipVar.f149651p = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pipVar.f149653q = (ConstraintLayout) viewGroup.getChildAt(3);
        pipVar.f149654r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pipVar.f149655s = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pipVar.f149656t = (LinearLayout) viewGroup.getChildAt(4);
        pipVar.f149657u = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pipVar.f149658v = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pipVar.f149659w = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        pipVar.f149660x = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        pipVar.f149661y = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        pipVar.f149662z = (SuperLikeComboAnimView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m174903b(pip pipVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96103yd, viewGroup, false);
        m174902a(pipVar, viewInflate);
        return viewInflate;
    }
}
