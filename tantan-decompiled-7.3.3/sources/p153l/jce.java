package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawRecycleItem;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jce {
    /* JADX INFO: renamed from: a */
    public static void m144355a(DrawRecycleItem drawRecycleItem, View view) {
        drawRecycleItem.f50443a = (DrawRecycleItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        drawRecycleItem.f50444b = (VDraweeView) viewGroup.getChildAt(0);
        drawRecycleItem.f50445c = (VLinear) viewGroup.getChildAt(1);
        drawRecycleItem.f50446d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        drawRecycleItem.f50447e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        drawRecycleItem.f50448f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        drawRecycleItem.f50449g = (VLinear) viewGroup.getChildAt(2);
        drawRecycleItem.f50450h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        drawRecycleItem.f50451i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        drawRecycleItem.f50452j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        drawRecycleItem.f50453k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
