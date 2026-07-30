package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.p060ui.moments.entry.FeedMomentsEntry;
import com.p046p1.mobile.putong.feed.p060ui.moments.entry.scalerv.PopScaleRecyclerView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bhh {
    /* JADX INFO: renamed from: a */
    public static void m101836a(FeedMomentsEntry feedMomentsEntry, View view) {
        feedMomentsEntry.f43993a = (FeedMomentsEntry) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentsEntry.f43994b = (PopScaleRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentsEntry.f43995c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentsEntry.f43996d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMomentsEntry.f43997e = (VText) viewGroup.getChildAt(1);
        feedMomentsEntry.f43998f = (VImage) viewGroup.getChildAt(2);
    }
}
