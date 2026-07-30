package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VRelative;

/* JADX INFO: loaded from: classes13.dex */
public class x2o {
    /* JADX INFO: renamed from: a */
    public static void m206854a(IntlLiveSquareFollowFrag intlLiveSquareFollowFrag, View view) {
        intlLiveSquareFollowFrag.f45662z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        intlLiveSquareFollowFrag.f45651A = (VRecyclerView) view.findViewById(f5c0.f95110k1);
        intlLiveSquareFollowFrag.f45652B = (VRelative) view.findViewById(f5c0.f94984B2);
        intlLiveSquareFollowFrag.f45653C = (VImage) view.findViewById(f5c0.f95153v0);
        intlLiveSquareFollowFrag.f45654D = (VRelative) view.findViewById(f5c0.f94992D2);
        intlLiveSquareFollowFrag.f45655E = (VImage) view.findViewById(f5c0.f95157w0);
    }

    /* JADX INFO: renamed from: b */
    public static View m206855b(IntlLiveSquareFollowFrag intlLiveSquareFollowFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162721Y, viewGroup, false);
        m206854a(intlLiveSquareFollowFrag, viewInflate);
        return viewInflate;
    }
}
