package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VRelative;

/* JADX INFO: loaded from: classes9.dex */
public class x4o {
    /* JADX INFO: renamed from: a */
    public static void m209345a(IntlLiveSquareFollowFrag intlLiveSquareFollowFrag, View view) {
        intlLiveSquareFollowFrag.f46510z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        intlLiveSquareFollowFrag.f46499A = (VRecyclerView) view.findViewById(ldc0.f131567k1);
        intlLiveSquareFollowFrag.f46500B = (VRelative) view.findViewById(ldc0.f131441B2);
        intlLiveSquareFollowFrag.f46501C = (VImage) view.findViewById(ldc0.f131610v0);
        intlLiveSquareFollowFrag.f46502D = (VRelative) view.findViewById(ldc0.f131449D2);
        intlLiveSquareFollowFrag.f46503E = (VImage) view.findViewById(ldc0.f131614w0);
    }

    /* JADX INFO: renamed from: b */
    public static View m209346b(IntlLiveSquareFollowFrag intlLiveSquareFollowFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193835Y, viewGroup, false);
        m209345a(intlLiveSquareFollowFrag, viewInflate);
        return viewInflate;
    }
}
