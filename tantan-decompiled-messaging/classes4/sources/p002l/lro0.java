package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lro0 {
    /* JADX INFO: renamed from: a */
    public static void m17387a(VoiceSweetListItemView voiceSweetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetListItemView.d = (ImageView) viewGroup.getChildAt(0);
        voiceSweetListItemView.e = (TextView) viewGroup.getChildAt(1);
        voiceSweetListItemView.f = (TextView) viewGroup.getChildAt(2);
        voiceSweetListItemView.g = (TextView) viewGroup.getChildAt(3);
        voiceSweetListItemView.h = viewGroup.getChildAt(4);
    }
}
