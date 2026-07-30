package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlILikeUserItemView;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class ern {
    /* JADX INFO: renamed from: a */
    public static void m122231a(IntlILikeUserItemView intlILikeUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlILikeUserItemView.f30677a = (FrameLayout) viewGroup.getChildAt(0);
        intlILikeUserItemView.f30678b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlILikeUserItemView.f30679c = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlILikeUserItemView.f30680d = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlILikeUserItemView.f30681e = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlILikeUserItemView.f30682f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        intlILikeUserItemView.f30683g = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlILikeUserItemView.f30684h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        intlILikeUserItemView.f30685i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
    }
}
