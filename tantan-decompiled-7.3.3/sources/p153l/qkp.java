package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import com.p051p1.mobile.putong.core.p058ui.main.LocationPermissionView;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qkp {
    /* JADX INFO: renamed from: a */
    public static void m176966a(pkp pkpVar, View view) {
        pkpVar.f152902a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkpVar.f152903b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkpVar.f152904c = (IntlTribeSlideEmptyCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pkpVar.f152905d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pkpVar.f152906e = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        pkpVar.f152907f = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        pkpVar.f152908g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        pkpVar.f152909h = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        pkpVar.f152910i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        pkpVar.f152911j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        pkpVar.f152912k = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        pkpVar.f152914l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        pkpVar.f152915m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        pkpVar.f152916n = (LocationPermissionView) viewGroup.getChildAt(1);
        pkpVar.f152917o = (VFrame) viewGroup.getChildAt(2);
        pkpVar.f152918p = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pkpVar.f152920q = (ConstraintLayout) viewGroup.getChildAt(3);
        pkpVar.f152921r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pkpVar.f152922s = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pkpVar.f152923t = (LinearLayout) viewGroup.getChildAt(4);
        pkpVar.f152924u = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pkpVar.f152925v = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pkpVar.f152926w = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        pkpVar.f152927x = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        pkpVar.f152928y = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        pkpVar.f152929z = (SuperLikeComboAnimView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m176967b(pkp pkpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125414Fd, viewGroup, false);
        m176966a(pkpVar, viewInflate);
        return viewInflate;
    }
}
