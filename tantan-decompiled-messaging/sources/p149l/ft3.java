package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.CRBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class ft3 {
    /* JADX INFO: renamed from: a */
    public static void m123007a(CRBubbleItemView cRBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cRBubbleItemView.f35412d = (ConstraintLayout) viewGroup.getChildAt(0);
        cRBubbleItemView.f35413e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cRBubbleItemView.f35414f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cRBubbleItemView.f35415g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cRBubbleItemView.f35416h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        cRBubbleItemView.f35417i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        cRBubbleItemView.f35418j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        cRBubbleItemView.f35419k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        cRBubbleItemView.f35420l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cRBubbleItemView.f35421m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cRBubbleItemView.f35422n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cRBubbleItemView.f35423o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        cRBubbleItemView.f35424p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        cRBubbleItemView.f35425q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        cRBubbleItemView.f35426r = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        cRBubbleItemView.f35427s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
