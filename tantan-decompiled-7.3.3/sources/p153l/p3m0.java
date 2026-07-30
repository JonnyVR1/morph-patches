package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoTitleGradeItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p3m0 {
    /* JADX INFO: renamed from: a */
    public static void m170497a(VirtualRoomInfoTitleGradeItem virtualRoomInfoTitleGradeItem, View view) {
        virtualRoomInfoTitleGradeItem.f53585d = (VirtualRoomInfoTitleGradeItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualRoomInfoTitleGradeItem.f53586e = (FrameLayout) viewGroup.getChildAt(0);
        virtualRoomInfoTitleGradeItem.f53587f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        virtualRoomInfoTitleGradeItem.f53588g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        virtualRoomInfoTitleGradeItem.f53589h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        virtualRoomInfoTitleGradeItem.f53590i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        virtualRoomInfoTitleGradeItem.f53591j = (VDraweeView) viewGroup.getChildAt(1);
        virtualRoomInfoTitleGradeItem.f53592k = (VDraweeView) viewGroup.getChildAt(2);
    }
}
