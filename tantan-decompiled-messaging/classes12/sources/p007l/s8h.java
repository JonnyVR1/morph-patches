package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s8h {
    /* JADX INFO: renamed from: a */
    public static void m14047a(FeedInteractionTabFrag feedInteractionTabFrag, View view) {
        feedInteractionTabFrag.f3472z = ((ViewGroup) view).getChildAt(0);
        feedInteractionTabFrag.f3456A = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f6104x1);
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractionTabFrag.f3457B = viewGroup.getChildAt(1);
        feedInteractionTabFrag.f3458C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedInteractionTabFrag.f3459D = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14048b(FeedInteractionTabFrag feedInteractionTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11124S0, viewGroup, false);
        m14047a(feedInteractionTabFrag, viewInflate);
        return viewInflate;
    }
}
