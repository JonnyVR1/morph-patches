package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomCallButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class jtm0 {
    /* JADX INFO: renamed from: a */
    public static void m146910a(VoiceBottomCallButton voiceBottomCallButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBottomCallButton.f53756a = (VDraweeView) viewGroup.getChildAt(0);
        voiceBottomCallButton.f53757b = viewGroup.getChildAt(1);
        voiceBottomCallButton.f53758c = (TextView) viewGroup.getChildAt(2);
    }
}
