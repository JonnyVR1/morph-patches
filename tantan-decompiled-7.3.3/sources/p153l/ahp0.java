package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoCheckInItem;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ahp0 {
    /* JADX INFO: renamed from: a */
    public static void m97884a(VoiceVirtualRoomInfoCheckInItem voiceVirtualRoomInfoCheckInItem, View view) {
        voiceVirtualRoomInfoCheckInItem._root = (VoiceVirtualRoomInfoCheckInItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoCheckInItem._summary = (VText) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoCheckInItem._iv_invite_settle = (ImageView) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoCheckInItem._recyclerView = (VRecyclerView) viewGroup.getChildAt(2);
        voiceVirtualRoomInfoCheckInItem._go_arrow = (VImage) viewGroup.getChildAt(3);
    }
}
