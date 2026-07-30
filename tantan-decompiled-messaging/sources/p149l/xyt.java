package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class xyt {
    /* JADX INFO: renamed from: a */
    public static void m211876a(LiveSquareBaseListFrag liveSquareBaseListFrag, View view) {
        liveSquareBaseListFrag.f44998z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        liveSquareBaseListFrag.f44987A = (AppBarLayout) view.findViewById(f5c0.f95104j);
        liveSquareBaseListFrag.f44988B = (VText) view.findViewById(f5c0.f95158w1);
        liveSquareBaseListFrag.f44989C = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        liveSquareBaseListFrag.f44990D = (NestedScrollView) view.findViewById(f5c0.f94988C2);
        liveSquareBaseListFrag.f44991E = (VImage) view.findViewById(f5c0.f95157w0);
        liveSquareBaseListFrag.f44992F = (VText) view.findViewById(f5c0.f95040Q1);
        liveSquareBaseListFrag.f44993G = (NestedScrollView) view.findViewById(f5c0.f94984B2);
        liveSquareBaseListFrag.f44994H = (VImage) view.findViewById(f5c0.f95153v0);
        liveSquareBaseListFrag.f44995I = (VText) view.findViewById(f5c0.f95099h2);
        liveSquareBaseListFrag.f44996J = (VText) view.findViewById(f5c0.f95107j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m211877b(LiveSquareBaseListFrag liveSquareBaseListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162677J0, viewGroup, false);
        m211876a(liveSquareBaseListFrag, viewInflate);
        return viewInflate;
    }
}
