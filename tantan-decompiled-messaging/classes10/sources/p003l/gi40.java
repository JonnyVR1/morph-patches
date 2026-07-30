package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.quickaudio.NewVoiceCallBroadcastView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gi40 {
    /* JADX INFO: renamed from: a */
    public static void m6648a(NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newVoiceCallBroadcastView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newVoiceCallBroadcastView.i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        newVoiceCallBroadcastView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        newVoiceCallBroadcastView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
