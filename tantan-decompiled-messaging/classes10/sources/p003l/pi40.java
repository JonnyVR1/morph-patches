package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.quickaudio.NewVoiceCallFloatView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pi40 {
    /* JADX INFO: renamed from: a */
    public static void m8753a(NewVoiceCallFloatView newVoiceCallFloatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newVoiceCallFloatView.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newVoiceCallFloatView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newVoiceCallFloatView.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        newVoiceCallFloatView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        newVoiceCallFloatView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
