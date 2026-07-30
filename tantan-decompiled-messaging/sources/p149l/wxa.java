package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wxa {
    /* JADX INFO: renamed from: a */
    public static void m205975a(CoreStatusSquareEnterView coreStatusSquareEnterView, View view) {
        coreStatusSquareEnterView.f26788d = (CoreStatusSquareEnterView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreStatusSquareEnterView.f26789e = (ConstraintLayout) viewGroup.getChildAt(0);
        coreStatusSquareEnterView.f26790f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreStatusSquareEnterView.f26791g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        coreStatusSquareEnterView.f26792h = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreStatusSquareEnterView.f26793i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        coreStatusSquareEnterView.f26794j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreStatusSquareEnterView.f26795k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        coreStatusSquareEnterView.f26796l = (VText) viewGroup.getChildAt(1);
    }
}
