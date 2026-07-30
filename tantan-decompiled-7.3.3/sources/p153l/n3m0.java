package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class n3m0 {
    /* JADX INFO: renamed from: a */
    public static void m161325a(VirtualRoomInfoCoverItem virtualRoomInfoCoverItem, View view) {
        virtualRoomInfoCoverItem.f53581a = (VirtualRoomInfoCoverItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoCoverItem.f53582b = (VDraweeView) viewGroup.getChildAt(1);
        virtualRoomInfoCoverItem.f53583c = (ImageView) viewGroup.getChildAt(2);
        virtualRoomInfoCoverItem.f53584d = (VText) viewGroup.getChildAt(3);
    }
}
