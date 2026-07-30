package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jul0 {
    /* JADX INFO: renamed from: a */
    public static void m16268a(VirtualRoomInfoCoverItem virtualRoomInfoCoverItem, View view) {
        virtualRoomInfoCoverItem.a = (VirtualRoomInfoCoverItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoCoverItem.b = viewGroup.getChildAt(1);
        virtualRoomInfoCoverItem.c = (ImageView) viewGroup.getChildAt(2);
        virtualRoomInfoCoverItem.d = viewGroup.getChildAt(3);
    }
}
