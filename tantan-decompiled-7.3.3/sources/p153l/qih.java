package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.p065ui.moments.entry.FeedMomentsEntry;
import com.p051p1.mobile.putong.feed.p065ui.moments.entry.scalerv.PopScaleRecyclerView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qih {
    /* JADX INFO: renamed from: a */
    public static void m176750a(FeedMomentsEntry feedMomentsEntry, View view) {
        feedMomentsEntry.f44841a = (FeedMomentsEntry) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentsEntry.f44842b = (PopScaleRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentsEntry.f44843c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentsEntry.f44844d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMomentsEntry.f44845e = (VText) viewGroup.getChildAt(1);
        feedMomentsEntry.f44846f = (VImage) viewGroup.getChildAt(2);
    }
}
