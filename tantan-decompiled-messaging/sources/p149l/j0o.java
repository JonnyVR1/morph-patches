package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class j0o {
    /* JADX INFO: renamed from: a */
    public static void m139197a(IntlLiveSquareBaseListFrag intlLiveSquareBaseListFrag, View view) {
        intlLiveSquareBaseListFrag.f45582z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        intlLiveSquareBaseListFrag.f45571A = (AppBarLayout) view.findViewById(f5c0.f95104j);
        intlLiveSquareBaseListFrag.f45572B = (VText) view.findViewById(f5c0.f95158w1);
        intlLiveSquareBaseListFrag.f45573C = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        intlLiveSquareBaseListFrag.f45574D = (NestedScrollView) view.findViewById(f5c0.f94988C2);
        intlLiveSquareBaseListFrag.f45575E = (VImage) view.findViewById(f5c0.f95157w0);
        intlLiveSquareBaseListFrag.f45576F = (VText) view.findViewById(f5c0.f95040Q1);
        intlLiveSquareBaseListFrag.f45577G = (NestedScrollView) view.findViewById(f5c0.f94984B2);
        intlLiveSquareBaseListFrag.f45578H = (VImage) view.findViewById(f5c0.f95153v0);
        intlLiveSquareBaseListFrag.f45579I = (VText) view.findViewById(f5c0.f95099h2);
        intlLiveSquareBaseListFrag.f45580J = (VText) view.findViewById(f5c0.f95107j2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139198b(IntlLiveSquareBaseListFrag intlLiveSquareBaseListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162709U, viewGroup, false);
        m139197a(intlLiveSquareBaseListFrag, viewInflate);
        return viewInflate;
    }
}
