package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualSwitchButton;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoSwitchItem;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sip0 {
    /* JADX INFO: renamed from: a */
    public static void m186029a(VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, View view) {
        voiceVirtualRoomInfoSwitchItem._root = (VoiceVirtualRoomInfoSwitchItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoSwitchItem._title = (VText) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoSwitchItem._fl_switcher = (VFrame) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoSwitchItem._switcher = (VirtualSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
