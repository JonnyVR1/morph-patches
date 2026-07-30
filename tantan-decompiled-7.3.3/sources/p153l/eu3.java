package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.CRBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class eu3 {
    /* JADX INFO: renamed from: a */
    public static void m122522a(CRBubbleItemView cRBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cRBubbleItemView.f36260d = (ConstraintLayout) viewGroup.getChildAt(0);
        cRBubbleItemView.f36261e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cRBubbleItemView.f36262f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cRBubbleItemView.f36263g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cRBubbleItemView.f36264h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        cRBubbleItemView.f36265i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        cRBubbleItemView.f36266j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        cRBubbleItemView.f36267k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        cRBubbleItemView.f36268l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cRBubbleItemView.f36269m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cRBubbleItemView.f36270n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cRBubbleItemView.f36271o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        cRBubbleItemView.f36272p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        cRBubbleItemView.f36273q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        cRBubbleItemView.f36274r = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        cRBubbleItemView.f36275s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
