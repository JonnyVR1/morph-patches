package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class jyt {
    /* JADX INFO: renamed from: a */
    public static void m147621a(LiveSignPrizeMainItem liveSignPrizeMainItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignPrizeMainItem.f50222a = (FrameLayout) viewGroup.getChildAt(0);
        liveSignPrizeMainItem.f50223b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSignPrizeMainItem.f50224c = (TextView) viewGroup.getChildAt(1);
        liveSignPrizeMainItem.f50225d = (TextView) viewGroup.getChildAt(2);
        liveSignPrizeMainItem.f50226e = (TextView) viewGroup.getChildAt(3);
    }
}
