package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareLiveVideoItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class c1u {
    /* JADX INFO: renamed from: a */
    public static void m104880a(LiveSquareLiveVideoItemView liveSquareLiveVideoItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareLiveVideoItemView.f46334d = (VDraweeView) viewGroup.getChildAt(0);
        liveSquareLiveVideoItemView.f46335e = (VFrame) viewGroup.getChildAt(2);
        liveSquareLiveVideoItemView.f46336f = (VText) viewGroup.getChildAt(5);
        liveSquareLiveVideoItemView.f46337g = (VText) viewGroup.getChildAt(6);
        liveSquareLiveVideoItemView.f46338h = (VText) viewGroup.getChildAt(7);
        liveSquareLiveVideoItemView.f46339i = (AnimEffectPlayer) viewGroup.getChildAt(8);
        liveSquareLiveVideoItemView.f46340j = viewGroup.getChildAt(9);
    }
}
