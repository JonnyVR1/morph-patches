package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardFirstView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardSecondOrThirdView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansHeaderItemView;

/* JADX INFO: loaded from: classes4.dex */
public class azl0 {
    /* JADX INFO: renamed from: a */
    public static void m101075a(VirtualFansHeaderItemView virtualFansHeaderItemView, View view) {
        virtualFansHeaderItemView._root = (VirtualFansHeaderItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualFansHeaderItemView._second_user = (VirtualFansBoardSecondOrThirdView) viewGroup.getChildAt(0);
        virtualFansHeaderItemView._third_user = (VirtualFansBoardSecondOrThirdView) viewGroup.getChildAt(1);
        virtualFansHeaderItemView._first_user = (VirtualFansBoardFirstView) viewGroup.getChildAt(2);
    }
}
