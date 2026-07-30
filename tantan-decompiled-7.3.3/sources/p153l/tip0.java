package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTagsItem;

/* JADX INFO: loaded from: classes4.dex */
public class tip0 {
    /* JADX INFO: renamed from: a */
    public static void m191348a(VoiceVirtualRoomInfoTagsItem voiceVirtualRoomInfoTagsItem, View view) {
        voiceVirtualRoomInfoTagsItem._root = (VoiceVirtualRoomInfoTagsItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTagsItem._tag_title = (TextView) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTagsItem._tag_container = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
