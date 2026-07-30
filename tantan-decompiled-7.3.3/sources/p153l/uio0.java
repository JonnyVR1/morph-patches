package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uio0 {
    /* JADX INFO: renamed from: a */
    public static void m196297a(VoicePreviewViewModel voicePreviewViewModel, View view) {
        voicePreviewViewModel.f54197a = (VoicePreviewViewModel) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voicePreviewViewModel.f54198b = (VRelative) viewGroup.getChildAt(0);
        voicePreviewViewModel.f54199c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voicePreviewViewModel.f54200d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voicePreviewViewModel.f54201e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voicePreviewViewModel.f54202f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voicePreviewViewModel.f54203g = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        voicePreviewViewModel.f54204h = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        voicePreviewViewModel.f54205i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voicePreviewViewModel.f54206j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voicePreviewViewModel.f54207k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        voicePreviewViewModel.f54208l = (VScroll) viewGroup.getChildAt(1);
        voicePreviewViewModel.f54209m = (FlowLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voicePreviewViewModel.f54210n = (VLinear) viewGroup.getChildAt(2);
        voicePreviewViewModel.f54211o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        voicePreviewViewModel.f54212p = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voicePreviewViewModel.f54213q = (VText) viewGroup.getChildAt(3);
        voicePreviewViewModel.f54214r = (VLinear) viewGroup.getChildAt(4);
        voicePreviewViewModel.f54215s = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voicePreviewViewModel.f54216t = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
