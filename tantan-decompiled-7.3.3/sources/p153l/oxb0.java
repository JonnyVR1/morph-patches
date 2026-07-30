package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.QuickAudioCardView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oxb0 {
    /* JADX INFO: renamed from: a */
    public static void m169684a(QuickAudioCardView quickAudioCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickAudioCardView.f36355a = (VLinear) viewGroup.getChildAt(1);
        quickAudioCardView.f36356b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        quickAudioCardView.f36357c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        quickAudioCardView.f36358d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        quickAudioCardView.f36359e = (VImage) viewGroup.getChildAt(2);
        quickAudioCardView.f36360f = (VRelative) viewGroup.getChildAt(3);
        quickAudioCardView.f36361g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickAudioCardView.f36362h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickAudioCardView.f36363i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        quickAudioCardView.f36364j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        quickAudioCardView.f36365k = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        quickAudioCardView.f36366l = (FrameLayout) viewGroup.getChildAt(4);
        quickAudioCardView.f36367m = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
