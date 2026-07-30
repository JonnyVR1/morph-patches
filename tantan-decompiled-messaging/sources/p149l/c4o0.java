package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes4.dex */
public class c4o0 {
    /* JADX INFO: renamed from: a */
    public static void m105233a(VoiceNewOperationItemWebView voiceNewOperationItemWebView, View view) {
        voiceNewOperationItemWebView.f53284a = (VoiceNewOperationItemWebView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceNewOperationItemWebView.f53285b = (FrameLayout) viewGroup.getChildAt(0);
        voiceNewOperationItemWebView.f53286c = (MKWebView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceNewOperationItemWebView.f53287d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
