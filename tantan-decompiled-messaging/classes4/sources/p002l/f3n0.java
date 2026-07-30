package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceCpItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f3n0 {
    /* JADX INFO: renamed from: a */
    public static void m12931a(VoiceCpItemView voiceCpItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCpItemView.d = viewGroup.getChildAt(0);
        voiceCpItemView.e = viewGroup.getChildAt(1);
        voiceCpItemView.f = viewGroup.getChildAt(2);
        voiceCpItemView.g = viewGroup.getChildAt(4);
        voiceCpItemView.h = (TextView) viewGroup.getChildAt(5);
        voiceCpItemView.i = (ImageView) viewGroup.getChildAt(6);
        voiceCpItemView.j = (TextView) viewGroup.getChildAt(7);
    }
}
