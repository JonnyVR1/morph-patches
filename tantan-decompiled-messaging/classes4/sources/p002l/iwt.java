package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iwt {
    /* JADX INFO: renamed from: a */
    public static void m15472a(LiveSignPrizeMainItem liveSignPrizeMainItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignPrizeMainItem.f5416a = (FrameLayout) viewGroup.getChildAt(0);
        liveSignPrizeMainItem.f5417b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSignPrizeMainItem.f5418c = (TextView) viewGroup.getChildAt(1);
        liveSignPrizeMainItem.f5419d = (TextView) viewGroup.getChildAt(2);
        liveSignPrizeMainItem.f5420e = (TextView) viewGroup.getChildAt(3);
    }
}
