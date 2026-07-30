package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetTimeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jto0 {
    /* JADX INFO: renamed from: a */
    public static void m16227a(VoiceSweetTimeView voiceSweetTimeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetTimeView.a = (TextView) viewGroup.getChildAt(0);
        voiceSweetTimeView.b = (TextView) viewGroup.getChildAt(1);
        voiceSweetTimeView.c = (TextView) viewGroup.getChildAt(2);
        voiceSweetTimeView.d = (TextView) viewGroup.getChildAt(3);
        voiceSweetTimeView.e = (TextView) viewGroup.getChildAt(4);
        voiceSweetTimeView.f = (TextView) viewGroup.getChildAt(5);
    }
}
