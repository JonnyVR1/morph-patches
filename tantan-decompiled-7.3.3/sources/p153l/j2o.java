package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class j2o {
    /* JADX INFO: renamed from: a */
    public static void m143238a(IntlLiveSquareBaseListFrag intlLiveSquareBaseListFrag, View view) {
        intlLiveSquareBaseListFrag.f46430z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        intlLiveSquareBaseListFrag.f46419A = (AppBarLayout) view.findViewById(ldc0.f131561j);
        intlLiveSquareBaseListFrag.f46420B = (VText) view.findViewById(ldc0.f131615w1);
        intlLiveSquareBaseListFrag.f46421C = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        intlLiveSquareBaseListFrag.f46422D = (NestedScrollView) view.findViewById(ldc0.f131445C2);
        intlLiveSquareBaseListFrag.f46423E = (VImage) view.findViewById(ldc0.f131614w0);
        intlLiveSquareBaseListFrag.f46424F = (VText) view.findViewById(ldc0.f131497Q1);
        intlLiveSquareBaseListFrag.f46425G = (NestedScrollView) view.findViewById(ldc0.f131441B2);
        intlLiveSquareBaseListFrag.f46426H = (VImage) view.findViewById(ldc0.f131610v0);
        intlLiveSquareBaseListFrag.f46427I = (VText) view.findViewById(ldc0.f131556h2);
        intlLiveSquareBaseListFrag.f46428J = (VText) view.findViewById(ldc0.f131564j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m143239b(IntlLiveSquareBaseListFrag intlLiveSquareBaseListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193823U, viewGroup, false);
        m143238a(intlLiveSquareBaseListFrag, viewInflate);
        return viewInflate;
    }
}
