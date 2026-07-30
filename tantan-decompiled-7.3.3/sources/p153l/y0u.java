package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class y0u {
    /* JADX INFO: renamed from: a */
    public static void m213905a(LiveSquareBaseListFrag liveSquareBaseListFrag, View view) {
        liveSquareBaseListFrag.f45846z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        liveSquareBaseListFrag.f45835A = (AppBarLayout) view.findViewById(ldc0.f131561j);
        liveSquareBaseListFrag.f45836B = (VText) view.findViewById(ldc0.f131615w1);
        liveSquareBaseListFrag.f45837C = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        liveSquareBaseListFrag.f45838D = (NestedScrollView) view.findViewById(ldc0.f131445C2);
        liveSquareBaseListFrag.f45839E = (VImage) view.findViewById(ldc0.f131614w0);
        liveSquareBaseListFrag.f45840F = (VText) view.findViewById(ldc0.f131497Q1);
        liveSquareBaseListFrag.f45841G = (NestedScrollView) view.findViewById(ldc0.f131441B2);
        liveSquareBaseListFrag.f45842H = (VImage) view.findViewById(ldc0.f131610v0);
        liveSquareBaseListFrag.f45843I = (VText) view.findViewById(ldc0.f131556h2);
        liveSquareBaseListFrag.f45844J = (VText) view.findViewById(ldc0.f131564j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m213906b(LiveSquareBaseListFrag liveSquareBaseListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193791J0, viewGroup, false);
        m213905a(liveSquareBaseListFrag, viewInflate);
        return viewInflate;
    }
}
