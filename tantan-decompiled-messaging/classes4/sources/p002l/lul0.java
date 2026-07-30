package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleGradeItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lul0 {
    /* JADX INFO: renamed from: a */
    public static void m17465a(VirtualRoomInfoTitleGradeItem virtualRoomInfoTitleGradeItem, View view) {
        virtualRoomInfoTitleGradeItem.d = (VirtualRoomInfoTitleGradeItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoTitleGradeItem.e = (FrameLayout) viewGroup.getChildAt(0);
        virtualRoomInfoTitleGradeItem.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        virtualRoomInfoTitleGradeItem.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        virtualRoomInfoTitleGradeItem.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        virtualRoomInfoTitleGradeItem.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        virtualRoomInfoTitleGradeItem.j = viewGroup.getChildAt(1);
        virtualRoomInfoTitleGradeItem.k = viewGroup.getChildAt(2);
    }
}
