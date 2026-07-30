package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q9o0 {
    /* JADX INFO: renamed from: a */
    public static void m173660a(VoicePreviewViewModel voicePreviewViewModel, View view) {
        voicePreviewViewModel.f53349a = (VoicePreviewViewModel) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voicePreviewViewModel.f53350b = (VRelative) viewGroup.getChildAt(0);
        voicePreviewViewModel.f53351c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voicePreviewViewModel.f53352d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voicePreviewViewModel.f53353e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voicePreviewViewModel.f53354f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voicePreviewViewModel.f53355g = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        voicePreviewViewModel.f53356h = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        voicePreviewViewModel.f53357i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voicePreviewViewModel.f53358j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voicePreviewViewModel.f53359k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        voicePreviewViewModel.f53360l = (VScroll) viewGroup.getChildAt(1);
        voicePreviewViewModel.f53361m = (FlowLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voicePreviewViewModel.f53362n = (VLinear) viewGroup.getChildAt(2);
        voicePreviewViewModel.f53363o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        voicePreviewViewModel.f53364p = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voicePreviewViewModel.f53365q = (VText) viewGroup.getChildAt(3);
        voicePreviewViewModel.f53366r = (VLinear) viewGroup.getChildAt(4);
        voicePreviewViewModel.f53367s = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voicePreviewViewModel.f53368t = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
