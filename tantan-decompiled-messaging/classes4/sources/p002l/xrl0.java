package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualLevelRightItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xrl0 {
    /* JADX INFO: renamed from: a */
    public static void m26088a(VirtualLevelRightItem virtualLevelRightItem, View view) {
        virtualLevelRightItem.d = (VirtualLevelRightItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualLevelRightItem.e = viewGroup.getChildAt(0);
        virtualLevelRightItem.f = (TextView) viewGroup.getChildAt(1);
    }
}
