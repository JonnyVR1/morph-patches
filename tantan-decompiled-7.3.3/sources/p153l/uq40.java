package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.NewVoiceCallBroadcastView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class uq40 {
    /* JADX INFO: renamed from: a */
    public static void m197217a(NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newVoiceCallBroadcastView._head = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newVoiceCallBroadcastView._name = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        newVoiceCallBroadcastView._reject = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        newVoiceCallBroadcastView._accept = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
