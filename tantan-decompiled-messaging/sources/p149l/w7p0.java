package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoCheckInItem;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w7p0 {
    /* JADX INFO: renamed from: a */
    public static void m202058a(VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItem, View view) {
        voiceVirtualRoomInfoCheckInItem._root = (VoiceVirtualRoomInfoCheckInItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoCheckInItem._summary = (VText) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoCheckInItem._iv_invite_settle = (ImageView) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoCheckInItem._recyclerView = (VRecyclerView) viewGroup.getChildAt(2);
        voiceVirtualRoomInfoCheckInItem._go_arrow = (VImage) viewGroup.getChildAt(3);
    }
}
