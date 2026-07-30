package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class izt {
    /* JADX INFO: renamed from: a */
    public static void m139073a(LiveSquareCommonFeedFrag liveSquareCommonFeedFrag, View view) {
        liveSquareCommonFeedFrag.f44956z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        liveSquareCommonFeedFrag.f44941A = (AppBarLayout) view.findViewById(f5c0.f95104j);
        liveSquareCommonFeedFrag.f44942B = (VText) view.findViewById(f5c0.f95158w1);
        liveSquareCommonFeedFrag.f44943C = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        liveSquareCommonFeedFrag.f44944D = (NestedScrollView) view.findViewById(f5c0.f94988C2);
        liveSquareCommonFeedFrag.f44945E = (VImage) view.findViewById(f5c0.f95157w0);
        liveSquareCommonFeedFrag.f44946F = (VText) view.findViewById(f5c0.f95040Q1);
        liveSquareCommonFeedFrag.f44947G = (NestedScrollView) view.findViewById(f5c0.f94984B2);
        liveSquareCommonFeedFrag.f44948H = (VImage) view.findViewById(f5c0.f95153v0);
        liveSquareCommonFeedFrag.f44949I = (VText) view.findViewById(f5c0.f95099h2);
        liveSquareCommonFeedFrag.f44950J = (VText) view.findViewById(f5c0.f95107j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139074b(LiveSquareCommonFeedFrag liveSquareCommonFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162680K0, viewGroup, false);
        m139073a(liveSquareCommonFeedFrag, viewInflate);
        return viewInflate;
    }
}
