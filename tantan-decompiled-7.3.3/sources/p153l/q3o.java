package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class q3o {
    /* JADX INFO: renamed from: a */
    public static void m175146a(IntlLiveSquareCommonFeedFrag intlLiveSquareCommonFeedFrag, View view) {
        intlLiveSquareCommonFeedFrag.f46446z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        intlLiveSquareCommonFeedFrag.f46431A = (AppBarLayout) view.findViewById(ldc0.f131561j);
        intlLiveSquareCommonFeedFrag.f46432B = (VText) view.findViewById(ldc0.f131615w1);
        intlLiveSquareCommonFeedFrag.f46433C = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        intlLiveSquareCommonFeedFrag.f46434D = (NestedScrollView) view.findViewById(ldc0.f131445C2);
        intlLiveSquareCommonFeedFrag.f46435E = (VImage) view.findViewById(ldc0.f131614w0);
        intlLiveSquareCommonFeedFrag.f46436F = (VText) view.findViewById(ldc0.f131497Q1);
        intlLiveSquareCommonFeedFrag.f46437G = (NestedScrollView) view.findViewById(ldc0.f131441B2);
        intlLiveSquareCommonFeedFrag.f46438H = (VImage) view.findViewById(ldc0.f131610v0);
        intlLiveSquareCommonFeedFrag.f46439I = (VText) view.findViewById(ldc0.f131556h2);
        intlLiveSquareCommonFeedFrag.f46440J = (VText) view.findViewById(ldc0.f131564j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m175147b(IntlLiveSquareCommonFeedFrag intlLiveSquareCommonFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193826V, viewGroup, false);
        m175146a(intlLiveSquareCommonFeedFrag, viewInflate);
        return viewInflate;
    }
}
