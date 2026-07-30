package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveSquareLiveVideoFrag;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class b1u {
    /* JADX INFO: renamed from: a */
    public static void m99874a(LiveSquareLiveVideoFrag liveSquareLiveVideoFrag, View view) {
        liveSquareLiveVideoFrag.f45006z = (VPullDownRefreshLayout) view.findViewById(f5c0.f94999F1);
        liveSquareLiveVideoFrag.f45001A = (VRecyclerView) view.findViewById(f5c0.f95146t1);
        liveSquareLiveVideoFrag.f45002B = (VLinear) view.findViewById(f5c0.f95045S0);
        liveSquareLiveVideoFrag.f45003C = (VImage) view.findViewById(f5c0.f94986C0);
        liveSquareLiveVideoFrag.f45004D = (VText) view.findViewById(f5c0.f95071a2);
    }

    /* JADX INFO: renamed from: b */
    public static View m99875b(LiveSquareLiveVideoFrag liveSquareLiveVideoFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162701R0, viewGroup, false);
        m99874a(liveSquareLiveVideoFrag, viewInflate);
        return viewInflate;
    }
}
