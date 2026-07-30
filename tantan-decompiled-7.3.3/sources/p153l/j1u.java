package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class j1u {
    /* JADX INFO: renamed from: a */
    public static void m143152a(LiveSquareCommonFeedFrag liveSquareCommonFeedFrag, View view) {
        liveSquareCommonFeedFrag.f45804z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        liveSquareCommonFeedFrag.f45789A = (AppBarLayout) view.findViewById(ldc0.f131561j);
        liveSquareCommonFeedFrag.f45790B = (VText) view.findViewById(ldc0.f131615w1);
        liveSquareCommonFeedFrag.f45791C = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        liveSquareCommonFeedFrag.f45792D = (NestedScrollView) view.findViewById(ldc0.f131445C2);
        liveSquareCommonFeedFrag.f45793E = (VImage) view.findViewById(ldc0.f131614w0);
        liveSquareCommonFeedFrag.f45794F = (VText) view.findViewById(ldc0.f131497Q1);
        liveSquareCommonFeedFrag.f45795G = (NestedScrollView) view.findViewById(ldc0.f131441B2);
        liveSquareCommonFeedFrag.f45796H = (VImage) view.findViewById(ldc0.f131610v0);
        liveSquareCommonFeedFrag.f45797I = (VText) view.findViewById(ldc0.f131556h2);
        liveSquareCommonFeedFrag.f45798J = (VText) view.findViewById(ldc0.f131564j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m143153b(LiveSquareCommonFeedFrag liveSquareCommonFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193794K0, viewGroup, false);
        m143152a(liveSquareCommonFeedFrag, viewInflate);
        return viewInflate;
    }
}
