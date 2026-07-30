package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.voicecall.VoiceCallControlView;
import com.p051p1.mobile.putong.core.p058ui.view.VoiceCallCheckeableImage;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zym0 {
    /* JADX INFO: renamed from: a */
    public static void m222140a(VoiceCallControlView voiceCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallControlView.f33381a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallControlView.f33382b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallControlView.f33383c = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        voiceCallControlView.f33384d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceCallControlView.f33385e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCallControlView.f33386f = (VoiceCallCheckeableImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCallControlView.f33387g = (VoiceCallCheckeableImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCallControlView.f33388h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
