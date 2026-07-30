package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleGradeItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lul0 {
    /* JADX INFO: renamed from: a */
    public static void m151774a(VirtualRoomInfoTitleGradeItem virtualRoomInfoTitleGradeItem, View view) {
        virtualRoomInfoTitleGradeItem.f52737d = (VirtualRoomInfoTitleGradeItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoTitleGradeItem.f52738e = (FrameLayout) viewGroup.getChildAt(0);
        virtualRoomInfoTitleGradeItem.f52739f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        virtualRoomInfoTitleGradeItem.f52740g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        virtualRoomInfoTitleGradeItem.f52741h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        virtualRoomInfoTitleGradeItem.f52742i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        virtualRoomInfoTitleGradeItem.f52743j = (VDraweeView) viewGroup.getChildAt(1);
        virtualRoomInfoTitleGradeItem.f52744k = (VDraweeView) viewGroup.getChildAt(2);
    }
}
