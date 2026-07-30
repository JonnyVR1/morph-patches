package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c4o0 {
    /* JADX INFO: renamed from: a */
    public static void m10744a(VoiceNewOperationItemWebView voiceNewOperationItemWebView, View view) {
        voiceNewOperationItemWebView.a = (VoiceNewOperationItemWebView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceNewOperationItemWebView.b = (FrameLayout) viewGroup.getChildAt(0);
        voiceNewOperationItemWebView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceNewOperationItemWebView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
