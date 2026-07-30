package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStateSquareEntranceView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class u3i {
    /* JADX INFO: renamed from: a */
    public static void m194371a(FeedStateSquareEntranceView feedStateSquareEntranceView, View view) {
        feedStateSquareEntranceView.f43763d = (FeedStateSquareEntranceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareEntranceView.f43764e = (VImage) viewGroup.getChildAt(0);
        feedStateSquareEntranceView.f43765f = (FeedAutoScrollView) viewGroup.getChildAt(1);
    }
}
