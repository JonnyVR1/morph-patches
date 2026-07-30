package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u5n0 {
    /* JADX INFO: renamed from: a */
    public static void m23288a(VoiceFansView voiceFansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceFansView.a = viewGroup.getChildAt(0);
        voiceFansView.b = (TextView) viewGroup.getChildAt(1);
    }
}
