package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class s8h {
    /* JADX INFO: renamed from: a */
    public static void m182588a(FeedInteractionTabFrag feedInteractionTabFrag, View view) {
        feedInteractionTabFrag.f42011z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        feedInteractionTabFrag.f41995A = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f73623x1);
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractionTabFrag.f41996B = (VLinear) viewGroup.getChildAt(1);
        feedInteractionTabFrag.f41997C = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedInteractionTabFrag.f41998D = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182589b(FeedInteractionTabFrag feedInteractionTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142105S0, viewGroup, false);
        m182588a(feedInteractionTabFrag, viewInflate);
        return viewInflate;
    }
}
