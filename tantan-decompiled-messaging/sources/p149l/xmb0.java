package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.QCBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class xmb0 {
    /* JADX INFO: renamed from: a */
    public static void m210119a(QCBubbleItemView qCBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qCBubbleItemView.f35456d = (ConstraintLayout) viewGroup.getChildAt(0);
        qCBubbleItemView.f35457e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qCBubbleItemView.f35458f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qCBubbleItemView.f35459g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qCBubbleItemView.f35460h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qCBubbleItemView.f35461i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qCBubbleItemView.f35462j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        qCBubbleItemView.f35463k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        qCBubbleItemView.f35464l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qCBubbleItemView.f35465m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qCBubbleItemView.f35466n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qCBubbleItemView.f35467o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        qCBubbleItemView.f35468p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        qCBubbleItemView.f35469q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        qCBubbleItemView.f35470r = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        qCBubbleItemView.f35471s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
