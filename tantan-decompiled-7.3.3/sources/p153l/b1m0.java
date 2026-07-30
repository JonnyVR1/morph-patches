package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualLevelRightItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class b1m0 {
    /* JADX INFO: renamed from: a */
    public static void m101484a(VirtualLevelRightItem virtualLevelRightItem, View view) {
        virtualLevelRightItem.f53576d = (VirtualLevelRightItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualLevelRightItem.f53577e = (VDraweeView) viewGroup.getChildAt(0);
        virtualLevelRightItem.f53578f = (TextView) viewGroup.getChildAt(1);
    }
}
