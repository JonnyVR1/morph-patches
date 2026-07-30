package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareLiveVideoItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class d3u {
    /* JADX INFO: renamed from: a */
    public static void m113903a(LiveSquareLiveVideoItemView liveSquareLiveVideoItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareLiveVideoItemView.f47182d = (VDraweeView) viewGroup.getChildAt(0);
        liveSquareLiveVideoItemView.f47183e = (VFrame) viewGroup.getChildAt(2);
        liveSquareLiveVideoItemView.f47184f = (VText) viewGroup.getChildAt(5);
        liveSquareLiveVideoItemView.f47185g = (VText) viewGroup.getChildAt(6);
        liveSquareLiveVideoItemView.f47186h = (VText) viewGroup.getChildAt(7);
        liveSquareLiveVideoItemView.f47187i = (AnimEffectPlayer) viewGroup.getChildAt(8);
        liveSquareLiveVideoItemView.f47188j = viewGroup.getChildAt(9);
    }
}
