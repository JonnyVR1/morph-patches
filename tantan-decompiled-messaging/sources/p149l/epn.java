package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlILikeUserItemView;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class epn {
    /* JADX INFO: renamed from: a */
    public static void m117658a(IntlILikeUserItemView intlILikeUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlILikeUserItemView.f29829a = (FrameLayout) viewGroup.getChildAt(0);
        intlILikeUserItemView.f29830b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlILikeUserItemView.f29831c = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlILikeUserItemView.f29832d = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlILikeUserItemView.f29833e = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlILikeUserItemView.f29834f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        intlILikeUserItemView.f29835g = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlILikeUserItemView.f29836h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        intlILikeUserItemView.f29837i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
    }
}
