package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.QCBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class bvb0 {
    /* JADX INFO: renamed from: a */
    public static void m106558a(QCBubbleItemView qCBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qCBubbleItemView.f36304d = (ConstraintLayout) viewGroup.getChildAt(0);
        qCBubbleItemView.f36305e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qCBubbleItemView.f36306f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qCBubbleItemView.f36307g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qCBubbleItemView.f36308h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qCBubbleItemView.f36309i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qCBubbleItemView.f36310j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        qCBubbleItemView.f36311k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        qCBubbleItemView.f36312l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qCBubbleItemView.f36313m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qCBubbleItemView.f36314n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qCBubbleItemView.f36315o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        qCBubbleItemView.f36316p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        qCBubbleItemView.f36317q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        qCBubbleItemView.f36318r = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        qCBubbleItemView.f36319s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
