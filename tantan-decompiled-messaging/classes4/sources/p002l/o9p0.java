package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoSwitchItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o9p0 {
    /* JADX INFO: renamed from: a */
    public static void m19329a(VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, View view) {
        voiceVirtualRoomInfoSwitchItem.d = (VoiceVirtualRoomInfoSwitchItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoSwitchItem.e = viewGroup.getChildAt(0);
        voiceVirtualRoomInfoSwitchItem.f = viewGroup.getChildAt(1);
        voiceVirtualRoomInfoSwitchItem.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
