package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceLiveRoomBgSettingItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nvn0 {
    /* JADX INFO: renamed from: a */
    public static void m19105a(VoiceLiveRoomBgSettingItemView voiceLiveRoomBgSettingItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveRoomBgSettingItemView.a = viewGroup.getChildAt(0);
        voiceLiveRoomBgSettingItemView.b = (ImageView) viewGroup.getChildAt(1);
        voiceLiveRoomBgSettingItemView.c = (ImageView) viewGroup.getChildAt(2);
        voiceLiveRoomBgSettingItemView.d = (TextView) viewGroup.getChildAt(3);
    }
}
