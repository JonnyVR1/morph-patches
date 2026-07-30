package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceLiveRoomBgSettingItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class r4o0 {
    /* JADX INFO: renamed from: a */
    public static void m179783a(VoiceLiveRoomBgSettingItemView voiceLiveRoomBgSettingItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveRoomBgSettingItemView.f54232a = (VDraweeView) viewGroup.getChildAt(0);
        voiceLiveRoomBgSettingItemView.f54233b = (ImageView) viewGroup.getChildAt(1);
        voiceLiveRoomBgSettingItemView.f54234c = (ImageView) viewGroup.getChildAt(2);
        voiceLiveRoomBgSettingItemView.f54235d = (TextView) viewGroup.getChildAt(3);
    }
}
