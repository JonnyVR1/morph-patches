package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nt8 {
    /* JADX INFO: renamed from: a */
    public static void m161359a(CoreGiftLayer coreGiftLayer, View view) {
        coreGiftLayer.f29192a = (CoreGiftLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreGiftLayer.f29193b = (SVGAnimationView) viewGroup.getChildAt(0);
        coreGiftLayer.f29194c = (VideoEffectPlayer) viewGroup.getChildAt(1);
        coreGiftLayer.f29195d = (LinearLayout) viewGroup.getChildAt(2);
        coreGiftLayer.f29196e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        coreGiftLayer.f29197f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreGiftLayer.f29198g = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
