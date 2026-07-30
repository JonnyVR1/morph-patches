package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawRecycleItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fbe {
    /* JADX INFO: renamed from: a */
    public static void m13047a(DrawRecycleItem drawRecycleItem, View view) {
        drawRecycleItem.f5637a = (DrawRecycleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        drawRecycleItem.f5638b = viewGroup.getChildAt(0);
        drawRecycleItem.f5639c = viewGroup.getChildAt(1);
        drawRecycleItem.f5640d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        drawRecycleItem.f5641e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        drawRecycleItem.f5642f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        drawRecycleItem.f5643g = viewGroup.getChildAt(2);
        drawRecycleItem.f5644h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        drawRecycleItem.f5645i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        drawRecycleItem.f5646j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        drawRecycleItem.f5647k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
