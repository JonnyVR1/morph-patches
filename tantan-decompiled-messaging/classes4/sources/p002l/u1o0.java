package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.preview.VoiceMicHelpDialogView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u1o0 {
    /* JADX INFO: renamed from: a */
    public static void m23258a(VoiceMicHelpDialogView voiceMicHelpDialogView, View view) {
        voiceMicHelpDialogView.a = (VoiceMicHelpDialogView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMicHelpDialogView.b = (LinearLayout) viewGroup.getChildAt(0);
        voiceMicHelpDialogView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceMicHelpDialogView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceMicHelpDialogView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceMicHelpDialogView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceMicHelpDialogView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
