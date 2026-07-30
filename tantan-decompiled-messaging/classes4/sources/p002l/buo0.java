package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class buo0 {
    /* JADX INFO: renamed from: a */
    public static void m10625a(VoiceSweetUserItemView voiceSweetUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetUserItemView.a = viewGroup.getChildAt(0);
        voiceSweetUserItemView.b = viewGroup.getChildAt(1);
        voiceSweetUserItemView.c = (LinearLayout) viewGroup.getChildAt(2);
        voiceSweetUserItemView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceSweetUserItemView.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceSweetUserItemView.f = viewGroup.getChildAt(3);
        voiceSweetUserItemView.g = viewGroup.getChildAt(4);
    }
}
