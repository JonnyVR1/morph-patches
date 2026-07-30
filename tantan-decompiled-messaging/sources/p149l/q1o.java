package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class q1o {
    /* JADX INFO: renamed from: a */
    public static void m172399a(IntlLiveSquareCommonFeedFrag intlLiveSquareCommonFeedFrag, View view) {
        intlLiveSquareCommonFeedFrag.f45598z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        intlLiveSquareCommonFeedFrag.f45583A = (AppBarLayout) view.findViewById(f5c0.f95104j);
        intlLiveSquareCommonFeedFrag.f45584B = (VText) view.findViewById(f5c0.f95158w1);
        intlLiveSquareCommonFeedFrag.f45585C = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        intlLiveSquareCommonFeedFrag.f45586D = (NestedScrollView) view.findViewById(f5c0.f94988C2);
        intlLiveSquareCommonFeedFrag.f45587E = (VImage) view.findViewById(f5c0.f95157w0);
        intlLiveSquareCommonFeedFrag.f45588F = (VText) view.findViewById(f5c0.f95040Q1);
        intlLiveSquareCommonFeedFrag.f45589G = (NestedScrollView) view.findViewById(f5c0.f94984B2);
        intlLiveSquareCommonFeedFrag.f45590H = (VImage) view.findViewById(f5c0.f95153v0);
        intlLiveSquareCommonFeedFrag.f45591I = (VText) view.findViewById(f5c0.f95099h2);
        intlLiveSquareCommonFeedFrag.f45592J = (VText) view.findViewById(f5c0.f95107j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m172400b(IntlLiveSquareCommonFeedFrag intlLiveSquareCommonFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162712V, viewGroup, false);
        m172399a(intlLiveSquareCommonFeedFrag, viewInflate);
        return viewInflate;
    }
}
