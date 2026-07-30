package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q9o0 {
    /* JADX INFO: renamed from: a */
    public static void m21145a(VoicePreviewViewModel voicePreviewViewModel, View view) {
        voicePreviewViewModel.a = (VoicePreviewViewModel) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voicePreviewViewModel.b = viewGroup.getChildAt(0);
        voicePreviewViewModel.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voicePreviewViewModel.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voicePreviewViewModel.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voicePreviewViewModel.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voicePreviewViewModel.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        voicePreviewViewModel.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        voicePreviewViewModel.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voicePreviewViewModel.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voicePreviewViewModel.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        voicePreviewViewModel.l = viewGroup.getChildAt(1);
        voicePreviewViewModel.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voicePreviewViewModel.n = viewGroup.getChildAt(2);
        voicePreviewViewModel.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        voicePreviewViewModel.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voicePreviewViewModel.q = viewGroup.getChildAt(3);
        voicePreviewViewModel.r = viewGroup.getChildAt(4);
        voicePreviewViewModel.s = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voicePreviewViewModel.t = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
