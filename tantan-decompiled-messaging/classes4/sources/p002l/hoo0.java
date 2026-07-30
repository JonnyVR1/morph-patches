package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpLimitItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hoo0 {
    /* JADX INFO: renamed from: a */
    public static void m14663a(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetCpLimitItemView.a = viewGroup.getChildAt(0);
        voiceSweetCpLimitItemView.b = viewGroup.getChildAt(1);
        voiceSweetCpLimitItemView.c = viewGroup.getChildAt(2);
        voiceSweetCpLimitItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceSweetCpLimitItemView.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
