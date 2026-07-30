package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.NewVoiceCallBroadcastView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class gi40 {
    /* JADX INFO: renamed from: a */
    public static void m126251a(NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newVoiceCallBroadcastView._head = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newVoiceCallBroadcastView._name = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        newVoiceCallBroadcastView._reject = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        newVoiceCallBroadcastView._accept = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
