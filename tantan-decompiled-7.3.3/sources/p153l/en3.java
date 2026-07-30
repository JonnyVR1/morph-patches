package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.active.BuzzActiveCard;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class en3 {
    /* JADX INFO: renamed from: a */
    public static void m121418a(BuzzActiveCard buzzActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzActiveCard._card_bg = (VDraweeView) viewGroup.getChildAt(0);
        buzzActiveCard._card_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        buzzActiveCard._card_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        buzzActiveCard._card_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        buzzActiveCard._card_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        buzzActiveCard._card_btn = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        buzzActiveCard._iv_close = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
