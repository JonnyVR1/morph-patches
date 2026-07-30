package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hts {
    /* JADX INFO: renamed from: a */
    public static void m137100a(LiveGuardItem liveGuardItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardItem.f51281d = (VDraweeView) viewGroup.getChildAt(0);
        liveGuardItem.f51282e = (VImage) viewGroup.getChildAt(1);
        liveGuardItem.f51283f = (RelativeLayout) viewGroup.getChildAt(2);
        liveGuardItem.f51284g = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveGuardItem.f51285h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveGuardItem.f51286i = (VText) viewGroup.getChildAt(3);
        liveGuardItem.f51287j = (LinearLayout) viewGroup.getChildAt(4);
        liveGuardItem.f51288k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveGuardItem.f51289l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveGuardItem.f51290m = (VText) viewGroup.getChildAt(5);
        liveGuardItem.f51291n = (VText) viewGroup.getChildAt(6);
        liveGuardItem.f51292o = (Group) viewGroup.getChildAt(7);
        liveGuardItem.f51293p = (VText) viewGroup.getChildAt(8);
    }
}
