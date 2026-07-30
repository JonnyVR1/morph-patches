package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.topbar.dialog.VoiceTopMenuItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bvo0 {
    /* JADX INFO: renamed from: a */
    public static void m10629a(VoiceTopMenuItem voiceTopMenuItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceTopMenuItem.a = viewGroup.getChildAt(0);
        voiceTopMenuItem.b = (TextView) viewGroup.getChildAt(1);
    }
}
