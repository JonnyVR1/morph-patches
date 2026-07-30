package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualSwitchButton;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoSwitchItem;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o9p0 {
    /* JADX INFO: renamed from: a */
    public static void m163210a(VoiceVirtualRoomInfoSwitchItem voiceVirtualRoomInfoSwitchItem, View view) {
        voiceVirtualRoomInfoSwitchItem._root = (VoiceVirtualRoomInfoSwitchItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoSwitchItem._title = (VText) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoSwitchItem._fl_switcher = (VFrame) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoSwitchItem._switcher = (VirtualSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
