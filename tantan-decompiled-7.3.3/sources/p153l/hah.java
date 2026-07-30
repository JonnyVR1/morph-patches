package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class hah {
    /* JADX INFO: renamed from: a */
    public static void m134153a(FeedInteractionTabFrag feedInteractionTabFrag, View view) {
        feedInteractionTabFrag.f42859z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        feedInteractionTabFrag.f42843A = (FeedMaxHeightRecyclerView) view.findViewById(hdc0.f108976x1);
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractionTabFrag.f42844B = (VLinear) viewGroup.getChildAt(1);
        feedInteractionTabFrag.f42845C = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedInteractionTabFrag.f42846D = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134154b(FeedInteractionTabFrag feedInteractionTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173574S0, viewGroup, false);
        m134153a(feedInteractionTabFrag, viewInflate);
        return viewInflate;
    }
}
