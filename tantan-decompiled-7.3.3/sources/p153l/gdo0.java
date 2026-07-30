package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView;

/* JADX INFO: loaded from: classes4.dex */
public class gdo0 {
    /* JADX INFO: renamed from: a */
    public static void m129936a(VoiceNewOperationItemWebView voiceNewOperationItemWebView, View view) {
        voiceNewOperationItemWebView.f54132a = (VoiceNewOperationItemWebView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceNewOperationItemWebView.f54133b = (FrameLayout) viewGroup.getChildAt(0);
        voiceNewOperationItemWebView.f54134c = (MKWebView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceNewOperationItemWebView.f54135d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
