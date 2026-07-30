package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleItem;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oul0 {
    /* JADX INFO: renamed from: a */
    public static void m166085a(VirtualRoomInfoTitleItem virtualRoomInfoTitleItem, View view) {
        virtualRoomInfoTitleItem.f52745a = (VirtualRoomInfoTitleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoTitleItem.f52746b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualRoomInfoTitleItem.f52747c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
