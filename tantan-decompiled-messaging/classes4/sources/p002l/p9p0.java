package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VoiceVirtualRoomInfoTagsItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p9p0 {
    /* JADX INFO: renamed from: a */
    public static void m20155a(VoiceVirtualRoomInfoTagsItem voiceVirtualRoomInfoTagsItem, View view) {
        voiceVirtualRoomInfoTagsItem.a = (VoiceVirtualRoomInfoTagsItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTagsItem.b = (TextView) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTagsItem.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
