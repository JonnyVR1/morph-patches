package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uu8 {
    /* JADX INFO: renamed from: a */
    public static void m198174a(CoreGiftLayer coreGiftLayer, View view) {
        coreGiftLayer.f30040a = (CoreGiftLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreGiftLayer.f30041b = (SVGAnimationView) viewGroup.getChildAt(0);
        coreGiftLayer.f30042c = (VideoEffectPlayer) viewGroup.getChildAt(1);
        coreGiftLayer.f30043d = (LinearLayout) viewGroup.getChildAt(2);
        coreGiftLayer.f30044e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        coreGiftLayer.f30045f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreGiftLayer.f30046g = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
