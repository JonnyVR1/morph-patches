package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoCheckInItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w7p0 {
    /* JADX INFO: renamed from: a */
    public static void m24428a(VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItem, View view) {
        voiceVirtualRoomInfoCheckInItem.d = (VoiceVirtualRoomInfoCheckInItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoCheckInItem.e = viewGroup.getChildAt(0);
        voiceVirtualRoomInfoCheckInItem.f = (ImageView) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoCheckInItem.g = viewGroup.getChildAt(2);
        voiceVirtualRoomInfoCheckInItem.h = viewGroup.getChildAt(3);
    }
}
