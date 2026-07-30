package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeListView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fwt {
    /* JADX INFO: renamed from: a */
    public static void m13506a(LiveSignPrizeListView liveSignPrizeListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignPrizeListView.f5411a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSignPrizeListView.f5412b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSignPrizeListView.f5413c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
