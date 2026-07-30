package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareVoiceItem;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c0i {
    /* JADX INFO: renamed from: a */
    public static void m9062a(FeedSquareVoiceItem feedSquareVoiceItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSquareVoiceItem.f4263d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedSquareVoiceItem.f4264e = viewGroup.getChildAt(1);
        feedSquareVoiceItem.f4265f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedSquareVoiceItem.f4266g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedSquareVoiceItem.f4267h = (FeedUserHeaderView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedSquareVoiceItem.f4268i = (Space) viewGroup.getChildAt(2);
    }
}
