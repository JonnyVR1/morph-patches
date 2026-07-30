package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.MomentBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class d900 {
    /* JADX INFO: renamed from: a */
    public static void m110410a(MomentBubbleItemView momentBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentBubbleItemView.f35440d = (ConstraintLayout) viewGroup.getChildAt(0);
        momentBubbleItemView.f35441e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentBubbleItemView.f35442f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentBubbleItemView.f35443g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentBubbleItemView.f35444h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentBubbleItemView.f35445i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentBubbleItemView.f35446j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        momentBubbleItemView.f35447k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        momentBubbleItemView.f35448l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentBubbleItemView.f35449m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentBubbleItemView.f35450n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        momentBubbleItemView.f35451o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        momentBubbleItemView.f35452p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        momentBubbleItemView.f35453q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        momentBubbleItemView.f35454r = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        momentBubbleItemView.f35455s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
