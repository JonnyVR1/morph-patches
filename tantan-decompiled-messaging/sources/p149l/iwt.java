package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class iwt {
    /* JADX INFO: renamed from: a */
    public static void m138761a(LiveSignPrizeMainItem liveSignPrizeMainItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignPrizeMainItem.f49374a = (FrameLayout) viewGroup.getChildAt(0);
        liveSignPrizeMainItem.f49375b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSignPrizeMainItem.f49376c = (TextView) viewGroup.getChildAt(1);
        liveSignPrizeMainItem.f49377d = (TextView) viewGroup.getChildAt(2);
        liveSignPrizeMainItem.f49378e = (TextView) viewGroup.getChildAt(3);
    }
}
