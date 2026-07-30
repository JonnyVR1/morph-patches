package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ho00 {
    /* JADX INFO: renamed from: a */
    public static void m10682a(MomentsFeedHeadView momentsFeedHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsFeedHeadView.f5345a = viewGroup.getChildAt(0);
        momentsFeedHeadView.f5346b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsFeedHeadView.f5347c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsFeedHeadView.f5348d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsFeedHeadView.f5349e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsFeedHeadView.f5350f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        momentsFeedHeadView.f5351g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        momentsFeedHeadView.f5352h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
