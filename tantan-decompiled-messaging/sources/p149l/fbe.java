package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawRecycleItem;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fbe {
    /* JADX INFO: renamed from: a */
    public static void m120351a(DrawRecycleItem drawRecycleItem, View view) {
        drawRecycleItem.f49595a = (DrawRecycleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        drawRecycleItem.f49596b = (VDraweeView) viewGroup.getChildAt(0);
        drawRecycleItem.f49597c = (VLinear) viewGroup.getChildAt(1);
        drawRecycleItem.f49598d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        drawRecycleItem.f49599e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        drawRecycleItem.f49600f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        drawRecycleItem.f49601g = (VLinear) viewGroup.getChildAt(2);
        drawRecycleItem.f49602h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        drawRecycleItem.f49603i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        drawRecycleItem.f49604j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        drawRecycleItem.f49605k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
