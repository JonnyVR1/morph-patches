package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jul0 {
    /* JADX INFO: renamed from: a */
    public static void m143335a(VirtualRoomInfoCoverItem virtualRoomInfoCoverItem, View view) {
        virtualRoomInfoCoverItem.f52733a = (VirtualRoomInfoCoverItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoCoverItem.f52734b = (VDraweeView) viewGroup.getChildAt(1);
        virtualRoomInfoCoverItem.f52735c = (ImageView) viewGroup.getChildAt(2);
        virtualRoomInfoCoverItem.f52736d = (VText) viewGroup.getChildAt(3);
    }
}
