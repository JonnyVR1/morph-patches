package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleItem;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s3m0 {
    /* JADX INFO: renamed from: a */
    public static void m184282a(VirtualRoomInfoTitleItem virtualRoomInfoTitleItem, View view) {
        virtualRoomInfoTitleItem.f53593a = (VirtualRoomInfoTitleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoTitleItem.f53594b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualRoomInfoTitleItem.f53595c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
