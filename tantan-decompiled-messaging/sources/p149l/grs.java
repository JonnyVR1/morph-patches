package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class grs {
    /* JADX INFO: renamed from: a */
    public static void m127765a(LiveGuardItem liveGuardItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardItem.f50433d = (VDraweeView) viewGroup.getChildAt(0);
        liveGuardItem.f50434e = (VImage) viewGroup.getChildAt(1);
        liveGuardItem.f50435f = (RelativeLayout) viewGroup.getChildAt(2);
        liveGuardItem.f50436g = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveGuardItem.f50437h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveGuardItem.f50438i = (VText) viewGroup.getChildAt(3);
        liveGuardItem.f50439j = (LinearLayout) viewGroup.getChildAt(4);
        liveGuardItem.f50440k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveGuardItem.f50441l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveGuardItem.f50442m = (VText) viewGroup.getChildAt(5);
        liveGuardItem.f50443n = (VText) viewGroup.getChildAt(6);
        liveGuardItem.f50444o = (Group) viewGroup.getChildAt(7);
        liveGuardItem.f50445p = (VText) viewGroup.getChildAt(8);
    }
}
