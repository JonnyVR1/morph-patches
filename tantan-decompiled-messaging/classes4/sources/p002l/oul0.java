package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oul0 {
    /* JADX INFO: renamed from: a */
    public static void m19759a(VirtualRoomInfoTitleItem virtualRoomInfoTitleItem, View view) {
        virtualRoomInfoTitleItem.a = (VirtualRoomInfoTitleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoTitleItem.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualRoomInfoTitleItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
