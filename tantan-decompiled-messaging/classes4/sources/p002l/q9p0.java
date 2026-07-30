package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTitleItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q9p0 {
    /* JADX INFO: renamed from: a */
    public static void m21146a(VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem, View view) {
        voiceVirtualRoomInfoTitleItem.d = (VoiceVirtualRoomInfoTitleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTitleItem.e = (LinearLayout) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTitleItem.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceVirtualRoomInfoTitleItem.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualRoomInfoTitleItem.h = viewGroup.getChildAt(1);
        voiceVirtualRoomInfoTitleItem.i = viewGroup.getChildAt(2);
    }
}
