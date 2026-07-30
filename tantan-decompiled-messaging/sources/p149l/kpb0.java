package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.QuickAudioCardView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kpb0 {
    /* JADX INFO: renamed from: a */
    public static void m146838a(QuickAudioCardView quickAudioCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickAudioCardView.f35507a = (VLinear) viewGroup.getChildAt(1);
        quickAudioCardView.f35508b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        quickAudioCardView.f35509c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        quickAudioCardView.f35510d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        quickAudioCardView.f35511e = (VImage) viewGroup.getChildAt(2);
        quickAudioCardView.f35512f = (VRelative) viewGroup.getChildAt(3);
        quickAudioCardView.f35513g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickAudioCardView.f35514h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickAudioCardView.f35515i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        quickAudioCardView.f35516j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        quickAudioCardView.f35517k = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        quickAudioCardView.f35518l = (FrameLayout) viewGroup.getChildAt(4);
        quickAudioCardView.f35519m = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
