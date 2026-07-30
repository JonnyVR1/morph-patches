package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.MomentBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class mh00 {
    /* JADX INFO: renamed from: a */
    public static void m158397a(MomentBubbleItemView momentBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentBubbleItemView.f36288d = (ConstraintLayout) viewGroup.getChildAt(0);
        momentBubbleItemView.f36289e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentBubbleItemView.f36290f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentBubbleItemView.f36291g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentBubbleItemView.f36292h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentBubbleItemView.f36293i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentBubbleItemView.f36294j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        momentBubbleItemView.f36295k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        momentBubbleItemView.f36296l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentBubbleItemView.f36297m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentBubbleItemView.f36298n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        momentBubbleItemView.f36299o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        momentBubbleItemView.f36300p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        momentBubbleItemView.f36301q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        momentBubbleItemView.f36302r = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        momentBubbleItemView.f36303s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
