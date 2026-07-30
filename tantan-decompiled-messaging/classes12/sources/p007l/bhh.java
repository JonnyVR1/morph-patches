package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.p005ui.moments.entry.FeedMomentsEntry;
import com.p000p1.mobile.putong.feed.p005ui.moments.entry.scalerv.PopScaleRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bhh {
    /* JADX INFO: renamed from: a */
    public static void m8891a(FeedMomentsEntry feedMomentsEntry, View view) {
        feedMomentsEntry.f5454a = (FeedMomentsEntry) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentsEntry.f5455b = (PopScaleRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentsEntry.f5456c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentsEntry.f5457d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMomentsEntry.f5458e = viewGroup.getChildAt(1);
        feedMomentsEntry.f5459f = viewGroup.getChildAt(2);
    }
}
