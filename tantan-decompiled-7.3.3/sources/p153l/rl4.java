package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.view.CardLabelItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rl4 {
    /* JADX INFO: renamed from: a */
    public static void m181914a(CardLabelItemView cardLabelItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardLabelItemView.f39258a = (VDraweeView) viewGroup.getChildAt(0);
        cardLabelItemView.f39259b = (VLinear) viewGroup.getChildAt(1);
        cardLabelItemView.f39260c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardLabelItemView.f39261d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardLabelItemView.f39262e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardLabelItemView.f39263f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
