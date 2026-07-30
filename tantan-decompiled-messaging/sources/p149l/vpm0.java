package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.voicecall.VoiceCallControlView;
import com.p046p1.mobile.putong.core.p053ui.view.VoiceCallCheckeableImage;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class vpm0 {
    /* JADX INFO: renamed from: a */
    public static void m199280a(VoiceCallControlView voiceCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCallControlView.f32533a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCallControlView.f32534b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCallControlView.f32535c = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        voiceCallControlView.f32536d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceCallControlView.f32537e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCallControlView.f32538f = (VoiceCallCheckeableImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCallControlView.f32539g = (VoiceCallCheckeableImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCallControlView.f32540h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
