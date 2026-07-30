package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetLimitHouseItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gro0 {
    /* JADX INFO: renamed from: a */
    public static void m14034a(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetLimitHouseItemView.a = viewGroup.getChildAt(0);
        voiceSweetLimitHouseItemView.b = (TextView) viewGroup.getChildAt(1);
        voiceSweetLimitHouseItemView.c = (TextView) viewGroup.getChildAt(2);
        voiceSweetLimitHouseItemView.d = viewGroup.getChildAt(3);
    }
}
