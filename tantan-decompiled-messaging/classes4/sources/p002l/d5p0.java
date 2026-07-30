package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d5p0 {
    /* JADX INFO: renamed from: a */
    public static void m11603a(VoiceVirtualFansView voiceVirtualFansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualFansView.a = (TextView) viewGroup.getChildAt(0);
        voiceVirtualFansView.b = viewGroup.getChildAt(1);
    }
}
