package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTitleItem;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q9p0 {
    /* JADX INFO: renamed from: a */
    public static void m173661a(VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem, View view) {
        voiceVirtualRoomInfoTitleItem._root = (VoiceVirtualRoomInfoTitleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTitleItem._title_layout = (LinearLayout) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTitleItem._name = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceVirtualRoomInfoTitleItem._name_desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualRoomInfoTitleItem._content = (VText) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoTitleItem._go_arrow = (VImage) viewGroup.getChildAt(2);
    }
}
