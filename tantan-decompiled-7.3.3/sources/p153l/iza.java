package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class iza {
    /* JADX INFO: renamed from: a */
    public static void m142797a(CoreStatusSquareEnterView coreStatusSquareEnterView, View view) {
        coreStatusSquareEnterView.f27636d = (CoreStatusSquareEnterView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreStatusSquareEnterView.f27637e = (ConstraintLayout) viewGroup.getChildAt(0);
        coreStatusSquareEnterView.f27638f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreStatusSquareEnterView.f27639g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        coreStatusSquareEnterView.f27640h = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreStatusSquareEnterView.f27641i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        coreStatusSquareEnterView.f27642j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreStatusSquareEnterView.f27643k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        coreStatusSquareEnterView.f27644l = (VText) viewGroup.getChildAt(1);
    }
}
