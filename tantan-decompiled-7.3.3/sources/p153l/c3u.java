package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveSquareLiveVideoFrag;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c3u {
    /* JADX INFO: renamed from: a */
    public static void m107811a(LiveSquareLiveVideoFrag liveSquareLiveVideoFrag, View view) {
        liveSquareLiveVideoFrag.f45854z = (VPullDownRefreshLayout) view.findViewById(ldc0.f131456F1);
        liveSquareLiveVideoFrag.f45849A = (VRecyclerView) view.findViewById(ldc0.f131603t1);
        liveSquareLiveVideoFrag.f45850B = (VLinear) view.findViewById(ldc0.f131502S0);
        liveSquareLiveVideoFrag.f45851C = (VImage) view.findViewById(ldc0.f131443C0);
        liveSquareLiveVideoFrag.f45852D = (VText) view.findViewById(ldc0.f131528a2);
    }

    /* JADX INFO: renamed from: b */
    public static View m107812b(LiveSquareLiveVideoFrag liveSquareLiveVideoFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193815R0, viewGroup, false);
        m107811a(liveSquareLiveVideoFrag, viewInflate);
        return viewInflate;
    }
}
